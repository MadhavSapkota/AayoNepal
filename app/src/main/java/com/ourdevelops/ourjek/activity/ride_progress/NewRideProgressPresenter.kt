package com.ourdevelops.ourjek.activity.ride_progress

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.constants.*
import com.ourdevelops.ourjek.constants.BaseApp.loginUser
import com.ourdevelops.ourjek.json.DetailRequestJson
import com.ourdevelops.ourjek.json.DetailTransResponseJson
import com.ourdevelops.ourjek.json.fcm.CancelBookRequestJson
import com.ourdevelops.ourjek.json.fcm.CancelBookResponseJson
import com.ourdevelops.ourjek.json.fcm.FCMMessage
import com.ourdevelops.ourjek.json.ride_request.DriverRequestBody
import com.ourdevelops.ourjek.json.ride_request.TripDetailsModel
import com.ourdevelops.ourjek.json.ride_request.UserModel
import com.ourdevelops.ourjek.models.TransaksiModel
import com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel
import com.ourdevelops.ourjek.models.ride_request.TransactionDetailEnglish
import com.ourdevelops.ourjek.utils.api.FCMHelper
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.BookService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException
import java.util.*


class NewRideProgressPresenter(val context: Context, val view: NewRideProgressContractor.View) :
        NewRideProgressContractor.Presenter {

    val loggedInUser = BaseApp.getInstance(context).loginUser
    val transactionDetail = TransactionDetailEnglish()
    val englishDriverModel = EnglishDriverModel()
    var transaksiModel : TransaksiModel ?= null


    override fun getRideDetails(idTrans: String?, idDriver: String?) {
        val param = DetailRequestJson()
        param.id = idTrans
        param.idDriver = idDriver
        param.language = "en"
        val service = ServiceGenerator.createService(
                BookService::class.java,
                loggedInUser.email,
                loggedInUser.password,
            loginUser.token
        )
        service.detailtrans(param).enqueue(object : Callback<DetailTransResponseJson> {
            override fun onResponse(
                    call: Call<DetailTransResponseJson>,
                    response: Response<DetailTransResponseJson>
            ) {
                if (response.isSuccessful) {
                    if (response.body()?.data?.isNullOrEmpty() == false) {
                        response.body()?.data?.get(0)?.let {
                            transactionDetail.initFromTransaksi(it)
                            transaksiModel = it
                        }
                        view.onTripDetails(transactionDetail)
                        if (!response.body()?.driver.isNullOrEmpty()) {
                            val driver = response.body()?.driver!![0]
                            englishDriverModel.initFromDriverModel(driver)
                            view.onDriverDetail(englishDriverModel)

                            when (transactionDetail.status) {

                                TransactionStatus.start -> {
                                    view.onChangeStatus(context.resources.getString(R.string.notification_start), View.VISIBLE)
                                }

                                TransactionStatus.cancel -> {
                                    view.onChangeStatus(context.resources.getString(R.string.notification_cancel), View.GONE)
                                }

                                TransactionStatus.accept -> {
                                    view.onChangeStatus(context.resources.getString(R.string.notification_accept), View.VISIBLE)
                                }

                                TransactionStatus.finish -> {
                                    view.onChangeStatus(context.resources.getString(R.string.notification_finish), View.GONE)
                                }

                            }

                        }
                    }

                } else {

                }

            }

            override fun onFailure(call: Call<DetailTransResponseJson>, t: Throwable) {

            }
        })

    }

    override fun parseData() {
        TODO("Not yet implemented")
    }

    override fun onCancelRide(cancel_reason: String) {
        val requestcancel = CancelBookRequestJson()
        requestcancel.id = loggedInUser.id
        requestcancel.id_transaksi = transactionDetail.id
        requestcancel.id_driver = loggedInUser.id
        requestcancel.reason = cancel_reason
        val service = ServiceGenerator.createService(BookService::class.java, loggedInUser.email, loggedInUser.password,loginUser.token)
        service.cancelOrder(requestcancel).enqueue(object : Callback<CancelBookResponseJson> {
            override fun onResponse(call: Call<CancelBookResponseJson>, response: Response<CancelBookResponseJson>) {
                if (response.isSuccessful) {
                    if (response.body()?.mesage == "canceled") {
                        AppRideStatus.currentStatus = RideStatus.rideCancelledByUser
                        sendNotification(RideResponseType.onCustomerRideCanceled.name)
                        view.onRideCanceled()
                    } else {
                        view.onRideCancelError("Could not cancel your ride")
                    }
                }
            }

            override fun onFailure(call: Call<CancelBookResponseJson>, t: Throwable) {
                view.onRideCancelError("Could not cancel your ride")
            }
        })
    }

    private fun sendNotification(rideRequestType: String) {
        sendBroadcast()
        val currentTime = System.currentTimeMillis()
        val expiretime = currentTime + (15 * 1000)
        val userModel = UserModel()
        userModel.initFromDb(loggedInUser)
        val td = TripDetailsModel()
        transaksiModel?.let { td.initFromDb(it) }
        val notificationData = DriverRequestBody().apply {
            initiateTime = currentTime
            expireTime = expiretime
            rideResponseType = rideRequestType
            customerDetails = userModel
            tripDetails = td
        }
        val driverFcmArray = ArrayList<String>().also {
            it.add(englishDriverModel.token.toString())
        }

        val message = FCMMessage().apply {
            data = notificationData
            to = driverFcmArray
        }

        FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(object : okhttp3.Callback {
            override fun onFailure(call: okhttp3.Call, e: IOException) {

            }

            override fun onResponse(call: okhttp3.Call, response: okhttp3.Response) {

            }

        })

    }

    private fun sendBroadcast() {
        val intent = Intent(BroadCastIntents.ActionReceiverRideUpdates)
        intent.putExtra(IntentKeys.riderResponseType, RideResponseType.closeService)
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent)
    }

}