package com.ourdevelops.ourjek.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Pagodalabs
 */

public class User extends RealmObject implements Serializable {
    @PrimaryKey
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("fullnama")
    @Expose
    private String fullnama;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("no_telepon")
    @Expose
    private String noTelepon;
    @SerializedName("countrycode")
    @Expose
    private String countrycode;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("created_on")
    @Expose
    private String createdOn;
    @SerializedName("tgl_lahir")
    @Expose
    private String tglLahir;

    @SerializedName("full_nama_np")
    @Expose
    private String fullNamaNp;

    @SerializedName("no_telepon_np")
    @Expose
    private String noTeleponNp;


    @SerializedName("countrycode_np")
    @Expose
    private String countrycodeNp;
    @SerializedName("phone_np")
    @Expose
    private String phoneNp;
    @SerializedName("tgl_lahir_np")
    @Expose
    private String tglLahirNp;
    @SerializedName("rating_pelanggan")
    @Expose
    private String ratingPelanggan;
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("token")
    @Expose
    private String token;

    @SerializedName("fotopelanggan")
    @Expose
    private String fotopelanggan;
    @SerializedName("show_noti")
    @Expose
    private String showNoti;
    @SerializedName("call_status")
    @Expose
    private String callStatus;
    @SerializedName("call_note")
    @Expose
    private String callNote;
    @SerializedName("otp")
    @Expose
    private String otp;
    @SerializedName("apple_id")
    @Expose
    private String appleId;
    @SerializedName("saldo")
    @Expose
    private String saldo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullnama() {
        return fullnama;
    }

    public void setFullnama(String fullnama) {
        this.fullnama = fullnama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getFullNamaNp() {
        return fullNamaNp;
    }

    public void setFullNamaNp(String fullNamaNp) {
        this.fullNamaNp = fullNamaNp;
    }

    public String getNoTeleponNp() {
        return noTeleponNp;
    }

    public void setNoTeleponNp(String noTeleponNp) {
        this.noTeleponNp = noTeleponNp;
    }

    public String getCountrycodeNp() {
        return countrycodeNp;
    }

    public void setCountrycodeNp(String countrycodeNp) {
        this.countrycodeNp = (String) countrycodeNp;
    }

    public String getPhoneNp() {
        return phoneNp;
    }

    public void setPhoneNp(String phoneNp) {
        this.phoneNp = (String) phoneNp;
    }

    public String getTglLahirNp() {
        return tglLahirNp;
    }

    public void setTglLahirNp(String tglLahirNp) {
        this.tglLahirNp = (String) tglLahirNp;
    }

    public String getRatingPelanggan() {
        return ratingPelanggan;
    }

    public void setRatingPelanggan(String ratingPelanggan) {
        this.ratingPelanggan = ratingPelanggan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFotopelanggan() {
        return fotopelanggan;
    }

    public void setFotopelanggan(String fotopelanggan) {
        this.fotopelanggan = fotopelanggan;
    }

    public String getShowNoti() {
        return showNoti;
    }

    public void setShowNoti(String showNoti) {
        this.showNoti = showNoti;
    }

    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

    public String getCallNote() {
        return callNote;
    }

    public void setCallNote(String callNote) {
        this.callNote = callNote;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getAppleId() {
        return appleId;
    }

    public void setAppleId(String appleId) {
        this.appleId = appleId;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public long getSaldoAsLong() {
        try {
            return Long.parseLong(saldo);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0; // Return a default value or handle the exception accordingly
        }
    }



}




//    @PrimaryKey
//    @SerializedName("id")
//    @Expose
//    private String id;
//
//    @SerializedName("fullnama")
//    @Expose
//    private String fullnama;
//
//    @SerializedName("email")
//    @Expose
//    private String email;
//
//    @SerializedName("no_telepon")
//    @Expose
//    private String noTelepon;
//
//    @SerializedName("phone")
//    @Expose
//    private String phone;
//
//    @SerializedName("password")
//    @Expose
//    private String password;
//
////    @SerializedName("alamat")
////    @Expose
////    private String alamat;
//
//    @SerializedName("created_on")
//    @Expose
//    private String createdOn;
//
//    @SerializedName("tgl_lahir")
//    @Expose
//    private String tglLahir;
//
//    @SerializedName("rating")
//    @Expose
//    private String rating;
//
//    @SerializedName("status")
//    @Expose
//    private String status;
//
//    @SerializedName("token")
//    @Expose
//    private String token;
//
//    @SerializedName("fotopelanggan")
//    @Expose
//    private String fotopelanggan;
//
//    @SerializedName("countrycode")
//    @Expose
//    private String countrycode;
//
//    private long walletSaldo;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getFullnama() {
//        return fullnama;
//    }
//
//    public void setFullnama(String fullnama) {
//        this.fullnama = fullnama;
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
//    public String getNoTelepon() {
//        return noTelepon;
//    }
//
//    public void setNoTelepon(String noTelepon) {
//        this.noTelepon = noTelepon;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
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
////    public String getAlamat() {
////        return alamat;
////    }
////
////    public void setAlamat(String alamat) {
////        this.alamat = alamat;
////    }
//
//    public String getCreatedOn() {
//        return createdOn;
//    }
//
//    public void setCreatedOn(String createdOn) {
//        this.createdOn = createdOn;
//    }
//
//    public String getTglLahir() {
//        return tglLahir;
//    }
//
//    public void setTglLahir(String tglLahir) {
//        this.tglLahir = tglLahir;
//    }
//
//
//    public String getRating() {
//        return rating;
//    }
//
//    public void setRating(String rating) {
//        this.rating = rating;
//    }
//
//    public String getToken() {
//        return token;
//    }
//
//    public void setToken(String token) {
//        this.token = token;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public long getWalletSaldo() {
//        return walletSaldo;
//    }
//
//    public void setWalletSaldo(long walletSaldo) {
//        this.walletSaldo = walletSaldo;
//    }
//
//    public String getFotopelanggan() {
//        return fotopelanggan;
//    }
//
//    public void setFotopelanggan(String fotopelanggan) {
//        this.fotopelanggan = fotopelanggan;
//    }
//
//    public String getCountrycode() {
//        return countrycode;
//    }
//
//    public void setCountrycode(String countrycode) {
//        this.countrycode = countrycode;
//    }
//}
