package com.ourdevelops.ourjek.json;

import java.lang.System;

/**
 * Created by Pagodalabs
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/ourdevelops/ourjek/json/AllMerchantByNearResponseJson;", "", "()V", "data", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/MerchantNearModel;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "kategori", "", "Lcom/ourdevelops/ourjek/models/CatMerchantModel;", "getKategori", "()Ljava/util/List;", "setKategori", "(Ljava/util/List;)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "app_debug"})
public final class AllMerchantByNearResponseJson {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "allmerchantnearby")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> data;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "kategorymerchant")
    private java.util.List<? extends com.ourdevelops.ourjek.models.CatMerchantModel> kategori;
    
    public AllMerchantByNearResponseJson() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ourdevelops.ourjek.models.CatMerchantModel> getKategori() {
        return null;
    }
    
    public final void setKategori(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.ourdevelops.ourjek.models.CatMerchantModel> p0) {
    }
}