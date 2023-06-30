package com.ourdevelops.ourjek.json.fcm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Pagodalabs
 */

public class DriverResponse implements Serializable{

    public static final String ACCEPT = "2";
    public static final String REJECT = "0";

    @Expose
    @SerializedName("id")
    private String id;

    @Expose
    @SerializedName("id_transaksi")
    private String idTransaksi;

    @Expose
    @SerializedName("response")
    private String response;

    @Expose
    @SerializedName("type")
    public int type;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
