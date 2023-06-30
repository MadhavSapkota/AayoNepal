package com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.constants.*
import com.ourdevelops.ourjek.json.RideCarResponseJson
import com.ourdevelops.ourjek.json.ride_request.NewRideCarRequestJson
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.models.NewAllFeatureModel
import com.ourdevelops.ourjek.models.ride_request.RideConfirmationWrapper
import com.ourdevelops.ourjek.service.ride_request.RideRequestDetails
import com.ourdevelops.ourjek.service.ride_request.RideRequestService
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.BookService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RideRequestConfirmationPresenter(
        val context: Context,
        val view: RideRequestConfirmationContractor.View,
        val allFeatureData: NewAllFeatureModel?,
) : RideRequestConfirmationContractor.Presenter {
    private val userLogin = BaseApp.getInstance(context).loginUser
    private var rideConfirmationWrapper = RideConfirmationWrapper()

    override fun requestRideData(jsonGoogleApi: String?) {
        val cost = getDeliveryCost(jsonGoogleApi)
        rideConfirmationWrapper.cost = cost.toString()
        rideConfirmationWrapper.total = rideConfirmationWrapper.cost

        rideConfirmationWrapper.estimatedTime = MapDirectionAPI.getTimeDistance(context, jsonGoogleApi)
        view.onRideDdataResponse(rideConfirmationWrapper)
    }

    private fun getDeliveryCost(jsonGoogleApi: String?): Int{
        val distanceInKm = (MapDirectionAPI.getDistance(context, jsonGoogleApi).toDouble())/1000
        rideConfirmationWrapper.distance = distanceInKm

        return if(distanceInKm <= allFeatureData?.min_base_pay_distance!!){
            allFeatureData.biaya_minimum.toInt()
        }else {
            return (allFeatureData.biaya_minimum.toInt() + (allFeatureData.biaya.toInt() * distanceInKm.toInt()))
        }
    }

    override fun confirmRideRequest(pickupWrapper: LocationWrapper, dropWrapper: LocationWrapper) {

        val param = NewRideCarRequestJson()
        param.id_pelanggan = userLogin.id
        param.order_fitur = allFeatureData?.idFitur.toString()
        param.start_latitude = pickupWrapper.latitude!!
        param.start_longitude = pickupWrapper.longitude!!
        param.end_latitude = dropWrapper.latitude!!
        param.end_longitude = dropWrapper.longitude!!
        param.jarak = rideConfirmationWrapper.distance!!
        param.harga = rideConfirmationWrapper.total?.toDouble()
        param.estimasi = rideConfirmationWrapper.estimatedTime
        param.kredit_promo = "0"
        param.alamat_asal = pickupWrapper.locationName
        param.alamat_tujuan = dropWrapper.locationName
        param.pakai_wallet = 1
        AppLogger.log("api hit")

        ServiceGenerator.createService(BookService::class.java, userLogin.email, userLogin.password,userLogin.token)
            .requestRide(param).enqueue(object : Callback<RideCarResponseJson> {
            override fun onResponse(
                call: Call<RideCarResponseJson>,
                response: Response<RideCarResponseJson>
            ) {
                if (response.isSuccessful) {
                    AppLogger.log("success")
                    if (response.body()?.driver.isNullOrEmpty()) {
                        AppLogger.log("success is empty")
                        view.confirmRideRequestError("No riders available, please try again later.")
                    } else {
                        AppLogger.log("success else")
                        AppRideStatus.startSearchingRider(allFeatureData?.idFitur)
                        RideRequestDetails.apply {
                            riderDetails = response.body()?.data?.get(0)
                            ridersList = response.body()?.driver
                        }
                        val intent = Intent(context, RideRequestService::class.java)
                        intent.putExtra(IntentKeys.rideDetails, response.body()?.data?.get(0))
                        intent.putExtra(IntentKeys.riderList, response.body()?.driver)
                        ContextCompat.startForegroundService(context, intent)
                        LocalBroadcastManager.getInstance(context).sendBroadcast(Intent(BroadCastIntents.ActionReceiverRideUpdates).putExtra(IntentKeys.riderResponseType, RideResponseType.startSearchRide.name))
                        view.onRiderSarching()
                    }
                }
            }

            override fun onFailure(call: Call<RideCarResponseJson>, t: Throwable) {
                view.confirmRideRequestError("Error, please try again.")
            }

        })
    }
}