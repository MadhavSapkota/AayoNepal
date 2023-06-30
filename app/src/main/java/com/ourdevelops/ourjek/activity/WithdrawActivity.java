package com.ourdevelops.ourjek.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.landing.MainActivity;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityWithdrawBinding;
import com.ourdevelops.ourjek.item.BankItem;
import com.ourdevelops.ourjek.json.BankResponseJson;
import com.ourdevelops.ourjek.json.ResponseJson;
import com.ourdevelops.ourjek.json.WithdrawRequestJson;
import com.ourdevelops.ourjek.json.fcm.FCMMessage;
import com.ourdevelops.ourjek.models.Notif;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.SettingPreference;
import com.ourdevelops.ourjek.utils.Utility;
import com.ourdevelops.ourjek.utils.api.FCMHelper;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import androidx.recyclerview.widget.GridLayoutManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WithdrawActivity extends AppCompatActivity {
    private ActivityWithdrawBinding binding;

    String disableback, type, nominal;
    SettingPreference sp;
    BankItem bankItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityWithdrawBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        disableback = "false";

        sp = new SettingPreference(this);

        Intent intent = getIntent();
        type = intent.getStringExtra("type");

        if (Objects.equals(type, "topup")) {
            binding.imagebackground.setImageResource(R.drawable.atm);
            binding.imagebackground.setScaleType(ImageView.ScaleType.FIT_XY);
            nominal = intent.getStringExtra("nominal");

            Utility.currencyTXT(binding.amount, Objects.requireNonNull(nominal), WithdrawActivity.this);
            binding.petunjuk.setHasFixedSize(true);
            binding.petunjuk.setNestedScrollingEnabled(false);
            binding.petunjuk.setLayoutManager(new GridLayoutManager(this, 1));
            getpetunjuk();
        }

        binding.amount.addTextChangedListener(Utility.currencyTW(binding.amount, this));

        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User userLogin = BaseApp.getInstance(WithdrawActivity.this).getLoginUser();
                if (type.equals("withdraw")) {
                    if (binding.amount.getText().toString().isEmpty()) {
                        notif("amount cant be empty!");
                    } else if (Long.parseLong(binding.amount.getText()
                            .toString()
                            .replace(".", "")
                            .replace(",", "")
                            .replace(sp.getSetting()[0], "")) > userLogin.getSaldoAsLong()) {
                        notif("your balance is no enought!");
                    } else if (binding.bank.getText().toString().isEmpty()) {
                        notif("bank cant be empty!");
                    } else if (binding.accnumber.getText().toString().isEmpty()) {
                        notif("account number cant be empty!");
                    } else {
                        submit();
                    }
                } else {
                    if (binding.amount.getText().toString().isEmpty()) {
                        notif("amount cant be empty!");
                    } else if (binding.bank.getText().toString().isEmpty()) {
                        notif("bank cant be empty!");
                    } else if (binding.accnumber.getText().toString().isEmpty()) {
                        notif("account number cant be empty!");
                    } else {
                        submit();
                    }
                }
            }
        });

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void submit() {
        progressshow();
        final User user = BaseApp.getInstance(this).getLoginUser();
        WithdrawRequestJson request = new WithdrawRequestJson();
        request.setId(user.getId());
        request.setBank(binding.bank.getText().toString());
        request.setName(binding.namanumber.getText().toString());
        request.setAmount(binding.amount.getText().toString().replace(".", "").replace(sp.getSetting()[0], ""));
        request.setCard(binding.accnumber.getText().toString());
        request.setNotelepon(user.getNoTelepon());
        request.setEmail(user.getEmail());
        request.setType(type);

        UserService service = ServiceGenerator.createService(UserService.class, user.getNoTelepon(), user.getPassword(),user.getToken());
        service.withdraw(request).enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<ResponseJson> call, @NonNull Response<ResponseJson> response) {
                progresshide();
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {
                        Intent intent = new Intent(WithdrawActivity.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();

                        Notif notif = new Notif();
                        if (type.equals("withdraw")) {
                            notif.title = "Withdraw";
                            notif.message = "Withdrawal requests have been successful, we will send a notification after we have sent funds to your account";
                        } else {
                            notif.title = "Topup";
                            notif.message = "Topup requests have been successful, we will send a notification after we confirm";
                        }
                        sendNotif(user.getToken(), notif);

                    } else {
                        notif("error, please check your account data!");
                    }
                } else {
                    notif("error!");
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseJson> call, @NonNull Throwable t) {
                progresshide();
                t.printStackTrace();
                notif("error");
            }
        });
    }

    public void onBackPressed() {
        if (!disableback.equals("true")) {
            finish();
        }
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

    public void progressshow() {
        binding.rlprogress.setVisibility(View.VISIBLE);
        disableback = "true";
    }

    public void progresshide() {
        binding.rlprogress.setVisibility(View.GONE);
        disableback = "false";
    }

    private void sendNotif(final String regIDTujuan, final Notif notif) {

        final FCMMessage message = new FCMMessage();
        ArrayList<String> reg_id = new ArrayList<>();
        reg_id.add(regIDTujuan);

        message.setTo(reg_id);
        message.setData(notif);

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

    private void getpetunjuk() {
        User user = BaseApp.getInstance(this).getLoginUser();
        WithdrawRequestJson request = new WithdrawRequestJson();

        UserService service = ServiceGenerator.createService(UserService.class, user.getNoTelepon(), user.getPassword(),user.getToken());
        service.listbank(request).enqueue(new Callback<BankResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<BankResponseJson> call, @NonNull Response<BankResponseJson> response) {
                if (response.isSuccessful()) {
                    binding.llpentunjuk.setVisibility(View.VISIBLE);
                    bankItem = new BankItem(WithdrawActivity.this, Objects.requireNonNull(response.body()).getData(), R.layout.item_bank);
                    binding.petunjuk.setAdapter(bankItem);
                }
            }

            @Override
            public void onFailure(@NonNull Call<BankResponseJson> call, @NonNull Throwable t) {
                t.printStackTrace();
            }
        });
    }


}
