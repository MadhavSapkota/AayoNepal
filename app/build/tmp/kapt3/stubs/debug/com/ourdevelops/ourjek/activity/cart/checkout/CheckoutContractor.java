package com.ourdevelops.ourjek.activity.cart.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface CheckoutContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0007\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J \u0010\u000f\u001a\u00020\u00032\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\tj\b\u0012\u0004\u0012\u00020\u0011`\u000bH&\u00a8\u0006\u0012"}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutContractor$View;", "", "onOrderFailed", "", "message", "", "onOrderSuccessful", "onPaymentMethods", "response", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/PaymentMethodObject;", "Lkotlin/collections/ArrayList;", "onPaymentSyncWithCheckoutFailure", "onPaymentSyncedWithCheckout", "onPromoCodesError", "onPromoCodesResponse", "promoCodes", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "app_debug"})
    public static abstract interface View {
        
        public abstract void onOrderSuccessful(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void onOrderFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void onPromoCodesResponse(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ourdevelops.ourjek.models.KodePromoModel> promoCodes);
        
        public abstract void onPromoCodesError();
        
        public abstract void onPaymentMethods(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ourdevelops.ourjek.models.PaymentMethodObject> response);
        
        public abstract void onPaymentSyncedWithCheckout();
        
        public abstract void onPaymentSyncWithCheckoutFailure();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u00a8\u0001\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u000bH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006("}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutContractor$Presenter;", "", "paymentMethodRequestJson", "Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "getPaymentMethodRequestJson", "()Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "setPaymentMethodRequestJson", "(Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;)V", "requestPromoCodes", "", "idRestaurant", "", "sendOrder", "destinationLatLang", "Lcom/google/android/gms/maps/model/LatLng;", "cartResponsel", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/CartResponse;", "datum", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/Datum;", "alamatresto", "idresto", "distance", "", "promocode", "", "deliveryLocation", "deliveryTime", "price", "promoStatus", "", "promoCode", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "discount", "discountTotal", "order_fitur", "priceWrapper", "Lcom/ourdevelops/ourjek/models/CartPriceWrapper;", "deliveryFee", "isCashOnDelivery", "paymentMethodString", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void sendOrder(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng destinationLatLang, @org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse cartResponsel, @org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.cart.cartResponse.Datum datum, @org.jetbrains.annotations.Nullable()
        java.lang.String alamatresto, @org.jetbrains.annotations.NotNull()
        java.lang.String idresto, double distance, long promocode, @org.jetbrains.annotations.NotNull()
        java.lang.String deliveryLocation, @org.jetbrains.annotations.NotNull()
        java.lang.String deliveryTime, @org.jetbrains.annotations.NotNull()
        java.lang.String price, boolean promoStatus, @org.jetbrains.annotations.Nullable()
        com.ourdevelops.ourjek.models.KodePromoModel promoCode, @org.jetbrains.annotations.Nullable()
        java.lang.String discount, @org.jetbrains.annotations.Nullable()
        java.lang.String discountTotal, @org.jetbrains.annotations.NotNull()
        java.lang.String order_fitur, @org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.CartPriceWrapper priceWrapper, boolean deliveryFee, boolean isCashOnDelivery, @org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodString);
        
        public abstract void requestPromoCodes(@org.jetbrains.annotations.Nullable()
        java.lang.String idRestaurant);
        
        @org.jetbrains.annotations.Nullable()
        public abstract com.ourdevelops.ourjek.json.PaymentMethodRequestJson getPaymentMethodRequestJson();
        
        public abstract void setPaymentMethodRequestJson(@org.jetbrains.annotations.Nullable()
        com.ourdevelops.ourjek.json.PaymentMethodRequestJson p0);
    }
}