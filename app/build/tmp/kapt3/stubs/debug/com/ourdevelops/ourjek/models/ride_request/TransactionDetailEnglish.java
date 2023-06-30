package com.ourdevelops.ourjek.models.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010{\u001a\u00020\u0004J\u000e\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u007fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\'\"\u0004\bD\u0010)R\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020IX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010N\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001c\u0010T\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001c\u0010W\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001c\u0010]\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001c\u0010`\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001c\u0010c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001a\u0010f\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0015\"\u0004\bh\u0010\u0017R\u001a\u0010i\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0015\"\u0004\bk\u0010\u0017R\u001c\u0010l\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001c\u0010o\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001a\u0010r\u001a\u00020sX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001c\u0010x\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\b\u00a8\u0006\u0080\u0001"}, d2 = {"Lcom/ourdevelops/ourjek/models/ride_request/TransactionDetailEnglish;", "", "()V", "customerId", "", "getCustomerId", "()Ljava/lang/String;", "setCustomerId", "(Ljava/lang/String;)V", "destinationAddress", "getDestinationAddress", "setDestinationAddress", "discount", "getDiscount", "setDiscount", "discountTotal", "getDiscountTotal", "setDiscountTotal", "distance", "", "getDistance", "()D", "setDistance", "(D)V", "endLatitude", "getEndLatitude", "setEndLatitude", "endLongitude", "getEndLongitude", "setEndLongitude", "estimatedTime", "getEstimatedTime", "setEstimatedTime", "finalCost", "getFinalCost", "setFinalCost", "finishedTime", "Ljava/util/Date;", "getFinishedTime", "()Ljava/util/Date;", "setFinishedTime", "(Ljava/util/Date;)V", "goodsName", "getGoodsName", "setGoodsName", "grandTotal", "getGrandTotal", "setGrandTotal", "id", "getId", "setId", "idDriver", "getIdDriver", "setIdDriver", "merchantName", "getMerchantName", "setMerchantName", "merchantToken", "getMerchantToken", "setMerchantToken", "merchantTransactionId", "getMerchantTransactionId", "setMerchantTransactionId", "orderFeature", "getOrderFeature", "setOrderFeature", "orderTime", "getOrderTime", "setOrderTime", "originalAddress", "getOriginalAddress", "setOriginalAddress", "price", "", "getPrice", "()J", "setPrice", "(J)V", "promoCode", "getPromoCode", "setPromoCode", "promoCredit", "getPromoCredit", "setPromoCredit", "rate", "getRate", "setRate", "recipientName", "getRecipientName", "setRecipientName", "recipientPhone", "getRecipientPhone", "setRecipientPhone", "senderName", "getSenderName", "setSenderName", "senderPhone", "getSenderPhone", "setSenderPhone", "serviceCharge", "getServiceCharge", "setServiceCharge", "startLatitude", "getStartLatitude", "setStartLatitude", "startLongitude", "getStartLongitude", "setStartLongitude", "status", "getStatus", "setStatus", "totalCost", "getTotalCost", "setTotalCost", "useWallet", "", "getUseWallet", "()Z", "setUseWallet", "(Z)V", "vat", "getVat", "setVat", "getDiscountValue", "initFromTransaksi", "", "obj", "Lcom/ourdevelops/ourjek/models/TransaksiModel;", "app_debug"})
public final class TransactionDetailEnglish {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String customerId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String idDriver;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderFeature;
    private double startLatitude = 0.0;
    private double startLongitude = 0.0;
    private double endLatitude = 0.0;
    private double endLongitude = 0.0;
    private double distance = 0.0;
    private long price = 0L;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date orderTime;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date finishedTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String originalAddress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String destinationAddress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String promoCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String promoCredit;
    private boolean useWallet = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String estimatedTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String senderName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String senderPhone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String recipientName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String recipientPhone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String goodsName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String finalCost;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String totalCost;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String merchantName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String merchantToken;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String merchantTransactionId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String vat;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String serviceCharge;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String discount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String discountTotal;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String grandTotal;
    
    public TransactionDetailEnglish() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerId() {
        return null;
    }
    
    public final void setCustomerId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdDriver() {
        return null;
    }
    
    public final void setIdDriver(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderFeature() {
        return null;
    }
    
    public final void setOrderFeature(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getStartLatitude() {
        return 0.0;
    }
    
    public final void setStartLatitude(double p0) {
    }
    
    public final double getStartLongitude() {
        return 0.0;
    }
    
    public final void setStartLongitude(double p0) {
    }
    
    public final double getEndLatitude() {
        return 0.0;
    }
    
    public final void setEndLatitude(double p0) {
    }
    
    public final double getEndLongitude() {
        return 0.0;
    }
    
    public final void setEndLongitude(double p0) {
    }
    
    public final double getDistance() {
        return 0.0;
    }
    
    public final void setDistance(double p0) {
    }
    
    public final long getPrice() {
        return 0L;
    }
    
    public final void setPrice(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getOrderTime() {
        return null;
    }
    
    public final void setOrderTime(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getFinishedTime() {
        return null;
    }
    
    public final void setFinishedTime(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalAddress() {
        return null;
    }
    
    public final void setOriginalAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDestinationAddress() {
        return null;
    }
    
    public final void setDestinationAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromoCode() {
        return null;
    }
    
    public final void setPromoCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromoCredit() {
        return null;
    }
    
    public final void setPromoCredit(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getUseWallet() {
        return false;
    }
    
    public final void setUseWallet(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRate() {
        return null;
    }
    
    public final void setRate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEstimatedTime() {
        return null;
    }
    
    public final void setEstimatedTime(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getSenderPhone() {
        return null;
    }
    
    public final void setSenderPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRecipientName() {
        return null;
    }
    
    public final void setRecipientName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRecipientPhone() {
        return null;
    }
    
    public final void setRecipientPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGoodsName() {
        return null;
    }
    
    public final void setGoodsName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFinalCost() {
        return null;
    }
    
    public final void setFinalCost(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalCost() {
        return null;
    }
    
    public final void setTotalCost(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMerchantName() {
        return null;
    }
    
    public final void setMerchantName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMerchantToken() {
        return null;
    }
    
    public final void setMerchantToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMerchantTransactionId() {
        return null;
    }
    
    public final void setMerchantTransactionId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVat() {
        return null;
    }
    
    public final void setVat(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getServiceCharge() {
        return null;
    }
    
    public final void setServiceCharge(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getDiscountTotal() {
        return null;
    }
    
    public final void setDiscountTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGrandTotal() {
        return null;
    }
    
    public final void setGrandTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void initFromTransaksi(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.TransaksiModel obj) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiscountValue() {
        return null;
    }
}