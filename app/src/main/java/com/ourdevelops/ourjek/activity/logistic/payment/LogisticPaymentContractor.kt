package com.ourdevelops.ourjek.activity.logistic.payment

import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import com.ourdevelops.ourjek.json.PaymentMethodRequestJson
import com.ourdevelops.ourjek.models.KodePromoModel

interface LogisticPaymentContractor {

    interface View {

        fun setUpViews(allData: LogisticDataModel)
        fun onConfirmationSuccess(message: String)
        fun onConfirmationFailure(s: String)
        fun onThirdPartyPaymentFailure(s: String)
        fun onReferenceIdReceived()
        fun onPaymentSyncedWithCheckout()
        fun onPaymentSyncWithCheckoutFailure()
        fun onPromoCodesError()
        fun onPromoCodesResponse(promoCodes: ArrayList<KodePromoModel>)
    }

    interface Presenter{
        fun confirmPayment(
            allData: LogisticDataModel,
            paymentMethodRequestJson: PaymentMethodRequestJson?
        )
        fun calculateAllFee()
        fun updateTransactionPaymentStatus(paymentMethodRequestJson: PaymentMethodRequestJson)
        fun requestPromoCodes()
    }
}