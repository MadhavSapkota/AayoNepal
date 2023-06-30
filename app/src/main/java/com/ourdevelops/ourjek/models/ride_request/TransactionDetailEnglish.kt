package com.ourdevelops.ourjek.models.ride_request

import com.ourdevelops.ourjek.models.TransaksiModel
import java.util.*

class TransactionDetailEnglish {

    var id: String? = null
    var customerId: String? = null
    var idDriver: String? = null
    var orderFeature : String? = null
    var startLatitude = 0.0
    var startLongitude = 0.0
    var endLatitude = 0.0
    var endLongitude = 0.0
    var distance = 0.0
    var price : Long = 0
    var orderTime: Date? = null
    var finishedTime: Date? = null
    var originalAddress: String? = null
    var destinationAddress: String? = null
    var promoCode: String? = null
    var promoCredit: String? = null
    var useWallet = false
    var rate: String? = null
    var status: String? = null
    var estimatedTime: String? = null
    var senderName: String? = null
    var senderPhone: String? = null
    var recipientName: String? = null
    var recipientPhone: String? = null
    var goodsName: String? = null
    var finalCost: String? = null
    var totalCost: String? = null
    var merchantName: String? = null
    var merchantToken: String? = null
    var merchantTransactionId: String? = null
    var vat: String? = null
    var serviceCharge: String? = null
    var discount: String? = null
    var discountTotal: String? = null
    var grandTotal: String? = null

    fun initFromTransaksi(obj : TransaksiModel) {
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
        this.orderTime = obj.waktuOrder
        this.finishedTime = obj.waktuSelesai
        this.originalAddress = obj.alamatAsal
        this.destinationAddress = obj.alamatTujuan
        this.promoCode = obj.kodePromo
        this.promoCredit = obj.kreditPromo
        this.useWallet = obj.isPakaiWallet
        this.rate = obj.rate
        this.status = obj.status
        this.estimatedTime = obj.estimasi
        this.senderName = obj.namaPengirim
        this.senderPhone = obj.teleponPengirim
        this.recipientName = obj.namaPenerima
        this.recipientPhone = obj.teleponPenerima
        this.goodsName = obj.namaBarang
        this.finalCost = obj.biaya_akhir
        this.totalCost = obj.total_biaya
        this.merchantName = obj.nama_merchant
        this.merchantToken = obj.token_merchant
        this.merchantTransactionId = obj.idtransmerchant
        this.vat = obj.vat
        this.serviceCharge = obj.service_charge
        this.discount = obj.discount
        this.discountTotal = obj.discount_total
        this.grandTotal = obj.grand_total
    }

    fun getDiscountValue() : String {
        return if (discount.isNullOrEmpty()) {
            "0"
        }
        else {
            discount!!
        }
    }
}