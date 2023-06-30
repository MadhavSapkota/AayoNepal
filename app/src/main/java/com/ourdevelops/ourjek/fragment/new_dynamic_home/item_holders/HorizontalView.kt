package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.databinding.HorizontalViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_adapters.HorizontalViewAdapter
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.HorizontalModel

class HorizontalView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = HorizontalViewBinding.bind(itemView)
    private lateinit var adapter: HorizontalViewAdapter

    fun setUpView(data: ArrayList<HorizontalModel>, title: String?, caption: String?) {
        binding.horizontalMainView.visibility = View.VISIBLE
        adapter = HorizontalViewAdapter(data)
        binding.recyclerView.layoutManager =
            LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        binding.tvSpecialOffer.text = title
        if (!caption.isNullOrEmpty()) {
            binding.tvCaption.text = caption
            binding.tvCaption.visibility = View.VISIBLE
        }
        binding.recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
        showAllClick(data)
    }

    private fun showAllClick(data: ArrayList<HorizontalModel>) {
        binding.tvShowAll.setOnClickListener {
            val i = Intent(itemView.context, NewDetailMerchantActivity::class.java)
            i.putExtra("id", data[0].idMerchant)
            i.putExtra("id_merchant", data[0].idMerchant)
            itemView.context.startActivity(i)
        }
    }
}