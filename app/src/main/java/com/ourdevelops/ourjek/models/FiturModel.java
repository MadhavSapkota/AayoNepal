package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class FiturModel extends RealmObject implements Serializable {

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
    @SerializedName("icon_driver")
    private String icon_driver;

    @Expose
    @SerializedName("home")
    private String home;

    @Expose
    @SerializedName("maks_distance")
    private String maksimumdist;

    @Expose
    @SerializedName("vehicle_category_id")
    private String vehicle_category_id;

    @Expose
    @SerializedName("minimum_fare")
    private String minimum_fare;


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

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public double getBiayaAkhir() {
        return biayaAkhir;
    }

    public void setBiayaAkhir(double biayaAkhir) {
        this.biayaAkhir = biayaAkhir;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getIcon_driver() {
        return icon_driver;
    }

    public void setIcon_driver(String icon_driver) {
        this.icon_driver = icon_driver;
    }

    public String getMaksimumdist() {
        return maksimumdist;
    }

    public void setMaksimumdist(String maksimumdist) {
        this.maksimumdist = maksimumdist;
    }

    public String getVehicle_category_id() {
        return vehicle_category_id;
    }

    public String getMinimum_fare() {
        return minimum_fare;
    }

    public void setMinimum_fare(String minimum_fare) {
        this.minimum_fare = minimum_fare;
    }

    public void setVehicle_category_id(String vehicle_category_id) {
        this.vehicle_category_id = vehicle_category_id;


    }
}
