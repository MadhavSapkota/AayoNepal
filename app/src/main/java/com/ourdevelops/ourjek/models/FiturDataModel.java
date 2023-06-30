package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class FiturDataModel extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("id_fitur")
    private int idFitur;

    @Expose
    @SerializedName("fitur")
    private String fitur;

    @Expose
    @SerializedName("biaya")
    private long biaya;

    @Expose
    @SerializedName("biaya_minimum")
    private long biaya_minimum;

    @Expose
    @SerializedName("keterangan_biaya")
    private String keteranganBiaya;

    @Expose
    @SerializedName("keterangan")
    private String keterangan;

    @Expose
    @SerializedName("diskon")
    private String diskon;

    @Expose
    @SerializedName("biaya_akhir")
    private double biayaAkhir;

    @Expose
    @SerializedName("icon")
    private String icon;

    @Expose
    @SerializedName("driver_job")
    private String job;

    @Expose
    @SerializedName("home")
    private String home;



    public int getIdFitur() {
        return idFitur;
    }

    public void setIdFitur(int idFitur) {
        this.idFitur = idFitur;
    }

    public String getFitur() {
        return fitur;
    }

    public void setFitur(String fitur) {
        this.fitur = fitur;
    }

    public long getBiaya() {
        return biaya;
    }

    public void setBiaya(long biaya) {
        this.biaya = biaya;
    }

    public String getKeteranganBiaya() {
        return keteranganBiaya;
    }

    public void setKeteranganBiaya(String keteranganBiaya) {
        this.keteranganBiaya = keteranganBiaya;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public long getBiaya_minimum() {
        return biaya_minimum;
    }

    public void setBiaya_minimum(long biaya_minimum) {
        this.biaya_minimum = biaya_minimum;
    }

    public String getDiskon() { return diskon;    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public double getBiayaAkhir() {
        return biayaAkhir;
    }

    public void setBiayaAkhir(double biayaAkhir) {
        this.biayaAkhir = biayaAkhir;
    }

    public String getIcon() { return icon;    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHome() { return home;    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
