package com.ourdevelops.ourjek.activity.logistic.loader_fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.logistic.holders.LoaderView

class LogisticLoaderAdapter : RecyclerView.Adapter<LoaderView>() {
    private var loaderSize = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoaderView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.logistic_loader_view, parent, false)
        return LoaderView(view)
    }

    override fun onBindViewHolder(holder: LoaderView, position: Int) {

    }

    override fun getItemCount(): Int {
        return loaderSize
    }

    fun setLoaderSize(size: Int){
        loaderSize = size
    }
}