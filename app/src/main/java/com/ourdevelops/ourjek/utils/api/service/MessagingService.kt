package com.ourdevelops.ourjek.utils.api.service

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.Bitmap
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.Vibrator
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.ProgressActivity
import com.ourdevelops.ourjek.activity.chat.ChatActivity
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.activity.notification.NewNotificationActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.json.fcm.DriverResponse
import com.ourdevelops.ourjek.models.DriverLocationData
import com.ourdevelops.ourjek.models.ride_request.FCMCustomerMessage
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.GlideImageCallBack
import com.ourdevelops.ourjek.utils.GlideImageLoader
import com.ourdevelops.ourjek.utils.PrefsManager
import org.greenrobot.eventbus.EventBus
import java.util.*

class MessagingService : FirebaseMessagingService() {
    var intent: Intent? = null
    var intentOrder: Intent? = null

    override fun onCreate() {
        super.onCreate()
        intent = Intent(BROADCAST_ACTION)
        intentOrder = Intent(BROADCAST_ORDER)
    }

    override fun onNewToken(token: String) {
        Log.d(TAG, "Refreshed token: $token")
        PrefsManager(applicationContext).fcmtoken = token
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        AppLogger.log("checker == > ${remoteMessage.data}")
        Log.e(TAG, "Notification Body: " + remoteMessage.data.toString())
        val user = BaseApp.getInstance(this).loginUser
        if (!remoteMessage.data.isNullOrEmpty() && user != null) {
            if (remoteMessage.data["type"] != "5") {
                parseAndSendMessage(remoteMessage.data)
            }
            messageHandler(remoteMessage)
        } else {
            otherHandler3(remoteMessage)
        }
    }

    private fun parseAndSendMessage(mapResponse: Map<String, String>) {
        if (mapResponse["type"] == "1") {
            val response = DriverResponse()
            response.id = mapResponse["id_driver"]
            response.idTransaksi = mapResponse["id_transaksi"]
            response.response = mapResponse["response"]
            EventBus.getDefault().postSticky(response)
        }
    }

    private fun messageHandler(remoteMessage: RemoteMessage) {
        val user = BaseApp.getInstance(this).loginUser
        if (user != null) {
            when (remoteMessage.data["type"]) {
                "1" -> {
                    orderHandler(remoteMessage)
                }

                "2" -> {
                    chat(remoteMessage)
                }

                "3" -> {
                    orderHandler(remoteMessage)
                }

                "4" -> {
                    otherHandler2(remoteMessage)
                }

                "5" -> {
                    val fcmCustomerMessage = FCMCustomerMessage(
                        remoteMessage.data["to"],
                        remoteMessage.data["type"],
                        remoteMessage.data["rideResponseType"],
                        remoteMessage.data["riderDetail"]
                    )
                    val intent = Intent(BroadCastIntents.ActionReceiverRideUpdates)
                    intent.putExtra(IntentKeys.fcmCustomerData, fcmCustomerMessage)
                    intent.putExtra(
                        IntentKeys.riderResponseType,
                        remoteMessage.data[IntentKeys.riderResponseType]
                    )
                    LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent)
                }

                "6" -> {
                    orderHandler(remoteMessage)
                }

                "7" -> {
                    AppLogger.log("${remoteMessage.data["latitude"]?.toDouble()} - ${remoteMessage.data["longitude"]?.toDouble()} - ${remoteMessage.data["bearing"]?.toDouble()} - ${remoteMessage.data["id_driver"]} - $remoteMessage")
                    LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(
                        Intent(BroadCastIntents.driverLocationReceiver).apply {
                            putExtra(
                                "driver_location",
                                DriverLocationData(
                                    remoteMessage.data["latitude"]?.toDouble(),
                                    remoteMessage.data["longitude"]?.toDouble(),
                                    remoteMessage.data["bearing"]?.toFloat(),
                                    remoteMessage.data["id_driver"]
                                )
                            )
                        })
                }
            }
        }
    }

    private fun otherHandler(remoteMessage: RemoteMessage) {
        val mBuilder = NotificationCompat.Builder(applicationContext, "notify_001")
        val intent1 = Intent(applicationContext, MainActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        val pIntent1 = PendingIntent.getActivity(
            this, System.currentTimeMillis()
                .toInt(), intent1, 0
        )
        val bigTextStyle = NotificationCompat.BigTextStyle()
        bigTextStyle.setBigContentTitle(remoteMessage.data["title"])
        bigTextStyle.bigText(remoteMessage.data["message"])
        mBuilder.setContentIntent(pIntent1)
        mBuilder.setSmallIcon(R.drawable.pick_me_transparent)
        mBuilder.setContentTitle(remoteMessage.data["title"])
        mBuilder.setContentText(remoteMessage.data["message"])
        mBuilder.setStyle(bigTextStyle)
        mBuilder.priority = Notification.PRIORITY_MAX
        mBuilder.setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "customer"
            val channel = NotificationChannel(
                channelId,
                "Channel customer",
                NotificationManager.IMPORTANCE_HIGH
            )
            Objects.requireNonNull(notificationManager).createNotificationChannel(channel)
            mBuilder.setChannelId(channelId)
        }
        Objects.requireNonNull(notificationManager).notify(0, mBuilder.build())
    }

    private fun otherHandler2(remoteMessage: RemoteMessage) {
        val mBuilder = NotificationCompat.Builder(applicationContext, "notify_001")
        val intent1 = Intent(applicationContext, NewNotificationActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        val pIntent1 = PendingIntent.getActivity(
            this, System.currentTimeMillis()
                .toInt(), intent1, 0
        )
//        val bitmap = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//            ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, Uri.parse(remoteMessage.data["imageUrl"]!!)))
//        } else {
//            MediaStore.Images.Media.getBitmap(contentResolver, Uri.parse(remoteMessage.data["imageUrl"]))
//        }
        val bigTextStyle = NotificationCompat.BigTextStyle()
        bigTextStyle.setBigContentTitle(remoteMessage.data["title"])
        bigTextStyle.bigText(remoteMessage.data["message"])
        mBuilder.setContentIntent(pIntent1)
        mBuilder.setSmallIcon(R.drawable.pick_me_transparent)
        mBuilder.setContentTitle(remoteMessage.data["title"])
        mBuilder.setContentText(remoteMessage.data["message"])
//        mBuilder.setStyle(NotificationCompat.BigPictureStyle().bigPicture(bitmap))
        mBuilder.setStyle(bigTextStyle)
        mBuilder.priority = Notification.PRIORITY_MAX
        mBuilder.setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "customer"
            val channel = NotificationChannel(
                channelId,
                "Channel customer",
                NotificationManager.IMPORTANCE_HIGH
            )
            Objects.requireNonNull(notificationManager).createNotificationChannel(channel)
            mBuilder.setChannelId(channelId)
        }
        Objects.requireNonNull(notificationManager).notify(0, mBuilder.build())
    }

    private fun otherHandler3(remoteMessage: RemoteMessage) {
        if (remoteMessage.notification?.imageUrl != null) {
            GlideImageLoader().getBitmapAsyncAndDoWork(
                remoteMessage.notification?.imageUrl.toString(),
                applicationContext,
                object : GlideImageCallBack {
                    override fun onImageReady(bmp: Bitmap?) {
                        AppLogger.log("$bmp")
                        showNotificationWithImage(remoteMessage, bmp)
                    }
                })
        } else {
            showNotificationWithImage(remoteMessage, null)
        }

    }

    private fun showNotificationWithImage(remoteMessage: RemoteMessage, bitmap: Bitmap?) {
        val intent1 = Intent(applicationContext, NewNotificationActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        val pIntent1 = PendingIntent.getActivity(
            this, System.currentTimeMillis()
                .toInt(), intent1, 0
        )
        val mBuilder = NotificationCompat.Builder(applicationContext, "notify_001")
        val bigTextStyle = NotificationCompat.BigTextStyle()
        bigTextStyle.setBigContentTitle(remoteMessage.notification?.title)
        bigTextStyle.bigText(remoteMessage.notification?.body)
        mBuilder.setContentIntent(pIntent1)
        mBuilder.setSmallIcon(R.drawable.pick_me_transparent)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            mBuilder.color = resources.getColor(R.color.white, null)
        }
//        mBuilder.setLargeIcon(bitmap)
        mBuilder.setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
        mBuilder.setContentTitle(remoteMessage.notification?.title)
        mBuilder.setContentText(remoteMessage.notification?.body)
        mBuilder.setStyle(bigTextStyle)
        mBuilder.setStyle(NotificationCompat.BigPictureStyle().bigPicture(bitmap))
        mBuilder.priority = NotificationCompat.PRIORITY_MAX
        mBuilder.setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager?
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "customer"
            val channel = NotificationChannel(
                channelId,
                "Channel customer",
                NotificationManager.IMPORTANCE_HIGH
            )
            notificationManager?.createNotificationChannel(channel)
//            Objects.requireNonNull(notificationManager).createNotificationChannel(channel)
            mBuilder.setChannelId(channelId)
        }
        notificationManager?.notify(0, mBuilder.build())
    }

    private fun orderHandler(remoteMessage: RemoteMessage) {
        val data = Bundle()
        intentToOrder(data)
        when (remoteMessage.data["response"]) {
            "5" -> {
                notificationOrderBuilderCancel(remoteMessage)
            }
            "2" -> {
                playSound1()
                notificationOrderBuilderAccept(remoteMessage)
            }
            "3" -> {
                playSound1()
                notificationOrderBuilderStart(remoteMessage)
            }
            "4" -> {
                playSound1()
                notificationOrderBuilderFinish(remoteMessage)
            }
        }
    }

    private fun intentToOrder(bundle: Bundle) {
        intentOrder!!.putExtras(bundle)
        sendBroadcast(intentOrder)
    }

    private fun notificationOrderBuilderCancel(remoteMessage: RemoteMessage) {
        val mBuilder = NotificationCompat.Builder(applicationContext, "notify_001")
        val intent1 = Intent(applicationContext, ProgressActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent1.putExtra("id_transaksi", remoteMessage.data["id_transaksi"])
        intent1.putExtra("id_driver", remoteMessage.data["id_driver"])
        intent1.putExtra("response", remoteMessage.data["response"])
        val pIntent1 = PendingIntent.getActivity(
            this, System.currentTimeMillis()
                .toInt(), intent1, 0
        )
        mBuilder.setContentIntent(pIntent1)
        mBuilder.setSmallIcon(R.drawable.pick_me_transparent)
        mBuilder.setContentTitle("Cancel")
        mBuilder.setContentText(getString(R.string.notification_cancel))
        mBuilder.priority = Notification.PRIORITY_MAX
        mBuilder.setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "customer"
            val channel = NotificationChannel(
                channelId,
                "Channel customer",
                NotificationManager.IMPORTANCE_HIGH
            )
            Objects.requireNonNull(notificationManager).createNotificationChannel(channel)
            mBuilder.setChannelId(channelId)
        }
        Objects.requireNonNull(notificationManager).notify(0, mBuilder.build())
    }

    private fun notificationOrderBuilderStart(remoteMessage: RemoteMessage) {
        val mBuilder = NotificationCompat.Builder(applicationContext, "notify_001")
        val intent1 = Intent(applicationContext, ProgressActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent1.putExtra("id_transaksi", remoteMessage.data["id_transaksi"])
        intent1.putExtra("id_driver", remoteMessage.data["id_driver"])
        intent1.putExtra("response", remoteMessage.data["response"])
        val pIntent1 = PendingIntent.getActivity(
            this, System.currentTimeMillis()
                .toInt(), intent1, 0
        )
        mBuilder.setContentIntent(pIntent1)
        mBuilder.setSmallIcon(R.drawable.pick_me_transparent)
        mBuilder.setContentTitle("Driver Start")
        mBuilder.setContentText(remoteMessage.data["desc"])
        mBuilder.priority = Notification.PRIORITY_MAX
        mBuilder.setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "customer"
            val channel = NotificationChannel(
                channelId,
                "Channel customer",
                NotificationManager.IMPORTANCE_HIGH
            )
            Objects.requireNonNull(notificationManager).createNotificationChannel(channel)
            mBuilder.setChannelId(channelId)
        }
        Objects.requireNonNull(notificationManager).notify(0, mBuilder.build())
    }

    private fun notificationOrderBuilderAccept(remoteMessage: RemoteMessage) {
        val mBuilder = NotificationCompat.Builder(applicationContext, "notify_001")
        val intent1 = Intent(applicationContext, ProgressActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent1.putExtra("id_transaksi", remoteMessage.data["id_transaksi"])
        intent1.putExtra("id_driver", remoteMessage.data["id_driver"])
        intent1.putExtra("response", remoteMessage.data["response"])
        val pIntent1 = PendingIntent.getActivity(
            this, System.currentTimeMillis()
                .toInt(), intent1, 0
        )
        mBuilder.setContentIntent(pIntent1)
        mBuilder.setSmallIcon(R.drawable.pick_me_transparent)
        mBuilder.setContentTitle("Driver Accept")
        mBuilder.setContentText(remoteMessage.data["desc"])
        mBuilder.priority = Notification.PRIORITY_MAX
        mBuilder.setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "customer"
            val channel = NotificationChannel(
                channelId,
                "Channel customer",
                NotificationManager.IMPORTANCE_HIGH
            )
            Objects.requireNonNull(notificationManager).createNotificationChannel(channel)
            mBuilder.setChannelId(channelId)
        }
        Objects.requireNonNull(notificationManager).notify(0, mBuilder.build())
    }

    private fun notificationOrderBuilderFinish(remoteMessage: RemoteMessage) {
        val mBuilder = NotificationCompat.Builder(applicationContext, "notify_001")
        val intent1 = Intent(applicationContext, ProgressActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent1.putExtra("id_transaksi", remoteMessage.data["id_transaksi"])
        intent1.putExtra("id_driver", remoteMessage.data["id_driver"])
        intent1.putExtra("complete", "true")
        intent1.putExtra("response", remoteMessage.data["response"])
        val pIntent1 = PendingIntent.getActivity(
            this, System.currentTimeMillis()
                .toInt(), intent1, 0
        )
        mBuilder.setContentIntent(pIntent1)
        mBuilder.setSmallIcon(R.drawable.pick_me_transparent)
        mBuilder.setContentTitle("Finish")
        mBuilder.setContentText(remoteMessage.data["desc"])
        mBuilder.priority = Notification.PRIORITY_MAX
        mBuilder.setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "customer"
            val channel = NotificationChannel(
                channelId,
                "Channel customer",
                NotificationManager.IMPORTANCE_HIGH
            )
            Objects.requireNonNull(notificationManager).createNotificationChannel(channel)
            mBuilder.setChannelId(channelId)
        }
        Objects.requireNonNull(notificationManager).notify(0, mBuilder.build())
    }

    private fun chat(remoteMessage: RemoteMessage) {
        val mBuilder = NotificationCompat.Builder(applicationContext, "notify_001")
        val intent1 = Intent(applicationContext, ChatActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent1.putExtra("senderid", remoteMessage.data["receiverid"])
        intent1.putExtra("receiverid", remoteMessage.data["senderid"])
        intent1.putExtra("name", remoteMessage.data["name"])
        intent1.putExtra("tokenku", remoteMessage.data["tokendriver"])
        intent1.putExtra("tokendriver", remoteMessage.data["tokenuser"])
        intent1.putExtra("pic", remoteMessage.data["pic"])
        val pIntent1 = PendingIntent.getActivity(
            this, System.currentTimeMillis()
                .toInt(), intent1, 0
        )
        val bigTextStyle = NotificationCompat.BigTextStyle()
        bigTextStyle.setBigContentTitle(remoteMessage.data["name"])
        bigTextStyle.bigText(remoteMessage.data["message"])
        mBuilder.setContentIntent(pIntent1)
        mBuilder.setSmallIcon(R.drawable.pick_me_transparent)
        mBuilder.setContentTitle(remoteMessage.data["name"])
        mBuilder.setContentText(remoteMessage.data["message"])
        mBuilder.setStyle(bigTextStyle)
        mBuilder.priority = Notification.PRIORITY_MAX
        mBuilder.setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "customer"
            val channel = NotificationChannel(
                channelId,
                "Channel customer",
                NotificationManager.IMPORTANCE_HIGH
            )
            Objects.requireNonNull(notificationManager).createNotificationChannel(channel)
            mBuilder.setChannelId(channelId)
        }
        Objects.requireNonNull(notificationManager).notify(0, mBuilder.build())
    }

    @SuppressLint("MissingPermission")
    private fun playSound1() {
        val BG = MediaPlayer.create(baseContext, R.raw.finishsound)
        BG.isLooping = false
        BG.setVolume(100f, 100f)
        BG.start()
        val v = this.getSystemService(VIBRATOR_SERVICE) as Vibrator
        Objects.requireNonNull(v).vibrate(2000)
    }

    companion object {
        private const val TAG = "MessagingService"
        const val BROADCAST_ACTION = "com.ourdevelops.ourjek"
        const val BROADCAST_ORDER = "order"
    }
}