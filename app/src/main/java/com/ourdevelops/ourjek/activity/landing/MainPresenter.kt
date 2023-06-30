package com.ourdevelops.ourjek.activity.landing

import android.content.Context
import android.widget.Toast
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.DiscountType
import com.ourdevelops.ourjek.json.cart.CustomerRequestParams
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.models.PesananMerchant
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class MainPresenter(val context: Context, val view: MainContractor.View) : MainContractor.Presenter {

    fun getCartDetails() {
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val params = CustomerRequestParams()
        params.customerId = loginUser.id
        userService.getCart(params).enqueue(object : Callback<CartResponse> {
            override fun onResponse(call: Call<CartResponse>, response: Response<CartResponse>) {
                if (response.isSuccessful) {
                    if (response.body()!!.code.equals("201", ignoreCase = true)) {
                        clearCartDatabase()
                    } else {
                        for (i in response.body()?.data!!) {
                            addItemToCartDb(i.idItem.toInt(), getCalculatedCost(i.hargaItem, i.quantity), i.quantity.toInt(), i.notes, i.merchantId.toInt())
                        }
                    }
                }
            }

            override fun onFailure(call: Call<CartResponse>, t: Throwable) {

            }
        }
        )
    }

    private fun clearCartDatabase() {
        val realm = Realm.getDefaultInstance()
        realm.executeTransactionAsync { realm ->
            val result = realm.where(PesananMerchant::class.java).findAll()
            result.deleteAllFromRealm()
        }
    }


    private fun getCalculatedCost(itemPrice: String, itemQuantity: String): Long {
        val newPrice = itemPrice.toInt() * itemQuantity.toInt()
        return newPrice.toLong()
    }

    private fun addItemToCartDb(idMakanan: Int, totalHarga: Long, qty: Int, notes: String, restaurantId : Int) {
        try {
            val realm = Realm.getDefaultInstance()
            val pesananfood = PesananMerchant()
            pesananfood.idItem = idMakanan
            pesananfood.totalHarga = totalHarga
            pesananfood.qty = qty
            pesananfood.catatan = notes
            pesananfood.restaurant_id = restaurantId
            realm.beginTransaction()
            realm.copyToRealmOrUpdate(pesananfood)
            realm.commitTransaction()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

}