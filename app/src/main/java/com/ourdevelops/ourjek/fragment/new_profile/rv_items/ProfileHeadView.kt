package com.ourdevelops.ourjek.fragment.new_profile.rv_items

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.databinding.RowProfileHeadBinding

class ProfileHeadView(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowProfileHeadBinding.bind(itemView)

    @SuppressLint("CheckResult")
    fun setupViews() {
        binding.tvFullName.text = BaseApp.loginUser.fullnama
        val subTitle = "${BaseApp.loginUser.email}\n${BaseApp.loginUser.phone}"
        binding.tvEmail.text = subTitle

        val imageUrl = "${Constants.IMAGESUSER}${BaseApp.loginUser.fotopelanggan}"

        Glide.with(itemView.context)
            .load(imageUrl)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_unknown_user))
            .into(binding.imageUser)
    }
}