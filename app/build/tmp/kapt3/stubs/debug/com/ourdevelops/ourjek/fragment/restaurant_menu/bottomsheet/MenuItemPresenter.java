package com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0011H\u0002J0\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J0\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000fH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\u000e\u0010&\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0007R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuItemPresenter;", "Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuItemContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuItemContractor$View;", "callBack", "Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuFragCartIconCheck;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuItemContractor$View;Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuFragCartIconCheck;)V", "getCallBack", "()Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuFragCartIconCheck;", "callback", "getContext", "()Landroid/content/Context;", "currentQuantity", "", "id_fitur", "", "obj", "Lcom/ourdevelops/ourjek/models/ItemModel;", "restaurantId", "getView", "()Lcom/ourdevelops/ourjek/fragment/restaurant_menu/bottomsheet/MenuItemContractor$View;", "AddPesanan", "", "idMakanan", "totalHarga", "", "qty", "notes", "addToCart", "addtocart", "id", "cost", "quantity", "catatan", "restaurant_id", "getCalculatedCost", "setInterface", "app_debug"})
public final class MenuItemPresenter implements com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuItemContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuItemContractor.View view = null;
    @org.jetbrains.annotations.Nullable()
    private final com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck callBack = null;
    private int currentQuantity = 0;
    private int restaurantId = 0;
    private com.ourdevelops.ourjek.models.ItemModel obj;
    private com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck callback;
    private java.lang.String id_fitur;
    
    public MenuItemPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuItemContractor.View view, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck callBack) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuItemContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck getCallBack() {
        return null;
    }
    
    public final void setInterface(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck callBack) {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.ItemModel obj, int restaurantId, int currentQuantity, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.String id_fitur) {
    }
    
    private final long getCalculatedCost() {
        return 0L;
    }
    
    private final void AddPesanan(int idMakanan, long totalHarga, int qty, java.lang.String notes) {
    }
    
    private final void addtocart(int id, long cost, int quantity, java.lang.String catatan, int restaurant_id) {
    }
}