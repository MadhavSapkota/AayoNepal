package com.ourdevelops.ourjek.activity.riderequest.map_handler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandlerContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface RideRequestMapHandlerContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandlerContractor$View;", "", "onRouteResponse", "", "response", "", "app_debug"})
    public static abstract interface View {
        
        public abstract void onRouteResponse(@org.jetbrains.annotations.NotNull()
        java.lang.String response);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/map_handler/RideRequestMapHandlerContractor$Presenter;", "", "requestRoute", "", "pickUpWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "destinationWrapper", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void requestRoute(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.LocationWrapper pickUpWrapper, @org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.LocationWrapper destinationWrapper);
    }
}