package com.ourdevelops.ourjek.models;

import java.lang.System;

/**
 * Created by Pagodalabs
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R \u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR \u0010+\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR \u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR \u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR*\u00104\u001a\u0004\u0018\u00010\u00052\b\u00104\u001a\u0004\u0018\u00010\u00058\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR \u00107\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u0010\u001bR \u0010B\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR \u0010E\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR \u0010H\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR \u0010K\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR \u0010N\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR \u0010Q\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0007\"\u0004\bS\u0010\tR \u0010T\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0007\"\u0004\bV\u0010\tR \u0010W\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0007\"\u0004\bY\u0010\tR\u001e\u0010Z\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0019\"\u0004\b\\\u0010\u001bR\u001e\u0010]\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0019\"\u0004\b_\u0010\u001bR\u0012\u0010`\u001a\u00020a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R \u0010b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0007\"\u0004\bd\u0010\tR \u0010e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0007\"\u0004\bg\u0010\tR \u0010h\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0007\"\u0004\bj\u0010\tR \u0010k\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR \u0010q\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010n\"\u0004\bs\u0010p\u00a8\u0006t"}, d2 = {"Lcom/ourdevelops/ourjek/models/AllTransaksiModel;", "Lio/realm/RealmObject;", "Ljava/io/Serializable;", "()V", "after_discount", "", "getAfter_discount", "()Ljava/lang/String;", "setAfter_discount", "(Ljava/lang/String;)V", "alamatAsal", "getAlamatAsal", "setAlamatAsal", "alamatTujuan", "getAlamatTujuan", "setAlamatTujuan", "biayaakhir", "getBiayaakhir", "setBiayaakhir", "delivery_type", "getDelivery_type", "setDelivery_type", "endLatitude", "", "getEndLatitude", "()D", "setEndLatitude", "(D)V", "endLongitude", "getEndLongitude", "setEndLongitude", "fitur", "getFitur", "setFitur", "harga", "", "getHarga", "()J", "setHarga", "(J)V", "icon", "getIcon", "setIcon", "id", "getId", "setId", "idDriver", "getIdDriver", "setIdDriver", "idPelanggan", "getIdPelanggan", "setIdPelanggan", "idTransaksi", "getIdTransaksi", "setIdTransaksi", "id_fitur", "getId_fitur", "setId_fitur", "isPakaiWallet", "", "()Z", "setPakaiWallet", "(Z)V", "jarak", "getJarak", "setJarak", "kodePromo", "getKodePromo", "setKodePromo", "kreditPromo", "getKreditPromo", "setKreditPromo", "orderFitur", "getOrderFitur", "setOrderFitur", "rate", "getRate", "setRate", "receiver_name", "getReceiver_name", "setReceiver_name", "receiver_number", "getReceiver_number", "setReceiver_number", "sender_name", "getSender_name", "setSender_name", "sender_number", "getSender_number", "setSender_number", "startLatitude", "getStartLatitude", "setStartLatitude", "startLongitude", "getStartLongitude", "setStartLongitude", "status", "", "statustransaksi", "getStatustransaksi", "setStatustransaksi", "total_price", "getTotal_price", "setTotal_price", "totalbiaya", "getTotalbiaya", "setTotalbiaya", "waktuOrder", "Ljava/util/Date;", "getWaktuOrder", "()Ljava/util/Date;", "setWaktuOrder", "(Ljava/util/Date;)V", "waktuSelesai", "getWaktuSelesai", "setWaktuSelesai", "app_debug"})
public class AllTransaksiModel extends io.realm.RealmObject implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    @com.google.gson.annotations.Expose()
    @io.realm.annotations.PrimaryKey()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id_pelanggan")
    @com.google.gson.annotations.Expose()
    private java.lang.String idPelanggan;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id_transaksi")
    @com.google.gson.annotations.Expose()
    private java.lang.String idTransaksi;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id_driver")
    @com.google.gson.annotations.Expose()
    private java.lang.String idDriver;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "order_fitur")
    @com.google.gson.annotations.Expose()
    private java.lang.String orderFitur;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_biaya")
    @com.google.gson.annotations.Expose()
    private java.lang.String totalbiaya;
    @com.google.gson.annotations.SerializedName(value = "start_latitude")
    @com.google.gson.annotations.Expose()
    private double startLatitude = 0.0;
    @com.google.gson.annotations.SerializedName(value = "start_longitude")
    @com.google.gson.annotations.Expose()
    private double startLongitude = 0.0;
    @com.google.gson.annotations.SerializedName(value = "end_latitude")
    @com.google.gson.annotations.Expose()
    private double endLatitude = 0.0;
    @com.google.gson.annotations.SerializedName(value = "end_longitude")
    @com.google.gson.annotations.Expose()
    private double endLongitude = 0.0;
    @com.google.gson.annotations.SerializedName(value = "jarak")
    @com.google.gson.annotations.Expose()
    private double jarak = 0.0;
    @com.google.gson.annotations.SerializedName(value = "harga")
    @com.google.gson.annotations.Expose()
    private long harga = 0L;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "waktu_order")
    @com.google.gson.annotations.Expose()
    private java.util.Date waktuOrder;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "waktu_selesai")
    @com.google.gson.annotations.Expose()
    private java.util.Date waktuSelesai;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "alamat_asal")
    @com.google.gson.annotations.Expose()
    private java.lang.String alamatAsal;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "alamat_tujuan")
    @com.google.gson.annotations.Expose()
    private java.lang.String alamatTujuan;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "kode_promo")
    @com.google.gson.annotations.Expose()
    private java.lang.String kodePromo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "kredit_promo")
    @com.google.gson.annotations.Expose()
    private java.lang.String kreditPromo;
    @com.google.gson.annotations.SerializedName(value = "pakai_wallet")
    @com.google.gson.annotations.Expose()
    private boolean isPakaiWallet = false;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rate")
    @com.google.gson.annotations.Expose()
    private java.lang.String rate;
    @kotlin.jvm.JvmField()
    @com.google.gson.annotations.SerializedName(value = "status")
    @com.google.gson.annotations.Expose()
    public int status = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "icon")
    @com.google.gson.annotations.Expose()
    private java.lang.String icon;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "fitur")
    @com.google.gson.annotations.Expose()
    private java.lang.String fitur;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id_fitur")
    @com.google.gson.annotations.Expose()
    private java.lang.String id_fitur;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "biaya_akhir")
    @com.google.gson.annotations.Expose()
    private java.lang.String biayaakhir;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status_transaksi")
    @com.google.gson.annotations.Expose()
    private java.lang.String statustransaksi;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "after_discount")
    @com.google.gson.annotations.Expose()
    private java.lang.String after_discount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "item_category")
    @com.google.gson.annotations.Expose()
    private java.lang.String delivery_type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sender_name")
    @com.google.gson.annotations.Expose()
    private java.lang.String sender_name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sender_number")
    @com.google.gson.annotations.Expose()
    private java.lang.String sender_number;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "receiver_name")
    @com.google.gson.annotations.Expose()
    private java.lang.String receiver_name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "receiver_number")
    @com.google.gson.annotations.Expose()
    private java.lang.String receiver_number;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_price")
    @com.google.gson.annotations.Expose()
    private java.lang.String total_price;
    
    public AllTransaksiModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdPelanggan() {
        return null;
    }
    
    public final void setIdPelanggan(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdTransaksi() {
        return null;
    }
    
    public final void setIdTransaksi(@org.jetbrains.annotations.Nullable()
    java.lang.String idTransaksi) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdDriver() {
        return null;
    }
    
    public final void setIdDriver(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderFitur() {
        return null;
    }
    
    public final void setOrderFitur(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalbiaya() {
        return null;
    }
    
    public final void setTotalbiaya(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getStartLatitude() {
        return 0.0;
    }
    
    public final void setStartLatitude(double p0) {
    }
    
    public final double getStartLongitude() {
        return 0.0;
    }
    
    public final void setStartLongitude(double p0) {
    }
    
    public final double getEndLatitude() {
        return 0.0;
    }
    
    public final void setEndLatitude(double p0) {
    }
    
    public final double getEndLongitude() {
        return 0.0;
    }
    
    public final void setEndLongitude(double p0) {
    }
    
    public final double getJarak() {
        return 0.0;
    }
    
    public final void setJarak(double p0) {
    }
    
    public final long getHarga() {
        return 0L;
    }
    
    public final void setHarga(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getWaktuOrder() {
        return null;
    }
    
    public final void setWaktuOrder(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getWaktuSelesai() {
        return null;
    }
    
    public final void setWaktuSelesai(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlamatAsal() {
        return null;
    }
    
    public final void setAlamatAsal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlamatTujuan() {
        return null;
    }
    
    public final void setAlamatTujuan(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKodePromo() {
        return null;
    }
    
    public final void setKodePromo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKreditPromo() {
        return null;
    }
    
    public final void setKreditPromo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isPakaiWallet() {
        return false;
    }
    
    public final void setPakaiWallet(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRate() {
        return null;
    }
    
    public final void setRate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFitur() {
        return null;
    }
    
    public final void setFitur(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId_fitur() {
        return null;
    }
    
    public final void setId_fitur(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBiayaakhir() {
        return null;
    }
    
    public final void setBiayaakhir(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatustransaksi() {
        return null;
    }
    
    public final void setStatustransaksi(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAfter_discount() {
        return null;
    }
    
    public final void setAfter_discount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDelivery_type() {
        return null;
    }
    
    public final void setDelivery_type(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSender_name() {
        return null;
    }
    
    public final void setSender_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSender_number() {
        return null;
    }
    
    public final void setSender_number(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiver_name() {
        return null;
    }
    
    public final void setReceiver_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiver_number() {
        return null;
    }
    
    public final void setReceiver_number(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal_price() {
        return null;
    }
    
    public final void setTotal_price(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}