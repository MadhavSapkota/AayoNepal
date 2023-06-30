package com.ourdevelops.ourjek.service.location_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0003J\u0006\u0010\u001e\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/ourdevelops/ourjek/service/location_service/LocationServicePresenter;", "Lcom/ourdevelops/ourjek/service/location_service/LocationContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/service/location_service/LocationContractor$View;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/service/location_service/LocationContractor$View;)V", "getContext", "()Landroid/content/Context;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mFusedLocation", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mylocation", "Landroid/location/Location;", "getMylocation", "()Landroid/location/Location;", "setMylocation", "(Landroid/location/Location;)V", "getView", "()Lcom/ourdevelops/ourjek/service/location_service/LocationContractor$View;", "getLocationName", "", "latitude", "", "longitude", "getLocations", "", "initializeService", "app_debug"})
public final class LocationServicePresenter implements com.ourdevelops.ourjek.service.location_service.LocationContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.service.location_service.LocationContractor.View view = null;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location mylocation;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocation;
    private com.google.android.gms.location.LocationRequest locationRequest;
    private com.google.android.gms.location.LocationCallback locationCallback;
    
    public LocationServicePresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.location_service.LocationContractor.View view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.service.location_service.LocationContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getMylocation() {
        return null;
    }
    
    public final void setMylocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    public final void initializeService() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getLocations() {
    }
    
    private final java.lang.String getLocationName(double latitude, double longitude) {
        return null;
    }
}