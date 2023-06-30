package com.ourdevelops.ourjek.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/ourdevelops/ourjek/models/CartPriceWrapper;", "Ljava/io/Serializable;", "()V", "deliveryCharge", "", "getDeliveryCharge", "()D", "setDeliveryCharge", "(D)V", "discountTotal", "getDiscountTotal", "setDiscountTotal", "orderPrice", "getOrderPrice", "setOrderPrice", "totalPrice", "getTotalPrice", "setTotalPrice", "totalServiceCharge", "getTotalServiceCharge", "setTotalServiceCharge", "totalVat", "getTotalVat", "setTotalVat", "setCartValues", "", "cartItemsList", "", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/Datum;", "app_debug"})
public final class CartPriceWrapper implements java.io.Serializable {
    private double totalPrice = 0.0;
    private double totalVat = 0.0;
    private double totalServiceCharge = 0.0;
    private double orderPrice = 0.0;
    private double deliveryCharge = 0.0;
    private double discountTotal = 0.0;
    
    public CartPriceWrapper() {
        super();
    }
    
    public final double getTotalPrice() {
        return 0.0;
    }
    
    public final void setTotalPrice(double p0) {
    }
    
    public final double getTotalVat() {
        return 0.0;
    }
    
    public final void setTotalVat(double p0) {
    }
    
    public final double getTotalServiceCharge() {
        return 0.0;
    }
    
    public final void setTotalServiceCharge(double p0) {
    }
    
    public final double getOrderPrice() {
        return 0.0;
    }
    
    public final void setOrderPrice(double p0) {
    }
    
    public final double getDeliveryCharge() {
        return 0.0;
    }
    
    public final void setDeliveryCharge(double p0) {
    }
    
    public final double getDiscountTotal() {
        return 0.0;
    }
    
    public final void setDiscountTotal(double p0) {
    }
    
    public final void setCartValues(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ourdevelops.ourjek.json.cart.cartResponse.Datum> cartItemsList) {
    }
}