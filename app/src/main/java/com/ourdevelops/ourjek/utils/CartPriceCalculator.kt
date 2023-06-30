package com.ourdevelops.ourjek.utils

import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum

class CartPriceCalculator() {

    fun getTotalOrderPrice(cartList: List<Datum>): Int {
        var totalPrice = 0
        for (i in cartList) {
            totalPrice += if (i.statusPromo == "1") {
                (i.hargaPromo.toInt() * i.quantity.toInt())
            } else {
                (i.hargaItem.toInt() * i.quantity.toInt())
            }
        }
        return totalPrice
    }

    fun getTotalServiceCharge(cartList: List<Datum>): Double {
        var totalServiceCharge = 0.0
        if (cartList.isNotEmpty()) {
            val totalPrice = getTotalOrderPrice(cartList)
            val serviceChargePercent = cartList[0].serviceCharge.toInt()
            totalServiceCharge = ((serviceChargePercent * totalPrice) / 100).toDouble()
        }
        return totalServiceCharge
    }

    fun getTotalVat(cartList: List<Datum>): Double {
        return if (cartList.isNotEmpty()) {
            val totalPrice = getTotalOrderPrice(cartList)
            val serviceChargePercent = cartList[0].vat.toInt()
            ((serviceChargePercent * totalPrice) / 100).toDouble()
        } else {
            0.0
        }
    }

    fun calculateTotalPrice(cartList: List<Datum>, cartData: CartResponse, delivery_charge: Int): Int {
        val totalOrder = getTotalOrderPrice(cartList)
        var totalServiceCost = cartData.vat?.toInt()!! + cartData.serviceCharge?.toInt()!! + totalOrder + delivery_charge
        return totalServiceCost
    }
}

