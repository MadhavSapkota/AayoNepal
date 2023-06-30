package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class ItemModel extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("id_item")
    private int id_item;

    @Expose
    @SerializedName("nama_item")
    private String nama_item;

    @Expose
    @SerializedName("harga_item")
    private String harga_item;

    @Expose
    @SerializedName("harga_promo")
    private String harga_promo;

    @Expose
    @SerializedName("nama_kategori_item")
    private String kategori_item;

    @Expose
    @SerializedName("deskripsi_item")
    private String deskripsi_item;

    @Expose
    @SerializedName("foto_item")
    private String foto_item;

    @Expose
    @SerializedName("status_promo")
    private String status_promo;

    @Expose
    @SerializedName("discount")
    private String discount;

    @Expose
    @SerializedName("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getNama_item() {
        return nama_item;
    }

    public void setNama_item(String nama_item) {
        this.nama_item = nama_item;
    }

    public String getHarga_item() {
        return harga_item;
    }

    public void setHarga_item(String harga_item) {
        this.harga_item = harga_item;
    }

    public String getHarga_promo() {
        return harga_promo;
    }

    public void setHarga_promo(String harga_promo) {
        this.harga_promo = harga_promo;
    }

    public String getKategori_item() {
        return kategori_item;
    }

    public void setKategori_item(String kategori_item) {
        this.kategori_item = kategori_item;
    }

    public String getDeskripsi_item() {
        return deskripsi_item;
    }

    public void setDeskripsi_item(String deskripsi_item) {
        this.deskripsi_item = deskripsi_item;
    }

    public String getFoto_item() {
        return foto_item;
    }

    public void setFoto_item(String foto_item) {
        this.foto_item = foto_item;
    }

    public String getStatus_promo() {
        return status_promo;
    }

    public void setStatus_promo(String status_promo) {
        this.status_promo = status_promo;
    }


}
