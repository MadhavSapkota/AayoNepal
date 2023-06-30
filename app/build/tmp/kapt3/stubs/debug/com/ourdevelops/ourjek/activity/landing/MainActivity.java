package com.ourdevelops.ourjek.activity.landing;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0018H\u0015J\u0006\u0010\"\u001a\u00020\u0018J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0003J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\b\u0010\'\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/ourdevelops/ourjek/activity/landing/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/landing/MainContractor$View;", "()V", "adapter", "Lcom/ourdevelops/ourjek/utils/SectionsPagerAdapter;", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityMainBinding;", "currentPosition", "", "languageManager", "Lcom/ourdevelops/ourjek/utils/LanguageManager;", "getLanguageManager", "()Lcom/ourdevelops/ourjek/utils/LanguageManager;", "setLanguageManager", "(Lcom/ourdevelops/ourjek/utils/LanguageManager;)V", "presenter", "Lcom/ourdevelops/ourjek/activity/landing/MainPresenter;", "tabLandingObjects", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/activity/landing/TabLandingObject;", "calculateItemsInDb", "", "checkCartItem", "", "createTabs", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onResume", "removeCartIndicator", "setupViews", "startLocationService", "tabListener", "update", "viewPagerListener", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.landing.MainContractor.View {
    private com.ourdevelops.ourjek.utils.SectionsPagerAdapter adapter;
    private java.util.ArrayList<com.ourdevelops.ourjek.activity.landing.TabLandingObject> tabLandingObjects;
    private com.ourdevelops.ourjek.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.utils.LanguageManager languageManager;
    private int currentPosition = 0;
    private com.ourdevelops.ourjek.activity.landing.MainPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.activity.landing.MainActivity.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public static java.lang.String apikey;
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static com.ourdevelops.ourjek.activity.landing.MainActivity instance;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.utils.LanguageManager getLanguageManager() {
        return null;
    }
    
    public final void setLanguageManager(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.utils.LanguageManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
    
    private final void createTabs() {
    }
    
    private final void viewPagerListener() {
    }
    
    private final void tabListener() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startLocationService() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    private final void update() {
    }
    
    private final void checkCartItem() {
    }
    
    public final void removeCartIndicator() {
    }
    
    private final boolean calculateItemsInDb() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ourdevelops/ourjek/activity/landing/MainActivity$Companion;", "", "()V", "apikey", "", "instance", "Lcom/ourdevelops/ourjek/activity/landing/MainActivity;", "getInstance", "()Lcom/ourdevelops/ourjek/activity/landing/MainActivity;", "setInstance", "(Lcom/ourdevelops/ourjek/activity/landing/MainActivity;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.ourdevelops.ourjek.activity.landing.MainActivity getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        com.ourdevelops.ourjek.activity.landing.MainActivity p0) {
        }
    }
}