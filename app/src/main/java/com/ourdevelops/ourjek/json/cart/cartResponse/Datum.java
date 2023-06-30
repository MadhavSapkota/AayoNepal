
package com.ourdevelops.ourjek.json.cart.cartResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Datum implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("merchant_id")
    @Expose
    private String merchantId;
    @SerializedName("item_price")
    @Expose
    private String itemPrice;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("id_merchant")
    @Expose
    private String idMerchant;
    @SerializedName("id_fitur")
    @Expose
    private String idFitur;
    @SerializedName("nama_merchant")
    @Expose
    private String namaMerchant;
    @SerializedName("alamat_merchant")
    @Expose
    private String alamatMerchant;
    @SerializedName("latitude_merchant")
    @Expose
    private String latitudeMerchant;
    @SerializedName("longitude_merchant")
    @Expose
    private String longitudeMerchant;
    @SerializedName("jam_buka")
    @Expose
    private String jamBuka;
    @SerializedName("jam_tutup")
    @Expose
    private String jamTutup;
    @SerializedName("category_merchant")
    @Expose
    private String categoryMerchant;
    @SerializedName("foto_merchant")
    @Expose
    private String fotoMerchant;
    @SerializedName("telepon_merchant")
    @Expose
    private String teleponMerchant;
    @SerializedName("deskripsi_merchant")
    @Expose
    private String deskripsiMerchant;
    @SerializedName("phone_merchant")
    @Expose
    private String phoneMerchant;
    @SerializedName("country_code_merchant")
    @Expose
    private String countryCodeMerchant;
    @SerializedName("nama_merchant_np")
    @Expose
    private String namaMerchantNp;
    @SerializedName("alamat_merchant_np")
    @Expose
    private String alamatMerchantNp;
    @SerializedName("telepon_merchant_np")
    @Expose
    private String teleponMerchantNp;
    @SerializedName("deskripsi_merchant_np")
    @Expose
    private Object deskripsiMerchantNp;
    @SerializedName("phone_merchant_np")
    @Expose
    private String phoneMerchantNp;
    @SerializedName("country_code_merchant_np")
    @Expose
    private String countryCodeMerchantNp;
    @SerializedName("jam_buka_np")
    @Expose
    private String jamBukaNp;
    @SerializedName("jam_tutup_np")
    @Expose
    private String jamTutupNp;
    @SerializedName("status_merchant")
    @Expose
    private String statusMerchant;
    @SerializedName("open_merchant")
    @Expose
    private String openMerchant;
    @SerializedName("token_merchant")
    @Expose
    private String tokenMerchant;
    @SerializedName("chito_mitho_id")
    @Expose
    private String chitoMithoId;
    @SerializedName("service_charge")
    @Expose
    private Long serviceCharge;
    @SerializedName("commission")
    @Expose
    private Long commission;
    @SerializedName("vat")
    @Expose
    private Long vat;
    @SerializedName("id_item")
    @Expose
    private String idItem;
    @SerializedName("nama_item")
    @Expose
    private String namaItem;
    @SerializedName("harga_item")
    @Expose
    private String hargaItem;
    @SerializedName("harga_promo")
    @Expose
    private String hargaPromo;
    @SerializedName("kategori_item")
    @Expose
    private String kategoriItem;
    @SerializedName("deskripsi_item")
    @Expose
    private String deskripsiItem;
    @SerializedName("foto_item")
    @Expose
    private String fotoItem;
    @SerializedName("created_item")
    @Expose
    private String createdItem;
    @SerializedName("status_item")
    @Expose
    private String statusItem;
    @SerializedName("status_promo")
    @Expose
    private String statusPromo;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("type")
    @Expose
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getIdMerchant() {
        return idMerchant;
    }

    public void setIdMerchant(String idMerchant) {
        this.idMerchant = idMerchant;
    }

    public String getIdFitur() {
        return idFitur;
    }

    public void setIdFitur(String idFitur) {
        this.idFitur = idFitur;
    }

    public String getNamaMerchant() {
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getAlamatMerchant() {
        return alamatMerchant;
    }

    public void setAlamatMerchant(String alamatMerchant) {
        this.alamatMerchant = alamatMerchant;
    }

    public String getLatitudeMerchant() {
        return latitudeMerchant;
    }

    public void setLatitudeMerchant(String latitudeMerchant) {
        this.latitudeMerchant = latitudeMerchant;
    }

    public String getLongitudeMerchant() {
        return longitudeMerchant;
    }

    public void setLongitudeMerchant(String longitudeMerchant) {
        this.longitudeMerchant = longitudeMerchant;
    }

    public String getJamBuka() {
        return jamBuka;
    }

    public void setJamBuka(String jamBuka) {
        this.jamBuka = jamBuka;
    }

    public String getJamTutup() {
        return jamTutup;
    }

    public void setJamTutup(String jamTutup) {
        this.jamTutup = jamTutup;
    }

    public String getCategoryMerchant() {
        return categoryMerchant;
    }

    public void setCategoryMerchant(String categoryMerchant) {
        this.categoryMerchant = categoryMerchant;
    }

    public String getFotoMerchant() {
        return fotoMerchant;
    }

    public void setFotoMerchant(String fotoMerchant) {
        this.fotoMerchant = fotoMerchant;
    }

    public String getTeleponMerchant() {
        return teleponMerchant;
    }

    public void setTeleponMerchant(String teleponMerchant) {
        this.teleponMerchant = teleponMerchant;
    }

    public String getDeskripsiMerchant() {
        return deskripsiMerchant;
    }

    public void setDeskripsiMerchant(String deskripsiMerchant) {
        this.deskripsiMerchant = deskripsiMerchant;
    }

    public String getPhoneMerchant() {
        return phoneMerchant;
    }

    public void setPhoneMerchant(String phoneMerchant) {
        this.phoneMerchant = phoneMerchant;
    }

    public String getCountryCodeMerchant() {
        return countryCodeMerchant;
    }

    public void setCountryCodeMerchant(String countryCodeMerchant) {
        this.countryCodeMerchant = countryCodeMerchant;
    }

    public String getNamaMerchantNp() {
        return namaMerchantNp;
    }

    public void setNamaMerchantNp(String namaMerchantNp) {
        this.namaMerchantNp = namaMerchantNp;
    }

    public String getAlamatMerchantNp() {
        return alamatMerchantNp;
    }

    public void setAlamatMerchantNp(String alamatMerchantNp) {
        this.alamatMerchantNp = alamatMerchantNp;
    }

    public String getTeleponMerchantNp() {
        return teleponMerchantNp;
    }

    public void setTeleponMerchantNp(String teleponMerchantNp) {
        this.teleponMerchantNp = teleponMerchantNp;
    }

    public Object getDeskripsiMerchantNp() {
        return deskripsiMerchantNp;
    }

    public void setDeskripsiMerchantNp(Object deskripsiMerchantNp) {
        this.deskripsiMerchantNp = deskripsiMerchantNp;
    }

    public String getPhoneMerchantNp() {
        return phoneMerchantNp;
    }

    public void setPhoneMerchantNp(String phoneMerchantNp) {
        this.phoneMerchantNp = phoneMerchantNp;
    }

    public String getCountryCodeMerchantNp() {
        return countryCodeMerchantNp;
    }

    public void setCountryCodeMerchantNp(String countryCodeMerchantNp) {
        this.countryCodeMerchantNp = countryCodeMerchantNp;
    }

    public String getJamBukaNp() {
        return jamBukaNp;
    }

    public void setJamBukaNp(String jamBukaNp) {
        this.jamBukaNp = jamBukaNp;
    }

    public String getJamTutupNp() {
        return jamTutupNp;
    }

    public void setJamTutupNp(String jamTutupNp) {
        this.jamTutupNp = jamTutupNp;
    }

    public String getStatusMerchant() {
        return statusMerchant;
    }

    public void setStatusMerchant(String statusMerchant) {
        this.statusMerchant = statusMerchant;
    }

    public String getOpenMerchant() {
        return openMerchant;
    }

    public void setOpenMerchant(String openMerchant) {
        this.openMerchant = openMerchant;
    }

    public String getTokenMerchant() {
        return tokenMerchant;
    }

    public void setTokenMerchant(String tokenMerchant) {
        this.tokenMerchant = tokenMerchant;
    }

    public String getChitoMithoId() {
        return chitoMithoId;
    }

    public void setChitoMithoId(String chitoMithoId) {
        this.chitoMithoId = chitoMithoId;
    }

    public Long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Long getCommission() {
        return commission;
    }

    public void setCommission(Long commission) {
        this.commission = commission;
    }

    public Long getVat() {
        return vat;
    }

    public void setVat(Long vat) {
        this.vat = vat;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getHargaItem() {
        return hargaItem;
    }

    public void setHargaItem(String hargaItem) {
        this.hargaItem = hargaItem;
    }

    public String getHargaPromo() {
        return hargaPromo;
    }

    public void setHargaPromo(String hargaPromo) {
        this.hargaPromo = hargaPromo;
    }

    public String getKategoriItem() {
        return kategoriItem;
    }

    public void setKategoriItem(String kategoriItem) {
        this.kategoriItem = kategoriItem;
    }

    public String getDeskripsiItem() {
        return deskripsiItem;
    }

    public void setDeskripsiItem(String deskripsiItem) {
        this.deskripsiItem = deskripsiItem;
    }

    public String getFotoItem() {
        return fotoItem;
    }

    public void setFotoItem(String fotoItem) {
        this.fotoItem = fotoItem;
    }

    public String getCreatedItem() {
        return createdItem;
    }

    public void setCreatedItem(String createdItem) {
        this.createdItem = createdItem;
    }

    public String getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(String statusItem) {
        this.statusItem = statusItem;
    }

    public String getStatusPromo() {
        return statusPromo;
    }

    public void setStatusPromo(String statusPromo) {
        this.statusPromo = statusPromo;
    }

}