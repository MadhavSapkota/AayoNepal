package com.ourdevelops.ourjek.activity.cart

import android.content.Context
import android.util.Log
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.DiscountType
import com.ourdevelops.ourjek.json.ResponseJson
import com.ourdevelops.ourjek.json.cart.AddtoCartRequest
import com.ourdevelops.ourjek.json.cart.CustomerRequestParams
import com.ourdevelops.ourjek.json.cart.DeleteCartParams
import com.ourdevelops.ourjek.json.cart.DeleteMultipleItem
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum
import com.ourdevelops.ourjek.models.PesananMerchant
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CartPresenter(val context: Context, val view: CartContractor.View) : CartContractor.Presenter {

    override fun updateCart(qty: String, datum: Datum) {
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = AddtoCartRequest()
        param.customerId = loginUser.id.toString()
        param.itemId = datum.idItem.toString()
        param.itemPrice = datum.itemPrice.toString()
        param.merchantId = datum.merchantId.toString()
        param.quantity = qty
        param.notes = datum.notes
        param.id_fitur = datum.idFitur
        userService.addtocart(param).enqueue(object : Callback<ResponseJson?> {
            override fun onResponse(call: Call<ResponseJson?>, response: Response<ResponseJson?>) {
                if (response.isSuccessful) {
                    view.onCartUpdated()
                }
            }

            override fun onFailure(call: Call<ResponseJson?>, t: Throwable) {
                view.onCartUpdatError("Could not update your cart.")
            }
        })
    }

    override fun updateCart(datum: List<Datum>) {
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = AddtoCartRequest()
        param.customerId = loginUser.id.toString()
        for (i in datum) {
            param.itemId = i.idItem.toString()
            param.itemPrice = i.itemPrice.toString()
            param.merchantId = i.merchantId.toString()
            param.quantity = i.quantity.toString()
            param.notes = i.notes
            param.id_fitur = i.idFitur
            userService.addtocart(param).enqueue(object : Callback<ResponseJson?> {
                override fun onResponse(call: Call<ResponseJson?>, response: Response<ResponseJson?>) {
                    if (response.isSuccessful) {
                        Log.d("onCartUpdate", "onResponse: " + i.quantity)
                    }
                }

                override fun onFailure(call: Call<ResponseJson?>, t: Throwable) {
                    view.onCartUpdatError("Could not update your cart.")
                }
            })
        }
    }

    override fun deleteCartItem(idItem: String) {
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = DeleteCartParams()
        param.customer_id = loginUser.id.toString()
        param.item_id = idItem

        userService.deletecartitem(param).enqueue(object : Callback<ResponseJson?> {
            override fun onResponse(call: Call<ResponseJson?>, response: Response<ResponseJson?>) {
                if (response.isSuccessful) {
                    //deleting from db//
                    val realm = Realm.getDefaultInstance()
                    realm.executeTransactionAsync { realm ->
                        val result = realm.where(PesananMerchant::class.java).equalTo("idItem", idItem.toInt()).findFirst()
                        result?.deleteFromRealm()
                    }
                    view.onCartItemDeleted()
                }
            }

            override fun onFailure(call: Call<ResponseJson?>, t: Throwable) {
                view.onCartItemDeleteError("Could not remove item.")
            }
        })
    }

    override fun getCartDetails() {
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val params = CustomerRequestParams()
        params.customerId = loginUser.id
        userService.getCart(params).enqueue(object : Callback<CartResponse> {
            override fun onResponse(call: Call<CartResponse>, response: Response<CartResponse>) {
                if (response.isSuccessful) {
                    if (response.body()!!.code.equals("201", ignoreCase = true)) {
                        view.onEmptyCart()
                        view.onCartDetailError("No items")
                    } else {
                        for (i in response.body()?.data!!) {
                            when(i.discount) {
                                DiscountType.fix -> {
                                    i.statusPromo = "1"
                                    i.hargaPromo = (i.hargaItem.toDouble() - i.discount.toDouble()).toString()
                                }
                                DiscountType.percent -> {
                                    i.statusPromo = "1"
                                    i.hargaPromo = getDiscountedPrice(i.hargaItem, i.discount)
                                }
                            }
                        }
                        view.onCartDetailsSuccess(response.body()!!)
                    }
                }
            }

            override fun onFailure(call: Call<CartResponse>, t: Throwable) {
                view.onCartDetailError("No items")
            }
        })
    }

    private fun getDiscountedPrice(actualPrice: String, discountPercent: String) : String {
        val discountPrice = (actualPrice.toDouble() * discountPercent.toDouble()) / 100
        val newPrice = actualPrice.toDouble() - discountPrice
        return newPrice.toString()
    }

    override fun deleteAllCarts(cartResponse: CartResponse) {
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = DeleteMultipleItem()
        param.customer_id = loginUser.id.toString()
        var itemIdArray = ArrayList<String>()
        val idArray = arrayOfNulls<Int>(cartResponse.data!!.size)
        for ((i, obj) in cartResponse.data!!.withIndex()) {
            idArray[i] = obj.idItem.toInt()
            itemIdArray.add(obj.idItem)
        }
        param.item_id = itemIdArray
        userService.deleteAllCarts(param).enqueue(object : Callback<ResponseJson?> {
            override fun onResponse(call: Call<ResponseJson?>, response: Response<ResponseJson?>) {
                val realm = Realm.getDefaultInstance()
                realm.executeTransactionAsync { realm ->
                    val result = realm.where(PesananMerchant::class.java).findAll()
                    result.deleteAllFromRealm()
                }
                view.onCartCleared()
            }

            override fun onFailure(call: Call<ResponseJson?>, t: Throwable) {
                view.onCartDetailError("Could not clear your cart")
            }
        })
    }

}