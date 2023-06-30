package com.ourdevelops.ourjek.json.cart

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AddtoCartRequest {
    @SerializedName("merchant_id")
    @Expose
    var merchantId: String? = null

    @SerializedName("customer_id")
    @Expose
    var customerId: String? = null

    @SerializedName("item_id")
    @Expose
    var itemId: String? = null

    @SerializedName("quantity")
    @Expose
    var quantity: String? = null

    @SerializedName("item_price")
    @Expose
    var itemPrice: String? = null

    @SerializedName("notes")
    @Expose
    var notes: String? = null

    @SerializedName("id_fitur")
    @Expose
    var id_fitur: String? = null
}