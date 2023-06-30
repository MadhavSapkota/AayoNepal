package com.ourdevelops.ourjek.fragment.newhome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface NewHomeContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J8\u0010\f\u001a\u00020\u00032\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u000ej\b\u0012\u0004\u0012\u00020\u0011`\u000fH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000bH&\u00a8\u0006\u0018"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$View;", "", "onResponseCartAvailable", "", "obj", "Lcom/ourdevelops/ourjek/models/home/NewHomeModel;", "onResponseCheckRide", "onResponseError", "errorMessage", "", "image", "", "onResponseSuccess", "response", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allFiturData", "Lcom/ourdevelops/ourjek/models/AllFiturModel;", "onVehicleCategorySelected", "item", "Lcom/ourdevelops/ourjek/models/VehicleModel;", "removeHomeItem", "removeListItem", "position", "app_debug"})
    public static abstract interface View {
        
        public abstract void onResponseSuccess(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ourdevelops.ourjek.models.home.NewHomeModel> response, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ourdevelops.ourjek.models.AllFiturModel> allFiturData);
        
        public abstract void onResponseError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage, int image);
        
        public abstract void onVehicleCategorySelected(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.VehicleModel item);
        
        public abstract void onResponseCheckRide(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.home.NewHomeModel obj);
        
        public abstract void onResponseCartAvailable(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.home.NewHomeModel obj);
        
        public abstract void removeHomeItem(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.home.NewHomeModel obj);
        
        public abstract void removeListItem(int position);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$Presenter;", "", "initializeHome", "", "requestData", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void initializeHome();
        
        public abstract void requestData();
    }
}