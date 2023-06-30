package com.ourdevelops.ourjek.fragment.promo

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.PromoTypes
import com.ourdevelops.ourjek.databinding.ItemPromoBinding
import com.ourdevelops.ourjek.models.KodePromoModel
import com.ourdevelops.ourjek.utils.PicassoTrustAll

class PromoCodeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = ItemPromoBinding.bind(itemView)
    private lateinit var singleItem: KodePromoModel
    private lateinit var callBack: PromoCodeUseInretface

    fun setUpViews(
        data: KodePromoModel,
        isLastPosition: Boolean,
        position: Int,
        price: String,
        callback: PromoCodeUseInretface
    ) {
        callBack = callback
        singleItem = data
        "${singleItem.discountPer}% discount - up to Rs.${singleItem.discountLimit} off".also { binding.nama.text = it }
        "${singleItem.kodepromo}  (Expires on: ${singleItem.expired})".also { binding.kodepromo.text = it }
        binding.tvDiscountPercent.text = singleItem.namapromo

        if (!singleItem.imagepromo.isNullOrEmpty()) {
            PicassoTrustAll.getInstance(itemView.context)
                .load(singleItem.imagepromo)
                .resize(250, 250)
                .into(binding.image)
        }

        if (isLastPosition) {
            binding.margin.visibility = View.GONE
        }

        onButtonClick(position, price)
    }

    private fun onButtonClick(position: Int, price: String) {
        itemView.setOnClickListener {
            calculate(position, price)
        }
    }

    fun calculate(position: Int, price: String) {
        val total = price.toDouble()
        var priceAfterDiscount = price.toDouble()
        var discountAmount = (singleItem.discountPer!!.toDouble() * total/100)
        var discountLimit = singleItem.discountLimit!!.toDouble()

        when(singleItem.promoType){
            PromoTypes.percent -> {
                if(discountLimit <= discountAmount){
                    priceAfterDiscount -= discountLimit
                    discountAmount = discountLimit
                }else{
                    priceAfterDiscount -= discountAmount
                }
                callBack.changeTotal(position, priceAfterDiscount*100, discountAmount*100, total)
            }

            PromoTypes.fix -> {
                priceAfterDiscount -= discountLimit
                discountAmount = discountLimit
                callBack.changeTotal(position, priceAfterDiscount*100, discountAmount*100, total)
            }

            PromoTypes.complimentary -> {
                callBack.onComplimentaryApplied(position, priceAfterDiscount*100, discountAmount*100, total)
            }


            PromoTypes.free_delivery -> {
                callBack.onFreeDeliveryApplied(position, total)
            }
        }
    }
}