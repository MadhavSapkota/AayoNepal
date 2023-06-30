package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.GridItemViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.GridModel
import com.ourdevelops.ourjek.utils.AppLogger

class GridItemView(val itemView: View): RecyclerView.ViewHolder(itemView) {

    private val binding = GridItemViewBinding.bind(itemView)

    fun setUpView(gridModel: GridModel) {
        AppLogger.log("${gridModel.foto} --- ${gridModel.id_merchant}")
        Glide.with(itemView.context).load(gridModel.foto).into(binding.imageGrid)
        Glide.with(itemView.context).load(gridModel.foto_merchant).into(binding.iconRestaurant)
        binding.gridHeading.text = gridModel.item_name
        binding.gridCaption.text = gridModel.nama_merchant

        onButtonClick(gridModel)
    }

    private fun onButtonClick(gridModel: GridModel) {
        binding.gridItem.setOnClickListener{
            val i = Intent(itemView.context, NewDetailMerchantActivity::class.java)
            i.putExtra("id", gridModel.id_merchant)
            i.putExtra("merchant_id", gridModel.id_merchant)
            i.putExtra("item_id", gridModel.id_item)
            i.putExtra("category_id", gridModel.category_id)
            i.putExtra(IntentKeys.filter, gridModel.id_fitur)
            itemView.context.startActivity(i)
        }
    }

}