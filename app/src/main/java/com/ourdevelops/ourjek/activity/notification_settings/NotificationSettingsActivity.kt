package com.ourdevelops.ourjek.activity.notification_settings

import android.os.Bundle
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.ourdevelops.ourjek.databinding.ActivityNotificationSettingsBinding
import com.ourdevelops.ourjek.utils.PrefsManager

class NotificationSettingsActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityNotificationSettingsBinding
    private lateinit var prefsManager: PrefsManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationSettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prefsManager = PrefsManager(this)
        initializeViews()
    }

    private fun initializeViews() {
        binding.apply {
            appBarLayout.setOnClickListener { onBackPressed() }
            allNotificationSwitch.apply {
                isChecked = prefsManager.shouldGetAllNotifications()
                setOnCheckedChangeListener(this@NotificationSettingsActivity)
            }
            pushNotificationSwitch.apply {
                isChecked = prefsManager.shouldGetPushNotification()
                setOnCheckedChangeListener(this@NotificationSettingsActivity)
            }
            promotionAndOfferSwitch.apply {
                isChecked = prefsManager.shouldGetPromotionAndOffers()
                setOnCheckedChangeListener(this@NotificationSettingsActivity)
            }
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        if (buttonView == null) return
        when (buttonView.id) {
            binding.allNotificationSwitch.id -> {
                prefsManager.setShouldGetAllNotifications(isChecked)
            }
            binding.pushNotificationSwitch.id -> {
                prefsManager.setShouldGetPushNotification(isChecked)
            }
            binding.promotionAndOfferSwitch.id -> {
                prefsManager.setShouldGetPromotionAndOffers(isChecked)
            }
        }
    }
}