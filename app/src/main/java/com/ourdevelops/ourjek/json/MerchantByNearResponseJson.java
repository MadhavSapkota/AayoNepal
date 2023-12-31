package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ourdevelops.ourjek.models.MerchantModel;
import com.ourdevelops.ourjek.models.MerchantNearModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs on 10/13/2019.
 */

public class MerchantByNearResponseJson {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("merchantbykategori")
    @Expose
    private List<MerchantNearModel> data = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<MerchantNearModel> getData() {
        return data;
    }

    public void setData(List<MerchantNearModel> data) {
        this.data = data;
    }
}
