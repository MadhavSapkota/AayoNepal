package com.ourdevelops.ourjek.service.location_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ourdevelops/ourjek/service/location_service/LocationServiceCallBack;", "", "onLocationAvailable", "", "location", "Landroid/location/Location;", "showTurnOnGpsDialog", "app_debug"})
public abstract interface LocationServiceCallBack {
    
    public abstract void showTurnOnGpsDialog();
    
    public abstract void onLocationAvailable(@org.jetbrains.annotations.NotNull()
    android.location.Location location);
}