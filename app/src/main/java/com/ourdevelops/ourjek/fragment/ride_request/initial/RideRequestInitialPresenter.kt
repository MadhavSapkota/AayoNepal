package com.ourdevelops.ourjek.fragment.ride_request.initial

import android.content.Context
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.BaseApp.loginUser
import com.ourdevelops.ourjek.json.SavedAddressResponse
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RideRequestInitialPresenter(val context : Context, val view : RideRequestInitialContractor.View) : RideRequestInitialContractor.Presenter {


    override fun requestMyAddress() {
        val service = ServiceGenerator.createService(UserService::class.java, BaseApp.loginUser.email, BaseApp.loginUser.password,loginUser.token)
        service.allSavedAddress.enqueue(object : Callback<SavedAddressResponse> {
            override fun onResponse(
                call: Call<SavedAddressResponse>,
                response: Response<SavedAddressResponse>
            ) {
                if (response.isSuccessful) {

                }
                else {

                }
            }

            override fun onFailure(call: Call<SavedAddressResponse>, t: Throwable) {

            }

        })

    }


}