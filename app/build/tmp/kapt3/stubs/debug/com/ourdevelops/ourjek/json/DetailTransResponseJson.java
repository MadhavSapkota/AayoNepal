package com.ourdevelops.ourjek.json;

import java.lang.System;

/**
 * Created by Pagodalabs
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/ourdevelops/ourjek/json/DetailTransResponseJson;", "", "()V", "data", "", "Lcom/ourdevelops/ourjek/models/TransaksiModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "driver", "Lcom/ourdevelops/ourjek/models/DriverModel;", "getDriver", "setDriver", "item", "Lcom/ourdevelops/ourjek/models/ItemPesananModel;", "getItem", "promo", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "getPromo", "()Lcom/ourdevelops/ourjek/models/KodePromoModel;", "app_debug"})
public final class DetailTransResponseJson {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "data")
    @com.google.gson.annotations.Expose()
    private java.util.List<? extends com.ourdevelops.ourjek.models.TransaksiModel> data;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "driver")
    @com.google.gson.annotations.Expose()
    private java.util.List<? extends com.ourdevelops.ourjek.models.DriverModel> driver;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "item")
    @com.google.gson.annotations.Expose()
    private final java.util.List<com.ourdevelops.ourjek.models.ItemPesananModel> item = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "promo")
    @com.google.gson.annotations.Expose()
    private final com.ourdevelops.ourjek.models.KodePromoModel promo = null;
    
    public DetailTransResponseJson() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ourdevelops.ourjek.models.TransaksiModel> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.ourdevelops.ourjek.models.TransaksiModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ourdevelops.ourjek.models.DriverModel> getDriver() {
        return null;
    }
    
    public final void setDriver(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.ourdevelops.ourjek.models.DriverModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ourdevelops.ourjek.models.ItemPesananModel> getItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.models.KodePromoModel getPromo() {
        return null;
    }
}