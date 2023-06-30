package com.ourdevelops.ourjek.service.location_service

import android.annotation.SuppressLint
import android.content.Context
import android.location.Geocoder
import android.location.Location
import android.os.Looper
import com.google.android.gms.location.*
import com.google.android.libraries.places.api.Places
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.utils.AppLocationNameProvider
import com.ourdevelops.ourjek.utils.AppLogger
import java.io.IOException
import java.util.*

class LocationServicePresenter(val context: Context, val view: LocationContractor.View) : LocationContractor.Presenter {
    var mylocation: Location? = null
    private lateinit var mFusedLocation: FusedLocationProviderClient
    private lateinit var locationRequest: LocationRequest
    private lateinit var locationCallback: LocationCallback

    fun initializeService() {
        Places.initialize(context, context.getString(R.string.google_maps_key))

        if (!Places.isInitialized()) {
            Places.initialize(context, context.getString(R.string.google_maps_key))
        }
        getLocations()
    }

    @SuppressLint("MissingPermission")
    private fun getLocations() {
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(p0: LocationResult) {
                super.onLocationResult(p0)
                if (p0.locations.size != 0) {
                    val i = p0.locations[0]
                    AppLogger.log("${i.latitude} -1- ${i.longitude}")
                    Constants.LONGITUDE = i.longitude
                    Constants.LATITUDE = i.latitude
                    AppLogger.log("${Constants.LATITUDE} -2- ${Constants.LONGITUDE}")
                    Constants.LOCATION = AppLocationNameProvider.getLocationName(i.latitude, i.longitude, context)
                    view.onLocationAvailable(i, Constants.LOCATION)
                    mFusedLocation.removeLocationUpdates(locationCallback)
                }
            }
        }
        locationRequest = LocationRequest.create().setInterval(1000)
        mFusedLocation = LocationServices.getFusedLocationProviderClient(context)
        mFusedLocation.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper())
    }

    private fun getLocationName(latitude: Double, longitude: Double): String {
        var result = ""
        try {
            val geocoder = Geocoder(context, Locale.getDefault())
            val addresses = geocoder.getFromLocation(latitude, longitude, 1)
            result = if (addresses.isNotEmpty()) {
                val address = addresses[0].getAddressLine(0)
                address.toString()
            } else {
                "Location not available"
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return result
    }


}