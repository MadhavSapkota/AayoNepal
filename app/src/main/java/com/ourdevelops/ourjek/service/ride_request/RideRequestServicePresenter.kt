package com.ourdevelops.ourjek.service.ride_request

import android.content.Context
import android.content.Intent
import android.os.CountDownTimer
import android.os.Handler
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.constants.*
import com.ourdevelops.ourjek.json.RideCarResponseJson
import com.ourdevelops.ourjek.json.fcm.CancelBookRequestJson
import com.ourdevelops.ourjek.json.fcm.CancelBookResponseJson
import com.ourdevelops.ourjek.json.fcm.FCMMessage
import com.ourdevelops.ourjek.json.ride_request.DriverRequestBody
import com.ourdevelops.ourjek.json.ride_request.NewRideCarRequestJson
import com.ourdevelops.ourjek.models.DriverModel
import com.ourdevelops.ourjek.models.TransaksiModel
import com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.api.FCMHelper
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.BookService
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import java.util.*

class RideRequestServicePresenter(
    val context: Context,
    val view: RideReqeustServiceContractor.View,
    private var initTripDetail: TransaksiModel?,
    var initRiderList: ArrayList<DriverModel>
) : RideReqeustServiceContractor.Presenter {

    private var currentIndex = 0
    private val notificationData = DriverRequestBody()
    private var timer: CountDownTimer? = null
    private val loggedInUser = BaseApp.getInstance(context).loginUser
    private var requestOnProgress = false

    override fun searchAgain() {
        if (!requestOnProgress) {
            requestOnProgress = true
            val param = NewRideCarRequestJson()
            param.id_pelanggan = loggedInUser.id
            param.order_fitur = initTripDetail?.orderFitur
            param.start_latitude = initTripDetail?.startLatitude
            param.start_longitude = initTripDetail?.startLongitude
            param.end_latitude = initTripDetail?.endLatitude
            param.end_longitude = initTripDetail?.endLongitude
            param.jarak = initTripDetail?.jarak?.toDouble()
            param.harga = initTripDetail?.harga?.toDouble()
            param.estimasi = initTripDetail?.estimasi
            param.kredit_promo = "0"
            param.alamat_asal = initTripDetail?.alamatAsal
            param.alamat_tujuan = initTripDetail?.alamatTujuan
            param.pakai_wallet = 1

            ServiceGenerator.createService(
                    BookService::class.java,
                    loggedInUser.email,
                    loggedInUser.password,
                    loggedInUser.token
            )
                    .requestRide(param).enqueue(object : retrofit2.Callback<RideCarResponseJson> {
                        override fun onResponse(
                                call: retrofit2.Call<RideCarResponseJson>,
                                response: retrofit2.Response<RideCarResponseJson>
                        ) {
                            requestOnProgress = false
                            if (response.isSuccessful) {
                                if (response.body()?.driver.isNullOrEmpty()) {
                                    AppRideStatus.currentStatus = RideStatus.rideNotFound
                                    LocalBroadcastManager.getInstance(context).sendBroadcast(
                                        Intent(
                                            BroadCastIntents.ActionReceiverRideUpdates).putExtra(
                                            IntentKeys.riderResponseType, RideResponseType.driverNotFound))
                                    view.endRiderSearch()
                                } else {
                                    AppRideStatus.currentStatus = RideStatus.searchingRider
                                    initRiderList.clear()
                                    response.body()?.driver?.let { initRiderList.addAll(it) }
                                    currentIndex = 0
                                    initRiderList = response.body()?.driver as ArrayList<DriverModel>
                                    if (response.body()?.data?.isNotEmpty() == true) {
                                        initTripDetail = response.body()?.data?.get(0)
                                        RideRequestDetails.apply {
                                            riderDetails = response.body()?.data?.get(0)
                                            ridersList = response.body()?.driver
                                        }
                                    }
                                    checkRiderToRequest()
                                }
                            }
                        }

                        override fun onFailure(call: retrofit2.Call<RideCarResponseJson>, t: Throwable) {
                            requestOnProgress = false
                            AppRideStatus.currentStatus = RideStatus.rideNotFound
                            LocalBroadcastManager.getInstance(context).sendBroadcast(Intent(BroadCastIntents.ActionReceiverRideUpdates).putExtra(IntentKeys.riderResponseType, RideResponseType.driverNotFound))
                            view.endRiderSearch()
                        }

                    })
        }
    }

    fun createNotificationBody() {
        initTripDetail?.let { notificationData.tripDetails.initFromDb(it) }
        notificationData.customerDetails.initFromDb(loggedInUser)
    }


    fun checkRiderToRequest() {
        if (currentIndex <= initRiderList.size - 1) {
            startTimer(RideRequestTimeOut.connectionTimeOut)
            sendNotification(RideResponseType.initialize.name)
        } else {
            LocalBroadcastManager.getInstance(context).sendBroadcast(Intent(BroadCastIntents.ActionReceiverRideUpdates).putExtra(IntentKeys.riderResponseType, RideResponseType.driverNotFound.name))
            view.endRiderSearch()
        }
    }


    fun onDriverAcknowledgedRequest(token: String?) {
        if (checkIfCurrentIndexValid()) {
            if (token == initRiderList[currentIndex].regId) {
                timer?.cancel()
                startTimer(RideRequestTimeOut.riderResponseTimeOut)
            }
        }
    }

    fun onDriverAccepted(token: String?, riderDetail: EnglishDriverModel?) {
        if (checkIfCurrentIndexValid()) {
            if (token == initRiderList[currentIndex].regId) {
                timer?.cancel()
                AppRideStatus.currentStatus = RideStatus.rideFound
                AppRideStatus.availableRider = riderDetail
                AppRideStatus.currentRideId = initTripDetail?.id
                view.onRiderFound()
            }
        }
    }

    fun onHardDriveraAccept(token: String?, riderDetail: EnglishDriverModel?) {
        timer?.cancel()
        AppRideStatus.currentStatus = RideStatus.rideFound
        AppRideStatus.availableRider = riderDetail
        AppRideStatus.currentRideId = initTripDetail?.id
        view.onRiderFound()
    }

    private fun checkIfCurrentIndexValid(): Boolean {
        return currentIndex <= initRiderList.size - 1
    }

    fun onDriverRejected(token: String?) {
        if (checkIfCurrentIndexValid()) {
            if (token == initRiderList[currentIndex].regId) {
                timer?.cancel()
                currentIndex += 1
                checkRiderToRequest()
            }
        }
    }

    fun onDriverCancelled(token: String?) {
        if (checkIfCurrentIndexValid()) {
            if (token == initRiderList[currentIndex].regId) {
                AppRideStatus.setRideIdle()
                view.endRideService()
            }
        }
    }

    fun cancelRiderSearch() {
        AppLogger.log("cancel Rider Search == > cancelRiderSearch ")
        requestOnProgress = false
        timer?.cancel()
        if (checkIfCurrentIndexValid()) {
            cancelRideServer()
            sendNotification(RideResponseType.cancelSearch.name)
        }
    }


    fun cancelRideServer() {
        val requestCancel = CancelBookRequestJson()
        requestCancel.id = loggedInUser.id
        requestCancel.id_transaksi = initTripDetail?.id
        requestCancel.id_driver = "Ride request canceled by user."
        requestCancel.reason = "Ride request canceled by user."

        val service = ServiceGenerator.createService(
            BookService::class.java,
            loggedInUser.email,
            loggedInUser.password,
            loggedInUser.token
        )

        service.cancelOrder(requestCancel)
            .enqueue(object : retrofit2.Callback<CancelBookResponseJson> {
                override fun onResponse(
                    call: retrofit2.Call<CancelBookResponseJson>,
                    response: retrofit2.Response<CancelBookResponseJson>
                ) {
                    if (response.isSuccessful) {

                    }
                }

                override fun onFailure(call: retrofit2.Call<CancelBookResponseJson>, t: Throwable) {
                    t.printStackTrace()
                }
            })
    }


    private fun startTimer(expireTime: Long) {
        val handler = Handler()
        val runnable = Runnable {
            timer = object : CountDownTimer(expireTime, expireTime / 2) {
                override fun onTick(p0: Long) {
                }

                override fun onFinish() {
                    currentIndex += 1
                    checkRiderToRequest()
                }

            }.start()
        }
        handler.postDelayed(runnable, 1000)
    }

    private fun sendNotification(rideRequestType: String) {
        AppLogger.log("cancel Rider Search == > sendNotification ")
        createNotificationBody()
        val currentTime = System.currentTimeMillis()
        val expireTime = currentTime + (15 * 1000)
        notificationData.initiateTime = currentTime
        notificationData.expireTime = expireTime
        notificationData.rideResponseType = rideRequestType
        val driverFcmArray = ArrayList<String>()
        driverFcmArray.add(initRiderList[currentIndex].regId)
        val message = FCMMessage()
        message.data = notificationData
        message.to = driverFcmArray

        FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                if (rideRequestType == RideResponseType.initialize.name) {
                    timer?.cancel()
                    currentIndex += 1
                    checkRiderToRequest()
                }
            }

            override fun onResponse(call: Call, response: Response) {

            }

        })

    }

    fun onRideFinished(token: String?) {
        if (token == initRiderList[currentIndex].regId) {
            AppRideStatus.setRideIdle()
            view.endRideService()
        }
    }

    fun moveCurrentDriverToLastIndex(token: String?) {
        if (checkIfCurrentIndexValid()) {
            if (token == initRiderList[currentIndex].regId) {
                if (currentIndex < initRiderList.size - 1) {
                    timer?.cancel()
//                    val obj = riderList[currentIndex]
//                    riderList.add(obj)
                    currentIndex += 1
                    checkRiderToRequest()
                }
            }
        }
    }


}