package com.ourdevelops.ourjek.service.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\"\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u0012H\u0002J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/ourdevelops/ourjek/service/ride_request/RideRequestService;", "Landroid/app/Service;", "Lcom/ourdevelops/ourjek/service/ride_request/RideReqeustServiceContractor$View;", "()V", "messageFromDriver", "Lcom/ourdevelops/ourjek/models/ride_request/FCMCustomerMessage;", "presenter", "Lcom/ourdevelops/ourjek/service/ride_request/RideRequestServicePresenter;", "rideData", "Lcom/ourdevelops/ourjek/models/TransaksiModel;", "rideNotificationManager", "Lcom/ourdevelops/ourjek/service/ride_request/RideRequestNotificationHandler;", "rideRequestReceiver", "Lcom/ourdevelops/ourjek/service/RideRequestBroadCastReceiver;", "ridersList", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/DriverModel;", "broadCastNotFound", "", "endRideService", "endRiderSearch", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onDestroy", "onRiderFound", "onStartCommand", "", "intent", "flags", "startId", "sendNotification", "startServiceFromNotification", "notificationID", "notification", "Landroid/app/Notification;", "app_debug"})
public final class RideRequestService extends android.app.Service implements com.ourdevelops.ourjek.service.ride_request.RideReqeustServiceContractor.View {
    private com.ourdevelops.ourjek.service.ride_request.RideRequestServicePresenter presenter;
    private com.ourdevelops.ourjek.models.TransaksiModel rideData;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.DriverModel> ridersList;
    private com.ourdevelops.ourjek.service.ride_request.RideRequestNotificationHandler rideNotificationManager;
    private com.ourdevelops.ourjek.models.ride_request.FCMCustomerMessage messageFromDriver;
    private final com.ourdevelops.ourjek.service.RideRequestBroadCastReceiver rideRequestReceiver = null;
    
    public RideRequestService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void sendNotification() {
    }
    
    @java.lang.Override()
    public void endRiderSearch() {
    }
    
    @java.lang.Override()
    public void onRiderFound() {
    }
    
    @java.lang.Override()
    public void endRideService() {
    }
    
    @java.lang.Override()
    public void startServiceFromNotification(int notificationID, @org.jetbrains.annotations.NotNull()
    android.app.Notification notification) {
    }
    
    private final void broadCastNotFound() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}