package com.ourdevelops.ourjek.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/ourdevelops/ourjek/utils/CartPriceUtil;", "", "cartList", "", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/Datum;", "(Ljava/util/List;)V", "getCartList", "()Ljava/util/List;", "calculateTotalPrice", "", "getTotalOrderPrice", "getTotalServiceCharge", "getTotalVat", "app_debug"})
public final class CartPriceUtil {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ourdevelops.ourjek.json.cart.cartResponse.Datum> cartList = null;
    
    public CartPriceUtil(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.ourdevelops.ourjek.json.cart.cartResponse.Datum> cartList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ourdevelops.ourjek.json.cart.cartResponse.Datum> getCartList() {
        return null;
    }
    
    public final double getTotalOrderPrice() {
        return 0.0;
    }
    
    public final double getTotalServiceCharge() {
        return 0.0;
    }
    
    public final double getTotalVat() {
        return 0.0;
    }
    
    public final double calculateTotalPrice() {
        return 0.0;
    }
}