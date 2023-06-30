package com.ourdevelops.ourjek.activity.notification

import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.databinding.NotificationViewBinding
import com.ourdevelops.ourjek.models.NewNotificationModel

class NotificationView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var binding = NotificationViewBinding.bind(itemView)
    private lateinit var newNotificationModel: NewNotificationModel

    fun setUpView(data: NewNotificationModel) {
        newNotificationModel = data
        binding.notificationHeading.text = newNotificationModel.title
        binding.notificationContext.text = newNotificationModel.message

        if (!newNotificationModel.image.isNullOrEmpty()) {
            binding.imageGrid.visibility = View.VISIBLE
            Glide.with(itemView.context).load(newNotificationModel.image).into(binding.imageGrid)
        }

        checkNotificationType()
        checkNotificationDate()
        onButtonClicks()
    }

    private fun checkNotificationDate() {
        binding.notificationDate.text = newNotificationModel.date
    }

    private fun checkNotificationType() {
        when (newNotificationModel.type) {

            "normal" -> {
                binding.notificationType.text = "General"
            }

            "promo" -> {
                binding.notificationType.text = "Promo"
            }

            "url" -> {
                binding.notificationType.text = "Link"
            }
        }
    }

    private fun onButtonClicks() {
        binding.gridItem.setOnClickListener {
            checkOnClickAction()
        }
    }

    private fun checkOnClickAction() {
        if (!newNotificationModel.id_merchant.equals("0")) {
            val i = Intent(itemView.context, NewDetailMerchantActivity::class.java)
            i.putExtra("id", newNotificationModel.id_merchant)
            i.putExtra("id_merchant", newNotificationModel.id_merchant)
            itemView.context.startActivity(i)
        }

        if (newNotificationModel.url != null) {
            itemView.context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(newNotificationModel.url)
                )
            )
        }
    }

}
