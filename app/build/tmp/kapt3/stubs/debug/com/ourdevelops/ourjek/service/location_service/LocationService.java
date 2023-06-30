package com.ourdevelops.ourjek.service.location_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0003J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001e\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/ourdevelops/ourjek/service/location_service/LocationService;", "Landroid/app/Service;", "Lcom/ourdevelops/ourjek/service/location_service/LocationContractor$View;", "()V", "binder", "Landroid/os/IBinder;", "callBack", "Lcom/ourdevelops/ourjek/service/location_service/LocationServiceCallBack;", "hasRequestedLocationUpdate", "", "presenter", "Lcom/ourdevelops/ourjek/service/location_service/LocationServicePresenter;", "initializeService", "", "onBind", "intent", "Landroid/content/Intent;", "onDestroy", "onErrorGettingLocation", "onLocationAvailable", "location", "Landroid/location/Location;", "locationName", "", "onStartCommand", "", "flags", "startId", "setCallBacks", "callback", "showTurnOnGpsDialog", "LocalBinder", "app_debug"})
public final class LocationService extends android.app.Service implements com.ourdevelops.ourjek.service.location_service.LocationContractor.View {
    private com.ourdevelops.ourjek.service.location_service.LocationServicePresenter presenter;
    private android.os.IBinder binder;
    private com.ourdevelops.ourjek.service.location_service.LocationServiceCallBack callBack;
    private boolean hasRequestedLocationUpdate = false;
    
    public LocationService() {
        super();
    }
    
    public final void setCallBacks(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.service.location_service.LocationServiceCallBack callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void initializeService() {
    }
    
    @java.lang.Override()
    public void onLocationAvailable(@org.jetbrains.annotations.Nullable()
    android.location.Location location, @org.jetbrains.annotations.Nullable()
    java.lang.String locationName) {
    }
    
    @java.lang.Override()
    public void showTurnOnGpsDialog() {
    }
    
    @java.lang.Override()
    public void onErrorGettingLocation() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ourdevelops/ourjek/service/location_service/LocationService$LocalBinder;", "Landroid/os/Binder;", "(Lcom/ourdevelops/ourjek/service/location_service/LocationService;)V", "service", "Lcom/ourdevelops/ourjek/service/location_service/LocationService;", "getService", "()Lcom/ourdevelops/ourjek/service/location_service/LocationService;", "app_debug"})
    public final class LocalBinder extends android.os.Binder {
        
        public LocalBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ourdevelops.ourjek.service.location_service.LocationService getService() {
            return null;
        }
    }
}