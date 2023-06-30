package com.ourdevelops.ourjek.service.customer_status_service

import android.app.ActivityManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.os.PowerManager
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.constants.VibrationPatterns
import com.ourdevelops.ourjek.models.User
import com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData
import com.ourdevelops.ourjek.utils.AppLogger

class CustomerStatusNotificationHandler(
    var presenter: CustomerStatusServiceContractor.Presenter,
    var view: CustomerStatusServiceContractor.View,
    var context: Context,
    var loginUser: User
) : CustomerStatusServiceContractor.Handler {
    private lateinit var serviceChannel: NotificationChannel
    private lateinit var manager: NotificationManager
    private lateinit var notification: NotificationCompat.Builder
    private val CHANNEL_ID = "CustomerStatusServiceChannel"
    private val NOTIFICATION_ID = 1
    private val REQUEST_CODE = 1265
    private val GROUP = "Customer_Status"
    private val myProcess = ActivityManager.RunningAppProcessInfo()

    override fun createNotification() {
        createNotificationChannel()
        val notificationIntent = Intent(context, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(context,
            REQUEST_CODE, notificationIntent, 0)

        notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle("You are online")
            .setContentText("Welcome, ${loginUser.fullnama}")
            .apply {
                priority = NotificationCompat.PRIORITY_MAX
            }
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .setAutoCancel(false)
            .setOngoing(true)
            .setStyle(NotificationCompat.BigTextStyle().setBigContentTitle("You are online").bigText("Welcome, ${loginUser.fullnama}"))
            .setSmallIcon(R.drawable.pick_me_transparent)
            .setContentIntent(pendingIntent)
            .setGroup(GROUP)
        manager.notify(NOTIFICATION_ID, notification.build())
        view.onFirstNotificationCreated(NOTIFICATION_ID, notification.build())
    }

    override fun createNewCancelableNotification(data: CustomerStatusServiceData) {
        val pendingIntent = PendingIntent.getActivity(context,
            REQUEST_CODE, data.notificationIntent, 0)
        notification.apply {
            setAutoCancel(true)
            setOngoing(false)
            setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            priority = NotificationCompat.PRIORITY_MAX
            setContentText(data.notificationBigBody)
            setContentTitle(data.notificationTitle)
            setSmallIcon(data.notificationIcon!!)
            setContentIntent(pendingIntent)
            setStyle(NotificationCompat.BigTextStyle().setBigContentTitle(data.notificationBigTitle).bigText(data.notificationBigBody))
        }
        manager.notify(data.notificationId!!, notification.build())
    }

    override fun createNewNotification(data: CustomerStatusServiceData) {
        val pendingIntent = PendingIntent.getActivity(context,
            REQUEST_CODE, data.notificationIntent, 0)
        notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle(data.notificationTitle)
            .setContentText(data.notificationBody)
            .setPriority(NotificationCompat.PRIORITY_MAX)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .setAutoCancel(false)
            .setOngoing(true)
            .setStyle(NotificationCompat.BigTextStyle().setBigContentTitle(data.notificationBigTitle).bigText(data.notificationBigBody))
            .setSmallIcon(data.notificationIcon!!)
            .setContentIntent(pendingIntent)
            .setDefaults(NotificationCompat.DEFAULT_ALL)
            .setGroup(GROUP)
        manager.notify(NOTIFICATION_ID, notification.build())
    }

    override fun updateNotification(data: CustomerStatusServiceData) {
        val pendingIntent = PendingIntent.getActivity(context,
            REQUEST_CODE, data.notificationIntent, 0)
        notification.apply {
            setContentText(data.notificationBigBody)
            setContentTitle(data.notificationTitle)
            setSmallIcon(data.notificationIcon!!)
            setContentIntent(pendingIntent)
            setDefaults(0)
            setStyle(NotificationCompat.BigTextStyle().setBigContentTitle(data.notificationBigTitle).bigText(data.notificationBigBody))
        }
        manager.notify(data.notificationId!!, notification.build())
    }

    override fun dismissNotification() {
        manager.cancel(NOTIFICATION_ID)
    }

    override fun updateNotificationForRideOrder(data: CustomerStatusServiceData) {
        createRideNotificationChannel()
        val pendingIntent = PendingIntent.getActivity(context,
            REQUEST_CODE, data.notificationIntent, 0)
        notification = NotificationCompat.Builder(context, "RideRequestChannel").apply {
            setContentText(data.notificationBigBody)
            setAutoCancel(false)
            setOngoing(true)
            setContentTitle(data.notificationTitle)
            setSmallIcon(data.notificationIcon!!)
            setContentIntent(pendingIntent)
            setGroup(GROUP)
            setFullScreenIntent(pendingIntent, true)
            setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE))
            setVibrate(VibrationPatterns.getIncomingCallVibrationPattern().toLongArray())
            setStyle(NotificationCompat.BigTextStyle().setBigContentTitle(data.notificationBigTitle).bigText(data.notificationBigBody))
        }
        manager.notify(data.notificationId!!, notification.build())
    }

    override fun setUpInitialData() {
        updateNotification(CustomerStatusServiceData().apply {
            notificationId = 1
            notificationBigBody = "Welcome, ${loginUser.fullnama}"
            notificationBigTitle = "You are online.."
            notificationBody = "Welcome, ${loginUser.fullnama}"
            notificationTitle = "You are online.."
            notificationIcon = R.drawable.pick_me_transparent
            notificationIntent = Intent(context, MainActivity::class.java)
        })
    }

    override fun checkSettings(mainData: CustomerStatusServiceData) {
        AppLogger.log("check settings")
        val pm = context.getSystemService(Context.POWER_SERVICE) as PowerManager
        val isScreenOn = pm.isScreenOn

        if (!isScreenOn) {
            AppLogger.log("check settings is screen on")
            val wl = pm.newWakeLock(
                PowerManager.FULL_WAKE_LOCK or PowerManager.ACQUIRE_CAUSES_WAKEUP or PowerManager.ON_AFTER_RELEASE,
                "pickme:MyLock"
            )
            wl.acquire(10000)
            val wlCpu = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "pickme:MyCpuLock")
            wlCpu.acquire(10000)
            checkResponseTypeForNotification(RideResponseType.acknowledge.name, mainData)
        } else if (myProcess.importance != ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND) {
            AppLogger.log("check settings is in foreground")
            checkResponseTypeForNotification(RideResponseType.acknowledge.name, mainData)
        } else {
            AppLogger.log("check settings else everything")
            checkResponseTypeForAlert(RideResponseType.acknowledge.name, mainData)
            checkResponseTypeForNotification(RideResponseType.acknowledge.name, mainData)
        }
    }

    private fun checkResponseTypeForNotification(type: String, mainData: CustomerStatusServiceData) {
        AppLogger.log("check response type for notification acknowledge")
        when(type){
            RideResponseType.acknowledge.name -> {
                updateNotificationForRideOrder(mainData)
            }
        }
    }

    private fun checkResponseTypeForAlert(type: String, mainData: CustomerStatusServiceData) {
        AppLogger.log("check response type for alert acknowledge")
        when(type){
            RideResponseType.acknowledge.name -> {
                goToRideNotification(mainData)
            }
        }
    }

    private fun goToRideNotification(mainData: CustomerStatusServiceData) {
        AppLogger.log("go to ride notification")
        val intent = mainData.notificationIntent
        intent?.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            serviceChannel = NotificationChannel(
                CHANNEL_ID,
                "Customer Status Service Channel",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                lockscreenVisibility = NotificationCompat.VISIBILITY_PRIVATE
            }
            manager = context.getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(serviceChannel)
        }else{
            manager = context.getSystemService(FirebaseMessagingService.NOTIFICATION_SERVICE) as NotificationManager

        }
    }

    private fun createRideNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            serviceChannel = NotificationChannel(
                "RideRequestChannel",
                "Customer Status Service Channel",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                lockscreenVisibility = NotificationCompat.VISIBILITY_PRIVATE
                vibrationPattern = VibrationPatterns.getIncomingCallVibrationPattern().toLongArray()
            }
            manager = context.getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(serviceChannel)
        }else{
            manager = context.getSystemService(FirebaseMessagingService.NOTIFICATION_SERVICE) as NotificationManager

        }
    }
}