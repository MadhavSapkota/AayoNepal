package com.ourdevelops.ourjek.fragment.promo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.models.KodePromoModel

class PromoCodeAdapter(
    val dataList: List<KodePromoModel>,
    val mContext: Context?,
    val rowLayout: Int,
    val price: String,
    private val callback: PromoCodeUseInretface
) : RecyclerView.Adapter<PromoCodeHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromoCodeHolder {
        val v = LayoutInflater.from(parent.context).inflate(rowLayout, parent, false)
        return PromoCodeHolder(v)
    }

    override fun onBindViewHolder(holder: PromoCodeHolder, position: Int) {
        holder.setUpViews(dataList[position], (position == dataList.size - 1), position, price, callback)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}