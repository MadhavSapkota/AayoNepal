package com.ourdevelops.ourjek.activity.logistic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/LogisticContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface LogisticContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/LogisticContractor$View;", "", "app_debug"})
    public static abstract interface View {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/LogisticContractor$Presenter;", "", "getAllSavedAddress", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getAllSavedAddress();
    }
}