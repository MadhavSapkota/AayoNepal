package com.ourdevelops.ourjek.service.cart_service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class CartService : Service(), CartServiceContractor.View {
    private lateinit var presenter: CartServicePresenter
    private var id: Int = 0
    private var itemPrice: String = ""
    private var merchantId: Int = 0
    private var quantity: Int = 0
    private var notes: String = ""
    private var id_fitur: String? = null

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        presenter = CartServicePresenter(applicationContext, this)
        receivingIntents(intent)
        callAddToCartApi()
        return super.onStartCommand(intent, flags, startId)
    }

    private fun receivingIntents(intent: Intent?) {
        id = intent?.getIntExtra("id", 0)!!
        itemPrice = intent.getStringExtra("itemPrice").toString()
        merchantId = intent.getIntExtra("merchantId", 0)
        quantity = intent.getIntExtra("quantity", 0)
        notes = intent.getStringExtra("notes").toString()
        id_fitur = intent.getStringExtra("id_fitur").toString()
    }

    private fun callAddToCartApi() {
        presenter.addtocart(id, quantity, merchantId, itemPrice, notes, id_fitur)
    }

    override fun onRequestCompleted() {
        onDestroy()
    }

    override fun onDestroy() {
        super.onDestroy()
        stopSelf()
    }
}