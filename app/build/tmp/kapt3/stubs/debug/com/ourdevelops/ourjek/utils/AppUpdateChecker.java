package com.ourdevelops.ourjek.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/ourdevelops/ourjek/utils/AppUpdateChecker;", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "context", "Landroid/content/Context;", "callBack", "Lcom/ourdevelops/ourjek/utils/AppUpdateCallback;", "activity", "Landroid/app/Activity;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/utils/AppUpdateCallback;Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "appSizeToDownload", "", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "getCallBack", "()Lcom/ourdevelops/ourjek/utils/AppUpdateCallback;", "getContext", "()Landroid/content/Context;", "dialog", "Lcom/ourdevelops/ourjek/customviews/dialogs/DownloadingDialog;", "hasShownProgressDialog", "", "getPercentageCompleted", "", "completedVal", "init", "", "onAppUpdated", "onStateUpdate", "state", "Lcom/google/android/play/core/install/InstallState;", "Companion", "app_debug"})
public final class AppUpdateChecker implements com.google.android.play.core.install.InstallStateUpdatedListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.utils.AppUpdateCallback callBack = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    private com.google.android.play.core.appupdate.AppUpdateManager appUpdateManager;
    private boolean hasShownProgressDialog = false;
    private long appSizeToDownload = 0L;
    private com.ourdevelops.ourjek.customviews.dialogs.DownloadingDialog dialog;
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.utils.AppUpdateChecker.Companion Companion = null;
    public static final int requestAppUpdate = 499;
    
    public AppUpdateChecker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.utils.AppUpdateCallback callBack, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.utils.AppUpdateCallback getCallBack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void init() {
    }
    
    public final void onAppUpdated() {
    }
    
    @java.lang.Override()
    public void onStateUpdate(@org.jetbrains.annotations.NotNull()
    com.google.android.play.core.install.InstallState state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPercentageCompleted(long completedVal) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ourdevelops/ourjek/utils/AppUpdateChecker$Companion;", "", "()V", "requestAppUpdate", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}