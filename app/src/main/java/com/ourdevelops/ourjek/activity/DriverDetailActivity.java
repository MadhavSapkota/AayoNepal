package com.ourdevelops.ourjek.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityDriverDetailBinding;
import com.squareup.picasso.Picasso;

public class DriverDetailActivity extends AppCompatActivity {

    private ActivityDriverDetailBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDriverDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getIntent().getExtras() != null) {
            binding.tvDriverName.setText(getIntent().getStringExtra("name"));
            binding.tvMobile.setText(getIntent().getStringExtra("mobile"));
            binding.tvMerek.setText(getIntent().getStringExtra("merek"));
            binding.tvColor.setText(getIntent().getStringExtra("warna"));
            binding.tvVehicleNumber.setText(getIntent().getStringExtra("kendaraan"));
            Picasso.with(this).load(Constants.IMAGESDRIVER + getIntent().getStringExtra("image")).into(binding.ivDriver);
            binding.ratingView.setRating(Float.parseFloat(getIntent().getStringExtra("rating")));
        }
        binding.btnCross.setOnClickListener(v -> onBackPressed());
    }
}
