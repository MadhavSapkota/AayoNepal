package com.ourdevelops.ourjek.constants;

import com.ourdevelops.ourjek.BuildConfig;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Pagodalabs
 */

public class Constants {

    private static final String BASE_URL = BuildConfig.BASE_URL; //demo

//    public static final String FCM_KEY = "AAAAhB4-94Q:APA91bHCzO1SBcaAwMJlrecpyhqR5FLJqWd6iaiGvWGP_aELFNUVnXGxFPVQvykiefDbDr87tTtUwXVZ1Md_06JByIBdxd6KWS6kghGGqewBxV5FP5dFIQ73nFhNJVaAomb1Y1mDeNde";
    public static final String FCM_KEY = "AAAAv0bInKE:APA91bEEqR6nJrLX4VcRuyyYfRU_oVhusmBaqagVtyqdBbC3B_CGqoDTgvRyuZ_3mSRXPI4HbpLZYGWevmqpDay4K4KvX5uBs-sXhABgRnS6pknEZRpu89xC28TZspVSBBYcE3_Ed-4H";
    public static final String CONNECTION = BASE_URL;
//    public static final String CONNECTION = BASE_URL + "api/";

    public static final String IMAGESFITUR = BASE_URL + "images/fitur/";
    public static final String IMAGESVEHCILECAT = BASE_URL + "images/vehicle_category/";
    public static final String IMAGESMERCHANT = BASE_URL + "images/merchant/";
    public static final String IMAGESBANK = BASE_URL + "images/bank/";
    public static final String IMAGESITEM = BASE_URL + "images/itemmerchant/";
    public static final String IMAGESBERITA = BASE_URL + "images/berita/";
    public static final String IMAGESSLIDER = BASE_URL + "images/promo/";
    public static final String IMAGESDRIVER = BASE_URL + "images/fotodriver/";
    public static final String IMAGESUSER = BASE_URL + "images/pelanggan/";
    public static String CURRENCY = "";
    public static final int REJECT = 0;
    public static final int PENDING = 6;
    public static final int VERIFIED = 7;
    public static final int ACCEPT = 2;
    public static final int CANCEL = 5;
    public static final int START = 3;
    public static final int FINISH = 4;
    public static Double LATITUDE = 27.6698721;
    public static Double LONGITUDE = 85.3192131;
    public static String LOCATION = "";
    public static String TOKEN = "token";
    public static String USERID = "uid";
    public static String PREF_NAME = "pref_name";
    public static int permission_camera_code = 786;
    public static int permission_write_data = 788;
    public static int permission_Read_data = 789;
    public static int permission_Recording_audio = 790;
    public static SimpleDateFormat df =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
    public static String versionname = "1.3";


    public static String CURRENTLOACTION = "currentlocation";
}
