package com.ourdevelops.ourjek.json.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ourdevelops/ourjek/json/ride_request/FcmRideRequestData;", "", "()V", "data", "Lcom/ourdevelops/ourjek/json/ride_request/DriverRequestBody;", "to", "Ljava/util/ArrayList;", "", "app_debug"})
public final class FcmRideRequestData {
    @com.google.gson.annotations.SerializedName(value = "registration_ids")
    @com.google.gson.annotations.Expose()
    private final java.util.ArrayList<java.lang.String> to = null;
    @com.google.gson.annotations.SerializedName(value = "data")
    @com.google.gson.annotations.Expose()
    private final com.ourdevelops.ourjek.json.ride_request.DriverRequestBody data = null;
    
    public FcmRideRequestData() {
        super();
    }
}