package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.databinding.SearchViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.SearchModel

class SearchView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = SearchViewBinding.bind(itemView)

    fun setUpView(data: SearchModel){
        binding.searchText.text = data.title
    }

}