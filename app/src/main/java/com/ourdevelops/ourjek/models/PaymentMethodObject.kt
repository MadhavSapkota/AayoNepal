package com.ourdevelops.ourjek.models

import com.ourdevelops.ourjek.BuildConfig
import com.prabhutech.prabhupay_sdk.PrabhuSdk

class PaymentMethodObject() {
    var paymentMethod: PaymentMethods = PaymentMethods.cashOnDelivery
    var isSelected = false

    constructor(method: PaymentMethods, isSelected: Boolean) : this() {
        this.paymentMethod = method
        this.isSelected = isSelected
    }
}

enum class PaymentMethods {
    cashOnDelivery, imePay, prabhuPay
}

object IMEPayVariables {
    val merchantCode = "PICKME"
    val merchantName = "Pickme Pvt Ltd"
    val merchantUrl = "https://stg.imepay.com.np:7979/api/sdk/recordTransaction"
    val amount = "12"
    val module = "PICKME"
    val userName = "pickme"
    val password = "ime@1234"
}

object PrabhuPayVariables {
    val username =
        if (BuildConfig.DEBUG) {
            "pickme001"
        } else {
            "pickme001"
        }

    val password =
        if (BuildConfig.DEBUG) {
            "mgg5xf7c"
        } else {
            "q7ruutsl"
        }

    val stage =
        if (BuildConfig.DEBUG) {
            PrabhuSdk.ENV_STAGE
        } else {
            PrabhuSdk.ENV_LIVE
        }
}