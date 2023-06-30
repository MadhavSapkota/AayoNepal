package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ourdevelops.ourjek.models.AllFiturModel;
import com.ourdevelops.ourjek.models.BeritaModel;
import com.ourdevelops.ourjek.models.CatMerchantModel;
import com.ourdevelops.ourjek.models.FiturModel;
import com.ourdevelops.ourjek.models.MerchantModel;
import com.ourdevelops.ourjek.models.MerchantNearModel;
import com.ourdevelops.ourjek.models.PayuModel;
import com.ourdevelops.ourjek.models.PromoModel;
import com.ourdevelops.ourjek.models.RatingModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.models.VehicleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs on 10/13/2019.
 */

public class GetHomeResponseJson {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("saldo")
    @Expose
    private String saldo;

    @SerializedName("currency")
    @Expose
    private String currency;

    @SerializedName("currency_text")
    @Expose
    private String currency_text;

    @SerializedName("app_aboutus")
    @Expose
    private String aboutus;

    @SerializedName("app_email")
    @Expose
    private String email;

    @SerializedName("app_contact")
    @Expose
    private String phone;

    @SerializedName("app_website")
    @Expose
    private String website;

    @SerializedName("stripe_active")
    @Expose
    private String stripeactive;

    @SerializedName("paypal_key")
    @Expose
    private String paypalkey;

    @SerializedName("paypal_mode")
    @Expose
    private String paypalmode;

    @SerializedName("paypal_active")
    @Expose
    private String paypalactive;

    @SerializedName("vehicle_category")
    @Expose
    private List<VehicleModel> vehicle_category = new ArrayList<>();

    @SerializedName("fitur")
    @Expose
    private List<FiturModel> fitur = new ArrayList<>();

    @SerializedName("allfitur")
    @Expose
    private List<AllFiturModel> allfitur = new ArrayList<>();

    @SerializedName("ratinghome")
    @Expose
    private List<RatingModel> rating = new ArrayList<>();

    @SerializedName("beritahome")
    @Expose
    private List<BeritaModel> berita = new ArrayList<>();

    @SerializedName("horizontal")
    @Expose
    private List<PromoModel> slider = new ArrayList<>();

    @SerializedName("data")
    @Expose
    private List<User> data = new ArrayList<>();

    @SerializedName("merchantpromo")
    @Expose
    private List<MerchantModel> merchantpromo = new ArrayList<>();

    @SerializedName("merchantnearby")
    @Expose
    private List<MerchantNearModel> merchantnear = new ArrayList<>();

    @SerializedName("kategorymerchanthome")
    @Expose
    private List<CatMerchantModel> catmerchant = new ArrayList<>();

    @SerializedName("payu")
    @Expose
    private List<PayuModel> payu = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencytext() {
        return currency_text;
    }

    public void setCurrencytext(String currencytext) {
        this.currency_text = currencytext;
    }

    public List<FiturModel> getFitur() {
        return fitur;
    }

    public void setFitur(List<FiturModel> fitur) {
        this.fitur = fitur;
    }

    public List<PromoModel> getSlider() {
        return slider;
    }

    public void setSlider(List<PromoModel> slider) {
        this.slider = slider;
    }

    public String getAboutus() {
        return aboutus;
    }

    public void setAboutus(String aboutus) {
        this.aboutus = aboutus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<RatingModel> getRating() {
        return rating;
    }

    public void setRating(List<RatingModel> rating) {
        this.rating = rating;
    }

    public List<BeritaModel> getBerita() {
        return berita;
    }

    public void setBerita(List<BeritaModel> berita) {
        this.berita = berita;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public String getStripeactive() {
        return stripeactive;
    }

    public void setStripeactive(String stripeactive) {
        this.stripeactive = stripeactive;
    }

    public String getPaypalkey() {
        return paypalkey;
    }

    public void setPaypalkey(String paypalkey) {
        this.paypalkey = paypalkey;
    }

    public String getPaypalmode() {
        return paypalmode;
    }

    public void setPaypalmode(String paypalmode) {
        this.paypalmode = paypalmode;
    }

    public String getPaypalactive() {
        return paypalactive;
    }

    public void setPaypalactive(String paypalactive) {
        this.paypalactive = paypalactive;
    }

    public List<MerchantModel> getMerchantpromo() {
        return merchantpromo;
    }

    public void setMerchantpromo(List<MerchantModel> merchantpromo) {
        this.merchantpromo = merchantpromo;
    }

    public List<CatMerchantModel> getCatmerchant() {
        return catmerchant;
    }

    public void setCatmerchant(List<CatMerchantModel> catmerchant) {
        this.catmerchant = catmerchant;
    }

    public List<MerchantNearModel> getMerchantnear() {
        return merchantnear;
    }

    public void setMerchantnear(List<MerchantNearModel> merchantnear) {
        this.merchantnear = merchantnear;
    }

    public List<AllFiturModel> getAllfitur() {
        return allfitur;
    }

    public void setAllfitur(List<AllFiturModel> allfitur) {
        this.allfitur = allfitur;
    }

    public List<PayuModel> getPayu() {
        return payu;
    }

    public void setPayu(List<PayuModel> payu) {
        this.payu = payu;
    }

    public List<VehicleModel> getVehicle_category() {
        return vehicle_category;
    }

    public void setVehicle_category(List<VehicleModel> vehicle_category) {
        this.vehicle_category = vehicle_category;
    }
}
