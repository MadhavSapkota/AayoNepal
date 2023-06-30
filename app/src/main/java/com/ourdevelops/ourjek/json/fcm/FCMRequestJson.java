package com.ourdevelops.ourjek.json.fcm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FCMRequestJson {

    @SerializedName("customer_id")
    @Expose
    private String customer_id;

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}