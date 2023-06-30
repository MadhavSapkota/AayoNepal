package com.ourdevelops.ourjek.activity.riderequest

import com.google.android.gms.maps.model.MarkerOptions
import com.ourdevelops.ourjek.json.SavedAddressObj
import com.ourdevelops.ourjek.models.DriverModel
import com.ourdevelops.ourjek.models.LocationWrapper

interface NewRiderRequestContractor {

    interface View {
        fun onNearestRidersResponse(response : ArrayList<MarkerOptions>, drivers : ArrayList<DriverModel>)
    }

    interface Presenter {
        fun getNearestRiders(filterId: Int?, myLocationWrapper: LocationWrapper?)

        fun getAllSavedAddress()
    }

}