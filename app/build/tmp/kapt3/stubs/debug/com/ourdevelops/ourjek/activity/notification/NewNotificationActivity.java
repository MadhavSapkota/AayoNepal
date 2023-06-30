package com.ourdevelops.ourjek.activity.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0016J \u0010\u0014\u001a\u00020\u000e2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/ourdevelops/ourjek/activity/notification/NewNotificationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/notification/NewNotificationContractor$View;", "()V", "adapter", "Lcom/ourdevelops/ourjek/activity/notification/NewNotificationAdapter;", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityNewNotificationBinding;", "mList", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/NewNotificationModel;", "presenter", "Lcom/ourdevelops/ourjek/activity/notification/NewNotificationPresenter;", "hideProgress", "", "onButtonClicks", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNotificationResponseFailure", "onNotificationResponseSuccess", "response", "Lkotlin/collections/ArrayList;", "setUpViews", "showProgress", "app_debug"})
public final class NewNotificationActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.notification.NewNotificationContractor.View {
    private com.ourdevelops.ourjek.databinding.ActivityNewNotificationBinding binding;
    private com.ourdevelops.ourjek.activity.notification.NewNotificationPresenter presenter;
    private com.ourdevelops.ourjek.activity.notification.NewNotificationAdapter adapter;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.NewNotificationModel> mList;
    private java.util.HashMap _$_findViewCache;
    
    public NewNotificationActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onButtonClicks() {
    }
    
    private final void setUpViews() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void onNotificationResponseSuccess(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.NewNotificationModel> response) {
    }
    
    @java.lang.Override()
    public void onNotificationResponseFailure() {
    }
}