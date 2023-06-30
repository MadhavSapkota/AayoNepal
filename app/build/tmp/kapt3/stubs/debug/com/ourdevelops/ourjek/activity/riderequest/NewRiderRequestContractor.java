package com.ourdevelops.ourjek.activity.riderequest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface NewRiderRequestContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestContractor$View;", "", "onNearestRidersResponse", "", "response", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/MarkerOptions;", "Lkotlin/collections/ArrayList;", "drivers", "Lcom/ourdevelops/ourjek/models/DriverModel;", "app_debug"})
    public static abstract interface View {
        
        public abstract void onNearestRidersResponse(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> response, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ourdevelops.ourjek.models.DriverModel> drivers);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J!\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestContractor$Presenter;", "", "getAllSavedAddress", "", "getNearestRiders", "filterId", "", "myLocationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "(Ljava/lang/Integer;Lcom/ourdevelops/ourjek/models/LocationWrapper;)V", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getNearestRiders(@org.jetbrains.annotations.Nullable()
        java.lang.Integer filterId, @org.jetbrains.annotations.Nullable()
        com.ourdevelops.ourjek.models.LocationWrapper myLocationWrapper);
        
        public abstract void getAllSavedAddress();
    }
}