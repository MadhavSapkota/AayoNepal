package com.ourdevelops.ourjek.json

class TransactionUpdatePaymentStatusJson {
    var transaction_order_id : String ?= null
    var payment_details : PaymentMethodRequestJson ?= null
}