package com.ourdevelops.ourjek.service.location_service

import android.annotation.SuppressLint
import android.app.Service
import android.content.Intent
import android.location.Location
import android.os.Binder
import android.os.IBinder
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.android.gms.location.*
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.utils.AppLogger
import java.util.*

class LocationService : Service(), LocationContractor.View {
    private lateinit var presenter: LocationServicePresenter
    private var binder: IBinder = LocalBinder()
    private var callBack: LocationServiceCallBack? = null
    private var hasRequestedLocationUpdate = false


    fun setCallBacks(callback: LocationServiceCallBack?) {
        this.callBack = callback
    }

    inner class LocalBinder : Binder() {
        val service: LocationService
            get() = this@LocationService
    }

    override fun onBind(intent: Intent?): IBinder {
        return binder
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        presenter = LocationServicePresenter(applicationContext, this)
        initializeService()
        return super.onStartCommand(intent, flags, startId)
    }


    @SuppressLint("MissingPermission")
    private fun initializeService() {
        if (!hasRequestedLocationUpdate) {
            hasRequestedLocationUpdate = true
            presenter.initializeService()
        }
    }

    override fun onLocationAvailable(location: Location?, locationName: String?) {
        hasRequestedLocationUpdate = false
        AppLogger.log("on location available $locationName longitude == > ${location?.longitude} latitude ==> ${location?.latitude}")
        val intent = Intent(BroadCastIntents.ActionReceiveLocation)
        intent.putExtra(IntentKeys.LatitudeKey, location?.latitude)
        intent.putExtra(IntentKeys.LongitudeKey, location?.longitude)
        intent.putExtra(IntentKeys.LocationNameKey, locationName)
        LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent)
        onDestroy()
    }

    override fun showTurnOnGpsDialog() {
        callBack?.showTurnOnGpsDialog()
    }

    override fun onErrorGettingLocation() {
    }

    override fun onDestroy() {
        super.onDestroy()
        stopSelf()
    }
}