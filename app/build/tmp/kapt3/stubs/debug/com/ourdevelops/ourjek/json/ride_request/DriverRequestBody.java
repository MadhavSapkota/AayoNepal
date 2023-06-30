package com.ourdevelops.ourjek.json.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006$"}, d2 = {"Lcom/ourdevelops/ourjek/json/ride_request/DriverRequestBody;", "Ljava/io/Serializable;", "()V", "customerDetails", "Lcom/ourdevelops/ourjek/json/ride_request/UserModel;", "getCustomerDetails", "()Lcom/ourdevelops/ourjek/json/ride_request/UserModel;", "setCustomerDetails", "(Lcom/ourdevelops/ourjek/json/ride_request/UserModel;)V", "expireTime", "", "getExpireTime", "()J", "setExpireTime", "(J)V", "initiateTime", "getInitiateTime", "setInitiateTime", "rideResponseType", "", "getRideResponseType", "()Ljava/lang/String;", "setRideResponseType", "(Ljava/lang/String;)V", "tripDetails", "Lcom/ourdevelops/ourjek/json/ride_request/TripDetailsModel;", "getTripDetails", "()Lcom/ourdevelops/ourjek/json/ride_request/TripDetailsModel;", "setTripDetails", "(Lcom/ourdevelops/ourjek/json/ride_request/TripDetailsModel;)V", "type", "", "getType", "()I", "setType", "(I)V", "app_debug"})
public final class DriverRequestBody implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "tripDetails")
    private com.ourdevelops.ourjek.json.ride_request.TripDetailsModel tripDetails;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "customerDetails")
    private com.ourdevelops.ourjek.json.ride_request.UserModel customerDetails;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "initiateTime")
    private long initiateTime = 0L;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "expireTime")
    private long expireTime = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "rideResponseType")
    private java.lang.String rideResponseType = "";
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "type")
    private int type = 5;
    
    public DriverRequestBody() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.json.ride_request.TripDetailsModel getTripDetails() {
        return null;
    }
    
    public final void setTripDetails(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.ride_request.TripDetailsModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.json.ride_request.UserModel getCustomerDetails() {
        return null;
    }
    
    public final void setCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.json.ride_request.UserModel p0) {
    }
    
    public final long getInitiateTime() {
        return 0L;
    }
    
    public final void setInitiateTime(long p0) {
    }
    
    public final long getExpireTime() {
        return 0L;
    }
    
    public final void setExpireTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRideResponseType() {
        return null;
    }
    
    public final void setRideResponseType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
}