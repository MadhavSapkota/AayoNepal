package com.ourdevelops.ourjek.json;

import java.lang.System;

/**
 * Created by Pagodalabs
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020>R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R \u0010\'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR \u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u0002078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010!\"\u0004\bD\u0010#R \u0010E\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR \u0010H\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR \u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR \u0010N\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR \u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR \u0010T\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR \u0010W\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R \u0010]\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010c\u001a\u0002078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u00108\"\u0004\be\u0010:R \u0010f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\"\u0010i\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010n\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001e\u0010o\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010!\"\u0004\bq\u0010#R\u001e\u0010r\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010!\"\u0004\bt\u0010#R \u0010u\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR \u0010x\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR#\u0010{\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0011\n\u0003\u0010\u0080\u0001\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0081\u0001\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010n\u001a\u0005\b\u0082\u0001\u0010k\"\u0005\b\u0083\u0001\u0010mR#\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\b\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/ourdevelops/ourjek/json/SendRequestJson;", "Ljava/io/Serializable;", "()V", "alamatAsal", "", "getAlamatAsal", "()Ljava/lang/String;", "setAlamatAsal", "(Ljava/lang/String;)V", "alamatTujuan", "getAlamatTujuan", "setAlamatTujuan", "chosenEstimatedWeight", "getChosenEstimatedWeight", "setChosenEstimatedWeight", "deliveryDateTime", "getDeliveryDateTime", "setDeliveryDateTime", "deliveryFee", "getDeliveryFee", "setDeliveryFee", "deliveryId", "getDeliveryId", "setDeliveryId", "discount", "getDiscount", "setDiscount", "discountTotal", "getDiscountTotal", "setDiscountTotal", "endLatitude", "", "getEndLatitude", "()D", "setEndLatitude", "(D)V", "endLongitude", "getEndLongitude", "setEndLongitude", "estimasi", "getEstimasi", "setEstimasi", "estimatedWeightPrice", "getEstimatedWeightPrice", "setEstimatedWeightPrice", "harga", "", "getHarga", "()J", "setHarga", "(J)V", "idPelanggan", "getIdPelanggan", "setIdPelanggan", "isComplimentary", "", "()Z", "setComplimentary", "(Z)V", "isDeliveryFree", "setDeliveryFree", "isPakaiMpay", "", "()I", "setPakaiMpay", "(I)V", "jarak", "getJarak", "setJarak", "kreditpromo", "getKreditpromo", "setKreditpromo", "loaderFee", "getLoaderFee", "setLoaderFee", "namaBarang", "getNamaBarang", "setNamaBarang", "namaPenerima", "getNamaPenerima", "setNamaPenerima", "namaPengirim", "getNamaPengirim", "setNamaPengirim", "orderFitur", "getOrderFitur", "setOrderFitur", "paymentMethodRequestJson", "Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "getPaymentMethodRequestJson", "()Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "setPaymentMethodRequestJson", "(Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;)V", "promo", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "getPromo", "()Lcom/ourdevelops/ourjek/models/KodePromoModel;", "setPromo", "(Lcom/ourdevelops/ourjek/models/KodePromoModel;)V", "promoStatus", "getPromoStatus", "setPromoStatus", "remarks", "getRemarks", "setRemarks", "selectedNumberOfLoaders", "getSelectedNumberOfLoaders", "()Ljava/lang/Integer;", "setSelectedNumberOfLoaders", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "startLatitude", "getStartLatitude", "setStartLatitude", "startLongitude", "getStartLongitude", "setStartLongitude", "teleponPenerima", "getTeleponPenerima", "setTeleponPenerima", "teleponPengirim", "getTeleponPengirim", "setTeleponPengirim", "total", "getTotal", "()Ljava/lang/Double;", "setTotal", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "vehicle_category_id", "getVehicle_category_id", "setVehicle_category_id", "weightFee", "getWeightFee", "setWeightFee", "setPakaiWallet", "", "pakaiMpay", "app_debug"})
public final class SendRequestJson implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id_pelanggan")
    @com.google.gson.annotations.Expose()
    private java.lang.String idPelanggan;
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
    @com.google.gson.annotations.SerializedName(value = "alamat_asal")
    @com.google.gson.annotations.Expose()
    private java.lang.String alamatAsal;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "alamat_tujuan")
    @com.google.gson.annotations.Expose()
    private java.lang.String alamatTujuan;
    @com.google.gson.annotations.SerializedName(value = "pakai_wallet")
    @com.google.gson.annotations.Expose()
    private int isPakaiMpay = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "kredit_promo")
    @com.google.gson.annotations.Expose()
    private java.lang.String kreditpromo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "estimasi")
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
    @com.google.gson.annotations.SerializedName(value = "chosen_weight")
    @com.google.gson.annotations.Expose()
    private java.lang.String chosenEstimatedWeight;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weight_price")
    @com.google.gson.annotations.Expose()
    private java.lang.String estimatedWeightPrice;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "remarks")
    @com.google.gson.annotations.Expose()
    private java.lang.String remarks;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "number_of_loaders")
    @com.google.gson.annotations.Expose()
    private java.lang.Integer selectedNumberOfLoaders;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "delivery_date_time")
    @com.google.gson.annotations.Expose()
    private java.lang.String deliveryDateTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "delivery_fee")
    @com.google.gson.annotations.Expose()
    private java.lang.String deliveryFee;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "delivery_type_id")
    @com.google.gson.annotations.Expose()
    private java.lang.String deliveryId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weight_fee")
    @com.google.gson.annotations.Expose()
    private java.lang.String weightFee;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "loader_fee")
    @com.google.gson.annotations.Expose()
    private java.lang.String loaderFee;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total")
    @com.google.gson.annotations.Expose()
    private java.lang.Double total;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vehicle_category_id")
    @com.google.gson.annotations.Expose()
    private java.lang.Integer vehicle_category_id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "payment_details")
    @com.google.gson.annotations.Expose()
    private com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "discount_total")
    @com.google.gson.annotations.Expose()
    private java.lang.String discountTotal;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "discount")
    @com.google.gson.annotations.Expose()
    private java.lang.String discount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "promo")
    @com.google.gson.annotations.Expose()
    private com.ourdevelops.ourjek.models.KodePromoModel promo;
    @com.google.gson.annotations.SerializedName(value = "promo_status")
    @com.google.gson.annotations.Expose()
    private boolean promoStatus = false;
    @com.google.gson.annotations.SerializedName(value = "isDeliveryFree")
    @com.google.gson.annotations.Expose()
    private boolean isDeliveryFree = false;
    @com.google.gson.annotations.SerializedName(value = "isComplimentary")
    @com.google.gson.annotations.Expose()
    private boolean isComplimentary = false;
    
    public SendRequestJson() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdPelanggan() {
        return null;
    }
    
    public final void setIdPelanggan(@org.jetbrains.annotations.Nullable()
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
    
    public final int isPakaiMpay() {
        return 0;
    }
    
    public final void setPakaiMpay(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKreditpromo() {
        return null;
    }
    
    public final void setKreditpromo(@org.jetbrains.annotations.Nullable()
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
    
    public final void setPakaiWallet(int pakaiMpay) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChosenEstimatedWeight() {
        return null;
    }
    
    public final void setChosenEstimatedWeight(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEstimatedWeightPrice() {
        return null;
    }
    
    public final void setEstimatedWeightPrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    public final void setRemarks(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedNumberOfLoaders() {
        return null;
    }
    
    public final void setSelectedNumberOfLoaders(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryDateTime() {
        return null;
    }
    
    public final void setDeliveryDateTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryFee() {
        return null;
    }
    
    public final void setDeliveryFee(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryId() {
        return null;
    }
    
    public final void setDeliveryId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWeightFee() {
        return null;
    }
    
    public final void setWeightFee(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLoaderFee() {
        return null;
    }
    
    public final void setLoaderFee(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVehicle_category_id() {
        return null;
    }
    
    public final void setVehicle_category_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.json.PaymentMethodRequestJson getPaymentMethodRequestJson() {
        return null;
    }
    
    public final void setPaymentMethodRequestJson(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.json.PaymentMethodRequestJson p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscountTotal() {
        return null;
    }
    
    public final void setDiscountTotal(@org.jetbrains.annotations.Nullable()
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
    public final com.ourdevelops.ourjek.models.KodePromoModel getPromo() {
        return null;
    }
    
    public final void setPromo(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.KodePromoModel p0) {
    }
    
    public final boolean getPromoStatus() {
        return false;
    }
    
    public final void setPromoStatus(boolean p0) {
    }
    
    public final boolean isDeliveryFree() {
        return false;
    }
    
    public final void setDeliveryFree(boolean p0) {
    }
    
    public final boolean isComplimentary() {
        return false;
    }
    
    public final void setComplimentary(boolean p0) {
    }
}