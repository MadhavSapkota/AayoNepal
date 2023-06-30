package com.ourdevelops.ourjek.utils

import android.app.Activity
import android.content.Context
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.InstallState
import com.google.android.play.core.install.InstallStateUpdatedListener
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.InstallStatus
import com.google.android.play.core.install.model.UpdateAvailability
import com.ourdevelops.ourjek.customviews.dialogs.DownloadingDialog

class AppUpdateChecker(val context : Context, val callBack: AppUpdateCallback,
                       val activity: Activity) : InstallStateUpdatedListener {

    private var appUpdateManager = AppUpdateManagerFactory.create(context)
    private var hasShownProgressDialog = false
    private var appSizeToDownload : Long = 0
    private var dialog: DownloadingDialog? = null

    companion object {
        const val requestAppUpdate = 499
    }

    fun init() {
        val appUpdateInfoTask = appUpdateManager.appUpdateInfo

        appUpdateInfoTask.addOnSuccessListener {
            if (it.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE) {

                if (it.isUpdateTypeAllowed(AppUpdateType.FLEXIBLE)) {
                    appUpdateManager.registerListener(this)
                    appUpdateManager.startUpdateFlowForResult(
                            it,
                            AppUpdateType.FLEXIBLE,
                            activity,
                            requestAppUpdate
                    )
                } else if (it.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)) {
                    appUpdateManager.registerListener(this)
                    appUpdateManager.startUpdateFlowForResult(
                            it,
                            AppUpdateType.IMMEDIATE,
                            activity,
                            requestAppUpdate
                    )
                }

            } else {
                callBack.onNoUpdateAvailable()
            }
        }

    }

    fun onAppUpdated() {
        appUpdateManager.completeUpdate()
    }

    override fun onStateUpdate(state: InstallState) {
        AppLogger.log("installing status == > ${state.installStatus()}")
        when (state.installStatus()) {
            InstallStatus.DOWNLOADED -> {
                dialog?.closeDialog()
                onAppUpdated()
            }
            InstallStatus.DOWNLOADING -> {
                if (!hasShownProgressDialog) {
                    hasShownProgressDialog = true
                    appSizeToDownload = state.totalBytesToDownload()
                    dialog = DownloadingDialog(activity)
                    dialog?.showDialog("Please wait!", "Updating Pick Me")
                } else {
                    val completedPercent = getPercentageCompleted(state.bytesDownloaded())
                    dialog?.updateDialog("${completedPercent}%")
                }
            }
            else -> {

            }

        }

    }

    fun getPercentageCompleted(completedVal: Long): String {
        val percentage = (completedVal.toDouble() / appSizeToDownload.toDouble()) * 100
        return "${percentage.toInt()}"
    }
}

interface AppUpdateCallback {

    fun onNoUpdateAvailable()
}