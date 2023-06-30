package com.ourdevelops.ourjek.models.ride_request

import com.ourdevelops.ourjek.constants.RideStatus

class RideHomeModel() {
    var currentStatus : RideStatus = RideStatus.idle

    constructor(status : RideStatus) : this() {
        this.currentStatus = status
    }
}