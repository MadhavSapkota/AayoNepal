package com.ourdevelops.ourjek.fragment.newhome.rvitems.homecategory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor
import com.ourdevelops.ourjek.models.VehicleModel

class HomeCategoriesAdapter(val mlist: ArrayList<VehicleModel>, val callBack: NewHomeContractor.View) : RecyclerView.Adapter<HomeCategoryItemView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCategoryItemView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_home_category_itemview, parent, false)
        return HomeCategoryItemView(view)
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    override fun onBindViewHolder(holder: HomeCategoryItemView, position: Int) {
        holder.setupViews(mlist[position])
//        if (position % 2 == 0) {
//            holder.binding.image.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.apricot))
//        }
//        else {
//            holder.binding.image.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.vistaBlue))
//        }
        holder.itemView.setOnClickListener {
            callBack.onVehicleCategorySelected(mlist[position])
        }
    }
}