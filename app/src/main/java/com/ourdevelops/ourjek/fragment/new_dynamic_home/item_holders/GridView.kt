package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.databinding.GridViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_adapters.GridViewAdapter
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.GridModel
import kotlin.collections.ArrayList

class GridView(itemView : View) : RecyclerView.ViewHolder(itemView) {

    private var binding = GridViewBinding.bind(itemView)
    private lateinit var adapter: GridViewAdapter

    @SuppressLint("NotifyDataSetChanged")
    fun setUpView(grid: ArrayList<GridModel>?, title: String?, caption: String?) {
        adapter = GridViewAdapter(grid)
        binding.rvGrid.layoutManager = GridLayoutManager(itemView.context, 2, GridLayoutManager.VERTICAL, false)
        binding.rvGrid.canScrollHorizontally(0)
        binding.gridTitle.text = title
        if(!caption.isNullOrEmpty()){
            binding.gridCaption.text = caption
            binding.gridCaption.visibility = View.VISIBLE
        }
        binding.rvGrid.adapter = adapter
        adapter.notifyDataSetChanged()
    }

}