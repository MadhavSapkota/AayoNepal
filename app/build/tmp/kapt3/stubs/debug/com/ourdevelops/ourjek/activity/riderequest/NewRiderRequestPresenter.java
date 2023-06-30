package com.ourdevelops.ourjek.activity.riderequest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J!\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestPresenter;", "Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestContractor$View;", "address", "Lcom/ourdevelops/ourjek/activity/riderequest/saved_address/SavedAddressRequestInterface;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestContractor$View;Lcom/ourdevelops/ourjek/activity/riderequest/saved_address/SavedAddressRequestInterface;)V", "getAddress", "()Lcom/ourdevelops/ourjek/activity/riderequest/saved_address/SavedAddressRequestInterface;", "getContext", "()Landroid/content/Context;", "getView", "()Lcom/ourdevelops/ourjek/activity/riderequest/NewRiderRequestContractor$View;", "getAllSavedAddress", "", "getNearestRiders", "filterId", "", "myLocationWrapper", "Lcom/ourdevelops/ourjek/models/LocationWrapper;", "(Ljava/lang/Integer;Lcom/ourdevelops/ourjek/models/LocationWrapper;)V", "app_debug"})
public final class NewRiderRequestPresenter implements com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestContractor.View view = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRequestInterface address = null;
    
    public NewRiderRequestPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestContractor.View view, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRequestInterface address) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.activity.riderequest.saved_address.SavedAddressRequestInterface getAddress() {
        return null;
    }
    
    @java.lang.Override()
    public void getNearestRiders(@org.jetbrains.annotations.Nullable()
    java.lang.Integer filterId, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.LocationWrapper myLocationWrapper) {
    }
    
    @java.lang.Override()
    public void getAllSavedAddress() {
    }
}