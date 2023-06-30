package com.ourdevelops.ourjek.activity.allmerchant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0013H\u0002J\u0010\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*J\u0012\u0010+\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020%H\u0014J\b\u0010/\u001a\u00020%H\u0002J\b\u00100\u001a\u00020%H\u0002J\u0010\u00101\u001a\u00020%2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020%H\u0002J\u0010\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00067"}, d2 = {"Lcom/ourdevelops/ourjek/activity/allmerchant/AllMerchantActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityAllMerchantBinding;", "catMerchantNearItem", "Lcom/ourdevelops/ourjek/item/CatMerchantNearItem;", "getCatMerchantNearItem", "()Lcom/ourdevelops/ourjek/item/CatMerchantNearItem;", "setCatMerchantNearItem", "(Lcom/ourdevelops/ourjek/item/CatMerchantNearItem;)V", "clicknear", "", "Lcom/ourdevelops/ourjek/models/MerchantNearModel;", "getClicknear", "()Ljava/util/List;", "setClicknear", "(Ljava/util/List;)V", "filterId", "", "getFilterId", "()Ljava/lang/String;", "setFilterId", "(Ljava/lang/String;)V", "fiturId", "", "getFiturId", "()I", "setFiturId", "(I)V", "merchantNearItem", "Lcom/ourdevelops/ourjek/item/AllMerchantNearItem;", "getMerchantNearItem", "()Lcom/ourdevelops/ourjek/item/AllMerchantNearItem;", "setMerchantNearItem", "(Lcom/ourdevelops/ourjek/item/AllMerchantNearItem;)V", "getdata", "", "getmerchntbycatnear", "cat", "onCartClicked", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "progresshide", "progressshow", "requestAddress", "textView", "Landroid/widget/TextView;", "requestCondition", "searchmerchant", "like", "app_debug"})
public final class AllMerchantActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.ourdevelops.ourjek.databinding.ActivityAllMerchantBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.item.AllMerchantNearItem merchantNearItem;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.item.CatMerchantNearItem catMerchantNearItem;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.ourdevelops.ourjek.models.MerchantNearModel> clicknear;
    private int fiturId = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filterId = "";
    private java.util.HashMap _$_findViewCache;
    
    public AllMerchantActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.item.AllMerchantNearItem getMerchantNearItem() {
        return null;
    }
    
    public final void setMerchantNearItem(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.item.AllMerchantNearItem p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.item.CatMerchantNearItem getCatMerchantNearItem() {
        return null;
    }
    
    public final void setCatMerchantNearItem(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.item.CatMerchantNearItem p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ourdevelops.ourjek.models.MerchantNearModel> getClicknear() {
        return null;
    }
    
    public final void setClicknear(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ourdevelops.ourjek.models.MerchantNearModel> p0) {
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
    
    private final void requestCondition() {
    }
    
    private final void progressshow() {
    }
    
    private final void progresshide() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void requestAddress(android.widget.TextView textView) {
    }
    
    private final void getdata() {
    }
    
    private final void getmerchntbycatnear(java.lang.String cat) {
    }
    
    private final void searchmerchant(java.lang.String like) {
    }
    
    public final void onCartClicked(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
}