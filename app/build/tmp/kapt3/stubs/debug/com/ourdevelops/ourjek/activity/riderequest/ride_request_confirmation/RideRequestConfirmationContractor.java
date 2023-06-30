package com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface RideRequestConfirmationContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationContractor$View;", "", "confirmRideRequestError", "", "errorMessage", "", "onRideDdataResponse", "response", "Lcom/ourdevelops/ourjek/models/ride_request/RideConfirmationWrapper;", "onRiderSarching", "app_debug"})
    public static abstract interface View {
        
        public abstract void onRideDdataResponse(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.ride_request.RideConfirmationWrapper response);
        
        public abstract void confirmRideRequestError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
        
        public abstract void onRiderSarching();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationContractor$Presenter;", "", "confirmRideRequest", "", "pickupWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "dropWrapper", "requestRideData", "jsonGoogleApi", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void requestRideData(@org.jetbrains.annotations.Nullable()
        java.lang.String jsonGoogleApi);
        
        public abstract void confirmRideRequest(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.LocationWrapper pickupWrapper, @org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.LocationWrapper dropWrapper);
    }
}