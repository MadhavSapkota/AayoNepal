package com.ourdevelops.ourjek.activity.logistic.payment

import android.content.Context
import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.json.*
import com.ourdevelops.ourjek.models.KodePromoModel
import com.ourdevelops.ourjek.models.User
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.BookService
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LogisticPaymentPresenter(
    val context: Context,
    val view: LogisticPaymentContractor.View,
    val allData: LogisticDataModel
) : LogisticPaymentContractor.Presenter {

    private var checkoutTransactionId: String? = null
    private val loginUser: User = BaseApp.getInstance(context).loginUser

    override fun calculateAllFee() {
        allData.apply {
            loaderFee = if (selectedNumberOfLoaders != null && selectedNumberOfLoaders != 0){
                (selectedNumberOfLoaders!! * loader_data?.price_per_person!!.toInt()).toString()
            }else{
                "0"
            }

            weightFee = estimatedWeightPrice?.replace("Rs. ", "")

            deliveryFee = when {

                distance!! < min_base_pay_distance!! -> {
                    biaya_minimum.toString()
                }

                distance!! > min_base_pay_distance!! -> {
                    val extraDistance: Int = (distance!! - min_base_pay_distance!!).toInt()
                    val extraPay = if(extraDistance < 1){
                        1*biaya
                    }else{
                        extraDistance * biaya
                    }
                    (biaya_minimum + extraPay).toString()
                }

                else -> {
                    biaya_minimum.toString()
                }
            }

            AppLogger.log("$deliveryFee ---- $loaderFee --- $weightFee")

            total = (weightFee!!.toDouble() + loaderFee!!.toDouble() + deliveryFee!!.toDouble()).toString()

        }

        view.setUpViews(allData)
    }

    override fun confirmPayment(
        allData: LogisticDataModel,
        paymentMethodRequestJson: PaymentMethodRequestJson?
    ) {
        val service = ServiceGenerator.createService(BookService::class.java, loginUser.email, loginUser.password,loginUser.token)

        service.requestTransaksisend(setParameterData(allData, paymentMethodRequestJson)).enqueue(object : Callback<SendResponseJson>{
            override fun onResponse(call: Call<SendResponseJson>, response: Response<SendResponseJson>) {
                checkoutTransactionId = response.body()?.transactionId
                if(paymentMethodRequestJson?.payment_method == "cod"){
                    view.onConfirmationSuccess("Successfully placed your delivery order..")
                }
            }

            override fun onFailure(call: Call<SendResponseJson>, t: Throwable) {
                view.onConfirmationFailure("There was some issue trying to process the order. Please check your internet connection and try again..")
            }

        })
    }

    override fun updateTransactionPaymentStatus(paymentMethodRequestJson: PaymentMethodRequestJson) {
        val service = ServiceGenerator.createService(BookService::class.java, loginUser.email, loginUser.password,loginUser.token)
        val requestBody = TransactionUpdatePaymentStatusJson()
        requestBody.transaction_order_id = checkoutTransactionId
        requestBody.payment_details = paymentMethodRequestJson
        service.updateTransactionPaymentStatus(requestBody).enqueue(object : Callback<OrderResponseJson> {
            override fun onResponse(p0: Call<OrderResponseJson>, p1: Response<OrderResponseJson>) {
                view.onPaymentSyncedWithCheckout()
            }

            override fun onFailure(p0: Call<OrderResponseJson>, p1: Throwable) {
                view.onPaymentSyncWithCheckoutFailure()
            }
        } )
    }

    override fun requestPromoCodes() {
        val loginUser = BaseApp.getInstance(context).loginUser
        val service = ServiceGenerator.createService(
            UserService::class.java,
            loginUser.email,
            loginUser.password,
            loginUser.token
        )

        val param = PromoRequestJson()
        param.code = "en"
        param.fitur = allData.idFitur.toString()
        param.id_pelanggan = loginUser.id
        service.listpromocode(param).enqueue(object : Callback<PromoResponseJson> {
            override fun onResponse(call: Call<PromoResponseJson>, response: Response<PromoResponseJson>) {
                if (response.isSuccessful) {
                    if (response.body()?.data.isNullOrEmpty()) {
                        view.onPromoCodesError()
                    } else {
                        view.onPromoCodesResponse(response.body()?.data as ArrayList<KodePromoModel>)
                    }
                }
            }

            override fun onFailure(call: Call<PromoResponseJson>, t: Throwable) {
                view.onPromoCodesError()
            }
        })
    }


    private fun setParameterData(
        allData: LogisticDataModel,
        paymentData: PaymentMethodRequestJson?
    ): SendRequestJson {
        return SendRequestJson().apply {
            idPelanggan = loginUser.id
            orderFitur = allData.idFitur.toString()
            startLatitude = allData.pickUpLat!!
            startLongitude = allData.pickUpLng!!
            endLatitude = allData.destinationLat!!
            endLongitude = allData.destinationLng!!
            jarak = allData.distance!!
            harga = (allData.deliveryFee!!.toDouble()*100).toLong()
            estimasi = allData.time
            kreditpromo = "0"
            alamatAsal = allData.pickUpLocation
            alamatTujuan = allData.destinationLocation
            isPakaiMpay = 0
            namaPengirim = allData.senderName
            teleponPengirim = allData.senderNumber
            namaPenerima = allData.receiverName
            teleponPenerima = allData.receiverNumber
            namaBarang = allData.itemName
            chosenEstimatedWeight = allData.chosenEstimatedWeight
            estimatedWeightPrice = allData.estimatedWeightPrice
            remarks = allData.remarks
            selectedNumberOfLoaders = allData.selectedNumberOfLoaders
            deliveryDateTime = allData.deliveryDateTime
            deliveryFee = (allData.deliveryFee!!.toDouble()*100).toString()
            weightFee = (allData.weightFee!!.toDouble()*100).toString()
            loaderFee = (allData.loaderFee!!.toDouble()*100).toString()
            total = (allData.total!!.toDouble()*100)
            deliveryId = allData.deliveryId
            vehicle_category_id = allData.vehicle_category_id
            paymentMethodRequestJson = paymentData
            discountTotal = allData.discountTotal
            discount = allData.discount
            promo = allData.promo
            promoStatus = allData.promoStatus
            isDeliveryFree = allData.isDeliveryFree
            isComplimentary = allData.isComplimentary
        }
    }
}