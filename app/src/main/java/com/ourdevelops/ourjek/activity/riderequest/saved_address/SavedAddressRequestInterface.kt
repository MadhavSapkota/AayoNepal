package com.ourdevelops.ourjek.activity.riderequest.saved_address

import com.ourdevelops.ourjek.json.SavedAddressObj

interface SavedAddressRequestInterface {

    fun onSavedAddressResponse(savedAddressResponse : ArrayList<SavedAddressObj>)

    fun onSavedAddressTapped(obj : SavedAddressObj)

}