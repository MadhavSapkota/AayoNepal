package com.ourdevelops.ourjek.activity.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/notification/NewNotificationContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface NewNotificationContractor {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00032\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/ourdevelops/ourjek/activity/notification/NewNotificationContractor$View;", "", "hideProgress", "", "onNotificationResponseFailure", "onNotificationResponseSuccess", "response", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/NewNotificationModel;", "Lkotlin/collections/ArrayList;", "showProgress", "app_debug"})
    public static abstract interface View {
        
        public abstract void showProgress();
        
        public abstract void hideProgress();
        
        public abstract void onNotificationResponseSuccess(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ourdevelops.ourjek.models.NewNotificationModel> response);
        
        public abstract void onNotificationResponseFailure();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/ourdevelops/ourjek/activity/notification/NewNotificationContractor$Presenter;", "", "getNotificationData", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getNotificationData();
    }
}