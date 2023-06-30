package com.ourdevelops.ourjek.base.payment

import com.ourdevelops.ourjek.json.PaymentMethodRequestJson

interface OnlinePaymentContractor {

    interface View{
        fun onReferenceIdReceived()
        fun onConfirmationFailure(message: String)
        fun onThirdPartyPaymentFailure(message: String)
        fun confirmPayment(paymentMethodRequestJson: PaymentMethodRequestJson)

    }

    interface Presenter{
        fun getReferenceIdFromServer(name: String, amount: String?)

    }
}