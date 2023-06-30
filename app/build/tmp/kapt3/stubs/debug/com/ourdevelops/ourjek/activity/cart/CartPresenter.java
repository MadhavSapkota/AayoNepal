package com.ourdevelops.ourjek.activity.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u0016\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/CartPresenter;", "Lcom/ourdevelops/ourjek/activity/cart/CartContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/activity/cart/CartContractor$View;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/activity/cart/CartContractor$View;)V", "getContext", "()Landroid/content/Context;", "getView", "()Lcom/ourdevelops/ourjek/activity/cart/CartContractor$View;", "deleteAllCarts", "", "cartResponse", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/CartResponse;", "deleteCartItem", "idItem", "", "getCartDetails", "getDiscountedPrice", "actualPrice", "discountPercent", "updateCart", "qty", "datum", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/Datum;", "", "app_debug"})
public final class CartPresenter implements com.ourdevelops.ourjek.activity.cart.CartContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.cart.CartContractor.View view = null;
    
    public CartPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.cart.CartContractor.View view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.cart.CartContractor.View getView() {
        return null;
    }
    
    @java.lang.Override()
    public void updateCart(@org.jetbrains.annotations.NotNull()
    java.lang.String qty, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.cart.cartResponse.Datum datum) {
    }
    
    @java.lang.Override()
    public void updateCart(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.ourdevelops.ourjek.json.cart.cartResponse.Datum> datum) {
    }
    
    @java.lang.Override()
    public void deleteCartItem(@org.jetbrains.annotations.NotNull()
    java.lang.String idItem) {
    }
    
    @java.lang.Override()
    public void getCartDetails() {
    }
    
    private final java.lang.String getDiscountedPrice(java.lang.String actualPrice, java.lang.String discountPercent) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteAllCarts(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse cartResponse) {
    }
}