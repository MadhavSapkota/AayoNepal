package com.ourdevelops.ourjek.activity.cart;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import com.github.florent37.singledateandtimepicker.dialog.SingleDateAndTimePickerDialog;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.FastItemAdapter;
import com.mikepenz.fastadapter.listeners.ClickEventHook;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.IncreaseDecreaseDilaogeFragment;
import com.ourdevelops.ourjek.activity.landing.MainActivity;
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity;
import com.ourdevelops.ourjek.activity.PicklocationActivity;
import com.ourdevelops.ourjek.activity.TopupSaldoActivity;
import com.ourdevelops.ourjek.activity.cart.checkout.CheckoutActivity;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.constants.IntentKeys;
import com.ourdevelops.ourjek.databinding.ActivityDetailOrderBinding;
import com.ourdevelops.ourjek.item.CartRecyclerViewAdapter;
import com.ourdevelops.ourjek.item.ItemItem;
import com.ourdevelops.ourjek.item.NewItemItem;
import com.ourdevelops.ourjek.json.PromoRequestJson;
import com.ourdevelops.ourjek.json.PromoResponseJson;
import com.ourdevelops.ourjek.json.cart.LocationJson;
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse;
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum;
import com.ourdevelops.ourjek.models.CartPriceWrapper;
import com.ourdevelops.ourjek.models.DriverModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.CartPriceCalculator;
import com.ourdevelops.ourjek.utils.ProjectUtils;
import com.ourdevelops.ourjek.utils.SettingPreference;
import com.ourdevelops.ourjek.utils.Utility;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NewDetailOrderActivity extends AppCompatActivity implements CartContractor.View , CartRecyclerViewAdapter.onQuantityChanged{
    private ActivityDetailOrderBinding binding;
    private CartPresenter presenter;
    private double jarak;
    private long harga, promocode;
    public static final String FITUR_KEY = "FiturKey";
    String alamat, fiturKey;
    private CartPriceCalculator cartPriceCalculator = new CartPriceCalculator();
    double lat, lon, merlat, merlon, distance;
    private final int DESTINATION_ID = 1;
    private int deliveryCharge = 0;
    private LatLng pickUpLatLang;
    private LatLng destinationLatLang;
    private FastItemAdapter<NewItemItem> itemAdapter;
    private CartRecyclerViewAdapter cartRecyclerViewAdapter;
    private List<DriverModel> driverAvailable;
    private long foodCostLong = 0;
    private long deliveryCostLong = 0;
    private String saldoWallet, checkedpaycash = "0", idresto, alamatresto, namamerchant, back, hour, category;
    int fitur;
    SettingPreference sp;
    LocationJson currentLocation;
    Datum datum;
    CartResponse cartResponse;
    List<Datum> cartItemsList;
    private String openingHour;
    private String closingHour;
    private CartPriceWrapper priceWrapper = new CartPriceWrapper();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new CartPresenter(getApplicationContext(), this);
        binding = ActivityDetailOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        promocode = 0;
        back = "0";
        cartRecyclerViewAdapter = new CartRecyclerViewAdapter(getApplicationContext());
        cartRecyclerViewAdapter.onQuantityChangeListener(this);
        deliveryCharge = 5000;
        getcartDetails();
        driverAvailable = new ArrayList<>();
        fitur = 0;
        setCashChecked();
        sp = new SettingPreference(this);
        receivingIntents();


        User userLogin = BaseApp.getInstance(this).getLoginUser();
        saldoWallet = String.valueOf(userLogin.getSaldo());
        binding.nama.setText(namamerchant);
        binding.hours.setText(hour);
        pickUpLatLang = new LatLng(merlat, merlon);
        destinationLatLang = new LatLng(lat, lon);


        itemAdapter = new FastItemAdapter<>();
        itemAdapter.notifyDataSetChanged();
        itemAdapter.withSelectable(true);
        itemAdapter.withItemEvent(new ClickEventHook<ItemItem>() {
            @Nullable
            @Override
            public View onBind(@NonNull RecyclerView.ViewHolder viewHolder) {
                if (viewHolder instanceof ItemItem.ViewHolder) {
                    return viewHolder.itemView;
                }
                return null;
            }

            @Override
            public void onClick(View v, int position, FastAdapter<ItemItem> fastAdapter, ItemItem item) {
                //sheetlist(position);
            }
        });
        binding.merchantnear.setLayoutManager(new LinearLayoutManager(this));
        binding.merchantnear.setAdapter(cartRecyclerViewAdapter);

        recyclerViewClicks();
        buttonClicks();
    }

    private void receivingIntents() {
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra(Constants.CURRENTLOACTION) == true) {
                fiturKey = intent.getStringExtra("fitur");
                this.currentLocation = (LocationJson) getIntent().getSerializableExtra(Constants.CURRENTLOACTION);
                if (!currentLocation.equals(null)) {
                    if (!currentLocation.getName().isEmpty()) {
                        binding.deliveryLocationView.setupViews(currentLocation.getName());
                    }
                }
                alamatresto = currentLocation.getName();

            } else {
                lat = intent.getDoubleExtra("lat", 0);
                lon = intent.getDoubleExtra("lon", 0);
                merlat = intent.getDoubleExtra("merlat", 0);
                merlon = intent.getDoubleExtra("merlon", 0);
                distance = intent.getDoubleExtra("distance", 0);
                alamatresto = intent.getStringExtra("alamatresto");
                alamat = intent.getStringExtra("alamat");
                namamerchant = intent.getStringExtra("namamerchant");
                fiturKey = intent.getStringExtra("FiturKey");
                hour = intent.getStringExtra("hour");
                category = intent.getStringExtra("category");
                binding.deliveryLocationView.setupViews(alamat);

            }
        }
    }

    private void recyclerViewClicks() {
        cartRecyclerViewAdapter.onQuantityIncreaseClickedListener((datum, count) -> {
            IncreaseDecreaseDilaogeFragment dilaogeFragment = IncreaseDecreaseDilaogeFragment.newInstance(datum, count);
            dilaogeFragment.onOkayClickedListener(qty -> {
                updateCart(qty, datum);
                dilaogeFragment.dismiss();
            });

            dilaogeFragment.show(getSupportFragmentManager(), "show");
        });

        cartRecyclerViewAdapter.onItemDeleteClickListener(idItem -> {
            deleteCartItem(idItem);
        });
    }

    private void buttonClicks() {

        binding.tvClearCart.setOnClickListener(v -> {
            presenter.deleteAllCarts(cartResponse);
        });

        findViewById(R.id.ll_add_more).setOnClickListener(v -> {
            Intent i = new Intent(NewDetailOrderActivity.this, NewDetailMerchantActivity.class);
            i.putExtra("lat", datum.getLatitudeMerchant());
            i.putExtra("lon", datum.getLongitudeMerchant());
            i.putExtra("id", datum.getIdMerchant());
            i.putExtra("fitur", fiturKey);
            i.putExtra("merchant_id", datum.getIdMerchant());
            this.startActivity(i);
        });

        binding.btnpromo.setOnClickListener(v -> {
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
        });
        binding.hours.setOnClickListener(view -> {

        });

        binding.topUp.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), TopupSaldoActivity.class)));


        binding.deliveryLocationView.setOnClickListener(v -> {
            Intent intent = new Intent(NewDetailOrderActivity.this, PicklocationActivity.class);
            intent.putExtra(PicklocationActivity.FORM_VIEW_INDICATOR, DESTINATION_ID);
            intent.putExtra("fitur", fiturKey);
            startActivityForResult(intent, PicklocationActivity.LOCATION_PICKER_ID);
        });

        binding.order.setOnClickListener(v -> {
            if (readyToOrder()) {
//                sendOrder();
                proceedToCheckout();
            }
        });

        binding.backBtn.setOnClickListener(view -> finish());

        binding.deliveryTimeView.setOnClickListener(v -> {
            timepickmethod();
        });
    }

    private void getcartDetails() {
        binding.layoutContent.setVisibility(View.GONE);
        binding.tvClearCart.setVisibility(View.GONE);
        binding.loader.setVisibility(View.VISIBLE);
        presenter.getCartDetails();
    }

    @Override
    public void onCartDetailsSuccess(@NotNull CartResponse response) {
        binding.tvClearCart.setVisibility(View.VISIBLE);
        binding.loader.setVisibility(View.GONE);
        binding.tvEmptycart.setVisibility(View.GONE);
        binding.layoutContent.setVisibility(View.VISIBLE);
        try {
            cartResponse = response;
            loadcartItems(response.getData());
            cartItemsList = response.getData();
            updateJarak(response.getData().get(0).getLatitudeMerchant(), response.getData().get(0).getLongitudeMerchant());
            setCartPrices();
            alamatresto = response.getData().get(0).getAlamatMerchant();

//            Utility.currencyTXT(binding.tvVat, String.valueOf(response.getVat()), getApplicationContext());
//            Utility.currencyTXT(binding.orderprice, String.valueOf(response.getSub_total()), getApplicationContext());
//            Utility.currencyTXT(binding.price, String.valueOf(getTotalTotal(response)), getApplicationContext());
//            Utility.currencyTXT(binding.tvServicecharge, String.valueOf(response.getServiceCharge()), getApplicationContext());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCartDetailError(@NotNull String errorMessage) {
        binding.tvClearCart.setVisibility(View.GONE);
        binding.loader.setVisibility(View.GONE);
        binding.tvEmptycart.setVisibility(View.VISIBLE);
        binding.layoutContent.setVisibility(View.GONE);
    }

    @SuppressLint("MissingPermission")
    private void updateJarak(String latitudeMerchant, String longitudeMerchant) {
        FusedLocationProviderClient mFusedLocation = LocationServices.getFusedLocationProviderClient(this);
        mFusedLocation.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(final Location location) {
                if (location != null) {
                    destinationLatLang = new LatLng(location.getLatitude(), location.getLongitude());
                    jarak = getKmFromLatLong(destinationLatLang.latitude, destinationLatLang.longitude, Double.parseDouble(latitudeMerchant), Double.parseDouble(longitudeMerchant));
                    if (jarak <= 1) {
//                        binding.cost.setText("Rs 50");
                        deliveryCharge = 5000;
                    } else if (jarak > 1 && jarak <= 5) {
//                        binding.cost.setText("Rs 100");
                        deliveryCharge = 10000;
                    } else {
//                        binding.cost.setText("Rs 120");
                        deliveryCharge = 15000;
                    }
                    Utility.currencyTXT(binding.price, String.valueOf(getTotalTotal(cartResponse)), getApplicationContext());
                }
            }
        });
    }

    private String getTotalTotal(CartResponse cartdata) {
        String totalamount = "0";

        totalamount = String.valueOf(cartdata.getSub_total() + cartdata.getServiceCharge() + cartdata.getVat());

        return totalamount;
    }

    private void loadcartItems(List<Datum> data) {

        try {
            this.datum = data.get(0);
            Glide.with(this)
                    .load(data.get(0).getFotoMerchant())
                    .apply(RequestOptions.placeholderOf(R.drawable.image_placeholder))
                    .into(binding.imgMerchant);
            binding.nama.setText(data.get(0).getNamaMerchant());
            binding.tvMerchantAddress.setText(data.get(0).getAlamatMerchant());
            idresto = data.get(0).getMerchantId();
            binding.hours.setText("Open Hours: " + Objects.requireNonNull(data.get(0)).getJamBuka() + "-" + data.get(0).getJamTutup());

            openingHour = data.get(0).getJamBuka();
            closingHour = data.get(0).getJamTutup();

            Log.d("time", "loadcartItems: "+openingHour+"---"+closingHour);
            fiturKey = data.get(0).getIdFitur();

            cartRecyclerViewAdapter.setCartData(data);
            cartRecyclerViewAdapter.notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void setCashChecked() {
        binding.checkedcash.setSelected(true);
        binding.checkedwallet.setSelected(false);
        binding.cashPayment.setTextColor(getResources().getColor(R.color.colorgradient));
        binding.walletpayment.setTextColor(getResources().getColor(R.color.gray));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            binding.checkedcash.setBackgroundTintList(getResources().getColorStateList(R.color.colorgradient));
            binding.checkedwallet.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
        }
    }

    private void timepickmethod() {
        final long ONE_MINUTE_IN_MILLIS = 60000;//millisecs

        Calendar date = Calendar.getInstance();
        long t = date.getTimeInMillis();
        Date afterAddingfortyfiveMins = new Date(t + (45 * ONE_MINUTE_IN_MILLIS));
        Log.e("lkjjkjhasdoi", String.valueOf(Calendar.getInstance().getTime()));
        new SingleDateAndTimePickerDialog.Builder(NewDetailOrderActivity.this)
//                .bottomSheet()
                .curved()
                .customLocale(Locale.ENGLISH)
                .mainColor(getResources().getColor(R.color.colorPrimary))
//                .minutesStep(5)
                //.displayHours(false)
                //.displayMinutes(false)
                //.todayText("aujourd'hui")
                .displayYears(false)
                .mustBeOnFuture()
                .defaultDate(afterAddingfortyfiveMins)
                .displayListener(new SingleDateAndTimePickerDialog.DisplayListener() {
                    @Override
                    public void onDisplayed(SingleDateAndTimePicker picker) {


                    }
                })
                .title("Delivery Time")
                .listener(new SingleDateAndTimePickerDialog.Listener() {
                    @Override
                    public void onDateSelected(Date date) {
                        Log.d("date", String.valueOf(date));
                        Calendar calendar = Calendar.getInstance();
//                        Date today = calendar.getTime();
                        calendar.add(Calendar.DAY_OF_YEAR, 1);
                        Date tomorrow = calendar.getTime();
                        if (date.before(new Date(t + (44 * ONE_MINUTE_IN_MILLIS)))) {
                            ProjectUtils.showToast(getApplicationContext(), "Minimum delivery time is 45 minutes");
                        } else if (date.after(tomorrow)) {
                            ProjectUtils.showToast(getApplicationContext(), "We are processing for Future Delivery.");
                        } else {
                            SimpleDateFormat simpleDateFormat;
                            simpleDateFormat = new SimpleDateFormat("hh:mm a");
                            binding.deliveryTimeView.setupViews(simpleDateFormat.format(date));
                        }

                    }
                }).display();
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

    private boolean readyToOrder() {
        if (destinationLatLang == null) {
            ProjectUtils.showToast(this, "Please select your location.");
            return false;
        }

        if (binding.price.getText().toString().isEmpty() || binding.price.getText().toString().equals("wait")) {
            ProjectUtils.showToast(this, "Please wait...");
            return false;
        }

        if (jarak == -99.0) {
            ProjectUtils.showToast(this, "Please wait a moment...");
        }

//        if (binding.deliveryTimeView.binding.tvValue.getText().toString().isEmpty()) {
//            ProjectUtils.showToast(this, "Please set delivery time");
//            return false;
//        }

        if (Double.valueOf(binding.price.getText().toString().replace("Rs ", "").replace(",", "")) < 500) {
            ProjectUtils.showToast(this, "Minimum order Should be greater than 500");
            return false;
        }

        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PicklocationActivity.LOCATION_PICKER_ID) {
            if (resultCode == Activity.RESULT_OK) {
                String addressset = data.getStringExtra(PicklocationActivity.LOCATION_NAME);
                LatLng latLng = data.getParcelableExtra(PicklocationActivity.LOCATION_LATLNG);
                binding.deliveryLocationView.setupViews(addressset);
                destinationLatLang = new LatLng(Objects.requireNonNull(latLng).latitude, latLng.longitude);
                jarak = getKmFromLatLong(destinationLatLang.latitude, destinationLatLang.longitude, Double.parseDouble(datum.getLatitudeMerchant()), Double.parseDouble(datum.getLongitudeMerchant()));
                if (jarak < 2) {
//                    binding.cost.setText("Rs 50");
                } else if (jarak > 2 && jarak < 6) {
//                    binding.cost.setText("Rs 100");
                } else {
//                    binding.cost.setText("Rs 120");
                }
                Utility.currencyTXT(binding.price, String.valueOf(getTotalTotal(cartResponse)), getApplicationContext());
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private void promokodedata() {
        binding.btnpromo.setEnabled(false);
        binding.btnpromo.setText("Wait...");
        final User user = BaseApp.getInstance(this).getLoginUser();
        PromoRequestJson request = new PromoRequestJson();
        request.setFitur(String.valueOf(fitur));
        request.setCode(binding.promocode.getText().toString());

        UserService service = ServiceGenerator.createService(UserService.class, user.getNoTelepon(), user.getPassword(),user.getToken());
        service.promocode(request).enqueue(new Callback<PromoResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<PromoResponseJson> call, @NonNull Response<PromoResponseJson> response) {
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {
                        final long finalBiayaTotalpay = foodCostLong + harga;
                        binding.btnpromo.setEnabled(true);
                        binding.btnpromo.setText("Use");
                        if (response.body().getType().equals("persen")) {
                            promocode = (Long.parseLong(response.body().getNominal()) * finalBiayaTotalpay) / 100;
                        } else {
                            promocode = Long.parseLong(response.body().getNominal());
                        }
                    } else {
                        notif("promo code not available!");
                        binding.btnpromo.setEnabled(true);
                        binding.btnpromo.setText("Use");
                        promocode = 0;
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

    double km;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (back.equals("1")) {
            Intent intent = new Intent(NewDetailOrderActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("fitur", fiturKey);
            startActivity(intent);
            finish();
        } else {
            finish();
        }
    }


    public static Double getKmFromLatLong(Double lat1, Double lng1, Double lat2, Double lng2) {
        Location loc1 = new Location("");
        loc1.setLatitude(lat1);
        loc1.setLongitude(lng1);
        Location loc2 = new Location("");
        loc2.setLatitude(lat2);
        loc2.setLongitude(lng2);
        float distanceInMeters = loc1.distanceTo(loc2);
        return Double.valueOf(distanceInMeters / 1000);
    }

    private void updateCart(String qty, Datum datum) {
        presenter.updateCart(qty, datum);
    }

    @Override
    public void onCartUpdated() {
        try {
            getcartDetails();
            cartRecyclerViewAdapter.notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateCart(List<Datum> datum){
        presenter.updateCart(datum);
    }

    @Override
    public void onCartUpdatError(@NotNull String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }

    private void proceedToCheckout() {
        Log.d("checker", "proceedToCheckout: " + alamatresto);
        updateCart(cartItemsList);
        Intent intent = new Intent(this, CheckoutActivity.class);
        intent.putExtra(IntentKeys.PriceWrapper, priceWrapper);
        intent.putExtra(IntentKeys.Object, cartResponse);
        intent.putExtra(IntentKeys.datam, datum);
        intent.putExtra(IntentKeys.alamatresto, alamatresto);
        intent.putExtra(IntentKeys.idresto, idresto);
        intent.putExtra(IntentKeys.promocode, promocode);
        intent.putExtra(IntentKeys.distance, distance);
        intent.putExtra(IntentKeys.price, binding.price.getText().toString());
        intent.putExtra("open", openingHour);
        intent.putExtra("close", closingHour);
        intent.putExtra("fitur", fiturKey);
        startActivity(intent);
    }

    private void deleteCartItem(String idItem) {
        presenter.deleteCartItem(idItem);
    }

    @Override
    public void onCartItemDeleted() {
        getcartDetails();
        cartRecyclerViewAdapter.notifyDataSetChanged();
    }

    @Override
    public void onCartItemDeleteError(@NotNull String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCartCleared() {
        binding.tvClearCart.setVisibility(View.GONE);
        binding.loader.setVisibility(View.GONE);
        binding.tvEmptycart.setVisibility(View.VISIBLE);
        binding.layoutContent.setVisibility(View.GONE);
        finish();
    }

    @Override
    public void onCartClearError(@NotNull String errorMessage) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onAddClick(String qty, int position) {
        cartItemsList.get(position).setQuantity(qty);
        setCartPrices();
    }

    @Override
    public void onMinusClick(String qty, int position) {
        cartItemsList.get(position).setQuantity(qty);
        setCartPrices();
    }


    private void setCartPrices() {
        priceWrapper.setCartValues(cartItemsList);
        Utility.currencyTXT(binding.tvVat, String.valueOf(priceWrapper.getTotalVat()), getApplicationContext());
        Utility.currencyTXT(binding.orderprice, String.valueOf(priceWrapper.getOrderPrice()), getApplicationContext());
        Utility.currencyTXT(binding.tvServicecharge, String.valueOf(priceWrapper.getTotalServiceCharge()), getApplicationContext());
        Utility.currencyTXT(binding.price, String.valueOf(priceWrapper.getTotalPrice()), getApplicationContext());
    }

    @Override
    public void onEmptyCart() {

    }
}
