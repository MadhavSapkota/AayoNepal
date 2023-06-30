package com.ourdevelops.ourjek.utils

import android.util.Log
import com.ourdevelops.ourjek.BuildConfig

object AppLogger {

    const val TAG = "app logger == > "

    fun log(message : String?) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, "$message")
        }
    }

}