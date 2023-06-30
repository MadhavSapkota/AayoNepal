package com.ourdevelops.ourjek.models.home

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.models.*
import java.util.*
import kotlin.collections.ArrayList

class HomeResponse {

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("saldo")
    @Expose
    var saldo: String? = null

    @SerializedName("currency")
    @Expose
    var currency: String? = null

    @SerializedName("currency_text")
    @Expose
    var currency_text: String? = null

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

    @SerializedName("stripe_active")
    @Expose
    var stripeactive: String? = null

    @SerializedName("paypal_key")
    @Expose
    var paypalkey: String? = null

    @SerializedName("paypal_mode")
    @Expose
    var paypalmode: String? = null

    @SerializedName("paypal_active")
    @Expose
    var paypalactive: String? = null

    @SerializedName("vehicle_category")
    @Expose
    var vehicle_category: ArrayList<VehicleModel> = ArrayList()

    @SerializedName("fitur")
    @Expose
    var fitur: ArrayList<FiturModel> = ArrayList()

    @SerializedName("allfitur")
    @Expose
    var allfitur: ArrayList<AllFiturModel> = ArrayList()

    @SerializedName("ratinghome")
    @Expose
    var rating: ArrayList<RatingModel> = ArrayList()

    @SerializedName("beritahome")
    @Expose
    var berita: ArrayList<BeritaModel> = ArrayList()

    @SerializedName("slider")
    @Expose
    var slider: ArrayList<PromoModel> = ArrayList()

    @SerializedName("data")
    @Expose
    var data: ArrayList<User> = ArrayList()

    @SerializedName("merchantpromo")
    @Expose
    var merchantpromo: ArrayList<MerchantModel> = ArrayList()

    @SerializedName("merchantnearby")
    @Expose
    var merchantnear: ArrayList<MerchantNearModel> = ArrayList()

    @SerializedName("kategorymerchanthome")
    @Expose
    var catmerchant: ArrayList<CatMerchantModel> = ArrayList()

    @SerializedName("payu")
    @Expose
    var payu: ArrayList<PayuModel> = ArrayList()

}