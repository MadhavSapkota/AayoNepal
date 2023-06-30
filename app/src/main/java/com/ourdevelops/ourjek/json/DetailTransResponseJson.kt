package com.ourdevelops.ourjek.json

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.models.DriverModel
import com.ourdevelops.ourjek.models.ItemPesananModel
import com.ourdevelops.ourjek.models.KodePromoModel
import com.ourdevelops.ourjek.models.TransaksiModel
import java.util.*

/**
 * Created by Pagodalabs
 */
class DetailTransResponseJson {
    @Expose
    @SerializedName("data")
    var data: List<TransaksiModel> = ArrayList()

    @Expose
    @SerializedName("driver")
    var driver: List<DriverModel> = ArrayList()

    @Expose
    @SerializedName("item")
    val item: List<ItemPesananModel> = ArrayList()

    @Expose
    @SerializedName("promo")
    val promo: KodePromoModel? = null
}