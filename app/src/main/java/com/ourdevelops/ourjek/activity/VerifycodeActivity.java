package com.ourdevelops.ourjek.activity;

import static com.ourdevelops.ourjek.constants.ConstantFunctionsKt.showLongToast;
import static com.ourdevelops.ourjek.constants.ConstantFunctionsKt.showShortToast;
import static com.ourdevelops.ourjek.utils.ExtensionsKt.hideProgressDialog;
import static com.ourdevelops.ourjek.utils.ExtensionsKt.showProgressDialog;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.landing.MainActivity;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.databinding.ActivityVerifycodeBinding;
import com.ourdevelops.ourjek.json.LoginResponseJson;
import com.ourdevelops.ourjek.models.ResendToken;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.concurrent.TimeUnit;

import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VerifycodeActivity extends AppCompatActivity implements View.OnKeyListener, View.OnFocusChangeListener, TextWatcher {
    private static final String TAG = "VerifycodeActivity";
    private ActivityVerifycodeBinding binding;

    LoginResponseJson loginresponse;
    String phoneNumber;
    int responseOTP;
    User user;
    String[] otp = new String[6];
    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityVerifycodeBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        if (getIntent() != null) {
            getIntentData();
        }

        binding.backBtnVerify.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        });

        binding.number.setText(phoneNumber);
        binding.resendCodeIn.setVisibility(View.VISIBLE);
        binding.resendCode.setVisibility(View.GONE);

        binding.resendCode.setOnClickListener(v -> resendToken());
        setTimer();
        binding.one.requestFocus();
        binding.one.addTextChangedListener(this);
        binding.one.setOnKeyListener(this);
        binding.one.setOnFocusChangeListener(this);
        binding.two.addTextChangedListener(this);
        binding.two.setOnKeyListener(this);
        binding.two.setOnFocusChangeListener(this);
        binding.three.addTextChangedListener(this);
        binding.three.setOnKeyListener(this);
        binding.three.setOnFocusChangeListener(this);
        binding.four.addTextChangedListener(this);
        binding.four.setOnKeyListener(this);
        binding.four.setOnFocusChangeListener(this);
        binding.five.addTextChangedListener(this);
        binding.five.setOnKeyListener(this);
        binding.five.setOnFocusChangeListener(this);
        binding.six.addTextChangedListener(this);
        binding.six.setOnKeyListener(this);
        binding.six.setOnFocusChangeListener(this);
    }

    private void setTimer() {
        timer = new CountDownTimer(TimeUnit.MINUTES.toMillis(2), TimeUnit.SECONDS.toMillis(1)) {
            @Override
            public void onTick(long millisUntilFinished) {
                binding.resendCodeIn.setText(getFormattedTime(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                binding.resendCodeIn.setVisibility(View.GONE);
                binding.resendCode.setVisibility(View.VISIBLE);
            }
        }.start();
    }

    private String getFormattedTime(Long milliseconds) {
        int seconds = (int) (milliseconds / 1000 % 60);

        int minutes = (int) (milliseconds / (1000 * 60) % 60);
        return getString(R.string.resend_code_in, String.valueOf(minutes), String.valueOf(seconds));
    }

    private void getIntentData() {
        responseOTP = getIntent().getIntExtra("loginresponse", 0);
        user = (User) getIntent().getSerializableExtra("user");
        phoneNumber = getIntent().getStringExtra("phonenumber");
        Log.i(TAG, "OTP IS: " + responseOTP);
    }

    private void resendToken() {
        showProgressDialog(this);
        UserService userService = ServiceGenerator.createService(
                UserService.class, user.getNoTelepon(), user.getPassword(),user.getToken());
        ResendToken param = new ResendToken();
        param.setNo_telephone(phoneNumber.replace("+", ""));
        userService.resenttokenresponse(param).enqueue(new Callback<LoginResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponseJson> call, @NonNull Response<LoginResponseJson> response) {
                hideProgressDialog();
                loginresponse = response.body();
                if (loginresponse != null) {
                    responseOTP = loginresponse.getOtp();
                    if (loginresponse.getMessage() != null)
                        showLongToast(VerifycodeActivity.this, loginresponse.getMessage());
                }
            }

            @Override
            public void onFailure(@NonNull Call<LoginResponseJson> call, @NonNull Throwable t) {
                hideProgressDialog();
            }
        });
    }

    private String getOtp() {
        StringBuilder otpSb = new StringBuilder();
        for (String i : this.otp) {
            otpSb.append(i);
        }
        int i = (int) TimeUnit.MINUTES.toMillis(10);
        return otpSb.toString();
    }

    public void verifyCode() {
        String otp = getOtp();
        if (otp.length() == 6) {
            showProgressDialog(this);
            if (getOtp().equalsIgnoreCase(String.valueOf(responseOTP))) {
                hideProgressDialog();
                saveUser(user);
                Intent intent = new Intent(VerifycodeActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            } else {
                hideProgressDialog();
                showLongToast(VerifycodeActivity.this, "verification code doesn't match!");
            }
        } else {
            showLongToast(VerifycodeActivity.this, "Invalid verification code!");
        }

    }

    private void saveUser(User user) {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.delete(User.class);
        realm.copyToRealm(user);
        realm.commitTransaction();
        BaseApp.getInstance(VerifycodeActivity.this).setLoginUser(user);
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        Log.e(TAG, "onKey: called");
        if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_DEL) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) v;
            Editable editable = ((AppCompatEditText) v).getText();
            if (editable != null && editable.toString().isEmpty()) {
                appCompatEditText.setText(null);
            }
        }
        return false;
    }

    @Override
    protected void onStop() {
        super.onStop();
        timer.cancel();
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (v.hasFocus()) {
            v.setBackgroundResource(R.drawable.rectangle_red_border_8dp);
        } else {
            v.setBackgroundResource(R.drawable.rectangle_gray_8dp);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String value = s.toString();
        if (binding.one.hasFocus()) {
            otp[0] = value;
            if (value.length() > 1) {
                Editable editableOne = binding.one.getText();
                Editable editableTwo = binding.two.getText();
                char valueOne = value.toCharArray()[0];
                char valueTwo = value.toCharArray()[1];
                otp[0] = String.valueOf(valueOne);
                otp[1] = String.valueOf(valueTwo);
                if (editableOne != null) {
                    editableOne.clear();
                    editableOne.append(valueOne);
                }
                if (editableTwo != null) {
                    editableTwo.clear();
                    editableTwo.append(valueTwo);
                }
                binding.three.requestFocus();
            } else if (!value.isEmpty()) {
                binding.two.requestFocus();
            }
        } else if (binding.two.hasFocus()) {
            otp[1] = value;
            if (value.length() > 1) {
                Editable editableOne = binding.two.getText();
                Editable editableTwo = binding.three.getText();
                char valueOne = value.toCharArray()[0];
                char valueTwo = value.toCharArray()[1];
                otp[1] = String.valueOf(valueOne);
                otp[2] = String.valueOf(valueTwo);
                if (editableOne != null) {
                    editableOne.clear();
                    editableOne.append(valueOne);
                }
                if (editableTwo != null) {
                    editableTwo.clear();
                    editableTwo.append(valueTwo);
                }
                binding.four.requestFocus();
            } else if (start == 0 && before == 0 && count == 0)
                binding.one.requestFocus();
            else if (!value.isEmpty())
                binding.three.requestFocus();
        } else if (binding.three.hasFocus()) {
            otp[2] = value;
            if (value.length() > 1) {
                Editable editableOne = binding.three.getText();
                Editable editableTwo = binding.four.getText();
                char valueOne = value.toCharArray()[0];
                char valueTwo = value.toCharArray()[1];
                otp[2] = String.valueOf(valueOne);
                otp[3] = String.valueOf(valueTwo);
                if (editableOne != null) {
                    editableOne.clear();
                    editableOne.append(valueOne);
                }
                if (editableTwo != null) {
                    editableTwo.clear();
                    editableTwo.append(valueTwo);
                }
                binding.five.requestFocus();
            } else if (start == 0 && before == 0 && count == 0)
                binding.two.requestFocus();
            else if (!value.isEmpty())
                binding.four.requestFocus();
        } else if (binding.four.hasFocus()) {
            otp[3] = value;
            if (value.length() > 1) {
                Editable editableOne = binding.four.getText();
                Editable editableTwo = binding.five.getText();
                char valueOne = value.toCharArray()[0];
                char valueTwo = value.toCharArray()[1];
                otp[3] = String.valueOf(valueOne);
                otp[4] = String.valueOf(valueTwo);
                if (editableOne != null) {
                    editableOne.clear();
                    editableOne.append(valueOne);
                }
                if (editableTwo != null) {
                    editableTwo.clear();
                    editableTwo.append(valueTwo);
                }
                binding.six.requestFocus();
            } else if (start == 0 && before == 0 && count == 0)
                binding.three.requestFocus();
            else if (!value.isEmpty())
                binding.five.requestFocus();
        } else if (binding.five.hasFocus()) {
            otp[4] = value;
            if (value.length() > 1) {
                Editable editableOne = binding.five.getText();
                Editable editableTwo = binding.six.getText();
                char valueOne = value.toCharArray()[0];
                char valueTwo = value.toCharArray()[1];
                otp[4] = String.valueOf(valueOne);
                otp[5] = String.valueOf(valueTwo);
                if (editableOne != null) {
                    editableOne.clear();
                    editableOne.append(valueOne);
                }
                if (editableTwo != null) {
                    editableTwo.clear();
                    editableTwo.append(valueTwo);
                }
                binding.six.requestFocus();
            } else if (start == 0 && before == 0 && count == 0)
                binding.four.requestFocus();
            else if (!value.isEmpty())
                binding.six.requestFocus();
        } else if (binding.six.hasFocus()) {
            otp[5] = value;
            if (start == 0 && before == 0 && count == 0)
                binding.five.requestFocus();
            else if (!value.isEmpty())
                verifyCode();
        }
    }

    @Override
    public void afterTextChanged(Editable s) {}
}