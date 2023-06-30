package com.ourdevelops.ourjek.activity

import android.Manifest
import android.R.attr
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.location.LocationManager
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState
import com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface
import com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.constants.LocationConstants
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo
import com.ourdevelops.ourjek.databinding.ActivityPicklocationBinding
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.service.LocationBroadCastReceiver
import com.ourdevelops.ourjek.service.location_service.LocationService
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.PrefsManager
import java.util.*


class PicklocationActivity : AppCompatActivity(), OnMapReadyCallback, RideRequestInterface {
    private var binding: ActivityPicklocationBinding? = null
    private var tvTo: TextView? = null
    private var formToFill = 0
    private lateinit var locationManager: LocationManager
    private var hasUpdatedCurrentLocation = false
    private var mapHandler : RideRequestMapHandler ?= null
    private var selectedLocationWrapper : LocationWrapper ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPicklocationBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        locationManager = getSystemService(LOCATION_SERVICE) as LocationManager
        formToFill = intent.getIntExtra(FORM_VIEW_INDICATOR, -1)
        setupViews()
        buttonClicks()
        updateLastLocation()
    }

    private fun setupViews() {
        if (!Places.isInitialized()) {
            Places.initialize(applicationContext, getString(R.string.google_maps_key))
        }
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.locationPicker_maps) as SupportMapFragment?
        mapFragment?.getMapAsync(this)

        try {
            if (PrefsManager(applicationContext).getplace().isNotEmpty()) {
                binding!!.tvFrom.text = PrefsManager(applicationContext).getplace()
            } else {
                binding!!.llHome.visibility = View.GONE
            }
            if (PrefsManager(applicationContext).getplace2().isNotEmpty()) {
                tvTo!!.text = PrefsManager(applicationContext).getplace2()
            } else {
                binding!!.llOffice.visibility = View.GONE
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun buttonClicks() {
        binding!!.llHome.setOnClickListener { moveToSpecificLocation(PrefsManager(applicationContext).getplace(), PrefsManager(applicationContext).latitude, PrefsManager(applicationContext).longitude) }
        binding!!.llOffice.setOnClickListener { moveToSpecificLocation(PrefsManager(applicationContext).getplace2(), PrefsManager(applicationContext).latitude2, PrefsManager(applicationContext).longitude2) }
        binding!!.locationPickerDestinationButton.setOnClickListener { selectLocation() }
        binding!!.backBtn.setOnClickListener { finish() }
        binding!!.locationPickerAutoCompleteText.setOnClickListener { setupAutocompleteTextView() }
    }

    private fun selectLocation() {
        val selectedAddress = selectedLocationWrapper?.locationName
        val selectedLatLng = LatLng(selectedLocationWrapper?.latitude!!, selectedLocationWrapper?.longitude!!)
        val intent = Intent()
        intent.putExtra(FORM_VIEW_INDICATOR, formToFill)
        intent.putExtra(LOCATION_NAME, selectedAddress)
        intent.putExtra(LOCATION_LATLNG, selectedLatLng)
        setResult(RESULT_OK, intent)
        finish()
    }

    private fun setupAutocompleteTextView() {
        val fields = listOf(
                Place.Field.ID,
                Place.Field.ADDRESS,
                Place.Field.LAT_LNG)
        val intent = Autocomplete.IntentBuilder(
                AutocompleteActivityMode.FULLSCREEN, fields)
                .setCountry("NP")
                .build(this)
        startActivityForResult(intent, 1)
    }

    private fun updateLastLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), REQUEST_PERMISSION_LOCATION)
            return
        }
        checkGpsEnabled()
    }

    private fun checkGpsEnabled() {
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            startLocationService()
        } else {
            CustomDialogYesNo()
                    .setTitle("Turn on GPS")
                    .setMessage("You need to turn on your gps to enable this feature.")
                    .setBtnTextYes("Turn on")
                    .showYesNoDialog(this, object : CustomDialogYesNo.dialogOnClickListener {
                        override fun onClick() {
                            val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                            startActivityForResult(intent, LocationConstants.turnOnGpsRequestCode)
                        }

                        override fun onClose() {
                        }

                    })
        }
    }

    private fun startLocationService() {
        val intent = Intent(this, LocationService::class.java)
        startService(intent)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mapHandler = RideRequestMapHandler(googleMap, this, applicationContext, this)
        updateLastLocation()
        mapHandler?.initMap()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_PERMISSION_LOCATION) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                updateLastLocation()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            val status = data?.let { Autocomplete.getStatusFromIntent(it) }
            AppLogger.log("checking here $status")

            if (resultCode == RESULT_OK) {
                val place = Autocomplete.getPlaceFromIntent(data!!)
                val latLng = place.latLng
                if (latLng != null) {
                    mapHandler?.refreshMapPosition(place.latLng?.latitude, place.latLng?.longitude)
                } else {
                    AppLogger.log("loation is null")
                }
                binding!!.locationPickerCurrentAddress.text = place.address
            } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                val status = Autocomplete.getStatusFromIntent(data!!)
                Log.i("TAG", Objects.requireNonNull(status.statusMessage))
            }
        } else if (requestCode == LocationConstants.turnOnGpsRequestCode) {
            if (resultCode == RESULT_OK) {
                startLocationService()
            }
        }
    }

    private fun moveToSpecificLocation(getplace: String?, latitude: String, longitude: String) {
        if (getplace.isNullOrEmpty()) {
            selectLocation()
        } else {
            val intent = Intent()
            intent.putExtra(FORM_VIEW_INDICATOR, formToFill)
            intent.putExtra(LOCATION_NAME, getplace)
            intent.putExtra(LOCATION_LATLNG, LatLng(latitude.toDouble(), longitude.toDouble()))
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    override fun onResume() {
        val broadcastManager = LocalBroadcastManager.getInstance(this)
        broadcastManager.registerReceiver(locationReceiver, IntentFilter(BroadCastIntents.ActionReceiveLocation))
        if (!hasUpdatedCurrentLocation) {
            if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                startLocationService()
            }
        }
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        val broadcastManager = LocalBroadcastManager.getInstance(this)
        broadcastManager.unregisterReceiver(locationReceiver)
    }

    private val locationReceiver = object : LocationBroadCastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val latitude = intent?.getDoubleExtra(IntentKeys.LatitudeKey, 0.0)
            val longitude = intent?.getDoubleExtra(IntentKeys.LongitudeKey, 0.0)
            val locationName = intent?.getStringExtra(IntentKeys.LocationNameKey)
            selectedLocationWrapper = LocationWrapper(longitude, latitude, locationName)
            mapHandler?.refreshMapPosition(latitude, longitude)
            binding?.locationPickerCurrentAddress?.text = locationName
            hasUpdatedCurrentLocation = true
        }
    }

    companion object {
        private const val REQUEST_PERMISSION_LOCATION = 991
        const val LOCATION_PICKER_ID = 78
        const val FORM_VIEW_INDICATOR = "FormToFill"
        const val LOCATION_NAME = "LocationName"
        const val LOCATION_LATLNG = "LocationLatLng"
    }

    override fun inflateSetLocationFragment(state: RideFragmentState, type: String) {

    }

    override fun inflateInitialFragment() {

    }

    override fun showRideConfirmationPage() {

    }

    override fun onCameraMove() {

    }

    override fun onCameraIdle() {
        selectedLocationWrapper = mapHandler?.getCameraCenterLocationWrapper(applicationContext)
        binding?.locationPickerCurrentAddress?.text = selectedLocationWrapper?.locationName
    }

    override fun onMapRouteResponse(success: Boolean, json: String?) {

    }

    override fun checkPermission() {
        updateLastLocation()
    }
}