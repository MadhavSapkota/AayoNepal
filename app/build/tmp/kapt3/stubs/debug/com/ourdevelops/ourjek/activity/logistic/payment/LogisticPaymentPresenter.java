package com.ourdevelops.ourjek.activity.logistic.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentPresenter;", "Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentContractor$View;", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentContractor$View;Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;)V", "getAllData", "()Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "checkoutTransactionId", "", "getContext", "()Landroid/content/Context;", "loginUser", "Lcom/ourdevelops/ourjek/models/User;", "getView", "()Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentContractor$View;", "calculateAllFee", "", "confirmPayment", "paymentMethodRequestJson", "Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "requestPromoCodes", "setParameterData", "Lcom/ourdevelops/ourjek/json/SendRequestJson;", "paymentData", "updateTransactionPaymentStatus", "app_debug"})
public final class LogisticPaymentPresenter implements com.ourdevelops.ourjek.activity.logistic.payment.LogisticPaymentContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.logistic.payment.LogisticPaymentContractor.View view = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData = null;
    private java.lang.String checkoutTransactionId;
    private final com.ourdevelops.ourjek.models.User loginUser = null;
    
    public LogisticPaymentPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.logistic.payment.LogisticPaymentContractor.View view, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.logistic.payment.LogisticPaymentContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel getAllData() {
        return null;
    }
    
    @java.lang.Override()
    public void calculateAllFee() {
    }
    
    @java.lang.Override()
    public void confirmPayment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson) {
    }
    
    @java.lang.Override()
    public void updateTransactionPaymentStatus(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson) {
    }
    
    @java.lang.Override()
    public void requestPromoCodes() {
    }
    
    private final com.ourdevelops.ourjek.json.SendRequestJson setParameterData(com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData, com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentData) {
        return null;
    }
}