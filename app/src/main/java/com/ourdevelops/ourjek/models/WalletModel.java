package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by Pagodalabs
 */

public class WalletModel extends RealmObject implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("jumlah")
    @Expose
    private String jumlah;

    @SerializedName("waktu")
    @Expose
    private String waktu;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("nama_pemilik")
    @Expose
    private String namapemilik;

    @SerializedName("bank")
    @Expose
    private String bank;

    @SerializedName("status")
    @Expose
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNamapemilik() {
        return namapemilik;
    }

    public void setNamapemilik(String status) {
        this.namapemilik = namapemilik;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

}
