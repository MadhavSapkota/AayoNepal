package com.ourdevelops.ourjek.activity.logistic.item_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/item_detail/LogisticItemDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ourdevelops/ourjek/activity/logistic/item_detail/LogisticItemDetailContractor$View;", "()V", "adapter", "Lcom/ourdevelops/ourjek/activity/logistic/item_detail/LogisticItemDetailAdapter;", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityLogisticItemDetailBinding;", "itemList", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticItemModel;", "presenter", "Lcom/ourdevelops/ourjek/activity/logistic/item_detail/LogisticItemDetailPresenter;", "weightList", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticWeightModel;", "getIntentData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onWeightSelected", "position", "", "holderPosition", "setUpData", "setUpViews", "app_debug"})
public final class LogisticItemDetailActivity extends androidx.appcompat.app.AppCompatActivity implements com.ourdevelops.ourjek.activity.logistic.item_detail.LogisticItemDetailContractor.View {
    private com.ourdevelops.ourjek.databinding.ActivityLogisticItemDetailBinding binding;
    private com.ourdevelops.ourjek.activity.logistic.item_detail.LogisticItemDetailPresenter presenter;
    private com.ourdevelops.ourjek.activity.logistic.item_detail.LogisticItemDetailAdapter adapter;
    private java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel> itemList;
    private com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData;
    private java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> weightList;
    private java.util.HashMap _$_findViewCache;
    
    public LogisticItemDetailActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getIntentData() {
    }
    
    private final void setUpData() {
    }
    
    private final void setUpViews() {
    }
    
    @java.lang.Override()
    public void onWeightSelected(int position, int holderPosition) {
    }
}