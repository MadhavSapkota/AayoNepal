package com.ourdevelops.ourjek.utils.internetconnectionchooser

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.os.Build
import android.provider.Settings

class InternetConnectionChooser(val activity: Activity) {

    fun init() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            try {
                val panelIntent = Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY)
                activity.startActivityForResult(panelIntent, 0)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        } else {
            // for previous android version
            val wifiManager = activity.getApplicationContext().getSystemService(Context.WIFI_SERVICE) as WifiManager
            wifiManager.isWifiEnabled = true
        }
    }
}