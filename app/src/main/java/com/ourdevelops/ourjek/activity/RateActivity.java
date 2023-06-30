package com.ourdevelops.ourjek.activity;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.github.ornolfr.ratingview.RatingView;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityRateBinding;
import com.ourdevelops.ourjek.json.DetailRequestJson;
import com.ourdevelops.ourjek.json.DetailTransResponseJson;
import com.ourdevelops.ourjek.json.RateRequestJson;
import com.ourdevelops.ourjek.json.RateResponseJson;
import com.ourdevelops.ourjek.models.DriverModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.BookService;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RateActivity extends AppCompatActivity {
    private ActivityRateBinding binding;

    String iddriver, idtrans, response, submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityRateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        iddriver = intent.getStringExtra("id_driver");
        idtrans = intent.getStringExtra("id_transaksi");
        response = intent.getStringExtra("response");
        getData(idtrans, iddriver);
        submit = "true";
        shimmeractive();
        removeNotif();
    }

    private void shimmeractive() {
        binding.shimmername.startShimmerAnimation();
    }

    private void shimmernonactive() {
        binding.shimmername.setVisibility(View.GONE);
        binding.image.setVisibility(View.VISIBLE);
        binding.namadriver.setVisibility(View.VISIBLE);
        binding.addComment.setVisibility(View.VISIBLE);
        binding.submit.setVisibility(View.VISIBLE);
        binding.ratingView.setVisibility(View.VISIBLE);
        binding.shimmername.stopShimmerAnimation();
    }

    private void getData(String idtrans, String iddriver) {
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        BookService service = ServiceGenerator.createService(BookService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
        DetailRequestJson param = new DetailRequestJson();
        param.setId(idtrans);
        param.setIdDriver(iddriver);
        service.detailtrans(param).enqueue(new Callback<DetailTransResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<DetailTransResponseJson> call, @NonNull Response<DetailTransResponseJson> response) {
                if (response.isSuccessful()) {
                    DriverModel driver = Objects.requireNonNull(response.body()).getDriver().get(0);
                    parsedata(driver);

                }
            }

            @Override
            public void onFailure(@NonNull retrofit2.Call<DetailTransResponseJson> call, @NonNull Throwable t) {

            }
        });


    }

    private void parsedata(final DriverModel driver) {

        PicassoTrustAll.getInstance(this)
                .load(Constants.IMAGESDRIVER + driver.getFoto())
                .placeholder(R.drawable.image_placeholder)
                .into(binding.image);
        binding.namadriver.setText(driver.getNamaDriver());
        final User userLogin = BaseApp.getInstance(this).getLoginUser();
        binding.ratingView.setRating(0);
        if (submit.equals("true")) {
            binding.submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RateRequestJson request = new RateRequestJson();
                    request.id_transaksi = idtrans;
                    request.id_pelanggan = userLogin.getId();
                    request.id_driver = iddriver;
                    request.rating = String.valueOf(binding.ratingView.getRating());
                    request.catatan = binding.addComment.getText().toString();
                    ratingUser(request);

                }
            });
        }
        shimmernonactive();
    }

    private void ratingUser(RateRequestJson request) {
        submit = "false";
        binding.submit.setText(getString(R.string.waiting_pleaseWait));
        binding.submit.setBackground(getResources().getDrawable(R.drawable.rounded_corners_button));

        User loginUser = BaseApp.getInstance(RateActivity.this).getLoginUser();

        UserService service = ServiceGenerator.createService(UserService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
        service.rateDriver(request).enqueue(new Callback<RateResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<RateResponseJson> call, @NonNull Response<RateResponseJson> response) {
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).mesage.equals("success")) {
//                        Intent i = new Intent(RateActivity.this, MainActivity.class);
//                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(i);


                        finish();
                    }
                }
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onFailure(@NonNull Call<RateResponseJson> call, @NonNull Throwable t) {
                t.printStackTrace();
                submit = "true";
                binding.submit.setText("Submit");
                binding.submit.setBackground(getResources().getDrawable(R.drawable.button_round_1));
            }
        });


    }

    private void removeNotif() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Objects.requireNonNull(notificationManager).cancel(0);
    }


}
