package com.ourdevelops.ourjek.service.location_service

import android.location.Location

interface LocationContractor {

    interface View {
        fun onLocationAvailable(location : Location?, locationName : String?)

        fun showTurnOnGpsDialog()

        fun onErrorGettingLocation()

    }

    interface Presenter {

    }
}