package com.ourdevelops.ourjek.utils

import com.ourdevelops.ourjek.json.cart.cartResponse.Datum

class CartPriceUtil(val cartList: List<Datum>) {


    fun getTotalOrderPrice(): Double {
        var totalPrice = 0.0
        for (i in cartList) {
            totalPrice += if (i.statusPromo == "1") {
                (i.hargaPromo.toDouble() * i.quantity.toDouble())
            } else {
                (i.hargaItem.toDouble() * i.quantity.toDouble())
            }
            AppLogger.log("$totalPrice")
        }
        return totalPrice
    }

    fun getTotalServiceCharge(): Double {
        var totalServiceCharge = 0.0
        if (cartList.isNotEmpty()) {
            val totalPrice = getTotalOrderPrice()
            val serviceChargePercent = cartList[0].serviceCharge.toInt()
            totalServiceCharge = ((serviceChargePercent * totalPrice) / 100).toDouble()
        }
        return totalServiceCharge
    }

    fun getTotalVat(): Double {
        return if (cartList.isNotEmpty()) {
            val totalPrice = getTotalOrderPrice()
            val serviceChargePrice = getTotalServiceCharge()
            val principle = totalPrice + serviceChargePrice
            val vatPercent = cartList[0].vat.toInt()
            ((vatPercent * principle) / 100).toDouble()
        } else {
            0.0
        }
    }

    fun calculateTotalPrice(): Double {
        val totalOrder = getTotalOrderPrice()
        val totalServiceCharge = getTotalServiceCharge()
        val totalVat = getTotalVat()
        return totalServiceCharge + totalVat + totalOrder
    }

}