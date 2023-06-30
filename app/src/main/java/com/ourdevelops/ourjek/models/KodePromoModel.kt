package com.ourdevelops.ourjek.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class KodePromoModel : Serializable {
    @Expose
    @SerializedName("nama_promo")
    var namapromo: String? = null

    @Expose
    @SerializedName("kode_promo")
    var kodepromo: String? = null

    @Expose
    @SerializedName("expired")
    var expired: String? = null

    @Expose
    @SerializedName("complimentary")
    val complimentary: String? = null

    @Expose
    @SerializedName("image_promo")
    var imagepromo: String? = null

    @Expose
    @SerializedName("fitur")
    var fitur: String? = null

    @Expose
    @SerializedName("nominal_promo")
    var discountPer: String? = null

    @Expose
    @SerializedName("promo_type")
    var promoType: String? = null

    @Expose
    @SerializedName("discount_limit")
    var discountLimit: String? = null
}