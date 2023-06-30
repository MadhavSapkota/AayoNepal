package com.ourdevelops.ourjek.fragment.restaurant_menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/restaurant_menu/RestaurantMenuContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface RestaurantMenuContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/restaurant_menu/RestaurantMenuContractor$View;", "", "onItemClicked", "", "position", "", "onItemFound", "onResponseError", "errorMessage", "", "onResponseSuccess", "response", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/ItemModel;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface View {
        
        public abstract void onResponseSuccess(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ourdevelops.ourjek.models.ItemModel> response);
        
        public abstract void onResponseError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
        
        public abstract void onItemClicked(int position);
        
        public abstract void onItemFound(int position);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/restaurant_menu/RestaurantMenuContractor$Presenter;", "", "requestData", "", "latitude", "", "longitude", "restaurantId", "categoryId", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void requestData(@org.jetbrains.annotations.Nullable()
        java.lang.String latitude, @org.jetbrains.annotations.Nullable()
        java.lang.String longitude, @org.jetbrains.annotations.Nullable()
        java.lang.String restaurantId, @org.jetbrains.annotations.Nullable()
        java.lang.String categoryId);
    }
}