package com.ourdevelops.ourjek.json.ride_request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.models.TransaksiModel

class TripDetailsModel {

    @Expose
    @SerializedName("id")
    var id: String? = null

    @Expose
    @SerializedName("customerId")
    var customerId: String? = null

    @Expose
    @SerializedName("idDriver")
    var idDriver: String? = null

    @Expose
    @SerializedName("orderFeature")
    var orderFeature: String? = null

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
    @SerializedName("distance")
    var distance = 0.0

    @Expose
    @SerializedName("price")
    var price: Long = 0

    @Expose
    @SerializedName("pickupAddress")
    var pickupAddress: String? = null

    @Expose
    @SerializedName("destinationAddress")
    var destinationAddress: String? = null

    @Expose
    @SerializedName("promoCode")
    var promoCode: String? = null

    @Expose
    @SerializedName("promoCredit")
    var promoCredit: String? = null

    @Expose
    @SerializedName("useWallet")
    var useWallet = false

    @Expose
    @SerializedName("rate")
    var rate: String? = null

    @Expose
    @SerializedName("status")
    var status: String? = null

    @Expose
    @SerializedName("estimatedTime")
    var estimatedTime: String? = null

    @Expose
    @SerializedName("finalCost")
    var finalCost: String? = null

    @Expose
    @SerializedName("totalCost")
    var totalCost: String? = null

    @Expose
    @SerializedName("merchantName")
    var merchantName: String? = null

    @Expose
    @SerializedName("tokenMerchant")
    var tokenMerchant: String? = null

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

    //Logistics -->
    @Expose
    @SerializedName("senderName")
    var senderName: String? = null

    @Expose
    @SerializedName("senderPhone")
    var senderPhone: String? = null

    @Expose
    @SerializedName("recipientName")
    var recipientName: String? = null

    @Expose
    @SerializedName("recipientPhone")
    var recipientPhone: String? = null

    @Expose
    @SerializedName("itemName")
    var itemName: String? = null

    fun initFromDb(obj : TransaksiModel) {
        this.id = obj.id
        this.customerId = obj.idPelanggan
        this.idDriver = obj.idDriver
        this.orderFeature = obj.orderFitur
        this.startLatitude = obj.startLatitude
        this.startLongitude = obj.startLongitude
        this.endLatitude = obj.endLatitude
        this.endLongitude = obj.endLongitude
        this.distance = obj.jarak
        this.price = obj.harga
        this.pickupAddress = obj.alamatAsal
        this.destinationAddress = obj.alamatTujuan
        this.promoCode = obj.kodePromo
        this.promoCredit = obj.kreditPromo
        this.useWallet = obj.isPakaiWallet
        this.rate = obj.rate
        this.status = obj.status
        this.estimatedTime = obj.estimasi
        this.finalCost = obj.biaya_akhir
        this.totalCost = obj.total_biaya
        this.merchantName = obj.nama_merchant
        this.tokenMerchant = obj.token_merchant
        this.idtransmerchant = obj.idtransmerchant
        this.vat = obj.vat
        this.service_charge = obj.service_charge
        this.discount = obj.discount
        this.discount_total = obj.discount_total
        this.grand_total = obj.grand_total
        this.senderName = obj.namaPengirim
        this.senderPhone = obj.teleponPengirim
        this.recipientName = obj.namaPenerima
        this.recipientPhone = obj.teleponPenerima
        this.itemName = obj.namaBarang
    }
}