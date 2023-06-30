package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ourdevelops.ourjek.models.CatMerchantModel;
import com.ourdevelops.ourjek.models.ItemModel;
import com.ourdevelops.ourjek.models.MerchantNearModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs on 10/13/2019.
 */

public class AllItemByCatResponseJson {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("allmerchantnearby")
    @Expose
    private List<ItemModel> data = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ItemModel> getData() {
        return data;
    }

    public void setData(List<ItemModel> data) {
        this.data = data;
    }
}
