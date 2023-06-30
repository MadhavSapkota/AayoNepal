package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders.GridItemView
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.GridModel
import com.ourdevelops.ourjek.utils.AppLogger
import kotlin.collections.ArrayList

class GridViewAdapter(val grid: ArrayList<GridModel>?) : RecyclerView.Adapter<GridItemView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridItemView {
        AppLogger.log("grid layout - ${grid?.get(0)?.id_merchant}")
        return GridItemView(LayoutInflater.from(parent.context).inflate(R.layout.grid_item_view, parent, false))
    }

    override fun onBindViewHolder(holder: GridItemView, position: Int) {
        holder.setUpView(grid!![position])
    }

    override fun getItemCount(): Int {
        return grid!!.size
    }
}