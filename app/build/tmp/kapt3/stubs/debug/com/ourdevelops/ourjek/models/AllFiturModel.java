package com.ourdevelops.ourjek.models;

import java.lang.System;

/**
 * Created by Pagodalabs
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R \u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R \u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R \u0010(\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R \u0010+\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R \u0010.\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001e\u00101\u001a\u00020#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010\'\u00a8\u00064"}, d2 = {"Lcom/ourdevelops/ourjek/models/AllFiturModel;", "Ljava/io/Serializable;", "Lio/realm/RealmObject;", "()V", "biaya", "", "getBiaya", "()J", "setBiaya", "(J)V", "biayaAkhir", "", "getBiayaAkhir", "()D", "setBiayaAkhir", "(D)V", "biaya_minimum", "getBiaya_minimum", "setBiaya_minimum", "diskon", "", "getDiskon", "()Ljava/lang/String;", "setDiskon", "(Ljava/lang/String;)V", "fitur", "getFitur", "setFitur", "home", "getHome", "setHome", "icon", "getIcon", "setIcon", "idFitur", "", "getIdFitur", "()I", "setIdFitur", "(I)V", "job", "getJob", "setJob", "keterangan", "getKeterangan", "setKeterangan", "keteranganBiaya", "getKeteranganBiaya", "setKeteranganBiaya", "vehicle_category_id", "getVehicle_category_id", "setVehicle_category_id", "app_debug"})
public class AllFiturModel extends io.realm.RealmObject implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "id_fitur")
    @com.google.gson.annotations.Expose()
    @io.realm.annotations.PrimaryKey()
    private int idFitur = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "fitur")
    @com.google.gson.annotations.Expose()
    private java.lang.String fitur;
    @com.google.gson.annotations.SerializedName(value = "biaya")
    @com.google.gson.annotations.Expose()
    private long biaya = 0L;
    @com.google.gson.annotations.SerializedName(value = "biaya_minimum")
    @com.google.gson.annotations.Expose()
    private long biaya_minimum = 0L;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "keterangan_biaya")
    @com.google.gson.annotations.Expose()
    private java.lang.String keteranganBiaya;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "keterangan")
    @com.google.gson.annotations.Expose()
    private java.lang.String keterangan;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "diskon")
    @com.google.gson.annotations.Expose()
    private java.lang.String diskon;
    @com.google.gson.annotations.SerializedName(value = "biaya_akhir")
    @com.google.gson.annotations.Expose()
    private double biayaAkhir = 0.0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "icon")
    @com.google.gson.annotations.Expose()
    private java.lang.String icon;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "driver_job")
    @com.google.gson.annotations.Expose()
    private java.lang.String job;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "home")
    @com.google.gson.annotations.Expose()
    private java.lang.String home;
    @com.google.gson.annotations.SerializedName(value = "vehicle_category_id")
    @com.google.gson.annotations.Expose()
    private int vehicle_category_id = 0;
    
    public AllFiturModel() {
        super();
    }
    
    public final int getIdFitur() {
        return 0;
    }
    
    public final void setIdFitur(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFitur() {
        return null;
    }
    
    public final void setFitur(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getBiaya() {
        return 0L;
    }
    
    public final void setBiaya(long p0) {
    }
    
    public final long getBiaya_minimum() {
        return 0L;
    }
    
    public final void setBiaya_minimum(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKeteranganBiaya() {
        return null;
    }
    
    public final void setKeteranganBiaya(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKeterangan() {
        return null;
    }
    
    public final void setKeterangan(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiskon() {
        return null;
    }
    
    public final void setDiskon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getBiayaAkhir() {
        return 0.0;
    }
    
    public final void setBiayaAkhir(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHome() {
        return null;
    }
    
    public final void setHome(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getVehicle_category_id() {
        return 0;
    }
    
    public final void setVehicle_category_id(int p0) {
    }
}