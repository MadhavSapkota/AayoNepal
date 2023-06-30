package com.ourdevelops.ourjek.activity.riderequest.map_handler

import android.content.Context
import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import java.util.*

class RideRequestMapHandlerPresenter(
    val context: Context?,
    val view: RideRequestMapHandlerContractor.View
) : RideRequestMapHandlerContractor.Presenter {

    override fun requestRoute(pickUpWrapper: LocationWrapper, destinationWrapper: LocationWrapper) {
        val pickUpLatLng = LatLng(pickUpWrapper.latitude!!, pickUpWrapper.longitude!!)
        val destinationLatLng =
            LatLng(destinationWrapper.latitude!!, destinationWrapper.longitude!!)
        MapDirectionAPI.getDirection(pickUpLatLng, destinationLatLng).enqueue(updateRouteCallback)
    }


    private val updateRouteCallback: Callback = object : Callback {
        override fun onFailure(call: Call, e: IOException) {
        }

        @Throws(IOException::class)
        override fun onResponse(call: Call, response: Response) {
            if (response.isSuccessful) {
                val json = Objects.requireNonNull(response.body())!!.string()
                val distance = MapDirectionAPI.getDistance(context, json)
                val time = MapDirectionAPI.getTimeDistance(context, json)
                view.onRouteResponse(json)
            }
        }
    }

}