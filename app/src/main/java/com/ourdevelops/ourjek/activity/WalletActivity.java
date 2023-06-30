package com.ourdevelops.ourjek.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.databinding.ActivityWalletBinding;
import com.ourdevelops.ourjek.item.WalletItem;
import com.ourdevelops.ourjek.json.WalletRequestJson;
import com.ourdevelops.ourjek.json.WalletResponseJson;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.Objects;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WalletActivity extends AppCompatActivity {
    private ActivityWalletBinding binding;
    WalletItem walletItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityWalletBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.recycle.setHasFixedSize(true);
        binding.recycle.setLayoutManager(new GridLayoutManager(this, 1));

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

//        getdatawallet();

    }

    private void shimmershow() {
        binding.recycle.setVisibility(View.GONE);
        binding.rlprogress.setVisibility(View.VISIBLE);
    }

    private void shimmertutup() {
        binding.recycle.setVisibility(View.VISIBLE);
        binding.rlprogress.setVisibility(View.GONE);
    }

    private void getdatawallet() {
        shimmershow();
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        UserService userService = ServiceGenerator.createService(
                UserService.class, loginUser.getNoTelepon(), loginUser.getPassword(),loginUser.getToken());
        WalletRequestJson param = new WalletRequestJson();
        param.setId(loginUser.getId());
        userService.wallet(param).enqueue(new Callback<WalletResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<WalletResponseJson> call, @NonNull Response<WalletResponseJson> response) {
                if (response.isSuccessful()) {
                    shimmertutup();
                    walletItem = new WalletItem(WalletActivity.this, Objects.requireNonNull(response.body()).getData(), R.layout.item_wallet);
                    binding.recycle.setAdapter(walletItem);
                    if (response.body().getData().isEmpty()) {
                        binding.recycle.setVisibility(View.GONE);
                        binding.rlnodata.setVisibility(View.VISIBLE);
                    } else {
                        binding.recycle.setVisibility(View.VISIBLE);
                        binding.rlnodata.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<WalletResponseJson> call, @NonNull Throwable t) {

            }
        });
    }
}
