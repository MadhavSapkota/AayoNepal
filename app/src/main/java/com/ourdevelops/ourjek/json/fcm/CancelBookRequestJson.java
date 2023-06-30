package com.ourdevelops.ourjek.json.fcm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Pagodalabs
 */

public class CancelBookRequestJson {
    @Expose
    @SerializedName("id")
    public String id;

    @Expose
    @SerializedName("id_transaksi")
    public String id_transaksi;

    @Expose
    @SerializedName("id_driver")
    public String id_driver;

    @Expose
    @SerializedName("reason")
    public String reason;



}
