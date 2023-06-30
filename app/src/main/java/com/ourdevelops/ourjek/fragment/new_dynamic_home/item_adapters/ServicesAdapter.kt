package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.fragment.new_dynamic_home.NewDynamicHomeContractor
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders.ServicesItemView
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.ServicesModel

class ServicesAdapter(
    val data: ArrayList<ServicesModel>,
    val callBack: NewDynamicHomeContractor.Presenter
) : RecyclerView.Adapter<ServicesItemView>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicesItemView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.services_item_view, parent, false)
        return ServicesItemView(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ServicesItemView, position: Int) {
        holder.setupViews(data[position])

        holder.itemView.setOnClickListener {
            callBack.onVehicleCategorySelected(data[position])
        }
    }
}