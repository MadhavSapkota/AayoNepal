package com.ourdevelops.ourjek.activity.save_address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/save_address/SaveUserAddressContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface SaveUserAddressContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ourdevelops/ourjek/activity/save_address/SaveUserAddressContractor$View;", "", "onSaveFailure", "", "errorMessage", "", "onSaveSuccess", "app_debug"})
    public static abstract interface View {
        
        public abstract void onSaveSuccess();
        
        public abstract void onSaveFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/ourdevelops/ourjek/activity/save_address/SaveUserAddressContractor$Presenter;", "", "saveAddress", "", "locationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "selectedAddressModel", "Lcom/ourdevelops/ourjek/models/save_address/AddressTypeModel;", "alternateName", "", "additionalInfo", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void saveAddress(@org.jetbrains.annotations.Nullable()
        com.ourdevelops.ourjek.models.LocationWrapper locationWrapper, @org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.models.save_address.AddressTypeModel selectedAddressModel, @org.jetbrains.annotations.Nullable()
        java.lang.String alternateName, @org.jetbrains.annotations.Nullable()
        java.lang.String additionalInfo);
    }
}