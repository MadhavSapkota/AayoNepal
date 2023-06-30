package com.ourdevelops.ourjek.service.location_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/service/location_service/LocationContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface LocationContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/ourdevelops/ourjek/service/location_service/LocationContractor$View;", "", "onErrorGettingLocation", "", "onLocationAvailable", "location", "Landroid/location/Location;", "locationName", "", "showTurnOnGpsDialog", "app_debug"})
    public static abstract interface View {
        
        public abstract void onLocationAvailable(@org.jetbrains.annotations.Nullable()
        android.location.Location location, @org.jetbrains.annotations.Nullable()
        java.lang.String locationName);
        
        public abstract void showTurnOnGpsDialog();
        
        public abstract void onErrorGettingLocation();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/ourdevelops/ourjek/service/location_service/LocationContractor$Presenter;", "", "app_debug"})
    public static abstract interface Presenter {
    }
}