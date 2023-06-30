package com.ourdevelops.ourjek.service.customer_status_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010/\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020-H\u0016J\u0010\u00102\u001a\u00020*2\u0006\u00101\u001a\u00020-H\u0016J\b\u00103\u001a\u00020*H\u0016J\b\u00104\u001a\u00020*H\u0002J\b\u00105\u001a\u00020*H\u0002J\b\u00106\u001a\u00020*H\u0016J\u0010\u00107\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0002J\b\u00108\u001a\u00020*H\u0016J\u0010\u00109\u001a\u00020*2\u0006\u00101\u001a\u00020-H\u0016J\u0010\u0010:\u001a\u00020*2\u0006\u00101\u001a\u00020-H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006;"}, d2 = {"Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusNotificationHandler;", "Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$Handler;", "presenter", "Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$Presenter;", "view", "Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$View;", "context", "Landroid/content/Context;", "loginUser", "Lcom/ourdevelops/ourjek/models/User;", "(Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$Presenter;Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$View;Landroid/content/Context;Lcom/ourdevelops/ourjek/models/User;)V", "CHANNEL_ID", "", "GROUP", "NOTIFICATION_ID", "", "REQUEST_CODE", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getLoginUser", "()Lcom/ourdevelops/ourjek/models/User;", "setLoginUser", "(Lcom/ourdevelops/ourjek/models/User;)V", "manager", "Landroid/app/NotificationManager;", "myProcess", "Landroid/app/ActivityManager$RunningAppProcessInfo;", "notification", "Landroidx/core/app/NotificationCompat$Builder;", "getPresenter", "()Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$Presenter;", "setPresenter", "(Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$Presenter;)V", "serviceChannel", "Landroid/app/NotificationChannel;", "getView", "()Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$View;", "setView", "(Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$View;)V", "checkResponseTypeForAlert", "", "type", "mainData", "Lcom/ourdevelops/ourjek/service/customer_status_service/models/CustomerStatusServiceData;", "checkResponseTypeForNotification", "checkSettings", "createNewCancelableNotification", "data", "createNewNotification", "createNotification", "createNotificationChannel", "createRideNotificationChannel", "dismissNotification", "goToRideNotification", "setUpInitialData", "updateNotification", "updateNotificationForRideOrder", "app_debug"})
public final class CustomerStatusNotificationHandler implements com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.Handler {
    @org.jetbrains.annotations.NotNull()
    private com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.Presenter presenter;
    @org.jetbrains.annotations.NotNull()
    private com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.View view;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private com.ourdevelops.ourjek.models.User loginUser;
    private android.app.NotificationChannel serviceChannel;
    private android.app.NotificationManager manager;
    private androidx.core.app.NotificationCompat.Builder notification;
    private final java.lang.String CHANNEL_ID = "CustomerStatusServiceChannel";
    private final int NOTIFICATION_ID = 1;
    private final int REQUEST_CODE = 1265;
    private final java.lang.String GROUP = "Customer_Status";
    private final android.app.ActivityManager.RunningAppProcessInfo myProcess = null;
    
    public CustomerStatusNotificationHandler(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.Presenter presenter, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.View view, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.User loginUser) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.Presenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusServiceContractor.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.User getLoginUser() {
        return null;
    }
    
    public final void setLoginUser(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.User p0) {
    }
    
    @java.lang.Override()
    public void createNotification() {
    }
    
    @java.lang.Override()
    public void createNewCancelableNotification(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData data) {
    }
    
    @java.lang.Override()
    public void createNewNotification(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData data) {
    }
    
    @java.lang.Override()
    public void updateNotification(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData data) {
    }
    
    @java.lang.Override()
    public void dismissNotification() {
    }
    
    @java.lang.Override()
    public void updateNotificationForRideOrder(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData data) {
    }
    
    @java.lang.Override()
    public void setUpInitialData() {
    }
    
    @java.lang.Override()
    public void checkSettings(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData mainData) {
    }
    
    private final void checkResponseTypeForNotification(java.lang.String type, com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData mainData) {
    }
    
    private final void checkResponseTypeForAlert(java.lang.String type, com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData mainData) {
    }
    
    private final void goToRideNotification(com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData mainData) {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final void createRideNotificationChannel() {
    }
}