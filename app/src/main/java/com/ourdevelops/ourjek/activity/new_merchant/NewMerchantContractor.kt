package com.ourdevelops.ourjek.activity.new_merchant

import com.ourdevelops.ourjek.models.MerchantNearModel
import java.util.ArrayList

interface NewMerchantContractor {

    interface View{
        fun onShowProgress()
        fun onHideProgress()
        fun onNoDataFound()
        fun setAddressData(address: String)
        fun onSearchDataFound(data: MutableList<MerchantNearModel>)
        fun goToMerchantDetail(mainData: MerchantNearModel)
        fun onResponseSuccess(data: ArrayList<MerchantNearModel>?)

    }

    interface Presenter{
        fun onRequestAddress()
        fun searchMerchant(toSearch: String, filterId: String)
        fun getAllMerchants(filterId: String)
    }

    interface Adapter{

    }

}