package com.ourdevelops.ourjek.utils;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck;
import com.ourdevelops.ourjek.fragment.restaurant_menu.RestaurantMenuFragment;
import com.ourdevelops.ourjek.models.CatItemModel;

import java.util.List;

public class RestaurantMenuAdapter extends FragmentPagerAdapter {
    private final String id;
    Context context;
    int totalTabs;
    List<CatItemModel> mKategori;
    RestaurantMenuFragment fragment = null;
    String lat, lng, merchant_id, item_id, id_fitur;
    private MenuFragCartIconCheck menuFragCartIconCheck;

    public RestaurantMenuAdapter(Context c, FragmentManager fm, int totalTabs, List<CatItemModel> kategori, String latitude, String longitude, String rid, String mid, MenuFragCartIconCheck menufrag, String item_id, String fiturkey) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
        mKategori = kategori;
        lat = latitude;
        lng = longitude;
        id = rid;
        this.menuFragCartIconCheck = menufrag;
        merchant_id = mid;
        this.item_id = item_id;
        id_fitur = fiturkey;
    }

    @Override
    public Fragment getItem(int position) {
        for (int i = 0; i < totalTabs ; i++) {
            if (i == position) {
                fragment = RestaurantMenuFragment.newInstance();
                Bundle bundle = new Bundle();
                bundle.putString("cat_id", String.valueOf(mKategori.get(i).getId_kategori_item()));
                bundle.putString("res_id", id);
                bundle.putString("lat", lat);
                bundle.putString("lng", lng);
                bundle.putString("merchant_id", merchant_id);
                bundle.putString("item_id", item_id);
                bundle.putString("id_fitur", id_fitur);
                fragment.setInterface(menuFragCartIconCheck);
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

