package com.ourdevelops.ourjek.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.tabs.TabLayout;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity;
import com.ourdevelops.ourjek.activity.dialogefragment.MerchantFoodtimelineDialoge;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.constants.IntentKeys;
import com.ourdevelops.ourjek.constants.ServiceChargeVatTextGenerator;
import com.ourdevelops.ourjek.databinding.ActivityNewDetailMerchantBinding;
import com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck;
import com.ourdevelops.ourjek.json.MerchantByIdResponseJson;
import com.ourdevelops.ourjek.json.MerchantbyIdRequestJson;
import com.ourdevelops.ourjek.json.cart.LocationJson;
import com.ourdevelops.ourjek.models.CatItemModel;
import com.ourdevelops.ourjek.models.Daymodel;
import com.ourdevelops.ourjek.models.ItemModel;
import com.ourdevelops.ourjek.models.PesananMerchant;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.AppLogger;
import com.ourdevelops.ourjek.utils.RestaurantMenuAdapter;
import com.ourdevelops.ourjek.utils.Utility;
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import io.realm.Realm;
import io.realm.RealmResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewDetailMerchantActivity extends AppCompatActivity implements MenuFragCartIconCheck {
    private ActivityNewDetailMerchantBinding binding;
    String id, resume, alamat, tutupki, idresto, alamatresto, merchant_id, fiturkey, item_id, category_id;
    double merlat, merlon, distance;
    int idfitur;
    private RestaurantMenuAdapter adapter;
    private Realm realm;
    private ArrayList<Daymodel> daysList = new ArrayList<>();
    private MenuFragCartIconCheck menufrag = this;
    private ToolbarState state = ToolbarState.EXPANDED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        binding = ActivityNewDetailMerchantBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        realm = Realm.getDefaultInstance();

        getIntentData();

        resume = "0";

        buttonClicks();


        requestAddress();
        getdata();

        shimmershow();

    }

    private void getIntentData() {
        fiturkey = getIntent().getStringExtra(IntentKeys.filter);
        id = getIntent().getStringExtra(IntentKeys.id);
        merchant_id = getIntent().getStringExtra(IntentKeys.merchantId);
        item_id = getIntent().getStringExtra(IntentKeys.itemId);
        category_id = getIntent().getStringExtra(IntentKeys.categoryId);
    }

    private void buttonClicks() {
        binding.backBtn.setOnClickListener(v -> onBackPressed());

        binding.btnCart.setOnClickListener(view -> {
            LocationJson locationJson = new LocationJson();
            locationJson.setLat(Constants.LATITUDE);
            locationJson.setLongitude(Constants.LONGITUDE);
            locationJson.setName(Constants.LOCATION);
            startActivity(new Intent(this, NewDetailOrderActivity.class).putExtra(Constants.CURRENTLOACTION, locationJson).putExtra("fitur", fiturkey));
        });

        binding.appBarLayout.addOnOffsetChangedListener((appBarLayout, verticalOffset) -> {
            AppLogger.INSTANCE.log("this is offset " + verticalOffset);
            if (verticalOffset == 0) {
                if (state != ToolbarState.EXPANDED) {
                    binding.tvToolbarTitle.setVisibility(View.GONE);
                }
                state = ToolbarState.EXPANDED;
            } else if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()) {
                if (state != ToolbarState.COLLAPSED) {
                    binding.tvToolbarTitle.setVisibility(View.VISIBLE);
                }
                state = ToolbarState.COLLAPSED;
            } else {
                state = ToolbarState.IDLE;
            }
        });

    }


    private void requestAddress() {
        LatLng latlang = new LatLng(Constants.LATITUDE, Constants.LONGITUDE);
        if (latlang != null) {
            MapDirectionAPI.getAddress(latlang).enqueue(new okhttp3.Callback() {
                @Override
                public void onFailure(@NonNull okhttp3.Call call, @NonNull IOException e) {

                }

                @Override
                public void onResponse(@NonNull okhttp3.Call call, @NonNull final okhttp3.Response response) throws IOException {
                    if (response.isSuccessful()) {
                        final String json = Objects.requireNonNull(response.body()).string();
                        runOnUiThread(() -> {
                            try {
                                JSONObject Jobject = new JSONObject(json);
                                JSONArray Jarray = Jobject.getJSONArray("results");
                                JSONObject userdata = Jarray.getJSONObject(0);
                                alamat = userdata.getString("formatted_address");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        });
                    }
                }
            });
        }
    }

    public void notif(String text) {
        binding.textnotif.setVisibility(View.VISIBLE);
        binding.textnotif.setText(text);

        new Handler().postDelayed(() -> binding.textnotif.setVisibility(View.GONE), 3000);
    }

    private void shimmershow() {
        binding.rlprogress.setVisibility(View.VISIBLE);
    }

    private void shimmertutup() {
        binding.lldetail.setVisibility(View.VISIBLE);
        binding.rlprogress.setVisibility(View.GONE);
        binding.viewPager.setVisibility(View.VISIBLE);
    }

    private void setViewPager(List<CatItemModel> kategori) {
        int pos = 0;
        for (int i = 0; i < kategori.size(); i++) {
            binding.tabLayout.addTab(binding.tabLayout.newTab().setText(kategori.get(i).getNama_kategori()));
            if(kategori.get(i).getId_kategori_item().equals(category_id)){
                pos = i;
            }
        }
        adapter = new RestaurantMenuAdapter(NewDetailMerchantActivity.this, getSupportFragmentManager(),
                binding.tabLayout.getTabCount(), kategori, Constants.LATITUDE.toString(), Constants.LONGITUDE.toString(),
                id, merchant_id, menufrag, item_id, fiturkey);
        binding.viewPager.setAdapter(adapter);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout));

        binding.viewPager.setCurrentItem(pos, true);

        binding.hours.setOnClickListener(view -> {
            MerchantFoodtimelineDialoge dilaogeFragment = MerchantFoodtimelineDialoge.newInstance(daysList);
//    dilaogeFragment.onOkayClickedListener(qty -> {
//        dilaogeFragment.dismiss();
//    });
            dilaogeFragment.show(getSupportFragmentManager(), "show");
        });


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


    private void getdata() {
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        UserService userService = ServiceGenerator.createService(
                UserService.class, loginUser.getNoTelepon(), loginUser.getPassword(),loginUser.getToken());
        MerchantbyIdRequestJson param = new MerchantbyIdRequestJson();
        param.setId(id);
        param.setLat(String.valueOf(Constants.LATITUDE));
        param.setLon(String.valueOf(Constants.LONGITUDE));
        param.setPhone(loginUser.getNoTelepon());
        userService.merchantbyid(param).enqueue(new Callback<MerchantByIdResponseJson>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(@NonNull Call<MerchantByIdResponseJson> call, @NonNull final Response<MerchantByIdResponseJson> response) {
                if (response.isSuccessful()) {
                    daysList.clear();
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {
                        shimmertutup();

                        if (response.body().getFotomerchant() != null) {
                            Glide.with(getApplicationContext())
                                    .load(response.body().getFotomerchant())
                                    .into(binding.image);
                        }

                        try {
                            daysList.add(new Daymodel("Sunday", response.body().getSun_open() + " - " + response.body().getSun_close()));
                            daysList.add(new Daymodel("Monday", response.body().getMon_open() + " - " + response.body().getMon_close()));
                            daysList.add(new Daymodel("Tuesday", response.body().getTue_open() + " - " + response.body().getTue_close()));
                            daysList.add(new Daymodel("Wednesday", response.body().getWed_open() + " - " + response.body().getWed_close()));
                            daysList.add(new Daymodel("Thursday", response.body().getThu_open() + " - " + response.body().getThu_close()));
                            daysList.add(new Daymodel("Friday", response.body().getFri_open() + " - " + response.body().getFri_close()));
                            daysList.add(new Daymodel("Saturday", response.body().getSat_open() + " - " + response.body().getSat_close() != null ? response.body().getSat_close() : "00"));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        merlat = Double.parseDouble(response.body().getLatmerchant());
                        merlon = Double.parseDouble(response.body().getLongmerchant());
                        idfitur = Integer.parseInt(response.body().getIdfitur());
                        idresto = response.body().getIdmerchant();
                        alamatresto = response.body().getAlamatmerchant();

                        float km = Float.parseFloat(response.body().getDistance());
                        String format = String.format(Locale.US, "%.1f", km);

                        distance = Double.parseDouble(format);

                        String[] parsedJamBuka = response.body().getBukamerchant().split(":");
                        String[] parsedJamTutup = response.body().getTutupmerchant().split(":");

                        int jamBuka = Integer.parseInt(parsedJamBuka[0]), menitBuka = Integer.parseInt(parsedJamBuka[1]);
                        int jamTutup = Integer.parseInt(parsedJamTutup[0]), menitTutup = Integer.parseInt(parsedJamTutup[1]);

                        int totalMenitBuka = (jamBuka * 60) + menitBuka;
                        int totalMenitTutup = (jamTutup * 60) + menitTutup;

                        Calendar now = Calendar.getInstance();
                        int totalMenitNow = (now.get(Calendar.HOUR_OF_DAY) * 60) + now.get(Calendar.MINUTE);

                        if (totalMenitNow <= totalMenitTutup && totalMenitNow >= totalMenitBuka) {
                            binding.tutup.setVisibility(View.GONE);
                            tutupki = "0";
                        } else {
                            binding.tutup.setVisibility(View.VISIBLE);
                            tutupki = "1";
                        }

                        binding.tvServiceChargeVat.setText(ServiceChargeVatTextGenerator.INSTANCE.getServiceChargeVatText(response.body().getVat(), response.body().getServiceCharge()));

                        binding.nama.setText(response.body().getNamamerchant());
                        binding.btnMap.setOnClickListener(v -> {
                            Intent i = new Intent(NewDetailMerchantActivity.this, MapsMerchantActivity.class);
                            i.putExtra("lat", Constants.LATITUDE);
                            i.putExtra("lon", Constants.LONGITUDE);
                            i.putExtra("name", response.body().getNamamerchant());
                            startActivity(i);
                        });
                        binding.hours.setText("Open Hours: " + Objects.requireNonNull(response.body()).getBukamerchant() + "-" + response.body().getTutupmerchant());
                        binding.kategoridistance.setText(response.body().getKategorimerchant());
                        binding.tvMerchantLocation.setText(response.body().getAlamatmerchant() + " - " + distance + "Km");
                        binding.tvToolbarTitle.setText(response.body().getNamamerchant());
                        if (response.body().getDescmerchant().isEmpty()) {
                            binding.layoutMerchantDescription.setVisibility(View.GONE);
                        } else {
                            binding.tvAboutMerchant.setText(response.body().getDescmerchant());
                        }
                        if (response.body().getPromo().equals("1")) {
                            binding.promoMerchant.setVisibility(View.VISIBLE);
                            binding.layoutPartnerMerchant.setVisibility(View.VISIBLE);
                        } else {
                            binding.promoMerchant.setVisibility(View.GONE);
                            binding.layoutPartnerMerchant.setVisibility(View.GONE);
                        }

                        if (response.body().getPartner() != null && !response.body().getPartner().isEmpty() && response.body().getPartner().equals("1")) {
                            binding.layoutPartnerMerchant.setVisibility(View.VISIBLE);
                            binding.partnerMerchant.setVisibility(View.VISIBLE);
                        } else {
                            binding.layoutPartnerMerchant.setVisibility(View.GONE);
                            binding.partnerMerchant.setVisibility(View.GONE);
                        }
                        resume = "1";

                        Realm realm = BaseApp.getInstance(NewDetailMerchantActivity.this).getRealmInstance();
                        realm.beginTransaction();
                        realm.delete(ItemModel.class);
                        realm.copyToRealm(response.body().getData());
                        realm.commitTransaction();

                        setViewPager(response.body().getKategori());
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<MerchantByIdResponseJson> call, @NonNull Throwable t) {

            }
        });
    }

    private void DeletePesanan() {
        RealmResults<PesananMerchant> deleteFood = realm.where(PesananMerchant.class).findAll();
        realm.beginTransaction();
        deleteFood.deleteAllFromRealm();
        realm.commitTransaction();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        DeletePesanan();
        realm.close();
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.btnCart.checkCart();
        calculatePrice();
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    public void calculatePrice() {
        List<PesananMerchant> existingFood = realm.where(PesananMerchant.class).findAll();

        int quantity = 0;
        long cost = 0;
        for (int p = 0; p < existingFood.size(); p++) {
            quantity += Objects.requireNonNull(existingFood.get(p)).getQty();
            cost += Objects.requireNonNull(existingFood.get(p)).getTotalHarga();
        }

        if (quantity > 0) {
//            pricecountainer.setVisibility(View.VISIBLE);
            binding.priceContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tutupki.equals("0")) {
//                        Intent i = new Intent(DetailMerchantActivity.this, DetailOrderActivity.class); // old code
                        Intent i = new Intent(NewDetailMerchantActivity.this, NewDetailOrderActivity.class);
                        i.putExtra("lat", Constants.LATITUDE);
                        i.putExtra("lon", Constants.LONGITUDE);
                        i.putExtra("merlat", merlat);
                        i.putExtra("merlon", merlon);
                        i.putExtra("alamat", alamat);
                        i.putExtra("FiturKey", idfitur);
                        i.putExtra("distance", distance);
                        i.putExtra("alamatresto", alamatresto);
                        i.putExtra("idresto", idresto);
                        i.putExtra("namamerchant", binding.nama.getText().toString());
                        i.putExtra("hour", binding.hours.getText().toString());
                        i.putExtra("category", binding.kategoridistance.getText().toString());
                        i.putExtra("fitur", fiturkey);
                        startActivity(i);
                    } else {
                        notif("merchant are closing!");
                    }
                }
            });

        } else {
            binding.priceContainer.setVisibility(View.GONE);
        }

        binding.qtyText.setText("" + quantity + " Item");
        Utility.currencyTXT(binding.costText, String.valueOf(cost), this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if (requestCode == 2) {
            calculatePrice();
            //do the things u wanted
        }
    }

    @Override
    public void showAddedToCart() {
        Log.d("showCart", "showAddedToCart: ");
        onResume();
    }
}

enum ToolbarState {
    EXPANDED,
    COLLAPSED,
    IDLE
}