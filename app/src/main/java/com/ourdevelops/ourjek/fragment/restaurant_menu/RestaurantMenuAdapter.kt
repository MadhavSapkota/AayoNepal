package com.ourdevelops.ourjek.fragment.restaurant_menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.models.ItemModel

class RestaurantMenuAdapter(
    val mlist: List<ItemModel>,
    val pView: RestaurantMenuContractor.View,
    val itemId: String?
) : RecyclerView.Adapter<RestaurantMenuItemview>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantMenuItemview {
        return RestaurantMenuItemview(LayoutInflater.from(parent.context).inflate(R.layout.row_restaurant_menu_item, parent, false))
    }

    override fun onBindViewHolder(holder: RestaurantMenuItemview, position: Int) {
        holder.setupViews(mlist[position], itemId)
        holder.itemView.setOnClickListener {
            pView.onItemClicked(position)
        }
        if(mlist[position].id_item.toString() == itemId){
            pView.onItemClicked(position)
            pView.onItemFound(position)
        }
    }

    override fun getItemCount(): Int {
        return mlist.size
    }
}