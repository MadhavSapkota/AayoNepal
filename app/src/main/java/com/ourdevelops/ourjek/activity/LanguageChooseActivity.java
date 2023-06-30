package com.ourdevelops.ourjek.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ourdevelops.ourjek.databinding.ActivityChooseLanguageBinding;
import com.ourdevelops.ourjek.utils.LanguageManager;
import com.ourdevelops.ourjek.utils.PrefsManager;


public class LanguageChooseActivity extends AppCompatActivity {
    private ActivityChooseLanguageBinding binding;

    private String mLanguageType = "English";
    private LanguageManager languageManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseLanguageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        languageManager = new LanguageManager(this);
        binding.deliveryToggle.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                RadioButton rb = findViewById(checkedId);
                mLanguageType = rb.getText().toString();
                Log.d("group", mLanguageType);
                if (mLanguageType.matches("English")) {
                    setLanguageType("en");
                    new PrefsManager(getApplicationContext()).setLanguageValue("en");
                } else {
                    setLanguageType("ne");
                    new PrefsManager(getApplicationContext()).setLanguageValue("ne");
                }
            }
        });
        binding.rlNext.setOnClickListener(v -> {
            if (mLanguageType.matches("English")) {
                setLanguageType("en");
                new PrefsManager(getApplicationContext()).setLanguageValue("en");
                Intent intent = new Intent(LanguageChooseActivity.this, LoginActivity.class);
                intent.putExtra("first","first");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            } else {
                setLanguageType("ne");
                new PrefsManager(getApplicationContext()).setLanguageValue("ne");
                Intent intent = new Intent(LanguageChooseActivity.this, LoginActivity.class);
                intent.putExtra("first","first");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }

    public void setLanguageType(String type) {
        Log.d(type, type);
        languageManager.setLanguage(type);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
