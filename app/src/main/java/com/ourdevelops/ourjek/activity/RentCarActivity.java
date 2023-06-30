package com.ourdevelops.ourjek.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityRentBinding;
import com.ourdevelops.ourjek.json.CheckStatusTransaksiRequest;
import com.ourdevelops.ourjek.json.CheckStatusTransaksiResponse;
import com.ourdevelops.ourjek.json.GetNearRideCarRequestJson;
import com.ourdevelops.ourjek.json.GetNearRideCarResponseJson;
import com.ourdevelops.ourjek.json.PromoRequestJson;
import com.ourdevelops.ourjek.json.PromoResponseJson;
import com.ourdevelops.ourjek.json.RideCarRequestJson;
import com.ourdevelops.ourjek.json.RideCarResponseJson;
import com.ourdevelops.ourjek.json.fcm.DriverRequest;
import com.ourdevelops.ourjek.json.fcm.DriverResponse;
import com.ourdevelops.ourjek.json.fcm.FCMMessage;
import com.ourdevelops.ourjek.models.DriverModel;
import com.ourdevelops.ourjek.models.FiturModel;
import com.ourdevelops.ourjek.models.TransaksiModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;
import com.ourdevelops.ourjek.utils.Utility;
import com.ourdevelops.ourjek.utils.api.FCMHelper;
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.BookService;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import io.realm.Realm;
import io.realm.RealmResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.ourdevelops.ourjek.json.fcm.FCMType.ORDER;

/**
 * Created by Pagodalabs
 */

public class RentCarActivity extends AppCompatActivity
        implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private ActivityRentBinding binding;

    public static final String FITUR_KEY = "FiturKey";
    String ICONFITUR;
    private static final String TAG = "RentCarActivity";
    private static final int REQUEST_PERMISSION_LOCATION = 991;
    TransaksiModel transaksi;
    Thread thread;
    boolean threadRun = true;
    private DriverRequest request;
    Context context = RentCarActivity.this;
    private GoogleMap gMap;
    private GoogleApiClient googleApiClient;
    private Location lastKnownLocation;
    private LatLng pickUpLatLang;
    private Marker pickUpMarker;
    private List<DriverModel> driverAvailable;
    private List<Marker> driverMarkers;
    private Realm realm;
    private FiturModel designedFitur;
    private double jarak;
    private long harga, promocode;
    private String saldoWallet;
    private String checkedpaywallet;
    private boolean isMapReady = false;
    String fitur, getbiaya, biayaminimum, biayaakhir, icondrver;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        BottomSheetBehavior behavior = BottomSheetBehavior.from(binding.bottomSheet);
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        promocode = 0;
        updateFitur();
        Places.initialize(getApplicationContext(), getString(R.string.google_maps_key));

        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), getString(R.string.google_maps_key));
        }

        binding.pickUpContainer.setVisibility(View.VISIBLE);

        User userLogin = BaseApp.getInstance(this).getLoginUser();
        saldoWallet = String.valueOf(userLogin.getSaldo());

        binding.pickUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onPickUp();
            }
        });

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        binding.topUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TopupSaldoActivity.class));
            }
        });

        binding.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.pickUpText.getText().toString().isEmpty()) {
                    notif("Location cant be empty!");
                } else {
                    onOrderButton();
                }
            }
        });

        binding.pickUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.pickUpContainer.setVisibility(View.VISIBLE);
                openAutocompleteActivity();
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapView);
        Objects.requireNonNull(mapFragment).getMapAsync(this);

        driverAvailable = new ArrayList<>();
        driverMarkers = new ArrayList<>();

        if (googleApiClient == null) {
            googleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }

        realm = Realm.getDefaultInstance();

        Intent intent = getIntent();
        int fiturId = intent.getIntExtra(FITUR_KEY, -1);
        ICONFITUR = intent.getStringExtra("icon");
        Log.e("FITUR_ID", fiturId + "");
        if (fiturId != -1)
            designedFitur = realm.where(FiturModel.class).equalTo("idFitur", fiturId).findFirst();

        RealmResults<FiturModel> fiturs = realm.where(FiturModel.class).findAll();

        for (FiturModel fitur : fiturs) {
            Log.e("ID_FITUR", fitur.getIdFitur() + " " + fitur.getFitur() + " " + fitur.getBiayaAkhir() + " " + ICONFITUR);
        }
        fitur = String.valueOf(designedFitur.getIdFitur());
        getbiaya = String.valueOf(designedFitur.getBiaya());
        biayaminimum = String.valueOf(designedFitur.getBiaya_minimum());
        biayaakhir = String.valueOf(designedFitur.getBiayaAkhir());
        icondrver = designedFitur.getIcon_driver();
        binding.layanan.setText(designedFitur.getFitur());
        binding.layanandes.setText(designedFitur.getKeterangan());
        binding.enamjam.setSelected(true);
        binding.duabelasjam.setSelected(false);
        binding.satuhari.setSelected(false);
        updateDistance(6);

        binding.enamjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.enamjam.setSelected(true);
                binding.duabelasjam.setSelected(false);
                binding.satuhari.setSelected(false);
                updateDistance(6);
            }
        });

        binding.duabelasjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.enamjam.setSelected(false);
                binding.duabelasjam.setSelected(true);
                binding.satuhari.setSelected(false);
                updateDistance(12);
            }
        });

        binding.satuhari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.enamjam.setSelected(false);
                binding.duabelasjam.setSelected(false);
                binding.satuhari.setSelected(true);
                updateDistance(24);
            }
        });

        binding.ketsaldo.setText("Discount " + designedFitur.getDiskon() + " with Wallet");
        PicassoTrustAll.getInstance(this)
                .load(Constants.IMAGESFITUR + ICONFITUR)
                .placeholder(R.drawable.logo)
                .resize(100, 100)
                .into(binding.image);


        binding.btnpromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    Objects.requireNonNull(imm).hideSoftInputFromWindow(Objects.requireNonNull(getCurrentFocus()).getWindowToken(), 0);
                } catch (Exception ignored) {

                }
                if (binding.promocode.getText().toString().isEmpty()) {
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
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(@NonNull Call<PromoResponseJson> call, @NonNull Response<PromoResponseJson> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    if (response.body().getMessage().equalsIgnoreCase("success")) {
                        binding.btnpromo.setEnabled(true);
                        binding.btnpromo.setText("Use");
                        if (response.body().getType().equals("persen")) {
                            promocode = (Long.parseLong(response.body().getNominal()) * harga) / 100;
                        } else {
                            promocode = Long.parseLong(response.body().getNominal());
                        }
                        Log.e("", String.valueOf(promocode));
                        if (checkedpaywallet.equals("1")) {
                            long diskonwallet = (long) (Double.parseDouble(biayaakhir) * harga);
                            String diskontotal = String.valueOf(diskonwallet + promocode);
                            String totalbiaya = String.valueOf(harga - (diskonwallet + promocode));
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, RentCarActivity.this);
                        } else {
                            String diskontotal = String.valueOf(promocode);
                            String totalbiaya = String.valueOf(harga - promocode);
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, RentCarActivity.this);
                        }
                    } else {
                        binding.btnpromo.setEnabled(true);
                        binding.btnpromo.setText("Use");
                        notif("promo code not available!");
                        promocode = 0;
                        if (checkedpaywallet.equals("1")) {
                            long diskonwallet = (long) (Double.parseDouble(biayaakhir) * harga);
                            String diskontotal = String.valueOf(diskonwallet + promocode);
                            String totalbiaya = String.valueOf(harga - (diskonwallet + promocode));
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, RentCarActivity.this);
                        } else {
                            String diskontotal = String.valueOf(promocode);
                            String totalbiaya = String.valueOf(harga - promocode);
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, RentCarActivity.this);
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

    @SuppressLint("SetTextI18n")
    private void updateDistance(long jam) {
        BottomSheetBehavior behavior = BottomSheetBehavior.from(binding.bottomSheet);
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        binding.detail.setVisibility(View.VISIBLE);
        binding.order.setVisibility(View.VISIBLE);
        binding.fitur.setText(jam + " hr");
        Utility.currencyTXT(binding.diskon, String.valueOf(promocode), RentCarActivity.this);
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
        long biayaTotal = (long) (Double.parseDouble(getbiaya) * jam);
        if (biayaTotal < Double.parseDouble(biayaminimum)) {
            this.harga = Long.parseLong(biayaminimum);
            biayaTotal = Long.parseLong(biayaminimum);
            Utility.currencyTXT(binding.cost, biaya, this);
        } else {
            Utility.currencyTXT(binding.cost, getbiaya, this);
        }
        this.harga = biayaTotal;

        final long finalBiayaTotal = biayaTotal;
        String totalbiaya = String.valueOf(finalBiayaTotal - promocode);
        Utility.currencyTXT(binding.price, totalbiaya, this);

        long saldokini = Long.parseLong(saldoWallet);
        if (saldokini < (biayaTotal - (harga * Double.parseDouble(biayaakhir)))) {
            binding.llcheckedcash.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String totalbiaya = String.valueOf(finalBiayaTotal - promocode);
                    Utility.currencyTXT(binding.price, totalbiaya, getBaseContext());
                    Utility.currencyTXT(binding.diskon, String.valueOf(promocode), RentCarActivity.this);
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
                }
            });
        } else {
            binding.llcheckedcash.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String totalbiaya = String.valueOf(finalBiayaTotal - promocode);
                    Utility.currencyTXT(binding.price, totalbiaya, context);
                    Utility.currencyTXT(binding.diskon, String.valueOf(promocode), RentCarActivity.this);
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

    private void openAutocompleteActivity() {
        List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.ADDRESS, Place.Field.LAT_LNG);
        Intent intent = new Autocomplete.IntentBuilder(
                AutocompleteActivityMode.FULLSCREEN, fields)
                .build(this);
        startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                Place place = Autocomplete.getPlaceFromIntent(data);
                binding.pickUpText.setText(place.getAddress());
                LatLng latLng = place.getLatLng();
                if (latLng != null) {
                    gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                            new LatLng(latLng.latitude, latLng.longitude), 15f)
                    );
                    onPickUp();
                }
            } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                Status status = Autocomplete.getStatusFromIntent(data);
                Log.i(TAG, Objects.requireNonNull(status.getStatusMessage()));
            }
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERMISSION_LOCATION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                updateLastLocation(true);
            }
        }
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        updateLastLocation(true);
    }

    @Override
    public void onConnectionSuspended(int i) {
        updateLastLocation(true);
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        updateLastLocation(true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;
        gMap.getUiSettings().setMyLocationButtonEnabled(true);
        gMap.getUiSettings().setMapToolbarEnabled(true);
        try {
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.style_json));

            if (!success) {
                Log.e(TAG, "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Can't find style. Error: ", e);
        }

        isMapReady = true;

        updateLastLocation(true);
    }

    private void updateLastLocation(boolean move) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_PERMISSION_LOCATION);
            return;
        }
        lastKnownLocation = LocationServices.FusedLocationApi.getLastLocation(
                googleApiClient);
        gMap.setMyLocationEnabled(true);

        if (lastKnownLocation != null) {
            if (move) {
                gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude()), 15f)
                );

                gMap.animateCamera(CameraUpdateFactory.zoomTo(15f));
            }

            fetchNearDriver(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
        }
    }

    private void updateFitur() {
        if (driverAvailable != null) {
            driverAvailable.clear();
        }
        if (driverMarkers != null) {
            for (Marker m : driverMarkers) {
                m.remove();
            }
            driverMarkers.clear();
        }
        if (isMapReady) updateLastLocation(false);
    }

    private void createMarker() {
        if (!driverAvailable.isEmpty()) {
            for (Marker m : driverMarkers) {
                m.remove();
            }

            driverMarkers.clear();
            for (DriverModel driver : driverAvailable) {
                LatLng currentDriverPos = new LatLng(driver.getLatitude(), driver.getLongitude());

                if (icondrver.equals("1")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.drivermap))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                } else if (icondrver.equals("2")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.carmap))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                } else if (icondrver.equals("3")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.truck))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                } else if (icondrver.equals("4")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.delivery))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                } else if (icondrver.equals("5")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.hatchback))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                } else if (icondrver.equals("6")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.suv))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                } else if (icondrver.equals("7")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.van))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                } else if (icondrver.equals("8")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.bicycle))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                } else if (icondrver.equals("9")) {
                    driverMarkers.add(
                            gMap.addMarker(new MarkerOptions()
                                    .position(currentDriverPos)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.bajaj))
                                    .anchor((float) 0.5, (float) 0.5)
                                    .rotation(Float.parseFloat(driver.getBearing()))
                                    .flat(true)
                            )
                    );
                }
            }
        }
    }


    private void onPickUp() {
        binding.pickUpContainer.setVisibility(View.GONE);
        if (pickUpMarker != null) pickUpMarker.remove();
        LatLng centerPos = gMap.getCameraPosition().target;
        pickUpMarker = gMap.addMarker(new MarkerOptions()
                .position(centerPos)
                .title("Pick Up")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pickup)));
        pickUpLatLang = centerPos;
        binding.textprogress.setVisibility(View.VISIBLE);
        BottomSheetBehavior behavior = BottomSheetBehavior.from(binding.bottomSheet);
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        requestAddress(centerPos, binding.pickUpText);
        fetchNearDriver(pickUpLatLang.latitude, pickUpLatLang.longitude);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }

    private void fetchNearDriver(double latitude, double longitude) {
        if (driverAvailable != null) {
            driverAvailable.clear();
        }
        if (driverMarkers != null) {
            for (Marker m : driverMarkers) {
                m.remove();
            }
            driverMarkers.clear();
        }
        if (lastKnownLocation != null) {
            User loginUser = BaseApp.getInstance(this).getLoginUser();

            BookService service = ServiceGenerator.createService(BookService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
            GetNearRideCarRequestJson param = new GetNearRideCarRequestJson();
            param.setLatitude(latitude);
            param.setLongitude(longitude);
            param.setFitur(fitur);

            service.getNearRide(param).enqueue(new Callback<GetNearRideCarResponseJson>() {
                @Override
                public void onResponse(@NonNull Call<GetNearRideCarResponseJson> call, @NonNull Response<GetNearRideCarResponseJson> response) {
                    if (response.isSuccessful()) {
                        driverAvailable = Objects.requireNonNull(response.body()).getData();
                        createMarker();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<GetNearRideCarResponseJson> call, @NonNull Throwable t) {

                }
            });
        }
    }


    private void requestAddress(LatLng latlang, final TextView textView) {
        if (latlang != null) {
            MapDirectionAPI.getAddress(latlang).enqueue(new okhttp3.Callback() {
                @Override
                public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {

                }

                @Override
                public void onResponse(@NonNull okhttp3.Call call, @NonNull final okhttp3.Response response) throws IOException {
                    if (response.isSuccessful()) {
                        final String json = Objects.requireNonNull(response.body()).string();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    JSONObject Jobject = new JSONObject(json);
                                    JSONArray Jarray = Jobject.getJSONArray("results");
                                    JSONObject userdata = Jarray.getJSONObject(0);
                                    String address = userdata.getString("formatted_address");
                                    textView.setText(address);
                                    Log.e("TESTER", userdata.getString("formatted_address"));
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    }
                }
            });
        }
    }


    private void onOrderButton() {
        if (checkedpaywallet.equals("1")) {
            if (driverAvailable.isEmpty()) {
                notif("Sorry, there are no drivers around you.");
            } else {
                RideCarRequestJson param = new RideCarRequestJson();
                User userLogin = BaseApp.getInstance(this).getLoginUser();
                param.setIdPelanggan(userLogin.getId());
                param.setOrderFitur(fitur);
                param.setStartLatitude(pickUpLatLang.latitude);
                param.setStartLongitude(pickUpLatLang.longitude);
                param.setEndLatitude(0);
                param.setEndLongitude(0);
                param.setJarak(this.jarak);
                param.setHarga(this.harga);
                param.setEstimasi(binding.fitur.getText().toString());
                param.setKreditpromo(String.valueOf(Double.parseDouble(biayaakhir) * this.harga));
                param.setAlamatAsal(binding.pickUpText.getText().toString());
                param.setAlamatTujuan("");
//                param.setPakaiWallet(1);
                sendRequestTransaksi(param, driverAvailable, 0.5);
            }
        } else {
            if (driverAvailable.isEmpty()) {
                notif("Sorry, there are no drivers around you.");
            } else {
                RideCarRequestJson param = new RideCarRequestJson();
                User userLogin = BaseApp.getInstance(this).getLoginUser();
                param.setIdPelanggan(userLogin.getId());
                param.setOrderFitur(fitur);
                param.setStartLatitude(pickUpLatLang.latitude);
                param.setStartLongitude(pickUpLatLang.longitude);
                param.setEndLatitude(0);
                param.setEndLongitude(0);
                param.setJarak(this.jarak);
                param.setHarga(this.harga);
                param.setEstimasi(binding.fitur.getText().toString());
                param.setKreditpromo("0");
                param.setAlamatAsal(binding.pickUpText.getText().toString());
                param.setAlamatTujuan("");
                param.setPakaiWallet(0);
                sendRequestTransaksi(param, driverAvailable, 0.5);
            }
        }
    }

    private void sendRequestTransaksi(RideCarRequestJson param, final List<DriverModel> driverList, double distance) {
        binding.rlprogress.setVisibility(View.VISIBLE);
        param.setPakaiWallet(0);
        param.setMax_distance(distance);
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        Log.d("distance", "sendRequestTransaksi: RentCar "+distance);
        final BookService service = ServiceGenerator.createService(BookService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());

        service.requestTransaksi(param).enqueue(new Callback<RideCarResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<RideCarResponseJson> call, @NonNull Response<RideCarResponseJson> response) {
                if (response.isSuccessful()) {
                    buildDriverRequest(Objects.requireNonNull(response.body()));
                    driverAvailable = Objects.requireNonNull(response.body()).getDriver();
                    if (driverAvailable.size() == 0) {
                        notif("Sorry, there are no drivers " + distance + "m around you. Will search again now for " + (distance + distance) + "m from you.");
                        binding.rlprogress.setVisibility(View.GONE);
                        if (distance <= 2) {
                            sendRequestTransaksi(param, driverAvailable, (distance + distance));
                        } else {
                            notif("Sorry, there are no drivers around you.");
                        }

                    } else {
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

                                                    new Handler().postDelayed(new Runnable() {
                                                        public void run() {
                                                            finish();
                                                        }
                                                    }, 3000);
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
                                                }
                                            });

                                            new Handler().postDelayed(new Runnable() {
                                                public void run() {
                                                    finish();
                                                }
                                            }, 3000);

                                        }
                                    });
                                }

                            }
                        });
                        thread.start();


                    }
                }
            }

                @Override
                public void onFailure
                (@NonNull Call < RideCarResponseJson > call, @NonNull Throwable t){
                    t.printStackTrace();
                    notif("Your account has a problem, please contact customer service!");
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            finish();
                        }
                    }, 3000);
                }
            });
        }

        private void buildDriverRequest (RideCarResponseJson response){
            transaksi = response.getData().get(0);
            User loginUser = BaseApp.getInstance(this).getLoginUser();
            if (request == null) {
                request = new DriverRequest();
                request.setIdTransaksi(transaksi.getId());
                request.setIdPelanggan(transaksi.getIdPelanggan());
                request.setRegIdPelanggan(loginUser.getToken());
                request.setOrderFitur(designedFitur.getHome());
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
                request.setLayanan(binding.layanan.getText().toString());
                request.setLayanandesc(binding.layanandes.getText().toString());
                request.setIcon(ICONFITUR);
                request.setBiaya(binding.cost.getText().toString());


                String namaLengkap = String.format("%s", loginUser.getFullnama());
                request.setNamaPelanggan(namaLengkap);
                request.setTelepon(loginUser.getNoTelepon());
                request.setType(ORDER);
            }
        }

        private void fcmBroadcast (ArrayList<String> reg_id){
            request.setTime_accept(new Date().getTime() + "");
            final FCMMessage message = new FCMMessage();
            message.setTo(reg_id);
            message.setData(request);

            Log.e("REQUEST TO DRIVER", message.getData().toString());

            FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(new okhttp3.Callback() {
                @Override
                public void onResponse(@NonNull okhttp3.Call call, @NonNull okhttp3.Response response) {
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
        public void onMessageEvent ( final DriverResponse response){
            Log.e("DRIVER RESPONSE (W)", response.getResponse() + " " + response.getId() + " " + response.getIdTransaksi());
            if (response.getResponse().equalsIgnoreCase(DriverResponse.ACCEPT) || response.getResponse().equals("3") || response.getResponse().equals("4")) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        threadRun = false;
                        for (DriverModel cDriver : driverAvailable) {
                            if (cDriver.getId().equals(response.getId())) {


                                Intent intent = new Intent(RentCarActivity.this, ProgressActivity.class);
                                intent.putExtra("id_driver", cDriver.getId());
                                intent.putExtra("id_transaksi", request.getIdTransaksi());
                                intent.putExtra("response", "2");
                                startActivity(intent);
                                DriverResponse response = new DriverResponse();
                                response.setId("");
                                response.setIdTransaksi("");
                                response.setResponse("");
                                EventBus.getDefault().postSticky(response);
                                finish();
                            }
                        }
                    }
                });
            }
        }

        @Override
        protected void onStart () {
            googleApiClient.connect();
            super.onStart();
            EventBus.getDefault().register(this);
        }

        @Override
        protected void onStop () {
            googleApiClient.disconnect();
            super.onStop();
            EventBus.getDefault().unregister(this);
        }

        @Override
        protected void onResume () {
            super.onResume();
            User userLogin = BaseApp.getInstance(this).getLoginUser();
            saldoWallet = String.valueOf(userLogin.getSaldo());
            Utility.currencyTXT(binding.saldo, saldoWallet, this);
        }


        public void setJarak ( double jarak){
            this.jarak = jarak;
        }
    }
