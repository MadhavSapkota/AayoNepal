package com.ourdevelops.ourjek.constants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006 "}, d2 = {"Lcom/ourdevelops/ourjek/constants/AppRideStatus;", "", "()V", "availableRider", "Lcom/ourdevelops/ourjek/models/ride_request/EnglishDriverModel;", "getAvailableRider", "()Lcom/ourdevelops/ourjek/models/ride_request/EnglishDriverModel;", "setAvailableRider", "(Lcom/ourdevelops/ourjek/models/ride_request/EnglishDriverModel;)V", "currentRideId", "", "getCurrentRideId", "()Ljava/lang/String;", "setCurrentRideId", "(Ljava/lang/String;)V", "currentStatus", "Lcom/ourdevelops/ourjek/constants/RideStatus;", "getCurrentStatus", "()Lcom/ourdevelops/ourjek/constants/RideStatus;", "setCurrentStatus", "(Lcom/ourdevelops/ourjek/constants/RideStatus;)V", "placeHolder", "", "getPlaceHolder", "()I", "setPlaceHolder", "(I)V", "setRideIdle", "", "startSearchingRider", "rideType", "(Ljava/lang/Integer;)V", "app_debug"})
public final class AppRideStatus {
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.constants.AppRideStatus INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static com.ourdevelops.ourjek.constants.RideStatus currentStatus = com.ourdevelops.ourjek.constants.RideStatus.idle;
    @org.jetbrains.annotations.Nullable()
    private static com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel availableRider;
    private static int placeHolder = com.ourdevelops.ourjek.R.drawable.ic_colored_bike;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String currentRideId;
    
    private AppRideStatus() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.constants.RideStatus getCurrentStatus() {
        return null;
    }
    
    public final void setCurrentStatus(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.constants.RideStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel getAvailableRider() {
        return null;
    }
    
    public final void setAvailableRider(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel p0) {
    }
    
    public final int getPlaceHolder() {
        return 0;
    }
    
    public final void setPlaceHolder(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentRideId() {
        return null;
    }
    
    public final void setCurrentRideId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void setRideIdle() {
    }
    
    public final void startSearchingRider(@org.jetbrains.annotations.Nullable()
    java.lang.Integer rideType) {
    }
}