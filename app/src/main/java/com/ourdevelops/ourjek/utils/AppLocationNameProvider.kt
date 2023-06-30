package com.ourdevelops.ourjek.utils

import android.content.Context
import android.location.Geocoder
import com.ourdevelops.ourjek.constants.Constants
import java.io.IOException
import java.text.DecimalFormat
import java.util.*

object AppLocationNameProvider {
    val decimalFormat = DecimalFormat("#.#####")


    fun getLocationName(latitude: Double, longitude: Double, context: Context): String {

        AppLogger.log("${latitude} -3- ${longitude}")
        AppLogger.log("${decimalFormat.format(latitude).toDouble()}")

        val formattedLatitude = decimalFormat.format(latitude).toDouble()
        val formattedLongitude = decimalFormat.format(longitude).toDouble()

        var result = ""
        try {
            val geocoder = Geocoder(context, Locale.getDefault())
            val addresses = geocoder.getFromLocation(formattedLatitude, formattedLongitude, 2)
            result =
                    if (addresses.isNullOrEmpty()) {
                        "Location not available"
                    } else {
                        val address = addresses[0].getAddressLine(0)
                        address.toString()
                    }
            AppLogger.log("formatted latitude ${formattedLatitude} \nformatted longitude ${formattedLongitude} \naddress ==> ${result}")
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return result
    }
}