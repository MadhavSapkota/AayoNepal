package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ourdevelops.ourjek.models.BeritaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs on 10/17/2019.
 */

public class BeritaDetailResponseJson {

    @Expose
    @SerializedName("data")
    private List<BeritaModel> data = new ArrayList<>();

    public List<BeritaModel> getData() {
        return data;
    }

    public void setData(List<BeritaModel> data) {
        this.data = data;
    }
}
