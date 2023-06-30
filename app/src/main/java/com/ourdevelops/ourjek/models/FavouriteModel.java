package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class FavouriteModel extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("id_berita")
    private String id_berita;

    @Expose
    @SerializedName("title")
    private String title;

    @Expose
    @SerializedName("content")
    private String content;

    @Expose
    @SerializedName("foto_berita")
    private String foto_berita;

    @Expose
    @SerializedName("created_berita")
    private String created_berita;

    @Expose
    @SerializedName("kategori")
    private String kategori;

    @Expose
    @SerializedName("userid")
    private String userid;



    public String getIdberita() {
        return id_berita;
    }

    public void setIdberita(String id_berita) {
        this.id_berita = id_berita;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFotoberita() {
        return foto_berita;
    }

    public void setFotoberita(String foto_berita) {
        this.foto_berita = foto_berita;
    }

    public String getCreatedberita() {
        return created_berita;
    }

    public void setCreatedberita(String created_berita) {
        this.created_berita = created_berita;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }


}
