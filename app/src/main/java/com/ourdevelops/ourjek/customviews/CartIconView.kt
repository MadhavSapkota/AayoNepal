package com.ourdevelops.ourjek.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import com.ourdevelops.ourjek.databinding.ViewCartIconBinding
import com.ourdevelops.ourjek.models.PesananMerchant
import io.realm.Realm

class CartIconView : RelativeLayout {
    lateinit var binding: ViewCartIconBinding

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    private fun init(context: Context) {
        binding = ViewCartIconBinding.inflate(LayoutInflater.from(context), this, true)
        checkCart()
    }

    fun checkCart() {
        if (calculateItemsInDb()) {
            binding.imgIndicator.visibility = View.VISIBLE
        } else {
            binding.imgIndicator.visibility = View.GONE
        }
    }


    private fun calculateItemsInDb(): Boolean {
        val realm = Realm.getDefaultInstance()
        val items = realm.copyFromRealm(realm.where(PesananMerchant::class.java).findAll())
        return items.size > 0
    }


}