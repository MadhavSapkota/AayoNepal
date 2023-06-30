package com.ourdevelops.ourjek.models

import android.location.Location
import java.io.Serializable

data class DriverLocationData(var latitude: Double?, var longitude: Double?, var bearing: Float?, var driverId: String?): Serializable {
}