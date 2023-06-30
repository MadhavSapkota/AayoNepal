package com.ourdevelops.ourjek.activity.new_merchant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ourdevelops/ourjek/activity/new_merchant/NewMerchantContractor;", "", "Adapter", "Presenter", "View", "app_debug"})
public abstract interface NewMerchantContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/ourdevelops/ourjek/activity/new_merchant/NewMerchantContractor$View;", "", "goToMerchantDetail", "", "mainData", "Lcom/ourdevelops/ourjek/models/MerchantNearModel;", "onHideProgress", "onNoDataFound", "onResponseSuccess", "data", "Ljava/util/ArrayList;", "onSearchDataFound", "", "onShowProgress", "setAddressData", "address", "", "app_debug"})
    public static abstract interface View {
        
        public abstract void onShowProgress();
        
        public abstract void onHideProgress();
        
        public abstract void onNoDataFound();
        
        public abstract void setAddressData(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        public abstract void onSearchDataFound(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ourdevelops.ourjek.models.MerchantNearModel> data);
        
        public abstract void goToMerchantDetail(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.MerchantNearModel mainData);
        
        public abstract void onResponseSuccess(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> data);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/ourdevelops/ourjek/activity/new_merchant/NewMerchantContractor$Presenter;", "", "getAllMerchants", "", "filterId", "", "onRequestAddress", "searchMerchant", "toSearch", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void onRequestAddress();
        
        public abstract void searchMerchant(@org.jetbrains.annotations.NotNull()
        java.lang.String toSearch, @org.jetbrains.annotations.NotNull()
        java.lang.String filterId);
        
        public abstract void getAllMerchants(@org.jetbrains.annotations.NotNull()
        java.lang.String filterId);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/ourdevelops/ourjek/activity/new_merchant/NewMerchantContractor$Adapter;", "", "app_debug"})
    public static abstract interface Adapter {
    }
}