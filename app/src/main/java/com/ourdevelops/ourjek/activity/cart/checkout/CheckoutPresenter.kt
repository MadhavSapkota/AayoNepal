package com.ourdevelops.ourjek.activity.cart.checkout

import android.content.Context
import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.json.*
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum
import com.ourdevelops.ourjek.models.*
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.BookService
import com.ourdevelops.ourjek.utils.api.service.UserService
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CheckoutPresenter(val context: Context, val view: CheckoutContractor.View) : CheckoutContractor.Presenter {

    private var id_merchant = ""
    override var paymentMethodRequestJson : PaymentMethodRequestJson ?= null
    private var checkoutTransactionId : String ?= null
    val service: BookService = ServiceGenerator.createService(BookService::class.java, BaseApp.getInstance(context).loginUser.phone, BaseApp.getInstance(context).loginUser.password, BaseApp.getInstance(context).loginUser.token)

    override fun sendOrder(destinationLatLang: LatLng, cartResponsel: CartResponse, datum: Datum, alamatresto: String?, idresto: String, distance: Double,
                           promocode: Long, deliveryLocation: String, deliveryTime: String, price: String, promoStatus: Boolean,
                           promoCode: KodePromoModel?, discount: String?, discountTotal: String?, order_fitur: String, priceWrapper: CartPriceWrapper, deliveryFree: Boolean, isCashOnDelivery : Boolean, paymentMethodString : String) {
        val existingItem: MutableList<PesananMerchant> = ArrayList()
        id_merchant = idresto
        val jarak = NewDetailOrderActivity.getKmFromLatLong(destinationLatLang.latitude, destinationLatLang.longitude, datum.latitudeMerchant.toDouble(), datum.longitudeMerchant.toDouble())
        val idArray = arrayOfNulls<Int>(cartResponsel.data!!.size)
        for (i in cartResponsel.data!!.indices) {
            idArray[i] = cartResponsel.data?.get(i)?.idItem?.toInt()
            val pesananMerchant = PesananMerchant()
            pesananMerchant.idItem = cartResponsel.data!![i].idItem.toInt()
            pesananMerchant.restaurant_id = cartResponsel.data!![i].idMerchant.toInt()
            pesananMerchant.qty = cartResponsel.data!![i].quantity.toInt()
            pesananMerchant.catatan = cartResponsel.data!![i].notes
            pesananMerchant.totalHarga = cartResponsel.data!![i].hargaItem.toLong()
            existingItem.add(pesananMerchant)
        }

        for (pesanan in existingItem) {
            if (pesanan.catatan == null || pesanan.catatan.trim { it <= ' ' } == "") pesanan.catatan = ""
        }
        val param = ItemRequestJson()
        val userLogin = BaseApp.getInstance(context).loginUser
        param.idPelanggan = userLogin.id
        param.orderFitur = order_fitur
        param.startLatitude = datum.latitudeMerchant.toDouble()
        param.startLongitude = datum.longitudeMerchant.toDouble()
        param.endLatitude = destinationLatLang.latitude
        param.endLongitude = destinationLatLang.longitude
        param.alamatTujuan = deliveryLocation
        param.alamatAsal = datum.alamatMerchant
        param.jarak = jarak
        param.service_charge = priceWrapper.totalServiceCharge.toString()
        param.vat = priceWrapper.totalVat.toString()
        param.commission = datum.commission.toString()
        param.estimasi = distance.toString()
        if (isCashOnDelivery) {
            param.paymentMethodRequestJson = PaymentMethodRequestJson(true)
        }
        else {
            param.paymentMethodRequestJson = PaymentMethodRequestJson(paymentMethodString)
        }
        if(deliveryFree){
            param.harga = 0
        }else{
            cartResponsel.distance_price_range?.forEach{
                if(it.start_distance!! <= jarak && jarak < it.end_distance!!){
                    param.harga = it.price!!.toLong()
                }
            }
        }
        param.isPakaiWallet = 0
        param.kreditpromo = promocode.toString()
        param.idResto = idresto
        try {
            param.totalBiayaBelanja = java.lang.Double.valueOf(price.replace("Rs ", "").replace(",", "")) * 100
        } catch (e: Exception) {
            e.printStackTrace()
        }

        param.catatan = ""
        param.delivery_time = deliveryTime
        param.pesanan = existingItem

        param.promo_status = promoStatus
        param.promo_code = promoCode
        param.discount = discount

        if(discountTotal.isNullOrEmpty()){
            param.discount_total = (price.replace("Rs ", "").replace(",", "").toDouble() * 100).toString()
        }else{
            param.discount_total = discountTotal
        }

        service.sendorder(param).enqueue(object : Callback<OrderResponseJson> {
            override fun onResponse(call: Call<OrderResponseJson>, response: Response<OrderResponseJson>) {
                if (isCashOnDelivery) {
                    Realm.getDefaultInstance().apply {
                        executeTransactionAsync {
                            val result = it.where(PesananMerchant::class.java).findAll()
                            result.deleteAllFromRealm()
                        }
                    }
                }
                if (response.isSuccessful) {
                    checkoutTransactionId = response.body()?.transactionId
                    view.onOrderSuccessful(response.body()?.message!!)
                } else {
                    try {
                        view.onOrderFailed(response.body()?.message!!)
                    } catch (e: Exception) {
                    }
                }
            }

            override fun onFailure(call: Call<OrderResponseJson>, t: Throwable) {
                view.onOrderFailed("Could not checkout cart")
            }
        })
    }

    override fun requestPromoCodes(idRestaurant: String?) {
        val loginUser = BaseApp.getInstance(context).loginUser
        val service = ServiceGenerator.createService(
                UserService::class.java,
                loginUser.email,
                loginUser.password,
            loginUser.token
        )

        val param = PromoRequestJson()
        param.code = "en"
        param.fitur = "21"
        param.id_pelanggan = loginUser.id
        param.id_merchant = idRestaurant
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

    fun requestPaymentMethods() {
        val mlist = ArrayList<PaymentMethodObject>()
        mlist.add(PaymentMethodObject(PaymentMethods.cashOnDelivery, true))
        mlist.add(PaymentMethodObject(PaymentMethods.imePay, false))
        mlist.add(PaymentMethodObject(PaymentMethods.prabhuPay, false))
        view.onPaymentMethods(mlist)
    }

    fun updateTransactionPaymentStatus() {
        val requestBody = TransactionUpdatePaymentStatusJson()
        requestBody.transaction_order_id = checkoutTransactionId
        requestBody.payment_details =  paymentMethodRequestJson
        service.updateTransactionPaymentStatus(requestBody).enqueue(object : Callback<OrderResponseJson> {
            override fun onResponse(p0: Call<OrderResponseJson>, p1: Response<OrderResponseJson>) {
                view.onPaymentSyncedWithCheckout()
            }

            override fun onFailure(p0: Call<OrderResponseJson>, p1: Throwable) {
                view.onPaymentSyncWithCheckoutFailure()
            }
        } )
    }
}