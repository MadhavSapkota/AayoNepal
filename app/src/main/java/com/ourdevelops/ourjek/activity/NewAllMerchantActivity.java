package com.ourdevelops.ourjek.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.tabs.TabLayout;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityNewAllMerchantBinding;
import com.ourdevelops.ourjek.item.AllMerchantNearItem;
import com.ourdevelops.ourjek.json.AllMerchantByNearResponseJson;
import com.ourdevelops.ourjek.json.AllMerchantbyCatRequestJson;
import com.ourdevelops.ourjek.json.SearchMerchantbyCatRequestJson;
import com.ourdevelops.ourjek.json.cart.LocationJson;
import com.ourdevelops.ourjek.models.CatMerchantModel;
import com.ourdevelops.ourjek.models.MerchantNearModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.RestaurantAdapter;
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class NewAllMerchantActivity extends AppCompatActivity {
    private ActivityNewAllMerchantBinding binding;

    AllMerchantNearItem merchantNearItem;
    List<MerchantNearModel> clicknear;
    RestaurantAdapter adapter;

    int fiturId;
    private Location mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityNewAllMerchantBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        fiturId = intent.getIntExtra("FiturKey", -1);

        binding.address.setSelected(true);

        binding.Goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        progressshow();

        FusedLocationProviderClient mFusedLocation = LocationServices.getFusedLocationProviderClient(this);
        mFusedLocation.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(final Location location) {
                if (location != null) {
                    mLocation = location;
                    LatLng centerPos = new LatLng(location.getLatitude(), location.getLongitude());
                    requestAddress(centerPos, binding.address);
                    getdata(location);
                }
            }
        });
    }

    private void progressshow() {
        binding.viewPager.setVisibility(View.GONE);
//        binding.rlprogress.setVisibility(View.VISIBLE);
    }

    private void progresshide() {
//        binding.rlprogress.setVisibility(View.GONE);
        binding.viewPager.setVisibility(View.VISIBLE);
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

    private void setViewPager(List<CatMerchantModel> kategori){
        for(int i=0; i<kategori.size(); i++){
            binding.tabLayout.addTab(binding.tabLayout.newTab().setText(kategori.get(i).getNama_kategori()));
        }
        adapter = new RestaurantAdapter(NewAllMerchantActivity.this, getSupportFragmentManager(),
                binding.tabLayout.getTabCount(), kategori, mLocation.getLatitude(), mLocation.getLongitude());
        binding.viewPager.setAdapter(adapter);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout));

        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    private void getdata(final Location location) {
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        UserService userService = ServiceGenerator.createService(
                UserService.class, loginUser.getNoTelepon(), loginUser.getPassword(),loginUser.getToken());
        AllMerchantbyCatRequestJson param = new AllMerchantbyCatRequestJson();
        param.setId(loginUser.getId());
        param.setLat(String.valueOf(location.getLatitude()));
        param.setLon(String.valueOf(location.getLongitude()));
        param.setPhone(loginUser.getNoTelepon());
        param.setFitur_id("21");
        userService.allmerchant(param).enqueue(new Callback<AllMerchantByNearResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<AllMerchantByNearResponseJson> call, @NonNull Response<AllMerchantByNearResponseJson> response) {
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {


                        if (response.body().getData().isEmpty()) {

                        } else {
                            progresshide();
                            setViewPager(response.body().getKategori());
                        }
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<AllMerchantByNearResponseJson> call, @NonNull Throwable t) {

            }
        });
    }

    private void searchmerchant(final Location location, String like) {
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        UserService userService = ServiceGenerator.createService(
                UserService.class, loginUser.getNoTelepon(), loginUser.getPassword(),loginUser.getToken());
        SearchMerchantbyCatRequestJson param = new SearchMerchantbyCatRequestJson();
        param.setId(loginUser.getId());
        param.setLat(String.valueOf(location.getLatitude()));
        param.setLon(String.valueOf(location.getLongitude()));
        param.setPhone(loginUser.getNoTelepon());
        param.setFitur("21");
        param.setLike(like);
        userService.searchmerchant(param).enqueue(new Callback<AllMerchantByNearResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<AllMerchantByNearResponseJson> call, @NonNull Response<AllMerchantByNearResponseJson> response) {
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {
                        clicknear = response.body().getData();
                        setViewPager(response.body().getKategori());
                        if (response.body().getData().isEmpty()) {
                        } else {
                            merchantNearItem = new AllMerchantNearItem(NewAllMerchantActivity.this, clicknear, R.layout.item_merchant_list, "21");
                        }
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<AllMerchantByNearResponseJson> call, @NonNull Throwable t) {

            }
        });
    }

    public void onCartClicked(View view) {
        LocationJson locationJson = new LocationJson();
        locationJson.setLat(mLocation.getLatitude());
        locationJson.setLongitude(mLocation.getLongitude());
        locationJson.setName(binding.address.getText().toString());
        startActivity(new Intent(this, NewDetailOrderActivity.class).putExtra(Constants.CURRENTLOACTION,locationJson));
    }
}
