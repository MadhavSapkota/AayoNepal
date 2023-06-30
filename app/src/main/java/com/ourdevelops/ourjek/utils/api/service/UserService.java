package com.ourdevelops.ourjek.utils.api.service;

import com.ourdevelops.ourjek.activity.save_address.SaveUserAddressBody;
import com.ourdevelops.ourjek.json.AllMerchantByNearResponseJson;
import com.ourdevelops.ourjek.json.AllMerchantbyCatRequestJson;
import com.ourdevelops.ourjek.json.AllTransResponseJson;
import com.ourdevelops.ourjek.json.BankResponseJson;
import com.ourdevelops.ourjek.json.BeritaDetailRequestJson;
import com.ourdevelops.ourjek.json.BeritaDetailResponseJson;
import com.ourdevelops.ourjek.json.ChangePassRequestJson;
import com.ourdevelops.ourjek.json.DetailRequestJson;
import com.ourdevelops.ourjek.json.EditprofileRequestJson;
import com.ourdevelops.ourjek.json.GetAllMerchantbyCatRequestJson;
import com.ourdevelops.ourjek.json.GetFiturResponseJson;
import com.ourdevelops.ourjek.json.GetHomeRequestJson;
import com.ourdevelops.ourjek.json.GetHomeResponseJson;
import com.ourdevelops.ourjek.json.GetMerchantbyCatRequestJson;
import com.ourdevelops.ourjek.json.LoginRequestJson;
import com.ourdevelops.ourjek.json.LoginResponseJson;
import com.ourdevelops.ourjek.json.MerchantByCatResponseJson;
import com.ourdevelops.ourjek.json.MerchantByIdResponseJson;
import com.ourdevelops.ourjek.json.MerchantByNearResponseJson;
import com.ourdevelops.ourjek.json.MerchantbyIdRequestJson;
import com.ourdevelops.ourjek.json.NewDynamicHomeJson;
import com.ourdevelops.ourjek.json.NewNotificatoinJson;
import com.ourdevelops.ourjek.json.PrivacyRequestJson;
import com.ourdevelops.ourjek.json.PrivacyResponseJson;
import com.ourdevelops.ourjek.json.PromoRequestJson;
import com.ourdevelops.ourjek.json.PromoResponseJson;
import com.ourdevelops.ourjek.json.RateRequestJson;
import com.ourdevelops.ourjek.json.RateResponseJson;
import com.ourdevelops.ourjek.json.ReferenceIdRequest;
import com.ourdevelops.ourjek.json.ReferenceIdResponse;
import com.ourdevelops.ourjek.json.RegisterRequestJson;
import com.ourdevelops.ourjek.json.RegisterResponseJson;
import com.ourdevelops.ourjek.json.ResponseJson;
import com.ourdevelops.ourjek.json.SavedAddressResponse;
import com.ourdevelops.ourjek.json.SearchMerchantbyCatRequestJson;
import com.ourdevelops.ourjek.json.TopupRequestJson;
import com.ourdevelops.ourjek.json.TopupResponseJson;
import com.ourdevelops.ourjek.json.WalletRequestJson;
import com.ourdevelops.ourjek.json.WalletResponseJson;
import com.ourdevelops.ourjek.json.WithdrawRequestJson;
import com.ourdevelops.ourjek.json.cart.AddtoCartRequest;
import com.ourdevelops.ourjek.json.cart.CustomerRequestParams;
import com.ourdevelops.ourjek.json.cart.DeleteCartParams;
import com.ourdevelops.ourjek.json.cart.DeleteMultipleItem;
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse;
import com.ourdevelops.ourjek.json.fcm.FCMMessage;
import com.ourdevelops.ourjek.json.fcm.FCMRequestJson;
import com.ourdevelops.ourjek.json.fcm.FCMResponseJson;
import com.ourdevelops.ourjek.json.ride_request.RideSyncResponse;
import com.ourdevelops.ourjek.models.ResendToken;
import com.ourdevelops.ourjek.models.home.HomeResponse;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Pagodalabs
 */

public interface UserService {

    @GET("user/getNotifications")
    Call<NewNotificatoinJson> getNotification();

    @GET("user/getCurrentLayout")
    Call<NewDynamicHomeJson> getNewHome();


    @POST("user/destroyToken_FCM")
    Call<FCMResponseJson> destroyFCM(@Body FCMRequestJson param);

    @POST("user/sendNotifToDriver_fcm")
    Call<FCMResponseJson> sendFcmNotif(@Body FCMMessage param);

    @POST("pelanggan/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

//    @POST("user/login")
//    Call<LoginResponseJson> login(@Body LoginRequestJson param);




    @POST("user/kodepromo")
    Call<PromoResponseJson> promocode(@Body PromoRequestJson param);

    @POST("user/list_promo")
    Call<PromoResponseJson> listpromocode(@Body PromoRequestJson param);

    @POST("user/list_bank")
    Call<BankResponseJson> listbank(@Body WithdrawRequestJson param);

    @POST("user/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("user/forgot_changePassword")
    Call<LoginResponseJson> forgotChangePassword(@Body ChangePassRequestJson param);

    @POST("user/check_email")
    Call<LoginResponseJson> check_email(@Body LoginRequestJson loginRequestJson);

    @POST("user/register_user")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson registerRequestJson);

    @POST("user/detail_new_active_fitur")
    Call<GetFiturResponseJson> getFitur(@Body BeritaDetailRequestJson beritaDetailRequestJson);

    @POST("user/forgot_password")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("user/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("user/home_new")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("user/home_new")
    Call<HomeResponse> getNewHome(@Body GetHomeRequestJson param);

    @POST("user/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("user/withdraw")
    Call<ResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("user/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("user/rate_driver")
    Call<RateResponseJson> rateDriver(@Body RateRequestJson param);

    @POST("user/edit_profile")
    Call<RegisterResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("user/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("user/history_new_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("user/detail_new_berita")
    Call<BeritaDetailResponseJson> beritadetail(@Body BeritaDetailRequestJson param);

    @POST("user/all_new_berita")
    Call<BeritaDetailResponseJson> allberita(@Body BeritaDetailRequestJson param);

    @POST("user/merchantByCategoryPromo")
    Call<MerchantByCatResponseJson> getmerchanbycat(@Body GetMerchantbyCatRequestJson param);

    @POST("user/getMerchantByCategory")
    Call<MerchantByNearResponseJson> getmerchanbynear(@Body GetMerchantbyCatRequestJson param);

    @POST("user/allMerchantByCategory")
    Call<AllMerchantByNearResponseJson> getallmerchanbynear(@Body GetAllMerchantbyCatRequestJson param);

    @POST("user/getItemByCategory")
    Call<MerchantByIdResponseJson> getitembycat(@Body GetAllMerchantbyCatRequestJson param);

    @POST("user/searchMerchant")
    Call<AllMerchantByNearResponseJson> searchmerchant(@Body SearchMerchantbyCatRequestJson param);

    @POST("user/getAllMerchant")
    Call<AllMerchantByNearResponseJson> allmerchant(@Body AllMerchantbyCatRequestJson param);

    @POST("user/getMerchantById")
    Call<MerchantByIdResponseJson> merchantbyid(@Body MerchantbyIdRequestJson param);

    @POST("user/add_to_cart")
    Call<ResponseJson>addtocart(@Body AddtoCartRequest request);

    @POST("user/delete_cart")
    Call<ResponseJson>deleteAllCarts(@Body DeleteMultipleItem body);

    @POST("user/get_cart")
    Call<CartResponse> getCart(@Body CustomerRequestParams params);

    @POST("user/delete_cart")
    Call<ResponseJson> deletecartitem(@Body  DeleteCartParams param);

    @POST("user/resend_login_token")
    Call<LoginResponseJson> resenttokenresponse(@Body ResendToken resendToken);

    @POST("user/save_address")
    Call<ResponseJson> saveUserAddress(@Body SaveUserAddressBody body);

    @GET("user/getAllAddress")
    Call<SavedAddressResponse> getAllSavedAddress();

    @GET("user/sync_transaction")
    Call<RideSyncResponse> getActiveRide();

    @POST("user/process_payment")
    Call<ReferenceIdResponse> getReferenceId(@Body ReferenceIdRequest param);

}
