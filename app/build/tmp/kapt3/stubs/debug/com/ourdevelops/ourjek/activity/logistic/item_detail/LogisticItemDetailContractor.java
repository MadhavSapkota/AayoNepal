package com.ourdevelops.ourjek.activity.logistic.item_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/item_detail/LogisticItemDetailContractor;", "", "Adapter", "Presenter", "View", "app_debug"})
public abstract interface LogisticItemDetailContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/item_detail/LogisticItemDetailContractor$View;", "", "onWeightSelected", "", "position", "", "holderPosition", "app_debug"})
    public static abstract interface View {
        
        public abstract void onWeightSelected(int position, int holderPosition);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/item_detail/LogisticItemDetailContractor$Presenter;", "", "app_debug"})
    public static abstract interface Presenter {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/item_detail/LogisticItemDetailContractor$Adapter;", "", "app_debug"})
    public static abstract interface Adapter {
    }
}