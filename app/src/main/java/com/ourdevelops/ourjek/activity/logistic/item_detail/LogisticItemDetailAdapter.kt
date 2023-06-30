package com.ourdevelops.ourjek.activity.logistic.item_detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.logistic.holders.ItemDetailView
import com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel
import com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel

class LogisticItemDetailAdapter(val mList: ArrayList<LogisticItemModel>, private val weightList: ArrayList<LogisticWeightModel>, val view: LogisticItemDetailContractor.View) : RecyclerView.Adapter<ItemDetailView>(), LogisticItemDetailContractor.Adapter {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDetailView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.logistic_item_detail_view, parent, false)
        return ItemDetailView(view)
    }

    override fun onBindViewHolder(holder: ItemDetailView, position: Int) {
        holder.setUpViews(mList[position], weightList, view)
        holder.onHolderClick(weightList, view, position)
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}