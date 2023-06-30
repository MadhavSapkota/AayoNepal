package com.ourdevelops.ourjek.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\"\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000bH\u0016J-\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u000bH\u0002J\b\u0010!\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/ourdevelops/ourjek/activity/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/utils/AppUpdateCallback;", "()V", "appUpdateChecker", "Lcom/ourdevelops/ourjek/utils/AppUpdateChecker;", "languageManager", "Lcom/ourdevelops/ourjek/utils/LanguageManager;", "sharedPreferences", "Landroid/content/SharedPreferences;", "checkLocationEnabled", "", "checkLocationPermission", "enableLocation", "nextPageConditions", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNoUpdateAvailable", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "removeNotif", "startLocationService", "app_debug"})
public final class SplashActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.utils.AppUpdateCallback {
    private android.content.SharedPreferences sharedPreferences;
    private com.ourdevelops.ourjek.utils.LanguageManager languageManager;
    private com.ourdevelops.ourjek.utils.AppUpdateChecker appUpdateChecker;
    private java.util.HashMap _$_findViewCache;
    
    public SplashActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void checkLocationEnabled() {
    }
    
    private final void nextPageConditions() {
    }
    
    private final void enableLocation() {
    }
    
    private final void checkLocationPermission() {
    }
    
    private final void startLocationService() {
    }
    
    private final void removeNotif() {
    }
    
    @java.lang.Override()
    public void onNoUpdateAvailable() {
    }
}