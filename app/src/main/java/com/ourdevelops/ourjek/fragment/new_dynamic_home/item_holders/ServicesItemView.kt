package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.databinding.ServicesItemViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.ServicesModel

class ServicesItemView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = ServicesItemViewBinding.bind(itemView)

    fun setupViews(servicesModel: ServicesModel) {
        binding.tvItem.text = servicesModel.vehicle_category_name?.uppercase()
        Glide.with(itemView.context)
            .load(servicesModel.icon)
            .into(binding.image)
    }


}