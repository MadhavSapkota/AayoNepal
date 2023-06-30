package com.ourdevelops.ourjek.fragment.new_dynamic_home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/new_dynamic_home/NewDynamicHomeContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface NewDynamicHomeContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0003H&JJ\u0010\u0010\u001a\u00020\u00032\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u00132\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0006H&\u00a8\u0006\u001b"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/new_dynamic_home/NewDynamicHomeContractor$View;", "", "onHideProgress", "", "onMerchantSelected", "id", "", "onOpenBottomSheetFilter", "onOpenRideRequestPage", "allFeatureModel", "Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;", "onResponseCartAvailable", "newHomeModel", "Lcom/ourdevelops/ourjek/models/NewDynamicHomeModel;", "onResponseCheckRide", "onSessionExpired", "onSessionSuccessful", "newDynamicHomeData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allFiturData", "firstRestaurantName", "", "onShowProgress", "removeHomeItem", "removeListItem", "position", "app_debug"})
    public static abstract interface View {
        
        public abstract void onSessionExpired();
        
        public abstract void onSessionSuccessful(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.ourdevelops.ourjek.models.NewDynamicHomeModel> newDynamicHomeData, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.ourdevelops.ourjek.models.NewAllFeatureModel> allFiturData, @org.jetbrains.annotations.Nullable()
        java.lang.String firstRestaurantName);
        
        public abstract void onShowProgress();
        
        public abstract void onHideProgress();
        
        public abstract void onOpenRideRequestPage(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.NewAllFeatureModel allFeatureModel);
        
        public abstract void onOpenBottomSheetFilter(int id);
        
        public abstract void onMerchantSelected(int id);
        
        public abstract void removeListItem(int position);
        
        public abstract void onResponseCheckRide(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.NewDynamicHomeModel newHomeModel);
        
        public abstract void onResponseCartAvailable(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.NewDynamicHomeModel newHomeModel);
        
        public abstract void removeHomeItem(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.NewDynamicHomeModel newHomeModel);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/new_dynamic_home/NewDynamicHomeContractor$Presenter;", "", "initializeData", "", "onVehicleCategorySelected", "servicesModel", "Lcom/ourdevelops/ourjek/fragment/new_dynamic_home/item_models/ServicesModel;", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void onVehicleCategorySelected(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.ServicesModel servicesModel);
        
        public abstract void initializeData();
    }
}