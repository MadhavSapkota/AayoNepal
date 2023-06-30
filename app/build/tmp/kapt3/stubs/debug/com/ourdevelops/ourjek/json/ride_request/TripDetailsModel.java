package com.ourdevelops.ourjek.json.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b)\n\u0002\u0010\t\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020uR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR \u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR \u0010\'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR \u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR \u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR \u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR \u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR \u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR \u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR \u0010E\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR \u0010H\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR \u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR \u0010N\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR \u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR \u0010T\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR \u0010W\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001e\u0010Z\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0015\"\u0004\b\\\u0010\u0017R\u001e\u0010]\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0015\"\u0004\b_\u0010\u0017R \u0010`\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR \u0010c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR \u0010f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001e\u0010i\u001a\u00020j8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR \u0010o\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\b\u00a8\u0006v"}, d2 = {"Lcom/ourdevelops/ourjek/json/ride_request/TripDetailsModel;", "", "()V", "customerId", "", "getCustomerId", "()Ljava/lang/String;", "setCustomerId", "(Ljava/lang/String;)V", "destinationAddress", "getDestinationAddress", "setDestinationAddress", "discount", "getDiscount", "setDiscount", "discount_total", "getDiscount_total", "setDiscount_total", "distance", "", "getDistance", "()D", "setDistance", "(D)V", "endLatitude", "getEndLatitude", "setEndLatitude", "endLongitude", "getEndLongitude", "setEndLongitude", "estimatedTime", "getEstimatedTime", "setEstimatedTime", "finalCost", "getFinalCost", "setFinalCost", "grand_total", "getGrand_total", "setGrand_total", "id", "getId", "setId", "idDriver", "getIdDriver", "setIdDriver", "idtransmerchant", "getIdtransmerchant", "setIdtransmerchant", "itemName", "getItemName", "setItemName", "merchantName", "getMerchantName", "setMerchantName", "orderFeature", "getOrderFeature", "setOrderFeature", "pickupAddress", "getPickupAddress", "setPickupAddress", "price", "", "getPrice", "()J", "setPrice", "(J)V", "promoCode", "getPromoCode", "setPromoCode", "promoCredit", "getPromoCredit", "setPromoCredit", "rate", "getRate", "setRate", "recipientName", "getRecipientName", "setRecipientName", "recipientPhone", "getRecipientPhone", "setRecipientPhone", "senderName", "getSenderName", "setSenderName", "senderPhone", "getSenderPhone", "setSenderPhone", "service_charge", "getService_charge", "setService_charge", "startLatitude", "getStartLatitude", "setStartLatitude", "startLongitude", "getStartLongitude", "setStartLongitude", "status", "getStatus", "setStatus", "tokenMerchant", "getTokenMerchant", "setTokenMerchant", "totalCost", "getTotalCost", "setTotalCost", "useWallet", "", "getUseWallet", "()Z", "setUseWallet", "(Z)V", "vat", "getVat", "setVat", "initFromDb", "", "obj", "Lcom/ourdevelops/ourjek/models/TransaksiModel;", "app_debug"})
public final class TripDetailsModel {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    @com.google.gson.annotations.Expose()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "customerId")
    @com.google.gson.annotations.Expose()
    private java.lang.String customerId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "idDriver")
    @com.google.gson.annotations.Expose()
    private java.lang.String idDriver;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "orderFeature")
    @com.google.gson.annotations.Expose()
    private java.lang.String orderFeature;
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
    @com.google.gson.annotations.SerializedName(value = "distance")
    @com.google.gson.annotations.Expose()
    private double distance = 0.0;
    @com.google.gson.annotations.SerializedName(value = "price")
    @com.google.gson.annotations.Expose()
    private long price = 0L;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pickupAddress")
    @com.google.gson.annotations.Expose()
    private java.lang.String pickupAddress;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "destinationAddress")
    @com.google.gson.annotations.Expose()
    private java.lang.String destinationAddress;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "promoCode")
    @com.google.gson.annotations.Expose()
    private java.lang.String promoCode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "promoCredit")
    @com.google.gson.annotations.Expose()
    private java.lang.String promoCredit;
    @com.google.gson.annotations.SerializedName(value = "useWallet")
    @com.google.gson.annotations.Expose()
    private boolean useWallet = false;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rate")
    @com.google.gson.annotations.Expose()
    private java.lang.String rate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    @com.google.gson.annotations.Expose()
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "estimatedTime")
    @com.google.gson.annotations.Expose()
    private java.lang.String estimatedTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "finalCost")
    @com.google.gson.annotations.Expose()
    private java.lang.String finalCost;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "totalCost")
    @com.google.gson.annotations.Expose()
    private java.lang.String totalCost;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "merchantName")
    @com.google.gson.annotations.Expose()
    private java.lang.String merchantName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tokenMerchant")
    @com.google.gson.annotations.Expose()
    private java.lang.String tokenMerchant;
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
    @com.google.gson.annotations.SerializedName(value = "senderName")
    @com.google.gson.annotations.Expose()
    private java.lang.String senderName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "senderPhone")
    @com.google.gson.annotations.Expose()
    private java.lang.String senderPhone;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "recipientName")
    @com.google.gson.annotations.Expose()
    private java.lang.String recipientName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "recipientPhone")
    @com.google.gson.annotations.Expose()
    private java.lang.String recipientPhone;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "itemName")
    @com.google.gson.annotations.Expose()
    private java.lang.String itemName;
    
    public TripDetailsModel() {
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
    public final java.lang.String getCustomerId() {
        return null;
    }
    
    public final void setCustomerId(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getOrderFeature() {
        return null;
    }
    
    public final void setOrderFeature(@org.jetbrains.annotations.Nullable()
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
    
    public final double getDistance() {
        return 0.0;
    }
    
    public final void setDistance(double p0) {
    }
    
    public final long getPrice() {
        return 0L;
    }
    
    public final void setPrice(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPickupAddress() {
        return null;
    }
    
    public final void setPickupAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDestinationAddress() {
        return null;
    }
    
    public final void setDestinationAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromoCode() {
        return null;
    }
    
    public final void setPromoCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromoCredit() {
        return null;
    }
    
    public final void setPromoCredit(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getUseWallet() {
        return false;
    }
    
    public final void setUseWallet(boolean p0) {
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
    public final java.lang.String getEstimatedTime() {
        return null;
    }
    
    public final void setEstimatedTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFinalCost() {
        return null;
    }
    
    public final void setFinalCost(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalCost() {
        return null;
    }
    
    public final void setTotalCost(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMerchantName() {
        return null;
    }
    
    public final void setMerchantName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenMerchant() {
        return null;
    }
    
    public final void setTokenMerchant(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getSenderName() {
        return null;
    }
    
    public final void setSenderName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSenderPhone() {
        return null;
    }
    
    public final void setSenderPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRecipientName() {
        return null;
    }
    
    public final void setRecipientName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRecipientPhone() {
        return null;
    }
    
    public final void setRecipientPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItemName() {
        return null;
    }
    
    public final void setItemName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void initFromDb(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.TransaksiModel obj) {
    }
}