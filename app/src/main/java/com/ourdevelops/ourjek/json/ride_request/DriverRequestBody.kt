package com.ourdevelops.ourjek.json.ride_request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DriverRequestBody: Serializable {
    @SerializedName("tripDetails")
    @Expose
    var tripDetails = TripDetailsModel()

    @SerializedName("customerDetails")
    @Expose
    var customerDetails = UserModel()

    @SerializedName("initiateTime")
    @Expose
    var initiateTime : Long = 0

    @SerializedName("expireTime")
    @Expose
    var expireTime : Long = 0

    @SerializedName("rideResponseType")
    @Expose
    var rideResponseType : String = ""

    @SerializedName("type")
    @Expose
    var type : Int = 5
}
