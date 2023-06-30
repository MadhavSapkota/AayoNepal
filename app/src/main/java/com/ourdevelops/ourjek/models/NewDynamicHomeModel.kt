package com.ourdevelops.ourjek.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.constants.RideStatus
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.*

class NewDynamicHomeModel {
    @SerializedName("type")
    @Expose
    var type = ""

    @SerializedName("title")
    @Expose
    var title = ""

    @SerializedName("caption")
    @Expose
    var caption = ""

    @SerializedName("services")
    @Expose
    var services : ArrayList<ServicesModel>? = null

    @SerializedName("banner_single")
    @Expose
    var banner : ArrayList<BannerSingleModel>? = null

    @SerializedName("slider")
    @Expose
    var slider : ArrayList<SliderModel>? = null

    @SerializedName("vertical_list")
    @Expose
    var vertical : ArrayList<VerticalListModel>? = null

    @SerializedName("grid_item")
    @Expose
    var grid : ArrayList<GridModel>? = null

    @SerializedName("horizontal_list")
    @Expose
    var horizontal : ArrayList<HorizontalModel>? = null

    var restaurantItems: VerticalListModel? = null

    var rideStatus: RideStatus? = null

}