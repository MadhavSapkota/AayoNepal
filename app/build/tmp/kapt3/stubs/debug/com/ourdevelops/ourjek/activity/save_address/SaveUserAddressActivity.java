package com.ourdevelops.ourjek.activity.save_address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/ourdevelops/ourjek/activity/save_address/SaveUserAddressActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/save_address/address_types/AddressTypeCallBack;", "Lcom/ourdevelops/ourjek/activity/save_address/SaveUserAddressContractor$View;", "()V", "adapter", "Lcom/ourdevelops/ourjek/activity/save_address/address_types/AddressTypesAdapter;", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivitySaveUserAddressBinding;", "currentAddressType", "", "locationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "mlist", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/save_address/AddressTypeModel;", "presenter", "Lcom/ourdevelops/ourjek/activity/save_address/SaveUserAddressPresenter;", "buttonClicks", "", "checkShowTitleCondition", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveFailure", "errorMessage", "", "onSaveSuccess", "receivingIntents", "selectedItem", "position", "setupViews", "app_debug"})
public final class SaveUserAddressActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.save_address.address_types.AddressTypeCallBack, com.ourdevelops.ourjek.activity.save_address.SaveUserAddressContractor.View {
    private com.ourdevelops.ourjek.activity.save_address.SaveUserAddressPresenter presenter;
    private com.ourdevelops.ourjek.databinding.ActivitySaveUserAddressBinding binding;
    private com.ourdevelops.ourjek.activity.save_address.address_types.AddressTypesAdapter adapter;
    private com.ourdevelops.ourjek.models.LocationWrapper locationWrapper;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.save_address.AddressTypeModel> mlist;
    private int currentAddressType = 0;
    private java.util.HashMap _$_findViewCache;
    
    public SaveUserAddressActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void receivingIntents() {
    }
    
    private final void setupViews() {
    }
    
    private final void buttonClicks() {
    }
    
    @java.lang.Override()
    public void selectedItem(int position) {
    }
    
    private final void checkShowTitleCondition() {
    }
    
    @java.lang.Override()
    public void onSaveSuccess() {
    }
    
    @java.lang.Override()
    public void onSaveFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
}