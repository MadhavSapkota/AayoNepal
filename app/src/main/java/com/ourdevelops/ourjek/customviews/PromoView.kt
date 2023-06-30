package com.ourdevelops.ourjek.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.constants.PromoTypes
import com.ourdevelops.ourjek.databinding.PromoViewBinding
import com.ourdevelops.ourjek.models.KodePromoModel

class PromoView : LinearLayout {

    private lateinit var binding: PromoViewBinding

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.PromoView)
        binding = PromoViewBinding.inflate(LayoutInflater.from(context), this, true)

        binding.tvPromoCode.text = typedArray.getString(R.styleable.PromoView_promoCode)
        binding.tvPromoCodeTitle.text = typedArray.getString(R.styleable.PromoView_promoTitle)
        Glide.with(context).load(typedArray.getString(R.styleable.PromoView_promoImage)).into(binding.promoImage)
        "${typedArray.getString(R.styleable.PromoView_promoPercentage)}% discount - up to Rs.${typedArray.getString(R.styleable.PromoView_promoLimit)} off".also { binding.tvPromoCodeDiscountPercent.text = it }
    }

    fun setUpView(data: KodePromoModel?) {

        when(data?.promoType){

            PromoTypes.complimentary -> {
                 "Complimentary item : ${data.complimentary}".also { binding.tvPromoCodeDiscountPercent.text = it }
            }

            else -> {
                "${data?.discountPer}% discount - up to Rs.${data?.discountLimit} off".also { binding.tvPromoCodeDiscountPercent.text = it }
            }

        }

        "${data?.kodepromo} (Expires on : ${data?.expired})".also { binding.tvPromoCode.text = it }
        binding.tvPromoCodeTitle.text = data?.namapromo
        Glide.with(context).load(data?.imagepromo).into(binding.promoImage)
    }
}