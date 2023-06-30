package com.ourdevelops.ourjek.activity.cart.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0016J\u00a8\u0001\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010\b2\b\u00101\u001a\u0004\u0018\u00010\b2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\bH\u0016J\u0006\u00108\u001a\u00020\u0019R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00069"}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutPresenter;", "Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutContractor$View;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutContractor$View;)V", "checkoutTransactionId", "", "getContext", "()Landroid/content/Context;", "id_merchant", "paymentMethodRequestJson", "Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "getPaymentMethodRequestJson", "()Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "setPaymentMethodRequestJson", "(Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;)V", "service", "Lcom/ourdevelops/ourjek/utils/api/service/BookService;", "getService", "()Lcom/ourdevelops/ourjek/utils/api/service/BookService;", "getView", "()Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutContractor$View;", "requestPaymentMethods", "", "requestPromoCodes", "idRestaurant", "sendOrder", "destinationLatLang", "Lcom/google/android/gms/maps/model/LatLng;", "cartResponsel", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/CartResponse;", "datum", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/Datum;", "alamatresto", "idresto", "distance", "", "promocode", "", "deliveryLocation", "deliveryTime", "price", "promoStatus", "", "promoCode", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "discount", "discountTotal", "order_fitur", "priceWrapper", "Lcom/ourdevelops/ourjek/models/CartPriceWrapper;", "deliveryFree", "isCashOnDelivery", "paymentMethodString", "updateTransactionPaymentStatus", "app_debug"})
public final class CheckoutPresenter implements com.ourdevelops.ourjek.activity.cart.checkout.CheckoutContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.cart.checkout.CheckoutContractor.View view = null;
    private java.lang.String id_merchant = "";
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson;
    private java.lang.String checkoutTransactionId;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.utils.api.service.BookService service = null;
    
    public CheckoutPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.cart.checkout.CheckoutContractor.View view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.cart.checkout.CheckoutContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.ourdevelops.ourjek.json.PaymentMethodRequestJson getPaymentMethodRequestJson() {
        return null;
    }
    
    @java.lang.Override()
    public void setPaymentMethodRequestJson(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.json.PaymentMethodRequestJson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.utils.api.service.BookService getService() {
        return null;
    }
    
    @java.lang.Override()
    public void sendOrder(@org.jetbrains.annotations.NotNull()
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
    com.ourdevelops.ourjek.models.CartPriceWrapper priceWrapper, boolean deliveryFree, boolean isCashOnDelivery, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodString) {
    }
    
    @java.lang.Override()
    public void requestPromoCodes(@org.jetbrains.annotations.Nullable()
    java.lang.String idRestaurant) {
    }
    
    public final void requestPaymentMethods() {
    }
    
    public final void updateTransactionPaymentStatus() {
    }
}