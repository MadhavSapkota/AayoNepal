package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ourdevelops.ourjek.models.MerchantModel;
import com.ourdevelops.ourjek.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs
 */

public class MerchantByCatResponseJson {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("merchantbykategori")
    @Expose
    private List<MerchantModel> data = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<MerchantModel> getData() {
        return data;
    }

    public void setData(List<MerchantModel> data) {
        this.data = data;
    }
}
