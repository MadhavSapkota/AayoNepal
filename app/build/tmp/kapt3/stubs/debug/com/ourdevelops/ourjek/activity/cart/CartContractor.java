package com.ourdevelops.ourjek.activity.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/CartContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface CartContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/CartContractor$View;", "", "onCartClearError", "", "errorMessage", "", "onCartCleared", "onCartDetailError", "onCartDetailsSuccess", "response", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/CartResponse;", "onCartItemDeleteError", "onCartItemDeleted", "onCartUpdatError", "onCartUpdated", "onEmptyCart", "app_debug"})
    public static abstract interface View {
        
        public abstract void onCartUpdated();
        
        public abstract void onCartUpdatError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
        
        public abstract void onCartItemDeleted();
        
        public abstract void onCartItemDeleteError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
        
        public abstract void onCartDetailsSuccess(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse response);
        
        public abstract void onCartDetailError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
        
        public abstract void onCartCleared();
        
        public abstract void onCartClearError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
        
        public abstract void onEmptyCart();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/CartContractor$Presenter;", "", "deleteAllCarts", "", "cartResponse", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/CartResponse;", "deleteCartItem", "idItem", "", "getCartDetails", "updateCart", "qty", "datum", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/Datum;", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void updateCart(@org.jetbrains.annotations.NotNull()
        java.lang.String qty, @org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.cart.cartResponse.Datum datum);
        
        public abstract void deleteCartItem(@org.jetbrains.annotations.NotNull()
        java.lang.String idItem);
        
        public abstract void updateCart(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.ourdevelops.ourjek.json.cart.cartResponse.Datum> datum);
        
        public abstract void getCartDetails();
        
        public abstract void deleteAllCarts(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse cartResponse);
    }
}