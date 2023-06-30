package com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation

import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.models.ride_request.RideConfirmationWrapper

interface RideRequestConfirmationContractor {
    interface View {
        fun onRideDdataResponse(response : RideConfirmationWrapper)

        fun confirmRideRequestError(errorMessage : String)

        fun onRiderSarching()

    }

    interface Presenter {
        fun requestRideData(jsonGoogleApi : String?)

        fun confirmRideRequest(pickupWrapper : LocationWrapper, dropWrapper: LocationWrapper)
    }
}