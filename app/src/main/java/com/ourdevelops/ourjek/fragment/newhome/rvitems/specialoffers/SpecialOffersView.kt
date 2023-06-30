package com.ourdevelops.ourjek.fragment.newhome.rvitems.specialoffers

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.activity.AllBeritaActivity
import com.ourdevelops.ourjek.databinding.RowSpecialOffersBinding
import com.ourdevelops.ourjek.models.BeritaModel

class SpecialOffersView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = RowSpecialOffersBinding.bind(itemView)
    private lateinit var adapter: SpecialOffesAdapter

    fun setupViews(arrayList: ArrayList<BeritaModel>) {
        binding.recyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        adapter = SpecialOffesAdapter(arrayList)
        binding.recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
        showAllClick()
    }

    private fun showAllClick() {
        binding.tvShowAll.setOnClickListener {
            val i = Intent(itemView.context, AllBeritaActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            itemView.context.startActivity(i)
        }
    }
}