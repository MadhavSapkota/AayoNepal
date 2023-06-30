package com.ourdevelops.ourjek.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.databinding.ActivityAllBeritaBinding;
import com.ourdevelops.ourjek.item.BeritaItem;
import com.ourdevelops.ourjek.json.BeritaDetailRequestJson;
import com.ourdevelops.ourjek.json.BeritaDetailResponseJson;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.PrefsManager;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.Objects;

public class AllBeritaActivity extends AppCompatActivity {
    private ActivityAllBeritaBinding binding;
    BeritaItem beritaItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityAllBeritaBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.inboxlist.setHasFixedSize(true);
        binding.inboxlist.setNestedScrollingEnabled(false);
        binding.inboxlist.setLayoutManager(new GridLayoutManager(this, 1));
        binding.backBtn.setOnClickListener(v -> finish());
        getData();
    }

    private void progressshow() {
        binding.inboxlist.setVisibility(View.GONE);
        binding.rlprogress.setVisibility(View.VISIBLE);
    }

    private void progresshide() {

        binding.inboxlist.setVisibility(View.VISIBLE);
        binding.rlprogress.setVisibility(View.GONE);
    }

    private void getData() {
        progressshow();
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        UserService service = ServiceGenerator.createService(UserService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
        BeritaDetailRequestJson param = new BeritaDetailRequestJson();
        param.setLanguage(new PrefsManager(getApplicationContext()).getLanguageValue());

        service.allberita(param).enqueue(new Callback<BeritaDetailResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<BeritaDetailResponseJson> call, @NonNull Response<BeritaDetailResponseJson> response) {
                if (response.isSuccessful()) {
                    progresshide();
                    if (Objects.requireNonNull(response.body()).getData().isEmpty()) {
                        binding.rlnodata.setVisibility(View.VISIBLE);
                    } else {
                        beritaItem = new BeritaItem(AllBeritaActivity.this, response.body().getData(), R.layout.item_grid_full);
                        binding.inboxlist.setAdapter(beritaItem);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull retrofit2.Call<BeritaDetailResponseJson> call, @NonNull Throwable t) {

            }
        });

    }


}
