package com.ourdevelops.ourjek.service.location_service

import android.location.Location

interface LocationServiceCallBack {
    fun showTurnOnGpsDialog()
    fun onLocationAvailable(location : Location)
}