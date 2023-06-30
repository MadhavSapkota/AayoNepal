package com.ourdevelops.ourjek.activity.save_address

import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.models.save_address.AddressTypeModel

interface SaveUserAddressContractor {

    interface View {
        fun onSaveSuccess()
        fun onSaveFailure(errorMessage : String)
    }

    interface Presenter {
        fun saveAddress(
            locationWrapper: LocationWrapper?,
            selectedAddressModel: AddressTypeModel,
            alternateName: String?,
            additionalInfo: String?
        )
    }

}