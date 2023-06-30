package com.ourdevelops.ourjek.constants

import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel

object AppRideStatus {
    var currentStatus = RideStatus.idle
    var availableRider: EnglishDriverModel? = null
    var placeHolder: Int = R.drawable.ic_colored_bike
    var currentRideId: String? = null

    fun setRideIdle() {
        currentStatus = RideStatus.idle
        availableRider = null
        currentRideId = null
    }

    fun startSearchingRider(rideType: Int?) {
        currentStatus = RideStatus.searchingRider
        placeHolder = when (rideType) {
            15 -> R.drawable.ic_colored_bike
            16 -> R.drawable.ic_colored_car
            26 -> R.drawable.ic_colored_car
            else -> R.drawable.ic_colored_bike
        }
    }
}

enum class RideStatus {
    idle,
    searchingRider,
    rideFound,
    rideNotFound,
    searchCancelled,
    finish,
    rideCancelledByUser,
    start,
    cancelRide,
}