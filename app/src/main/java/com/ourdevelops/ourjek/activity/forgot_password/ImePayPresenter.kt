package com.ourdevelops.ourjek.activity.forgot_password

import android.app.Activity
import android.content.Context
import com.ourdevelops.ourjek.activity.imepay.ImePayContractor
import com.ourdevelops.ourjek.utils.AppLogger
import com.swifttechnology.imepaysdk.ENVIRONMENT
import com.swifttechnology.imepaysdk.IMEPayment
import com.swifttechnology.imepaysdk.IMEPaymentCallback

class ImePayPresenter(val context: Activity, val view: ImePayContractor.View) : ImePayContractor.Presenter {
    val merchantCode = "PICKME"
    val merchantName = "Pickme Pvt Ltd"
    val merchantUrl = "https://www.pickme.com.np"
    val amount = "12"
    val referenceId = "pickme789233"
    val module = "PICKME"
    val userName = "pickme"
    val password = "ime@1234"

    fun makePayment() {
        val imePayment = IMEPayment(context, ENVIRONMENT.TEST)
        imePayment.performPaymentV1(
                merchantCode, merchantName, merchantUrl, merchantUrl, amount, referenceId, module, userName, password, object : IMEPaymentCallback {
            override fun onSuccess(responseCode: Int, responseDescription: String?, transactionId: String?, msisdn: String?, amount: String?, refId: String?) {
                AppLogger.log("response code == > $responseCode response description == > $responseDescription")
            }

            override fun onTransactionCancelled(refId: String?) {

            }
        }
        )
    }
}