package com.ourdevelops.ourjek.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\nR \u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\nR \u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\nR \u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\nR \u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\nR \u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\nR \u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/ourdevelops/ourjek/models/KodePromoModel;", "Ljava/io/Serializable;", "()V", "complimentary", "", "getComplimentary", "()Ljava/lang/String;", "discountLimit", "getDiscountLimit", "setDiscountLimit", "(Ljava/lang/String;)V", "discountPer", "getDiscountPer", "setDiscountPer", "expired", "getExpired", "setExpired", "fitur", "getFitur", "setFitur", "imagepromo", "getImagepromo", "setImagepromo", "kodepromo", "getKodepromo", "setKodepromo", "namapromo", "getNamapromo", "setNamapromo", "promoType", "getPromoType", "setPromoType", "app_debug"})
public final class KodePromoModel implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nama_promo")
    @com.google.gson.annotations.Expose()
    private java.lang.String namapromo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "kode_promo")
    @com.google.gson.annotations.Expose()
    private java.lang.String kodepromo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "expired")
    @com.google.gson.annotations.Expose()
    private java.lang.String expired;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "complimentary")
    @com.google.gson.annotations.Expose()
    private final java.lang.String complimentary = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "image_promo")
    @com.google.gson.annotations.Expose()
    private java.lang.String imagepromo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "fitur")
    @com.google.gson.annotations.Expose()
    private java.lang.String fitur;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nominal_promo")
    @com.google.gson.annotations.Expose()
    private java.lang.String discountPer;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "promo_type")
    @com.google.gson.annotations.Expose()
    private java.lang.String promoType;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "discount_limit")
    @com.google.gson.annotations.Expose()
    private java.lang.String discountLimit;
    
    public KodePromoModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNamapromo() {
        return null;
    }
    
    public final void setNamapromo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKodepromo() {
        return null;
    }
    
    public final void setKodepromo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExpired() {
        return null;
    }
    
    public final void setExpired(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComplimentary() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImagepromo() {
        return null;
    }
    
    public final void setImagepromo(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getDiscountPer() {
        return null;
    }
    
    public final void setDiscountPer(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromoType() {
        return null;
    }
    
    public final void setPromoType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscountLimit() {
        return null;
    }
    
    public final void setDiscountLimit(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}