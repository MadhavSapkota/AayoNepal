package com.ourdevelops.ourjek.activity.logistic

import android.content.Context
import android.util.Log
import android.widget.TextView
import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRequestInterface
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.json.GetNearRideCarRequestJson
import com.ourdevelops.ourjek.json.GetNearRideCarResponseJson
import com.ourdevelops.ourjek.json.SavedAddressResponse
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.BookService
import com.ourdevelops.ourjek.utils.api.service.UserService
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.util.*

class LogisticPresenter(val view: LogisticContractor.View, val context: Context,val address: SavedAddressRequestInterface) : LogisticContractor.Presenter {



    override fun getAllSavedAddress() {
        val service = ServiceGenerator.createService(UserService::class.java, BaseApp.loginUser.email, BaseApp.loginUser.password,BaseApp.loginUser.token)
        service.allSavedAddress.enqueue(object : retrofit2.Callback<SavedAddressResponse> {
            override fun onResponse(
                call: retrofit2.Call<SavedAddressResponse>,
                response: retrofit2.Response<SavedAddressResponse>
            ) {
                if (response.isSuccessful) {
                    val savedAddress = response.body()?.data
                    if (savedAddress?.size != 0) {
                        AppLogger.log("size greater than 0")
                        address.onSavedAddressResponse(response.body()?.data!!)
                    }
                    else {
                        AppLogger.log("size is 0")
                    }
                }
                else {

                }
            }

            override fun onFailure(call: retrofit2.Call<SavedAddressResponse>, t: Throwable) {

            }

        })
    }
}