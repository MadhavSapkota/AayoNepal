package com.ourdevelops.ourjek.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel
import com.ourdevelops.ourjek.activity.logistic.data.LogisticLoaderData
import com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable

/**
 * Created by Pagodalabs
 */
open class AllFiturModel : Serializable, RealmObject() {
    @PrimaryKey
    @Expose
    @SerializedName("id_fitur")
    var idFitur = 0

    @Expose
    @SerializedName("fitur")
    var fitur: String? = null

    @Expose
    @SerializedName("biaya")
    var biaya: Long = 0

    @Expose
    @SerializedName("biaya_minimum")
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
}