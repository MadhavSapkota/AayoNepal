package com.ourdevelops.ourjek.constants

import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.databinding.library.BuildConfig

@JvmOverloads
fun Activity.showShortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

@JvmOverloads
fun Activity.showLongToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

@JvmOverloads
fun Activity.logDebug(message: String) {
    if (BuildConfig.DEBUG) {
        Log.d("app logger == > ", message)
    }
}