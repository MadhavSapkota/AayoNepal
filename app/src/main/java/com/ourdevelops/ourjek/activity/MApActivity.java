package com.ourdevelops.ourjek.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.maps.android.data.geojson.GeoJsonLayer;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.landing.MainActivity;
import com.ourdevelops.ourjek.databinding.ActivityMapBinding;
import com.ourdevelops.ourjek.utils.PrefsManager;
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MApActivity extends AppCompatActivity
        implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private ActivityMapBinding binding;

    private static final String TAG = "MApActivity";
    private static final int REQUEST_PERMISSION_LOCATION = 991;

    private GoogleMap gMap;
    private GoogleApiClient googleApiClient;
    private Marker pickUpMarker;
    private Marker destinationMarker;
    private String value;
    private boolean isMapReady = false;
    private Location lastKnownLocation;
    private GeoJsonLayer layer;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (getIntent().getExtras() != null) {
            value = getIntent().getStringExtra("value");
        }
        Places.initialize(getApplicationContext(), getString(R.string.google_maps_key));

        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), getString(R.string.google_maps_key));
        }

        if (value.matches("to")) {
            binding.destinationContainer.setVisibility(View.VISIBLE);
            binding.pickUpContainer.setVisibility(View.GONE);
        }
        if (value.matches("from")) {
            binding.pickUpContainer.setVisibility(View.VISIBLE);
        }


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

        binding.pickUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.pickUpContainer.setVisibility(View.VISIBLE);
                binding.destinationContainer.setVisibility(View.GONE);
                openAutocompleteActivity(1);
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapView);
        Objects.requireNonNull(mapFragment).getMapAsync(this);

        if (googleApiClient == null) {
            googleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }
        findViewById(R.id.back_btn).setOnClickListener(v -> onBackPressed());
        binding.btnConfirm.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        });
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERMISSION_LOCATION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
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

//        try {
//            layer = new GeoJsonLayer(gMap, R.raw.valley, getApplicationContext());
//            GeoJsonPolygonStyle geoJsonPolygonStyle = layer.getDefaultPolygonStyle();
//            int colorTransparent = ColorUtils.setAlphaComponent(getResources().getColor(android.R.color.transparent), 100);
//            geoJsonPolygonStyle.setStrokeColor(android.R.color.holo_blue_bright);
//            geoJsonPolygonStyle.setFillColor(colorTransparent);
//            layer.addLayerToMap();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

        isMapReady = true;
        updateLastLocation(true);
        Circle circle = gMap.addCircle(new CircleOptions()
                .center(new LatLng(27.667503772646, 85.35000536469697))
                .radius(15000)
                .strokeColor(Color.TRANSPARENT));

    }


    private void onDestination() {
        if (destinationMarker != null) destinationMarker.remove();
        LatLng centerPos = gMap.getCameraPosition().target;
        Log.d("value of lat", String.valueOf(centerPos.latitude));
        destinationMarker = gMap.addMarker(new MarkerOptions()
                .position(centerPos)
                .title("Destination")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.destination)));
        if(isMarkerOutsideCircle(new LatLng(27.667503772646, 85.35000536469697),centerPos,15000)) {
            binding.llShowDetail.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(),"Out of Sevice Area. Please Change Location",Toast.LENGTH_SHORT).show();
        }else {
            requestAddress(centerPos);
        }
    }

    private void onPickUp() {
        if (pickUpMarker != null) pickUpMarker.remove();
        LatLng centerPos = gMap.getCameraPosition().target;
        pickUpMarker = gMap.addMarker(new MarkerOptions()
                .position(centerPos)
                .title("Pick Up")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pickup)));
        if(isMarkerOutsideCircle(new LatLng(27.667503772646, 85.35000536469697),centerPos,15000)) {
            binding.llShowDetail.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(),"Out of Sevice Area. Please Change Location",Toast.LENGTH_SHORT).show();
        }else {
            requestAddress(centerPos);
        }
    }

    private boolean isMarkerOutsideCircle(LatLng centerLatLng, LatLng draggedLatLng, double radius) {
        float[] distances = new float[1];
        Location.distanceBetween(centerLatLng.latitude,
                centerLatLng.longitude,
                draggedLatLng.latitude,
                draggedLatLng.longitude, distances);
        return radius < distances[0];

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    private void requestAddress(LatLng latlang) {
        progressshow();
        if (latlang != null) {
            MapDirectionAPI.getAddress(latlang).enqueue(new okhttp3.Callback() {
                @Override
                public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {
                    progresshide();
                }

                @Override
                public void onResponse(@NonNull okhttp3.Call call, @NonNull final okhttp3.Response response) throws IOException {
                    if (response.isSuccessful()) {
                        gMap.setPadding(100, 100, 100, 100 + 100);

                        final String json = Objects.requireNonNull(response.body()).string();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                progresshide();
                                try {
                                    binding.llShowDetail.setVisibility(View.VISIBLE);
                                    JSONObject Jobject = new JSONObject(json);
                                    JSONArray Jarray = Jobject.getJSONArray("results");
//                                    for(int i=0;i<Jarray.length();i++){
//                                        Log.d("valueofi", String.valueOf(Jarray.getJSONObject(i)));
//                                    }
                                    JSONObject userdata = Jarray.getJSONObject(1);
                                    String address = userdata.getString("formatted_address");
                                    if (value.matches("from")) {
                                        binding.tvPlaceName.setText(address);
                                        new PrefsManager(getApplicationContext()).setPlace(address);
                                        new PrefsManager(getApplicationContext()).setLatitude(String.valueOf(latlang.latitude));
                                        new PrefsManager(getApplicationContext()).setLongitude(String.valueOf(latlang.longitude));
                                    }
                                    if (value.matches("to")) {
                                        binding.tvPlaceName.setText(address);
                                        new PrefsManager(getApplicationContext()).setPlace2(address);
                                        new PrefsManager(getApplicationContext()).setLatitude2(String.valueOf(latlang.latitude));
                                        new PrefsManager(getApplicationContext()).setLongitude2(String.valueOf(latlang.longitude));

                                    }
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

        }
    }


    @Override
    protected void onStart() {
        googleApiClient.connect();
        super.onStart();

    }

    @Override
    protected void onStop() {
        googleApiClient.disconnect();
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void progressshow() {
        binding.rlprogress.setVisibility(View.VISIBLE);
    }

    public void progresshide() {
        binding.rlprogress.setVisibility(View.GONE);
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
        if (value.matches("from")) {
            if (resultCode == RESULT_OK) {
                binding.llShowDetail.setVisibility(View.VISIBLE);
                Place place = Autocomplete.getPlaceFromIntent(data);
                binding.pickUpText.setText(place.getAddress());
                binding.tvPlaceName.setText(place.getAddress());
                new PrefsManager(getApplicationContext()).setPlace(place.getAddress());
                new PrefsManager(getApplicationContext()).setLatitude(String.valueOf(place.getLatLng().latitude));
                new PrefsManager(getApplicationContext()).setLongitude(String.valueOf(place.getLatLng().latitude));
                LatLng latLng = place.getLatLng();
                if (latLng != null) {
                    gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                            new LatLng(latLng.latitude, latLng.longitude), 15f)
                    );
//                    onPickUp();
                }
            } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                Status status = Autocomplete.getStatusFromIntent(data);
                Log.i(TAG, Objects.requireNonNull(status.getStatusMessage()));
            }
        }
        if (value.matches("to")) {
            if (resultCode == RESULT_OK) {
                binding.llShowDetail.setVisibility(View.VISIBLE);
                Place place = Autocomplete.getPlaceFromIntent(data);
                binding.pickUpText.setText(place.getAddress());
                binding.tvPlaceName.setText(place.getAddress());
                new PrefsManager(getApplicationContext()).setPlace2(place.getAddress());
                new PrefsManager(getApplicationContext()).setLatitude2(String.valueOf(place.getLatLng().latitude));
                new PrefsManager(getApplicationContext()).setLongitude2(String.valueOf(place.getLatLng().longitude));
                LatLng latLng = place.getLatLng();
                if (latLng != null) {
                    gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                            new LatLng(latLng.latitude, latLng.longitude), 15f)
                    );
//                    onDestination();
                }
            } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                Status status = Autocomplete.getStatusFromIntent(data);
                Log.i(TAG, Objects.requireNonNull(status.getStatusMessage()));
            }
        }
    }


}

