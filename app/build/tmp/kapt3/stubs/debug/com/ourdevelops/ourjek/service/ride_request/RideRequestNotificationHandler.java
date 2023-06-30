package com.ourdevelops.ourjek.service.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J8\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0011J\u0006\u0010 \u001a\u00020\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/ourdevelops/ourjek/service/ride_request/RideRequestNotificationHandler;", "", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/service/ride_request/RideRequestService;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/service/ride_request/RideRequestService;)V", "cancelNotificationId", "", "getContext", "()Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "searchingNotificationId", "getView", "()Lcom/ourdevelops/ourjek/service/ride_request/RideRequestService;", "buildNotification", "", "channelId", "", "notificationTitle", "notificationBody", "pendingIntent", "Landroid/app/PendingIntent;", "notificationId", "ongoing", "", "cancelNotification", "showNotification", "showRideCanceledNotification", "showRideFinishedNotification", "showRiderFoundNotification", "showRiderNotFoundNotification", "app_debug"})
public final class RideRequestNotificationHandler {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.service.ride_request.RideRequestService view = null;
    private final int searchingNotificationId = 5;
    private final int cancelNotificationId = 619;
    private android.app.NotificationManager notificationManager;
    
    public RideRequestNotificationHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.ride_request.RideRequestService view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.service.ride_request.RideRequestService getView() {
        return null;
    }
    
    public final void showNotification() {
    }
    
    public final void showRiderNotFoundNotification() {
    }
    
    public final void showRideCanceledNotification() {
    }
    
    public final void showRiderFoundNotification() {
    }
    
    public final void showRideFinishedNotification() {
    }
    
    private final void buildNotification(java.lang.String channelId, java.lang.String notificationTitle, java.lang.String notificationBody, android.app.PendingIntent pendingIntent, int notificationId, boolean ongoing) {
    }
    
    public final void cancelNotification() {
    }
}