package com.ourdevelops.ourjek.activity.my_address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0011\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ourdevelops/ourjek/activity/my_address/MyAddressesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ourdevelops/ourjek/json/SavedAddressObj;", "Lcom/ourdevelops/ourjek/activity/my_address/MyAddressesAdapter$ViewHolder;", "()V", "onAddressClickListener", "Lcom/ourdevelops/ourjek/activity/my_address/MyAddressesAdapter$OnAddressClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnAddressClickListener", "Companion", "OnAddressClickListener", "ViewHolder", "app_debug"})
public final class MyAddressesAdapter extends androidx.recyclerview.widget.ListAdapter<com.ourdevelops.ourjek.json.SavedAddressObj, com.ourdevelops.ourjek.activity.my_address.MyAddressesAdapter.ViewHolder> {
    private com.ourdevelops.ourjek.activity.my_address.MyAddressesAdapter.OnAddressClickListener onAddressClickListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.activity.my_address.MyAddressesAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ourdevelops.ourjek.json.SavedAddressObj> diffUtil = null;
    
    public MyAddressesAdapter() {
        super(null);
    }
    
    public final void setOnAddressClickListener(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.my_address.MyAddressesAdapter.OnAddressClickListener onAddressClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ourdevelops.ourjek.activity.my_address.MyAddressesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.my_address.MyAddressesAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ourdevelops/ourjek/activity/my_address/MyAddressesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ourdevelops/ourjek/databinding/MyAddressesRowItemBinding;", "(Lcom/ourdevelops/ourjek/activity/my_address/MyAddressesAdapter;Lcom/ourdevelops/ourjek/databinding/MyAddressesRowItemBinding;)V", "updateView", "", "savedAddressObj", "Lcom/ourdevelops/ourjek/json/SavedAddressObj;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.ourdevelops.ourjek.databinding.MyAddressesRowItemBinding view = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.databinding.MyAddressesRowItemBinding view) {
            super(null);
        }
        
        public final void updateView(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.SavedAddressObj savedAddressObj) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/ourdevelops/ourjek/activity/my_address/MyAddressesAdapter$OnAddressClickListener;", "", "onAddressClicked", "", "position", "", "savedAddressObj", "Lcom/ourdevelops/ourjek/json/SavedAddressObj;", "app_debug"})
    public static abstract interface OnAddressClickListener {
        
        public abstract void onAddressClicked(int position, @org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.json.SavedAddressObj savedAddressObj);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ourdevelops/ourjek/activity/my_address/MyAddressesAdapter$Companion;", "", "()V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ourdevelops/ourjek/json/SavedAddressObj;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}