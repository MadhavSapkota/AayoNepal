package com.ourdevelops.ourjek.activity.notification

import com.ourdevelops.ourjek.models.NewNotificationModel

interface NewNotificationContractor {

    interface View{
        fun showProgress()
        fun hideProgress()
        fun onNotificationResponseSuccess(response: ArrayList<NewNotificationModel>)
        fun onNotificationResponseFailure()

    }

    interface Presenter{
        fun getNotificationData()

    }
}