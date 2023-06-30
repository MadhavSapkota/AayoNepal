package com.ourdevelops.ourjek.utils.api.service;

import com.ourdevelops.ourjek.json.CheckStatusTransaksiRequest;
import com.ourdevelops.ourjek.json.CheckStatusTransaksiResponse;
import com.ourdevelops.ourjek.json.DetailRequestJson;
import com.ourdevelops.ourjek.json.DetailTransResponseJson;
import com.ourdevelops.ourjek.json.GetNearRideCarRequestJson;
import com.ourdevelops.ourjek.json.GetNearRideCarResponseJson;
import com.ourdevelops.ourjek.json.ItemRequestJson;
import com.ourdevelops.ourjek.json.LokasiDriverRequest;
import com.ourdevelops.ourjek.json.LokasiDriverResponse;
import com.ourdevelops.ourjek.json.OrderResponseJson;
import com.ourdevelops.ourjek.json.ResponseJson;
import com.ourdevelops.ourjek.json.RideCarRequestJson;
import com.ourdevelops.ourjek.json.RideCarResponseJson;
import com.ourdevelops.ourjek.json.SendRequestJson;
import com.ourdevelops.ourjek.json.SendResponseJson;
import com.ourdevelops.ourjek.json.TransactionUpdatePaymentStatusJson;
import com.ourdevelops.ourjek.json.fcm.CancelBookRequestJson;
import com.ourdevelops.ourjek.json.fcm.CancelBookResponseJson;
import com.ourdevelops.ourjek.json.ride_request.NewRideCarRequestJson;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Pagodalabs
 */

public interface BookService {

    @POST("user/list_new_ride")
    Call<GetNearRideCarResponseJson> getNearRide(@Body GetNearRideCarRequestJson param);

    @POST("user/list_new_car")
    Call<GetNearRideCarResponseJson> getNearCar(@Body GetNearRideCarRequestJson param);

    @POST("user/request_transaksi")
    Call<RideCarResponseJson> requestTransaksi(@Body RideCarRequestJson param);

    @POST("user/request_transaksi")
    Call<RideCarResponseJson> requestRide(@Body NewRideCarRequestJson param);

    @POST("user/inserttransaksimerchant")
    Call<RideCarResponseJson> requestTransaksiMerchant(@Body ItemRequestJson param);

    @POST("user/request_transaksi_send")
    Call<SendResponseJson> requestTransaksisend(@Body SendRequestJson param);

    @POST("user/check_status_transaksi")
    Call<CheckStatusTransaksiResponse> checkStatusTransaksi(@Body CheckStatusTransaksiRequest param);

    @POST("user/noride_notification")
    Call<ResponseJson> noridefound(@Body CheckStatusTransaksiRequest param);

    @POST("user/user_cancel")
    Call<CancelBookResponseJson> cancelOrder(@Body CancelBookRequestJson param);

    @POST("user/liat_lokasi_driver")
    Call<LokasiDriverResponse> liatLokasiDriver(@Body LokasiDriverRequest param);

    @POST("user/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);

    @POST("merchant/saveMerchantOrder")
    Call<OrderResponseJson> sendorder (@Body ItemRequestJson param);

    @POST("user/update_transaction")
    Call<OrderResponseJson> updateTransactionPaymentStatus (@Body TransactionUpdatePaymentStatusJson param);
}
