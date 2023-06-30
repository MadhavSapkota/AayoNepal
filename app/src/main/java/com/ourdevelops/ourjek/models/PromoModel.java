package com.ourdevelops.ourjek.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromoModel {
    @Expose
    @SerializedName("foto")
    private String foto;

    @Expose
    @SerializedName("fitur_promosi")
    private int fitur_promosi;

    @Expose
    @SerializedName("link_promosi")
    private String link_promosi;

    @Expose
    @SerializedName("type_promosi")
    private String type_promosi;

    @Expose
    @SerializedName("id_merchant")
    private String id_merchant;

    @Expose
    @SerializedName("id_fitur")
    private String id_fitur;
    @Expose
    @SerializedName("latitude_merchant")
    private String latitude_merchant;
    @Expose
    @SerializedName("longitude_merchant")
    private String longitude_merchant;

    @Expose
    @SerializedName("icon")
    private String icon;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getFiturpromosi() {
        return fitur_promosi;
    }

    public void setFiturpromosi(int fitur_promosi) {
        this.fitur_promosi = fitur_promosi;
    }

    public String getLinkpromosi() {
        return link_promosi;
    }

    public void setLink_promosi(String link_promosi) {
        this.link_promosi = link_promosi;
    }

    public String getTypepromosi() {
        return type_promosi;
    }

    public void setTypepromosi(String type_promosi) {
        this.type_promosi = type_promosi;
    }

    public int getFitur_promosi() {
        return fitur_promosi;
    }

    public void setFitur_promosi(int fitur_promosi) {
        this.fitur_promosi = fitur_promosi;
    }

    public String getLink_promosi() {
        return link_promosi;
    }

    public String getType_promosi() {
        return type_promosi;
    }

    public void setType_promosi(String type_promosi) {
        this.type_promosi = type_promosi;
    }

    public String getId_merchant() {
        return id_merchant;
    }

    public void setId_merchant(String id_merchant) {
        this.id_merchant = id_merchant;
    }

    public String getId_fitur() {
        return id_fitur;
    }

    public void setId_fitur(String id_fitur) {
        this.id_fitur = id_fitur;
    }

    public String getLatitude_merchant() {
        return latitude_merchant;
    }

    public void setLatitude_merchant(String latitude_merchant) {
        this.latitude_merchant = latitude_merchant;
    }

    public String getLongitude_merchant() {
        return longitude_merchant;
    }

    public void setLongitude_merchant(String longitude_merchant) {
        this.longitude_merchant = longitude_merchant;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
