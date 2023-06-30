package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SliderModel {
    @Expose
    @SerializedName("foto")
    val foto: String? = null

    @Expose
    @SerializedName("fitur_promosi")
    val fitur_promosi = 0

    @Expose
    @SerializedName("link_promosi")
    val link_promosi: String? = null

    @Expose
    @SerializedName("id_kategori_item")
    val category_id: String? = null

    @Expose
    @SerializedName("id_item")
    val id_item: String? = null

    @Expose
    @SerializedName("type_promosi")
    val type_promosi: String? = null

    @Expose
    @SerializedName("id_merchant")
    val id_merchant: String? = null

    @Expose
    @SerializedName("id_fitur")
    val id_fitur: String? = null

    @Expose
    @SerializedName("latitude_merchant")
    val latitude_merchant: String? = null

    @Expose
    @SerializedName("longitude_merchant")
    val longitude_merchant: String? = null

    @Expose
    @SerializedName("icon")
    val icon: String? = null

}