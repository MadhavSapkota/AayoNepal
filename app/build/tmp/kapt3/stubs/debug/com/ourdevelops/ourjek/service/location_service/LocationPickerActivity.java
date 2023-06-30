package com.ourdevelops.ourjek.service.location_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0016H\u0014J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\bH\u0016J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\nH\u0017J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010\'\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/ourdevelops/ourjek/service/location_service/LocationPickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/service/location_service/LocationServiceCallBack;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityLocationPickerBinding;", "currentLocation", "Landroid/location/Location;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "hasFocusedToCurrentLocation", "", "locationRequestCode", "", "locationService", "Lcom/ourdevelops/ourjek/service/location_service/LocationService;", "serviceConnection", "Landroid/content/ServiceConnection;", "zoomHeight", "", "checkPermissions", "", "focusToCurrentLocation", "initializeLocationService", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLocationAvailable", "location", "onMapReady", "p0", "showLocationRejectedDialog", "showTurnOnGpsDialog", "app_debug"})
public final class LocationPickerActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.service.location_service.LocationServiceCallBack, com.google.android.gms.maps.OnMapReadyCallback {
    private com.ourdevelops.ourjek.databinding.ActivityLocationPickerBinding binding;
    private com.ourdevelops.ourjek.service.location_service.LocationService locationService;
    private final int locationRequestCode = 100;
    private com.google.android.gms.maps.GoogleMap googleMap;
    private android.location.Location currentLocation;
    private final float zoomHeight = 15.0F;
    private boolean hasFocusedToCurrentLocation = false;
    private android.content.ServiceConnection serviceConnection;
    private java.util.HashMap _$_findViewCache;
    
    public LocationPickerActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkPermissions() {
    }
    
    private final void initializeLocationService() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void showLocationRejectedDialog() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void showTurnOnGpsDialog() {
    }
    
    @java.lang.Override()
    public void onLocationAvailable(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    private final void focusToCurrentLocation() {
    }
}