package com.ourdevelops.ourjek.activity.forgot_password;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;


import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.databinding.ActivityLupapasswordBinding;
import com.ourdevelops.ourjek.activity.forgot_password.verify_forgot_password.VerifyForgotPasswordInterface;
import com.ourdevelops.ourjek.json.LoginRequestJson;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;
import com.ourdevelops.ourjek.json.LoginResponseJson;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LupapassActivity extends AppCompatActivity implements VerifyForgotPasswordInterface {
    private ActivityLupapasswordBinding binding;
//    private String otp;
//    private User user;
    private String phone;

    String disableback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityLupapasswordBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        disableback = "false";

        binding.backBtnVerify.setOnClickListener(v -> finish());

        binding.buttonconfirm.setOnClickListener(v -> {
            if (Objects.requireNonNull(binding.phone.getText()).toString().isEmpty()) {
                notif(getString(R.string.phoneempty));
            } else {
                phone = "977"+binding.phone.getText().toString();
                get();
            }
        });
    }

//    private void openBSFrag(){
//        VerifyForgotPasswordBSFragment verifyForgotPasswordBSFragment = new VerifyForgotPasswordBSFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString("otp", otp);
//        bundle.putSerializable("user", user);
//        verifyForgotPasswordBSFragment.setInterface(LupapassActivity.this);
//        verifyForgotPasswordBSFragment.setArguments(bundle);
//        verifyForgotPasswordBSFragment.show(getSupportFragmentManager(), verifyForgotPasswordBSFragment.getTag());
//    }

    private void get() {
        progressshow();
        LoginRequestJson request = new LoginRequestJson();
        request.setNoTelepon(phone);

        UserService service = ServiceGenerator.createService(UserService.class, request.getNoTelepon(), "12345","766037");
        service.forgot(request).enqueue(new Callback<LoginResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponseJson> call, @NonNull Response<LoginResponseJson> response) {
                progresshide();
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("found")) {
                        notif("Verification code sent!");
                        Log.d("otp", "onResponse: "+response.body().getOtp());
                        startActivity(new Intent(LupapassActivity.this, VerifyForgotPasswordActivity.class).putExtra("number", response.body().getData().get(0).getOtp()).putExtra("otp", response.body().getOtp()).putExtra("old-pass", response.body().getData().get(0).getPassword()));
//                        openBSFrag();
                    } else {
                        notif(("Phonenumber Not Registered"));
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<LoginResponseJson> call, @NonNull Throwable t) {
                progresshide();
                t.printStackTrace();
                notif(t.getLocalizedMessage());
            }
        });
    }

    public void progressshow() {
        binding.rlprogress.setVisibility(View.VISIBLE);
        disableback = "true";
    }

    public void progresshide() {
        binding.rlprogress.setVisibility(View.GONE);
        disableback = "false";
    }

    @Override
    public void onBackPressed() {
        if (!disableback.equals("true")) {
            finish();
        }
    }

    public void notif(String text) {
        binding.rlnotif2.setVisibility(View.VISIBLE);
        binding.textnotif2.setText(text);

        new Handler().postDelayed(() -> binding.rlnotif2.setVisibility(View.GONE), 3000);
    }

    @Override
    public void onStartProgress() {
        progressshow();
    }

    @Override
    public void onStopProgress() {
        progresshide();
    }
}
