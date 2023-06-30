package com.ourdevelops.ourjek.models.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004\u00a8\u0006\n"}, d2 = {"Lcom/ourdevelops/ourjek/models/ride_request/RideHomeModel;", "", "status", "Lcom/ourdevelops/ourjek/constants/RideStatus;", "(Lcom/ourdevelops/ourjek/constants/RideStatus;)V", "()V", "currentStatus", "getCurrentStatus", "()Lcom/ourdevelops/ourjek/constants/RideStatus;", "setCurrentStatus", "app_debug"})
public final class RideHomeModel {
    @org.jetbrains.annotations.NotNull()
    private com.ourdevelops.ourjek.constants.RideStatus currentStatus = com.ourdevelops.ourjek.constants.RideStatus.idle;
    
    public RideHomeModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.constants.RideStatus getCurrentStatus() {
        return null;
    }
    
    public final void setCurrentStatus(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.constants.RideStatus p0) {
    }
    
    public RideHomeModel(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.constants.RideStatus status) {
        super();
    }
}