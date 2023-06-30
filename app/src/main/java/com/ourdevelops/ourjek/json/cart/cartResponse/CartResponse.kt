package com.ourdevelops.ourjek.json.cart.cartResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.models.DeliveryDistancePriceRangeModel
import java.io.Serializable

class CartResponse : Serializable {
    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("data")
    @Expose
    var data: List<Datum>? = null

    @SerializedName("distance_price_range")
    @Expose
    var distance_price_range: List<DeliveryDistancePriceRangeModel>? = null

    @SerializedName("service_charge")
    @Expose
    var serviceCharge: Double? = null

    @SerializedName("vat")
    @Expose
    var vat: Double? = null

    @SerializedName("grand_total")
    @Expose
    var grandTotal: Double? = null

    @SerializedName("subtotal")
    @Expose
    var sub_total: Double? = null

}