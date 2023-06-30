package com.ourdevelops.ourjek.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.google.android.gms.maps.model.LatLng;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivitySendDetailBinding;
import com.ourdevelops.ourjek.json.CheckStatusTransaksiRequest;
import com.ourdevelops.ourjek.json.CheckStatusTransaksiResponse;
import com.ourdevelops.ourjek.json.PromoRequestJson;
import com.ourdevelops.ourjek.json.PromoResponseJson;
import com.ourdevelops.ourjek.json.SendRequestJson;
import com.ourdevelops.ourjek.json.SendResponseJson;
import com.ourdevelops.ourjek.json.fcm.DriverRequest;
import com.ourdevelops.ourjek.json.fcm.DriverResponse;
import com.ourdevelops.ourjek.json.fcm.FCMMessage;
import com.ourdevelops.ourjek.models.DriverModel;
import com.ourdevelops.ourjek.models.FiturModel;
import com.ourdevelops.ourjek.models.TransaksiSendModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.Utility;
import com.ourdevelops.ourjek.utils.api.FCMHelper;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.BookService;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.ourdevelops.ourjek.activity.SendActivity.FITUR_KEY;
import static com.ourdevelops.ourjek.json.fcm.FCMType.LOGISTIC;
import static com.ourdevelops.ourjek.json.fcm.FCMType.ORDER;

/**
 * Created by Pagodalabs
 */

public class SendDetailActivity extends AppCompatActivity {

    private ActivitySendDetailBinding binding;

    String itemdetail, fitur;
    String country_iso_code = "en";
    Context context = SendDetailActivity.this;

    private double distance;
    private LatLng pickUpLatLang;
    private LatLng destinationLatLang;
    private String pickup, icon, layanan, layanandesk;
    private String destination;
    private String biayaakhir;
    private ArrayList<DriverModel> driverAvailable;
    private FiturModel fiturModel;
    Realm realm;
    private String saldoWallet;
    private String checkedpaywallet;
    private long harga,promocode;
    TransaksiSendModel transaksi;
    private DriverRequest request;
    Thread thread;
    boolean threadRun = true;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySendDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        promocode = 0;
        realm = Realm.getDefaultInstance();
        User userLogin = BaseApp.getInstance(this).getLoginUser();
        saldoWallet = String.valueOf(userLogin.getSaldo());
        Intent intent = getIntent();
        distance = intent.getDoubleExtra("distance", 0);
        String price = intent.getStringExtra("price");
        pickUpLatLang = intent.getParcelableExtra("pickup_latlng");
        destinationLatLang = intent.getParcelableExtra("destination_latlng");
        pickup = intent.getStringExtra("pickup");
        icon = intent.getStringExtra("icon");
        layanan = intent.getStringExtra("layanan");
        layanandesk = intent.getStringExtra("layanandesk");
        destination = intent.getStringExtra("destination");
        String biayaminimum = intent.getStringExtra("biaya_minimum");
        String timeDistance = intent.getStringExtra("time_distance");
        driverAvailable = (ArrayList<DriverModel>) intent.getSerializableExtra("driver");
        int selectedFitur = intent.getIntExtra(FITUR_KEY, -1);

        if (selectedFitur != -1)
            fiturModel = realm.where(FiturModel.class).equalTo("idFitur", selectedFitur).findFirst();
        assert fiturModel != null;
        fitur = String.valueOf(fiturModel.getIdFitur());

        biayaakhir = String.valueOf(fiturModel.getBiayaAkhir());
        binding.fitur.setText(timeDistance);
        float km = ((float) distance);
        String format = String.format(Locale.US, "%.1f", km);
        binding.distance.setText(format);
        Utility.currencyTXT(binding.cost, String.valueOf(price), this);
        Utility.currencyTXT(binding.diskon, String.valueOf(promocode), SendDetailActivity.this);
        binding.ketsaldo.setText("Discount " + fiturModel.getDiskon() + " with Wallet");

        checkedpaywallet = "0";
        Log.e("CHECKEDWALLET", checkedpaywallet);
        binding.checkedcash.setSelected(true);
        binding.checkedwallet.setSelected(false);
        binding.cashPayment.setTextColor(getResources().getColor(R.color.colorgradient));
        binding.walletpayment.setTextColor(getResources().getColor(R.color.gray));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            binding.checkedcash.setBackgroundTintList(getResources().getColorStateList(R.color.colorgradient));
            binding.checkedwallet.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
        }

        String biaya = String.valueOf(biayaminimum);
        long biayaTotal = (long) (Double.parseDouble(Objects.requireNonNull(price)) * km);
        if (biayaTotal < Double.parseDouble(Objects.requireNonNull(biayaminimum))) {
            this.harga = Long.parseLong(biayaminimum);
            biayaTotal = Long.parseLong(biayaminimum);
            Utility.currencyTXT(binding.cost, biaya, this);
        } else {
            Utility.currencyTXT(binding.cost, price, this);
        }
        this.harga = biayaTotal;

        final long finalBiayaTotal = biayaTotal;
        String totalbiaya = String.valueOf(finalBiayaTotal);
        Utility.currencyTXT(binding.price, totalbiaya, this);

        long saldokini = Long.parseLong(saldoWallet);
        if (saldokini < (biayaTotal - (harga * Double.parseDouble(biayaakhir)))) {
            binding.llcheckedcash.setOnClickListener(view -> {
                String totalbiaya12 = String.valueOf(finalBiayaTotal);
                Utility.currencyTXT(binding.price, totalbiaya12, context);
                Utility.currencyTXT(binding.diskon, String.valueOf(promocode), SendDetailActivity.this);
                binding.checkedcash.setSelected(true);
                binding.checkedwallet.setSelected(false);
                checkedpaywallet = "0";
                Log.e("CHECKEDWALLET", checkedpaywallet);
                binding.cashPayment.setTextColor(getResources().getColor(R.color.colorgradient));
                binding.walletpayment.setTextColor(getResources().getColor(R.color.gray));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    binding.checkedcash.setBackgroundTintList(getResources().getColorStateList(R.color.colorgradient));
                    binding.checkedwallet.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                }
            });
        } else {
            binding.llcheckedcash.setOnClickListener(view -> {
                String totalbiaya1 = String.valueOf(finalBiayaTotal);
                Utility.currencyTXT(binding.price, totalbiaya1, context);
                Utility.currencyTXT(binding.diskon, String.valueOf(promocode), SendDetailActivity.this);
                binding.checkedcash.setSelected(true);
                binding.checkedwallet.setSelected(false);
                checkedpaywallet = "0";
                Log.e("CHECKEDWALLET", checkedpaywallet);
                binding.cashPayment.setTextColor(getResources().getColor(R.color.colorgradient));
                binding.walletpayment.setTextColor(getResources().getColor(R.color.gray));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    binding.checkedcash.setBackgroundTintList(getResources().getColorStateList(R.color.colorgradient));
                    binding.checkedwallet.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                }
            });

            final long finalBiayaTotal1 = biayaTotal;
            binding.llcheckedwallet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    long diskonwallet = (long) (Double.parseDouble(biayaakhir) * harga);
                    String totalwallet = String.valueOf(diskonwallet + promocode);
                    Utility.currencyTXT(binding.diskon, totalwallet, context);
                    String totalbiaya = String.valueOf(finalBiayaTotal1 - (diskonwallet + promocode));
                    Utility.currencyTXT(binding.price, totalbiaya, context);
                    binding.checkedcash.setSelected(false);
                    binding.checkedwallet.setSelected(true);
                    checkedpaywallet = "1";
                    Log.e("CHECKEDWALLET", checkedpaywallet);
                    binding.walletpayment.setTextColor(getResources().getColor(R.color.colorgradient));
                    binding.cashPayment.setTextColor(getResources().getColor(R.color.gray));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        binding.checkedwallet.setBackgroundTintList(getResources().getColorStateList(R.color.colorgradient));
                        binding.checkedcash.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    }
                }
            });
        }

        binding.dokumen.setSelected(true);
        binding.fashion.setSelected(false);
        binding.box.setSelected(false);
        binding.other.setSelected(false);
        itemdetail = "document";
        binding.otherdetail.setVisibility(View.GONE);

        binding.dokumen.setOnClickListener(view -> {
            binding.dokumen.setSelected(true);
            binding.fashion.setSelected(false);
            binding.box.setSelected(false);
            binding.other.setSelected(false);
            itemdetail = "document";
            binding.otherdetail.setVisibility(View.GONE);
            binding.otherdetail.setText("");
        });

        binding.fashion.setOnClickListener(view -> {
            binding.dokumen.setSelected(false);
            binding.fashion.setSelected(true);
            binding.box.setSelected(false);
            binding.other.setSelected(false);
            itemdetail = "fashion";
            binding.otherdetail.setVisibility(View.GONE);
            binding.otherdetail.setText("");
        });

        binding.box.setOnClickListener(view -> {
            binding.dokumen.setSelected(false);
            binding.fashion.setSelected(false);
            binding.box.setSelected(true);
            binding.other.setSelected(false);
            itemdetail = "box";
            binding.otherdetail.setVisibility(View.GONE);
            binding.otherdetail.setText("");
        });

        binding.other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dokumen.setSelected(false);
                binding.fashion.setSelected(false);
                binding.box.setSelected(false);
                binding.other.setSelected(true);
                binding.otherdetail.setVisibility(View.VISIBLE);
            }
        });

//        countrycode.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("WrongConstant")
//            @Override
//            public void onClick(View v) {
//                final CountryPicker picker = CountryPicker.newInstance("Select Country");
//                picker.setListener(new CountryPickerListener() {
//                    @Override
//                    public void onSelectCountry(String name, String code, String dialCode, int flagDrawableResID) {
//                        countrycode.setText(dialCode);
//                        picker.dismiss();
//                        country_iso_code = code;
//                    }
//                });
//                picker.setStyle(R.style.countrypicker_style, R.style.countrypicker_style);
//                picker.show(getSupportFragmentManager(), "Select Country");
//            }
//        });

//        countrycodereceiver.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("WrongConstant")
//            @Override
//            public void onClick(View v) {
//                final CountryPicker picker = CountryPicker.newInstance("Select Country");
//                picker.setListener(new CountryPickerListener() {
//                    @Override
//                    public void onSelectCountry(String name, String code, String dialCode, int flagDrawableResID) {
//                        countrycodereceiver.setText(dialCode);
//                        picker.dismiss();
//                        country_iso_code = code;
//                    }
//                });
//                picker.setStyle(R.style.countrypicker_style, R.style.countrypicker_style);
//                picker.show(getSupportFragmentManager(), "Select Country");
//            }
//        });

        binding.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.sendername.getText().toString().isEmpty()) {
                    notif("Sender name cant be empty!");
                } else if (binding.phonenumber.getText().toString().isEmpty()) {
                    notif("Sender phone cant be empty!");
                } else if (binding.recievername.getText().toString().isEmpty()) {
                    notif("Receiver cant be empty!");
                } else if (binding.phonenumberreceiever.getText().toString().isEmpty()) {
                    notif("Receiver phone cant be empty!");
                } else {
                    onOrderButton();
                }
            }
        });

        binding.btnpromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try  {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    Objects.requireNonNull(imm).hideSoftInputFromWindow(Objects.requireNonNull(getCurrentFocus()).getWindowToken(), 0);
                } catch (Exception ignored) {

                }
                if (binding.promocode.getText().toString().isEmpty()){
                    notif("Promo code cant be empty!");
                } else {
                    promokodedata();
                }
            }
        });


    }

    @SuppressLint("SetTextI18n")
    private void promokodedata() {
        binding.btnpromo.setEnabled(false);
        binding.btnpromo.setText("Wait...");
        final User user = BaseApp.getInstance(this).getLoginUser();
        PromoRequestJson request = new PromoRequestJson();
        request.setFitur(fitur);
        request.setCode(binding.promocode.getText().toString());

        UserService service = ServiceGenerator.createService(UserService.class, user.getNoTelepon(), user.getPassword(),user.getToken());
        service.promocode(request).enqueue(new Callback<PromoResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<PromoResponseJson> call, @NonNull Response<PromoResponseJson> response) {
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {
                        binding.btnpromo.setEnabled(true);
                        binding.btnpromo.setText("Use");
                        if (response.body().getType().equals("persen")) {
                            promocode = (Long.parseLong(response.body().getNominal()) * harga)/100;
                        } else {
                            promocode = Long.parseLong(response.body().getNominal());
                        }
                        Log.e("", String.valueOf(promocode));
                        if (checkedpaywallet.equals("1")) {
                            long diskonwallet = (long) (Double.parseDouble(biayaakhir) * harga);
                            String diskontotal = String.valueOf(diskonwallet+promocode);
                            String totalbiaya = String.valueOf(harga-(diskonwallet+promocode));
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, SendDetailActivity.this);
                        } else {
                            String diskontotal = String.valueOf(promocode);
                            String totalbiaya = String.valueOf(harga-promocode);
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, SendDetailActivity.this);
                        }
                    } else {
                        binding.btnpromo.setEnabled(true);
                        binding.btnpromo.setText("Use");
                        notif("promo code not available!");
                        promocode = 0;
                        if (checkedpaywallet.equals("1")) {
                            long diskonwallet = (long) (Double.parseDouble(biayaakhir) * harga);
                            String diskontotal = String.valueOf(diskonwallet+promocode);
                            String totalbiaya = String.valueOf(harga-(diskonwallet+promocode));
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, SendDetailActivity.this);
                        } else {
                            String diskontotal = String.valueOf(promocode);
                            String totalbiaya = String.valueOf(harga-promocode);
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, SendDetailActivity.this);
                        }
                    }
                } else {
                    notif("error!");
                }
            }

            @Override
            public void onFailure(@NonNull Call<PromoResponseJson> call, @NonNull Throwable t) {
                t.printStackTrace();
                notif("error");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        User userLogin = BaseApp.getInstance(this).getLoginUser();
        saldoWallet = String.valueOf(userLogin.getSaldo());

        Utility.currencyTXT(binding.saldo, saldoWallet, this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }

    private void onOrderButton() {
        if (checkedpaywallet.equals("1")) {
            if (driverAvailable.isEmpty()) {
                notif("Sorry, there are no drivers around you.");
            } else {
                binding.rlprogress.setVisibility(View.VISIBLE);
                SendRequestJson param = new SendRequestJson();
                User userLogin = BaseApp.getInstance(this).getLoginUser();
                param.setIdPelanggan(userLogin.getId());
                param.setOrderFitur(String.valueOf(fiturModel.getIdFitur()));
                param.setStartLatitude(pickUpLatLang.latitude);
                param.setStartLongitude(pickUpLatLang.longitude);
                param.setEndLatitude(destinationLatLang.latitude);
                param.setEndLongitude(destinationLatLang.longitude);
                param.setJarak(distance);
                param.setHarga(this.harga);
                param.setEstimasi(binding.fitur.getText().toString());
                param.setKreditpromo(String.valueOf((Double.parseDouble(biayaakhir) * this.harga)+promocode));
                param.setAlamatAsal(pickup);
                param.setAlamatTujuan(destination);
                param.setPakaiWallet(1);
                param.setNamaPengirim(binding.sendername.getText().toString());
                param.setTeleponPengirim(binding.countrycode.getText().toString() + binding.phonenumber.getText().toString());
                param.setNamaPenerima(binding.recievername.getText().toString());
                param.setTeleponPenerima(binding.countrycodereceiver.getText().toString() + binding.phonenumberreceiever.getText().toString());
                if (!binding.otherdetail.getText().toString().isEmpty()) {
                    param.setNamaBarang(binding.otherdetail.getText().toString());
                } else {
                    param.setNamaBarang(itemdetail);
                }
                sendRequestTransaksi(param, driverAvailable);
            }
        } else {
            if (driverAvailable.isEmpty()) {
                notif("Sorry, there are no drivers around you.");
            } else {
                binding.rlprogress.setVisibility(View.VISIBLE);
                SendRequestJson param = new SendRequestJson();
                User userLogin = BaseApp.getInstance(this).getLoginUser();
                param.setIdPelanggan(userLogin.getId());
                param.setOrderFitur(String.valueOf(fiturModel.getIdFitur()));
                param.setStartLatitude(pickUpLatLang.latitude);
                param.setStartLongitude(pickUpLatLang.longitude);
                param.setEndLatitude(destinationLatLang.latitude);
                param.setEndLongitude(destinationLatLang.longitude);
                param.setJarak(distance);
                param.setHarga(this.harga);
                param.setEstimasi(binding.fitur.getText().toString());
                param.setKreditpromo(String.valueOf(promocode));
                param.setAlamatAsal(pickup);
                param.setAlamatTujuan(destination);
                param.setPakaiWallet(0);
                param.setNamaPengirim(binding.sendername.getText().toString());
                param.setTeleponPengirim(binding.countrycode.getText().toString() + binding.phonenumber.getText().toString());
                param.setNamaPenerima(binding.recievername.getText().toString());
                param.setTeleponPenerima(binding.countrycodereceiver.getText().toString() + binding.phonenumberreceiever.getText().toString());
                if (!binding.otherdetail.getText().toString().isEmpty()) {
                    param.setNamaBarang(binding.otherdetail.getText().toString());
                } else {
                    param.setNamaBarang(itemdetail);
                }

                sendRequestTransaksi(param, driverAvailable);
            }
        }
    }

    public void notif(String text) {
        binding.rlnotif.setVisibility(View.VISIBLE);
        binding.textnotif.setText(text);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                binding.rlnotif.setVisibility(View.GONE);
            }
        }, 3000);
    }

    private void sendRequestTransaksi(SendRequestJson param, final List<DriverModel> driverList) {
        binding.rlprogress.setVisibility(View.VISIBLE);
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        final BookService service = ServiceGenerator.createService(BookService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());

        service.requestTransaksisend(param).enqueue(new Callback<SendResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<SendResponseJson> call, @NonNull Response<SendResponseJson> response) {
                if (response.isSuccessful()) {
                    buildDriverRequest(Objects.requireNonNull(response.body()));
                    thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            ArrayList<String> reg_id = new ArrayList<>();

                            for (int i = 0; i < driverAvailable.size(); i++) {
                                reg_id.add(driverAvailable.get(i).getRegId());
                            }

                            fcmBroadcast(reg_id);

                            try {
                                Thread.sleep(30000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            if (threadRun) {
                                CheckStatusTransaksiRequest param = new CheckStatusTransaksiRequest();
                                param.setIdTransaksi(transaksi.getId());
                                service.checkStatusTransaksi(param).enqueue(new Callback<CheckStatusTransaksiResponse>() {
                                    @Override
                                    public void onResponse(@NonNull Call<CheckStatusTransaksiResponse> call, @NonNull Response<CheckStatusTransaksiResponse> response) {
                                        if (response.isSuccessful()) {
                                            CheckStatusTransaksiResponse checkStatus = response.body();
                                            if (!Objects.requireNonNull(checkStatus).isStatus()) {
                                                notif("Driver not found!");
                                                runOnUiThread(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        notif("Driver not found!");
                                                    }
                                                });

                                                binding.rlprogress.setVisibility(View.GONE);
                                            }
                                        }
                                    }

                                    @Override
                                    public void onFailure(@NonNull Call<CheckStatusTransaksiResponse> call, @NonNull Throwable t) {
                                        notif("Driver not found!");
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                notif("Driver not found!");
                                                binding.rlprogress.setVisibility(View.GONE);
                                            }
                                        });

                                        binding.rlprogress.setVisibility(View.GONE);

                                    }
                                });
                            }

                        }
                    });
                    thread.start();


                }
            }

            @Override
            public void onFailure(@NonNull Call<SendResponseJson> call, @NonNull Throwable t) {
                t.printStackTrace();
                notif("Your account has a problem, please contact customer service!");
                binding.rlprogress.setVisibility(View.GONE);
            }
        });
    }

    private void buildDriverRequest(SendResponseJson response) {
        transaksi = response.getData().get(0);
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        if (request == null) {
            request = new DriverRequest();
            request.setIdTransaksi(transaksi.getId());
            request.setIdPelanggan(transaksi.getIdPelanggan());
            request.setRegIdPelanggan(loginUser.getToken());
            request.setOrderFitur(fiturModel.getHome());
            request.setStartLatitude(transaksi.getStartLatitude());
            request.setStartLongitude(transaksi.getStartLongitude());
            request.setEndLatitude(transaksi.getEndLatitude());
            request.setEndLongitude(transaksi.getEndLongitude());
            request.setJarak(transaksi.getJarak());
            request.setHarga(transaksi.getHarga());
            request.setWaktuOrder(transaksi.getWaktuOrder());
            request.setAlamatAsal(transaksi.getAlamatAsal());
            request.setAlamatTujuan(transaksi.getAlamatTujuan());
            request.setKodePromo(transaksi.getKodePromo());
            request.setKreditPromo(transaksi.getKreditPromo());
            request.setPakaiWallet(String.valueOf(transaksi.isPakaiWallet()));
            request.setEstimasi(transaksi.getEstimasi());
            request.setLayanan(layanan);
            request.setLayanandesc(layanandesk);
            request.setIcon(icon);
            request.setBiaya(binding.cost.getText().toString());
            request.setDistance(binding.distance.getText().toString());

            String namaLengkap = String.format("%s", loginUser.getFullnama());
            request.setNamaPelanggan(namaLengkap);
            request.setTelepon(loginUser.getNoTelepon());
            request.setType(LOGISTIC);
        }
    }

    private void fcmBroadcast(ArrayList<String> reg_id) {
        request.setTime_accept(new Date().getTime() + "");
        final FCMMessage message = new FCMMessage();
        message.setTo(reg_id);
        message.setData(request);

        Log.e("REQUEST TO DRIVER", message.getData().toString());

        FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(new okhttp3.Callback() {
            @Override
            public void onResponse(@NonNull okhttp3.Call call, @NonNull okhttp3.Response response){
                Log.e("REQUEST TO DRIVER", message.getData().toString());
            }

            @Override
            public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {
                e.printStackTrace();
            }
        });
    }

    @SuppressWarnings("unused")
    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onMessageEvent(final DriverResponse response) {
        if (response.getResponse().equalsIgnoreCase(DriverResponse.ACCEPT) || response.getResponse().equals("3") || response.getResponse().equals("4")) {
            runOnUiThread(() -> {
                threadRun = false;
                for (DriverModel cDriver : driverAvailable) {
                    if (cDriver.getId().equals(response.getId())) {
                        Intent intent = new Intent(SendDetailActivity.this, ProgressActivity.class);
                        intent.putExtra("id_driver", cDriver.getId());
                        intent.putExtra("id_transaksi", request.getIdTransaksi());
                        intent.putExtra("response", "2");
                        startActivity(intent);
                        DriverResponse response1 = new DriverResponse();
                        response1.setId("");
                        response1.setIdTransaksi("");
                        response1.setResponse("");
                        EventBus.getDefault().postSticky(response1);
                        finish();
                    }
                }
            });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

}
