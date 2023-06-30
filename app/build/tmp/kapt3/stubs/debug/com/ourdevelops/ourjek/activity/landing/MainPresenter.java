package com.ourdevelops.ourjek.activity.landing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J\u0006\u0010\u0019\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/ourdevelops/ourjek/activity/landing/MainPresenter;", "Lcom/ourdevelops/ourjek/activity/landing/MainContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/activity/landing/MainContractor$View;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/activity/landing/MainContractor$View;)V", "getContext", "()Landroid/content/Context;", "getView", "()Lcom/ourdevelops/ourjek/activity/landing/MainContractor$View;", "addItemToCartDb", "", "idMakanan", "", "totalHarga", "", "qty", "notes", "", "restaurantId", "clearCartDatabase", "getCalculatedCost", "itemPrice", "itemQuantity", "getCartDetails", "app_debug"})
public final class MainPresenter implements com.ourdevelops.ourjek.activity.landing.MainContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.landing.MainContractor.View view = null;
    
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.landing.MainContractor.View view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.landing.MainContractor.View getView() {
        return null;
    }
    
    public final void getCartDetails() {
    }
    
    private final void clearCartDatabase() {
    }
    
    private final long getCalculatedCost(java.lang.String itemPrice, java.lang.String itemQuantity) {
        return 0L;
    }
    
    private final void addItemToCartDb(int idMakanan, long totalHarga, int qty, java.lang.String notes, int restaurantId) {
    }
}