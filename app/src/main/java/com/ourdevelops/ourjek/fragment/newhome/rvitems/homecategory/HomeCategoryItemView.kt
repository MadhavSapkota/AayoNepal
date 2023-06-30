package com.ourdevelops.ourjek.fragment.newhome.rvitems.homecategory

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.databinding.RowHomeCategoryItemviewBinding
import com.ourdevelops.ourjek.models.VehicleModel

class HomeCategoryItemView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowHomeCategoryItemviewBinding.bind(itemView)

    fun setupViews(obj : VehicleModel) {
        binding.tvItem.text = obj.vehicle_category_name.capitalize()
        Glide.with(itemView.context)
                .load(obj.icon)
                .into(binding.image)
    }
}