package com.ourdevelops.ourjek.activity.new_merchant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001cH\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\u0018\u0010%\u001a\u00020\u001c2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016J\b\u0010\'\u001a\u00020\u001cH\u0014J\u0016\u0010(\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\tH\u0016J\b\u0010-\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/ourdevelops/ourjek/activity/new_merchant/NewMerchantActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/new_merchant/NewMerchantContractor$View;", "()V", "adapter", "Lcom/ourdevelops/ourjek/activity/new_merchant/NewMerchantAdapter;", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityNewMerchantBinding;", "filterId", "", "getFilterId", "()Ljava/lang/String;", "setFilterId", "(Ljava/lang/String;)V", "fiturId", "", "getFiturId", "()I", "setFiturId", "(I)V", "isFromSearch", "", "merchantData", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/MerchantNearModel;", "presenter", "Lcom/ourdevelops/ourjek/activity/new_merchant/NewMerchantPresenter;", "getIntenData", "", "goToMerchantDetail", "mainData", "onButtonClicks", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onHideProgress", "onNoDataFound", "onResponseSuccess", "data", "onResume", "onSearchDataFound", "", "onShowProgress", "setAddressData", "address", "setUpViews", "app_debug"})
public final class NewMerchantActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.new_merchant.NewMerchantContractor.View {
    private java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> merchantData;
    private com.ourdevelops.ourjek.databinding.ActivityNewMerchantBinding binding;
    private com.ourdevelops.ourjek.activity.new_merchant.NewMerchantPresenter presenter;
    private com.ourdevelops.ourjek.activity.new_merchant.NewMerchantAdapter adapter;
    private int fiturId = 0;
    private boolean isFromSearch = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filterId = "";
    private java.util.HashMap _$_findViewCache;
    
    public NewMerchantActivity() {
        super();
    }
    
    public final int getFiturId() {
        return 0;
    }
    
    public final void setFiturId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilterId() {
        return null;
    }
    
    public final void setFilterId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViews() {
    }
    
    private final void onButtonClicks() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void getIntenData() {
    }
    
    @java.lang.Override()
    public void onShowProgress() {
    }
    
    @java.lang.Override()
    public void onHideProgress() {
    }
    
    @java.lang.Override()
    public void onNoDataFound() {
    }
    
    @java.lang.Override()
    public void setAddressData(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onSearchDataFound(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ourdevelops.ourjek.models.MerchantNearModel> data) {
    }
    
    @java.lang.Override()
    public void goToMerchantDetail(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.MerchantNearModel mainData) {
    }
    
    @java.lang.Override()
    public void onResponseSuccess(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> data) {
    }
}