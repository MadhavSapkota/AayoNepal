package com.ourdevelops.ourjek.activity.logistic.logistic_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/logistic_detail/LogisticDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/logistic/logistic_detail/LogisticDetailContractor$View;", "()V", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityLogisticDetailBinding;", "checked", "", "deliveryDateTime", "", "presenter", "Lcom/ourdevelops/ourjek/activity/logistic/logistic_detail/LogisticDetailPresenter;", "askForLoaders", "", "getIntentData", "numberIsIncorrect", "field", "onButtonClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoaderNumberSelected", "onRadioButtonClicked", "view", "Landroid/view/View;", "sendDataForPayment", "setUpViews", "timePickerMethod", "valueIsEmpty", "valueIsNotEmpty", "app_debug"})
public final class LogisticDetailActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.logistic.logistic_detail.LogisticDetailContractor.View {
    private com.ourdevelops.ourjek.databinding.ActivityLogisticDetailBinding binding;
    private com.ourdevelops.ourjek.activity.logistic.logistic_detail.LogisticDetailPresenter presenter;
    private com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData;
    private boolean checked = false;
    private java.lang.String deliveryDateTime;
    private java.util.HashMap _$_findViewCache;
    
    public LogisticDetailActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViews() {
    }
    
    private final void getIntentData() {
    }
    
    private final void onButtonClick() {
    }
    
    private final void timePickerMethod() {
    }
    
    @java.lang.Override()
    public void valueIsEmpty(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
    }
    
    @java.lang.Override()
    public void numberIsIncorrect(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
    }
    
    @java.lang.Override()
    public void valueIsNotEmpty(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
    }
    
    @java.lang.Override()
    public void askForLoaders() {
    }
    
    @java.lang.Override()
    public void onLoaderNumberSelected(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData) {
    }
    
    @java.lang.Override()
    public void sendDataForPayment(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData) {
    }
    
    public final void onRadioButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}