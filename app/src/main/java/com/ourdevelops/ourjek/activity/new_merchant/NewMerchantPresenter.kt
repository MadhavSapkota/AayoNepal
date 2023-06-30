package com.ourdevelops.ourjek.activity.new_merchant

import android.content.Context
import android.widget.Toast
import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.json.AllMerchantByNearResponseJson
import com.ourdevelops.ourjek.json.AllMerchantbyCatRequestJson
import com.ourdevelops.ourjek.json.SearchMerchantbyCatRequestJson
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.util.*

class NewMerchantPresenter(val view: NewMerchantActivity, val context: Context, val filterId: String) : NewMerchantContractor.Presenter {

    override fun onRequestAddress() {
        val latlang = LatLng(Constants.LATITUDE, Constants.LONGITUDE)
        if (latlang != null) {
            MapDirectionAPI.getAddress(latlang).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {}

                @Throws(IOException::class)
                override fun onResponse(call: Call, response: Response) {
                    if (response.isSuccessful) {
                        val json = Objects.requireNonNull(response.body())!!.string()
                        view.runOnUiThread {
                            try {
                                val Jobject = JSONObject(json)
                                val Jarray = Jobject.getJSONArray("results")
                                val userdata = Jarray.getJSONObject(0)
                                val address = userdata.getString("formatted_address")
                                view.setAddressData(address)
                            } catch (e: JSONException) {
                                e.printStackTrace()
                            }
                        }
                    }
                }
            })
        }
    }

    override fun searchMerchant(toSearch: String, filterId: String) {
        view.onShowProgress()
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = SearchMerchantbyCatRequestJson()
        param.id = loginUser.id
        param.lat = Constants.LATITUDE.toString()
        param.lon = Constants.LONGITUDE.toString()
        param.phone = loginUser.noTelepon
        param.fitur = filterId
        param.like = toSearch
        userService.searchmerchant(param).enqueue(object : retrofit2.Callback<AllMerchantByNearResponseJson> {
            override fun onResponse(call: retrofit2.Call<AllMerchantByNearResponseJson>, response: retrofit2.Response<AllMerchantByNearResponseJson>) {
                if (response.isSuccessful) {
                    if (response.body()?.message.equals("success", ignoreCase = true)) {
                        view.onHideProgress()
                        if (response.body()?.data.isNullOrEmpty()) {
                            view.onNoDataFound()
                        } else {
                            view.onSearchDataFound(response.body()?.data!!)
                        }
                    }
                }
            }

            override fun onFailure(call: retrofit2.Call<AllMerchantByNearResponseJson>, t: Throwable) {}
        })
    }

    override fun getAllMerchants(filterId: String) {
        view.onShowProgress()
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(UserService::class.java, loginUser.noTelepon, loginUser.password, loginUser.token)
        val param = AllMerchantbyCatRequestJson()
        param.id = BaseApp.getInstance(context).loginUser.id
        param.lat = Constants.LATITUDE.toString()
        param.lon = Constants.LONGITUDE.toString()
        param.phone = BaseApp.getInstance(context).loginUser.noTelepon
        param.fitur_id = filterId
        userService.allmerchant(param).enqueue(object : retrofit2.Callback<AllMerchantByNearResponseJson> {
            override fun onResponse(call: retrofit2.Call<AllMerchantByNearResponseJson>, response: retrofit2.Response<AllMerchantByNearResponseJson>) {
                view.onHideProgress()
                if(!response.body()?.data.isNullOrEmpty()){
                    view.onResponseSuccess(response.body()?.data)
                }else{
                    view.onNoDataFound()
                    Toast.makeText(context, "No data was found", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: retrofit2.Call<AllMerchantByNearResponseJson>, t: Throwable) {
                view.onHideProgress()
                view.onNoDataFound()
                Toast.makeText(context, "There was an issue connecting with the server. Check your internet connection and try again", Toast.LENGTH_SHORT).show()
            }

        })
    }

}