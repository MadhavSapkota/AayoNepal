package com.ourdevelops.ourjek.activity.riderequest.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\tH&J\b\u0010\u0014\u001a\u00020\u0003H&\u00a8\u0006\u0015"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "", "checkPermission", "", "inflateInitialFragment", "inflateSetLocationFragment", "state", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideFragmentState;", "type", "", "onCameraIdle", "onCameraMove", "onConfirmClick", "distance", "", "timeDistance", "onMapRouteResponse", "success", "", "json", "showRideConfirmationPage", "app_debug"})
public abstract interface RideRequestInterface {
    
    public abstract void inflateSetLocationFragment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState state, @org.jetbrains.annotations.NotNull()
    java.lang.String type);
    
    public abstract void inflateInitialFragment();
    
    public abstract void showRideConfirmationPage();
    
    public abstract void onCameraMove();
    
    public abstract void onCameraIdle();
    
    public abstract void onMapRouteResponse(boolean success, @org.jetbrains.annotations.Nullable()
    java.lang.String json);
    
    public abstract void checkPermission();
    
    public abstract void onConfirmClick(double distance, @org.jetbrains.annotations.NotNull()
    java.lang.String timeDistance);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void onConfirmClick(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface $this, double distance, @org.jetbrains.annotations.NotNull()
        java.lang.String timeDistance) {
        }
    }
}