package com.ourdevelops.ourjek.json.fcm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs
 */

public class FCMMessage {

    @Expose
    @SerializedName("registration_ids")
    private ArrayList<String> to;

    @Expose
    @SerializedName("data")
    private Object data;

    public ArrayList<String> getTo() {
        return to;
    }

    public void setTo(ArrayList<String> to) {
        this.to = to;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
