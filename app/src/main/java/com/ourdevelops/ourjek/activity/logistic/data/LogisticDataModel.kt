package com.ourdevelops.ourjek.activity.logistic.data

import com.ourdevelops.ourjek.models.KodePromoModel
import com.ourdevelops.ourjek.models.NewAllFeatureModel
import java.io.Serializable

class LogisticDataModel : Serializable {

    //logistic default data
    var idFitur = 0
    var fitur: String? = null
    var biaya: Long = 0
    var biaya_minimum: Long = 0
    var keteranganBiaya: String? = null
    var keterangan: String? = null
    var diskon: String? = null
    var biayaAkhir = 0.0
    var icon: String? = null
    var job: String? = null
    var home: String? = null
    var vehicle_category_id = 0
    var min_base_pay_distance: Int? = null
    var delivery_type = ArrayList<LogisticItemModel>()
    var estimated_weight = ArrayList<LogisticWeightModel>()
    var loader_data: LogisticLoaderData? = null
    var max_distance: String? = null

    //user location data
    var distance: Double? = null
    var pickUpLat: Double? = null
    var pickUpLng: Double? = null
    var destinationLat: Double? = null
    var destinationLng: Double? = null
    var pickUpLocation: String? = null
    var destinationLocation: String? = null
    var time: String? = null

    //user item data
    var itemName: String? = null
    var deliveryId: String? = null
    var chosenEstimatedWeight: String? = null
    var estimatedWeightPrice: String? = null

    //user details data
    var senderName: String? = null
    var receiverName: String? = null
    var senderNumber: String? = null
    var receiverNumber: String? = null
    var remarks: String? = null
    var selectedNumberOfLoaders: Int? = null
    var deliveryDateTime: String? = null

    //user payment data
    var deliveryFee: String? = null
    var weightFee: String? = null
    var loaderFee: String? = null
    var total: String? = null
    var discountTotal: String? = null
    var discount: String? = null
    var promo: KodePromoModel? = null
    var promoStatus: Boolean = false
    var isDeliveryFree: Boolean = false
    var isComplimentary: Boolean = false

    fun init(data: NewAllFeatureModel){
        this.idFitur = data.idFitur
        this.fitur = data.fitur
        this.biaya = data.biaya/100
        this.biaya_minimum = data.biaya_minimum/100
        this.keteranganBiaya = data.keteranganBiaya
        this.keterangan = data.keterangan
        this.diskon = data.diskon
        this.biayaAkhir = data.biayaAkhir
        this.icon = data.icon
        this.job = data.job
        this.home = data.home
        this.vehicle_category_id = data.vehicle_category_id
        this.min_base_pay_distance = data.min_base_pay_distance
        this.loader_data = data.loader_data
        this.max_distance = data.max_distance
        parseData(data)
    }

    private fun parseData(data: NewAllFeatureModel) {
        data.delivery_type?.forEach{
            this.delivery_type.add(it)
        }

        data.estimated_weight?.forEach{
            this.estimated_weight.add(it)
        }
    }
}