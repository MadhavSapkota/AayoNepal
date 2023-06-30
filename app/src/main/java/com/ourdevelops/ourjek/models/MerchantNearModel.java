package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class MerchantNearModel extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("id_merchant")
    private String id_merchant;

    @Expose
    @SerializedName("nama_merchant")
    private String nama_merchant;

    @Expose
    @SerializedName("alamat_merchant")
    private String alamat_merchant;

    @Expose
    @SerializedName("latitude_merchant")
    private String latitude_merchant;

    @Expose
    @SerializedName("longitude_merchant")
    private String longitude_merchant;

    @Expose
    @SerializedName("jam_buka")
    private String jam_buka;

    @Expose
    @SerializedName("jam_tutup")
    private String jam_tutup;

    @Expose
    @SerializedName("deskripsi_merchant")
    private String deskripsi_merchant;

    @Expose
    @SerializedName("nama_kategori")
    private String category_merchant;

    @Expose
    @SerializedName("foto_merchant")
    private String foto_merchant;

    @Expose
    @SerializedName("telepon_merchant")
    private String telepon_merchant;

    @Expose
    @SerializedName("status_promo")
    private String status_promo;

    @Expose
    @SerializedName("maks_distance")
    private String distance;

    public String getId_merchant() {
        return id_merchant;
    }

    public void setId_merchant(String id_merchant) {
        this.id_merchant = id_merchant;
    }

    public String getNama_merchant() {
        return nama_merchant;
    }

    public void setNama_merchant(String nama_merchant) {
        this.nama_merchant = nama_merchant;
    }

    public String getAlamat_merchant() {
        return alamat_merchant;
    }

    public void setAlamat_merchant(String alamat_merchant) {
        this.alamat_merchant = alamat_merchant;
    }

    public String getLatitude_merchant() {
        return latitude_merchant;
    }

    public void setLatitude_merchant(String latitude_merchant) {
        this.latitude_merchant = latitude_merchant;
    }

    public String getLongitude_merchant() {
        return longitude_merchant;
    }

    public void setLongitude_merchant(String longitude_merchant) {
        this.longitude_merchant = longitude_merchant;
    }

    public String getJam_buka() {
        return jam_buka;
    }

    public void setJam_buka(String jam_buka) {
        this.jam_buka = jam_buka;
    }

    public String getJam_tutup() {
        return jam_tutup;
    }

    public void setJam_tutup(String jam_tutup) {
        this.jam_tutup = jam_tutup;
    }

    public String getDeskripsi_merchant() {
        return deskripsi_merchant;
    }

    public void setDeskripsi_merchant(String deskripsi_merchant) {
        this.deskripsi_merchant = deskripsi_merchant;
    }

    public String getCategory_merchant() {
        return category_merchant;
    }

    public void setCategory_merchant(String category_merchant) {
        this.category_merchant = category_merchant;
    }

    public String getFoto_merchant() {
        return foto_merchant;
    }

    public void setFoto_merchant(String foto_merchant) {
        this.foto_merchant = foto_merchant;
    }

    public String getTelepon_merchant() {
        return telepon_merchant;
    }

    public void setTelepon_merchant(String telepon_merchant) {
        this.telepon_merchant = telepon_merchant;
    }


    public String getStatus_promo() {
        return status_promo;
    }

    public void setStatus_promo(String status_promo) {
        this.status_promo = status_promo;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

}
