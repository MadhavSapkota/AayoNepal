package com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationPresenter;", "Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationContractor$View;", "allFeatureData", "Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationContractor$View;Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;)V", "getAllFeatureData", "()Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;", "getContext", "()Landroid/content/Context;", "rideConfirmationWrapper", "Lcom/ourdevelops/ourjek/models/ride_request/RideConfirmationWrapper;", "userLogin", "Lcom/ourdevelops/ourjek/models/User;", "kotlin.jvm.PlatformType", "getView", "()Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationContractor$View;", "confirmRideRequest", "", "pickupWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "dropWrapper", "getDeliveryCost", "", "jsonGoogleApi", "", "requestRideData", "app_debug"})
public final class RideRequestConfirmationPresenter implements com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation.RideRequestConfirmationContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation.RideRequestConfirmationContractor.View view = null;
    @org.jetbrains.annotations.Nullable()
    private final com.ourdevelops.ourjek.models.NewAllFeatureModel allFeatureData = null;
    private final com.ourdevelops.ourjek.models.User userLogin = null;
    private com.ourdevelops.ourjek.models.ride_request.RideConfirmationWrapper rideConfirmationWrapper;
    
    public RideRequestConfirmationPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation.RideRequestConfirmationContractor.View view, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.NewAllFeatureModel allFeatureData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation.RideRequestConfirmationContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.models.NewAllFeatureModel getAllFeatureData() {
        return null;
    }
    
    @java.lang.Override()
    public void requestRideData(@org.jetbrains.annotations.Nullable()
    java.lang.String jsonGoogleApi) {
    }
    
    private final int getDeliveryCost(java.lang.String jsonGoogleApi) {
        return 0;
    }
    
    @java.lang.Override()
    public void confirmRideRequest(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.LocationWrapper pickupWrapper, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.LocationWrapper dropWrapper) {
    }
}