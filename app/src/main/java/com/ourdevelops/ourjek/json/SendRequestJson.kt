package com.ourdevelops.ourjek.json

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.models.KodePromoModel
import java.io.Serializable

/**
 * Created by Pagodalabs
 */
class SendRequestJson : Serializable {
    @Expose
    @SerializedName("id_pelanggan")
    var idPelanggan: String? = null

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
    @SerializedName("alamat_asal")
    var alamatAsal: String? = null

    @Expose
    @SerializedName("alamat_tujuan")
    var alamatTujuan: String? = null

    @Expose
    @SerializedName("pakai_wallet")
    var isPakaiMpay = 0

    @Expose
    @SerializedName("kredit_promo")
    var kreditpromo: String? = null

    @Expose
    @SerializedName("estimasi")
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

    fun setPakaiWallet(pakaiMpay: Int) {
        isPakaiMpay = pakaiMpay
    }

    @Expose
    @SerializedName("chosen_weight")
    var chosenEstimatedWeight: String? = null

    @Expose
    @SerializedName("weight_price")
    var estimatedWeightPrice: String? = null

    @Expose
    @SerializedName("remarks")
    var remarks: String? = null

    @Expose
    @SerializedName("number_of_loaders")
    var selectedNumberOfLoaders: Int? = null

    @Expose
    @SerializedName("delivery_date_time")
    var deliveryDateTime: String? = null

    @Expose
    @SerializedName("delivery_fee")
    var deliveryFee: String? = null

    @Expose
    @SerializedName("delivery_type_id")
    var deliveryId: String? = null

    @Expose
    @SerializedName("weight_fee")
    var weightFee: String? = null

    @Expose
    @SerializedName("loader_fee")
    var loaderFee: String? = null

    @Expose
    @SerializedName("total")
    var total: Double? = null

    @Expose
    @SerializedName("vehicle_category_id")
    var vehicle_category_id: Int? = null

    @Expose
    @SerializedName("payment_details")
    var paymentMethodRequestJson: PaymentMethodRequestJson? = null

    @Expose
    @SerializedName("discount_total")
    var discountTotal: String? = null

    @Expose
    @SerializedName("discount")
    var discount: String? = null

    @Expose
    @SerializedName("promo")
    var promo: KodePromoModel? = null

    @Expose
    @SerializedName("promo_status")
    var promoStatus: Boolean = false

    @Expose
    @SerializedName("isDeliveryFree")
    var isDeliveryFree: Boolean = false

    @Expose
    @SerializedName("isComplimentary")
    var isComplimentary: Boolean = false
}