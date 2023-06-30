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
open class AllTransaksiModel : RealmObject(), Serializable {
    @PrimaryKey
    @Expose
    @SerializedName("id")
    var id: String? = null

    @Expose
    @SerializedName("id_pelanggan")
    var idPelanggan: String? = null

    @Expose
    @SerializedName("id_transaksi")
    var idTransaksi: String? = null
        set(idTransaksi) {
            id = idTransaksi
        }

    @Expose
    @SerializedName("id_driver")
    var idDriver: String? = null

    @Expose
    @SerializedName("order_fitur")
    var orderFitur: String? = null

    @Expose
    @SerializedName("total_biaya")
    var totalbiaya: String? = null

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

    @JvmField
    @Expose
    @SerializedName("status")
    var status = 0

    @Expose
    @SerializedName("icon")
    var icon: String? = null

    @Expose
    @SerializedName("fitur")
    var fitur: String? = null

    @Expose
    @SerializedName("id_fitur")
    var id_fitur: String? = null

    @Expose
    @SerializedName("biaya_akhir")
    var biayaakhir: String? = null

    @Expose
    @SerializedName("status_transaksi")
    var statustransaksi: String? = null

    @Expose
    @SerializedName("after_discount")
    var after_discount: String? = null

    @Expose
    @SerializedName("item_category")
    var delivery_type : String? = null

    @Expose
    @SerializedName("sender_name")
    var sender_name : String? = null

    @Expose
    @SerializedName("sender_number")
    var sender_number : String? = null

    @Expose
    @SerializedName("receiver_name")
    var receiver_name : String? = null

    @Expose
    @SerializedName("receiver_number")
    var receiver_number : String? = null

    @Expose
    @SerializedName("total_price")
    var total_price : String? = null
}