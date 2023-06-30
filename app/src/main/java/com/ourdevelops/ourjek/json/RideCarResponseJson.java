package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ourdevelops.ourjek.models.DriverModel;
import com.ourdevelops.ourjek.models.TransaksiModel;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs
 */

public class RideCarResponseJson {

    @Expose
    @SerializedName("message")
    private String message;

    @Expose
    @SerializedName("data")
    private List<TransaksiModel> data = new ArrayList<>();

    @Expose
    @SerializedName("driver")
    private ArrayList<DriverModel> driver = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<TransaksiModel> getData() {
        return data;
    }

    public void setData(List<TransaksiModel> data) {
        this.data = data;
    }

    public ArrayList<DriverModel> getDriver() {
        return driver;
    }

    public void setDriver(ArrayList<DriverModel> driver) {
        this.driver = driver;
    }
}
