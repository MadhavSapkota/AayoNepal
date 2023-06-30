package com.ourdevelops.ourjek.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR2\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R2\u0010\'\u001a\u0016\u0012\u0004\u0012\u00020(\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020(\u0018\u0001`\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R \u0010+\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR \u0010.\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR \u00101\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010:\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010\u001fR \u0010=\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR \u0010@\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001d\"\u0004\bB\u0010\u001fR \u0010C\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010I\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001d\"\u0004\bK\u0010\u001fR\u001e\u0010L\u001a\u0002058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u00107\"\u0004\bN\u00109R\u001e\u0010O\u001a\u0002058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u00107\"\u0004\bQ\u00109\u00a8\u0006R"}, d2 = {"Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;", "Ljava/io/Serializable;", "()V", "biaya", "", "getBiaya", "()J", "setBiaya", "(J)V", "biayaAkhir", "", "getBiayaAkhir", "()D", "setBiayaAkhir", "(D)V", "biaya_minimum", "getBiaya_minimum", "setBiaya_minimum", "delivery_type", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticItemModel;", "Lkotlin/collections/ArrayList;", "getDelivery_type", "()Ljava/util/ArrayList;", "setDelivery_type", "(Ljava/util/ArrayList;)V", "diskon", "", "getDiskon", "()Ljava/lang/String;", "setDiskon", "(Ljava/lang/String;)V", "distance_price_range", "", "Lcom/ourdevelops/ourjek/models/DeliveryDistancePriceRangeModel;", "getDistance_price_range", "()Ljava/util/List;", "setDistance_price_range", "(Ljava/util/List;)V", "estimated_weight", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticWeightModel;", "getEstimated_weight", "setEstimated_weight", "fitur", "getFitur", "setFitur", "home", "getHome", "setHome", "icon", "getIcon", "setIcon", "idFitur", "", "getIdFitur", "()I", "setIdFitur", "(I)V", "job", "getJob", "setJob", "keterangan", "getKeterangan", "setKeterangan", "keteranganBiaya", "getKeteranganBiaya", "setKeteranganBiaya", "loader_data", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticLoaderData;", "getLoader_data", "()Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticLoaderData;", "setLoader_data", "(Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticLoaderData;)V", "max_distance", "getMax_distance", "setMax_distance", "min_base_pay_distance", "getMin_base_pay_distance", "setMin_base_pay_distance", "vehicle_category_id", "getVehicle_category_id", "setVehicle_category_id", "app_debug"})
public final class NewAllFeatureModel implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "feature_id")
    @com.google.gson.annotations.Expose()
    private int idFitur = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "feature")
    @com.google.gson.annotations.Expose()
    private java.lang.String fitur;
    @com.google.gson.annotations.SerializedName(value = "cost")
    @com.google.gson.annotations.Expose()
    private long biaya = 0L;
    @com.google.gson.annotations.SerializedName(value = "minimum_cost")
    @com.google.gson.annotations.Expose()
    private long biaya_minimum = 0L;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "keterangan_biaya")
    @com.google.gson.annotations.Expose()
    private java.lang.String keteranganBiaya;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "keterangan")
    @com.google.gson.annotations.Expose()
    private java.lang.String keterangan;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "diskon")
    @com.google.gson.annotations.Expose()
    private java.lang.String diskon;
    @com.google.gson.annotations.SerializedName(value = "biaya_akhir")
    @com.google.gson.annotations.Expose()
    private double biayaAkhir = 0.0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "icon")
    @com.google.gson.annotations.Expose()
    private java.lang.String icon;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "driver_job")
    @com.google.gson.annotations.Expose()
    private java.lang.String job;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "home")
    @com.google.gson.annotations.Expose()
    private java.lang.String home;
    @com.google.gson.annotations.SerializedName(value = "vehicle_category_id")
    @com.google.gson.annotations.Expose()
    private int vehicle_category_id = 0;
    @com.google.gson.annotations.SerializedName(value = "min_distance")
    @com.google.gson.annotations.Expose()
    private int min_base_pay_distance = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "maks_distance")
    @com.google.gson.annotations.Expose()
    private java.lang.String max_distance;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "distance_price_range")
    private java.util.List<com.ourdevelops.ourjek.models.DeliveryDistancePriceRangeModel> distance_price_range;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "delivery_type")
    @com.google.gson.annotations.Expose()
    private java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel> delivery_type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weight_category")
    @com.google.gson.annotations.Expose()
    private java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> estimated_weight;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "loaders_data")
    @com.google.gson.annotations.Expose()
    private com.ourdevelops.ourjek.activity.logistic.data.LogisticLoaderData loader_data;
    
    public NewAllFeatureModel() {
        super();
    }
    
    public final int getIdFitur() {
        return 0;
    }
    
    public final void setIdFitur(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFitur() {
        return null;
    }
    
    public final void setFitur(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getBiaya() {
        return 0L;
    }
    
    public final void setBiaya(long p0) {
    }
    
    public final long getBiaya_minimum() {
        return 0L;
    }
    
    public final void setBiaya_minimum(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKeteranganBiaya() {
        return null;
    }
    
    public final void setKeteranganBiaya(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKeterangan() {
        return null;
    }
    
    public final void setKeterangan(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiskon() {
        return null;
    }
    
    public final void setDiskon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getBiayaAkhir() {
        return 0.0;
    }
    
    public final void setBiayaAkhir(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHome() {
        return null;
    }
    
    public final void setHome(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getVehicle_category_id() {
        return 0;
    }
    
    public final void setVehicle_category_id(int p0) {
    }
    
    public final int getMin_base_pay_distance() {
        return 0;
    }
    
    public final void setMin_base_pay_distance(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMax_distance() {
        return null;
    }
    
    public final void setMax_distance(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ourdevelops.ourjek.models.DeliveryDistancePriceRangeModel> getDistance_price_range() {
        return null;
    }
    
    public final void setDistance_price_range(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ourdevelops.ourjek.models.DeliveryDistancePriceRangeModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel> getDelivery_type() {
        return null;
    }
    
    public final void setDelivery_type(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> getEstimated_weight() {
        return null;
    }
    
    public final void setEstimated_weight(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.activity.logistic.data.LogisticLoaderData getLoader_data() {
        return null;
    }
    
    public final void setLoader_data(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.activity.logistic.data.LogisticLoaderData p0) {
    }
}