package com.ourdevelops.ourjek.activity.logistic

import android.widget.TextView
import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.json.SavedAddressObj
import com.ourdevelops.ourjek.models.DriverModel
import java.util.ArrayList

interface LogisticContractor {

    interface View{
    }

    interface Presenter{
        fun getAllSavedAddress()
    }
}