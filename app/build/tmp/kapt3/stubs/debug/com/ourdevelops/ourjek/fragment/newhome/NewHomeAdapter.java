package com.ourdevelops.ourjek.fragment.newhome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mlist", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/home/NewHomeModel;", "Lkotlin/collections/ArrayList;", "callBack", "Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$View;", "(Ljava/util/ArrayList;Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$View;)V", "getCallBack", "()Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$View;", "setCallBack", "(Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$View;)V", "cartView", "", "categoryView", "featuredRestaurantsView", "helloView", "itemTitle", "getMlist", "()Ljava/util/ArrayList;", "pickLocationView", "restaurantItem", "rideSearchView", "searchView", "spaceView", "specialOffersView", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class NewHomeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.ourdevelops.ourjek.models.home.NewHomeModel> mlist = null;
    @org.jetbrains.annotations.NotNull()
    private com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor.View callBack;
    private final int pickLocationView = 0;
    private final int categoryView = 1;
    private final int featuredRestaurantsView = 2;
    private final int specialOffersView = 3;
    private final int spaceView = 4;
    private final int cartView = 5;
    private final int helloView = 6;
    private final int restaurantItem = 7;
    private final int itemTitle = 8;
    private final int searchView = 9;
    private final int rideSearchView = 10;
    
    public NewHomeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.home.NewHomeModel> mlist, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor.View callBack) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.home.NewHomeModel> getMlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor.View getCallBack() {
        return null;
    }
    
    public final void setCallBack(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}