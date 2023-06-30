package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.databinding.TitleViewBinding

class TitleView(itemView: View) : RecyclerView.ViewHolder(itemView){

    private val binding = TitleViewBinding.bind(itemView)

    fun setUpView(title: String?, caption: String?){
        binding.title.text = title
        if(!caption.isNullOrEmpty()){
            binding.caption.text = caption
            binding.caption.visibility = View.VISIBLE
        }
    }

}