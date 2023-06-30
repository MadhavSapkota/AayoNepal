package com.ourdevelops.ourjek.json;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/ourdevelops/ourjek/json/NewDynamicHomeJson;", "", "()V", "customerData", "Lcom/ourdevelops/ourjek/models/User;", "getCustomerData", "()Lcom/ourdevelops/ourjek/models/User;", "setCustomerData", "(Lcom/ourdevelops/ourjek/models/User;)V", "feature", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;", "getFeature", "()Ljava/util/ArrayList;", "setFeature", "(Ljava/util/ArrayList;)V", "newDynamicHome", "Lcom/ourdevelops/ourjek/models/NewDynamicHomeModel;", "getNewDynamicHome", "setNewDynamicHome", "settings", "Lcom/ourdevelops/ourjek/models/AppSettingsModel;", "getSettings", "()Lcom/ourdevelops/ourjek/models/AppSettingsModel;", "setSettings", "(Lcom/ourdevelops/ourjek/models/AppSettingsModel;)V", "app_debug"})
public final class NewDynamicHomeJson {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "home_data")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.NewDynamicHomeModel> newDynamicHome;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "customer_data")
    private com.ourdevelops.ourjek.models.User customerData;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "fitur")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.NewAllFeatureModel> feature;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "app_settings")
    private com.ourdevelops.ourjek.models.AppSettingsModel settings;
    
    public NewDynamicHomeJson() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.NewDynamicHomeModel> getNewDynamicHome() {
        return null;
    }
    
    public final void setNewDynamicHome(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.NewDynamicHomeModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.User getCustomerData() {
        return null;
    }
    
    public final void setCustomerData(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.NewAllFeatureModel> getFeature() {
        return null;
    }
    
    public final void setFeature(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.NewAllFeatureModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.AppSettingsModel getSettings() {
        return null;
    }
    
    public final void setSettings(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.AppSettingsModel p0) {
    }
}