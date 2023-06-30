package com.ourdevelops.ourjek.fragment.newhome.categoryfilter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.models.NewAllFeatureModel

class CategoryFilterAdapter(val mlist: ArrayList<NewAllFeatureModel>, val activity: FragmentActivity?) : RecyclerView.Adapter<CategoryFilterItemView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryFilterItemView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_category_filter_itemview, parent, false)
        return CategoryFilterItemView(view, activity)
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    override fun onBindViewHolder(holder: CategoryFilterItemView, position: Int) {
        holder.setupViews(mlist[position])
    }
}