package com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.ourdevelops.ourjek.models.ItemModel
import com.ourdevelops.ourjek.models.PesananMerchant
import com.ourdevelops.ourjek.service.cart_service.CartService
import io.realm.Realm

class MenuItemPresenter(val context: Context, val view: MenuItemContractor.View, val callBack: MenuFragCartIconCheck?) : MenuItemContractor.Presenter {
    private var currentQuantity = 0
    private var restaurantId = 0
    private lateinit var obj : ItemModel
    private var callback = callBack
    private var id_fitur: String? = null

    fun setInterface(callBack: MenuFragCartIconCheck){
        this.callback = callBack
    }

    fun addToCart(obj: ItemModel, restaurantId: Int, currentQuantity: Int, notes: String, id_fitur: String?) {
        this.obj = obj
        this.restaurantId = restaurantId
        this.currentQuantity = currentQuantity
        this.id_fitur = id_fitur
        AddPesanan(obj.id_item, getCalculatedCost(), currentQuantity, notes)
        addtocart(obj.id_item, getCalculatedCost(), currentQuantity, notes, restaurantId)
    }

    private fun getCalculatedCost(): Long {
        val newPrice = obj.harga_item.toInt() * currentQuantity
        return newPrice.toLong()
    }

    private fun AddPesanan(idMakanan: Int, totalHarga: Long, qty: Int, notes: String) {
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
            Toast.makeText(context, e.message, Toast.LENGTH_SHORT).show()

        }
    }

    private fun addtocart(id: Int, cost: Long, quantity: Int, catatan: String, restaurant_id: Int) {

        val intent = Intent(context, CartService::class.java)
        intent.putExtra("id", id)
        intent.putExtra("itemPrice", obj.harga_item)
        intent.putExtra("merchantId", restaurant_id)
        intent.putExtra("quantity", quantity)
        intent.putExtra("notes", catatan)
        intent.putExtra("id_fitur", id_fitur)
        context.startService(intent)
        view.onAddedToCart()
        callback?.showAddedToCart()

//        val loginUser = BaseApp.getInstance(context).loginUser
//        val userService = ServiceGenerator.createService(
//                UserService::class.java, loginUser.noTelepon, loginUser.password)
//        val param = AddtoCartRequest()
//        param.customerId = loginUser.id.toString()
//        param.itemId = id.toString()
//        param.itemPrice = obj.getHarga_item().toString()
//        param.merchantId = restaurant_id.toString()
//        param.quantity = quantity.toString()
//        try {
////            param.notes = binding.catatan.getText().toString()
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//        userService.addtocart(param).enqueue(object : Callback<ResponseJson> {
//            override fun onResponse(call: Call<ResponseJson>, response: Response<ResponseJson>) {
//                if (response.isSuccessful) {
//                    view.onAddedToCart()
//                    Toast.makeText(context, response.body()!!.message, Toast.LENGTH_SHORT).show()
//                }
//            }
//
//            override fun onFailure(call: Call<ResponseJson>, t: Throwable) {
//                Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show()
//            }
//        })
    }

}