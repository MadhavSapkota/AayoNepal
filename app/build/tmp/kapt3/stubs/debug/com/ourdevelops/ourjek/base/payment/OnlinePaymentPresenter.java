package com.ourdevelops.ourjek.base.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u001c\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentPresenter;", "Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor$View;", "activity", "Landroid/app/Activity;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor$View;Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "getContext", "()Landroid/content/Context;", "getView", "()Lcom/ourdevelops/ourjek/base/payment/OnlinePaymentContractor$View;", "clearCartDatabase", "", "getReferenceIdFromServer", "name", "", "amount", "makeImePayment", "referenceId", "makePrabhuPayment", "app_debug"})
public final class OnlinePaymentPresenter implements com.ourdevelops.ourjek.base.payment.OnlinePaymentContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.base.payment.OnlinePaymentContractor.View view = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    
    public OnlinePaymentPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.base.payment.OnlinePaymentContractor.View view, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.base.payment.OnlinePaymentContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void getReferenceIdFromServer(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String amount) {
    }
    
    private final void makeImePayment(java.lang.String referenceId, java.lang.String amount) {
    }
    
    private final void makePrabhuPayment(java.lang.String referenceId, java.lang.String amount) {
    }
    
    private final void clearCartDatabase() {
    }
}