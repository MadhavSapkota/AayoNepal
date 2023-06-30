package com.ourdevelops.ourjek.json

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.ourdevelops.ourjek.models.MerchantNearModel
import com.ourdevelops.ourjek.models.CatMerchantModel
import java.util.ArrayList

/**
 * Created by Pagodalabs
 */
class AllMerchantByNearResponseJson {
    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("allmerchantnearby")
    @Expose
    var data: ArrayList<MerchantNearModel>? = null

    @SerializedName("kategorymerchant")
    @Expose
    var kategori: List<CatMerchantModel>? = null
}