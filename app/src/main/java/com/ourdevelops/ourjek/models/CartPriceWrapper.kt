package com.ourdevelops.ourjek.models

import com.ourdevelops.ourjek.json.cart.cartResponse.Datum
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.CartPriceUtil
import java.io.Serializable

class CartPriceWrapper : Serializable {
    var totalPrice : Double = 0.0
    var totalVat : Double = 0.0
    var totalServiceCharge : Double = 0.0
    var orderPrice : Double = 0.0
    var deliveryCharge : Double = 0.0
    var discountTotal : Double = 0.0

    fun setCartValues(cartItemsList: MutableList<Datum>) {
        val priceUtil = CartPriceUtil(cartItemsList)
        totalVat = priceUtil.getTotalVat()
        totalServiceCharge = priceUtil.getTotalServiceCharge()
        orderPrice = priceUtil.getTotalOrderPrice()
        totalPrice = priceUtil.calculateTotalPrice()
    }
}