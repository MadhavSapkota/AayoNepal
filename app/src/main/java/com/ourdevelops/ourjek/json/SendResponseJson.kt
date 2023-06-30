package com.ourdevelops.ourjek.json

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.models.TransaksiSendModel
import java.util.ArrayList

/**
 * Created by Pagodalabs on 10/19/2019.
 */
class SendResponseJson {
    @Expose
    @SerializedName("message")
    var message: String? = null

    @Expose
    @SerializedName("transactionId")
    var transactionId: String? = null

    @Expose
    @SerializedName("data")
    var data: List<TransaksiSendModel> = ArrayList()
}