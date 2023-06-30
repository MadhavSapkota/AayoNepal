package com.ourdevelops.ourjek.activity.riderequest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020.H\u0016J\u0010\u00101\u001a\u00020.2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020.H\u0016J\u0018\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u000208H\u0016J\"\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010>H\u0014J\b\u0010?\u001a\u00020.H\u0002J\b\u0010@\u001a\u00020.H\u0016J\b\u0010A\u001a\u00020.H\u0016J\u0012\u0010B\u001a\u00020.2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\u001a\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020;2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010I\u001a\u00020.2\b\u0010J\u001a\u0004\u0018\u00010KH\u0017J\u001a\u0010L\u001a\u00020.2\u0006\u0010M\u001a\u00020\u00152\b\u0010N\u001a\u0004\u0018\u000108H\u0016J8\u0010O\u001a\u00020.2\u0016\u0010P\u001a\u0012\u0012\u0004\u0012\u00020Q0\nj\b\u0012\u0004\u0012\u00020Q`R2\u0016\u0010S\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`RH\u0016J\b\u0010T\u001a\u00020.H\u0014J\b\u0010U\u001a\u00020.H\u0014J \u0010V\u001a\u00020.2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020$0\nj\b\u0012\u0004\u0012\u00020$`RH\u0016J\u0010\u0010W\u001a\u00020.2\u0006\u0010X\u001a\u00020$H\u0016J\u0010\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020\u0015H\u0002J\b\u0010[\u001a\u00020.H\u0002J\b\u0010\\\u001a\u00020.H\u0002J\b\u0010]\u001a\u00020.H\u0002J\b\u0010^\u001a\u00020.H\u0016J\b\u0010_\u001a\u00020.H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\'\u001a\b\u0012\u0002\b\u0003\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006`"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestContractor$View;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "Lcom/ourdevelops/ourjek/activity/riderequest/saved_address/SavedAddressRequestInterface;", "()V", "allFeatureData", "Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;", "availableDriversArray", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/DriverModel;", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityNewRiderRequestBinding;", "confirmationFragment", "Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationFragment;", "currentFragmentState", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideFragmentState;", "destinationLocationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "hasUpdatedCurrentLocation", "", "locationManager", "Landroid/location/LocationManager;", "locationReceiver", "Lcom/ourdevelops/ourjek/service/LocationBroadCastReceiver;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "mapHandler", "Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandler;", "myLocationWrapper", "presenter", "Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestPresenter;", "savedAddressAdapter", "Lcom/ourdevelops/ourjek/activity/riderequest/saved_address/SavedAddressRideRequestAdapter;", "savedAddressResponse", "Lcom/ourdevelops/ourjek/json/SavedAddressObj;", "setOnMapFragment", "Lcom/ourdevelops/ourjek/fragment/ride_request/RideReqeustSearchDestinationFragment;", "sheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "buttonClicks", "", "checkGpsEnabled", "checkPermission", "fragmentTransactionHandler", "fragment", "Landroidx/fragment/app/Fragment;", "inflateInitialFragment", "inflateSetLocationFragment", "state", "type", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressConditions", "onCameraIdle", "onCameraMove", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onMapReady", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "onMapRouteResponse", "success", "json", "onNearestRidersResponse", "response", "Lcom/google/android/gms/maps/model/MarkerOptions;", "Lkotlin/collections/ArrayList;", "drivers", "onPause", "onResume", "onSavedAddressResponse", "onSavedAddressTapped", "obj", "openLocationSearchPicker", "isDestination", "requestAllSavedAddress", "requestPermission", "setupViews", "showRideConfirmationPage", "startLocationService", "app_debug"})
public final class NewRiderRequestActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestContractor.View, com.google.android.gms.maps.OnMapReadyCallback, com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface, com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRequestInterface {
    private com.ourdevelops.ourjek.models.NewAllFeatureModel allFeatureData;
    private com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestPresenter presenter;
    private com.ourdevelops.ourjek.databinding.ActivityNewRiderRequestBinding binding;
    private boolean hasUpdatedCurrentLocation = false;
    private android.location.LocationManager locationManager;
    private com.ourdevelops.ourjek.models.LocationWrapper myLocationWrapper;
    private com.ourdevelops.ourjek.fragment.ride_request.RideReqeustSearchDestinationFragment setOnMapFragment;
    private com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation.RideRequestConfirmationFragment confirmationFragment;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> sheetBehavior;
    private com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState currentFragmentState = com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState.loadingState;
    private com.ourdevelops.ourjek.models.LocationWrapper destinationLocationWrapper;
    private com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler mapHandler;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.DriverModel> availableDriversArray;
    private com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRideRequestAdapter savedAddressAdapter;
    private java.util.ArrayList<com.ourdevelops.ourjek.json.SavedAddressObj> savedAddressResponse;
    private com.google.android.gms.maps.SupportMapFragment mapFragment;
    private final com.ourdevelops.ourjek.service.LocationBroadCastReceiver locationReceiver = null;
    private java.util.HashMap _$_findViewCache;
    
    public NewRiderRequestActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<?> getSheetBehavior() {
        return null;
    }
    
    public final void setSheetBehavior(@org.jetbrains.annotations.Nullable()
    com.google.android.material.bottomsheet.BottomSheetBehavior<?> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestAllSavedAddress() {
    }
    
    private final void setupViews() {
    }
    
    private final void requestPermission() {
    }
    
    private final void checkGpsEnabled() {
    }
    
    private final void buttonClicks() {
    }
    
    @java.lang.Override()
    public void inflateInitialFragment() {
    }
    
    @java.lang.Override()
    public void inflateSetLocationFragment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState state, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    private final void fragmentTransactionHandler(androidx.fragment.app.Fragment fragment) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void startLocationService() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    private final void onBackPressConditions() {
    }
    
    @java.lang.Override()
    public void onCameraMove() {
    }
    
    @java.lang.Override()
    public void onCameraIdle() {
    }
    
    @java.lang.Override()
    public void showRideConfirmationPage() {
    }
    
    @java.lang.Override()
    public void onMapRouteResponse(boolean success, @org.jetbrains.annotations.Nullable()
    java.lang.String json) {
    }
    
    @java.lang.Override()
    public void checkPermission() {
    }
    
    @java.lang.Override()
    public void onNearestRidersResponse(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> response, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.DriverModel> drivers) {
    }
    
    @java.lang.Override()
    public void onSavedAddressResponse(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.json.SavedAddressObj> savedAddressResponse) {
    }
    
    @java.lang.Override()
    public void onSavedAddressTapped(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.SavedAddressObj obj) {
    }
    
    private final void openLocationSearchPicker(boolean isDestination) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public void onConfirmClick(double distance, @org.jetbrains.annotations.NotNull()
    java.lang.String timeDistance) {
    }
}