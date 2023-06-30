package com.ourdevelops.ourjek.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.ourdevelops.ourjek.models.DiskonWalletModel;
import com.ourdevelops.ourjek.models.FiturModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pagodalabs on 10/17/2019.
 */

public class GetFiturResponseJson {

    @Expose
    @SerializedName("data")
    private List<FiturModel> data = new ArrayList<>();

    @Expose
    @SerializedName("diskon_wallet")
    private DiskonWalletModel diskonWallet;

    @Expose
    @SerializedName("currency")
    private String currencyModel;


    public List<FiturModel> getData() {
        return data;
    }

    public void setData(List<FiturModel> data) {
        this.data = data;
    }

    public DiskonWalletModel getDiskonWallet() {
        return diskonWallet;
    }

    public void setDiskonWallet(DiskonWalletModel diskonWallet) {
        this.diskonWallet = diskonWallet;
    }

    public String getCurrencyModel() {
        return currencyModel;
    }

    public void setCurrencyModel(String currencyModel) {
        this.currencyModel = currencyModel;
    }

}
