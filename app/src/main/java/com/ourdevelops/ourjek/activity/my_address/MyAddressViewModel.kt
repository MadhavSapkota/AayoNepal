package com.ourdevelops.ourjek.activity.my_address

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.json.SavedAddressObj
import com.ourdevelops.ourjek.json.SavedAddressResponse
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyAddressViewModel : ViewModel() {

    private val _myAddresses = MutableLiveData<List<SavedAddressObj>?>()
    val myAddresses: LiveData<List<SavedAddressObj>?> = _myAddresses

    init {
        getAllSavedAddress()
    }

    private fun getAllSavedAddress() {
        val service = ServiceGenerator.createService(
            UserService::class.java,
            BaseApp.loginUser.email,
            BaseApp.loginUser.password,
            BaseApp.loginUser.token
        )
        service.allSavedAddress.enqueue(object : Callback<SavedAddressResponse> {
            override fun onResponse(
                call: Call<SavedAddressResponse>,
                response: Response<SavedAddressResponse>
            ) {
                if (response.isSuccessful) {
                    val savedAddress = response.body()?.data
                    if (savedAddress?.size != 0) {
                        AppLogger.log("size greater than 0")
                        _myAddresses.value = response.body()?.data
                    } else {
                        AppLogger.log("size is 0")
                    }
                } else {

                }
            }

            override fun onFailure(call: Call<SavedAddressResponse>, t: Throwable) {

            }

        })
    }
}