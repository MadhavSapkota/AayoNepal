package com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\u0010\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010\u0007J\b\u0010&\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuItemBSFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuItemContractor$View;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/FragmentMenuItemBsBinding;", "callBack", "Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuFragCartIconCheck;", "currentQuantity", "", "fragment", "Landroidx/fragment/app/Fragment;", "id_fitur", "", "itemPrice", "obj", "Lcom/ourdevelops/ourjek/models/ItemModel;", "presenter", "Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuItemPresenter;", "restaurantId", "buttonClicks", "", "loadDataToViews", "onAddedToCart", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "quantityListener", "receivingBundles", "setInterface", "callback", "setPriceWithQuantity", "app_debug"})
public final class MenuItemBSFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuItemContractor.View {
    private com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuItemPresenter presenter;
    private com.ourdevelops.ourjek.databinding.FragmentMenuItemBsBinding binding;
    private com.ourdevelops.ourjek.models.ItemModel obj;
    private java.lang.String restaurantId = "0";
    private int currentQuantity = 1;
    private androidx.fragment.app.Fragment fragment;
    private com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck callBack;
    private java.lang.String itemPrice = "0";
    private java.lang.String id_fitur;
    private java.util.HashMap _$_findViewCache;
    
    public MenuItemBSFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void setInterface(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck callback) {
    }
    
    private final void receivingBundles() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadDataToViews() {
    }
    
    private final void quantityListener() {
    }
    
    private final void setPriceWithQuantity() {
    }
    
    private final void buttonClicks() {
    }
    
    @java.lang.Override()
    public void onAddedToCart() {
    }
}