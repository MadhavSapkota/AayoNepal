package com.ourdevelops.ourjek.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import java.io.Serializable
import java.util.*

/**
 * Created by Pagodalabs
 */
open class TransaksiModel : RealmObject(), Serializable {
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
    var status: String? = null

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
    @SerializedName("biaya_akhir")
    var biaya_akhir: String? = null

    @Expose
    @SerializedName("total_biaya")
    var total_biaya: String? = null

    @Expose
    @SerializedName("nama_merchant")
    var nama_merchant: String? = null

    @Expose
    @SerializedName("token_merchant")
    var token_merchant: String? = null

    @Expose
    @SerializedName("id_trans_merchant")
    var idtransmerchant: String? = null

    @Expose
    @SerializedName("vat_amount")
    var vat: String? = null

    @Expose
    @SerializedName("service_charge_amount")
    var service_charge: String? = null

    @Expose
    @SerializedName("discount")
    var discount: String? = null

    @Expose
    @SerializedName("discount_total")
    var discount_total: String? = null

    @Expose
    @SerializedName("grand_total")
    var grand_total: String? = null

    @Expose
    @SerializedName("item_category")
    var delivery_type : String? = null

    @Expose
    @SerializedName("sender_name")
    var sender_name : String? = null

    @Expose
    @SerializedName("sender_phone")
    var sender_number : String? = null

    @Expose
    @SerializedName("receiver_name")
    var receiver_name : String? = null

    @Expose
    @SerializedName("receiver_phone")
    var receiver_number : String? = null

    @Expose
    @SerializedName("total_price")
    var total_price : String? = null

    @Expose
    @SerializedName("promo_code")
    var promo_code : String? = null

}