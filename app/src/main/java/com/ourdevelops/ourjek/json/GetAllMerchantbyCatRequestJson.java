package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Pagodalabs on 10/13/2019.
 */

public class GetAllMerchantbyCatRequestJson {

    @SerializedName("latitude")
    @Expose
    private String lat;

    @SerializedName("longitude")
    @Expose
    private String lon;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("no_telepon")
    @Expose
    private String phone;

    @SerializedName("kategori")
    @Expose
    private String kategori;

    @SerializedName("fitur")
    @Expose
    private String fitur;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getFitur() {
        return fitur;
    }

    public void setFitur(String fitur) {
        this.fitur = fitur;
    }
}
