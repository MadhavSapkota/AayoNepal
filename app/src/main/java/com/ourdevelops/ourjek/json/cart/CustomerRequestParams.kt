package com.ourdevelops.ourjek.json.cart

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CustomerRequestParams {
    @SerializedName("customer_id")
    @Expose
    var customerId: String? = null
}