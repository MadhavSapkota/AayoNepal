package com.ourdevelops.ourjek.fragment.promo

interface PromoCodeUseInretface {
    fun changeTotal(position: Int, discountTotal: Double, discount: Double, grandTotal: Double)
    fun onComplimentaryApplied(position: Int, discountTotal: Double, discount: Double, total: Double)
    fun onFreeDeliveryApplied(position: Int, total: Double)
}