package com.ourdevelops.ourjek.activity.riderequest

import android.content.Context
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRequestInterface
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.BaseApp.loginUser
import com.ourdevelops.ourjek.json.GetNearRideCarRequestJson
import com.ourdevelops.ourjek.json.GetNearRideCarResponseJson
import com.ourdevelops.ourjek.json.SavedAddressResponse
import com.ourdevelops.ourjek.models.FiturModel
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.BookService
import com.ourdevelops.ourjek.utils.api.service.UserService
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList


class NewRiderRequestPresenter(val context: Context, val view: NewRiderRequestContractor.View, val address: SavedAddressRequestInterface) :
    NewRiderRequestContractor.Presenter {

    override fun getNearestRiders(filterId: Int?, myLocationWrapper: LocationWrapper?) {
        val loggedInUser = BaseApp.getInstance(context).loginUser
        val service = ServiceGenerator.createService(
            BookService::class.java,
            loggedInUser.email,
            loggedInUser.password,
            loginUser.token
        )
        AppLogger.log("lat -> ${myLocationWrapper?.latitude} ---- lng -> ${myLocationWrapper?.longitude}")
        val param = GetNearRideCarRequestJson()
        param.latitude = myLocationWrapper?.latitude!!
        param.longitude = myLocationWrapper.longitude!!
        param.language = "en"
        param.fitur = filterId.toString()

        service.getNearRide(param).enqueue(object : Callback<GetNearRideCarResponseJson> {
            override fun onResponse(
                call: Call<GetNearRideCarResponseJson>,
                response: Response<GetNearRideCarResponseJson>
            ) {
                if (response.isSuccessful) {

                    val availableDriversArray = Objects.requireNonNull(response.body())?.data!!
                    val markersArray = ArrayList<MarkerOptions>()
                    for (i in availableDriversArray!!) {
                        val latLng = LatLng(i.latitude, i.longitude)
                        val marker = MarkerOptions().position(latLng).icon(
                            BitmapDescriptorFactory.fromResource(
                                R.drawable.drivermap
                            )
                        ).anchor(0.5f, 0.5f)
                            .rotation(i.bearing.toFloat())
                            .flat(true)

                        markersArray.add(marker)
                    }
                    view.onNearestRidersResponse(markersArray, availableDriversArray)
                }
            }

            override fun onFailure(call: Call<GetNearRideCarResponseJson>, t: Throwable) {

            }

        })


    }

    override fun getAllSavedAddress() {
        val service = ServiceGenerator.createService(UserService::class.java, BaseApp.loginUser.email, BaseApp.loginUser.password,loginUser.token)
        service.allSavedAddress.enqueue(object : Callback<SavedAddressResponse> {
            override fun onResponse(
                call: Call<SavedAddressResponse>,
                response: Response<SavedAddressResponse>
            ) {
                if (response.isSuccessful) {
                    val savedAddress = response.body()?.data
                    if (savedAddress?.size != 0) {
                        AppLogger.log("size greater than 0")
                        address.onSavedAddressResponse(response.body()?.data!!)
                    }
                    else {
                        AppLogger.log("size is 0")
                    }
                }
                else {

                }
            }

            override fun onFailure(call: Call<SavedAddressResponse>, t: Throwable) {

            }

        })
    }
}