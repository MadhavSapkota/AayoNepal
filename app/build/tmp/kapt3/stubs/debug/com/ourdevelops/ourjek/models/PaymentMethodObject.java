package com.ourdevelops.ourjek.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/ourdevelops/ourjek/models/PaymentMethodObject;", "", "method", "Lcom/ourdevelops/ourjek/models/PaymentMethods;", "isSelected", "", "(Lcom/ourdevelops/ourjek/models/PaymentMethods;Z)V", "()V", "()Z", "setSelected", "(Z)V", "paymentMethod", "getPaymentMethod", "()Lcom/ourdevelops/ourjek/models/PaymentMethods;", "setPaymentMethod", "(Lcom/ourdevelops/ourjek/models/PaymentMethods;)V", "app_debug"})
public final class PaymentMethodObject {
    @org.jetbrains.annotations.NotNull()
    private com.ourdevelops.ourjek.models.PaymentMethods paymentMethod = com.ourdevelops.ourjek.models.PaymentMethods.cashOnDelivery;
    private boolean isSelected = false;
    
    public PaymentMethodObject() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.PaymentMethods getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.PaymentMethods p0) {
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public PaymentMethodObject(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.PaymentMethods method, boolean isSelected) {
        super();
    }
}