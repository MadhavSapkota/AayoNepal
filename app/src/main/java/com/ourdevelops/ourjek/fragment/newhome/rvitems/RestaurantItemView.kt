package com.ourdevelops.ourjek.fragment.newhome.rvitems

import android.content.Intent
import android.util.Log
import android.view.View
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.RowHomeRestaurantItemBinding
import com.ourdevelops.ourjek.models.MerchantNearModel
import java.util.*

class RestaurantItemView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowHomeRestaurantItemBinding.bind(itemView)
    val mContext = itemView.context

    fun setupViews(singleItem: MerchantNearModel) {
        binding.nama.text = singleItem.nama_merchant
        if (!singleItem.foto_merchant.isEmpty()) {
            Glide.with(mContext)
                    .load(singleItem.foto_merchant)
                    .into(binding.image)
        }

        binding.kategori.text = singleItem.category_merchant

        if (singleItem.status_promo == "1") {
            binding.promobadge.visibility = View.VISIBLE
        } else {
            binding.promobadge.visibility = View.GONE
        }

        val parsedJamBuka: Array<String> = singleItem.jam_buka.split(":").toTypedArray()
        val parsedJamTutup: Array<String> = singleItem.jam_tutup.split(":").toTypedArray()

        val jamBuka = parsedJamBuka[0].toInt()
        val menitBuka = parsedJamBuka[1].toInt()
        val jamTutup = parsedJamTutup[0].toInt()
        val menitTutup = parsedJamTutup[1].toInt()

        val totalMenitBuka = jamBuka * 60 + menitBuka
        val totalMenitTutup = jamTutup * 60 + menitTutup

        val now = Calendar.getInstance()
        val totalMenitNow = now[Calendar.HOUR_OF_DAY] * 60 + now[Calendar.MINUTE]
        binding.alamat.text = singleItem.alamat_merchant
        val km: Float = singleItem.distance.toFloat()
        val format = String.format(Locale.US, "%.1f", km)
        binding.distance.text = singleItem.alamat_merchant + " | " + format + "kms"

        if (totalMenitNow in totalMenitBuka..totalMenitTutup) {
            binding.restaurantStatus.text = "Open"
            binding.restaurantStatus.setTextColor("#219653".toColorInt())
        } else {
            binding.restaurantStatus.text = "Closed"
            binding.restaurantStatus.setTextColor("#EB5757".toColorInt())
        }

        binding.restDesc.text = singleItem.category_merchant

        binding.llHomeRestaurant.setOnClickListener {
            val intent = Intent(mContext, NewDetailMerchantActivity::class.java)
            intent.putExtra(IntentKeys.merchantId, singleItem.id_merchant)
            intent.putExtra(IntentKeys.latitude, singleItem.latitude_merchant)
            intent.putExtra(IntentKeys.longitude, singleItem.longitude_merchant)
            intent.putExtra(IntentKeys.id, singleItem.id_merchant)
            intent.putExtra(IntentKeys.filter, "21")
            mContext.startActivity(intent)
        }
    }
}