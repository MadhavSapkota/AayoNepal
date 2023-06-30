package com.ourdevelops.ourjek.utils.api.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010!\u001a\u00020\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0#H\u0002J\b\u0010$\u001a\u00020\rH\u0003J\u001a\u0010%\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006)"}, d2 = {"Lcom/ourdevelops/ourjek/utils/api/service/MessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "intent", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "intentOrder", "getIntentOrder", "setIntentOrder", "chat", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "intentToOrder", "bundle", "Landroid/os/Bundle;", "messageHandler", "notificationOrderBuilderAccept", "notificationOrderBuilderCancel", "notificationOrderBuilderFinish", "notificationOrderBuilderStart", "onCreate", "onMessageReceived", "onNewToken", "token", "", "orderHandler", "otherHandler", "otherHandler2", "otherHandler3", "parseAndSendMessage", "mapResponse", "", "playSound1", "showNotificationWithImage", "bitmap", "Landroid/graphics/Bitmap;", "Companion", "app_debug"})
public final class MessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    @org.jetbrains.annotations.Nullable()
    private android.content.Intent intent;
    @org.jetbrains.annotations.Nullable()
    private android.content.Intent intentOrder;
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.utils.api.service.MessagingService.Companion Companion = null;
    private static final java.lang.String TAG = "MessagingService";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_ACTION = "com.ourdevelops.ourjek";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_ORDER = "order";
    
    public MessagingService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getIntent() {
        return null;
    }
    
    public final void setIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getIntentOrder() {
        return null;
    }
    
    public final void setIntentOrder(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void parseAndSendMessage(java.util.Map<java.lang.String, java.lang.String> mapResponse) {
    }
    
    private final void messageHandler(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void otherHandler(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void otherHandler2(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void otherHandler3(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void showNotificationWithImage(com.google.firebase.messaging.RemoteMessage remoteMessage, android.graphics.Bitmap bitmap) {
    }
    
    private final void orderHandler(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void intentToOrder(android.os.Bundle bundle) {
    }
    
    private final void notificationOrderBuilderCancel(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void notificationOrderBuilderStart(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void notificationOrderBuilderAccept(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void notificationOrderBuilderFinish(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void chat(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void playSound1() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/ourdevelops/ourjek/utils/api/service/MessagingService$Companion;", "", "()V", "BROADCAST_ACTION", "", "BROADCAST_ORDER", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}