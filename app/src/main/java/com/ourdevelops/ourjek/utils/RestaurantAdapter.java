package com.ourdevelops.ourjek.utils;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.ourdevelops.ourjek.fragment.RestaurantFragment;
import com.ourdevelops.ourjek.models.CatMerchantModel;

import java.util.List;

public class RestaurantAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    Fragment fragment = null;
    List<CatMerchantModel> mKategori;
    double lat, lng;

    public RestaurantAdapter(Context c, FragmentManager fm, int totalTabs, List<CatMerchantModel> kategori, double latitude, double longitude) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
        mKategori = kategori;
        lat = latitude;
        lng = longitude;
    }

    @Override
    public Fragment getItem(int position) {
        for (int i = 0; i < totalTabs ; i++) {
            if (i == position) {
                fragment = RestaurantFragment.newInstance();
                Bundle bundle = new Bundle();
                bundle.putString("id", String.valueOf(mKategori.get(i).getId_kategori_merchant()));
                bundle.putDouble("lat", lat);
                bundle.putDouble("lng", lng);
                fragment.setArguments(bundle);
                break;
            }
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}

