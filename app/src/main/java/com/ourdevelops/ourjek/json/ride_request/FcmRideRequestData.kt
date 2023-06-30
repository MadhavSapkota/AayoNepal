package com.ourdevelops.ourjek.json.ride_request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class FcmRideRequestData {

    @Expose
    @SerializedName("registration_ids")
    private val to: ArrayList<String>? = null

    @Expose
    @SerializedName("data")
    private val data: DriverRequestBody? = null

}