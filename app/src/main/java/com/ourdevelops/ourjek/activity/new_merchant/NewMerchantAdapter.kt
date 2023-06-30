package com.ourdevelops.ourjek.activity.new_merchant

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.models.MerchantNearModel

class NewMerchantAdapter(private val merchantData: ArrayList<MerchantNearModel>, val context: Context, val view: NewMerchantContractor.View) : RecyclerView.Adapter<MerchantView>(), NewMerchantContractor.Adapter {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MerchantView {
        return MerchantView(LayoutInflater.from(parent.context).inflate(R.layout.merchant_view, parent, false))
    }

    override fun onBindViewHolder(holder: MerchantView, position: Int) {
        val mainData = merchantData[position]
        holder.setUpView(mainData)

        holder.itemView.setOnClickListener{
            view.goToMerchantDetail(mainData)
        }
    }

    override fun getItemCount(): Int {
        return merchantData.size
    }
}