package com.ourdevelops.ourjek.activity.save_address.address_types

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.RowAddressTypeBinding
import com.ourdevelops.ourjek.models.save_address.AddressTypeModel

class AddressTypeItemVIew(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowAddressTypeBinding.bind(itemView)

    fun setupViews(obj: AddressTypeModel) {
        obj.image?.let { binding.image.setImageResource(it) }
        binding.tvTitle.text = obj.title

        if (obj.isSelected) {
            binding.image.setBackgroundResource(R.drawable.circle_selected)
            binding.image.setColorFilter(ContextCompat.getColor(itemView.context, R.color.white))
        } else {
            binding.image.setBackgroundResource(R.drawable.circle_bg)
            binding.image.setColorFilter(ContextCompat.getColor(itemView.context, R.color.black))
        }
    }


}