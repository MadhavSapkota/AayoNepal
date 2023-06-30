package com.ourdevelops.ourjek.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel
import com.ourdevelops.ourjek.activity.logistic.data.LogisticLoaderData
import com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel
import java.io.Serializable

class NewAllFeatureModel : Serializable {

    @Expose
    @SerializedName("feature_id")
    var idFitur = 0

    @Expose
    @SerializedName("feature")
    var fitur: String? = null

    @Expose
    @SerializedName("cost")
    var biaya: Long = 0

    @Expose
    @SerializedName("minimum_cost")
    var biaya_minimum: Long = 0

    @Expose
    @SerializedName("keterangan_biaya")
    var keteranganBiaya: String? = null

    @Expose
    @SerializedName("keterangan")
    var keterangan: String? = null

    @Expose
    @SerializedName("diskon")
    var diskon: String? = null

    @Expose
    @SerializedName("biaya_akhir")
    var biayaAkhir = 0.0

    @Expose
    @SerializedName("icon")
    var icon: String? = null

    @Expose
    @SerializedName("driver_job")
    var job: String? = null

    @Expose
    @SerializedName("home")
    var home: String? = null

    @Expose
    @SerializedName("vehicle_category_id")
    var vehicle_category_id = 0

    @Expose
    @SerializedName("min_distance")
    var min_base_pay_distance: Int = 0

    @Expose
    @SerializedName("maks_distance")
    var max_distance: String? = null

    @SerializedName("distance_price_range")
    @Expose
    var distance_price_range: List<DeliveryDistancePriceRangeModel>? = null

    @Expose
    @SerializedName("delivery_type")
    var delivery_type: ArrayList<LogisticItemModel>? = null

    @Expose
    @SerializedName("weight_category")
    var estimated_weight: ArrayList<LogisticWeightModel>? = null

    @Expose
    @SerializedName("loaders_data")
    var loader_data: LogisticLoaderData? = null
}