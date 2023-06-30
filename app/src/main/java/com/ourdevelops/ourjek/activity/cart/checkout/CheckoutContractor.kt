package com.ourdevelops.ourjek.activity.cart.checkout

import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.json.PaymentMethodRequestJson
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum
import com.ourdevelops.ourjek.models.CartPriceWrapper
import com.ourdevelops.ourjek.models.KodePromoModel
import com.ourdevelops.ourjek.models.PaymentMethodObject
import com.ourdevelops.ourjek.models.PaymentMethods

interface CheckoutContractor {

    interface View {

        fun onOrderSuccessful(message: String)
        fun onOrderFailed(message: String)

        fun onPromoCodesResponse(promoCodes : ArrayList<KodePromoModel>)
        fun  onPromoCodesError()

        fun onPaymentMethods(response : ArrayList<PaymentMethodObject>)
        fun onPaymentSyncedWithCheckout()
        fun onPaymentSyncWithCheckoutFailure()
    }

    interface Presenter {
        fun sendOrder(
                destinationLatLang: LatLng, cartResponsel: CartResponse, datum: Datum, alamatresto: String?,
                idresto: String, distance: Double, promocode: Long, deliveryLocation: String, deliveryTime: String, price: String, promoStatus: Boolean, promoCode: KodePromoModel?,
                discount: String?, discountTotal: String?, order_fitur: String, priceWrapper: CartPriceWrapper, deliveryFee: Boolean, isCashOnDelivery : Boolean, paymentMethodString : String
        )

        fun requestPromoCodes(idRestaurant: String?)
        var paymentMethodRequestJson: PaymentMethodRequestJson?
    }
}