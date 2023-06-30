package com.ourdevelops.ourjek.fragment.newhome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001f\u001a\u00020\u0016J\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020!H\u0002J\u0018\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020!H\u0016J\u0006\u0010)\u001a\u00020!R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\fj\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006*"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/newhome/NewHomePresenter;", "Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$View;", "activity", "Landroid/app/Activity;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$View;Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "allfiturdata", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/AllFiturModel;", "getContext", "()Landroid/content/Context;", "fiturdata", "Lcom/ourdevelops/ourjek/models/FiturModel;", "fiturlist", "Lcom/ourdevelops/ourjek/models/FiturDataModel;", "Lkotlin/collections/ArrayList;", "hasData", "", "loginUser", "Lcom/ourdevelops/ourjek/models/User;", "getLoginUser", "()Lcom/ourdevelops/ourjek/models/User;", "mlist", "Lcom/ourdevelops/ourjek/models/home/NewHomeModel;", "getView", "()Lcom/ourdevelops/ourjek/fragment/newhome/NewHomeContractor$View;", "checkCart", "checkRideStatusAndCart", "", "checkRideStatusFromNetwork", "gethome", "longitude", "", "latitude", "initializeHome", "requestData", "requestRestaurants", "app_debug"})
public final class NewHomePresenter implements com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor.View view = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.home.NewHomeModel> mlist;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.AllFiturModel> allfiturdata;
    private final java.util.ArrayList<com.ourdevelops.ourjek.models.FiturDataModel> fiturlist = null;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.FiturModel> fiturdata;
    private boolean hasData = false;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.models.User loginUser = null;
    
    public NewHomePresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor.View view, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.User getLoginUser() {
        return null;
    }
    
    @java.lang.Override()
    public void initializeHome() {
    }
    
    private final void gethome(double longitude, double latitude) {
    }
    
    public final void requestRestaurants() {
    }
    
    public final void checkRideStatusAndCart() {
    }
    
    private final void checkRideStatusFromNetwork() {
    }
    
    @java.lang.Override()
    public void requestData() {
    }
    
    public final boolean checkCart() {
        return false;
    }
}