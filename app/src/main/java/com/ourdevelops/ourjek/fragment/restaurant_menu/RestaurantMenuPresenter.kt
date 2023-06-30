package com.ourdevelops.ourjek.fragment.restaurant_menu

import android.content.Context
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.DiscountType
import com.ourdevelops.ourjek.json.GetAllMerchantbyCatRequestJson
import com.ourdevelops.ourjek.json.MerchantByIdResponseJson
import com.ourdevelops.ourjek.models.ItemModel
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class RestaurantMenuPresenter(val context: Context, val view: RestaurantMenuContractor.View) :
    RestaurantMenuContractor.Presenter {

    override fun requestData(
        latitude: String?,
        longitude: String?,
        restaurantId: String?,
        categoryId: String?
    ) {
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
            UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token
        )
        val param = GetAllMerchantbyCatRequestJson()
        param.id = restaurantId
        param.lat = latitude
        param.lon = longitude
        param.phone = loginUser.noTelepon
        param.kategori = categoryId
        userService.getitembycat(param).enqueue(object : Callback<MerchantByIdResponseJson> {
            override fun onResponse(
                call: Call<MerchantByIdResponseJson>,
                response: Response<MerchantByIdResponseJson>
            ) {
                if (response.isSuccessful) {
                    if (Objects.requireNonNull(response.body())!!.message.equals(
                            "success",
                            ignoreCase = true
                        )
                    ) {
                        if (response.body()!!.data.isEmpty()) {
                            view.onResponseError("No menu found")
                        } else {
                            for (i in response.body()?.data!!) {
                                when (i.type) {
                                    DiscountType.fix -> {
                                        i.status_promo = "1"
                                        i.harga_promo =
                                            (i.harga_item.toDouble() - i.discount.toDouble()).toString()
                                    }
                                    DiscountType.percent -> {
                                        i.status_promo = "1"
                                        i.harga_promo =
                                            getDiscountedPrice(i.harga_item, i.discount)
                                    }
                                }
                            }
                            view.onResponseSuccess(response.body()?.data!! as ArrayList<ItemModel>)
                        }
                    }
                }
            }

            override fun onFailure(call: Call<MerchantByIdResponseJson>, t: Throwable) {
                view.onResponseError("No menu found")
            }
        })
    }

    private fun getDiscountedPrice(actualPrice: String, discountPercent: String): String {
        val discountPrice = (actualPrice.toDouble() * discountPercent.toDouble()) / 100
        val newPrice = actualPrice.toDouble() - discountPrice
        return newPrice.toString()
    }

}