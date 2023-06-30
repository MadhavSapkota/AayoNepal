package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class CatMerchantModel extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("id_kategori_merchant")
    private String id_kategori_merchant;

    @Expose
    @SerializedName("nama_kategori")
    private String nama_kategori;

    @Expose
    @SerializedName("foto_kategori")
    private String foto_kategori;

    @Expose
    @SerializedName("id_fitur")
    private String id_fitur;





    public String getId_kategori_merchant() {
        return id_kategori_merchant;
    }

    public void setId_kategori_merchant(String id_kategori_merchant) {
        this.id_kategori_merchant = id_kategori_merchant;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getFoto_kategori() {
        return foto_kategori;
    }

    public void setFoto_kategori(String foto_kategori) {
        this.foto_kategori = foto_kategori;
    }

    public String getId_fitur() {
        return id_fitur;
    }

    public void setId_fitur(String id_fitur) {
        this.id_fitur = id_fitur;
    }


}
