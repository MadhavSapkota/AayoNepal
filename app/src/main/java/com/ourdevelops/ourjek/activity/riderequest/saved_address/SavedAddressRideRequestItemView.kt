package com.ourdevelops.ourjek.activity.riderequest.saved_address

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.RowSavedAddressRideRequestBinding
import com.ourdevelops.ourjek.json.SavedAddressObj

class SavedAddressRideRequestItemView(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val binding = RowSavedAddressRideRequestBinding.bind(itemView)

    fun setupViews(obj : SavedAddressObj) {
        when(obj.id_address_type.toInt()) {
            1 -> {
                binding.image.setImageResource(R.drawable.ic_home)
                setAddressText(obj.address_type_name.capitalize(), obj.address_name)
            }
            2 -> {
                binding.image.setImageResource(R.drawable.ic_work)
                setAddressText(obj.address_type_name.capitalize(), obj.address_name)
            }
            3 -> {
                binding.image.setImageResource(R.drawable.ic_university)
                setAddressText(obj.address_type_name.capitalize(), obj.address_name)
            }
            else -> {
                binding.image.setImageResource(R.drawable.ic_star)
                setAddressText(obj.address_title.capitalize(), obj.address_name)
            }
        }

    }

    private fun setAddressText(addressType : String, addressName : String) {
        val title = "$addressType - $addressName"
        binding.tvSavedAddressName.text = title
    }
}