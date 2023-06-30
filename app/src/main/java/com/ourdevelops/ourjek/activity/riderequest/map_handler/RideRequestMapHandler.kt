package com.ourdevelops.ourjek.activity.riderequest.map_handler

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.*
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface
import com.ourdevelops.ourjek.gmap.directions.Directions
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.utils.AppLocationNameProvider
import com.ourdevelops.ourjek.utils.AppLogger

class RideRequestMapHandler(
    val gMap: GoogleMap?,
    val callBack: RideRequestInterface?,
    val context: Context?,
    val activity: Activity
) : GoogleMap.OnCameraMoveListener, GoogleMap.OnCameraIdleListener,
    RideRequestMapHandlerContractor.View {
    private var driverMarker: Marker? = null
    private lateinit var presenter: RideRequestMapHandlerPresenter
    private var pickupWrapper: LocationWrapper? = null
    private var destinationWrapper: LocationWrapper? = null
    private var ridersMarkers = ArrayList<Marker>()
    private var addPickupMarker = false

    fun initMap() {
        presenter = RideRequestMapHandlerPresenter(context, this)
        gMap?.setOnCameraMoveListener(this)
        gMap?.setOnCameraIdleListener(this)
        gMap?.uiSettings?.isMyLocationButtonEnabled = true
        if (context?.let { ActivityCompat.checkSelfPermission(it, Manifest.permission.ACCESS_FINE_LOCATION) } != PackageManager.PERMISSION_GRANTED && context?.let { ActivityCompat.checkSelfPermission(it, Manifest.permission.ACCESS_COARSE_LOCATION) } != PackageManager.PERMISSION_GRANTED) {
                callBack?.checkPermission()
            return
        }
        gMap?.isMyLocationEnabled = true
        gMap?.moveCamera(
            CameraUpdateFactory.newLatLngZoom(
                LatLng(27.6667, 85.3500), 12f
            )
        )
        gMap?.animateCamera(CameraUpdateFactory.zoomTo(12f))
    }

    override fun onCameraMove() {
        Log.d("onCamera", "onCameraMove: ")
        callBack?.onCameraMove()
    }

    override fun onCameraIdle() {
        callBack?.onCameraIdle()
    }

    fun refreshMapPosition(latitude: Double?, longitude: Double?) {
        val positionBuilder = CameraPosition.Builder()
        positionBuilder.target(LatLng(latitude!!, longitude!!)).zoom(18f)
        gMap?.animateCamera(CameraUpdateFactory.newCameraPosition(positionBuilder.build()))
    }

    fun refreshMyPosition(latitude: Double?, longitude: Double?) {
        activity.runOnUiThread {
            gMap?.clear()
            gMap?.addMarker(
                MarkerOptions().position(
                    LatLng(latitude!!, longitude!!)

                ).title("Pick up")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_pickup))
            )
        }
        val positionBuilder = CameraPosition.Builder()
        positionBuilder.target(LatLng(latitude!!, longitude!!)).zoom(18f)
        gMap?.animateCamera(CameraUpdateFactory.newCameraPosition(positionBuilder.build()))
    }

    fun removeDriverMarker() {
        try {
            driverMarker?.remove()
        }catch (e: Exception){
        }
    }

    fun addDriverMarker(latLng: LatLng?, title: String, image: Int) {
        try {
            activity.runOnUiThread {
                val a = ContextCompat.getDrawable(context!!, image)!!.toBitmap()
//                driverMarker = gMap?.addMarker(MarkerOptions().position(latLng!!).title(title).icon(BitmapDescriptorFactory.fromResource(image)))!!
                driverMarker = gMap?.addMarker(MarkerOptions().position(LatLng(27.6698113, 85.3197525)).title(title).icon(BitmapDescriptorFactory.fromBitmap(a)))
            }
        }catch (e: Exception){
            AppLogger.log("add driver marker location error -> $e")
        }
    }

    fun updateDriverMarker(latLng: LatLng?, bearing: Float?) {
        try {
            driverMarker?.position = latLng!!
            driverMarker?.rotation = bearing!!
        }catch (e: Exception){
            AppLogger.log("update driver marker location error -> $e")
        }
    }

    fun slightMoveMapPosition() {
        refreshMapPosition(
            gMap?.cameraPosition?.target?.latitude!! + 0.0002,
            gMap?.cameraPosition?.target?.longitude!! + 0.0001
        )
    }

    fun getCameraCenterLocationWrapper(context: Context): LocationWrapper {
        val longitude = gMap?.cameraPosition?.target?.longitude
        val latitude = gMap?.cameraPosition?.target?.latitude
        return LocationWrapper(
            longitude,
            latitude,
            AppLocationNameProvider.getLocationName(latitude!!, longitude!!, context)
        )
    }


    fun requestRoute(pickUp: LocationWrapper, destination: LocationWrapper) {
        this.pickupWrapper = pickUp
        this.destinationWrapper = destination
        presenter.requestRoute(pickupWrapper!!, destinationWrapper!!)
    }


    fun requestRouteWithPickUpMarker(pickUp: LocationWrapper, destination: LocationWrapper) {
        addPickupMarker = true
        this.pickupWrapper = pickUp
        this.destinationWrapper = destination
        presenter.requestRoute(pickupWrapper!!, destinationWrapper!!)
    }

    override fun onRouteResponse(response: String) {
        val destinationLatLng =
            LatLng(destinationWrapper?.latitude!!, destinationWrapper?.longitude!!)
        val pickupLatLng = LatLng(pickupWrapper?.latitude!!, pickupWrapper?.longitude!!)
        if (addPickupMarker) {
            addMarkerToMap(
                pickupLatLng,
                "Pick Up",
                R.drawable.pickup
            )
        }
        addMarkerToMap(
            destinationLatLng,
            "Destination",
            R.drawable.destination
        )
        updateLineDestination(response, pickupLatLng, destinationLatLng)
        callBack?.onMapRouteResponse(true, response)
    }

    private fun addMarkerToMap(latLng: LatLng, title: String, image: Int) {
        activity.runOnUiThread {
            gMap?.addMarker(
                MarkerOptions().position(
                    latLng

                ).title(title)
                    .icon(BitmapDescriptorFactory.fromResource(image))
            )
        }
    }

    private fun updateLineDestination(
        json: String,
        pickUpLatLng: LatLng,
        destinationLatLng: LatLng
    ) {
        activity.runOnUiThread {
            val directions = Directions(context)
            val routes = directions.parse(json)
            if (routes.isNotEmpty()) {
                val directionLine =
                    gMap?.addPolyline(PolylineOptions().addAll(routes[0].overviewPolyLine))
                directionLine?.color = ContextCompat.getColor(context!!, R.color.yellow)
                directionLine?.width = 8f
                val latLngBounds = LatLngBounds.Builder()
                latLngBounds.include(pickUpLatLng)
                latLngBounds.include(destinationLatLng)
                val cu = CameraUpdateFactory.newLatLngBounds(latLngBounds.build(), 15)
                gMap?.animateCamera(cu)
            }
        }
    }

    fun clearAllPolygonsMarkers() {
        gMap?.clear()
    }

    fun addRidersToMap(response: ArrayList<MarkerOptions>) {
        for (i in ridersMarkers) {
            i.remove()
        }
        ridersMarkers.clear()
        for (i in response) {
            ridersMarkers.add(gMap?.addMarker(i)!!)
        }
    }

}