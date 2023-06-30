package com.ourdevelops.ourjek.activity.logistic.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u00ab\u0001\u001a\u00030\u00ac\u00012\b\u0010\u00ad\u0001\u001a\u00030\u00ae\u0001J\u0014\u0010\u00af\u0001\u001a\u00030\u00ac\u00012\b\u0010\u00ad\u0001\u001a\u00030\u00ae\u0001H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R \u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010(\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010.\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001c\u00101\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001c\u00104\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017R\u001c\u00107\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010\u0017R\u001c\u0010:\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0015\"\u0004\b<\u0010\u0017R\u001e\u0010=\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,R\u001c\u0010@\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0015\"\u0004\bB\u0010\u0017R \u0010C\u001a\b\u0012\u0004\u0012\u00020D0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010%\"\u0004\bF\u0010\'R\u001c\u0010G\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0015\"\u0004\bI\u0010\u0017R\u001c\u0010J\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0015\"\u0004\bL\u0010\u0017R\u001c\u0010M\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0015\"\u0004\bO\u0010\u0017R\u001a\u0010P\u001a\u00020QX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020WX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020WX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010X\"\u0004\b\\\u0010ZR\u001c\u0010]\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0015\"\u0004\b_\u0010\u0017R\u001c\u0010`\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0015\"\u0004\bb\u0010\u0017R\u001c\u0010c\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0015\"\u0004\be\u0010\u0017R\u001c\u0010f\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0015\"\u0004\bh\u0010\u0017R\u001c\u0010i\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0015\"\u0004\bk\u0010\u0017R\u001c\u0010l\u001a\u0004\u0018\u00010mX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010r\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0015\"\u0004\bt\u0010\u0017R\u001e\u0010u\u001a\u0004\u0018\u00010QX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010z\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001e\u0010{\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b|\u0010*\"\u0004\b}\u0010,R\u001f\u0010~\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0011\n\u0002\u0010-\u001a\u0004\b\u007f\u0010*\"\u0005\b\u0080\u0001\u0010,R\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0015\"\u0005\b\u0083\u0001\u0010\u0017R\"\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001d\u0010\u008a\u0001\u001a\u00020WX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010X\"\u0005\b\u008c\u0001\u0010ZR\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0015\"\u0005\b\u008f\u0001\u0010\u0017R\u001f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0015\"\u0005\b\u0092\u0001\u0010\u0017R\u001f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u0015\"\u0005\b\u0095\u0001\u0010\u0017R!\u0010\u0096\u0001\u001a\u0004\u0018\u00010QX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010z\u001a\u0005\b\u0097\u0001\u0010w\"\u0005\b\u0098\u0001\u0010yR\u001f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0015\"\u0005\b\u009b\u0001\u0010\u0017R\u001f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0015\"\u0005\b\u009e\u0001\u0010\u0017R\u001f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010\u0015\"\u0005\b\u00a1\u0001\u0010\u0017R\u001f\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0001\u0010\u0015\"\u0005\b\u00a4\u0001\u0010\u0017R\u001d\u0010\u00a5\u0001\u001a\u00020QX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0001\u0010S\"\u0005\b\u00a7\u0001\u0010UR\u001f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0001\u0010\u0015\"\u0005\b\u00aa\u0001\u0010\u0017\u00a8\u0006\u00b0\u0001"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticDataModel;", "Ljava/io/Serializable;", "()V", "biaya", "", "getBiaya", "()J", "setBiaya", "(J)V", "biayaAkhir", "", "getBiayaAkhir", "()D", "setBiayaAkhir", "(D)V", "biaya_minimum", "getBiaya_minimum", "setBiaya_minimum", "chosenEstimatedWeight", "", "getChosenEstimatedWeight", "()Ljava/lang/String;", "setChosenEstimatedWeight", "(Ljava/lang/String;)V", "deliveryDateTime", "getDeliveryDateTime", "setDeliveryDateTime", "deliveryFee", "getDeliveryFee", "setDeliveryFee", "deliveryId", "getDeliveryId", "setDeliveryId", "delivery_type", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticItemModel;", "getDelivery_type", "()Ljava/util/ArrayList;", "setDelivery_type", "(Ljava/util/ArrayList;)V", "destinationLat", "getDestinationLat", "()Ljava/lang/Double;", "setDestinationLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "destinationLng", "getDestinationLng", "setDestinationLng", "destinationLocation", "getDestinationLocation", "setDestinationLocation", "discount", "getDiscount", "setDiscount", "discountTotal", "getDiscountTotal", "setDiscountTotal", "diskon", "getDiskon", "setDiskon", "distance", "getDistance", "setDistance", "estimatedWeightPrice", "getEstimatedWeightPrice", "setEstimatedWeightPrice", "estimated_weight", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticWeightModel;", "getEstimated_weight", "setEstimated_weight", "fitur", "getFitur", "setFitur", "home", "getHome", "setHome", "icon", "getIcon", "setIcon", "idFitur", "", "getIdFitur", "()I", "setIdFitur", "(I)V", "isComplimentary", "", "()Z", "setComplimentary", "(Z)V", "isDeliveryFree", "setDeliveryFree", "itemName", "getItemName", "setItemName", "job", "getJob", "setJob", "keterangan", "getKeterangan", "setKeterangan", "keteranganBiaya", "getKeteranganBiaya", "setKeteranganBiaya", "loaderFee", "getLoaderFee", "setLoaderFee", "loader_data", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticLoaderData;", "getLoader_data", "()Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticLoaderData;", "setLoader_data", "(Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticLoaderData;)V", "max_distance", "getMax_distance", "setMax_distance", "min_base_pay_distance", "getMin_base_pay_distance", "()Ljava/lang/Integer;", "setMin_base_pay_distance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pickUpLat", "getPickUpLat", "setPickUpLat", "pickUpLng", "getPickUpLng", "setPickUpLng", "pickUpLocation", "getPickUpLocation", "setPickUpLocation", "promo", "Lcom/ourdevelops/ourjek/models/KodePromoModel;", "getPromo", "()Lcom/ourdevelops/ourjek/models/KodePromoModel;", "setPromo", "(Lcom/ourdevelops/ourjek/models/KodePromoModel;)V", "promoStatus", "getPromoStatus", "setPromoStatus", "receiverName", "getReceiverName", "setReceiverName", "receiverNumber", "getReceiverNumber", "setReceiverNumber", "remarks", "getRemarks", "setRemarks", "selectedNumberOfLoaders", "getSelectedNumberOfLoaders", "setSelectedNumberOfLoaders", "senderName", "getSenderName", "setSenderName", "senderNumber", "getSenderNumber", "setSenderNumber", "time", "getTime", "setTime", "total", "getTotal", "setTotal", "vehicle_category_id", "getVehicle_category_id", "setVehicle_category_id", "weightFee", "getWeightFee", "setWeightFee", "init", "", "data", "Lcom/ourdevelops/ourjek/models/NewAllFeatureModel;", "parseData", "app_debug"})
public final class LogisticDataModel implements java.io.Serializable {
    private int idFitur = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fitur;
    private long biaya = 0L;
    private long biaya_minimum = 0L;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String keteranganBiaya;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String keterangan;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String diskon;
    private double biayaAkhir = 0.0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String icon;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String job;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String home;
    private int vehicle_category_id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer min_base_pay_distance;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel> delivery_type;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> estimated_weight;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.activity.logistic.data.LogisticLoaderData loader_data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String max_distance;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double distance;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double pickUpLat;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double pickUpLng;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double destinationLat;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double destinationLng;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pickUpLocation;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String destinationLocation;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String time;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String itemName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String deliveryId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String chosenEstimatedWeight;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String estimatedWeightPrice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String senderName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String receiverName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String senderNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String receiverNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String remarks;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedNumberOfLoaders;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String deliveryDateTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String deliveryFee;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String weightFee;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String loaderFee;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String total;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String discountTotal;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String discount;
    @org.jetbrains.annotations.Nullable()
    private com.ourdevelops.ourjek.models.KodePromoModel promo;
    private boolean promoStatus = false;
    private boolean isDeliveryFree = false;
    private boolean isComplimentary = false;
    
    public LogisticDataModel() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMin_base_pay_distance() {
        return null;
    }
    
    public final void setMin_base_pay_distance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel> getDelivery_type() {
        return null;
    }
    
    public final void setDelivery_type(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> getEstimated_weight() {
        return null;
    }
    
    public final void setEstimated_weight(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.activity.logistic.data.LogisticLoaderData getLoader_data() {
        return null;
    }
    
    public final void setLoader_data(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.activity.logistic.data.LogisticLoaderData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMax_distance() {
        return null;
    }
    
    public final void setMax_distance(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDistance() {
        return null;
    }
    
    public final void setDistance(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPickUpLat() {
        return null;
    }
    
    public final void setPickUpLat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPickUpLng() {
        return null;
    }
    
    public final void setPickUpLng(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDestinationLat() {
        return null;
    }
    
    public final void setDestinationLat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDestinationLng() {
        return null;
    }
    
    public final void setDestinationLng(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPickUpLocation() {
        return null;
    }
    
    public final void setPickUpLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDestinationLocation() {
        return null;
    }
    
    public final void setDestinationLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItemName() {
        return null;
    }
    
    public final void setItemName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryId() {
        return null;
    }
    
    public final void setDeliveryId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChosenEstimatedWeight() {
        return null;
    }
    
    public final void setChosenEstimatedWeight(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEstimatedWeightPrice() {
        return null;
    }
    
    public final void setEstimatedWeightPrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSenderName() {
        return null;
    }
    
    public final void setSenderName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiverName() {
        return null;
    }
    
    public final void setReceiverName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSenderNumber() {
        return null;
    }
    
    public final void setSenderNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiverNumber() {
        return null;
    }
    
    public final void setReceiverNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    public final void setRemarks(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedNumberOfLoaders() {
        return null;
    }
    
    public final void setSelectedNumberOfLoaders(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryDateTime() {
        return null;
    }
    
    public final void setDeliveryDateTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryFee() {
        return null;
    }
    
    public final void setDeliveryFee(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWeightFee() {
        return null;
    }
    
    public final void setWeightFee(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLoaderFee() {
        return null;
    }
    
    public final void setLoaderFee(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscountTotal() {
        return null;
    }
    
    public final void setDiscountTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscount() {
        return null;
    }
    
    public final void setDiscount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ourdevelops.ourjek.models.KodePromoModel getPromo() {
        return null;
    }
    
    public final void setPromo(@org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.KodePromoModel p0) {
    }
    
    public final boolean getPromoStatus() {
        return false;
    }
    
    public final void setPromoStatus(boolean p0) {
    }
    
    public final boolean isDeliveryFree() {
        return false;
    }
    
    public final void setDeliveryFree(boolean p0) {
    }
    
    public final boolean isComplimentary() {
        return false;
    }
    
    public final void setComplimentary(boolean p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.NewAllFeatureModel data) {
    }
    
    private final void parseData(com.ourdevelops.ourjek.models.NewAllFeatureModel data) {
    }
}