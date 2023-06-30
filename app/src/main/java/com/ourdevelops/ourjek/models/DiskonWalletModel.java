package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by Pagodalabs
 */

public class DiskonWalletModel extends RealmObject implements Serializable {

    @SerializedName("diskon")
    @Expose
    private String diskon;
    @SerializedName("biaya_akhir")
    @Expose
    private Double biayaAkhir;

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public Double getBiayaAkhir() {
        return biayaAkhir;
    }

    public void setBiayaAkhir(Double biayaAkhir) {
        this.biayaAkhir = biayaAkhir;
    }
}
