package com.ourdevelops.ourjek.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.landing.MainActivity;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityCreditcardBinding;
import com.ourdevelops.ourjek.json.TopupRequestJson;
import com.ourdevelops.ourjek.json.TopupResponseJson;
import com.ourdevelops.ourjek.json.fcm.FCMMessage;
import com.ourdevelops.ourjek.models.Notif;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.NetworkUtils;
import com.ourdevelops.ourjek.utils.api.FCMHelper;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreditcardActivity extends AppCompatActivity {
    private ActivityCreditcardBinding binding;

    private String current = "", currentname = "XXXXX XXXXXXX";
    String a, disableback, price;
    int keyDel;

    public static final String VISA_PREFIX = "4";
    public static final String MASTERCARD_PREFIX = "51,52,53,54,55,";
    public static final String DISCOVER_PREFIX = "6011";
    public static final String DISCOVER2_PREFIX = "65";
    public static final String DINERS_PREFIX = "300,301,302,303,304,305,";
    public static final String DINERSS_PREFIX = "36,38,";
    public static final String JCB_PREFIX = "2131,1800,";
    public static final String JCBS_PREFIX = "35";
    public static final String AMEX_PREFIX = "34,37,";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityCreditcardBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        Intent i = getIntent();
        price = i.getStringExtra("price");

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        disableback = "false";

        final String ddmmyyyy = "MMYY";
        final Calendar cal = Calendar.getInstance();

        binding.expdate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @SuppressLint("DefaultLocale")
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().equals(current)) {
                    String clean = s.toString().replaceAll("[^\\d.]|\\.", "");
                    String cleanC = current.replaceAll("[^\\d.]|\\.", "");

                    int cl = clean.length();
                    int sel = cl;
                    for (int i = 2; i <= cl && i < 6; i += 2) {
                        sel++;
                    }
                    if (clean.equals(cleanC)) sel--;

                    if (clean.length() < 5) {
                        clean = clean + ddmmyyyy.substring(clean.length());
                    } else {
                        int mon = Integer.parseInt(clean.substring(2, 4));
                        int year = Integer.parseInt(clean.substring(2, 4));

                        mon = mon < 1 ? 1 : Math.min(mon, 12);
                        cal.set(Calendar.MONTH, mon - 1);
                        year = (year < 1900) ? 1900 : Math.min(year, 2100);
                        cal.set(Calendar.YEAR, year);

                        clean = String.format("%02d%02d", mon, year);
                    }
                    clean = String.format("%s/%s", clean.substring(0, 2), clean.substring(2, 4), clean.substring(2, 4));

                    sel = Math.max(sel, 0);
                    current = clean;
                    binding.expdate.setText(current);
                    binding.expdate.setSelection(Math.min(sel, current.length()));

                    binding.expdate.setText(current);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.holdername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().equals(currentname)) {
                    binding.holdernametext.setText(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.cardnumber.addTextChangedListener(new TextWatcher() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean flag = true;
                String[] eachBlock = binding.cardnumber.getText().toString().split("-");
                for (String value : eachBlock) {
                    if (value.length() > 4) {
                        flag = false;
                    }
                }
                if (flag) {

                    binding.cardnumber.setOnKeyListener(new View.OnKeyListener() {

                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {

                            if (keyCode == KeyEvent.KEYCODE_DEL)
                                keyDel = 1;
                            return false;
                        }
                    });

                    if (keyDel == 0) {

                        if (((binding.cardnumber.getText().length() + 1) % 5) == 0) {

                            if (s.toString().split("-").length <= 3) {
                                binding.cardnumber.setText(binding.cardnumber.getText() + "-");
                                binding.cardnumber.setSelection(binding.cardnumber.getText().length());
                                if (s.toString().substring(0, 1).equals(VISA_PREFIX) && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.visa_logo));
                                } else if (MASTERCARD_PREFIX.contains(s.toString().substring(0, 2) + ",") && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.mastercard));
                                } else if (s.toString().substring(0, 4).equals(DISCOVER_PREFIX) && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.discover));
                                } else if (s.toString().substring(0, 2).equals(DISCOVER2_PREFIX) && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.discover));
                                } else if (DINERS_PREFIX.contains(s.toString().substring(0, 3) + ",") && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.diners_club));
                                } else if (DINERSS_PREFIX.contains(s.toString().substring(0, 2) + ",") && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.diners_club));
                                } else if (JCB_PREFIX.contains(s.toString().substring(0, 4) + ",") && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.jcb));
                                } else if (s.toString().substring(0, 2).equals(JCBS_PREFIX) && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.jcb));
                                } else if (AMEX_PREFIX.contains(s.toString().substring(0, 2) + ",") && s.length() >= 1) {
                                    binding.logo.setImageDrawable(getResources().getDrawable(R.drawable.american_express));
                                }

                            }
                        }
                        a = binding.cardnumber.getText().toString();

                    } else {
                        a = binding.cardnumber.getText().toString();
                        keyDel = 0;
                    }


                    binding.cardnumbertext.setText(s.toString());

                } else {
                    binding.cardnumber.setText(a);
                }

                if (s.toString().length() <= 3) {
                    binding.logo.setImageDrawable(getResources().getDrawable(R.color.transparent));
                }

            }


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.cardnumber.getText().toString().isEmpty()) {
                    notif("card number cant be empty!");
                } else if (binding.holdername.getText().toString().isEmpty()) {
                    notif("holder name cant be empty!");
                } else if (binding.expdate.getText().toString().isEmpty()) {
                    notif("exp date cant be empty!");
                } else if (binding.cvc.getText().toString().isEmpty()) {
                    notif("CVC cant be empty!");
                } else {
                    if (NetworkUtils.isConnected(CreditcardActivity.this)) {
                        submit();
                    } else {
                        progresshide();
                        notif(getString(R.string.text_noInternet));
                    }
                }
            }
        });

    }

    private void submit() {
        progressshow();
        final User user = BaseApp.getInstance(this).getLoginUser();
        TopupRequestJson request = new TopupRequestJson();
        request.setId(user.getId());
        request.setName(binding.holdername.getText().toString());
        request.setEmail(user.getEmail());
        request.setCardnum(binding.cardnumber.getText().toString().replaceAll("-", ""));
        request.setCvc(binding.cvc.getText().toString());
        request.setExpired(binding.expdate.getText().toString());
        request.setProduct("topup");
        request.setNumber("1");
        request.setPrice(price);

        UserService service = ServiceGenerator.createService(UserService.class, user.getNoTelepon(), user.getPassword(),user.getToken());
        service.topup(request).enqueue(new Callback<TopupResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<TopupResponseJson> call, @NonNull Response<TopupResponseJson> response) {
                progresshide();
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {
                        Intent intent = new Intent(CreditcardActivity.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();

                        ArrayList<String> reg_id = new ArrayList<>();
                        reg_id.add(user.getToken());

                        Notif notif = new Notif();
                        notif.title = "Topup";
                        notif.message = "topup has been successful";
                        sendNotif(reg_id, notif);

                    } else {
                        notif("there is an error!");
                    }
                } else {
                    notif("error, please check your card data!");
                }
            }

            @Override
            public void onFailure(@NonNull Call<TopupResponseJson> call, @NonNull Throwable t) {
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

    private void sendNotif(final ArrayList<String> regIDTujuan, final Notif notif) {

        final FCMMessage message = new FCMMessage();
        message.setTo(regIDTujuan);
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


}
