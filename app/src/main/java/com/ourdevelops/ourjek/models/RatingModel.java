package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class RatingModel extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("fotopelanggan")
    private String fotopelanggan;

    @Expose
    @SerializedName("fullnama")
    private String fullnama;

    @Expose
    @SerializedName("update_at")
    private String update_at;

    @Expose
    @SerializedName("catatan")
    private String catatan;

    @Expose
    @SerializedName("rating")
    private String rating;





    public String getFotopelanggan() {
        return fotopelanggan;
    }

    public void setFotopelanggan(String fotopelanggan) {
        this.fotopelanggan = fotopelanggan;
    }

    public String getFullnama() {
        return fullnama;
    }

    public void setFullnama(String fullnama) {
        this.fullnama = fullnama;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


}
