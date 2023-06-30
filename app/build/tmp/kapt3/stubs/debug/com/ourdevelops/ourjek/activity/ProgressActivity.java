package com.ourdevelops.ourjek.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0001mB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0007H\u0002J\b\u0010O\u001a\u00020MH\u0002J\b\u0010P\u001a\u00020MH\u0002J\u001c\u0010Q\u001a\u00020M2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010R\u001a\u00020M2\b\u0010S\u001a\u0004\u0018\u00010\u0007J\b\u0010T\u001a\u00020MH\u0016J\u0010\u0010U\u001a\u00020M2\b\u0010V\u001a\u0004\u0018\u00010WJ\u0012\u0010X\u001a\u00020M2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0014J\u0010\u0010[\u001a\u00020M2\b\u0010V\u001a\u0004\u0018\u00010WJ\u0010\u0010\\\u001a\u00020M2\u0006\u0010]\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u00020M2\u0006\u0010@\u001a\u00020`H\u0007J\b\u0010a\u001a\u00020MH\u0014J\b\u0010b\u001a\u00020MH\u0014J\u0010\u0010c\u001a\u00020M2\u0006\u0010d\u001a\u00020eH\u0003J\"\u0010f\u001a\u00020M2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010lH\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\t\"\u0004\b?\u0010\u000bR\u001c\u0010@\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\t\"\u0004\bB\u0010\u000bR\u001a\u0010C\u001a\u00020DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010I\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\t\"\u0004\bK\u0010\u000b\u00a8\u0006n"}, d2 = {"Lcom/ourdevelops/ourjek/activity/ProgressActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityRideBinding;", "complete", "", "getComplete", "()Ljava/lang/String;", "setComplete", "(Ljava/lang/String;)V", "currentLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "driverLocationReceiver", "Lcom/ourdevelops/ourjek/service/DriverLocationBroadcast;", "fitur", "getFitur", "setFitur", "gethome", "getGethome", "setGethome", "handler", "Landroid/os/Handler;", "icondriver", "getIcondriver", "setIcondriver", "iddriver", "getIddriver", "setIddriver", "idtrans", "getIdtrans", "setIdtrans", "imagedriver", "getImagedriver", "setImagedriver", "isCancelable", "", "itemPesananItem", "Lcom/ourdevelops/ourjek/item/ItemPesananItem;", "getItemPesananItem", "()Lcom/ourdevelops/ourjek/item/ItemPesananItem;", "setItemPesananItem", "(Lcom/ourdevelops/ourjek/item/ItemPesananItem;)V", "londriver", "getLondriver", "setLondriver", "lout_service_comission", "Landroid/widget/LinearLayout;", "getLout_service_comission", "()Landroid/widget/LinearLayout;", "setLout_service_comission", "(Landroid/widget/LinearLayout;)V", "mapHandler", "Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandler;", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "setRealm", "(Lio/realm/Realm;)V", "regdriver", "getRegdriver", "setRegdriver", "response", "getResponse", "setResponse", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "setTimer", "(Ljava/util/Timer;)V", "tokenmerchant", "getTokenmerchant", "setTokenmerchant", "cancelOrder", "", "cancel_reason", "fcmcancel", "fcmcancelmerchant", "getData", "notif", "text", "onBackPressed", "onButtonShowPopupWindowClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFabClicked", "onMapReady", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "onMessageEvent", "Lcom/ourdevelops/ourjek/json/fcm/DriverResponse;", "onPause", "onResume", "orderHandler", "code", "", "parsedata", "request", "Lcom/ourdevelops/ourjek/models/TransaksiModel;", "driver", "Lcom/ourdevelops/ourjek/models/DriverModel;", "fiturmodel", "Lcom/ourdevelops/ourjek/models/FiturModel;", "Companion", "app_debug"})
public final class ProgressActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.google.android.gms.maps.model.LatLng currentLatLng;
    private com.ourdevelops.ourjek.databinding.ActivityRideBinding binding;
    private com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler mapHandler;
    private boolean isCancelable = true;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String idtrans;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String iddriver;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String response;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String regdriver;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fitur;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imagedriver;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tokenmerchant;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String londriver = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String complete;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String icondriver;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String gethome;
    private android.os.Handler handler;
    @org.jetbrains.annotations.Nullable()
    private android.widget.LinearLayout lout_service_comission;
    @org.jetbrains.annotations.NotNull()
    private java.util.Timer timer;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.item.ItemPesananItem itemPesananItem;
    @org.jetbrains.annotations.Nullable()
    private io.realm.Realm realm;
    private final com.ourdevelops.ourjek.service.DriverLocationBroadcast driverLocationReceiver = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.activity.ProgressActivity.Companion Companion = null;
    private static final int REQUEST_PERMISSION_CALL = 992;
    private java.util.HashMap _$_findViewCache;
    
    public ProgressActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdtrans() {
        return null;
    }
    
    public final void setIdtrans(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIddriver() {
        return null;
    }
    
    public final void setIddriver(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegdriver() {
        return null;
    }
    
    public final void setRegdriver(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getImagedriver() {
        return null;
    }
    
    public final void setImagedriver(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenmerchant() {
        return null;
    }
    
    public final void setTokenmerchant(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLondriver() {
        return null;
    }
    
    public final void setLondriver(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComplete() {
        return null;
    }
    
    public final void setComplete(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcondriver() {
        return null;
    }
    
    public final void setIcondriver(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGethome() {
        return null;
    }
    
    public final void setGethome(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.LinearLayout getLout_service_comission() {
        return null;
    }
    
    public final void setLout_service_comission(@org.jetbrains.annotations.Nullable()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Timer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.NotNull()
    java.util.Timer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.item.ItemPesananItem getItemPesananItem() {
        return null;
    }
    
    public final void setItemPesananItem(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.item.ItemPesananItem p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.Realm getRealm() {
        return null;
    }
    
    public final void setRealm(@org.jetbrains.annotations.Nullable()
    io.realm.Realm p0) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getData(java.lang.String idtrans, java.lang.String iddriver) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void parsedata(com.ourdevelops.ourjek.models.TransaksiModel request, com.ourdevelops.ourjek.models.DriverModel driver, com.ourdevelops.ourjek.models.FiturModel fiturmodel) {
    }
    
    private final void cancelOrder(java.lang.String cancel_reason) {
    }
    
    private final void fcmcancel() {
    }
    
    private final void fcmcancelmerchant() {
    }
    
    public final void notif(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    public final void onFabClicked(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void orderHandler(int code) {
    }
    
    public final void onButtonShowPopupWindowClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.fcm.DriverResponse response) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ourdevelops/ourjek/activity/ProgressActivity$Companion;", "", "()V", "REQUEST_PERMISSION_CALL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}