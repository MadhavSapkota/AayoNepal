package com.ourdevelops.ourjek.activity.logistic.holders

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel
import com.ourdevelops.ourjek.databinding.WeightSpinnerBinding

class WeightCustomAdapter(val context: Context, val mList: ArrayList<LogisticWeightModel>) : BaseAdapter() {

    override fun getCount(): Int {
        return mList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(i: Int, p1: View?, p2: ViewGroup?): View {
        val binding = WeightSpinnerBinding.inflate(LayoutInflater.from(context))
        binding.price.text = "Rs. ${mList[i].price}"
        binding.weight.text = mList[i].weight
        return binding.root
    }
}