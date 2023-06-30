package com.ourdevelops.ourjek.activity.logistic.loader_fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u001f\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/loader_fragment/LogisticLoaderFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/ourdevelops/ourjek/activity/logistic/loader_fragment/LogisticLoaderContractor$View;", "()V", "adapter", "Lcom/ourdevelops/ourjek/activity/logistic/loader_fragment/LogisticLoaderAdapter;", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "binding", "Lcom/ourdevelops/ourjek/databinding/FragmentLogisticLoaderBinding;", "callBack", "Lcom/ourdevelops/ourjek/activity/logistic/logistic_detail/LogisticDetailContractor$View;", "presenter", "Lcom/ourdevelops/ourjek/activity/logistic/loader_fragment/LogisticLoaderPresenter;", "size", "", "onButtonClicks", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLoaderNumberChanged", "onViewCreated", "view", "receiveBundleData", "setInterface", "setUpData", "app_debug"})
public final class LogisticLoaderFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements com.ourdevelops.ourjek.activity.logistic.loader_fragment.LogisticLoaderContractor.View {
    private com.ourdevelops.ourjek.databinding.FragmentLogisticLoaderBinding binding;
    private com.ourdevelops.ourjek.activity.logistic.logistic_detail.LogisticDetailContractor.View callBack;
    private com.ourdevelops.ourjek.activity.logistic.loader_fragment.LogisticLoaderAdapter adapter;
    private com.ourdevelops.ourjek.activity.logistic.loader_fragment.LogisticLoaderPresenter presenter;
    private int size = 0;
    private com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData;
    private java.util.HashMap _$_findViewCache;
    
    public LogisticLoaderFragment() {
        super();
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
    
    private final void setUpData() {
    }
    
    private final void onButtonClicks() {
    }
    
    public final void setInterface(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.logistic.logistic_detail.LogisticDetailContractor.View callBack) {
    }
    
    private final void receiveBundleData() {
    }
    
    @java.lang.Override()
    public void onLoaderNumberChanged(int size) {
    }
}