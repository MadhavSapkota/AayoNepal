package com.ourdevelops.ourjek.activity.logistic.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import java.io.Serializable

open class LogisticItemModel: Serializable {

    @Expose
    @SerializedName("id")
    var id: String? = null

    @Expose
    @SerializedName("icon")
    var item_icon: String? = null

    @Expose
    @SerializedName("delivery_type")
    var item_name: String? = null
}