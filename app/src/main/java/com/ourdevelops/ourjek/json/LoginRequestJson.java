package com.ourdevelops.ourjek.json;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Pagodalabs
 */

public class LoginRequestJson {

    @SerializedName("no_telepon")
    @Expose
    private String noTelepon;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("token")
    @Expose
    private String token;

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}


//public class LoginRequestJson {
//
//    @SerializedName("no_telepon")
//    @Expose
//    private String notelepon;
//
//    @SerializedName("email")
//    @Expose
//    private String email;
//
//    @Expose
//    private String password;
//
//    @SerializedName("token")
//    @Expose
//    private String regId;
//
//    public String getNotelepon() {
//        return notelepon;
//    }
//
//    public void setNotelepon(String notelepon) {
//        this.notelepon = notelepon;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRegId() {
//        return regId;
//    }
//
//    public void setRegId(String regId) {
//        this.regId = regId;
//    }
//}
