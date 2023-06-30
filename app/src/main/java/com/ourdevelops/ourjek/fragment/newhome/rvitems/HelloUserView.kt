package com.ourdevelops.ourjek.fragment.newhome.rvitems

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.databinding.RowHelloUserBinding

class HelloUserView(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val binding = RowHelloUserBinding.bind(itemView)

    fun setupViews(){
        val user = BaseApp.getInstance(itemView.context).loginUser
        val splitter = user.fullnama.split(" ")
        if (splitter.isNotEmpty()) {
            binding.tvHelloUser.text = "Hello ${splitter[0]},"
        }
        else {
            binding.tvHelloUser.text = "Hello User"
        }
    }

}