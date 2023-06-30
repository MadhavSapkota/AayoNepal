package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class HorizontalModel {
    @Expose
    @SerializedName("id_berita")
    val id_berita: String? = null

    @Expose
    @SerializedName("id_fitur")
    val id_fitur: String? = null

    @Expose
    @SerializedName("id_merchant")
    var idMerchant: String? = null

    @Expose
    @SerializedName("title")
    val title: String? = null

    @Expose
    @SerializedName("content")
    val content: String? = null

    @Expose
    @SerializedName("id_kategori_item")
    val category_id: String? = null

    @Expose
    @SerializedName("id_item")
    val id_item: String? = null

    @Expose
    @SerializedName("foto_berita")
    val foto_berita: String? = null

    @Expose
    @SerializedName("created_berita")
    val created_berita: String? = null

    @Expose
    @SerializedName("kategori")
    val kategori: String? = null
}