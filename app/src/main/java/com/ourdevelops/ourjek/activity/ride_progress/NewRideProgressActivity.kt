package com.ourdevelops.ourjek.activity.ride_progress

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.chat.ChatActivity
import com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler
import com.ourdevelops.ourjek.constants.*
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo
import com.ourdevelops.ourjek.customviews.dialogs.CustomProgressDialog
import com.ourdevelops.ourjek.databinding.ActivityNewRideProgressBinding
import com.ourdevelops.ourjek.models.DriverLocationData
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel
import com.ourdevelops.ourjek.models.ride_request.TransactionDetailEnglish
import com.ourdevelops.ourjek.service.DriverLocationBroadcast
import com.ourdevelops.ourjek.service.RideRequestBroadCastReceiver
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.Utility
import java.util.*

class NewRideProgressActivity : AppCompatActivity(), NewRideProgressContractor.View,
    OnMapReadyCallback {

    private var currentLatLng: LatLng? = null
    private lateinit var binding: ActivityNewRideProgressBinding
    private lateinit var presenter: NewRideProgressPresenter
    private var mapHandler: RideRequestMapHandler? = null
    private var idDriver: String? = ""
    private var idTrans: String? = ""
    private var response: String? = ""
    private var sheetBehavior: BottomSheetBehavior<*>? = null
    private var driverDetail: EnglishDriverModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewRideProgressBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setStatusBarTransparent()
        receivingIntents()
        presenter = NewRideProgressPresenter(this.applicationContext, this)
        buttonClicks()
        setupViews()
    }

    private val rideRequestReceiver = object : RideRequestBroadCastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            when (intent?.getStringExtra(IntentKeys.riderResponseType)) {
                RideResponseType.finish.name -> {
                    CustomDialogOkay.setTitle("Ride Finished!")
                        .setMessage("Your ride has completed successfully..").showOnlyDialog(
                        this@NewRideProgressActivity,
                        object : CustomDialogOkay.dialogOnClickListener {
                            override fun onClick() {

                            }

                            override fun onClose() {

                            }

                        })
                    finish()
                }

                RideResponseType.cancelRide.name -> {
                    AppRideStatus.currentStatus = RideStatus.cancelRide
                    CustomDialogOkay.setTitle("Ride Canceled!")
                        .setMessage("Your ride has been canceled by the driver..").showOnlyDialog(
                        this@NewRideProgressActivity,
                        object : CustomDialogOkay.dialogOnClickListener {
                            override fun onClick() {

                            }

                            override fun onClose() {

                            }

                        })
                    finish()
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        LocalBroadcastManager.getInstance(this).registerReceiver(
            rideRequestReceiver,
            IntentFilter(BroadCastIntents.ActionReceiverRideUpdates)
        )
        LocalBroadcastManager.getInstance(this).registerReceiver(
            driverLocationReceiver,
            IntentFilter(BroadCastIntents.driverLocationReceiver)
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(rideRequestReceiver)
        LocalBroadcastManager.getInstance(this).unregisterReceiver(driverLocationReceiver)
    }

    private val driverLocationReceiver = object : DriverLocationBroadcast() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            super.onReceive(p0, p1)
            val locationData = p1?.getSerializableExtra("driver_location") as DriverLocationData?
            AppLogger.log("Broadcast : Latitude from service -> ${locationData?.latitude} || Longitude from service -> ${locationData?.longitude}")

            if (!idDriver.isNullOrEmpty()) {
                if (idDriver == locationData?.driverId) {
                    if (locationData != null) {
                        currentLatLng = LatLng(locationData.latitude!!, locationData.longitude!!)
                        mapHandler?.updateDriverMarker(currentLatLng, locationData.bearing)
                    }
                }
            }
        }
    }

    override fun onPause() {
        super.onPause()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(rideRequestReceiver)
        LocalBroadcastManager.getInstance(this).unregisterReceiver(driverLocationReceiver)
    }

    private fun receivingIntents() {
        idDriver = intent.getStringExtra("id_driver")
        idTrans = intent.getStringExtra("id_transaksi")
        response = intent.getStringExtra("response")
    }

    private fun setupViews() {
        sheetBehavior = BottomSheetBehavior.from(binding.layoutRideProgressDetail.root)
        sheetBehavior?.state = BottomSheetBehavior.STATE_HIDDEN
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.mapView) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

    private fun buttonClicks() {
        binding.layoutRideProgressDetail.fabCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: +${driverDetail?.telephone}")
            startActivity(intent)
        }

        binding.layoutRideProgressDetail.fabChat.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            intent.putExtra("senderid", BaseApp.loginUser.id)
            intent.putExtra("receiverid", driverDetail?.id)
            intent.putExtra("tokendriver", BaseApp.loginUser.token)
            intent.putExtra("tokenku", driverDetail?.token)
            intent.putExtra("name", driverDetail?.driver_name)
            intent.putExtra("pic", Constants.IMAGESDRIVER + driverDetail?.photo)
            intent.putExtra("id_transaksi", idTrans)
            startActivity(intent)
        }

        binding.fabBack.setOnClickListener {
            finish()
        }

        binding.layoutRideProgressDetail.btnAction.setOnClickListener {
            CustomDialogYesNo().setTitle("Cancel Ride?")
                .setMessage("Are you sure you want to cancel the ride?")
                .setBtnTextYes("Cancel Ride")
                .showYesNoDialog(this, object : CustomDialogYesNo.dialogOnClickListener {
                    override fun onClick() {
                        CustomProgressDialog.showDialog(
                            "Please wait..",
                            "Cancelling your ride",
                            this@NewRideProgressActivity
                        )
                        presenter.onCancelRide("cancel the ride")
                    }

                    override fun onClose() {

                    }
                })
        }
    }

    private fun setStatusBarTransparent() {
        window.apply {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            statusBarColor = Color.TRANSPARENT
        }
    }

    override fun onMapReady(p0: GoogleMap?) {
        mapHandler = RideRequestMapHandler(p0, null, this.applicationContext, this)
        mapHandler?.initMap()
        requestRideDetails()
    }

    private fun requestRideDetails() {
        sheetBehavior?.state = BottomSheetBehavior.STATE_HIDDEN
        binding.loader.visibility = View.VISIBLE
        presenter.getRideDetails(idTrans, idDriver)
    }

    override fun onTripDetails(tripDetailResponse: TransactionDetailEnglish) {
        binding.loader.visibility = View.GONE
        Utility.currencyTXT(
            binding.layoutRideProgressDetail.tvCost,
            tripDetailResponse.price.toString(),
            this
        )
        binding.layoutRideProgressDetail.tvEstimatedTime.text = tripDetailResponse.estimatedTime
        binding.layoutRideProgressDetail.tvDistance.text = tripDetailResponse.distance.toString()
        binding.layoutRideProgressDetail.tvDiscount.text = tripDetailResponse.getDiscountValue()
        Utility.currencyTXT(
            binding.layoutRideProgressDetail.tvTotal,
            tripDetailResponse.finalCost,
            this
        )
        binding.layoutRideProgressDetail.tvPickupLocation.text = tripDetailResponse.originalAddress
        binding.layoutRideProgressDetail.tvDropLocation.text = tripDetailResponse.destinationAddress
        sheetBehavior?.state = BottomSheetBehavior.STATE_EXPANDED

        //requesting map route//
        val pickUpLocation = LocationWrapper(
            tripDetailResponse.startLongitude,
            tripDetailResponse.startLatitude,
            tripDetailResponse.originalAddress
        )
        val dropOffLocation = LocationWrapper(
            tripDetailResponse.endLongitude,
            tripDetailResponse.endLatitude,
            tripDetailResponse.destinationAddress
        )
        mapHandler?.requestRouteWithPickUpMarker(pickUpLocation, dropOffLocation)

        if (!tripDetailResponse.status.equals(TransactionStatus.cancel) && !tripDetailResponse.status.equals(
                TransactionStatus.finish
            )
        ) {
            AppLogger.log("fitur -> ${tripDetailResponse.orderFeature}")
            when(tripDetailResponse.orderFeature){
                "16" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.car_rider)
                }

                "15" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.bike_rider)
                }

                "26" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.taxi_rider)
                }
            }
            mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.ic_colored_bike)
        } else if (tripDetailResponse.status.equals(TransactionStatus.cancel) || tripDetailResponse.status.equals(
                TransactionStatus.finish
            )
        ) {
            mapHandler?.removeDriverMarker()
        }
    }

    override fun onDriverDetail(driverDetailResponse: EnglishDriverModel) {
        driverDetail = driverDetailResponse
        binding.layoutRideProgressDetail.tvRiderRating.text = driverDetailResponse.rating
        val driverImageUrl = "${Constants.IMAGESDRIVER}${driverDetailResponse.photo}"
        Glide.with(this)
            .load(driverImageUrl)
            .apply(RequestOptions.placeholderOf(R.drawable.circle_bg))
            .into(binding.layoutRideProgressDetail.imgRider)
        binding.layoutRideProgressDetail.tvRiderName.text = driverDetailResponse.driver_name
        val vehicleDetail =
            "${driverDetailResponse.vehicle_brand} - ${driverDetailResponse.vehicle_color} (${driverDetailResponse.vehicle_number})"
        binding.layoutRideProgressDetail.tvVehicleDetails.text = vehicleDetail
    }

    override fun onChangeStatus(status: String, a: Int) {
        binding.status.text = status
        binding.layoutRideProgressDetail.btnAction.visibility = a
    }

    override fun onRideCanceled() {
        mapHandler?.removeDriverMarker()
        CustomProgressDialog.dismissDialog()
        finish()
    }

    override fun onRideCancelError(errorMessage: String) {
        CustomProgressDialog.dismissDialog()
        CustomDialogOkay.setTitle(errorMessage)
            .showOnlyDialog(this, object : CustomDialogOkay.dialogOnClickListener {
                override fun onClick() {

                }

                override fun onClose() {

                }

            })
    }


}