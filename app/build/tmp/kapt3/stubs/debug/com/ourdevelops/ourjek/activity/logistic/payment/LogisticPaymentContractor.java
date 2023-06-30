package com.ourdevelops.ourjek.activity.logistic.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface LogisticPaymentContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J \u0010\u000b\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a8\u0006\u0015"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentContractor$View;", "", "onConfirmationFailure", "", "s", "", "onConfirmationSuccess", "message", "onPaymentSyncWithCheckoutFailure", "onPaymentSyncedWithCheckout", "onPromoCodesError", "onPromoCodesResponse", "promoCodes", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "Lkotlin/collections/ArrayList;", "onReferenceIdReceived", "onThirdPartyPaymentFailure", "setUpViews", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "app_debug"})
    public static abstract interface View {
        
        public abstract void setUpViews(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData);
        
        public abstract void onConfirmationSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void onConfirmationFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String s);
        
        public abstract void onThirdPartyPaymentFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String s);
        
        public abstract void onReferenceIdReceived();
        
        public abstract void onPaymentSyncedWithCheckout();
        
        public abstract void onPaymentSyncWithCheckoutFailure();
        
        public abstract void onPromoCodesError();
        
        public abstract void onPromoCodesResponse(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ourdevelops.ourjek.models.KodePromoModel> promoCodes);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/payment/LogisticPaymentContractor$Presenter;", "", "calculateAllFee", "", "confirmPayment", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "paymentMethodRequestJson", "Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "requestPromoCodes", "updateTransactionPaymentStatus", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void confirmPayment(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData, @org.jetbrains.annotations.Nullable()
        com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson);
        
        public abstract void calculateAllFee();
        
        public abstract void updateTransactionPaymentStatus(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson);
        
        public abstract void requestPromoCodes();
    }
}