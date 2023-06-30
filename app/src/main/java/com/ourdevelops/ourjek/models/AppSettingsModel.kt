package com.ourdevelops.ourjek.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AppSettingsModel {

    @SerializedName("currency")
    @Expose
    var currency: String? = null

    @SerializedName("app_aboutus")
    @Expose
    var aboutus: String? = null

    @SerializedName("app_email")
    @Expose
    var email: String? = null

    @SerializedName("app_contact")
    @Expose
    var phone: String? = null

    @SerializedName("app_website")
    @Expose
    var website: String? = null

    @SerializedName("paypal_key")
    @Expose
    var paypalkey: String? = null

    @SerializedName("paypal_mode")
    @Expose
    var paypalmode: String? = null

    @SerializedName("paypal_active")
    @Expose
    var paypalactive: String? = null

    @SerializedName("stripe_active")
    @Expose
    var stripeactive: String? = null

    @SerializedName("currency_text")
    @Expose
    var currency_text: String? = null

    @SerializedName("payu")
    @Expose
    var payu  = PayuModel()
}