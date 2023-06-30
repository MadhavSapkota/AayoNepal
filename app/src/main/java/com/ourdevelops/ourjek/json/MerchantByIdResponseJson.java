package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ourdevelops.ourjek.models.CatItemModel;
import com.ourdevelops.ourjek.models.CatMerchantModel;
import com.ourdevelops.ourjek.models.ItemModel;
import com.ourdevelops.ourjek.models.MerchantNearModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs on 10/13/2019.
 */

public class MerchantByIdResponseJson {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("idmerchant")
    @Expose
    private String idmerchant;

    @SerializedName("namamerchant")
    @Expose
    private String namamerchant;

    @SerializedName("alamatmerchant")
    @Expose
    private String alamatmerchant;

    @SerializedName("latmerchant")
    @Expose
    private String latmerchant;

    @SerializedName("longmerchant")
    @Expose
    private String longmerchant;

    @SerializedName("bukamerchant")
    @Expose
    private String bukamerchant;

    @SerializedName("tutupmerchant")
    @Expose
    private String tutupmerchant;

    @SerializedName("descmerchant")
    @Expose
    private String descmerchant;

    @SerializedName("fotomerchant")
    @Expose
    private String fotomerchant;

    @SerializedName("telpmerchant")
    @Expose
    private String telpmerchant;

    @SerializedName("kategori")
    @Expose
    private String kategorimerchant;

    @SerializedName("partner")
    @Expose
    private String partner;

    @SerializedName("promo")
    @Expose
    private String promo;

    @SerializedName("maks_distance")
    @Expose
    private String distance;

    @SerializedName("idfitur")
    @Expose
    private String idfitur;

    @SerializedName("itembyid")
    @Expose
    private List<ItemModel> item = new ArrayList<>();

    @SerializedName("kategoriitem")
    @Expose
    private List<CatItemModel> kategori = new ArrayList<>();


    @Expose
    @SerializedName("sun_open")
    private String sun_open;
    @Expose
    @SerializedName("sun_close")
    private String sun_close;
    @Expose
    @SerializedName("mon_open")
    private String mon_open;

    @Expose
    @SerializedName("serviceCharge")
    private String serviceCharge;
    @Expose
    @SerializedName("vat")
    private String vat;

    public String getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public List<ItemModel> getItem() {
        return item;
    }

    public void setItem(List<ItemModel> item) {
        this.item = item;
    }

    public String getSun_open() {
        return sun_open;
    }

    public void setSun_open(String sun_open) {
        this.sun_open = sun_open;
    }

    public String getSun_close() {
        return sun_close;
    }

    public void setSun_close(String sun_close) {
        this.sun_close = sun_close;
    }

    public String getMon_open() {
        return mon_open;
    }

    public void setMon_open(String mon_open) {
        this.mon_open = mon_open;
    }

    public String getMon_close() {
        return mon_close;
    }

    public void setMon_close(String mon_close) {
        this.mon_close = mon_close;
    }

    public String getTue_open() {
        return tue_open;
    }

    public void setTue_open(String tue_open) {
        this.tue_open = tue_open;
    }

    public String getTue_close() {
        return tue_close;
    }

    public void setTue_close(String tue_close) {
        this.tue_close = tue_close;
    }

    public String getWed_open() {
        return wed_open;
    }

    public void setWed_open(String wed_open) {
        this.wed_open = wed_open;
    }

    public String getWed_close() {
        return wed_close;
    }

    public void setWed_close(String wed_close) {
        this.wed_close = wed_close;
    }

    public String getThu_open() {
        return thu_open;
    }

    public void setThu_open(String thu_open) {
        this.thu_open = thu_open;
    }

    public String getThu_close() {
        return thu_close;
    }

    public void setThu_close(String thu_close) {
        this.thu_close = thu_close;
    }

    public String getFri_open() {
        return fri_open;
    }

    public void setFri_open(String fri_open) {
        this.fri_open = fri_open;
    }

    public String getFri_close() {
        return fri_close;
    }

    public void setFri_close(String fri_close) {
        this.fri_close = fri_close;
    }

    public String getSat_open() {
        return sat_open;
    }

    public void setSat_open(String sat_open) {
        this.sat_open = sat_open;
    }

    public String getSat_close() {
        return sat_close;
    }

    public void setSat_close(String sat_close) {
        this.sat_close = sat_close;
    }

    @Expose
    @SerializedName("mon_close")
    private String mon_close;
    @Expose
    @SerializedName("tue_open")
    private String tue_open;
    @Expose
    @SerializedName("tue_close")
    private String tue_close;
    @Expose
    @SerializedName("wed_open")
    private String wed_open;
    @Expose
    @SerializedName("wed_close")
    private String wed_close;
    @Expose
    @SerializedName("thu_open")
    private String thu_open;
    @Expose
    @SerializedName("thu_close")
    private String thu_close;
    @Expose
    @SerializedName("fri_open")
    private String fri_open;
    @Expose
    @SerializedName("fri_close")
    private String fri_close;
    @Expose
    @SerializedName("sat_open")
    private String sat_open;
    @Expose
    @SerializedName("sat_close")
    private String sat_close;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ItemModel> getData() {
        return item;
    }

    public void setData(List<ItemModel> item) {
        this.item = item;
    }

    public List<CatItemModel> getKategori() {
        return kategori;
    }

    public void setKategori(List<CatItemModel> kategori) {
        this.kategori = kategori;
    }

    public String getIdmerchant() {
        return idmerchant;
    }

    public void setIdmerchant(String idmerchant) {
        this.idmerchant = idmerchant;
    }

    public String getNamamerchant() {
        return namamerchant;
    }

    public void setNamamerchant(String namamerchant) {
        this.namamerchant = namamerchant;
    }

    public String getAlamatmerchant() {
        return alamatmerchant;
    }

    public void setAlamatmerchant(String alamatmerchant) {
        this.alamatmerchant = alamatmerchant;
    }

    public String getLatmerchant() {
        return latmerchant;
    }

    public void setLatmerchant(String latmerchant) {
        this.latmerchant = latmerchant;
    }

    public String getLongmerchant() {
        return longmerchant;
    }

    public void setLongmerchant(String longmerchant) {
        this.longmerchant = longmerchant;
    }

    public String getBukamerchant() {
        return bukamerchant;
    }

    public void setBukamerchant(String bukamerchant) {
        this.bukamerchant = bukamerchant;
    }

    public String getTutupmerchant() {
        return tutupmerchant;
    }

    public void setTutupmerchant(String tutupmerchant) {
        this.tutupmerchant = tutupmerchant;
    }

    public String getDescmerchant() {
        return descmerchant;
    }

    public void setDescmerchant(String descmerchant) {
        this.descmerchant = descmerchant;
    }

    public String getFotomerchant() {
        return fotomerchant;
    }

    public void setFotomerchant(String fotomerchant) {
        this.fotomerchant = fotomerchant;
    }

    public String getTelpmerchant() {
        return telpmerchant;
    }

    public void setTelpmerchant(String telpmerchant) {
        this.telpmerchant = telpmerchant;
    }

    public String getKategorimerchant() {
        return kategorimerchant;
    }

    public void setKategorimerchant(String kategorimerchant) {
        this.kategorimerchant = kategorimerchant;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getIdfitur() {
        return idfitur;
    }

    public void setIdfitur(String idfitur) {
        this.idfitur = idfitur;
    }
}
