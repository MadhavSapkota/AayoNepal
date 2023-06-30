package com.ourdevelops.ourjek.json

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ourdevelops.ourjek.models.*

class NewDynamicHomeJson {
    @SerializedName("home_data")
    @Expose
    var newDynamicHome = ArrayList<NewDynamicHomeModel>()

    @SerializedName("customer_data")
    @Expose
    var customerData = User()

    @SerializedName("fitur")
    @Expose
    var feature = ArrayList<NewAllFeatureModel>()

    @SerializedName("app_settings")
    @Expose
    var settings = AppSettingsModel()
}

