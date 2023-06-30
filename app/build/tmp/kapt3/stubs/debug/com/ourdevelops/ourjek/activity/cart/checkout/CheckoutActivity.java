package com.ourdevelops.ourjek.activity.cart.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010g\u001a\u00020hH\u0002J\u0010\u0010i\u001a\u00020h2\u0006\u0010j\u001a\u00020-H\u0002J\u0017\u0010k\u001a\u00020\'2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002\u00a2\u0006\u0002\u0010lJ\b\u0010m\u001a\u00020hH\u0002J\b\u0010n\u001a\u00020hH\u0002J(\u0010o\u001a\u00020h2\u0006\u0010p\u001a\u00020\u001e2\u0006\u00104\u001a\u00020$2\u0006\u0010.\u001a\u00020$2\u0006\u0010<\u001a\u00020$H\u0016J\u0010\u0010q\u001a\u00020h2\u0006\u0010r\u001a\u00020sH\u0016J\u0010\u0010t\u001a\u00020\'2\u0006\u0010u\u001a\u00020$H\u0002J\"\u0010v\u001a\u00020h2\u0006\u0010w\u001a\u00020\u001e2\u0006\u0010x\u001a\u00020\u001e2\b\u0010y\u001a\u0004\u0018\u00010zH\u0014J(\u0010{\u001a\u00020h2\u0006\u0010p\u001a\u00020\u001e2\u0006\u00104\u001a\u00020$2\u0006\u0010.\u001a\u00020$2\u0006\u0010|\u001a\u00020$H\u0016J\u0010\u0010}\u001a\u00020h2\u0006\u0010~\u001a\u00020\'H\u0016J\u0014\u0010\u007f\u001a\u00020h2\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0014J\u0019\u0010\u0082\u0001\u001a\u00020h2\u0006\u0010p\u001a\u00020\u001e2\u0006\u0010|\u001a\u00020$H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020h2\u0006\u0010~\u001a\u00020\'H\u0016J\u0011\u0010\u0084\u0001\u001a\u00020h2\u0006\u0010~\u001a\u00020\'H\u0016J\u0011\u0010\u0085\u0001\u001a\u00020h2\u0006\u0010p\u001a\u00020\u001eH\u0016J#\u0010\u0086\u0001\u001a\u00020h2\u0018\u0010\u0087\u0001\u001a\u0013\u0012\u0004\u0012\u00020G0Fj\t\u0012\u0004\u0012\u00020G`\u0088\u0001H\u0016J\t\u0010\u0089\u0001\u001a\u00020hH\u0016J\t\u0010\u008a\u0001\u001a\u00020hH\u0016J\t\u0010\u008b\u0001\u001a\u00020hH\u0016J#\u0010\u008c\u0001\u001a\u00020h2\u0018\u0010\u008d\u0001\u001a\u0013\u0012\u0004\u0012\u00020U0Fj\t\u0012\u0004\u0012\u00020U`\u0088\u0001H\u0016J\u0011\u0010\u008e\u0001\u001a\u00020h2\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001J\t\u0010\u0091\u0001\u001a\u00020hH\u0016J\u0012\u0010\u0092\u0001\u001a\u00020h2\u0007\u0010\u0093\u0001\u001a\u00020\'H\u0016J\t\u0010\u0094\u0001\u001a\u00020hH\u0002J\t\u0010\u0095\u0001\u001a\u00020hH\u0002J\t\u0010\u0096\u0001\u001a\u00020hH\u0002J\t\u0010\u0097\u0001\u001a\u00020hH\u0002J\u0011\u0010\u0098\u0001\u001a\u00020h2\u0006\u0010~\u001a\u00020\'H\u0002J\t\u0010\u0099\u0001\u001a\u00020hH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00104\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010)\"\u0004\b6\u0010+R\u001a\u00107\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R\u000e\u0010:\u001a\u00020;X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0010\u0010A\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001a\"\u0004\bD\u0010\u001cR \u0010E\u001a\b\u0012\u0004\u0012\u00020G0FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u000e\u0010L\u001a\u00020MX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010T\u001a\u0004\u0018\u00010UX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020U0FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010[\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010`\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010a\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0014\"\u0004\bc\u0010\u0016R\u001c\u0010d\u001a\u0004\u0018\u00010UX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010W\"\u0004\bf\u0010Y\u00a8\u0006\u009a\u0001"}, d2 = {"Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutContractor$View;", "Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeUseInretface;", "Lcom/ourdevelops/ourjek/activity/cart/checkout/PaymentMethodContractor;", "Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor$View;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityCheckoutBinding;", "cartData", "Lcom/ourdevelops/ourjek/json/cart/cartResponse/CartResponse;", "checkDeliveryTime", "Lcom/ourdevelops/ourjek/utils/RestaurantTimeHandler;", "getCheckDeliveryTime", "()Lcom/ourdevelops/ourjek/utils/RestaurantTimeHandler;", "setCheckDeliveryTime", "(Lcom/ourdevelops/ourjek/utils/RestaurantTimeHandler;)V", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "closingTime", "Ljava/util/Date;", "getClosingTime", "()Ljava/util/Date;", "setClosingTime", "(Ljava/util/Date;)V", "currentSelectedPaymentMethod", "", "getCurrentSelectedPaymentMethod", "()I", "setCurrentSelectedPaymentMethod", "(I)V", "deliveryCharge", "", "deliveryFree", "deliveryTime", "", "getDeliveryTime", "()Ljava/lang/String;", "setDeliveryTime", "(Ljava/lang/String;)V", "destinationLatLang", "Lcom/google/android/gms/maps/model/LatLng;", "discount", "getDiscount", "()Ljava/lang/Double;", "setDiscount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "discountTotal", "getDiscountTotal", "setDiscountTotal", "fiturKey", "getFiturKey", "setFiturKey", "fragment", "Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeBSFragment;", "grandTotal", "getGrandTotal", "()D", "setGrandTotal", "(D)V", "idRestaurant", "openingTime", "getOpeningTime", "setOpeningTime", "paymentMethods", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/PaymentMethodObject;", "getPaymentMethods", "()Ljava/util/ArrayList;", "setPaymentMethods", "(Ljava/util/ArrayList;)V", "paymentMethodsAdapter", "Lcom/ourdevelops/ourjek/activity/cart/checkout/PaymentMethodAdapter;", "paymentPresenter", "Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentPresenter;", "presenter", "Lcom/ourdevelops/ourjek/activity/cart/checkout/CheckoutPresenter;", "priceWrapper", "Lcom/ourdevelops/ourjek/models/CartPriceWrapper;", "promoCode", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "getPromoCode", "()Lcom/ourdevelops/ourjek/models/KodePromoModel;", "setPromoCode", "(Lcom/ourdevelops/ourjek/models/KodePromoModel;)V", "promoList", "promoPosition", "getPromoPosition", "()Ljava/lang/Integer;", "setPromoPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "promoStatus", "getPromoStatus", "setPromoStatus", "promoUsed", "getPromoUsed", "setPromoUsed", "buttonClicks", "", "calculateDeliveryCharge", "latlng", "calculateTotal", "(Ljava/lang/Double;)Ljava/lang/String;", "callPlaceOrderApi", "changeText", "changeTotal", "position", "confirmPayment", "paymentMethodRequestJson", "Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "formatDoubleDecimal", "rawNumber", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onComplimentaryApplied", "total", "onConfirmationFailure", "message", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFreeDeliveryApplied", "onOrderFailed", "onOrderSuccessful", "onPaymentMethodChanged", "onPaymentMethods", "response", "Lkotlin/collections/ArrayList;", "onPaymentSyncWithCheckoutFailure", "onPaymentSyncedWithCheckout", "onPromoCodesError", "onPromoCodesResponse", "promoCodes", "onRadioButtonClicked", "view", "Landroid/view/View;", "onReferenceIdReceived", "onThirdPartyPaymentFailure", "errorMessage", "openPromoCodeFragment", "placeOrder", "receiveIntents", "setPromoCodeView", "showOrderPlacedDialog", "timePickerMethod", "app_debug"})
public final class CheckoutActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.cart.checkout.CheckoutContractor.View, com.ourdevelops.ourjek.fragment.promo.PromoCodeUseInretface, com.ourdevelops.ourjek.activity.cart.checkout.PaymentMethodContractor, com.ourdevelops.ourjek.base.payment.OnlinePaymentContractor.View {
    private double deliveryCharge = 0.0;
    private boolean deliveryFree = false;
    private com.ourdevelops.ourjek.databinding.ActivityCheckoutBinding binding;
    private com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse cartData;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.KodePromoModel> promoList;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.models.KodePromoModel promoUsed;
    private com.ourdevelops.ourjek.activity.cart.checkout.CheckoutPresenter presenter;
    private com.ourdevelops.ourjek.base.payment.OnlinePaymentPresenter paymentPresenter;
    private com.google.android.gms.maps.model.LatLng destinationLatLang;
    private com.ourdevelops.ourjek.fragment.promo.PromoCodeBSFragment fragment;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.models.KodePromoModel promoCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer promoPosition;
    private boolean promoStatus = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String discountTotal;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discount;
    public java.util.Date openingTime;
    public java.util.Date closingTime;
    @org.jetbrains.annotations.NotNull()
    private com.ourdevelops.ourjek.utils.RestaurantTimeHandler checkDeliveryTime;
    public java.lang.String deliveryTime;
    private boolean checked = false;
    public java.lang.String fiturKey;
    private double grandTotal = 0.0;
    private com.ourdevelops.ourjek.models.CartPriceWrapper priceWrapper;
    private java.lang.String idRestaurant;
    private int currentSelectedPaymentMethod = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.ourdevelops.ourjek.models.PaymentMethodObject> paymentMethods;
    private com.ourdevelops.ourjek.activity.cart.checkout.PaymentMethodAdapter paymentMethodsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public CheckoutActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.models.KodePromoModel getPromoUsed() {
        return null;
    }
    
    public final void setPromoUsed(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.KodePromoModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.models.KodePromoModel getPromoCode() {
        return null;
    }
    
    public final void setPromoCode(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.KodePromoModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPromoPosition() {
        return null;
    }
    
    public final void setPromoPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getPromoStatus() {
        return false;
    }
    
    public final void setPromoStatus(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscountTotal() {
        return null;
    }
    
    public final void setDiscountTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDiscount() {
        return null;
    }
    
    public final void setDiscount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getOpeningTime() {
        return null;
    }
    
    public final void setOpeningTime(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getClosingTime() {
        return null;
    }
    
    public final void setClosingTime(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.utils.RestaurantTimeHandler getCheckDeliveryTime() {
        return null;
    }
    
    public final void setCheckDeliveryTime(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.utils.RestaurantTimeHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeliveryTime() {
        return null;
    }
    
    public final void setDeliveryTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiturKey() {
        return null;
    }
    
    public final void setFiturKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getGrandTotal() {
        return 0.0;
    }
    
    public final void setGrandTotal(double p0) {
    }
    
    public final int getCurrentSelectedPaymentMethod() {
        return 0;
    }
    
    public final void setCurrentSelectedPaymentMethod(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.PaymentMethodObject> getPaymentMethods() {
        return null;
    }
    
    public final void setPaymentMethods(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.PaymentMethodObject> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPromoCodesResponse(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.KodePromoModel> promoCodes) {
    }
    
    @java.lang.Override()
    public void onPromoCodesError() {
    }
    
    @java.lang.Override()
    public void onPaymentMethods(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.PaymentMethodObject> response) {
    }
    
    @java.lang.Override()
    public void onPaymentMethodChanged(int position) {
    }
    
    private final void buttonClicks() {
    }
    
    private final void openPromoCodeFragment() {
    }
    
    private final void placeOrder() {
    }
    
    private final void callPlaceOrderApi() {
    }
    
    private final void timePickerMethod() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void calculateDeliveryCharge(com.google.android.gms.maps.model.LatLng latlng) {
    }
    
    private final java.lang.String calculateTotal(java.lang.Double deliveryCharge) {
        return null;
    }
    
    private final void receiveIntents() {
    }
    
    @java.lang.Override()
    public void onOrderSuccessful(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void showOrderPlacedDialog(java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onOrderFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void changeTotal(int position, double discountTotal, double discount, double grandTotal) {
    }
    
    @java.lang.Override()
    public void onComplimentaryApplied(int position, double discountTotal, double discount, double total) {
    }
    
    @java.lang.Override()
    public void onFreeDeliveryApplied(int position, double total) {
    }
    
    private final void changeText() {
    }
    
    private final java.lang.String formatDoubleDecimal(double rawNumber) {
        return null;
    }
    
    private final void setPromoCodeView() {
    }
    
    public final void onRadioButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onReferenceIdReceived() {
    }
    
    @java.lang.Override()
    public void onConfirmationFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onThirdPartyPaymentFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void confirmPayment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson) {
    }
    
    @java.lang.Override()
    public void onPaymentSyncedWithCheckout() {
    }
    
    @java.lang.Override()
    public void onPaymentSyncWithCheckoutFailure() {
    }
}