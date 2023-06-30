package com.ourdevelops.ourjek.constants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u0013X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0013X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015\u00a8\u0006\u0018"}, d2 = {"Lcom/ourdevelops/ourjek/constants/LocationConstants;", "", "()V", "currentAddressName", "", "getCurrentAddressName", "()Ljava/lang/String;", "setCurrentAddressName", "(Ljava/lang/String;)V", "currentLatitude", "", "getCurrentLatitude", "()D", "setCurrentLatitude", "(D)V", "currentLongitude", "getCurrentLongitude", "setCurrentLongitude", "locationRequestCode", "", "getLocationRequestCode", "()I", "turnOnGpsRequestCode", "getTurnOnGpsRequestCode", "app_debug"})
public final class LocationConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.constants.LocationConstants INSTANCE = null;
    private static double currentLongitude = 0.0;
    private static double currentLatitude = 0.0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String currentAddressName = "";
    private static final int locationRequestCode = 150;
    private static final int turnOnGpsRequestCode = 151;
    
    private LocationConstants() {
        super();
    }
    
    public final double getCurrentLongitude() {
        return 0.0;
    }
    
    public final void setCurrentLongitude(double p0) {
    }
    
    public final double getCurrentLatitude() {
        return 0.0;
    }
    
    public final void setCurrentLatitude(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentAddressName() {
        return null;
    }
    
    public final void setCurrentAddressName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getLocationRequestCode() {
        return 0;
    }
    
    public final int getTurnOnGpsRequestCode() {
        return 0;
    }
}