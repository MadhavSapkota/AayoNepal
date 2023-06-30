package com.ourdevelops.ourjek.json
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum
import com.ourdevelops.ourjek.models.User
import java.util.*

class LoginResponseJson {
    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("data")
    @Expose
    var data: List<User>? = null

    @SerializedName("otp")
    @Expose
    var otp: Int? = null
}

//class Datum {
//    @SerializedName("id")
//    @Expose
//    var id: String? = null
//
//    @SerializedName("fullnama")
//    @Expose
//    var fullnama: String? = null
//
//    @SerializedName("email")
//    @Expose
//    var email: String? = null
//
//    @SerializedName("no_telepon")
//    @Expose
//    var noTelepon: String? = null
//
//    @SerializedName("countrycode")
//    @Expose
//    var countrycode: String? = null
//
//    @SerializedName("phone")
//    @Expose
//    var phone: String? = null
//
//    @SerializedName("password")
//    @Expose
//    var password: String? = null
//
//    @SerializedName("created_on")
//    @Expose
//    var createdOn: String? = null
//
//    @SerializedName("tgl_lahir")
//    @Expose
//    var tglLahir: String? = null
//
//    @SerializedName("full_nama_np")
//    @Expose
//    var fullNamaNp: Any? = null
//
//    @SerializedName("no_telepon_np")
//    @Expose
//    var noTeleponNp: Any? = null
//
//    @SerializedName("countrycode_np")
//    @Expose
//    var countrycodeNp: Any? = null
//
//    @SerializedName("phone_np")
//    @Expose
//    var phoneNp: Any? = null
//
//    @SerializedName("tgl_lahir_np")
//    @Expose
//    var tglLahirNp: Any? = null
//
//    @SerializedName("rating_pelanggan")
//    @Expose
//    var ratingPelanggan: String? = null
//
//    @SerializedName("status")
//    @Expose
//    var status: String? = null
//
//    @SerializedName("token")
//    @Expose
//    var token: String? = null
//
//    @SerializedName("fotopelanggan")
//    @Expose
//    var fotopelanggan: String? = null
//
//    @SerializedName("show_noti")
//    @Expose
//    var showNoti: String? = null
//
//    @SerializedName("call_status")
//    @Expose
//    var callStatus: String? = null
//
//    @SerializedName("call_note")
//    @Expose
//    var callNote: String? = null
//
//    @SerializedName("otp")
//    @Expose
//    var otp: String? = null
//
//    @SerializedName("apple_id")
//    @Expose
//    var appleId: Any? = null
//
//    @SerializedName("saldo")
//    @Expose
//    var saldo: String? = null
//}
//
//
//
//





//class LoginResponseJson {
//    @SerializedName("code")
//    @Expose
//    var code: String? = null
//
//    @SerializedName("message")
//    @Expose
//    var message: String? = null
//
//    @SerializedName("otp")
//    @Expose
//    var otp = 0
//
//    @SerializedName("data")
//    @Expose
//    var data: List<User> = ArrayList()
//}