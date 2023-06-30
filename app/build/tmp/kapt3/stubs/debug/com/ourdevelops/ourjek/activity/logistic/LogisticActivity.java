package com.ourdevelops.ourjek.activity.logistic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020PH\u0016J\u0010\u0010R\u001a\u00020P2\u0006\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020PH\u0002J\b\u0010V\u001a\u00020PH\u0016J\u0018\u0010W\u001a\u00020P2\u0006\u0010X\u001a\u00020\u001f2\u0006\u0010Y\u001a\u00020\bH\u0016J\"\u0010Z\u001a\u00020P2\u0006\u0010[\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u00102\b\u0010]\u001a\u0004\u0018\u00010^H\u0014J\b\u0010_\u001a\u00020PH\u0002J\b\u0010`\u001a\u00020PH\u0002J\b\u0010a\u001a\u00020PH\u0016J\b\u0010b\u001a\u00020PH\u0016J\u0018\u0010c\u001a\u00020P2\u0006\u0010d\u001a\u0002002\u0006\u0010e\u001a\u00020\bH\u0016J\u0012\u0010f\u001a\u00020P2\b\u0010g\u001a\u0004\u0018\u00010hH\u0014J\u001a\u0010i\u001a\u00020.2\u0006\u0010j\u001a\u00020\u00102\b\u0010k\u001a\u0004\u0018\u00010lH\u0016J\u0012\u0010m\u001a\u00020P2\b\u0010n\u001a\u0004\u0018\u00010oH\u0017J\u001a\u0010p\u001a\u00020P2\u0006\u0010q\u001a\u00020.2\b\u0010r\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010s\u001a\u00020P2\u0006\u0010d\u001a\u0002002\u0006\u0010e\u001a\u00020\bH\u0002J\b\u0010t\u001a\u00020PH\u0014J\b\u0010u\u001a\u00020PH\u0014J\u0016\u0010v\u001a\u00020P2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EH\u0016J\u0010\u0010w\u001a\u00020P2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010y\u001a\u00020P2\u0006\u0010z\u001a\u00020.H\u0002J\b\u0010{\u001a\u00020PH\u0002J\b\u0010|\u001a\u00020PH\u0016J\b\u0010}\u001a\u00020PH\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u000eR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\u000eR\u001a\u0010%\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\u000eR\u000e\u0010-\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010I\u001a\b\u0012\u0002\b\u0003\u0018\u00010JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N\u00a8\u0006~"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/LogisticActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/logistic/LogisticContractor$View;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "Lcom/ourdevelops/ourjek/activity/riderequest/saved_address/SavedAddressRequestInterface;", "()V", "FITUR_KEY", "", "getFITUR_KEY", "()Ljava/lang/String;", "ICONFITUR", "getICONFITUR", "setICONFITUR", "(Ljava/lang/String;)V", "REQUEST_PERMISSION_LOCATION", "", "TAG", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "biayaakhir", "getBiayaakhir", "setBiayaakhir", "biayaminimum", "getBiayaminimum", "setBiayaminimum", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityLogisticBinding;", "confirmationFragment", "Lcom/ourdevelops/ourjek/activity/logistic/LogisticConfirmationFragment;", "currentFragmentState", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideFragmentState;", "destinationLocationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "fitur", "getFitur", "setFitur", "fiturId", "getFiturId", "()I", "setFiturId", "(I)V", "getbiaya", "getGetbiaya", "setGetbiaya", "hasUpdatedCurrentLocation", "", "jarak", "", "locationManager", "Landroid/location/LocationManager;", "locationReceiver", "Lcom/ourdevelops/ourjek/service/LocationBroadCastReceiver;", "maksimum", "", "getMaksimum", "()J", "setMaksimum", "(J)V", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "mapHandler", "Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandler;", "myLocationWrapper", "presenter", "Lcom/ourdevelops/ourjek/activity/logistic/LogisticPresenter;", "savedAddressAdapter", "Lcom/ourdevelops/ourjek/activity/riderequest/saved_address/SavedAddressRideRequestAdapter;", "savedAddressResponse", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/json/SavedAddressObj;", "setOnMapFragment", "Lcom/ourdevelops/ourjek/fragment/ride_request/RideReqeustSearchDestinationFragment;", "sheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "checkGpsEnabled", "", "checkPermission", "fragmentTransactionHandler", "fragment", "Landroidx/fragment/app/Fragment;", "getIntentData", "inflateInitialFragment", "inflateSetLocationFragment", "state", "type", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressConditions", "onButtonClicks", "onCameraIdle", "onCameraMove", "onConfirmClick", "distance", "timeDistance", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onMapReady", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "onMapRouteResponse", "success", "json", "onNextButtonClick", "onPause", "onResume", "onSavedAddressResponse", "onSavedAddressTapped", "obj", "openLocationSearchPicker", "isDestination", "setupView", "showRideConfirmationPage", "startLocationService", "app_debug"})
public final class LogisticActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.logistic.LogisticContractor.View, com.google.android.gms.maps.OnMapReadyCallback, com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface, com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRequestInterface {
    private com.google.android.gms.maps.SupportMapFragment mapFragment;
    private com.ourdevelops.ourjek.databinding.ActivityLogisticBinding binding;
    private com.ourdevelops.ourjek.activity.logistic.LogisticPresenter presenter;
    private android.location.LocationManager locationManager;
    private com.ourdevelops.ourjek.models.LocationWrapper myLocationWrapper;
    private boolean hasUpdatedCurrentLocation = false;
    private com.ourdevelops.ourjek.fragment.ride_request.RideReqeustSearchDestinationFragment setOnMapFragment;
    private com.ourdevelops.ourjek.activity.logistic.LogisticConfirmationFragment confirmationFragment;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> sheetBehavior;
    private com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState currentFragmentState = com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState.loadingState;
    private com.ourdevelops.ourjek.models.LocationWrapper destinationLocationWrapper;
    private com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler mapHandler;
    private com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRideRequestAdapter savedAddressAdapter;
    private java.util.ArrayList<com.ourdevelops.ourjek.json.SavedAddressObj> savedAddressResponse;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FITUR_KEY = "FiturKey";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ICONFITUR;
    private final java.lang.String TAG = "LogisticActivity.";
    private final int REQUEST_PERMISSION_LOCATION = 991;
    private double jarak = 0.0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fitur;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String getbiaya;
    private com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String biayaminimum;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String biayaakhir;
    private int fiturId = 0;
    private long maksimum = 0L;
    private final com.ourdevelops.ourjek.service.LocationBroadCastReceiver locationReceiver = null;
    private java.util.HashMap _$_findViewCache;
    
    public LogisticActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<?> getSheetBehavior() {
        return null;
    }
    
    public final void setSheetBehavior(@org.jetbrains.annotations.Nullable()
    com.google.android.material.bottomsheet.BottomSheetBehavior<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFITUR_KEY() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getICONFITUR() {
        return null;
    }
    
    public final void setICONFITUR(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFitur() {
        return null;
    }
    
    public final void setFitur(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGetbiaya() {
        return null;
    }
    
    public final void setGetbiaya(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBiayaminimum() {
        return null;
    }
    
    public final void setBiayaminimum(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBiayaakhir() {
        return null;
    }
    
    public final void setBiayaakhir(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getFiturId() {
        return 0;
    }
    
    public final void setFiturId(int p0) {
    }
    
    public final long getMaksimum() {
        return 0L;
    }
    
    public final void setMaksimum(long p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getIntentData() {
    }
    
    private final void setupView() {
    }
    
    private final void onButtonClicks() {
    }
    
    @java.lang.Override()
    public void inflateInitialFragment() {
    }
    
    @java.lang.Override()
    public void inflateSetLocationFragment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState state, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onSavedAddressResponse(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.json.SavedAddressObj> savedAddressResponse) {
    }
    
    @java.lang.Override()
    public void onSavedAddressTapped(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.SavedAddressObj obj) {
    }
    
    @java.lang.Override()
    public void onConfirmClick(double distance, @org.jetbrains.annotations.NotNull()
    java.lang.String timeDistance) {
    }
    
    private final void onNextButtonClick(double distance, java.lang.String timeDistance) {
    }
    
    private final void checkGpsEnabled() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void startLocationService() {
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
    
    private final void fragmentTransactionHandler(androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void onMapRouteResponse(boolean success, @org.jetbrains.annotations.Nullable()
    java.lang.String json) {
    }
    
    private final void openLocationSearchPicker(boolean isDestination) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void checkPermission() {
    }
}