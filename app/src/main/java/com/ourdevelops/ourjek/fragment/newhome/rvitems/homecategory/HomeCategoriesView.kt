package com.ourdevelops.ourjek.fragment.newhome.rvitems.homecategory

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.databinding.RowHomeCategoriesBinding
import com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor
import com.ourdevelops.ourjek.models.VehicleModel

class HomeCategoriesView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = RowHomeCategoriesBinding.bind(itemView)
    private lateinit var adapter: HomeCategoriesAdapter
    private val gridCount = 5

    fun setupViews(categories: ArrayList<VehicleModel>, callBack: NewHomeContractor.View) {
        adapter = HomeCategoriesAdapter(categories, callBack)
        binding.recyclerView.layoutManager = GridLayoutManager(itemView.context, gridCount)
        binding.recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
    }

}