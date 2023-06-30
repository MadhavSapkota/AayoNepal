package com.ourdevelops.ourjek.activity.ride_progress;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u001fH\u0002J\u0010\u0010\'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020!H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006)"}, d2 = {"Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressPresenter;", "Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressContractor$View;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressContractor$View;)V", "getContext", "()Landroid/content/Context;", "englishDriverModel", "Lcom/ourdevelops/ourjek/models/ride_request/EnglishDriverModel;", "getEnglishDriverModel", "()Lcom/ourdevelops/ourjek/models/ride_request/EnglishDriverModel;", "loggedInUser", "Lcom/ourdevelops/ourjek/models/User;", "kotlin.jvm.PlatformType", "getLoggedInUser", "()Lcom/ourdevelops/ourjek/models/User;", "transactionDetail", "Lcom/ourdevelops/ourjek/models/ride_request/TransactionDetailEnglish;", "getTransactionDetail", "()Lcom/ourdevelops/ourjek/models/ride_request/TransactionDetailEnglish;", "transaksiModel", "Lcom/ourdevelops/ourjek/models/TransaksiModel;", "getTransaksiModel", "()Lcom/ourdevelops/ourjek/models/TransaksiModel;", "setTransaksiModel", "(Lcom/ourdevelops/ourjek/models/TransaksiModel;)V", "getView", "()Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressContractor$View;", "getRideDetails", "", "idTrans", "", "idDriver", "onCancelRide", "cancel_reason", "parseData", "sendBroadcast", "sendNotification", "rideRequestType", "app_debug"})
public final class NewRideProgressPresenter implements com.ourdevelops.ourjek.activity.ride_progress.NewRideProgressContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.ride_progress.NewRideProgressContractor.View view = null;
    private final com.ourdevelops.ourjek.models.User loggedInUser = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.models.ride_request.TransactionDetailEnglish transactionDetail = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel englishDriverModel = null;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.models.TransaksiModel transaksiModel;
    
    public NewRideProgressPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.ride_progress.NewRideProgressContractor.View view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.ride_progress.NewRideProgressContractor.View getView() {
        return null;
    }
    
    public final com.ourdevelops.ourjek.models.User getLoggedInUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.ride_request.TransactionDetailEnglish getTransactionDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel getEnglishDriverModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.models.TransaksiModel getTransaksiModel() {
        return null;
    }
    
    public final void setTransaksiModel(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.TransaksiModel p0) {
    }
    
    @java.lang.Override()
    public void getRideDetails(@org.jetbrains.annotations.Nullable()
    java.lang.String idTrans, @org.jetbrains.annotations.Nullable()
    java.lang.String idDriver) {
    }
    
    @java.lang.Override()
    public void parseData() {
    }
    
    @java.lang.Override()
    public void onCancelRide(@org.jetbrains.annotations.NotNull()
    java.lang.String cancel_reason) {
    }
    
    private final void sendNotification(java.lang.String rideRequestType) {
    }
    
    private final void sendBroadcast() {
    }
}