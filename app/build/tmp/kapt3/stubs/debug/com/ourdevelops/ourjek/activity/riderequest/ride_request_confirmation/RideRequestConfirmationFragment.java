package com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010&\u001a\u00020\u0014H\u0002J$\u0010\'\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\r2\b\u0010!\u001a\u0004\u0018\u00010\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationContractor$View;", "callBack", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "(Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;)V", "allFeatureData", "Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;", "binding", "Lcom/ourdevelops/ourjek/databinding/LayoutRideRequestConfirmationBinding;", "getCallBack", "()Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "dropLocationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "pickLocationWrapper", "presenter", "Lcom/ourdevelops/ourjek/activity/riderequest/ride_request_confirmation/RideRequestConfirmationPresenter;", "routeJson", "", "buttonClicks", "", "confirmRideRequestError", "errorMessage", "initiateTimerToDismiss", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRideDdataResponse", "response", "Lcom/ourdevelops/ourjek/models/ride_request/RideConfirmationWrapper;", "onRiderSarching", "onViewCreated", "view", "requestRides", "setPickDropLocations", "pickLocation", "dropLocation", "app_debug"})
public final class RideRequestConfirmationFragment extends androidx.fragment.app.Fragment implements com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation.RideRequestConfirmationContractor.View {
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface callBack = null;
    private com.ourdevelops.ourjek.databinding.LayoutRideRequestConfirmationBinding binding;
    private com.ourdevelops.ourjek.models.LocationWrapper pickLocationWrapper;
    private com.ourdevelops.ourjek.models.LocationWrapper dropLocationWrapper;
    private com.ourdevelops.ourjek.models.NewAllFeatureModel allFeatureData;
    private java.lang.String routeJson;
    private com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation.RideRequestConfirmationPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    public RideRequestConfirmationFragment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface callBack) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface getCallBack() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void buttonClicks() {
    }
    
    private final void requestRides() {
    }
    
    public final void setPickDropLocations(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.LocationWrapper pickLocation, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.LocationWrapper dropLocation, @org.jetbrains.annotations.Nullable()
    java.lang.String response) {
    }
    
    @java.lang.Override()
    public void onRideDdataResponse(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.ride_request.RideConfirmationWrapper response) {
    }
    
    @java.lang.Override()
    public void confirmRideRequestError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onRiderSarching() {
    }
    
    private final void initiateTimerToDismiss() {
    }
}