package com.ourdevelops.ourjek.service.location_service

import android.Manifest
import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.os.IBinder
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.ActivityLocationPickerBinding
import java.util.*

class LocationPickerActivity : AppCompatActivity(), LocationServiceCallBack, OnMapReadyCallback {
    private lateinit var binding: ActivityLocationPickerBinding
    private var locationService: LocationService? = null
    private val locationRequestCode = 100
    private lateinit var googleMap: GoogleMap
    private var currentLocation: Location? = null
    private val zoomHeight = 15f
    private var hasFocusedToCurrentLocation = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationPickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        checkPermissions()
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.locationPicker_maps) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

    private fun checkPermissions() {
        if (ActivityCompat.checkSelfPermission(
                        applicationContext,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED ||
                ActivityCompat.checkSelfPermission(
                        applicationContext,
                        Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.ACCESS_FINE_LOCATION
            ), locationRequestCode)
        } else {
            initializeLocationService()
        }
    }

    private fun initializeLocationService() {
        val intent = Intent(applicationContext, LocationService::class.java)
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE)
        startService(intent)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == locationRequestCode) {
            if (resultCode == RESULT_OK) {
                initializeLocationService()
            } else {
                showLocationRejectedDialog()
            }
        }
    }

    private fun showLocationRejectedDialog() {

    }

    override fun onDestroy() {
        super.onDestroy()
        unbindService(serviceConnection)
    }

    override fun showTurnOnGpsDialog() {

    }

    override fun onLocationAvailable(location: Location) {
        currentLocation = location
        if (!hasFocusedToCurrentLocation) {
            hasFocusedToCurrentLocation = true
            focusToCurrentLocation()
        }
    }

    @SuppressLint("MissingPermission")
    override fun onMapReady(p0: GoogleMap?) {
        googleMap = p0!!
        googleMap.uiSettings.isMyLocationButtonEnabled = true
        googleMap.isMyLocationEnabled = true
        if (currentLocation != null) {
            hasFocusedToCurrentLocation = true
            focusToCurrentLocation()
        }
    }

    private fun focusToCurrentLocation(){
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                LatLng(currentLocation?.latitude!!, currentLocation?.longitude!!), zoomHeight)
        )
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(zoomHeight))
    }

    private var serviceConnection: ServiceConnection = object : ServiceConnection {
        override fun onServiceDisconnected(p0: ComponentName?) {
        }

        override fun onServiceConnected(p0: ComponentName?, iBinder: IBinder?) {
            val binder = iBinder as LocationService.LocalBinder
            locationService = binder.service
            locationService?.setCallBacks(this@LocationPickerActivity)
        }
    }
}