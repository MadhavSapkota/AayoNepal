package com.ourdevelops.ourjek.fragment.new_dynamic_home

import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.ServicesModel
import com.ourdevelops.ourjek.models.MerchantNearModel
import com.ourdevelops.ourjek.models.NewAllFeatureModel
import com.ourdevelops.ourjek.models.NewDynamicHomeModel

interface NewDynamicHomeContractor {

    interface View {
        fun onSessionExpired()
        fun onSessionSuccessful(
                newDynamicHomeData: ArrayList<NewDynamicHomeModel>?,
                allFiturData: ArrayList<NewAllFeatureModel>?,
                firstRestaurantName: String?)
        fun onShowProgress()
        fun onHideProgress()
        fun onOpenRideRequestPage(allFeatureModel: NewAllFeatureModel)
        fun onOpenBottomSheetFilter(id: Int)
        fun onMerchantSelected(id: Int)
        fun removeListItem(position: Int)
        fun onResponseCheckRide(newHomeModel: NewDynamicHomeModel)
        fun onResponseCartAvailable(newHomeModel: NewDynamicHomeModel)
        fun removeHomeItem(newHomeModel: NewDynamicHomeModel)
    }

    interface Presenter {
        fun onVehicleCategorySelected(servicesModel: ServicesModel)
        fun initializeData()
    }

}