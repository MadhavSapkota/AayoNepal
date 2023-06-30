package com.ourdevelops.ourjek.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable
import java.util.*

/**
 * Created by Pagodalabs
 */
open class TransaksiSendModel : RealmObject(), Serializable {
    @PrimaryKey
    @Expose
    @SerializedName("id")
    var id: String? = null

    @Expose
    @SerializedName("id_pelanggan")
    var idPelanggan: String? = null

    @Expose
    @SerializedName("id_driver")
    var idDriver: String? = null

    @Expose
    @SerializedName("order_fitur")
    var orderFitur: String? = null

    @Expose
    @SerializedName("start_latitude")
    var startLatitude = 0.0

    @Expose
    @SerializedName("start_longitude")
    var startLongitude = 0.0

    @Expose
    @SerializedName("end_latitude")
    var endLatitude = 0.0

    @Expose
    @SerializedName("end_longitude")
    var endLongitude = 0.0

    @Expose
    @SerializedName("jarak")
    var jarak = 0.0

    @Expose
    @SerializedName("harga")
    var harga: Long = 0

    @Expose
    @SerializedName("waktu_order")
    var waktuOrder: Date? = null

    @Expose
    @SerializedName("waktu_selesai")
    var waktuSelesai: Date? = null

    @Expose
    @SerializedName("alamat_asal")
    var alamatAsal: String? = null

    @Expose
    @SerializedName("alamat_tujuan")
    var alamatTujuan: String? = null

    @Expose
    @SerializedName("kode_promo")
    var kodePromo: String? = null

    @Expose
    @SerializedName("kredit_promo")
    var kreditPromo: String? = null

    @Expose
    @SerializedName("pakai_wallet")
    var isPakaiWallet = false

    @Expose
    @SerializedName("rate")
    var rate: String? = null

    @Expose
    @SerializedName("status")
    var status = 0

    @Expose
    @SerializedName("estimasi_time")
    var estimasi: String? = null

    @Expose
    @SerializedName("nama_pengirim")
    var namaPengirim: String? = null

    @Expose
    @SerializedName("telepon_pengirim")
    var teleponPengirim: String? = null

    @Expose
    @SerializedName("nama_penerima")
    var namaPenerima: String? = null

    @Expose
    @SerializedName("telepon_penerima")
    var teleponPenerima: String? = null

    @Expose
    @SerializedName("nama_barang")
    var namaBarang: String? = null

    @Expose
    @SerializedName("number_of_loaders")
    var number_of_loaders: String? = null

    @Expose
    @SerializedName("delivery_type")
    var delivery_type: String? = null

    @Expose
    @SerializedName("estimated_weight")
    var estimated_weight: String? = null

    @Expose
    @SerializedName("isRental")
    var isRental: Boolean? = null

    @Expose
    @SerializedName("remarks")
    var remarks: String? = null
}