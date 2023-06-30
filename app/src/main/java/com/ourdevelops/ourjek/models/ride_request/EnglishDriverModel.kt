package com.ourdevelops.ourjek.models.ride_request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.json.ride_request.RideSyncBody
import com.ourdevelops.ourjek.models.DriverModel
import io.realm.annotations.PrimaryKey
import java.io.Serializable

class EnglishDriverModel : Serializable {
    @PrimaryKey
    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("driver_name")
    @Expose
    var driver_name: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("telephone")
    @Expose
    var telephone: String? = null

    @SerializedName("phone")
    @Expose
    var phone: String? = null

    @SerializedName("password")
    @Expose
    var password: String? = null

    @SerializedName("driver_address")
    @Expose
    var driver_address: String? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("birth_date")
    @Expose
    var birth_date: String? = null

    @SerializedName("rating")
    @Expose
    var rating: String? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("reg_id")
    @Expose
    var token: String? = null

    @SerializedName("photo")
    @Expose
    var photo: String? = null

    ////
    @SerializedName("id_k")
    @Expose
    var idk: String? = null

    @SerializedName("vehicle_brand")
    @Expose
    var vehicle_brand: String? = null

    @SerializedName("driver_type")
    @Expose
    var driver_type: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("vehicle_number")
    @Expose
    var vehicle_number: String? = null

    @SerializedName("vehicle_color")
    @Expose
    var vehicle_color: String? = null

    @SerializedName("countrycode")
    @Expose
    var countrycode: String? = null

    @SerializedName("balance")
    @Expose
    var balance: Long = 0

    @SerializedName("job")
    @Expose
    var job: String? = null

    fun initFromRideSync(obj : RideSyncBody) {
        this.id = obj.id_driver
        this.driver_name = obj.nama_driver
        this.email = obj.email
        this.telephone = obj.phone
        this.password = obj.password
        this.driver_address = obj.alamat_driver
        this.rating = obj.rating
        this.status = obj.status
        this.token = obj.reg_id
        this.photo = obj.foto
        this.vehicle_number = obj.vehicleNumber
        this.vehicle_color = obj.vehicleColour
        this.vehicle_brand = obj.vehicleBrand
    }

    fun initFromDriverModel(obj : DriverModel) {
        this.id = obj.id
        this.driver_name = obj.namaDriver
        this.telephone = obj.noTelepon

        this.rating = obj.rating
        this.token = obj.regId
        this.photo = obj.foto
        this.vehicle_number = obj.nomor_kendaraan
        this.vehicle_color = obj.warna
        this.vehicle_brand = obj.merek
    }
}