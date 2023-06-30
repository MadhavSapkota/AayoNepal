package com.ourdevelops.ourjek.models.ride_request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.constants.BaseApp
import java.io.Serializable

class FCMCustomerMessage() : Serializable {
    @SerializedName("to")
    @Expose
    var to: String? = null


    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null


    @SerializedName("riderResponseType")
    @Expose
    var riderResponseType: String? = null


    @SerializedName("riderDetail")
    @Expose
    var riderDetail: EnglishDriverModel? = null


    constructor(
        id: String?,
        type: String?,
        rideResponseType: String?,
        riderDetail: String?
    ) : this() {
        this.id = id
        this.type = type
        this.riderResponseType = rideResponseType
        this.riderDetail = BaseApp.gson.fromJson(riderDetail, EnglishDriverModel::class.java)
    }
}