package com.ourdevelops.ourjek.activity

import android.Manifest
import android.app.Activity
import android.app.NotificationManager
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.location.LocationManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.ourdevelops.ourjek.BuildConfig
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.LocationConstants
import com.ourdevelops.ourjek.fragment.EnableLocationFragment
import com.ourdevelops.ourjek.service.location_service.LocationService
import com.ourdevelops.ourjek.utils.*
import java.util.*

class SplashActivity : AppCompatActivity(), AppUpdateCallback {
    private var sharedPreferences: SharedPreferences? = null
    private var languageManager: LanguageManager? = null
    private lateinit var appUpdateChecker: AppUpdateChecker


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)
        AppLogger.log("this is my fcm ${PrefsManager(applicationContext).fcmtoken}")
        languageManager = LanguageManager(this@SplashActivity)
        languageManager!!.language = PrefsManager(applicationContext).languageValue
        removeNotif()
        sharedPreferences = getSharedPreferences(Constants.PREF_NAME, MODE_PRIVATE)
        appUpdateChecker = AppUpdateChecker(this.applicationContext, this, this)
        val handler = Handler(Looper.getMainLooper())
        val runnable = Runnable {
            if (BuildConfig.DEBUG) {
                onNoUpdateAvailable()
            }
            else {
                appUpdateChecker.init()
            }
        }
        handler.postDelayed(runnable, 1500)

    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LocationConstants.locationRequestCode) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startLocationService()
                nextPageConditions()
            } else {
                nextPageConditions()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == AppUpdateChecker.requestAppUpdate) {
            when (resultCode) {
                Activity.RESULT_OK -> {

                }
                Activity.RESULT_CANCELED -> {
                    onNoUpdateAvailable()
                }
                else -> {
                    appUpdateChecker.init()
                }
            }
        }
    }

    private fun checkLocationEnabled() {
        val locationManager = getSystemService(LOCATION_SERVICE) as LocationManager
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            enableLocation()
        }
    }

    private fun nextPageConditions() {
        val user = BaseApp.getInstance(this).loginUser
        if (user != null) {
            checkLocationEnabled()
        } else {
            val intent = Intent(this@SplashActivity, IntroActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun enableLocation() {
        startActivity(Intent(applicationContext, EnableLocationFragment::class.java))
    }

    private fun checkLocationPermission() {
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
            ), LocationConstants.locationRequestCode)

        } else {
            startLocationService()
            nextPageConditions()
        }

    }

    private fun startLocationService() {
        val intent = Intent(applicationContext, LocationService::class.java)
        startService(intent)
    }

    private fun removeNotif() {
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        Objects.requireNonNull(notificationManager).cancel(0)
    }

    override fun onNoUpdateAvailable() {
        checkLocationPermission()
    }
}