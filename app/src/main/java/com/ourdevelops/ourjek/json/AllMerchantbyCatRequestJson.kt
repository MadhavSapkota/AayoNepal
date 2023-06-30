package com.ourdevelops.ourjek.json

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

/**
 * Created by Pagodalabs
 */
class AllMerchantbyCatRequestJson {
    @SerializedName("latitude")
    @Expose
    var lat: String? = null

    @SerializedName("longitude")
    @Expose
    var lon: String? = null

    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("no_telepon")
    @Expose
    var phone: String? = null

    @SerializedName("fitur")
    @Expose
    var fitur_id: String? = null
}