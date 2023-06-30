package com.ourdevelops.ourjek.service.cart_service

import android.content.Context
import android.widget.Toast
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.json.ResponseJson
import com.ourdevelops.ourjek.json.cart.AddtoCartRequest
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CartServicePresenter(val context : Context, val view  : CartServiceContractor.View) : CartServiceContractor.Presenter {

    fun addtocart(id: Int, quantity: Int, restaurant_id: Int, itemPrice: String, notes: String, id_fitur: String?) {
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = AddtoCartRequest()
        param.customerId = loginUser.id.toString()
        param.itemId = id.toString()
        param.itemPrice = itemPrice.toString()
        param.merchantId = restaurant_id.toString()
        param.quantity = quantity.toString()
        param.notes = notes
        param.id_fitur = id_fitur
        try {
//            param.notes = binding.catatan.getText().toString()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        userService.addtocart(param).enqueue(object : Callback<ResponseJson> {
            override fun onResponse(call: Call<ResponseJson>, response: Response<ResponseJson>) {
                if (response.isSuccessful) {
                    view.onRequestCompleted()
                    Toast.makeText(context, response.body()!!.message, Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ResponseJson>, t: Throwable) {
                view.onRequestCompleted()
            }
        })
    }
}