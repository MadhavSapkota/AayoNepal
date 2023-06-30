package com.ourdevelops.ourjek.service.ride_request

import android.app.Notification
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.IBinder
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.constants.AppRideStatus
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.constants.RideStatus
import com.ourdevelops.ourjek.models.DriverModel
import com.ourdevelops.ourjek.models.TransaksiModel
import com.ourdevelops.ourjek.models.ride_request.FCMCustomerMessage
import com.ourdevelops.ourjek.service.RideRequestBroadCastReceiver
import com.ourdevelops.ourjek.utils.AppLogger
import java.util.*

class RideRequestService : Service(), RideReqeustServiceContractor.View {
    private lateinit var presenter: RideRequestServicePresenter
    private var rideData: TransaksiModel? = null
    private var ridersList = ArrayList<DriverModel>()
    private var rideNotificationManager: RideRequestNotificationHandler? = null
    private var messageFromDriver: FCMCustomerMessage? = null

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        AppLogger.log("should show rider searching in service ..")
        LocalBroadcastManager.getInstance(this).registerReceiver(
            rideRequestReceiver,
            IntentFilter(BroadCastIntents.ActionReceiverRideUpdates)
        )
        if (intent != null) {
            rideData = intent.getSerializableExtra(IntentKeys.rideDetails) as TransaksiModel?
            ridersList = intent.getSerializableExtra(IntentKeys.riderList) as ArrayList<DriverModel>
        }
        presenter = RideRequestServicePresenter(applicationContext, this, rideData, ridersList)

        presenter.createNotificationBody()
        sendNotification()
        if (!intent?.getStringExtra("isSearchingAgain").isNullOrEmpty()) {
            AppRideStatus.currentStatus = RideStatus.searchingRider
            presenter.searchAgain()
        }
        else {
            presenter.checkRiderToRequest()
        }
        return START_NOT_STICKY
    }

    private fun sendNotification() {
        rideNotificationManager = RideRequestNotificationHandler(applicationContext, this)
        rideNotificationManager?.showNotification()

    }

    override fun endRiderSearch() {
        AppLogger.log("in end rider search before broadcast")
        broadCastNotFound()
    }

    override fun onRiderFound() {
        rideNotificationManager?.cancelNotification()
        rideNotificationManager?.showRiderFoundNotification()
        val intent = Intent(BroadCastIntents.ActionReceiverRideUpdates)
        intent.putExtra(IntentKeys.riderResponseType, RideResponseType.rideFoundView.name)
        LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent)
    }

    override fun endRideService() {
        onDestroy()
    }

    override fun startServiceFromNotification(notificationID: Int, notification: Notification) {
        startForeground(notificationID, notification)
    }

    private fun broadCastNotFound() {
        AppLogger.log("broadcast driver not found")
        val intent = Intent(BroadCastIntents.ActionReceiverRideUpdates)
        intent.putExtra(IntentKeys.riderResponseType, RideResponseType.notFound.name)
        LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent)
    }

    override fun onDestroy() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(rideRequestReceiver)
        stopSelf()
        super.onDestroy()
    }

    private val rideRequestReceiver = object : RideRequestBroadCastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            messageFromDriver =
                intent?.getSerializableExtra(IntentKeys.fcmCustomerData) as FCMCustomerMessage?
            val riderResponseType = intent?.getStringExtra(IntentKeys.riderResponseType)

            AppLogger.log("this is rider Response == > $riderResponseType")

            when (riderResponseType) {

                RideResponseType.notFound.name -> {
                    presenter.cancelRideServer()
                }

                RideResponseType.driverNotFound.name -> {
                    rideNotificationManager?.cancelNotification()
                    rideNotificationManager?.showRiderNotFoundNotification()
                    stopSelf()
                }

                RideResponseType.acknowledge.name -> {
                    presenter.onDriverAcknowledgedRequest(messageFromDriver?.riderDetail?.token)
                }

                RideResponseType.accept.name -> {
                    val fcmCustomerMessage =
                        intent.getSerializableExtra(IntentKeys.fcmCustomerData) as FCMCustomerMessage?
                    presenter.onDriverAccepted(
                        fcmCustomerMessage?.riderDetail?.token,
                        fcmCustomerMessage?.riderDetail
                    )
                }

                RideResponseType.serverHardAccept.name -> {
                    val fcmCustomerMessage =
                        intent.getSerializableExtra(IntentKeys.fcmCustomerData) as FCMCustomerMessage?
                    presenter.onHardDriveraAccept(
                        fcmCustomerMessage?.riderDetail?.token,
                        fcmCustomerMessage?.riderDetail
                    )
                }

                RideResponseType.decline.name -> {
                    presenter.onDriverRejected(messageFromDriver?.riderDetail?.token)
                }

                RideResponseType.cancelSearch.name -> {
                    AppRideStatus.currentStatus = RideStatus.searchCancelled
                    rideNotificationManager?.cancelNotification()
                    presenter.cancelRiderSearch()
                    rideNotificationManager?.showRideCanceledNotification()
                    stopSelf()
                }

                RideResponseType.cancelRide.name -> {
                    presenter.onDriverCancelled(messageFromDriver?.riderDetail?.token)
                    rideNotificationManager?.cancelNotification()
                    stopSelf()
                }

                RideResponseType.finish.name -> {
                    presenter.onRideFinished(messageFromDriver?.riderDetail?.token)
                    rideNotificationManager?.cancelNotification()
                    rideNotificationManager?.showRideFinishedNotification()
                    stopSelf()
                }

                RideResponseType.driverIsBusy.name -> {
                    presenter.moveCurrentDriverToLastIndex(messageFromDriver?.riderDetail?.token)
                }

                RideResponseType.closeService.name -> {
                    onDestroy()
                }

                RideResponseType.onCustomerRideCanceled.name -> {
                    AppRideStatus.currentStatus = RideStatus.cancelRide
                    rideNotificationManager?.cancelNotification()
                    rideNotificationManager?.showRideCanceledNotification()
                    stopSelf()
                }

            }

        }
    }

}