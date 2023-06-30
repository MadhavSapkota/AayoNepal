package com.ourdevelops.ourjek.service.customer_status_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor;", "", "Handler", "Presenter", "View", "app_debug"})
public abstract interface CustomerStatusServiceContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$View;", "", "onFirstNotificationCreated", "", "notificationId", "", "build", "Landroid/app/Notification;", "app_debug"})
    public static abstract interface View {
        
        public abstract void onFirstNotificationCreated(int notificationId, @org.jetbrains.annotations.NotNull()
        android.app.Notification build);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$Presenter;", "", "Handler", "Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusNotificationHandler;", "getHandler", "()Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusNotificationHandler;", "setHandler", "(Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusNotificationHandler;)V", "app_debug"})
    public static abstract interface Presenter {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusNotificationHandler getHandler();
        
        public abstract void setHandler(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.service.customer_status_service.CustomerStatusNotificationHandler p0);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lcom/ourdevelops/ourjek/service/customer_status_service/CustomerStatusServiceContractor$Handler;", "", "checkSettings", "", "mainData", "Lcom/ourdevelops/ourjek/service/customer_status_service/models/CustomerStatusServiceData;", "createNewCancelableNotification", "data", "createNewNotification", "createNotification", "dismissNotification", "setUpInitialData", "updateNotification", "updateNotificationForRideOrder", "app_debug"})
    public static abstract interface Handler {
        
        public abstract void createNotification();
        
        public abstract void createNewCancelableNotification(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData data);
        
        public abstract void createNewNotification(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData data);
        
        public abstract void updateNotification(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData data);
        
        public abstract void dismissNotification();
        
        public abstract void updateNotificationForRideOrder(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData data);
        
        public abstract void setUpInitialData();
        
        public abstract void checkSettings(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.service.customer_status_service.models.CustomerStatusServiceData mainData);
    }
}