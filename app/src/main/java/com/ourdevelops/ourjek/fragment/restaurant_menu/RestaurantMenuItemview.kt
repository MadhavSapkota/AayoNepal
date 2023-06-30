package com.ourdevelops.ourjek.fragment.restaurant_menu

import android.graphics.Paint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.RowRestaurantMenuItemBinding
import com.ourdevelops.ourjek.models.ItemModel
import com.ourdevelops.ourjek.utils.Utility

class RestaurantMenuItemview(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowRestaurantMenuItemBinding.bind(itemView)
    fun setupViews(itemModel: ItemModel, itemId: String?) {
        binding.tvItem.text = itemModel.nama_item
        binding.tvItemDetail.text = itemModel.deskripsi_item
        if (itemModel.status_promo == "1") {
            binding.imgPromo.visibility = View.VISIBLE
            binding.tvObseletePrice.visibility = View.VISIBLE
            Utility.currencyTXT(binding.tvObseletePrice, itemModel.harga_item, itemView.context)
            Utility.currencyTXT(binding.tvItemPrice, itemModel.harga_promo, itemView.context)
            binding.tvObseletePrice.showStrikeThrough(true)
        } else {
            Utility.currencyTXT(binding.tvItemPrice, itemModel.harga_item, itemView.context)
            binding.imgPromo.visibility = View.GONE
        }

        if(itemModel.id_item.toString() == itemId){
            binding.item.setBackgroundColor(itemView.context.resources.getColor(R.color.graybackground))
        }

    }

    fun TextView.showStrikeThrough(show: Boolean) {
        paintFlags =
                if (show) paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                else paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
    }

}