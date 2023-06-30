package com.ourdevelops.ourjek.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

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
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo;
import com.ourdevelops.ourjek.databinding.ActivityRideBinding;
import com.ourdevelops.ourjek.gmap.directions.Directions;
import com.ourdevelops.ourjek.gmap.directions.Route;
import com.ourdevelops.ourjek.json.CheckStatusTransaksiRequest;
import com.ourdevelops.ourjek.json.CheckStatusTransaksiResponse;
import com.ourdevelops.ourjek.json.GetNearRideCarRequestJson;
import com.ourdevelops.ourjek.json.GetNearRideCarResponseJson;
import com.ourdevelops.ourjek.json.PromoRequestJson;
import com.ourdevelops.ourjek.json.PromoResponseJson;
import com.ourdevelops.ourjek.json.ResponseJson;
import com.ourdevelops.ourjek.json.RideCarRequestJson;
import com.ourdevelops.ourjek.json.RideCarResponseJson;
import com.ourdevelops.ourjek.json.fcm.CancelBookRequestJson;
import com.ourdevelops.ourjek.json.fcm.CancelBookResponseJson;
import com.ourdevelops.ourjek.json.fcm.DriverRequest;
import com.ourdevelops.ourjek.json.fcm.DriverResponse;
import com.ourdevelops.ourjek.json.fcm.FCMMessage;
import com.ourdevelops.ourjek.json.fcm.FCMResponseJson;
import com.ourdevelops.ourjek.models.DriverModel;
import com.ourdevelops.ourjek.models.FiturModel;
import com.ourdevelops.ourjek.models.TransaksiModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;
import com.ourdevelops.ourjek.utils.PrefsManager;
import com.ourdevelops.ourjek.utils.SettingPreference;
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

public class RideCarActivity extends AppCompatActivity
        implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private ActivityRideBinding binding;
    public static final String FITUR_KEY = "FiturKey";
    String ICONFITUR;
    private static final String TAG = "RideCarActivity";
    private static final int REQUEST_PERMISSION_LOCATION = 991;
    TransaksiModel transaksi;
    Thread thread;
    boolean threadRun = false;
    private DriverRequest request;
    Context context = RideCarActivity.this;

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
    private long harga, promocode, maksimum;
    private String saldoWallet;
    private String checkedpaywallet;
    private boolean isMapReady = false;
    private String minimumfare;
    String fitur, getbiaya, biayaminimum, biayaakhir, icondriver;

    private okhttp3.Callback updateRouteCallback = new okhttp3.Callback() {
        @Override
        public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {
            notif("error connection, please select destination again!");
            binding.destinationContainer.setVisibility(View.VISIBLE);
            binding.rlprogress.setVisibility(View.GONE);
        }

        @Override
        public void onResponse(@NonNull okhttp3.Call call, okhttp3.Response response) throws IOException {
            if (response.isSuccessful()) {
                final String json = Objects.requireNonNull(response.body()).string();
                final long distance = MapDirectionAPI.getDistance(RideCarActivity.this, json);
                final String time = MapDirectionAPI.getTimeDistance(RideCarActivity.this, json);
                if (distance >= 0) {
                    RideCarActivity.this.runOnUiThread(new Runnable() {
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
                                Utility.currencyTXT(binding.diskon, diskontotal, RideCarActivity.this);
                            } else {
                                binding.detail.setVisibility(View.GONE);
                                binding.destinationContainer.setVisibility(View.VISIBLE);
                                binding.rlprogress.setVisibility(View.GONE);
                                notif("destination too far away!");
                            }

                        }
                    });
                }
            }
        }
    };
    private int repeat = 0;
    private String transaction_id;
    private ArrayList<String> driverRegIds = new ArrayList<String>();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRideBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        BottomSheetBehavior behavior = BottomSheetBehavior.from(binding.bottomSheet);
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        promocode = 0;

        Places.initialize(getApplicationContext(), getString(R.string.google_maps_key));

        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), getString(R.string.google_maps_key));
        }

        binding.pickUpContainer.setVisibility(View.VISIBLE);
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
                } else {
                    promokodedata();
                }
            }
        });


        binding.pickUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.pickUpContainer.setVisibility(View.VISIBLE);
                binding.destinationContainer.setVisibility(View.GONE);
                openAutocompleteActivity(1);
            }
        });

        binding.destinationText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.destinationContainer.setVisibility(View.VISIBLE);
                binding.pickUpContainer.setVisibility(View.GONE);
                openAutocompleteActivity(2);
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
        icondriver = designedFitur.getIcon_driver();
        maksimum = Long.parseLong(designedFitur.getMaksimumdist());
        minimumfare = designedFitur.getMinimum_fare();
        updateFitur();

        binding.ketsaldo.setText("Discount " + designedFitur.getDiskon() + " with Wallet");
        PicassoTrustAll.getInstance(this)
                .load(Constants.IMAGESFITUR + ICONFITUR)
                .placeholder(R.drawable.logo)
                .resize(100, 100)
                .into(binding.image);

        binding.layanan.setText(designedFitur.getFitur());
        binding.layanandes.setText(designedFitur.getKeterangan());

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
                            Utility.currencyTXT(binding.diskon, diskontotal, RideCarActivity.this);
                        } else {
                            String diskontotal = String.valueOf(promocode);
                            String totalbiaya = String.valueOf(harga - promocode);
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, RideCarActivity.this);
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
                            Utility.currencyTXT(binding.diskon, diskontotal, RideCarActivity.this);
                        } else {
                            String diskontotal = String.valueOf(promocode);
                            String totalbiaya = String.valueOf(harga - promocode);
                            Utility.currencyTXT(binding.price, totalbiaya, context);
                            Utility.currencyTXT(binding.diskon, diskontotal, RideCarActivity.this);
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
        threadRun=false;

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
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                Place place = Autocomplete.getPlaceFromIntent(data);
                binding.destinationText.setText(place.getAddress());
                LatLng latLng = place.getLatLng();
                if (latLng != null) {
                    gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                            new LatLng(latLng.latitude, latLng.longitude), 15f)
                    );
                    onDestination();
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
//        try {
//            boolean success = googleMap.setMapStyle(
//                    MapStyleOptions.loadRawResourceStyle(
//                            this, R.raw.style_json));
//
//            if (!success) {
//                Log.e(TAG, "Style parsing failed.");
//            }
//        } catch (Resources.NotFoundException e) {
//            Log.e(TAG, "Can't find style. Error: ", e);
//        }

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

            fetchNearDriver(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), fitur);
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
                    } else if (icondriver.equals("8")) {
                        driverMarkers.add(
                                gMap.addMarker(new MarkerOptions()
                                        .position(currentDriverPos)
                                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.bicycle))
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

    public void onFabClicked(View view) {


        final int REQUEST_PHONE_CALL = 1;
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + (new SettingPreference(getApplicationContext()).getSetting()[3])));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            } else {
                startActivity(callIntent);
            }
        }
    }


    private void onDestination() {
        if (destinationMarker != null) destinationMarker.remove();
        LatLng centerPos = gMap.getCameraPosition().target;
        destinationMarker = gMap.addMarker(new MarkerOptions()
                .position(centerPos)
                .title("Destination")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.destination)));
        destinationLatLang = centerPos;

        requestAddress(centerPos, binding.destinationText);
        requestRoute();

        binding.destinationContainer.setVisibility(View.GONE);
        if (binding.pickUpText.getText().toString().isEmpty()) {
            binding.pickUpContainer.setVisibility(View.VISIBLE);
        } else {
            binding.pickUpContainer.setVisibility(View.GONE);
        }
    }

    private void onPickUp() {
        binding.destinationContainer.setVisibility(View.VISIBLE);
        binding.pickUpContainer.setVisibility(View.GONE);
        if (pickUpMarker != null) pickUpMarker.remove();
        LatLng centerPos = gMap.getCameraPosition().target;
        pickUpMarker = gMap.addMarker(new MarkerOptions()
                .position(centerPos)
                .title("Pick Up")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pickup)));
        pickUpLatLang = centerPos;
        binding.textprogress.setVisibility(View.VISIBLE);

        requestAddress(centerPos, binding.pickUpText);
        fetchNearDriver(pickUpLatLang.latitude, pickUpLatLang.longitude, fitur);
        requestRoute();
    }

    private void requestRoute() {
        if (pickUpLatLang != null && destinationLatLang != null) {
            binding.rlprogress.setVisibility(View.VISIBLE);
            binding.textprogress.setText(getString(R.string.waiting_pleaseWait));
            MapDirectionAPI.getDirection(pickUpLatLang, destinationLatLang).enqueue(updateRouteCallback);
        }
    }


    private void updateLineDestination(String json) {
        Directions directions = new Directions(RideCarActivity.this);
        try {
            List<Route> routes = directions.parse(json);

            if (directionLine != null) directionLine.remove();
            if (routes.size() > 0) {
                directionLine = gMap.addPolyline((new PolylineOptions())
                        .addAll(routes.get(0).getOverviewPolyLine())
                        .color(ContextCompat.getColor(RideCarActivity.this, R.color.colorgradient))
                        .width(8));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateDistance(long distance) {
        BottomSheetBehavior behavior = BottomSheetBehavior.from(binding.bottomSheet);
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        binding.detail.setVisibility(View.VISIBLE);
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
        String biaya = String.valueOf(biayaminimum);
        long biayaTotal = (long) 0.0;
//        if (biayaTotal < Double.parseDouble(biayaminimum)) {
//            this.harga = Long.parseLong(biayaminimum);
//            biayaTotal = Long.parseLong(biayaminimum);
//            Utility.currencyTXT(cost, biaya, this);
//        } else {
//            Utility.currencyTXT(cost, getbiaya, this);
//        }

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
            binding.llcheckedcash.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String totalbiaya = String.valueOf(finalBiayaTotal - promocode);
                    Utility.currencyTXT(binding.price, totalbiaya, context);
                    String diskontotal = String.valueOf(promocode);
                    Utility.currencyTXT(binding.diskon, diskontotal, RideCarActivity.this);
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
                    String diskontotal = String.valueOf(promocode);
                    String totalbiaya = String.valueOf(finalBiayaTotal - promocode);
                    Utility.currencyTXT(binding.price, totalbiaya, context);
                    Utility.currencyTXT(binding.diskon, diskontotal, RideCarActivity.this);

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
//                param.setPakaiWallet(1);
                sendRequestTransaksi(param, driverAvailable, 1, 60000, "0");
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
                sendRequestTransaksi(param, driverAvailable, 1, 60000, "0");
            }
        }
    }

    private void sendRequestTransaksi(RideCarRequestJson param, final List<DriverModel> driverList, double distance, int timer, String id_transaskis) {
        binding.rlprogress.setVisibility(View.VISIBLE);
        param.setMax_distance(distance);
        param.setPakaiWallet(0);
        param.setId_transaski(id_transaskis);
        binding.textprogress.setText(getString(R.string.waiting_desc));
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        Log.d("distance", "sendRequestTransaksi: RideCar " + distance);
        Log.d("transaski", "sendRequestTransaksi: " + id_transaskis);
        String email = loginUser.getEmail();
        String pass = loginUser.getPassword();
        String token = loginUser.getToken();
        final BookService service = ServiceGenerator.createService(BookService.class, email, pass,token);

        service.requestTransaksi(param).enqueue(new Callback<RideCarResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<RideCarResponseJson> call, @NonNull Response<RideCarResponseJson> response) {
                Log.d("distance_response", "sendRequestTransaksi: RideCar " + distance);
                if (response.isSuccessful()) {
                    Log.d("fcm_timer = 0", "onResponse: " + timer);
                    buildDriverRequest(Objects.requireNonNull(response.body()), timer);
                    driverAvailable = Objects.requireNonNull(response.body()).getDriver();
                    transaction_id = response.body().getData().get(0).getId();
                    if (driverAvailable.size() == 0) {
                        Log.d("fcm_timer = 0.5", "onResponse: " + timer);
                        notif("Sorry, there are no drivers " + distance + "m around you. Will search again now for " + (distance + distance) + "m from you.");
                        binding.rlprogress.setVisibility(View.GONE);
                        if (distance < 2) {
                            sendRequestTransaksi(param, driverAvailable, (distance + distance), 120000, response.body().getData().get(0).getId());
                        } else {
                            binding.rlprogress.setVisibility(View.GONE);
                            notif("Sorry, there are no drivers around you.");
                        }

                    } else {
                        thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                if(driverRegIds.size()!=0){
                                    driverRegIds.clear();
                                }

                                driverRegIds.add(driverAvailable.get(0).getRegId());

                                fcmBroadcast(driverRegIds, email, pass,token);

                                try {
                                    Thread.sleep(timer);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                if (threadRun) {

                                    CheckStatusTransaksiRequest param1 = new CheckStatusTransaksiRequest();
                                    param1.setIdTransaksi(transaksi.getId());
                                    service.checkStatusTransaksi(param1).enqueue(new Callback<CheckStatusTransaksiResponse>() {
                                        @Override
                                        public void onResponse(@NonNull Call<CheckStatusTransaksiResponse> call, @NonNull Response<CheckStatusTransaksiResponse> response) {
                                            if (response.isSuccessful()) {
                                                CheckStatusTransaksiResponse checkStatus = response.body();
                                                if (!Objects.requireNonNull(checkStatus).isStatus()) {
                                                    if (distance < 2) {
                                                        sendRequestTransaksi(param, driverAvailable, (distance + distance), 120000, transaksi.getId());
                                                    } else {
                                                        binding.rlprogress.setVisibility(View.GONE);
                                                        notif("Sorry, there are no drivers around you.");
                                                    }

                                                    if (repeat >= 1) {
                                                        NoRideFound(transaksi.getId());
                                                    }

                                                    runOnUiThread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            notif("Sorry, there are no drivers around you in "+distance+"km.");
                                                        }
                                                    });
                                                    repeat++;
                                                    Log.d("repeatvalue", String.valueOf(repeat));
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
                                                    binding.rlprogress.setVisibility(View.GONE);
                                                    notif("Driver Not Found.");
                                                }
                                            });
//                                            new Handler().postDelayed(new Runnable() {
//                                                public void run() {
//                                                    finish();
//                                                }
//                                            }, 3000);
                                        }
                                    });
                                } else {
                                    binding.rlprogress.setVisibility(View.GONE);
                                }
                            }
                        });
                        thread.start();
                    }
                } else {
                    Log.d("distance_failure", "sendRequestTransaksi: RideCar " + distance);
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

    private void NoRideFound(String id) {
        threadRun=false;
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        final BookService service = ServiceGenerator.createService(BookService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
        CheckStatusTransaksiRequest param = new CheckStatusTransaksiRequest();
        param.setIdTransaksi(id);
        service.noridefound(param).enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<ResponseJson> call, @NonNull Response<ResponseJson> response) {
                if (response.isSuccessful()) {
                    ResponseJson checkStatus = response.body();
                    if (!Objects.requireNonNull(checkStatus).getMessage().matches("success")) {

                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseJson> call, @NonNull Throwable t) {

            }
        });
    }


    private void buildDriverRequest(RideCarResponseJson response, int timer) {
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
            request.setNotif_timer(timer);
        }else{
            request.setNotif_timer(timer);
        }
    }

    private void fcmBroadcast(ArrayList<String> reg_id, String noTelepon, String password,String token) {
        request.setTime_accept(new Date().getTime() + "");
        final FCMMessage message = new FCMMessage();
        message.setTo(reg_id);
        message.setData(request);

        Log.e("REQUEST TO DRIVER", message.getData().toString());

        Log.e("REQUEST TO DRIVER", message.getData().toString());

        UserService service = ServiceGenerator.createService(UserService.class, noTelepon, password,token);

        service.sendFcmNotif(message).enqueue(new Callback<FCMResponseJson>() {
            @Override
            public void onResponse(Call<FCMResponseJson> call, Response<FCMResponseJson> response) {
                notif("Your driver is getting notified.");
                threadRun=true;
            }

            @Override
            public void onFailure(Call<FCMResponseJson> call, Throwable t) {

            }
        });

//        FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(new okhttp3.Callback() {
//            @Override
//            public void onResponse(@NonNull okhttp3.Call call, @NonNull okhttp3.Response response) {
//                Log.e("REQUEST TO DRIVER", message.getData().toString());
//            }
//
//            @Override
//            public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {
//                e.printStackTrace();
//            }
//        });
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
                            Intent intent = new Intent(RideCarActivity.this, ProgressActivity.class);
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

    @Override
    public void onBackPressed() {
        if(threadRun){
            new CustomDialogYesNo()
                    .setBtnTextYes("Yes")
                    .setBtnTextNo("No")
                    .setMessage("Are you sure you want to cancel your current ride??")
                    .setTitle("Wait")
                    .showYesNoDialog(this, new CustomDialogYesNo.dialogOnClickListener() {
                        @Override
                        public void onClick() {
                            cancelOrder("Ride reequest cancled by user.");
                        }

                        @Override
                        public void onClose() {

                        }
                    });
        }else {
            super.onBackPressed();
        }
    }

    private void cancelOrder(String cancel_reason) {
        binding.rlprogress.setVisibility(View.VISIBLE);
        User loginUser = BaseApp.getInstance(RideCarActivity.this).getLoginUser();
        CancelBookRequestJson requestcancel = new CancelBookRequestJson();
        requestcancel.id = loginUser.getId();
        requestcancel.id_transaksi = transaction_id;
        requestcancel.id_driver = cancel_reason;

        BookService service = ServiceGenerator.createService(BookService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
        service.cancelOrder(requestcancel).enqueue(new Callback<CancelBookResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<CancelBookResponseJson> call, @NonNull Response<CancelBookResponseJson> response) {
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).mesage.equals("canceled")) {
                        binding.rlprogress.setVisibility(View.GONE);
                        fcmcancel();
                        fcmcancelmerchant();
                        notif("Order Canceled!");
                        finish();
                    } else {
                        binding.rlprogress.setVisibility(View.GONE);
                        notif(response.body().mesage);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<CancelBookResponseJson> call, @NonNull Throwable t) {
                t.printStackTrace();
            }
        });


    }

    private void fcmcancel() {
        DriverResponse response = new DriverResponse();
        response.type = ORDER;
        response.setIdTransaksi(transaction_id);
        response.setResponse(DriverResponse.REJECT);

        FCMMessage message = new FCMMessage();
        message.setTo(driverRegIds);
        message.setData(response);


        FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(new okhttp3.Callback() {
            @Override
            public void onResponse(@NonNull okhttp3.Call call, @NonNull okhttp3.Response response) {
            }

            @Override
            public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void fcmcancelmerchant() {
        DriverResponse response = new DriverResponse();
        response.type = ORDER;
        response.setIdTransaksi(transaction_id);
        response.setResponse(String.valueOf(Constants.CANCEL));

        FCMMessage message = new FCMMessage();
        message.setTo(driverRegIds);
        message.setData(response);


        FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(new okhttp3.Callback() {
            @Override
            public void onResponse(@NonNull okhttp3.Call call, @NonNull okhttp3.Response response) {
            }

            @Override
            public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {
                e.printStackTrace();
            }
        });
    }

}
