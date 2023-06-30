package com.ourdevelops.ourjek.service.customer_status_service

import android.app.Notification
import com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData

interface CustomerStatusServiceContractor {

    interface View{
        fun onFirstNotificationCreated(notificationId: Int, build: Notification)

    }

    interface Presenter{

        var Handler: CustomerStatusNotificationHandler
    }

    interface Handler{

        fun createNotification()
        fun createNewCancelableNotification(data: CustomerStatusServiceData)
        fun createNewNotification(data: CustomerStatusServiceData)
        fun updateNotification(data: CustomerStatusServiceData)
        fun dismissNotification()
        fun updateNotificationForRideOrder(data: CustomerStatusServiceData)
        fun setUpInitialData()
        fun checkSettings(mainData: CustomerStatusServiceData)
    }
}