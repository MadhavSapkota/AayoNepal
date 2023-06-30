package com.ourdevelops.ourjek.activity.riderequest.map_handler

import com.ourdevelops.ourjek.models.LocationWrapper

interface RideRequestMapHandlerContractor {

    interface View {
        fun onRouteResponse(response : String)
    }

    interface Presenter {
        fun requestRoute(pickUpWrapper : LocationWrapper, destinationWrapper : LocationWrapper)
    }

}