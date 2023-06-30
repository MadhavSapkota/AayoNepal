package com.ourdevelops.ourjek.models;

import java.io.Serializable;

import static com.ourdevelops.ourjek.json.fcm.FCMType.CHAT;

/**
 * Created by Pagodalabs
 */
public class Chat implements Serializable{
    public int type = CHAT;
    public String senderid;
    public String receiverid;
    public String name;
    public String pic;
    public String tokendriver;
    public String tokenuser;
    public String message;
    public String isdriver;
}
