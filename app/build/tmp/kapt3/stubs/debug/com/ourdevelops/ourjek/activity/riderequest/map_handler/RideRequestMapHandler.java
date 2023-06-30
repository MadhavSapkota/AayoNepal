package com.ourdevelops.ourjek.activity.riderequest.map_handler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ \u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J \u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u001e\u0010)\u001a\u00020!2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020+0\u001fj\b\u0012\u0004\u0012\u00020+`,J\u0006\u0010-\u001a\u00020!J\u000e\u0010.\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010/\u001a\u00020!J\b\u00100\u001a\u00020!H\u0016J\b\u00101\u001a\u00020!H\u0016J\u0010\u00102\u001a\u00020!2\u0006\u0010*\u001a\u00020%H\u0016J\u001f\u00103\u001a\u00020!2\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105\u00a2\u0006\u0002\u00107J\u001f\u00108\u001a\u00020!2\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105\u00a2\u0006\u0002\u00107J\u0006\u00109\u001a\u00020!J\u0016\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016J\u0016\u0010=\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016J\u0006\u0010>\u001a\u00020!J\u001f\u0010?\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010@\u001a\u0004\u0018\u00010A\u00a2\u0006\u0002\u0010BJ \u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020#2\u0006\u0010F\u001a\u00020#H\u0002R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandler;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraMoveListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraIdleListener;", "Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandlerContractor$View;", "gMap", "Lcom/google/android/gms/maps/GoogleMap;", "callBack", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "context", "Landroid/content/Context;", "activity", "Landroid/app/Activity;", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;Landroid/content/Context;Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "addPickupMarker", "", "getCallBack", "()Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "getContext", "()Landroid/content/Context;", "destinationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "driverMarker", "Lcom/google/android/gms/maps/model/Marker;", "getGMap", "()Lcom/google/android/gms/maps/GoogleMap;", "pickupWrapper", "presenter", "Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandlerPresenter;", "ridersMarkers", "Ljava/util/ArrayList;", "addDriverMarker", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "title", "", "image", "", "addMarkerToMap", "addRidersToMap", "response", "Lcom/google/android/gms/maps/model/MarkerOptions;", "Lkotlin/collections/ArrayList;", "clearAllPolygonsMarkers", "getCameraCenterLocationWrapper", "initMap", "onCameraIdle", "onCameraMove", "onRouteResponse", "refreshMapPosition", "latitude", "", "longitude", "(Ljava/lang/Double;Ljava/lang/Double;)V", "refreshMyPosition", "removeDriverMarker", "requestRoute", "pickUp", "destination", "requestRouteWithPickUpMarker", "slightMoveMapPosition", "updateDriverMarker", "bearing", "", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Float;)V", "updateLineDestination", "json", "pickUpLatLng", "destinationLatLng", "app_debug"})
public final class RideRequestMapHandler implements com.google.android.gms.maps.GoogleMap.OnCameraMoveListener, com.google.android.gms.maps.GoogleMap.OnCameraIdleListener, com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandlerContractor.View {
    @org.jetbrains.annotations.Nullable()
    private final com.google.android.gms.maps.GoogleMap gMap = null;
    @org.jetbrains.annotations.Nullable()
    private final com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface callBack = null;
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    private com.google.android.gms.maps.model.Marker driverMarker;
    private com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandlerPresenter presenter;
    private com.ourdevelops.ourjek.models.LocationWrapper pickupWrapper;
    private com.ourdevelops.ourjek.models.LocationWrapper destinationWrapper;
    private java.util.ArrayList<com.google.android.gms.maps.model.Marker> ridersMarkers;
    private boolean addPickupMarker = false;
    
    public RideRequestMapHandler(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap gMap, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface callBack, @org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.GoogleMap getGMap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface getCallBack() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void initMap() {
    }
    
    @java.lang.Override()
    public void onCameraMove() {
    }
    
    @java.lang.Override()
    public void onCameraIdle() {
    }
    
    public final void refreshMapPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude) {
    }
    
    public final void refreshMyPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude) {
    }
    
    public final void removeDriverMarker() {
    }
    
    public final void addDriverMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int image) {
    }
    
    public final void updateDriverMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng latLng, @org.jetbrains.annotations.Nullable()
    java.lang.Float bearing) {
    }
    
    public final void slightMoveMapPosition() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.LocationWrapper getCameraCenterLocationWrapper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void requestRoute(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.LocationWrapper pickUp, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.LocationWrapper destination) {
    }
    
    public final void requestRouteWithPickUpMarker(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.LocationWrapper pickUp, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.LocationWrapper destination) {
    }
    
    @java.lang.Override()
    public void onRouteResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String response) {
    }
    
    private final void addMarkerToMap(com.google.android.gms.maps.model.LatLng latLng, java.lang.String title, int image) {
    }
    
    private final void updateLineDestination(java.lang.String json, com.google.android.gms.maps.model.LatLng pickUpLatLng, com.google.android.gms.maps.model.LatLng destinationLatLng) {
    }
    
    public final void clearAllPolygonsMarkers() {
    }
    
    public final void addRidersToMap(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> response) {
    }
}