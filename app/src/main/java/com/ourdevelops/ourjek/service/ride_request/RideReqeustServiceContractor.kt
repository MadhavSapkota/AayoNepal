package com.ourdevelops.ourjek.service.ride_request

import android.app.Notification

interface RideReqeustServiceContractor {
    interface View {
        fun endRiderSearch()
        fun onRiderFound()
        fun endRideService()
        fun startServiceFromNotification(notificationID: Int, notification: Notification)
    }

    interface Presenter {
        fun searchAgain()
    }
}