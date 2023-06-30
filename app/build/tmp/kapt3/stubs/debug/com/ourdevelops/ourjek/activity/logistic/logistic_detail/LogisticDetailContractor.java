package com.ourdevelops.ourjek.activity.logistic.logistic_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/logistic_detail/LogisticDetailContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface LogisticDetailContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\r"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/logistic_detail/LogisticDetailContractor$View;", "", "askForLoaders", "", "numberIsIncorrect", "field", "", "onLoaderNumberSelected", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "sendDataForPayment", "valueIsEmpty", "valueIsNotEmpty", "app_debug"})
    public static abstract interface View {
        
        public abstract void valueIsEmpty(@org.jetbrains.annotations.NotNull()
        java.lang.String field);
        
        public abstract void numberIsIncorrect(@org.jetbrains.annotations.NotNull()
        java.lang.String field);
        
        public abstract void valueIsNotEmpty(@org.jetbrains.annotations.NotNull()
        java.lang.String field);
        
        public abstract void askForLoaders();
        
        public abstract void onLoaderNumberSelected(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData);
        
        public abstract void sendDataForPayment(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/logistic_detail/LogisticDetailContractor$Presenter;", "", "checkValues", "", "allData", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "setAsapDeliveryTime", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void checkValues(@org.jetbrains.annotations.NotNull()
        com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel allData);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String setAsapDeliveryTime();
    }
}