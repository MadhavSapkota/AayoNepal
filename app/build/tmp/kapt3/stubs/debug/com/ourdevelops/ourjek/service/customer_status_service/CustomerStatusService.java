package com.ourdevelops.ourjek.service.customer_status_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusService;", "Landroid/app/Service;", "Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$View;", "()V", "customerStatusReceiver", "Lcom/ourdevelops/ourjek/service/CustomerStatusBroadcastReceiver;", "handler", "Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusNotificationHandler;", "presenter", "Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServicePresenter;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onFirstNotificationCreated", "", "notificationId", "", "build", "Landroid/app/Notification;", "onStartCommand", "flags", "startId", "app_debug"})
public final class CustomerStatusService extends android.app.Service implements com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.View {
    private com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServicePresenter presenter;
    private com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusNotificationHandler handler;
    private final com.ourdevelops.ourjek.service.CustomerStatusBroadcastReceiver customerStatusReceiver = null;
    
    public CustomerStatusService() {
        super();
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onFirstNotificationCreated(int notificationId, @org.jetbrains.annotations.NotNull()
    android.app.Notification build) {
    }
}