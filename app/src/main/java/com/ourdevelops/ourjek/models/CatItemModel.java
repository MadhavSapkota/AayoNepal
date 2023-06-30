package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class CatItemModel extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("nama_kategori_item")
    private String nama_kategori_item;

    @Expose
    @SerializedName("id_kategori_item")
    private String id_kategori_item;


    public String getId_kategori_item() {
        return id_kategori_item;
    }

    public void setId_kategori_item(String id_kategori_item) {
        this.id_kategori_item = id_kategori_item;
    }

    public String getNama_kategori() {
        return nama_kategori_item;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori_item = nama_kategori;
    }


}
