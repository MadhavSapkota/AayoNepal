package com.ourdevelops.ourjek.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ranjan on 12/13/2017.
 */

public class PrefsManager {
    private SharedPreferences prefs;

    public PrefsManager(Context context) {
        prefs = context.getSharedPreferences("PREFS_language", Context.MODE_PRIVATE);
    }

    public void setLanguageValue(String manufactureData) {
        prefs.edit().putString("KEY_DATA", manufactureData)
                .apply();
    }

    public String getLanguageValue() {
        return prefs.getString("KEY_DATA", "en");
    }


    public void setPlace(String manufactureData) {
        prefs.edit().putString("KEY_PLACE", manufactureData)
                .apply();
    }

    public String getplace() {
        return prefs.getString("KEY_PLACE", "");
    }

    public void setLatitude(String manufactureData) {
        prefs.edit().putString("KEY_LATITUDE", manufactureData)
                .apply();
    }

    public String getLatitude() {
        return prefs.getString("KEY_LATITUDE", "");
    }

    public void setLongitude(String manufactureData) {
        prefs.edit().putString("KEY_LONGITUDE", manufactureData)
                .apply();
    }

    public String getLongitude() {
        return prefs.getString("KEY_LONGITUDE", "");
    }

    public void setPlace2(String manufactureData) {
        prefs.edit().putString("KEY_PLACE2", manufactureData)
                .apply();
    }

    public String getplace2() {
        return prefs.getString("KEY_PLACE2", "");
    }

    public void setLatitude2(String manufactureData) {
        prefs.edit().putString("KEY_LATITUDE2", manufactureData)
                .apply();
    }

    public String getLatitude2() {
        return prefs.getString("KEY_LATITUDE2", "");
    }

    public void setLongitude2(String manufactureData) {
        prefs.edit().putString("KEY_LONGITUDE2", manufactureData)
                .apply();
    }

    public String getLongitude2() {
        return prefs.getString("KEY_LONGITUDE2", "");
    }


    public void setFCMTOKEN(String Fcmtoken) {
        prefs.edit().putString("KEY_FCMTOKEN", Fcmtoken)
                .apply();
    }

    public String getFCMTOKEN() {
        return prefs.getString("KEY_FCMTOKEN", "");
    }

    public void setShouldGetAllNotifications(boolean value) {
        prefs.edit().putBoolean("KEY_ALL_NOTIFICATIONS", value)
                .apply();
    }

    public boolean shouldGetAllNotifications() {
        return prefs.getBoolean("KEY_ALL_NOTIFICATIONS", false);
    }


    public void setShouldGetPushNotification(boolean value) {
        prefs.edit().putBoolean("KEY_PUSH_NOTIFICATIONS", value)
                .apply();
    }

    public boolean shouldGetPushNotification() {
        return prefs.getBoolean("KEY_PUSH_NOTIFICATIONS", false);
    }

    public void setShouldGetPromotionAndOffers(boolean value) {
        prefs.edit().putBoolean("KEY_PROMOTION_OFFERS", value)
                .apply();
    }

    public boolean shouldGetPromotionAndOffers() {
        return prefs.getBoolean("KEY_PROMOTION_OFFERS", false);
    }

}
