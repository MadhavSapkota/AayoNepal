package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ourdevelops.ourjek.models.BankModel;
import com.ourdevelops.ourjek.models.TransaksiSendModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs
 */

public class BankResponseJson {

    @Expose
    @SerializedName("message")
    private String message;

    @Expose
    @SerializedName("data")
    private List<BankModel> data = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<BankModel> getData() {
        return data;
    }

    public void setData(List<BankModel> data) {
        this.data = data;
    }
}
