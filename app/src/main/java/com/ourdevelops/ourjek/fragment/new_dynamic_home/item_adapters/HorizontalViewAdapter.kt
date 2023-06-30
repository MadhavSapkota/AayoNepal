package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders.HorizontalItemView
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.HorizontalModel

class HorizontalViewAdapter(val data: ArrayList<HorizontalModel>) : RecyclerView.Adapter<HorizontalItemView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalItemView {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.horizontal_item_view, parent, false)
        return HorizontalItemView(view)
    }

    override fun onBindViewHolder(holder: HorizontalItemView, position: Int) {
        holder.setupViews(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}