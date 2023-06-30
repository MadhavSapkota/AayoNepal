package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class BankModel extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("id_bank")
    private String id_bank;

    @Expose
    @SerializedName("nama_bank")
    private String nama_bank;

    @Expose
    @SerializedName("image_bank")
    private String image_bank;

    @Expose
    @SerializedName("rekening_bank")
    private String rekening_bank;


    public String getId_bank() {
        return id_bank;
    }

    public void setId_bank(String id_bank) {
        this.id_bank = id_bank;
    }

    public String getNama_bank() {
        return nama_bank;
    }

    public void setNama_bank(String nama_bank) {
        this.nama_bank = nama_bank;
    }

    public String getRekening_bank() {
        return rekening_bank;
    }

    public void setRekening_bank(String rekening_bank) {
        this.rekening_bank = rekening_bank;
    }

    public String getImage_bank() {
        return image_bank;
    }

    public void setImage_bank(String image_bank) {
        this.image_bank = image_bank;
    }
}
