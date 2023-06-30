package com.ourdevelops.ourjek.fragment

import android.Manifest
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.location.LocationManager
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.ourdevelops.ourjek.activity.IntroActivity
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.LocationConstants
import com.ourdevelops.ourjek.databinding.FragmentEnablelocationBinding
import com.ourdevelops.ourjek.service.location_service.LocationService
import java.util.*

class EnableLocationFragment : AppCompatActivity() {
    private lateinit var binding: FragmentEnablelocationBinding
    private var sharedPreferences: SharedPreferences? = null
    private lateinit var  locationManager : LocationManager
    private lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentEnablelocationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        locationManager =  getSystemService(LOCATION_SERVICE) as LocationManager
        sharedPreferences = Objects.requireNonNull(applicationContext).getSharedPreferences(Constants.PREF_NAME, MODE_PRIVATE)
        i = checkUser()
        buttonClicks()
    }

    private fun buttonClicks() {
        binding.enableLocationBtn.setOnClickListener {
            checkLocationPermission()
        }

        binding.tvSkip.setOnClickListener {
            goToNextPage()
        }
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
            checkIfGpsEnabled()
        }

    }

    private fun checkIfGpsEnabled() {
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            startLocationService()
            goToNextPage()
        } else {
            val intent = Intent( Settings.ACTION_LOCATION_SOURCE_SETTINGS)
            startActivityForResult(intent, LocationConstants.turnOnGpsRequestCode)

        }
    }

    override fun onResume() {
        super.onResume()
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            startLocationService()
            goToNextPage()
        }
    }

    private fun startLocationService() {
        val intent = Intent(applicationContext, LocationService::class.java)
        startService(intent)
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LocationConstants.locationRequestCode) {
            if (resultCode == RESULT_OK) {
                checkIfGpsEnabled()
            }

        } else if (requestCode == LocationConstants.turnOnGpsRequestCode) {
            if (resultCode == RESULT_OK) {
                binding.enableLocationBtn.text = "CONTINUE"
            }

        }
    }

    private fun checkUser(): Intent{
        val user = BaseApp.getInstance(applicationContext).loginUser
        return if (user != null) {
            Intent(this, MainActivity::class.java)
        } else {
            Intent(this, IntroActivity::class.java)
        }
    }

    private fun goToNextPage() {
        finish()
        startActivity(i)
    }
}