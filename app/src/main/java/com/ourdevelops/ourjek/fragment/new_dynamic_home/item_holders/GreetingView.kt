package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.databinding.GreetingViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.GreetingModel

class GreetingView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = GreetingViewBinding.bind(itemView)

    fun setupViews(data: GreetingModel){
        "${data.title} ${BaseApp.loginUser.fullnama}".also { binding.tvTitle.text = it }
        binding.tvCaption.text = data.caption
    }
}