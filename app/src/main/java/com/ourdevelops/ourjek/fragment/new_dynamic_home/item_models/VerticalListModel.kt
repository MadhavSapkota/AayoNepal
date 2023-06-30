package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class VerticalListModel : Serializable{
    @Expose
    @SerializedName("id_merchant")
    val id_merchant: String? = null

    @Expose
    @SerializedName("id_fitur")
    val id_fitur: String? = null

    @Expose
    @SerializedName("nama_merchant")
    val nama_merchant: String? = null

    @Expose
    @SerializedName("alamat_merchant")
    val alamat_merchant: String? = null

    @Expose
    @SerializedName("latitude_merchant")
    val latitude_merchant: String? = null

    @Expose
    @SerializedName("longitude_merchant")
    val longitude_merchant: String? = null

    @Expose
    @SerializedName("jam_buka")
    val jam_buka: String? = null

    @Expose
    @SerializedName("jam_tutup")
    val jam_tutup: String? = null

    @Expose
    @SerializedName("deskripsi_merchant")
    val deskripsi_merchant: String? = null

    @Expose
    @SerializedName("nama_kategori")
    val category_merchant: String? = null

    @Expose
    @SerializedName("foto_merchant")
    val foto_merchant: String? = null

    @Expose
    @SerializedName("telepon_merchant")
    val telepon_merchant: String? = null

    @Expose
    @SerializedName("status_promo")
    val status_promo: String? = null

    @Expose
    @SerializedName("maks_distance")
    val distance: String? = null
}