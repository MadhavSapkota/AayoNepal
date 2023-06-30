package com.ourdevelops.ourjek.service.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/service/ride_request/RideReqeustServiceContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface RideReqeustServiceContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/ourdevelops/ourjek/service/ride_request/RideReqeustServiceContractor$View;", "", "endRideService", "", "endRiderSearch", "onRiderFound", "startServiceFromNotification", "notificationID", "", "notification", "Landroid/app/Notification;", "app_debug"})
    public static abstract interface View {
        
        public abstract void endRiderSearch();
        
        public abstract void onRiderFound();
        
        public abstract void endRideService();
        
        public abstract void startServiceFromNotification(int notificationID, @org.jetbrains.annotations.NotNull()
        android.app.Notification notification);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/service/ride_request/RideReqeustServiceContractor$Presenter;", "", "searchAgain", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void searchAgain();
    }
}