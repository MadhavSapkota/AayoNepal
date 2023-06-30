package com.ourdevelops.ourjek.fragment.newhome.rvitems.specialoffers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.models.BeritaModel

class SpecialOffesAdapter(var mlist: ArrayList<BeritaModel>) : RecyclerView.Adapter<SpecialOfferItemView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecialOfferItemView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_special_offer_itemview, parent, false)
        return SpecialOfferItemView(view)
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    override fun onBindViewHolder(holder: SpecialOfferItemView, position: Int) {
        holder.setupViews(mlist[position])
    }
}