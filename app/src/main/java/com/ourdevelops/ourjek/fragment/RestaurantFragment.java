package com.ourdevelops.ourjek.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.databinding.FragmentRestaurantBinding;
import com.ourdevelops.ourjek.item.AllMerchantNearItem;
import com.ourdevelops.ourjek.json.AllMerchantByNearResponseJson;
import com.ourdevelops.ourjek.json.GetAllMerchantbyCatRequestJson;
import com.ourdevelops.ourjek.models.MerchantNearModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestaurantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantFragment extends Fragment {
    private FragmentRestaurantBinding binding;

    List<MerchantNearModel> clicknear;
    double lat, lng;

    public RestaurantFragment() {
        // Required empty public constructor
    }


    private void progressshow() {
        binding.merchantnear.setVisibility(View.VISIBLE);
        binding.rlprogress.setVisibility(View.VISIBLE);
    }

    private void progresshide() {
        binding.merchantnear.setVisibility(View.GONE);
        binding.rlprogress.setVisibility(View.GONE);
    }

    public static RestaurantFragment newInstance() {
        RestaurantFragment fragment = new RestaurantFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRestaurantBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.merchantnear.setHasFixedSize(true);
        binding.merchantnear.setNestedScrollingEnabled(false);
        binding.merchantnear.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));
        Bundle merchantItems = getArguments();
        String id = merchantItems.getString("id");
        lat = merchantItems.getDouble("lat");
        lng = merchantItems.getDouble("lng");
        clicknear = (List<MerchantNearModel>) merchantItems.getSerializable("valuesArray");
        progressshow();
        getmerchntbycatnear(id);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void getmerchntbycatnear(String cat) {
        User loginUser = BaseApp.getInstance(RestaurantFragment.super.getContext()).getLoginUser();
        UserService userService = ServiceGenerator.createService(
                UserService.class, loginUser.getNoTelepon(), loginUser.getPassword(),loginUser.getToken());
        GetAllMerchantbyCatRequestJson param = new GetAllMerchantbyCatRequestJson();
        param.setId(loginUser.getId());
        param.setLat(String.valueOf(lat));
        param.setLon(String.valueOf(lng));
        param.setPhone(loginUser.getNoTelepon());
        param.setKategori(cat);
        param.setFitur("21");
        userService.getallmerchanbynear(param).enqueue(new Callback<AllMerchantByNearResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<AllMerchantByNearResponseJson> call, @NonNull Response<AllMerchantByNearResponseJson> response) {
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {

                        if (response.body().getData().isEmpty()) {
                            binding.rlnodata.setVisibility(View.VISIBLE);
                            binding.merchantnear.setVisibility(View.INVISIBLE);
                        } else {
                            progresshide();
                            binding.rlnodata.setVisibility(View.GONE);
                            clicknear = response.body().getData();
                            binding.merchantnear.setVisibility(View.VISIBLE);
                            binding.merchantnear.setAdapter(new AllMerchantNearItem(RestaurantFragment.super.getContext(), clicknear,R.layout.item_merchant_list, "21"));
                        }
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<AllMerchantByNearResponseJson> call, @NonNull Throwable t) {

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}