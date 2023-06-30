package com.ourdevelops.ourjek.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityNewBookrideBinding;
import com.ourdevelops.ourjek.gmap.directions.Directions;
import com.ourdevelops.ourjek.gmap.directions.Route;
import com.ourdevelops.ourjek.item.AllBookItem;
import com.ourdevelops.ourjek.item.LocationRecyclerAdapter;
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
import com.ourdevelops.ourjek.models.LocalLocationModel;
import com.ourdevelops.ourjek.models.TransaksiModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;
import com.ourdevelops.ourjek.utils.PrefsManager;
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
import java.util.Locale;
import java.util.Objects;
import io.realm.Realm;
import io.realm.RealmResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.ourdevelops.ourjek.json.fcm.FCMType.ORDER;

/**
 * Created by Pagodalabs
 */

public class NewBookRideActivity extends AppCompatActivity
        implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private ActivityNewBookrideBinding binding;


    public static final String FITUR_KEY = "FiturKey";
    public static final String LATITUDE_KEY = "latitude";
    public static final String LONGITUDE_KEY = "longitude";
    String ICONFITUR;
    private static final String TAG = "NewBookRideActivity";
    private static final int REQUEST_PERMISSION_LOCATION = 991;
    TransaksiModel transaksi;
    Thread thread;
    boolean threadRun = true;
    private DriverRequest request;
    Context context = NewBookRideActivity.this;

    private GoogleMap gMap;
    private GoogleApiClient googleApiClient;
    private Location lastKnownLocation;
    private LatLng pickUpLatLang;
    private LatLng destinationLatLang;
    private Polyline directionLine;
    private Marker pickUpMarker;
    private Marker destinationMarker;
    private List<DriverModel> driverAvailable;
    private List<Marker> driverMarkers;
    private Realm realm;
    private FiturModel designedFitur;
    private double jarak;
    private long harga, promocode, maksimum = 30;
    private String saldoWallet;
    private String checkedpaywallet;
    private boolean isMapReady = false;
    private long distance;
    private String minimumfare;
    private LatLng currentLatLng;
    private LatLng localsaveLatlng;
    private String pickordest = "0";
    String fitur = "15", getbiaya = "", biayaminimum, biayaakhir, icondriver;
    private AllBookItem allBookItem;
    private boolean isSelected = false;

    private okhttp3.Callback updateRouteCallback = new okhttp3.Callback() {
        @Override
        public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {
            notif("error connection, please select destination again!");
            binding.destinationContainer.setVisibility(View.GONE);
            binding.rlprogress.setVisibility(View.GONE);
        }

        @Override
        public void onResponse(@NonNull okhttp3.Call call, okhttp3.Response response) throws IOException {
            if (response.isSuccessful()) {
                final String json = Objects.requireNonNull(response.body()).string();
                distance = MapDirectionAPI.getDistance(NewBookRideActivity.this, json);
                final String time = MapDirectionAPI.getTimeDistance(NewBookRideActivity.this, json);
                if (distance >= 0) {
                    NewBookRideActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            String format = String.format(Locale.US, "%.0f", (double) distance / 1000f);
                            long dist = Long.parseLong(format);
                            if (dist < maksimum) {
                                binding.rlprogress.setVisibility(View.GONE);
                                promocode = 0;
                                binding.promocode.setText("");
                                updateLineDestination(json);
                                updateDistance(distance);
                                binding.fitur.setText(time);
                                String diskontotal = String.valueOf(promocode);
                                Utility.currencyTXT(binding.diskon, diskontotal, NewBookRideActivity.this);
                            } else {
                                binding.destinationContainer.setVisibility(View.GONE);
                                binding.rlprogress.setVisibility(View.GONE);
                                notif("destination too far away!");
                            }
                        }
                    });
                }
            }
        }
    };

    private okhttp3.Callback updateRouteCallback1 = new okhttp3.Callback() {
        @Override
        public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {
            notif("error connection, please select destination again!");
            binding.destinationContainer.setVisibility(View.GONE);
            binding.rlprogress.setVisibility(View.GONE);
        }

        @Override
        public void onResponse(@NonNull okhttp3.Call call, okhttp3.Response response) throws IOException {
            if (response.isSuccessful()) {
                final String json = Objects.requireNonNull(response.body()).string();
                distance = MapDirectionAPI.getDistance(NewBookRideActivity.this, json);
                final String time = MapDirectionAPI.getTimeDistance(NewBookRideActivity.this, json);
                if (distance >= 0) {
                    NewBookRideActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            String format = String.format(Locale.US, "%.0f", (double) distance / 1000f);
                            long dist = Long.parseLong(format);
                            if (dist < maksimum) {
                                binding.rlprogress.setVisibility(View.GONE);
                                promocode = 0;
                                binding.promocode.setText("");
                                updateLineDestination(json);
                                updateDistance(distance);
                                binding.fitur.setText(time);
                                String diskontotal = String.valueOf(promocode);
                                Utility.currencyTXT(binding.diskon, diskontotal, NewBookRideActivity.this);
                            } else {
                                binding.detail.setVisibility(View.GONE);
                                binding.destinationContainer.setVisibility(View.GONE);
                                binding.rlprogress.setVisibility(View.GONE);
                                notif("destination too far away!");
                            }
                        }
                    });
                }
            }
        }
    };
    private LocationRecyclerAdapter locationRecyclerAdapter;



    @SuppressLint({"SetTextI18n", "StaticFieldLeak"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewBookrideBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        BottomSheetBehavior behavior = BottomSheetBehavior.from(binding.bottomSheet);
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        promocode = 0;

        Places.initialize(getApplicationContext(), getString(R.string.google_maps_key));

        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), getString(R.string.google_maps_key));
        }


        binding.pickUpContainer.setVisibility(View.GONE);
        binding.destinationContainer.setVisibility(View.GONE);
        binding.detail.setVisibility(View.GONE);

        User userLogin = BaseApp.getInstance(this).getLoginUser();
        saldoWallet = String.valueOf(userLogin.getSaldo());

        binding.pickUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onPickUp();
            }
        });

        binding.destinationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onDestination();
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
                }
                if (isSelected) {
                    promokodedata();
                } else {
                    notif("Please Select your desired ride first!");
                }
            }
        });


        binding.pickUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.pickUpContainer.setVisibility(View.VISIBLE);
                binding.llShowDetail.setVisibility(View.VISIBLE);
                binding.bottomSheet.setVisibility(View.GONE);
                binding.destinationContainer.setVisibility(View.GONE);
                pickordest = "1";
            }
        });

        binding.destinationText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.destinationContainer.setVisibility(View.VISIBLE);
                binding.llShowDetail.setVisibility(View.VISIBLE);
                binding.bottomSheet.setVisibility(View.GONE);
                binding.pickUpContainer.setVisibility(View.GONE);
                pickordest = "2";
            }
        });

        findViewById(R.id.locationPicker_autoCompleteText).setOnClickListener(v -> {
            if (pickordest.matches("1")) {
                openAutocompleteActivity(1);
            } else if (pickordest.matches("2")) {
                openAutocompleteActivity(2);
            } else {
                openAutocompleteActivity(3);
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
        currentLatLng = new LatLng(Double.parseDouble(Objects.requireNonNull(getIntent().getStringExtra("latitude"))), Double.parseDouble(Objects.requireNonNull(getIntent().getStringExtra("longitude"))));
        realm = Realm.getDefaultInstance();
        RealmResults<FiturModel> fiturs = realm.where(FiturModel.class).findAll();
        for (FiturModel fitur : fiturs) {
            Log.e("ID_FITUR", fitur.getIdFitur() + " " + fitur.getFitur() + " " + fitur.getBiayaAkhir() + " " + ICONFITUR);
        }
        realm.executeTransaction((r) -> {
            r.where(FiturModel.class).equalTo("idFitur", 21).findAll().deleteAllFromRealm();
        });
        allBookItem = new AllBookItem(getApplicationContext(), fiturs, R.layout.item_book_fitur);
        binding.rvRideList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false));
        binding.rvRideList.setAdapter(allBookItem);
        allBookItem.SetOnItemClickListener((view, position, model) -> {
            fitur = String.valueOf(model.getIdFitur());
            getbiaya = String.valueOf(model.getBiaya()); //Rs 15
            biayaminimum = String.valueOf(model.getBiaya_minimum());  //Rs 45
            biayaakhir = String.valueOf(model.getBiayaAkhir());
            icondriver = model.getIcon_driver();
            maksimum = Long.parseLong(model.getMaksimumdist());
            minimumfare = model.getMinimum_fare();
            updateFitur();
            binding.ketsaldo.setText("Discount " + model.getDiskon() + " with Wallet");
            PicassoTrustAll.getInstance(this)
                    .load(Constants.IMAGESFITUR + model.getIcon())
                    .placeholder(R.drawable.logo)
                    .resize(100, 100)
                    .into(binding.image);
            binding.lllayananall.setVisibility(View.VISIBLE);
            binding.layanan.setText(model.getFitur());
            binding.layanandes.setText(model.getKeterangan());
            requestRoute1();
            fetchNearDriver(pickUpLatLang.latitude, pickUpLatLang.longitude, fitur);
            isSelected = true;
        });

        binding.btnConfirm.setOnClickListener(v -> {

            Log.d("value", pickordest);
            if (binding.tvPlaceName.getText().toString().isEmpty() || binding.tvPlaceName.getText().toString().matches("Set Location")) {
                notif("Please Select the location.");
            } else {
                if (getIntent().getStringExtra("value").matches("from")) {
                    binding.pickUpText.setText(binding.tvPlaceName.getText().toString());
                    new PrefsManager(getApplicationContext()).setPlace(binding.tvPlaceName.getText().toString());
                    new PrefsManager(getApplicationContext()).setLatitude(String.valueOf(pickUpLatLang.latitude));
                    new PrefsManager(getApplicationContext()).setLongitude(String.valueOf(pickUpLatLang.longitude));
                }
                if (getIntent().getStringExtra("value").matches("to")) {
                    binding.destinationText.setText(binding.tvPlaceName.getText().toString());
                    new PrefsManager(getApplicationContext()).setPlace2(binding.tvPlaceName.getText().toString());
                    new PrefsManager(getApplicationContext()).setLatitude2(String.valueOf(destinationLatLang.latitude));
                    new PrefsManager(getApplicationContext()).setLongitude2(String.valueOf(destinationLatLang.longitude));
                }
                if (pickordest.matches("3")) {
                    binding.destinationText.setText(binding.tvPlaceName.getText().toString());
                }
                binding.pickUpContainer.setVisibility(View.GONE);
                binding.destinationContainer.setVisibility(View.GONE);
                binding.bottomSheet.setVisibility(View.VISIBLE);
                binding.llShowDetail.setVisibility(View.GONE);
            }
        });
        showRouteFromPreviousData(currentLatLng);
        findViewById(R.id.ll_pinonmap).setOnClickListener(v -> {
            if (binding.destinationContainer.getVisibility() == View.VISIBLE) {
                binding.destinationContainer.setVisibility(View.VISIBLE);
                binding.pickUpContainer.setVisibility(View.GONE);
                pickordest = "2";
            } else {
                binding.pickUpContainer.setVisibility(View.VISIBLE);
                binding.destinationContainer.setVisibility(View.GONE);
                pickordest = "1";
            }
        });

        binding.ivFav.setOnClickListener(v -> {
            if (!binding.tvPlaceName.getText().toString().isEmpty()) {
                realm.beginTransaction();
                RealmResults<LocalLocationModel> parameters = realm.where(LocalLocationModel.class).equalTo("name", binding.tvPlaceName.getText().toString()).findAll();
                if (parameters.size() != 0) {
                    parameters.deleteAllFromRealm();
                } else {
                    savetoRealm(binding.tvPlaceName.getText().toString());
                }
            }
        });
        setSavedLocation();
    }

    private void setSavedLocation() {
        realm.beginTransaction();
        RealmResults<LocalLocationModel> parameters = realm.where(LocalLocationModel.class).findAll();
        realm.commitTransaction();
        if (parameters != null) {
            binding.rvLocationList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false));
            locationRecyclerAdapter = new LocationRecyclerAdapter(getApplicationContext(), parameters);
            binding.rvLocationList.setAdapter(locationRecyclerAdapter);
            locationRecyclerAdapter.SetOnItemClickListener((view, position, model) -> {
                binding.tvPlaceName.setText(model.getName());
                if (getIntent().getStringExtra("value").matches("from")) {
                    pickUpLatLang = new LatLng(Double.valueOf(model.getLatitude()), Double.valueOf(model.getLongitude()));
                }
                if (getIntent().getStringExtra("value").matches("to")) {
                    destinationLatLang = new LatLng(Double.valueOf(model.getLatitude()), Double.valueOf(model.getLongitude()));
                }
            });
        }
    }

    private void savetoRealm(String name) {
        realm.beginTransaction();
        LocalLocationModel localLocationModel = realm.createObject(LocalLocationModel.class);
        localLocationModel.setName(name);
        if (getIntent().getStringExtra("value").matches("from")) {
            localLocationModel.setLatitude(String.valueOf(pickUpLatLang.latitude));
            localLocationModel.setLongitude(String.valueOf(pickUpLatLang.longitude));
        }
        if (getIntent().getStringExtra("value").matches("to")) {
            localLocationModel.setLatitude(String.valueOf(destinationLatLang.latitude));
            localLocationModel.setLongitude(String.valueOf(destinationLatLang.longitude));
        }
        realm.insert(localLocationModel);
        realm.commitTransaction();
        setSavedLocation();
    }

    private void showRouteFromPreviousData(LatLng currentLatLng) {
        pickUpLatLang = currentLatLng;
        requestAddress(new LatLng(currentLatLng.latitude, currentLatLng.longitude), binding.pickUpText);
        if (getIntent().getExtras() != null) {
            if (getIntent().getStringExtra("value").matches("to")) {
                if (!new PrefsManager(getApplicationContext()).getplace2().isEmpty()) {
                    binding.destinationText.setText(new PrefsManager(getApplicationContext()).getplace2());
                    destinationLatLang = new LatLng(Double.parseDouble(new PrefsManager(getApplicationContext()).getLatitude2()), Double.parseDouble(new PrefsManager(getApplicationContext()).getLongitude2()));
                } else {
                    pickordest = "2";
                    binding.destinationContainer.setVisibility(View.VISIBLE);
//                    iv_pickup.setVisibility(View.GONE);
                    binding.llShowDetail.setVisibility(View.VISIBLE);
                    binding.bottomSheet.setVisibility(View.GONE);
                }

            } else if (getIntent().getStringExtra("value").matches("from")) {
                if (!new PrefsManager(getApplicationContext()).getplace().isEmpty()) {
                    binding.destinationText.setText(new PrefsManager(getApplicationContext()).getplace());
                    destinationLatLang = new LatLng(Double.parseDouble(new PrefsManager(getApplicationContext()).getLatitude()), Double.parseDouble(new PrefsManager(getApplicationContext()).getLongitude()));
                } else {
                    pickordest = "2";
                    binding.destinationContainer.setVisibility(View.VISIBLE);
//                    iv_pickup.setVisibility(View.GONE);
                    binding.llShowDetail.setVisibility(View.VISIBLE);
                    binding.bottomSheet.setVisibility(View.GONE);
                }
            } else {
                pickordest = "3";
                binding.destinationContainer.setVisibility(View.VISIBLE);
//                iv_pickup.setVisibility(View.GONE);
                binding.llShowDetail.setVisibility(View.VISIBLE);
                binding.bottomSheet.setVisibility(View.GONE);
            }
        }
        fetchNearDriver(pickUpLatLang.latitude, pickUpLatLang.longitude, fitur);

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
                            Utility.currencyTXT(binding.diskon, diskontotal, NewBookRideActivity.this);
                        } else {
                            String diskontotal = String.valueOf(promocode);
                            String totalbiaya = String.valueOf(harga - promocode);
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, NewBookRideActivity.this);
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
                            Utility.currencyTXT(binding.diskon, diskontotal, NewBookRideActivity.this);
                        } else {
                            String diskontotal = String.valueOf(promocode);
                            String totalbiaya = String.valueOf(harga - promocode);
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, NewBookRideActivity.this);
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

    public void notif(String text) {
        binding.rlnotif.setVisibility(View.VISIBLE);
        binding.textnotif.setText(text);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                binding.rlnotif.setVisibility(View.GONE);
            }
        }, 3000);
    }

    private void openAutocompleteActivity(int request_code) {
        List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.ADDRESS, Place.Field.LAT_LNG);
        Intent intent = new Autocomplete.IntentBuilder(
                AutocompleteActivityMode.FULLSCREEN, fields)
                .build(this);
        startActivityForResult(intent, request_code);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Place place = Autocomplete.getPlaceFromIntent(data);
            if (requestCode == 1) {
                binding.pickUpText.setText(place.getAddress());
                pickUpLatLang = place.getLatLng();
                if (pickUpLatLang != null) {
                    gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                            new LatLng(pickUpLatLang.latitude, pickUpLatLang.longitude), 15f)
                    );
                    onPickUp();
                }
            }
            if (requestCode == 2) {
                binding.destinationText.setText(place.getAddress());
                destinationLatLang = place.getLatLng();
                if (destinationLatLang != null) {
                    gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                            new LatLng(destinationLatLang.latitude, destinationLatLang.longitude), 15f)
                    );
                    onDestination();
                }
            }
            if (requestCode == 3) {
                binding.destinationText.setText(place.getAddress());
                destinationLatLang = place.getLatLng();
                if (destinationLatLang != null) {
                    gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                            new LatLng(destinationLatLang.latitude, destinationLatLang.longitude), 15f)
                    );
                    onDestination();
                }
            }
            localsaveLatlng = place.getLatLng();
        } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
            Status status = Autocomplete.getStatusFromIntent(data);
            Log.i(TAG, Objects.requireNonNull(status.getStatusMessage()));
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
        gMap.setMinZoomPreference(10.0f); // Set a preference for minimum zoom (Zoom out).
        gMap.setMaxZoomPreference(18.0f); // Set a preference for maximum zoom (Zoom In).
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
            requestRoute();
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
                if (driver.getBearing().isEmpty()) {

                } else {
                    LatLng currentDriverPos = new LatLng(driver.getLatitude(), driver.getLongitude());

                    if (icondriver.equals("1")) {
                        driverMarkers.add(
                                gMap.addMarker(new MarkerOptions()
                                        .position(currentDriverPos)
                                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.drivermap))
                                        .anchor((float) 0.5, (float) 0.5)
                                        .rotation(Float.parseFloat(driver.getBearing()))
                                        .flat(true)
                                )
                        );
                    } else if (icondriver.equals("2")) {
                        driverMarkers.add(
                                gMap.addMarker(new MarkerOptions()
                                        .position(currentDriverPos)
                                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.carmap))
                                        .anchor((float) 0.5, (float) 0.5)
                                        .rotation(Float.parseFloat(driver.getBearing()))
                                        .flat(true)
                                )
                        );
                    } else if (icondriver.equals("3")) {
                        driverMarkers.add(
                                gMap.addMarker(new MarkerOptions()
                                        .position(currentDriverPos)
                                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.truck))
                                        .anchor((float) 0.5, (float) 0.5)
                                        .rotation(Float.parseFloat(driver.getBearing()))
                                        .flat(true)
                                )
                        );
                    } else if (icondriver.equals("4")) {
                        driverMarkers.add(
                                gMap.addMarker(new MarkerOptions()
                                        .position(currentDriverPos)
                                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.delivery))
                                        .anchor((float) 0.5, (float) 0.5)
                                        .rotation(Float.parseFloat(driver.getBearing()))
                                        .flat(true)
                                )
                        );
                    } else if (icondriver.equals("5")) {
                        driverMarkers.add(
                                gMap.addMarker(new MarkerOptions()
                                        .position(currentDriverPos)
                                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.hatchback))
                                        .anchor((float) 0.5, (float) 0.5)
                                        .rotation(Float.parseFloat(driver.getBearing()))
                                        .flat(true)
                                )
                        );
                    } else if (icondriver.equals("6")) {
                        driverMarkers.add(
                                gMap.addMarker(new MarkerOptions()
                                        .position(currentDriverPos)
                                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.suv))
                                        .anchor((float) 0.5, (float) 0.5)
                                        .rotation(Float.parseFloat(driver.getBearing()))
                                        .flat(true)
                                )
                        );
                    } else if (icondriver.equals("7")) {
                        driverMarkers.add(
                                gMap.addMarker(new MarkerOptions()
                                        .position(currentDriverPos)
                                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.van))
                                        .anchor((float) 0.5, (float) 0.5)
                                        .rotation(Float.parseFloat(driver.getBearing()))
                                        .flat(true)
                                )
                        );
                    } else if (icondriver.equals("9")) {
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
    }


    private void onDestination() {
        LatLng centerPos = gMap.getCameraPosition().target;
        binding.textprogress.setVisibility(View.VISIBLE);
        destinationLatLang = centerPos;
        requestAddress(centerPos, binding.tvPlaceName);
        requestRoute();
    }

    private void onPickUp() {
        LatLng centerPos = gMap.getCameraPosition().target;
        binding.textprogress.setVisibility(View.VISIBLE);
        pickUpLatLang = centerPos;
        requestAddress(centerPos, binding.tvPlaceName);
        requestRoute();

    }

    private void requestRoute() {
        gMap.clear();
        if (pickUpLatLang != null && destinationLatLang != null) {
            binding.destinationContainer.setVisibility(View.GONE);
            binding.pickUpContainer.setVisibility(View.GONE);
            binding.rlprogress.setVisibility(View.VISIBLE);
            binding.textprogress.setText(getString(R.string.waiting_pleaseWait));
            pickUpMarker = gMap.addMarker(new MarkerOptions()
                    .position(pickUpLatLang)
                    .title(binding.pickUpText.getText().toString())
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.pickup)));
            destinationMarker = gMap.addMarker(new MarkerOptions()
                    .position(destinationLatLang)
                    .title(binding.destinationText.getText().toString())
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.destination)));
            MapDirectionAPI.getDirection(pickUpLatLang, destinationLatLang).enqueue(updateRouteCallback);
        }
    }

    private void requestRoute1() {
        gMap.clear();
        if (pickUpLatLang != null && destinationLatLang != null) {
            binding.destinationContainer.setVisibility(View.GONE);
            binding.pickUpContainer.setVisibility(View.GONE);
            binding.rlprogress.setVisibility(View.VISIBLE);
            binding.textprogress.setText(getString(R.string.waiting_pleaseWait));
            pickUpMarker = gMap.addMarker(new MarkerOptions()
                    .position(pickUpLatLang)
                    .title(binding.pickUpText.getText().toString())
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.pickup)));
            destinationMarker = gMap.addMarker(new MarkerOptions()
                    .position(destinationLatLang)
                    .title(binding.destinationText.getText().toString())
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.destination)));
            MapDirectionAPI.getDirection(pickUpLatLang, destinationLatLang).enqueue(updateRouteCallback1);
        }
    }


    private void updateLineDestination(String json) {
        Directions directions = new Directions(NewBookRideActivity.this);
        try {
            List<Route> routes = directions.parse(json);

            if (directionLine != null) directionLine.remove();
            if (routes.size() > 0) {
                directionLine = gMap.addPolyline((new PolylineOptions())
                        .addAll(routes.get(0).getOverviewPolyLine())
                        .color(ContextCompat.getColor(NewBookRideActivity.this, R.color.colorgradient))
                        .width(8));

                //Calculate the markers to get their position
                LatLngBounds.Builder b = new LatLngBounds.Builder();
                b.include(pickUpLatLang);
                b.include(destinationLatLang);
                LatLngBounds bounds = b.build();
//Change the padding as per needed
                CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 15);
                gMap.animateCamera(cu);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateDistance(long distance) {
        binding.detail.setVisibility(View.VISIBLE);
        BottomSheetBehavior behavior = BottomSheetBehavior.from(binding.bottomSheet);
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        binding.destinationContainer.setVisibility(View.GONE);
        binding.pickUpContainer.setVisibility(View.GONE);
        binding.order.setVisibility(View.VISIBLE);

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
        float km = ((float) (distance)) / 1000f;

        this.jarak = km;

        String format = String.format(Locale.US, "%.1f", km);
        binding.distance.setText(format);
        String biaya = String.valueOf(biayaminimum);  // Rs 45
        if (!getbiaya.isEmpty()) {
//            long biayaTotal = (long) (Double.parseDouble(getbiaya) * km);  // Rs 15 * km
            long biayaTotal = (long) 0.0;

            if (km <= 1) {
                this.harga = Long.parseLong(biayaminimum);
                biayaTotal = Long.parseLong(biayaminimum);
                Utility.currencyTXT(binding.cost, biaya, this);
            } else {
                this.harga = Long.parseLong(minimumfare) + (long) (Double.parseDouble(getbiaya) * km);
                biayaTotal = Long.parseLong(minimumfare) + (long) (Double.parseDouble(getbiaya) * km);
                Utility.currencyTXT(binding.cost, getbiaya, this);
            }
            this.harga = biayaTotal;

            final long finalBiayaTotal = biayaTotal;
            String totalbiaya = String.valueOf(finalBiayaTotal);
            Utility.currencyTXT(binding.price, totalbiaya, this);

            long saldokini = Long.parseLong(saldoWallet);
            if (saldokini < (biayaTotal - (harga * Double.parseDouble(biayaakhir)))) {
                binding.llcheckedcash.setOnClickListener(view -> {
                    String totalbiaya13 = String.valueOf(finalBiayaTotal - promocode);
                    Utility.currencyTXT(binding.price, totalbiaya13, context);
                    String diskontotal = String.valueOf(promocode);
                    Utility.currencyTXT(binding.diskon, diskontotal, NewBookRideActivity.this);
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
                    String diskontotal = String.valueOf(promocode);
                    String totalbiaya1 = String.valueOf(finalBiayaTotal - promocode);
                    Utility.currencyTXT(binding.price, totalbiaya1, context);
                    Utility.currencyTXT(binding.diskon, diskontotal, NewBookRideActivity.this);

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
                binding.llcheckedwallet.setOnClickListener(view -> {
                    long diskonwallet = (long) (Double.parseDouble(biayaakhir) * harga);
                    String totalwallet = String.valueOf(diskonwallet + promocode);
                    Utility.currencyTXT(binding.diskon, totalwallet, context);
                    String totalbiaya12 = String.valueOf(finalBiayaTotal1 - (diskonwallet + promocode));
                    Utility.currencyTXT(binding.price, totalbiaya12, context);
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
                });
            }
        }

        binding.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOrderButton();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }

    private void fetchNearDriver(double latitude, double longitude, String fitur) {
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
            param.setLanguage(new PrefsManager(getApplicationContext()).getLanguageValue());

            service.getNearRide(param).enqueue(new Callback<GetNearRideCarResponseJson>() {
                @Override
                public void onResponse(@NonNull Call<GetNearRideCarResponseJson> call, @NonNull Response<GetNearRideCarResponseJson> response) {
                    if (response.isSuccessful()) {
                        driverAvailable = Objects.requireNonNull(response.body()).getData();
                        createMarker();
                    }
                }

                @Override
                public void onFailure(@NonNull retrofit2.Call<GetNearRideCarResponseJson> call, @NonNull Throwable t) {

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
//                                    for(int i=0;i<Jarray.length();i++){
//                                        Log.d("valueofi", String.valueOf(Jarray.getJSONObject(i)));
//                                    }
                                    JSONObject userdata = Jarray.getJSONObject(1);
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
        if (isSelected) {
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
                    param.setEndLatitude(destinationLatLang.latitude);
                    param.setEndLongitude(destinationLatLang.longitude);
                    param.setJarak(this.jarak);
                    param.setHarga(this.harga);
                    param.setEstimasi(binding.fitur.getText().toString());
                    param.setKreditpromo(String.valueOf((Double.parseDouble(biayaakhir) * this.harga) + promocode));
                    param.setAlamatAsal(binding.pickUpText.getText().toString());
                    param.setAlamatTujuan(binding.destinationText.getText().toString());
//                    param.setPakaiWallet(1);
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
                    param.setEndLatitude(destinationLatLang.latitude);
                    param.setEndLongitude(destinationLatLang.longitude);
                    param.setJarak(this.jarak);
                    param.setHarga(this.harga);
                    param.setEstimasi(binding.fitur.getText().toString());
                    param.setKreditpromo(String.valueOf(promocode));
                    param.setAlamatAsal(binding.pickUpText.getText().toString());
                    param.setAlamatTujuan(binding.destinationText.getText().toString());
                    param.setPakaiWallet(0);
                    sendRequestTransaksi(param, driverAvailable, 0.5);
                }
            }
        } else {
            notif("Please select your desired ride");
        }
    }

    private void sendRequestTransaksi(RideCarRequestJson param, final List<DriverModel> driverList, double distance) {
        binding.rlprogress.setVisibility(View.VISIBLE);
        param.setPakaiWallet(0);
        param.setMax_distance(distance);
        binding.textprogress.setText(getString(R.string.waiting_desc));
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        Log.d("distance", "sendRequestTransaksi: NewBOokRide"+distance);
        final BookService service = ServiceGenerator.createService(BookService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());

        service.requestTransaksi(param).enqueue(new Callback<RideCarResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<RideCarResponseJson> call, @NonNull Response<RideCarResponseJson> response) {
                if (response.isSuccessful()) {
                    buildDriverRequest(Objects.requireNonNull(response.body()));
                    driverAvailable = Objects.requireNonNull(response.body()).getDriver();
                    Log.d("distance", "sendRequestTransaksi: "+distance+"----"+driverAvailable);
                    if (driverAvailable.size() == 0) {
                        notif("Sorry, there are no drivers "+distance+"m around you. Will search again now for " +(distance+distance)+"m from you.");
                        binding.rlprogress.setVisibility(View.GONE);
                        if(distance <= 2){
                            sendRequestTransaksi(param, driverAvailable, (distance+distance));
                        }else {
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
                                                    binding.rlprogress.setVisibility(View.GONE);
                                                    runOnUiThread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            notif("Driver not found!");
                                                        }
                                                    });

//                                                    new Handler().postDelayed(new Runnable() {
//                                                        public void run() {
//                                                            finish();
//                                                        }
//                                                    }, 3000);
                                                }
                                            }
                                        }

                                        @Override
                                        public void onFailure(@NonNull Call<CheckStatusTransaksiResponse> call, @NonNull Throwable t) {
                                            notif("Driver not found!");
                                            binding.rlprogress.setVisibility(View.GONE);
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    notif("Driver not found!");
                                                }
                                            });

//                                            new Handler().postDelayed(new Runnable() {
//                                                public void run() {
//                                                    finish();
//                                                }
//                                            }, 3000);
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
            public void onFailure(@NonNull Call<RideCarResponseJson> call, @NonNull Throwable t) {
                t.printStackTrace();
                binding.rlprogress.setVisibility(View.GONE);
                notif("Your account has a problem, please contact customer service!");
//                new Handler().postDelayed(new Runnable() {
//                    public void run() {
//                        finish();
//                    }
//                }, 3000);
            }
        });
    }

    private void buildDriverRequest(RideCarResponseJson response) {
        transaksi = response.getData().get(0);
        Log.e("wallet", String.valueOf(transaksi.isPakaiWallet()));
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        if (request == null) {
            request = new DriverRequest();
            request.setIdTransaksi(transaksi.getId());
            request.setIdPelanggan(transaksi.getIdPelanggan());
            request.setRegIdPelanggan(loginUser.getToken());
            request.setOrderFitur(fitur);
//            request.setOrderFitur(designedFitur.getHome());  old code
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
            request.setDistance(binding.distance.getText().toString());

            String namaLengkap = String.format("%s", loginUser.getFullnama());
            request.setNamaPelanggan(namaLengkap);
            request.setTelepon(loginUser.getNoTelepon());
            request.setType(ORDER);
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
    public void onMessageEvent(final DriverResponse response) {
        Log.e("DRIVER RESPONSE (W)", response.getResponse() + " " + response.getId() + " " + response.getIdTransaksi());
        if (response.getResponse().equalsIgnoreCase(DriverResponse.ACCEPT) || response.getResponse().equals("3") || response.getResponse().equals("4")) {
            runOnUiThread(new Runnable() {
                public void run() {
                    threadRun = false;
                    for (DriverModel cDriver : driverAvailable) {
                        if (cDriver.getId().equals(response.getId())) {
                            Intent intent = new Intent(NewBookRideActivity.this, ProgressActivity.class);
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
    protected void onStart() {
        googleApiClient.connect();
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        googleApiClient.disconnect();
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        User userLogin = BaseApp.getInstance(this).getLoginUser();
        saldoWallet = String.valueOf(userLogin.getSaldo());
        Utility.currencyTXT(binding.saldo, saldoWallet, this);
    }


}
