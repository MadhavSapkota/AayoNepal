package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderDetailRequestJson {

    @SerializedName("alamat_asal")
    @Expose
    private String alamat_asal;

    @SerializedName("alamat_tujuan")
    @Expose
    private String alamat_tujuan;

    @SerializedName("catatan")
    @Expose
    private String catatan;
    @SerializedName("start_latitude")
    @Expose
    private String start_latitude;

    @SerializedName("start_longitude")
    @Expose
    private String start_longitude;

    @SerializedName("total_biaya_belanja")
    @Expose
    private String total_biaya_belanja;

    @SerializedName("pesanan")
    @Expose
    private String pesanan;

    @SerializedName("id_resto")
    @Expose
    private String id_resto;

    @SerializedName("id_pelanggan")
    @Expose
    private String id_pelanggan;

    @SerializedName("pakai_wallet")
    @Expose
    private String pakai_wallet;

    @SerializedName("kredit_promo")
    @Expose
    private String kredit_promo;

    @SerializedName("estimasi")
    @Expose
    private String estimasi;

    @SerializedName("end_latitude")
    @Expose
    private String end_latitude;

    @SerializedName("end_longitude")
    @Expose
    private String end_longitude;

    @SerializedName("order_fitur")
    @Expose
    private String order_fitur;

    @SerializedName("jarak")
    @Expose
    private String jarak;

    public String getAlamat_asal() {
        return alamat_asal;
    }

    public void setAlamat_asal(String alamat_asal) {
        this.alamat_asal = alamat_asal;
    }

    public String getAlamat_tujuan() {
        return alamat_tujuan;
    }

    public void setAlamat_tujuan(String alamat_tujuan) {
        this.alamat_tujuan = alamat_tujuan;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getStart_latitude() {
        return start_latitude;
    }

    public void setStart_latitude(String start_latitude) {
        this.start_latitude = start_latitude;
    }

    public String getStart_longitude() {
        return start_longitude;
    }

    public void setStart_longitude(String start_longitude) {
        this.start_longitude = start_longitude;
    }

    public String getTotal_biaya_belanja() {
        return total_biaya_belanja;
    }

    public void setTotal_biaya_belanja(String total_biaya_belanja) {
        this.total_biaya_belanja = total_biaya_belanja;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public String getId_resto() {
        return id_resto;
    }

    public void setId_resto(String id_resto) {
        this.id_resto = id_resto;
    }

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getPakai_wallet() {
        return pakai_wallet;
    }

    public void setPakai_wallet(String pakai_wallet) {
        this.pakai_wallet = pakai_wallet;
    }

    public String getKredit_promo() {
        return kredit_promo;
    }

    public void setKredit_promo(String kredit_promo) {
        this.kredit_promo = kredit_promo;
    }

    public String getEstimasi() {
        return estimasi;
    }

    public void setEstimasi(String estimasi) {
        this.estimasi = estimasi;
    }

    public String getEnd_latitude() {
        return end_latitude;
    }

    public void setEnd_latitude(String end_latitude) {
        this.end_latitude = end_latitude;
    }

    public String getEnd_longitude() {
        return end_longitude;
    }

    public void setEnd_longitude(String end_longitude) {
        this.end_longitude = end_longitude;
    }

    public String getOrder_fitur() {
        return order_fitur;
    }

    public void setOrder_fitur(String order_fitur) {
        this.order_fitur = order_fitur;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }
}
