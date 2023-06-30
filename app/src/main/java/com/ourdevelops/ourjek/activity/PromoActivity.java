package com.ourdevelops.ourjek.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.databinding.ActivityPromoBinding;
import com.ourdevelops.ourjek.item.PromoItem;
import com.ourdevelops.ourjek.json.PromoRequestJson;
import com.ourdevelops.ourjek.json.PromoResponseJson;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.Objects;

public class PromoActivity extends AppCompatActivity {
    private ActivityPromoBinding binding;
    private PromoItem promoItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityPromoBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.inboxlist.setHasFixedSize(true);
        binding.inboxlist.setNestedScrollingEnabled(false);
        binding.inboxlist.setLayoutManager(new GridLayoutManager(this, 1));
        binding.backBtn.setOnClickListener(v -> finish());
        getData();
    }

    private void shimmershow() {
        binding.rlnodata.setVisibility(View.GONE);
        binding.inboxlist.setVisibility(View.GONE);
        binding.rlprogress.setVisibility(View.VISIBLE);
    }

    private void shimmertutup() {

        binding.inboxlist.setVisibility(View.VISIBLE);
        binding.rlprogress.setVisibility(View.GONE);
    }

    private void getData() {
        shimmershow();
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        UserService service = ServiceGenerator.createService(UserService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
        PromoRequestJson param = new PromoRequestJson();

        service.listpromocode(param).enqueue(new Callback<PromoResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<PromoResponseJson> call, @NonNull Response<PromoResponseJson> response) {
                if (response.isSuccessful()) {
                    shimmertutup();
                    if (Objects.requireNonNull(response.body()).getData().isEmpty()) {
                        binding.rlnodata.setVisibility(View.VISIBLE);
                    } else {
                        promoItem = new PromoItem(PromoActivity.this, response.body().getData(), R.layout.item_promo);
                        binding.inboxlist.setAdapter(promoItem);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull retrofit2.Call<PromoResponseJson> call, @NonNull Throwable t) {

            }
        });

    }
}