package com.ourdevelops.ourjek.activity.ride_progress;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface NewRideProgressContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressContractor$View;", "", "onChangeStatus", "", "status", "", "a", "", "onDriverDetail", "driverDetailResponse", "Lcom/ourdevelops/ourjek/models/ride_request/EnglishDriverModel;", "onRideCancelError", "errorMessage", "onRideCanceled", "onTripDetails", "tripDetailResponse", "Lcom/ourdevelops/ourjek/models/ride_request/TransactionDetailEnglish;", "app_debug"})
    public static abstract interface View {
        
        public abstract void onTripDetails(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.ride_request.TransactionDetailEnglish tripDetailResponse);
        
        public abstract void onDriverDetail(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel driverDetailResponse);
        
        public abstract void onChangeStatus(@org.jetbrains.annotations.NotNull()
        java.lang.String status, int a);
        
        public abstract void onRideCanceled();
        
        public abstract void onRideCancelError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/ourdevelops/ourjek/activity/ride_progress/NewRideProgressContractor$Presenter;", "", "getRideDetails", "", "idTrans", "", "idDriver", "onCancelRide", "cancel_reason", "parseData", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getRideDetails(@org.jetbrains.annotations.Nullable()
        java.lang.String idTrans, @org.jetbrains.annotations.Nullable()
        java.lang.String idDriver);
        
        public abstract void parseData();
        
        public abstract void onCancelRide(@org.jetbrains.annotations.NotNull()
        java.lang.String cancel_reason);
    }
}