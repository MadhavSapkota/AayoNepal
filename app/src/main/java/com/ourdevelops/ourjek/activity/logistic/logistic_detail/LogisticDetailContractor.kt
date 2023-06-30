package com.ourdevelops.ourjek.activity.logistic.logistic_detail

import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel

interface LogisticDetailContractor {

    interface View{
        fun valueIsEmpty(field: String)
        fun numberIsIncorrect(field: String)
        fun valueIsNotEmpty(field: String)
        fun askForLoaders()
        fun onLoaderNumberSelected(allData: LogisticDataModel)
        fun sendDataForPayment(allData: LogisticDataModel)
    }

    interface Presenter{
        fun checkValues(allData: LogisticDataModel)
        fun setAsapDeliveryTime(): String
    }
}