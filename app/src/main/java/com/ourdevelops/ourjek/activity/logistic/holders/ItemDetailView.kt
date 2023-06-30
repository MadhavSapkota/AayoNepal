package com.ourdevelops.ourjek.activity.logistic.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.databinding.LogisticItemDetailViewBinding
import com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel
import com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel
import com.ourdevelops.ourjek.activity.logistic.item_detail.LogisticItemDetailContractor
import com.ourdevelops.ourjek.utils.AppLogger

class ItemDetailView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var binding = LogisticItemDetailViewBinding.bind(itemView)

    fun setUpViews(data: LogisticItemModel, weightList: ArrayList<LogisticWeightModel>, view: LogisticItemDetailContractor.View){
        binding.itemCardName.text = data.item_name

        if(!data.item_icon.isNullOrEmpty()){
            Glide.with(itemView.context).load(data.item_icon).into(binding.imgItemCard)
        }
    }

    fun onHolderClick(weightList: ArrayList<LogisticWeightModel>, view: LogisticItemDetailContractor.View, holderPosition: Int) {
        AppLogger.log("logistic detail click")
        binding.itemCard.setOnClickListener{
            LogisticDropDownDialog.showDialog(itemView.context, weightList, object : LogisticDropDownDialog.DialogButtonClick{
                override fun onConfirm(position: Int) {
                    view.onWeightSelected(position, holderPosition)
                }
            })
        }
    }
}