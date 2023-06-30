package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.databinding.ServicesViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.NewDynamicHomeContractor
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_adapters.ServicesAdapter
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.ServicesModel
import com.ourdevelops.ourjek.json.AllMerchantByNearResponseJson

class ServicesView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = ServicesViewBinding.bind(itemView)
    private lateinit var adapter: ServicesAdapter

    fun setUpView(data: ArrayList<ServicesModel>, callBack: NewDynamicHomeContractor.Presenter) {
        binding.servicesMainView.visibility = View.VISIBLE
        adapter = ServicesAdapter(data, callBack)
        binding.recyclerView.layoutManager = GridLayoutManager(itemView.context, data.size)
        binding.recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
    }

}