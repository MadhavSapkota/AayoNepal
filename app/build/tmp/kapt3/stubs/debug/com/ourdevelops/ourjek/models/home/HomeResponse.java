package com.ourdevelops.ourjek.models.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\nj\b\u0012\u0004\u0012\u00020\u0012`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R.\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00160\nj\b\u0012\u0004\u0012\u00020\u0016`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR \u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR.\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020 0\nj\b\u0012\u0004\u0012\u00020 `\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R \u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR.\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\'0\nj\b\u0012\u0004\u0012\u00020\'`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R.\u0010*\u001a\u0012\u0012\u0004\u0012\u00020+0\nj\b\u0012\u0004\u0012\u00020+`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R.\u0010.\u001a\u0012\u0012\u0004\u0012\u00020/0\nj\b\u0012\u0004\u0012\u00020/`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R \u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR \u00105\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR \u00108\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR \u0010;\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR.\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0\nj\b\u0012\u0004\u0012\u00020?`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000e\"\u0004\bA\u0010\u0010R \u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR.\u0010E\u001a\u0012\u0012\u0004\u0012\u00020F0\nj\b\u0012\u0004\u0012\u00020F`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u000e\"\u0004\bH\u0010\u0010R \u0010I\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR.\u0010L\u001a\u0012\u0012\u0004\u0012\u00020M0\nj\b\u0012\u0004\u0012\u00020M`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000e\"\u0004\bO\u0010\u0010R \u0010P\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\bR.\u0010S\u001a\u0012\u0012\u0004\u0012\u00020T0\nj\b\u0012\u0004\u0012\u00020T`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u000e\"\u0004\bV\u0010\u0010R \u0010W\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\b\u00a8\u0006Z"}, d2 = {"Lcom/ourdevelops/ourjek/models/home/HomeResponse;", "", "()V", "aboutus", "", "getAboutus", "()Ljava/lang/String;", "setAboutus", "(Ljava/lang/String;)V", "allfitur", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/AllFiturModel;", "Lkotlin/collections/ArrayList;", "getAllfitur", "()Ljava/util/ArrayList;", "setAllfitur", "(Ljava/util/ArrayList;)V", "berita", "Lcom/ourdevelops/ourjek/models/BeritaModel;", "getBerita", "setBerita", "catmerchant", "Lcom/ourdevelops/ourjek/models/CatMerchantModel;", "getCatmerchant", "setCatmerchant", "currency", "getCurrency", "setCurrency", "currency_text", "getCurrency_text", "setCurrency_text", "data", "Lcom/ourdevelops/ourjek/models/User;", "getData", "setData", "email", "getEmail", "setEmail", "fitur", "Lcom/ourdevelops/ourjek/models/FiturModel;", "getFitur", "setFitur", "merchantnear", "Lcom/ourdevelops/ourjek/models/MerchantNearModel;", "getMerchantnear", "setMerchantnear", "merchantpromo", "Lcom/ourdevelops/ourjek/models/MerchantModel;", "getMerchantpromo", "setMerchantpromo", "message", "getMessage", "setMessage", "paypalactive", "getPaypalactive", "setPaypalactive", "paypalkey", "getPaypalkey", "setPaypalkey", "paypalmode", "getPaypalmode", "setPaypalmode", "payu", "Lcom/ourdevelops/ourjek/models/PayuModel;", "getPayu", "setPayu", "phone", "getPhone", "setPhone", "rating", "Lcom/ourdevelops/ourjek/models/RatingModel;", "getRating", "setRating", "saldo", "getSaldo", "setSaldo", "slider", "Lcom/ourdevelops/ourjek/models/PromoModel;", "getSlider", "setSlider", "stripeactive", "getStripeactive", "setStripeactive", "vehicle_category", "Lcom/ourdevelops/ourjek/models/VehicleModel;", "getVehicle_category", "setVehicle_category", "website", "getWebsite", "setWebsite", "app_debug"})
public final class HomeResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "saldo")
    private java.lang.String saldo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "currency")
    private java.lang.String currency;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "currency_text")
    private java.lang.String currency_text;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "app_aboutus")
    private java.lang.String aboutus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "app_email")
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "app_contact")
    private java.lang.String phone;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "app_website")
    private java.lang.String website;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "stripe_active")
    private java.lang.String stripeactive;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "paypal_key")
    private java.lang.String paypalkey;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "paypal_mode")
    private java.lang.String paypalmode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "paypal_active")
    private java.lang.String paypalactive;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "vehicle_category")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.VehicleModel> vehicle_category;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "fitur")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.FiturModel> fitur;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "allfitur")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.AllFiturModel> allfitur;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "ratinghome")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.RatingModel> rating;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "beritahome")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.BeritaModel> berita;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "slider")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.PromoModel> slider;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "data")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.User> data;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "merchantpromo")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantModel> merchantpromo;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "merchantnearby")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> merchantnear;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "kategorymerchanthome")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.CatMerchantModel> catmerchant;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "payu")
    private java.util.ArrayList<com.ourdevelops.ourjek.models.PayuModel> payu;
    
    public HomeResponse() {
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
    public final java.lang.String getSaldo() {
        return null;
    }
    
    public final void setSaldo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency_text() {
        return null;
    }
    
    public final void setCurrency_text(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAboutus() {
        return null;
    }
    
    public final void setAboutus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebsite() {
        return null;
    }
    
    public final void setWebsite(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStripeactive() {
        return null;
    }
    
    public final void setStripeactive(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaypalkey() {
        return null;
    }
    
    public final void setPaypalkey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaypalmode() {
        return null;
    }
    
    public final void setPaypalmode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaypalactive() {
        return null;
    }
    
    public final void setPaypalactive(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.VehicleModel> getVehicle_category() {
        return null;
    }
    
    public final void setVehicle_category(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.VehicleModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.FiturModel> getFitur() {
        return null;
    }
    
    public final void setFitur(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.FiturModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.AllFiturModel> getAllfitur() {
        return null;
    }
    
    public final void setAllfitur(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.AllFiturModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.RatingModel> getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.RatingModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.BeritaModel> getBerita() {
        return null;
    }
    
    public final void setBerita(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.BeritaModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.PromoModel> getSlider() {
        return null;
    }
    
    public final void setSlider(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.PromoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.User> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantModel> getMerchantpromo() {
        return null;
    }
    
    public final void setMerchantpromo(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> getMerchantnear() {
        return null;
    }
    
    public final void setMerchantnear(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.MerchantNearModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.CatMerchantModel> getCatmerchant() {
        return null;
    }
    
    public final void setCatmerchant(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.CatMerchantModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.PayuModel> getPayu() {
        return null;
    }
    
    public final void setPayu(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.PayuModel> p0) {
    }
}