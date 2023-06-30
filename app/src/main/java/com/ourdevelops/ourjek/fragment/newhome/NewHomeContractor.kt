package com.ourdevelops.ourjek.fragment.newhome

import com.ourdevelops.ourjek.models.AllFiturModel
import com.ourdevelops.ourjek.models.VehicleModel
import com.ourdevelops.ourjek.models.home.NewHomeModel

interface NewHomeContractor {

    interface View {
        fun onResponseSuccess(response: ArrayList<NewHomeModel>, allFiturData: ArrayList<AllFiturModel>)

        fun onResponseError(errorMessage: String, image: Int)

        fun onVehicleCategorySelected(item: VehicleModel)

        fun onResponseCheckRide(obj : NewHomeModel)

        fun onResponseCartAvailable(obj : NewHomeModel)

        fun removeHomeItem(obj : NewHomeModel)

        fun removeListItem(position : Int)
    }

    interface Presenter {

        fun initializeHome()

        fun requestData()
    }
}