package com.ourdevelops.ourjek.models;

import java.lang.System;

/**
 * Created by Pagodalabs
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR \u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b\'\u0010\tR \u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR \u0010+\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00108\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010\u0015R \u0010;\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR \u0010>\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010\tR \u0010A\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR \u0010D\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0007\"\u0004\bF\u0010\tR \u0010G\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0007\"\u0004\bI\u0010\tR \u0010J\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0007\"\u0004\bL\u0010\tR \u0010M\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0007\"\u0004\bO\u0010\tR \u0010P\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0007\"\u0004\bR\u0010\tR \u0010S\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0007\"\u0004\bU\u0010\tR\u001e\u0010V\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0013\"\u0004\bX\u0010\u0015R\u001e\u0010Y\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0013\"\u0004\b[\u0010\u0015R\u001e\u0010\\\u001a\u00020]8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR \u0010b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0007\"\u0004\bd\u0010\tR \u0010e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0007\"\u0004\bg\u0010\tR \u0010h\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010n\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010k\"\u0004\bp\u0010m\u00a8\u0006q"}, d2 = {"Lcom/ourdevelops/ourjek/models/TransaksiSendModel;", "Lio/realm/RealmObject;", "Ljava/io/Serializable;", "()V", "alamatAsal", "", "getAlamatAsal", "()Ljava/lang/String;", "setAlamatAsal", "(Ljava/lang/String;)V", "alamatTujuan", "getAlamatTujuan", "setAlamatTujuan", "delivery_type", "getDelivery_type", "setDelivery_type", "endLatitude", "", "getEndLatitude", "()D", "setEndLatitude", "(D)V", "endLongitude", "getEndLongitude", "setEndLongitude", "estimasi", "getEstimasi", "setEstimasi", "estimated_weight", "getEstimated_weight", "setEstimated_weight", "harga", "", "getHarga", "()J", "setHarga", "(J)V", "id", "getId", "setId", "idDriver", "getIdDriver", "setIdDriver", "idPelanggan", "getIdPelanggan", "setIdPelanggan", "isPakaiWallet", "", "()Z", "setPakaiWallet", "(Z)V", "isRental", "()Ljava/lang/Boolean;", "setRental", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "jarak", "getJarak", "setJarak", "kodePromo", "getKodePromo", "setKodePromo", "kreditPromo", "getKreditPromo", "setKreditPromo", "namaBarang", "getNamaBarang", "setNamaBarang", "namaPenerima", "getNamaPenerima", "setNamaPenerima", "namaPengirim", "getNamaPengirim", "setNamaPengirim", "number_of_loaders", "getNumber_of_loaders", "setNumber_of_loaders", "orderFitur", "getOrderFitur", "setOrderFitur", "rate", "getRate", "setRate", "remarks", "getRemarks", "setRemarks", "startLatitude", "getStartLatitude", "setStartLatitude", "startLongitude", "getStartLongitude", "setStartLongitude", "status", "", "getStatus", "()I", "setStatus", "(I)V", "teleponPenerima", "getTeleponPenerima", "setTeleponPenerima", "teleponPengirim", "getTeleponPengirim", "setTeleponPengirim", "waktuOrder", "Ljava/util/Date;", "getWaktuOrder", "()Ljava/util/Date;", "setWaktuOrder", "(Ljava/util/Date;)V", "waktuSelesai", "getWaktuSelesai", "setWaktuSelesai", "app_debug"})
public class TransaksiSendModel extends io.realm.RealmObject implements java.io.Serializable {
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
    @com.google.gson.annotations.SerializedName(value = "id_driver")
    @com.google.gson.annotations.Expose()
    private java.lang.String idDriver;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "order_fitur")
    @com.google.gson.annotations.Expose()
    private java.lang.String orderFitur;
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
    @com.google.gson.annotations.SerializedName(value = "status")
    @com.google.gson.annotations.Expose()
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "estimasi_time")
    @com.google.gson.annotations.Expose()
    private java.lang.String estimasi;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nama_pengirim")
    @com.google.gson.annotations.Expose()
    private java.lang.String namaPengirim;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "telepon_pengirim")
    @com.google.gson.annotations.Expose()
    private java.lang.String teleponPengirim;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nama_penerima")
    @com.google.gson.annotations.Expose()
    private java.lang.String namaPenerima;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "telepon_penerima")
    @com.google.gson.annotations.Expose()
    private java.lang.String teleponPenerima;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nama_barang")
    @com.google.gson.annotations.Expose()
    private java.lang.String namaBarang;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "number_of_loaders")
    @com.google.gson.annotations.Expose()
    private java.lang.String number_of_loaders;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "delivery_type")
    @com.google.gson.annotations.Expose()
    private java.lang.String delivery_type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "estimated_weight")
    @com.google.gson.annotations.Expose()
    private java.lang.String estimated_weight;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "isRental")
    @com.google.gson.annotations.Expose()
    private java.lang.Boolean isRental;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "remarks")
    @com.google.gson.annotations.Expose()
    private java.lang.String remarks;
    
    public TransaksiSendModel() {
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
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEstimasi() {
        return null;
    }
    
    public final void setEstimasi(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNamaPengirim() {
        return null;
    }
    
    public final void setNamaPengirim(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTeleponPengirim() {
        return null;
    }
    
    public final void setTeleponPengirim(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNamaPenerima() {
        return null;
    }
    
    public final void setNamaPenerima(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTeleponPenerima() {
        return null;
    }
    
    public final void setTeleponPenerima(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNamaBarang() {
        return null;
    }
    
    public final void setNamaBarang(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNumber_of_loaders() {
        return null;
    }
    
    public final void setNumber_of_loaders(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getEstimated_weight() {
        return null;
    }
    
    public final void setEstimated_weight(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isRental() {
        return null;
    }
    
    public final void setRental(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    public final void setRemarks(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}