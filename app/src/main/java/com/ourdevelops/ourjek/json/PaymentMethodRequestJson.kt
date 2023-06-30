package com.ourdevelops.ourjek.json

class PaymentMethodRequestJson() {
    var payment_status : String ?= null
    var payment_transaction_id : String ?= null
    var payment_method : String ?= null
    var payment_amount : String ?= null
    var referenceId : String ?= null

    constructor(paymentStatus : String, paymentTransactionId : String?, paymentMethod : String, payment_amount : String?, referenceId : String?) : this() {
        this.payment_status = paymentStatus
        this.payment_transaction_id = paymentTransactionId
        this.payment_method = paymentMethod
        this.payment_amount = payment_amount
        this.referenceId = referenceId
    }

    constructor(isCashOnDelivery : Boolean) : this() {
        if (isCashOnDelivery) {
            this.payment_method = "cod"
        }
    }

    constructor(paymentMethod : String) : this() {
        payment_method = paymentMethod
    }
}