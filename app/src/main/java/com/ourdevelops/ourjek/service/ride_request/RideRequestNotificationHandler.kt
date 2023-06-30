package com.ourdevelops.ourjek.service.ride_request

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.core.app.NotificationCompat
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.constants.AppRideStatus
import com.ourdevelops.ourjek.utils.AppLogger

class RideRequestNotificationHandler(val context: Context, val view: RideRequestService) {
    private val searchingNotificationId = 5
    private val cancelNotificationId = 619
    private var notificationManager: NotificationManager? = null

    fun showNotification() {
        val notificationTitle = "Searching for rider"
        val notificationBody = "Please wait.."

        val channelId = "rideSearch"
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        val pendingIntent = PendingIntent.getActivity(context, searchingNotificationId, intent, 0)

        buildNotification(
            channelId,
            notificationTitle,
            notificationBody,
            pendingIntent,
            searchingNotificationId, true
        )
    }

    fun showRiderNotFoundNotification() {
        val notificationTitle = "Rider not found"
        val notificationBody = "Please try again."

        val channelId = "notFoundRider"
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        val pendingIntent = PendingIntent.getActivity(context, searchingNotificationId, intent, 0)

        buildNotification(
            channelId,
            notificationTitle,
            notificationBody,
            pendingIntent,
            cancelNotificationId,
            false
        )
    }

    fun showRideCanceledNotification() {
        val notificationTitle = "Ride Canceled.."
        val notificationBody = "Ride has been canceled.."

        val channelId = "rideCanceled"
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        val pendingIntent = PendingIntent.getActivity(context, searchingNotificationId, intent, 0)

        buildNotification(
            channelId,
            notificationTitle,
            notificationBody,
            pendingIntent,
            cancelNotificationId,
            false
        )
    }

    fun showRiderFoundNotification() {
        val notificationTitle = "Rider Found"
        val notificationBody = "${AppRideStatus.availableRider?.driver_name}"

        val channelId = "foundRider"
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        val pendingIntent = PendingIntent.getActivity(context, searchingNotificationId, intent, 0)

        buildNotification(
            channelId,
            notificationTitle,
            notificationBody,
            pendingIntent,
            searchingNotificationId,
            true
        )
    }

    fun showRideFinishedNotification() {
        val notificationTitle = "Ride Finished"
        val notificationBody = "Your ride has been completed.."

        val channelId = "rideFinished"
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        val pendingIntent = PendingIntent.getActivity(context, searchingNotificationId, intent, 0)

        buildNotification(
            channelId,
            notificationTitle,
            notificationBody,
            pendingIntent,
            cancelNotificationId,
            false
        )
    }

    private fun buildNotification(
        channelId: String,
        notificationTitle: String,
        notificationBody: String,
        pendingIntent: PendingIntent,
        notificationId: Int,
        ongoing: Boolean
    ) {
        notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            var mChannel = notificationManager?.getNotificationChannel(channelId)
            if (mChannel == null) {
                mChannel =
                    NotificationChannel(
                        channelId,
                        "Rider Search",
                        NotificationManager.IMPORTANCE_HIGH
                    )
                mChannel.enableVibration(true)
                mChannel.lightColor = Color.GREEN
                mChannel.lockscreenVisibility = NotificationCompat.VISIBILITY_PUBLIC
                notificationManager?.createNotificationChannel(mChannel)
            }
        }

        val builder = NotificationCompat.Builder(context, channelId)
        builder.setContentTitle(notificationTitle)
            .setSmallIcon(R.drawable.ic_search)
            .setOngoing(ongoing)
            .setContentText(notificationBody)  // required
            .setDefaults(Notification.DEFAULT_ALL)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .setTicker(notificationBody)
            .setFullScreenIntent(pendingIntent, true)
        val notification = builder.build()
        if(notificationId == searchingNotificationId){
            AppLogger.log("$searchingNotificationId -> notification id")
            view.startServiceFromNotification(notificationId, builder.build())
        }
        notificationManager?.notify(notificationId, notification)
    }

    fun cancelNotification() {
        notificationManager?.cancel(searchingNotificationId)
    }

}