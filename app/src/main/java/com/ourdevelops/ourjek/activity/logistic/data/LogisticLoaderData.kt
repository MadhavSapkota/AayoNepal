package com.ourdevelops.ourjek.activity.logistic.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import java.io.Serializable

open class LogisticLoaderData: Serializable {

    @Expose
    @SerializedName("max_loader_number")
    var max_loader_number: String? = null

    @Expose
    @SerializedName("price_per_person")
    var price_per_person: String? = null
}