package com.ourdevelops.ourjek.activity.new_merchant

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.MerchantViewBinding
import com.ourdevelops.ourjek.models.MerchantNearModel
import java.util.*

class MerchantView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = MerchantViewBinding.bind(itemView)

    fun setUpView(merchantData: MerchantNearModel) {
        binding.nama.text = merchantData.nama_merchant

        if(merchantData.foto_merchant != null){
            Glide.with(itemView).load(merchantData.foto_merchant).into(binding.image)
        }

        binding.kategori.text = merchantData.category_merchant
        
        if (merchantData.status_promo == "1") {
            binding.promobadge.visibility = View.VISIBLE
        } else {
            binding.promobadge.visibility = View.GONE
        }

        val parsedJamBuka: Array<String> = merchantData.jam_buka.split(":").toTypedArray()
        val parsedJamTutup: Array<String> = merchantData.jam_tutup.split(":").toTypedArray()

        val jamBuka = parsedJamBuka[0].toInt()
        val menitBuka = parsedJamBuka[1].toInt()
        val jamTutup = parsedJamTutup[0].toInt()
        val menitTutup = parsedJamTutup[1].toInt()

        val totalMenitBuka = jamBuka * 60 + menitBuka
        val totalMenitTutup = jamTutup * 60 + menitTutup

        val now = Calendar.getInstance()
        val totalMenitNow = now[Calendar.HOUR_OF_DAY] * 60 + now[Calendar.MINUTE]
        binding.alamat.text = merchantData.alamat_merchant
        val km: Float = merchantData.distance.toFloat()
        val format = String.format(Locale.US, "%.1f", km)

        if (totalMenitNow in totalMenitBuka..totalMenitTutup) {
            binding.distance.text = format + "km" + " " + itemView.context.getString(R.string.text_with_bullet) + " " + "Open"
        } else {
            binding.distance.text = format + "km" + " " + itemView.context.getString(R.string.text_with_bullet) + " " + "Closed"
        }


    }

}