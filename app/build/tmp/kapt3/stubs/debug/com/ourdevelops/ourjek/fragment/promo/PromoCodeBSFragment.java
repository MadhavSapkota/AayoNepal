package com.ourdevelops.ourjek.fragment.promo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeBSFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/FragmentPromoCodeBSBinding;", "getBinding", "()Lcom/ourdevelops/ourjek/databinding/FragmentPromoCodeBSBinding;", "setBinding", "(Lcom/ourdevelops/ourjek/databinding/FragmentPromoCodeBSBinding;)V", "callBack", "Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeUseInretface;", "fragment", "Landroidx/fragment/app/Fragment;", "obj", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "Lkotlin/collections/ArrayList;", "pAdapter", "Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeAdapter;", "getPAdapter", "()Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeAdapter;", "setPAdapter", "(Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeAdapter;)V", "price", "", "getBundles", "", "loadDataToViews", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setInterface", "callback", "app_debug"})
public final class PromoCodeBSFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private java.util.ArrayList<com.ourdevelops.ourjek.models.KodePromoModel> obj;
    public com.ourdevelops.ourjek.databinding.FragmentPromoCodeBSBinding binding;
    public com.ourdevelops.ourjek.fragment.promo.PromoCodeAdapter pAdapter;
    private androidx.fragment.app.Fragment fragment;
    private java.lang.String price;
    private com.ourdevelops.ourjek.fragment.promo.PromoCodeUseInretface callBack;
    private java.util.HashMap _$_findViewCache;
    
    public PromoCodeBSFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.databinding.FragmentPromoCodeBSBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.databinding.FragmentPromoCodeBSBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.fragment.promo.PromoCodeAdapter getPAdapter() {
        return null;
    }
    
    public final void setPAdapter(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.fragment.promo.PromoCodeAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setInterface(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.fragment.promo.PromoCodeUseInretface callback) {
    }
    
    private final void getBundles() {
    }
    
    private final void loadDataToViews() {
    }
}