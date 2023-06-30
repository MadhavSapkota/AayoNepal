package com.ourdevelops.ourjek.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\"\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001eH\u0002J\"\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016J\u0012\u0010*\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0016J\u001a\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u00103\u001a\u00020\u0016H\u0014J+\u00104\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001e062\u0006\u00107\u001a\u000208H\u0016\u00a2\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u0016H\u0014J\b\u0010;\u001a\u00020\u0016H\u0002J\b\u0010<\u001a\u00020\u0016H\u0002J\b\u0010=\u001a\u00020\u0016H\u0002J\b\u0010>\u001a\u00020\u0016H\u0016J\b\u0010?\u001a\u00020\u0016H\u0002J\b\u0010@\u001a\u00020\u0016H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/ourdevelops/ourjek/activity/PicklocationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityPicklocationBinding;", "formToFill", "", "hasUpdatedCurrentLocation", "", "locationManager", "Landroid/location/LocationManager;", "locationReceiver", "Lcom/ourdevelops/ourjek/service/LocationBroadCastReceiver;", "mapHandler", "Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandler;", "selectedLocationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "tvTo", "Landroid/widget/TextView;", "buttonClicks", "", "checkGpsEnabled", "checkPermission", "inflateInitialFragment", "inflateSetLocationFragment", "state", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideFragmentState;", "type", "", "moveToSpecificLocation", "getplace", "latitude", "longitude", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCameraIdle", "onCameraMove", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "onMapRouteResponse", "success", "json", "onPause", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "selectLocation", "setupAutocompleteTextView", "setupViews", "showRideConfirmationPage", "startLocationService", "updateLastLocation", "Companion", "app_debug"})
public final class PicklocationActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface {
    private com.ourdevelops.ourjek.databinding.ActivityPicklocationBinding binding;
    private android.widget.TextView tvTo;
    private int formToFill = 0;
    private android.location.LocationManager locationManager;
    private boolean hasUpdatedCurrentLocation = false;
    private com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler mapHandler;
    private com.ourdevelops.ourjek.models.LocationWrapper selectedLocationWrapper;
    private final com.ourdevelops.ourjek.service.LocationBroadCastReceiver locationReceiver = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.activity.PicklocationActivity.Companion Companion = null;
    private static final int REQUEST_PERMISSION_LOCATION = 991;
    public static final int LOCATION_PICKER_ID = 78;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORM_VIEW_INDICATOR = "FormToFill";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCATION_NAME = "LocationName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCATION_LATLNG = "LocationLatLng";
    private java.util.HashMap _$_findViewCache;
    
    public PicklocationActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
    
    private final void buttonClicks() {
    }
    
    private final void selectLocation() {
    }
    
    private final void setupAutocompleteTextView() {
    }
    
    private final void updateLastLocation() {
    }
    
    private final void checkGpsEnabled() {
    }
    
    private final void startLocationService() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void moveToSpecificLocation(java.lang.String getplace, java.lang.String latitude, java.lang.String longitude) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void inflateSetLocationFragment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState state, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @java.lang.Override()
    public void inflateInitialFragment() {
    }
    
    @java.lang.Override()
    public void showRideConfirmationPage() {
    }
    
    @java.lang.Override()
    public void onCameraMove() {
    }
    
    @java.lang.Override()
    public void onCameraIdle() {
    }
    
    @java.lang.Override()
    public void onMapRouteResponse(boolean success, @org.jetbrains.annotations.Nullable()
    java.lang.String json) {
    }
    
    @java.lang.Override()
    public void checkPermission() {
    }
    
    public void onConfirmClick(double distance, @org.jetbrains.annotations.NotNull()
    java.lang.String timeDistance) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/ourdevelops/ourjek/activity/PicklocationActivity$Companion;", "", "()V", "FORM_VIEW_INDICATOR", "", "LOCATION_LATLNG", "LOCATION_NAME", "LOCATION_PICKER_ID", "", "REQUEST_PERMISSION_LOCATION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}