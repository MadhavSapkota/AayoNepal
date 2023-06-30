package com.ourdevelops.ourjek.fragment.new_profile.rv_items

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.activity.ChangepassActivity
import com.ourdevelops.ourjek.activity.EditProfileActivity
import com.ourdevelops.ourjek.activity.PrivacyActivity
import com.ourdevelops.ourjek.activity.my_address.MyAddressActivity
import com.ourdevelops.ourjek.activity.notification_settings.NotificationSettingsActivity
import com.ourdevelops.ourjek.databinding.RowProfileItemBinding
import com.ourdevelops.ourjek.fragment.FavouriteActivity
import com.ourdevelops.ourjek.models.profile.ProfileObject
import com.ourdevelops.ourjek.utils.about_us.AboutUsDialog

class ProfileItemView(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowProfileItemBinding.bind(itemView)
    private lateinit var profileObject : ProfileObject

    fun setupViews(profileObject: ProfileObject) {
        this.profileObject = profileObject
        binding.tVItem.text = profileObject.title
        profileObject.image?.let { binding.imgItem.setImageResource(it) }
        binding.arrowAngleRight.visibility = if(profileObject.showArrowAtEnd) View.VISIBLE else View.GONE

        itemView.setOnClickListener {
            handleItemClicks()
        }
    }

    private fun handleItemClicks() {
        when (profileObject.title?.lowercase()) {
            "my addresses" -> {
                itemView.context.startActivity(Intent(itemView.context, MyAddressActivity::class.java))
            }

            "change password" -> {
                itemView.context.startActivity(Intent(itemView.context, ChangepassActivity::class.java))
            }

            "edit details" -> {
                itemView.context.startActivity(Intent(itemView.context, EditProfileActivity::class.java))
            }

            "about app" -> {
                AboutUsDialog(itemView.context).showAboutUs()
            }

            "privacy policy" -> {
                itemView.context.startActivity(Intent(itemView.context, PrivacyActivity::class.java))
            }

            "notifications" -> {
                itemView.context.startActivity(Intent(itemView.context, NotificationSettingsActivity::class.java))
            }

        }
    }
}