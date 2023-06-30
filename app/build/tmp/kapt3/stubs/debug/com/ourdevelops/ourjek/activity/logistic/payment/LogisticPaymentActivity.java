package com.ourdevelops.ourjek.activity.logistic.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010+\u001a\u00020,H\u0002J(\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020,2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000200H\u0002J\b\u00109\u001a\u00020,H\u0002J\b\u0010:\u001a\u00020,H\u0002J(\u0010;\u001a\u00020,2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u0010<\u001a\u000200H\u0016J\u0010\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u000207H\u0016J\u0010\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u000207H\u0016J\u0012\u0010A\u001a\u00020,2\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\u0018\u0010D\u001a\u00020,2\u0006\u0010.\u001a\u00020\f2\u0006\u0010<\u001a\u000200H\u0016J\u0010\u0010E\u001a\u00020,2\u0006\u0010.\u001a\u00020\fH\u0016J\b\u0010F\u001a\u00020,H\u0016J\b\u0010G\u001a\u00020,H\u0016J\b\u0010H\u001a\u00020,H\u0016J \u0010I\u001a\u00020,2\u0016\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u0010j\b\u0012\u0004\u0012\u00020\u001f`KH\u0016J\b\u0010L\u001a\u00020,H\u0016J\u0010\u0010M\u001a\u00020,2\u0006\u0010>\u001a\u000207H\u0016J\b\u0010N\u001a\u00020,H\u0002J\b\u0010O\u001a\u00020,H\u0002J\u0010\u0010P\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006Q"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentContractor$View;", "Lcom/ourdevelops/ourjek/activity/cart/checkout/PaymentMethodContractor;", "Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor$View;", "Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeUseInretface;", "()V", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityLogisticPaymentBinding;", "currentSelectedPaymentMethod", "", "fragment", "Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeBSFragment;", "paymentMethods", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/PaymentMethodObject;", "getPaymentMethods", "()Ljava/util/ArrayList;", "setPaymentMethods", "(Ljava/util/ArrayList;)V", "paymentMethodsAdapter", "Lcom/ourdevelops/ourjek/activity/cart/checkout/PaymentMethodAdapter;", "paymentPresenter", "Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentPresenter;", "presenter", "Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentPresenter;", "progressDialog", "Lcom/ourdevelops/ourjek/customviews/dialogs/CustomProgressDialog;", "promoCode", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "getPromoCode", "()Lcom/ourdevelops/ourjek/models/KodePromoModel;", "setPromoCode", "(Lcom/ourdevelops/ourjek/models/KodePromoModel;)V", "promoList", "promoStatus", "", "getPromoStatus", "()Z", "setPromoStatus", "(Z)V", "changeText", "", "changeTotal", "position", "discountTotal", "", "discount", "grandTotal", "confirmPayment", "paymentMethodRequestJson", "Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "formatDoubleDecimal", "", "rawNumber", "getIntentData", "onButtonClicks", "onComplimentaryApplied", "total", "onConfirmationFailure", "s", "onConfirmationSuccess", "message", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFreeDeliveryApplied", "onPaymentMethodChanged", "onPaymentSyncWithCheckoutFailure", "onPaymentSyncedWithCheckout", "onPromoCodesError", "onPromoCodesResponse", "promoCodes", "Lkotlin/collections/ArrayList;", "onReferenceIdReceived", "onThirdPartyPaymentFailure", "openPromoCodeFragment", "setPromoCodeView", "setUpViews", "app_debug"})
public final class LogisticPaymentActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.logistic.payment.LogisticPaymentContractor.View, com.ourdevelops.ourjek.activity.cart.checkout.PaymentMethodContractor, com.ourdevelops.ourjek.base.payment.OnlinePaymentContractor.View, com.ourdevelops.ourjek.fragment.promo.PromoCodeUseInretface {
    private int currentSelectedPaymentMethod = 0;
    private com.ourdevelops.ourjek.activity.cart.checkout.PaymentMethodAdapter paymentMethodsAdapter;
    private com.ourdevelops.ourjek.databinding.ActivityLogisticPaymentBinding binding;
    private com.ourdevelops.ourjek.activity.logistic.payment.LogisticPaymentPresenter presenter;
    private com.ourdevelops.ourjek.base.payment.OnlinePaymentPresenter paymentPresenter;
    private com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData;
    private final com.ourdevelops.ourjek.customviews.dialogs.CustomProgressDialog progressDialog = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.ourdevelops.ourjek.models.PaymentMethodObject> paymentMethods;
    private final java.util.ArrayList<com.ourdevelops.ourjek.models.KodePromoModel> promoList = null;
    private com.ourdevelops.ourjek.fragment.promo.PromoCodeBSFragment fragment;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.models.KodePromoModel promoCode;
    private boolean promoStatus = false;
    private java.util.HashMap _$_findViewCache;
    
    public LogisticPaymentActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.PaymentMethodObject> getPaymentMethods() {
        return null;
    }
    
    public final void setPaymentMethods(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.PaymentMethodObject> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.models.KodePromoModel getPromoCode() {
        return null;
    }
    
    public final void setPromoCode(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.KodePromoModel p0) {
    }
    
    public final boolean getPromoStatus() {
        return false;
    }
    
    public final void setPromoStatus(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setUpViews(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData) {
    }
    
    @java.lang.Override()
    public void onConfirmationSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onConfirmationFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    @java.lang.Override()
    public void onThirdPartyPaymentFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    @java.lang.Override()
    public void confirmPayment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson) {
    }
    
    @java.lang.Override()
    public void onReferenceIdReceived() {
    }
    
    @java.lang.Override()
    public void onPaymentSyncedWithCheckout() {
    }
    
    @java.lang.Override()
    public void onPaymentSyncWithCheckoutFailure() {
    }
    
    @java.lang.Override()
    public void onPromoCodesError() {
    }
    
    @java.lang.Override()
    public void onPromoCodesResponse(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.KodePromoModel> promoCodes) {
    }
    
    private final void getIntentData() {
    }
    
    private final void onButtonClicks() {
    }
    
    private final void openPromoCodeFragment() {
    }
    
    @java.lang.Override()
    public void onPaymentMethodChanged(int position) {
    }
    
    @java.lang.Override()
    public void changeTotal(int position, double discountTotal, double discount, double grandTotal) {
    }
    
    private final void setPromoCodeView() {
    }
    
    @java.lang.Override()
    public void onComplimentaryApplied(int position, double discountTotal, double discount, double total) {
    }
    
    @java.lang.Override()
    public void onFreeDeliveryApplied(int position, double total) {
    }
    
    private final java.lang.String formatDoubleDecimal(double rawNumber) {
        return null;
    }
    
    private final void changeText() {
    }
}