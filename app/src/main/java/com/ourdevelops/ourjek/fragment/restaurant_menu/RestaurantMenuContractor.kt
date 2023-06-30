package com.ourdevelops.ourjek.fragment.restaurant_menu

import com.ourdevelops.ourjek.models.ItemModel

interface RestaurantMenuContractor {

    interface View {
        fun onResponseSuccess(response : ArrayList<ItemModel>)
        fun onResponseError(errorMessage : String)
        fun onItemClicked(position : Int)
        fun onItemFound(position: Int)
    }

    interface Presenter {
        fun requestData(latitude: String?, longitude: String?, restaurantId: String?, categoryId: String?)
    }

}