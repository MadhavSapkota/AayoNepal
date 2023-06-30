package com.ourdevelops.ourjek.activity.logistic.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import java.io.Serializable

open class LogisticWeightModel : Serializable{

    @Expose
    @SerializedName("weight_range")
    var weight: String? = null

    @Expose
    @SerializedName("price")
    var price: String? = null
}