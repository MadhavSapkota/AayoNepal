package com.ourdevelops.ourjek.activity.logistic

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.location.LocationManager
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.util.Log
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import com.ourdevelops.ourjek.activity.logistic.item_detail.LogisticItemDetailActivity
import com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState
import com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface
import com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler
import com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRequestInterface
import com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRideRequestAdapter
import com.ourdevelops.ourjek.constants.ActivityResultCodes
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.constants.LocationConstants
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.customviews.dialogs.CustomProgressDialog
import com.ourdevelops.ourjek.databinding.ActivityLogisticBinding
import com.ourdevelops.ourjek.fragment.ride_request.RideReqeustSearchDestinationFragment
import com.ourdevelops.ourjek.json.SavedAddressObj
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.service.LocationBroadCastReceiver
import com.ourdevelops.ourjek.service.location_service.LocationService
import java.util.*

class LogisticActivity : AppCompatActivity(), LogisticContractor.View, OnMapReadyCallback,
    RideRequestInterface, SavedAddressRequestInterface {

    private var mapFragment: SupportMapFragment? = null
    private lateinit var binding: ActivityLogisticBinding
    private lateinit var presenter: LogisticPresenter
    private lateinit var locationManager: LocationManager
    private var myLocationWrapper: LocationWrapper? = null
    private var hasUpdatedCurrentLocation = false
    private var setOnMapFragment: RideReqeustSearchDestinationFragment? = null
    private var confirmationFragment: LogisticConfirmationFragment? = null
    var sheetBehavior: BottomSheetBehavior<*>? = null
    private var currentFragmentState = RideFragmentState.loadingState
    private var destinationLocationWrapper: LocationWrapper? = null
    private var mapHandler: RideRequestMapHandler? = null
    private lateinit var savedAddressAdapter: SavedAddressRideRequestAdapter
    private var savedAddressResponse = ArrayList<SavedAddressObj>()

    val FITUR_KEY = "FiturKey"
    var ICONFITUR: String? = null
    private val TAG = "LogisticActivity."
    private val REQUEST_PERMISSION_LOCATION = 991

    private var jarak = 0.0
    var fitur: String? = null
    var getbiaya: String? = null
    private var allData: LogisticDataModel? = null
    var biayaminimum: String? = null
    var biayaakhir: String? = null
    var fiturId = 0
    var maksimum: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogisticBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = LogisticPresenter(this, applicationContext, this)
        sheetBehavior = BottomSheetBehavior.from(binding.layoutSearchSet.root)
        sheetBehavior?.state = BottomSheetBehavior.STATE_HIDDEN
        locationManager = getSystemService(LOCATION_SERVICE) as LocationManager
        getIntentData()
        setupView()
        onButtonClicks()
        presenter.getAllSavedAddress()
    }

    private fun getIntentData() {
        allData = intent.getSerializableExtra("allData") as LogisticDataModel
        fiturId = allData?.idFitur!!
        ICONFITUR = allData?.icon
    }

    private fun setupView() {
        savedAddressAdapter = SavedAddressRideRequestAdapter(this, savedAddressResponse, false)
        binding.layoutSearchSet.recyclerViewSavedLocations.layoutManager = LinearLayoutManager(this)
        binding.layoutSearchSet.recyclerViewSavedLocations.adapter = savedAddressAdapter
        setOnMapFragment = RideReqeustSearchDestinationFragment(this)
        confirmationFragment = LogisticConfirmationFragment(this)
        if (!Places.isInitialized()) {
            Places.initialize(applicationContext, getString(R.string.google_maps_key))
        }
        mapFragment = supportFragmentManager.findFragmentById(R.id.mapView) as SupportMapFragment?
        fitur = allData?.idFitur.toString()
        getbiaya = allData?.biaya.toString()
        biayaminimum = allData?.biaya_minimum.toString()
        biayaakhir = allData?.biayaAkhir.toString()
        maksimum = if(allData?.max_distance.isNullOrEmpty()){
            50
        }else {
            allData?.max_distance!!.toLong()
        }

        Log.e("biaya", getbiaya!!)
    }

    private fun onButtonClicks() {

        binding.layoutSearchSet.layoutSetOnMap.setOnClickListener {
            inflateSetLocationFragment(RideFragmentState.setOnMapState, "destination")
        }

        binding.imgBack.setOnClickListener {
            onBackPressConditions()
        }

        sheetBehavior?.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        binding.layoutSearchSet.layoutSearchBack.visibility = View.VISIBLE
                        binding.layoutSearchSet.divider.visibility = View.VISIBLE
                        savedAddressAdapter.toggleShowAll(true)
                        savedAddressAdapter.notifyDataSetChanged()
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        binding.layoutSearchSet.layoutSearchBack.visibility = View.GONE
                        binding.layoutSearchSet.divider.visibility = View.GONE
                        savedAddressAdapter.toggleShowAll(false)
                        savedAddressAdapter.notifyDataSetChanged()
                    }
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

        })

        binding.layoutSearchSet.imgBackSearch.setOnClickListener {
            sheetBehavior?.state = BottomSheetBehavior.STATE_COLLAPSED
        }

        binding.layoutSearchSet.layoutPickupLocation.setOnClickListener {
            openLocationSearchPicker(false)
        }

        binding.layoutSearchSet.locationPickerAutoCompleteText.setOnClickListener {
            if (sheetBehavior?.state == BottomSheetBehavior.STATE_EXPANDED) {
                openLocationSearchPicker(true)
            } else {
                sheetBehavior?.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }

    }

    override fun inflateInitialFragment() {
        currentFragmentState = RideFragmentState.initialState
        binding.pinImage.visibility = View.GONE
        binding.tvDragMessage.visibility = View.GONE
        supportFragmentManager.findFragmentById(R.id.fragmentContainer)?.let {
            supportFragmentManager.beginTransaction()
                .remove(
                    it
                ).commit()
        }
        mapHandler?.refreshMyPosition(myLocationWrapper?.latitude, myLocationWrapper?.longitude)
    }

    override fun inflateSetLocationFragment(state: RideFragmentState, type: String) {
        currentFragmentState = state
        sheetBehavior?.state = BottomSheetBehavior.STATE_HIDDEN
        mapHandler?.slightMoveMapPosition()

        val runnable = Runnable {
            binding.pinImage.visibility = View.VISIBLE
            binding.tvDragMessage.visibility = View.VISIBLE
            setOnMapFragment?.apply {
                setType(type)
                fragmentTransactionHandler(this)
            }
        }
        Handler().postDelayed(runnable, 200)
    }

    @SuppressLint("MissingPermission")
    override fun onMapReady(googleMap: GoogleMap?) {
        mapHandler = RideRequestMapHandler(googleMap, this, this.applicationContext, this)
        mapHandler?.initMap()
    }

    override fun onSavedAddressResponse(savedAddressResponse: ArrayList<SavedAddressObj>) {
        this.savedAddressResponse.clear()
        this.savedAddressResponse.addAll(savedAddressResponse)
        savedAddressAdapter.notifyDataSetChanged()
        val floatInPixels = resources.getDimension(R.dimen._220dp)
        sheetBehavior?.peekHeight = floatInPixels.toInt()
    }

    override fun onSavedAddressTapped(obj: SavedAddressObj) {
        destinationLocationWrapper = LocationWrapper(obj.address_longitude.toDouble(), obj.address_latitude.toDouble(), obj.address_name)
        inflateSetLocationFragment(RideFragmentState.setOnMapState, "destination")
        mapHandler?.refreshMapPosition(destinationLocationWrapper?.latitude, destinationLocationWrapper?.longitude)
    }

    override fun onConfirmClick(distance: Double, timeDistance: String) {
        super.onConfirmClick(distance, timeDistance)
        onNextButtonClick(distance, timeDistance)
    }

    private fun onNextButtonClick(distance: Double, timeDistance: String) {
        allData?.apply {
            this.distance = distance
            pickUpLat = myLocationWrapper?.latitude
            pickUpLng = myLocationWrapper?.longitude
            destinationLat = destinationLocationWrapper?.latitude
            destinationLng = destinationLocationWrapper?.longitude
            pickUpLocation = myLocationWrapper?.locationName
            destinationLocation = destinationLocationWrapper?.locationName
            time = timeDistance
        }

        val intent = Intent(this, LogisticItemDetailActivity::class.java)
        intent.putExtra("allData", allData)
        startActivity(intent)
        finish()
    }

    private fun checkGpsEnabled() {
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            mapFragment?.getMapAsync(this)
        } else {
            CustomDialogOkay
                .setTitle("Turn on GPS")
                .setMessage("You need to turn on your gps to enable this feature.")
                .setBtnText("Turn on")
                .showOnlyDialog(this, object : CustomDialogOkay.dialogOnClickListener {
                    override fun onClick() {
                        val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                        startActivityForResult(intent, LocationConstants.turnOnGpsRequestCode)
                    }

                    override fun onClose() {

                    }

                })
        }
    }

    override fun onResume() {
        val broadcastManager = LocalBroadcastManager.getInstance(this)
        broadcastManager.registerReceiver(
            locationReceiver,
            IntentFilter(BroadCastIntents.ActionReceiveLocation)
        )
        if (!hasUpdatedCurrentLocation) {
            checkGpsEnabled()
            if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                startLocationService()
            }
        }
        super.onResume()
    }

    private fun startLocationService() {
        val intent = Intent(this, LocationService::class.java)
        startService(intent)
    }

    override fun onPause() {
        super.onPause()
        val broadcastManager = LocalBroadcastManager.getInstance(this)
        broadcastManager.unregisterReceiver(locationReceiver)
    }

    private val locationReceiver = object : LocationBroadCastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            binding.loader.visibility = View.GONE

            if (!hasUpdatedCurrentLocation) {
                hasUpdatedCurrentLocation = true
                val latitude = intent?.getDoubleExtra(IntentKeys.LatitudeKey, 0.0)
                val longitude = intent?.getDoubleExtra(IntentKeys.LongitudeKey, 0.0)
                val locationName = intent?.getStringExtra(IntentKeys.LocationNameKey)
                binding.layoutSearchSet.tvPickupLocation.text = locationName
                myLocationWrapper = LocationWrapper(longitude, latitude, locationName)
                mapHandler?.refreshMyPosition(latitude, longitude)
                currentFragmentState = RideFragmentState.initialState
            }

        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressConditions()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    private fun onBackPressConditions() {
        when (currentFragmentState) {
            RideFragmentState.setOnMapState -> {
                inflateInitialFragment()
            }
            RideFragmentState.searchState -> {

            }
            RideFragmentState.confirmationState -> {
                mapHandler?.clearAllPolygonsMarkers()
                inflateInitialFragment()
            }
            else -> {
                finish()
            }
        }
    }

    override fun onCameraMove() {
        when (currentFragmentState) {

            RideFragmentState.initialState -> {
                setOnMapFragment?.setSearchingText("Searching location..")
            }

            RideFragmentState.setOnMapState -> {
                binding.tvDragMessage.visibility = View.GONE
                setOnMapFragment?.setSearchingText("Searching location..")
            }

            RideFragmentState.setPickUpMapState -> {
                binding.tvDragMessage.visibility = View.GONE
                setOnMapFragment?.setSearchingText("Searching location..")
            }
        }

    }

    override fun onCameraIdle() {
        when (currentFragmentState) {

            RideFragmentState.initialState -> {
                sheetBehavior?.state = BottomSheetBehavior.STATE_COLLAPSED
            }

            RideFragmentState.setOnMapState -> {
                destinationLocationWrapper =
                    mapHandler?.getCameraCenterLocationWrapper(this.applicationContext)
                setOnMapFragment?.setDestination(destinationLocationWrapper)
            }

            RideFragmentState.setPickUpMapState -> {
                myLocationWrapper =
                    mapHandler?.getCameraCenterLocationWrapper(this.applicationContext)
                setOnMapFragment?.setDestination(myLocationWrapper)
            }
        }
    }

    override fun showRideConfirmationPage() {
        when (currentFragmentState) {

            RideFragmentState.setOnMapState -> {
                CustomProgressDialog.showDialog("Searching route", "Please wait..", this)
                binding.pinImage.visibility = View.GONE
                binding.tvDragMessage.visibility = View.GONE
                mapHandler?.requestRoute(myLocationWrapper!!, destinationLocationWrapper!!)
            }

            RideFragmentState.setPickUpMapState -> {
                binding.pinImage.visibility = View.GONE
                binding.tvDragMessage.visibility = View.GONE
                sheetBehavior?.state = BottomSheetBehavior.STATE_EXPANDED
                supportFragmentManager.beginTransaction().remove(setOnMapFragment!!).commit()
            }
        }
    }

    private fun fragmentTransactionHandler(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.slide_up_in,
                R.anim.slide_to_bottom,
                R.anim.slide_up_in,
                R.anim.slide_to_bottom
            )
            .replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }

    override fun onMapRouteResponse(success: Boolean, json: String?) {
        CustomProgressDialog.dismissDialog()
        if (success) {
            currentFragmentState = RideFragmentState.confirmationState
            supportFragmentManager.findFragmentById(R.id.fragmentContainer)?.let {
                supportFragmentManager.beginTransaction()
                    .remove(
                        it
                    ).commit()
            }
            confirmationFragment?.setPickDropLocations(
                myLocationWrapper,
                destinationLocationWrapper,
                json
            )
            confirmationFragment?.let { fragmentTransactionHandler(it) }
        } else {
            CustomDialogOkay.setTitle("No routes found")
                .showOnlyDialog(this, object : CustomDialogOkay.dialogOnClickListener {
                    override fun onClick() {

                    }

                    override fun onClose() {

                    }

                })
        }
    }

    private fun openLocationSearchPicker(isDestination: Boolean) {
        val requestCode = if (isDestination) {
            ActivityResultCodes.RequestDestinationSearch
        } else {
            ActivityResultCodes.RequestPickupSearch
        }
        val fields = listOf(
            Place.Field.ID,
            Place.Field.ADDRESS,
            Place.Field.LAT_LNG
        )
        val intent = Autocomplete.IntentBuilder(
            AutocompleteActivityMode.FULLSCREEN, fields
        )
            .setCountry("NP")
            .build(this)
        startActivityForResult(intent, requestCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            when (requestCode) {
                ActivityResultCodes.RequestDestinationSearch -> {
                    val place = Autocomplete.getPlaceFromIntent(data!!)
                    destinationLocationWrapper =
                        LocationWrapper(place.latLng?.longitude, place.latLng?.latitude, place.address)
                    val handler = Handler()
                    val runnable = Runnable {
                        inflateSetLocationFragment(RideFragmentState.setOnMapState, "destination")
                        mapHandler?.refreshMapPosition(
                            destinationLocationWrapper?.latitude,
                            destinationLocationWrapper?.longitude
                        )
                    }
                    handler.postDelayed(runnable, 500)
                }

                ActivityResultCodes.RequestPickupSearch -> {
                    val place = Autocomplete.getPlaceFromIntent(data!!)
                    myLocationWrapper = LocationWrapper(place.latLng?.longitude, place.latLng?.latitude, place.address)
                    binding.layoutSearchSet.tvPickupLocation.text = myLocationWrapper?.locationName
                    val handler = Handler()
                    val runnable = Runnable {
                        inflateSetLocationFragment(RideFragmentState.setPickUpMapState, "pickup")
                        mapHandler?.refreshMyPosition(myLocationWrapper?.latitude, myLocationWrapper?.longitude)
                    }
                    handler.postDelayed(runnable, 500)
                }

                LocationConstants.locationRequestCode -> {
                    checkGpsEnabled()
                }
            }
        }
    }

    override fun checkPermission() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), LocationConstants.locationRequestCode)
            return
        }
        checkGpsEnabled()
    }
}