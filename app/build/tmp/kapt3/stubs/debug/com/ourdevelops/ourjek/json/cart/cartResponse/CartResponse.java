package com.ourdevelops.ourjek.json.cart.cartResponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\"\u0010!\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\"\u0010$\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/ourdevelops/ourjek/json/cart/cartResponse/CartResponse;", "Ljava/io/Serializable;", "()V", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "data", "", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/Datum;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "distance_price_range", "Lcom/ourdevelops/ourjek/models/DeliveryDistancePriceRangeModel;", "getDistance_price_range", "setDistance_price_range", "grandTotal", "", "getGrandTotal", "()Ljava/lang/Double;", "setGrandTotal", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "message", "getMessage", "setMessage", "serviceCharge", "getServiceCharge", "setServiceCharge", "sub_total", "getSub_total", "setSub_total", "vat", "getVat", "setVat", "app_debug"})
public final class CartResponse implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "code")
    private java.lang.String code;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "data")
    private java.util.List<? extends com.ourdevelops.ourjek.json.cart.cartResponse.Datum> data;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "distance_price_range")
    private java.util.List<com.ourdevelops.ourjek.models.DeliveryDistancePriceRangeModel> distance_price_range;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "service_charge")
    private java.lang.Double serviceCharge;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "vat")
    private java.lang.Double vat;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "grand_total")
    private java.lang.Double grandTotal;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "subtotal")
    private java.lang.Double sub_total;
    
    public CartResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ourdevelops.ourjek.json.cart.cartResponse.Datum> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.ourdevelops.ourjek.json.cart.cartResponse.Datum> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ourdevelops.ourjek.models.DeliveryDistancePriceRangeModel> getDistance_price_range() {
        return null;
    }
    
    public final void setDistance_price_range(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ourdevelops.ourjek.models.DeliveryDistancePriceRangeModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getServiceCharge() {
        return null;
    }
    
    public final void setServiceCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVat() {
        return null;
    }
    
    public final void setVat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getGrandTotal() {
        return null;
    }
    
    public final void setGrandTotal(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSub_total() {
        return null;
    }
    
    public final void setSub_total(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
}