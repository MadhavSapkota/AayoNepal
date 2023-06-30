package com.ourdevelops.ourjek.models;

import java.io.Serializable;

import static com.ourdevelops.ourjek.json.fcm.FCMType.OTHER;

/**
 * Created by Pagodalabs
 */
public class Notif implements Serializable{
    public int type = OTHER;
    public String title;
    public String message;
}
