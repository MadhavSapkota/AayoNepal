package com.ourdevelops.ourjek.base.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface OnlinePaymentContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor$View;", "", "confirmPayment", "", "paymentMethodRequestJson", "Lcom/ourdevelops/ourjek/json/PaymentMethodRequestJson;", "onConfirmationFailure", "message", "", "onReferenceIdReceived", "onThirdPartyPaymentFailure", "app_debug"})
    public static abstract interface View {
        
        public abstract void onReferenceIdReceived();
        
        public abstract void onConfirmationFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void onThirdPartyPaymentFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void confirmPayment(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.PaymentMethodRequestJson paymentMethodRequestJson);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor$Presenter;", "", "getReferenceIdFromServer", "", "name", "", "amount", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getReferenceIdFromServer(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String amount);
    }
}