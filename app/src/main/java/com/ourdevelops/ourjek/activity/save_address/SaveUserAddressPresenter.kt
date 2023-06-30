package com.ourdevelops.ourjek.activity.save_address

import android.content.Context
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.json.ResponseJson
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.models.save_address.AddressTypeModel
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SaveUserAddressPresenter(val context: Context, val view: SaveUserAddressContractor.View) :
    SaveUserAddressContractor.Presenter {

    override fun saveAddress(
        locationWrapper: LocationWrapper?,
        selectedAddressModel: AddressTypeModel,
        alternateName: String?,
        additionalInfo: String?
    ) {
        val loggedInUser = BaseApp.getInstance(context).loginUser
        val addressTitle = if (selectedAddressModel.enableUserToAddName) {
            alternateName
        } else {
            ""
        }

        val saveUserAddressBody = SaveUserAddressBody(
            loggedInUser.id,
            locationWrapper?.locationName,
            locationWrapper?.latitude,
            locationWrapper?.longitude,
            selectedAddressModel.id,
            addressTitle,
            additionalInfo
        )

        val service = ServiceGenerator.createService(
            UserService::class.java,
            loggedInUser.email,
            loggedInUser.password,
            loggedInUser.token
        )
        service.saveUserAddress(saveUserAddressBody).enqueue(object : Callback<ResponseJson> {
            override fun onResponse(call: Call<ResponseJson>, response: Response<ResponseJson>) {
                if (response.isSuccessful) {
                    view.onSaveSuccess()
                }
                else {
                    view.onSaveFailure("Could not save the address")
                }
            }

            override fun onFailure(call: Call<ResponseJson>, t: Throwable) {
                view.onSaveFailure("Could not save the address")
            }

        })
    }


}

class SaveUserAddressBody(
    var id_customer: String,
    var addressName: String?,
    var latitude: Double?,
    var longitude: Double?,
    var addressType: Int,
    var addressTitle: String?,
    var additionalInfo: String?
)