package com.ourdevelops.ourjek.activity;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.landing.MainActivity;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.databinding.ActivityChangepasswordBinding;
import com.ourdevelops.ourjek.fragment.EnableLocationFragment;
import com.ourdevelops.ourjek.json.ChangePassRequestJson;
import com.ourdevelops.ourjek.json.LoginResponseJson;
import com.ourdevelops.ourjek.models.FirebaseToken;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.ExtensionsKt;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.Objects;

import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ChangepassActivity extends AppCompatActivity {
    private ActivityChangepasswordBinding binding;
    Boolean isFromVerifyForgotPassword = false;
    String phNumber, oldpass;

    String disableback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityChangepasswordBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        getIntentData();

        disableback = "false";
        Log.d("asdfgh", "onCreate: " + isFromVerifyForgotPassword.toString());

        if (isFromVerifyForgotPassword) {
            Log.d("asdfgh", "onCreate: " + isFromVerifyForgotPassword.toString());
            binding.oldPasswordWrapper.setVisibility(View.GONE);
        }

        binding.backBtnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.buttonconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFromVerifyForgotPassword) {
                    if(validate()){
                        get(oldpass, phNumber);
                    }else{
                        notif("Incorrect confirmation password entered.");
                    }
                } else {
                    if (validate()) {
                        get();
                    }
                }
            }
        });
    }

    private boolean validate(){
        boolean isValid = true;

        if(!isFromVerifyForgotPassword) {
            if (binding.password.getText().toString().isEmpty()) {
                isValid = false;
                binding.passwordtil.setErrorEnabled(true);
                binding.passwordtil.setError(getString(R.string.password_required));
                ExtensionsKt.setErrorEnabledBackground(binding.password);
            } else if (binding.password.getText().toString().length() < 6) {
                isValid = false;
                binding.passwordtil.setErrorEnabled(true);
                binding.passwordtil.setError(getString(R.string.password_6));
                ExtensionsKt.setErrorEnabledBackground(binding.password);
            } else {
                binding.passwordtil.setErrorEnabled(false);
                binding.passwordtil.setError(null);
                ExtensionsKt.clearErrorEnabledBackground(binding.password);
            }
        }

        if(binding.newpassword.getText().toString().isEmpty()){
            isValid = false;
            binding.newpasswordTil.setErrorEnabled(true);
            binding.newpasswordTil.setError(getString(R.string.password_required));
            ExtensionsKt.setErrorEnabledBackground(binding.newpassword);
        }else if(binding.newpassword.getText().toString().length() < 6){
            isValid = false;
            binding.newpasswordTil.setErrorEnabled(true);
            binding.newpasswordTil.setError(getString(R.string.password_6));
            ExtensionsKt.setErrorEnabledBackground(binding.newpassword);
        }else{
            binding.newpasswordTil.setErrorEnabled(false);
            binding.newpasswordTil.setError(null);
            ExtensionsKt.clearErrorEnabledBackground(binding.newpassword);
        }

        if(binding.cnewpassword.getText().toString().isEmpty()){
            isValid = false;
            binding.cnewpasswordTil.setErrorEnabled(true);
            binding.cnewpasswordTil.setError(getString(R.string.password_required));
            ExtensionsKt.setErrorEnabledBackground(binding.cnewpassword);
        }else if(binding.cnewpassword.getText().toString().length() < 6){
            isValid = false;
            binding.cnewpasswordTil.setErrorEnabled(true);
            binding.cnewpasswordTil.setError(getString(R.string.password_6));
            ExtensionsKt.setErrorEnabledBackground(binding.cnewpassword);
        }else if(!binding.cnewpassword.getText().toString().equals(binding.newpassword.getText().toString())){
            isValid = false;
            binding.cnewpasswordTil.setErrorEnabled(true);
            binding.cnewpasswordTil.setError(getString(R.string.password_match));
            ExtensionsKt.setErrorEnabledBackground(binding.cnewpassword);
        }
        else{
            binding.cnewpasswordTil.setErrorEnabled(false);
            binding.cnewpasswordTil.setError(null);
            ExtensionsKt.clearErrorEnabledBackground(binding.cnewpassword);
        }

        return  isValid;
    }

    private void getIntentData() {
        Log.d("getintent", "getIntentData: " + getIntent());
        if (getIntent().hasExtra("number")) {
            isFromVerifyForgotPassword = true;
            phNumber = getIntent().getStringExtra("number");
            oldpass = getIntent().getStringExtra("oldpass");
        }
    }

    private void get() {
        progressshow();
        ChangePassRequestJson request = new ChangePassRequestJson();
        User loginuser = BaseApp.getInstance(ChangepassActivity.this).getLoginUser();
        request.setNotelepon(loginuser.getNoTelepon());
        request.setPassword(binding.password.getText().toString());
        request.setNewPassword(binding.newpassword.getText().toString());

        UserService service = ServiceGenerator.createService(UserService.class, request.getNotelepon(), request.getPassword(),"");
        service.changepass(request).enqueue(new Callback<LoginResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponseJson> call, @NonNull Response<LoginResponseJson> response) {
                progresshide();
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("found")) {
//                        User user = response.body().getData().get(0);
//                        saveUser(user);
                        finish();
                    } else {
                        notif(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<LoginResponseJson> call, @NonNull Throwable t) {
                progresshide();
                t.printStackTrace();
                notif("error");
            }
        });
    }

    private void get(String oldpass, String number) {
        progressshow();
        ChangePassRequestJson request = new ChangePassRequestJson();
        request.setNotelepon(number);
        request.setPassword(binding.password.getText().toString());
        request.setNewPassword(binding.newpassword.getText().toString());

        UserService service = ServiceGenerator.createService(UserService.class, request.getNotelepon(), request.getPassword(),"");
        service.forgotChangePassword(request).enqueue(new Callback<LoginResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponseJson> call, @NonNull Response<LoginResponseJson> response) {
                progresshide();
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("found")) {
//                        User user = response.body().getData().get(0);
//                        saveUser(user);
                        checkLocationEnabled();
                    } else {
                        notif(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<LoginResponseJson> call, @NonNull Throwable t) {
                progresshide();
                t.printStackTrace();
                notif("error");
            }
        });
    }

    private void checkLocationEnabled() {
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            startActivity(new Intent(this, MainActivity.class));
        } else {
            startActivity(new Intent(this, EnableLocationFragment.class));
        }
        finishAffinity();
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

        new Handler().postDelayed(new Runnable() {
            public void run() {
                binding.rlnotif2.setVisibility(View.GONE);
            }
        }, 3000);
    }

    private void saveUser(User user) {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.delete(User.class);
        realm.copyToRealm(user);
        realm.commitTransaction();
        BaseApp.getInstance(ChangepassActivity.this).setLoginUser(user);
    }

    @SuppressWarnings("unused")
    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onMessageEvent(FirebaseToken response) {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.delete(FirebaseToken.class);
        realm.copyToRealm(response);
        realm.commitTransaction();
    }
}
