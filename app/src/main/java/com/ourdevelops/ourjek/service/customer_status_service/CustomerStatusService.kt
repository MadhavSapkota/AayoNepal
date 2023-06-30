package com.ourdevelops.ourjek.service.customer_status_service

import android.app.Notification
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.IBinder
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.service.CustomerStatusBroadcastReceiver
import com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusTypes

class CustomerStatusService: Service(), CustomerStatusServiceContractor.View {
    private lateinit var presenter: CustomerStatusServicePresenter
    private lateinit var handler: CustomerStatusNotificationHandler

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        presenter = CustomerStatusServicePresenter(handler, this, applicationContext)
        handler = CustomerStatusNotificationHandler(presenter, this, applicationContext, BaseApp.getInstance(applicationContext).loginUser)
        presenter.Handler = handler
        LocalBroadcastManager.getInstance(applicationContext).registerReceiver(customerStatusReceiver, IntentFilter(BroadCastIntents.customerStatusReceiver))
        return START_NOT_STICKY
    }

    private val customerStatusReceiver = object : CustomerStatusBroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            when(intent?.getStringExtra("status")){

                CustomerStatusTypes.onStartFindRide.name -> {

                }

                CustomerStatusTypes.onCancelRideSearch.name -> {

                }

                CustomerStatusTypes.onDriverFound.name -> {

                }

                CustomerStatusTypes.onDriverNotFound.name -> {

                }

                CustomerStatusTypes.onCancelRide.name -> {

                }

                CustomerStatusTypes.onRideStarted.name -> {

                }

                CustomerStatusTypes.onRideFinished.name -> {

                }

                CustomerStatusTypes.onRideCanceledByDriver.name -> {

                }

            }
        }
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onFirstNotificationCreated(notificationId: Int, build: Notification) {
    }
}