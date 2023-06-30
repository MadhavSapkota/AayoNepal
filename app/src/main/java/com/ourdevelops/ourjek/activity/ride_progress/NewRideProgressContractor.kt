package com.ourdevelops.ourjek.activity.ride_progress

import com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel
import com.ourdevelops.ourjek.models.ride_request.TransactionDetailEnglish

interface NewRideProgressContractor {

    interface View {
        fun onTripDetails(tripDetailResponse : TransactionDetailEnglish)
        fun onDriverDetail(driverDetailResponse : EnglishDriverModel)
        fun onChangeStatus(status: String, a: Int)
        fun onRideCanceled()
        fun onRideCancelError(errorMessage : String)
    }

    interface Presenter {
        fun getRideDetails(idTrans : String?, idDriver : String?)
        fun parseData()
        fun onCancelRide(cancel_reason: String)
    }
}