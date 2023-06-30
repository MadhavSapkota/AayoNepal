package com.ourdevelops.ourjek.models;

import java.lang.System;

/**
 * Created by Pagodalabs
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR \u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR \u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b\'\u0010\tR\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR \u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR \u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR \u00107\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001c\"\u0004\bA\u0010\u001eR \u0010B\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR \u0010E\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR \u0010H\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR \u0010K\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR \u0010N\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR \u0010Q\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0007\"\u0004\bS\u0010\tR \u0010T\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0007\"\u0004\bV\u0010\tR \u0010W\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0007\"\u0004\bY\u0010\tR \u0010Z\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0007\"\u0004\b\\\u0010\tR \u0010]\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0007\"\u0004\b_\u0010\tR \u0010`\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0007\"\u0004\bb\u0010\tR \u0010c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0007\"\u0004\be\u0010\tR \u0010f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0007\"\u0004\bh\u0010\tR \u0010i\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0007\"\u0004\bk\u0010\tR\u001e\u0010l\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u001c\"\u0004\bn\u0010\u001eR\u001e\u0010o\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u001c\"\u0004\bq\u0010\u001eR \u0010r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0007\"\u0004\bt\u0010\tR \u0010u\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0007\"\u0004\bw\u0010\tR \u0010x\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0007\"\u0004\bz\u0010\tR \u0010{\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0007\"\u0004\b}\u0010\tR!\u0010~\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0007\"\u0005\b\u0080\u0001\u0010\tR#\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0007\"\u0005\b\u0083\u0001\u0010\tR#\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0007\"\u0005\b\u0086\u0001\u0010\tR&\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R&\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008a\u0001\"\u0006\b\u008f\u0001\u0010\u008c\u0001\u00a8\u0006\u0090\u0001"}, d2 = {"Lcom/ourdevelops/ourjek/models/TransaksiModel;", "Lio/realm/RealmObject;", "Ljava/io/Serializable;", "()V", "alamatAsal", "", "getAlamatAsal", "()Ljava/lang/String;", "setAlamatAsal", "(Ljava/lang/String;)V", "alamatTujuan", "getAlamatTujuan", "setAlamatTujuan", "biaya_akhir", "getBiaya_akhir", "setBiaya_akhir", "delivery_type", "getDelivery_type", "setDelivery_type", "discount", "getDiscount", "setDiscount", "discount_total", "getDiscount_total", "setDiscount_total", "endLatitude", "", "getEndLatitude", "()D", "setEndLatitude", "(D)V", "endLongitude", "getEndLongitude", "setEndLongitude", "estimasi", "getEstimasi", "setEstimasi", "grand_total", "getGrand_total", "setGrand_total", "harga", "", "getHarga", "()J", "setHarga", "(J)V", "id", "getId", "setId", "idDriver", "getIdDriver", "setIdDriver", "idPelanggan", "getIdPelanggan", "setIdPelanggan", "idtransmerchant", "getIdtransmerchant", "setIdtransmerchant", "isPakaiWallet", "", "()Z", "setPakaiWallet", "(Z)V", "jarak", "getJarak", "setJarak", "kodePromo", "getKodePromo", "setKodePromo", "kreditPromo", "getKreditPromo", "setKreditPromo", "namaBarang", "getNamaBarang", "setNamaBarang", "namaPenerima", "getNamaPenerima", "setNamaPenerima", "namaPengirim", "getNamaPengirim", "setNamaPengirim", "nama_merchant", "getNama_merchant", "setNama_merchant", "orderFitur", "getOrderFitur", "setOrderFitur", "promo_code", "getPromo_code", "setPromo_code", "rate", "getRate", "setRate", "receiver_name", "getReceiver_name", "setReceiver_name", "receiver_number", "getReceiver_number", "setReceiver_number", "sender_name", "getSender_name", "setSender_name", "sender_number", "getSender_number", "setSender_number", "service_charge", "getService_charge", "setService_charge", "startLatitude", "getStartLatitude", "setStartLatitude", "startLongitude", "getStartLongitude", "setStartLongitude", "status", "getStatus", "setStatus", "teleponPenerima", "getTeleponPenerima", "setTeleponPenerima", "teleponPengirim", "getTeleponPengirim", "setTeleponPengirim", "token_merchant", "getToken_merchant", "setToken_merchant", "total_biaya", "getTotal_biaya", "setTotal_biaya", "total_price", "getTotal_price", "setTotal_price", "vat", "getVat", "setVat", "waktuOrder", "Ljava/util/Date;", "getWaktuOrder", "()Ljava/util/Date;", "setWaktuOrder", "(Ljava/util/Date;)V", "waktuSelesai", "getWaktuSelesai", "setWaktuSelesai", "app_debug"})
public class TransaksiModel extends io.realm.RealmObject implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    @com.google.gson.annotations.Expose()
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
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    @com.google.gson.annotations.Expose()
    private java.lang.String status;
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
    @com.google.gson.annotations.SerializedName(value = "biaya_akhir")
    @com.google.gson.annotations.Expose()
    private java.lang.String biaya_akhir;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_biaya")
    @com.google.gson.annotations.Expose()
    private java.lang.String total_biaya;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nama_merchant")
    @com.google.gson.annotations.Expose()
    private java.lang.String nama_merchant;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "token_merchant")
    @com.google.gson.annotations.Expose()
    private java.lang.String token_merchant;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id_trans_merchant")
    @com.google.gson.annotations.Expose()
    private java.lang.String idtransmerchant;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vat_amount")
    @com.google.gson.annotations.Expose()
    private java.lang.String vat;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "service_charge_amount")
    @com.google.gson.annotations.Expose()
    private java.lang.String service_charge;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "discount")
    @com.google.gson.annotations.Expose()
    private java.lang.String discount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "discount_total")
    @com.google.gson.annotations.Expose()
    private java.lang.String discount_total;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "grand_total")
    @com.google.gson.annotations.Expose()
    private java.lang.String grand_total;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "item_category")
    @com.google.gson.annotations.Expose()
    private java.lang.String delivery_type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sender_name")
    @com.google.gson.annotations.Expose()
    private java.lang.String sender_name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sender_phone")
    @com.google.gson.annotations.Expose()
    private java.lang.String sender_number;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "receiver_name")
    @com.google.gson.annotations.Expose()
    private java.lang.String receiver_name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "receiver_phone")
    @com.google.gson.annotations.Expose()
    private java.lang.String receiver_number;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_price")
    @com.google.gson.annotations.Expose()
    private java.lang.String total_price;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "promo_code")
    @com.google.gson.annotations.Expose()
    private java.lang.String promo_code;
    
    public TransaksiModel() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public final java.lang.String getBiaya_akhir() {
        return null;
    }
    
    public final void setBiaya_akhir(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal_biaya() {
        return null;
    }
    
    public final void setTotal_biaya(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNama_merchant() {
        return null;
    }
    
    public final void setNama_merchant(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken_merchant() {
        return null;
    }
    
    public final void setToken_merchant(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdtransmerchant() {
        return null;
    }
    
    public final void setIdtransmerchant(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVat() {
        return null;
    }
    
    public final void setVat(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getService_charge() {
        return null;
    }
    
    public final void setService_charge(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscount() {
        return null;
    }
    
    public final void setDiscount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscount_total() {
        return null;
    }
    
    public final void setDiscount_total(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGrand_total() {
        return null;
    }
    
    public final void setGrand_total(@org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromo_code() {
        return null;
    }
    
    public final void setPromo_code(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}