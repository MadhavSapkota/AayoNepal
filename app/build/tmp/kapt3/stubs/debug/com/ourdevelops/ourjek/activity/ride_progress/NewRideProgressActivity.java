package com.ourdevelops.ourjek.activity.ride_progress;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001aH\u0014J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\nH\u0016J\u0012\u0010%\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001aH\u0014J\b\u0010)\u001a\u00020\u001aH\u0014J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000eH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u001aH\u0002J\b\u00101\u001a\u00020\u001aH\u0002J\b\u00102\u001a\u00020\u001aH\u0002J\b\u00103\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressContractor$View;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityNewRideProgressBinding;", "currentLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "driverDetail", "Lcom/ourdevelops/ourjek/models/ride_request/EnglishDriverModel;", "driverLocationReceiver", "Lcom/ourdevelops/ourjek/service/DriverLocationBroadcast;", "idDriver", "", "idTrans", "mapHandler", "Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandler;", "presenter", "Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressPresenter;", "response", "rideRequestReceiver", "Lcom/ourdevelops/ourjek/service/RideRequestBroadCastReceiver;", "sheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "buttonClicks", "", "onChangeStatus", "status", "a", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDriverDetail", "driverDetailResponse", "onMapReady", "p0", "Lcom/google/android/gms/maps/GoogleMap;", "onPause", "onResume", "onRideCancelError", "errorMessage", "onRideCanceled", "onTripDetails", "tripDetailResponse", "Lcom/ourdevelops/ourjek/models/ride_request/TransactionDetailEnglish;", "receivingIntents", "requestRideDetails", "setStatusBarTransparent", "setupViews", "app_debug"})
public final class NewRideProgressActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.ride_progress.NewRideProgressContractor.View, com.google.android.gms.maps.OnMapReadyCallback {
    private com.google.android.gms.maps.model.LatLng currentLatLng;
    private com.ourdevelops.ourjek.databinding.ActivityNewRideProgressBinding binding;
    private com.ourdevelops.ourjek.activity.ride_progress.NewRideProgressPresenter presenter;
    private com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler mapHandler;
    private java.lang.String idDriver = "";
    private java.lang.String idTrans = "";
    private java.lang.String response = "";
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> sheetBehavior;
    private com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel driverDetail;
    private final com.ourdevelops.ourjek.service.RideRequestBroadCastReceiver rideRequestReceiver = null;
    private final com.ourdevelops.ourjek.service.DriverLocationBroadcast driverLocationReceiver = null;
    private java.util.HashMap _$_findViewCache;
    
    public NewRideProgressActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void receivingIntents() {
    }
    
    private final void setupViews() {
    }
    
    private final void buttonClicks() {
    }
    
    private final void setStatusBarTransparent() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    private final void requestRideDetails() {
    }
    
    @java.lang.Override()
    public void onTripDetails(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.ride_request.TransactionDetailEnglish tripDetailResponse) {
    }
    
    @java.lang.Override()
    public void onDriverDetail(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel driverDetailResponse) {
    }
    
    @java.lang.Override()
    public void onChangeStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, int a) {
    }
    
    @java.lang.Override()
    public void onRideCanceled() {
    }
    
    @java.lang.Override()
    public void onRideCancelError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
}