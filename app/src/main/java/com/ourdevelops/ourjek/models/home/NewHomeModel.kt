package com.ourdevelops.ourjek.models.home

class NewHomeModel() {
    var viewType: HomeViewType? = null
    var data: HomeGenericList<*>? = null

    constructor(viewType: HomeViewType) : this() {
        this.viewType = viewType
    }

    constructor(viewType: HomeViewType, data: HomeGenericList<*>) : this() {
        this.viewType = viewType
        this.data = data
    }

}

enum class HomeViewType {
    PICK_LOCATION,
    CATEGORY,
    SEARCH,
    FEATURED_RESTAURANTS,
    SPECIAL_OFFERS,
    SPACE,
    CART_VIEW,
    HELLO_VIEW,
    RESTAURANT_ITEM,
    ITEM_TITLE,
    RIDE_SEARCH_VIEW
}