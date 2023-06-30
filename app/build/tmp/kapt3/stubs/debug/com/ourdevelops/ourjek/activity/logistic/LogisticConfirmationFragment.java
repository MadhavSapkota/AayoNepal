package com.ourdevelops.ourjek.activity.logistic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fJ\b\u0010 \u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/LogisticConfirmationFragment;", "Landroidx/fragment/app/Fragment;", "callBack", "Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "(Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;)V", "binding", "Lcom/ourdevelops/ourjek/databinding/FragmentLogisticConfirmationBinding;", "getCallBack", "()Lcom/ourdevelops/ourjek/activity/riderequest/managers/RideRequestInterface;", "distance", "", "dropLocationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "pickLocationWrapper", "routeJson", "", "buttonClicks", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setPickDropLocations", "pickLocation", "dropLocation", "response", "setUpView", "app_debug"})
public final class LogisticConfirmationFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface callBack = null;
    private double distance = 0.0;
    private com.ourdevelops.ourjek.databinding.FragmentLogisticConfirmationBinding binding;
    private com.ourdevelops.ourjek.models.LocationWrapper pickLocationWrapper;
    private com.ourdevelops.ourjek.models.LocationWrapper dropLocationWrapper;
    private java.lang.String routeJson;
    private java.util.HashMap _$_findViewCache;
    
    public LogisticConfirmationFragment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface callBack) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface getCallBack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    private final void setUpView() {
    }
    
    private final void buttonClicks() {
    }
    
    public final void setPickDropLocations(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.LocationWrapper pickLocation, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.LocationWrapper dropLocation, @org.jetbrains.annotations.Nullable()
    java.lang.String response) {
    }
}