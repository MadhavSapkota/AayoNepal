package com.ourdevelops.ourjek.json.ride_request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.models.User

class UserModel {
    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("fullName")
    @Expose
    var fullName: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("telephone")
    @Expose
    var telephone: String? = null

    @SerializedName("phone")
    @Expose
    var phone: String? = null

    @SerializedName("created_on")
    @Expose
    var createdOn: String? = null

    @SerializedName("dateOfBirth")
    @Expose
    var dateOfBirth: String? = null

    @SerializedName("rating")
    @Expose
    var rating: String? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("token")
    @Expose
    var token: String? = null

    @SerializedName("photo")
    @Expose
    var photo: String? = null

    @SerializedName("countrycode")
    @Expose
    var countrycode: String? = null


    fun initFromDb(obj: User) {
        this.id = obj.id
        this.fullName = obj.fullnama
        this.email = obj.email
        this.telephone = obj.noTelepon
        this.phone = obj.phone
        this.createdOn = obj.createdOn
        this.dateOfBirth = obj.tglLahir
        this.rating = obj.ratingPelanggan
        this.status = obj.status
        this.token = obj.token
        this.photo = obj.fotopelanggan
    }
}