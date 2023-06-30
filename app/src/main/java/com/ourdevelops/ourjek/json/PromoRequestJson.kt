package com.ourdevelops.ourjek.json

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Pagodalabs
 */
class PromoRequestJson {
    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("fitur")
    @Expose
    var fitur: String? = null

    @SerializedName("id_pelanggan")
    @Expose
    var id_pelanggan: String? = null

    @SerializedName("id_merchant")
    @Expose
    var id_merchant: String? = null
}