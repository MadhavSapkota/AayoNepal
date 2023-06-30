package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.content.Intent
import android.view.View
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.VerticalViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.VerticalListModel
import java.util.*

class VerticalView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = VerticalViewBinding.bind(itemView)
    private val mContext = itemView.context

    fun setUpView(data: VerticalListModel) {
        binding.nama.text = data.nama_merchant
        if (data.foto_merchant!!.isEmpty()) {
            Glide.with(mContext)
                .load(data.foto_merchant)
                .into(binding.image)
        }

        binding.kategori.text = data.category_merchant

        if (data.status_promo == "1") {
            binding.promobadge.visibility = View.VISIBLE
        } else {
            binding.promobadge.visibility = View.GONE
        }

        val parsedJamBuka: Array<String> = data.jam_buka!!.split(":").toTypedArray()
        val parsedJamTutup: Array<String> = data.jam_tutup!!.split(":").toTypedArray()

        val jamBuka = parsedJamBuka[0].toInt()
        val menitBuka = parsedJamBuka[1].toInt()
        val jamTutup = parsedJamTutup[0].toInt()
        val menitTutup = parsedJamTutup[1].toInt()

        val totalMenitBuka = jamBuka * 60 + menitBuka
        val totalMenitTutup = jamTutup * 60 + menitTutup

        val now = Calendar.getInstance()
        val totalMenitNow = now[Calendar.HOUR_OF_DAY] * 60 + now[Calendar.MINUTE]
        binding.alamat.text = data.alamat_merchant
        val km: Float = data.distance!!.toFloat()
        val format = String.format(Locale.US, "%.1f", km)
        binding.distance.text = data.alamat_merchant + " | " + format + "kms"

        if (totalMenitNow in totalMenitBuka..totalMenitTutup) {
            binding.restaurantStatus.text = "Open"
            binding.restaurantStatus.setTextColor("#219653".toColorInt())
        } else {
            binding.restaurantStatus.text = "Closed"
            binding.restaurantStatus.setTextColor("#EB5757".toColorInt())
        }

        binding.restDesc.text = data.category_merchant

        binding.llHomeRestaurant.setOnClickListener {
            val intent = Intent(mContext, NewDetailMerchantActivity::class.java)
            intent.putExtra(IntentKeys.merchantId, data.id_merchant)
            intent.putExtra(IntentKeys.latitude, data.latitude_merchant)
            intent.putExtra(IntentKeys.longitude, data.longitude_merchant)
            intent.putExtra(IntentKeys.id, data.id_merchant)
            intent.putExtra(IntentKeys.filter, "21")
            mContext.startActivity(intent)
        }
    }


}