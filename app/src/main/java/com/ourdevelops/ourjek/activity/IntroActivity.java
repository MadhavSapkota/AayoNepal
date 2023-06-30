package com.ourdevelops.ourjek.activity;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.databinding.ActivityIntroBinding;
import com.ourdevelops.ourjek.utils.AppIntroPagerAdapter;
import com.ourdevelops.ourjek.utils.LanguageManager;
import com.ourdevelops.ourjek.utils.PrefsManager;
import com.ourdevelops.ourjek.utils.ProjectUtils;
import com.ourdevelops.ourjek.utils.SharedPrefrence;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;


public class IntroActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private ActivityIntroBinding binding;

    private AppIntroPagerAdapter mAdapter;
    private int dotsCount;
    private ImageView[] dots;
    public SharedPrefrence preference;
    private Context mContext;
    int[] mResources = {R.drawable.intro_one, R.drawable.intro_two, R.drawable.intro_three};
    private LanguageManager languageManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        ProjectUtils.Fullscreen(IntroActivity.this);
        setContentView(binding.getRoot());
        mContext = IntroActivity.this;
        preference = SharedPrefrence.getInstance(mContext);
        languageManager = new LanguageManager(this);

        binding.tombolstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent(IntroActivity.this, LanguageChooseActivity.class);
                setLanguageType("en");
                new PrefsManager(getApplicationContext()).setLanguageValue("en");
                Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                intent.putExtra("first","first");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
//                ShowlanguageChooseOption();
            }
        });
        removeNotif();

        mAdapter = new AppIntroPagerAdapter(IntroActivity.this, mContext, mResources);
        binding.viewpager.setAdapter(mAdapter);
        binding.viewpager.setCurrentItem(0);
        binding.viewpager.setOnPageChangeListener(this);
        setPageViewIndicator();
        final int[] page = {0};
        Handler handler = new Handler();
        TimerTask timer = new TimerTask() {
            @Override
//            enter code here
            public void run() {
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        binding.viewpager.setCurrentItem(page[0] % 4); // 4= no. of page in viewpager
                        page[0]++;
                    }
                });
            }
        };
        Timer time=new Timer();
        time.schedule(timer, 0, 5000); //2000 millisecond for replace the viewpager page
    }

    @SuppressLint("ClickableViewAccessibility")
    private void setPageViewIndicator() {

//        Log.d("###setPageViewIndicator", " : called");
        dotsCount = mAdapter.getCount();
        dots = new ImageView[dotsCount];

        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(mContext);
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditem_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    25,
                    25
            );

            params.setMargins(4, 20, 4, 0);

            final int presentPosition = i;
            dots[presentPosition].setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    binding.viewpager.setCurrentItem(presentPosition);
                    return true;
                }
            });
            binding.viewPagerCountDots.addView(dots[i], params);
        }
        dots[0].setImageDrawable(getResources().getDrawable(R.drawable.selecteditem_dot));
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
//        Log.e("###onPageSelected, pos ", String.valueOf(position));
        for (int i = 0; i < dotsCount; i++) {
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditem_dot));
        }
        dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteditem_dot));
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public void scrollPage(int position) {
        binding.viewpager.setCurrentItem(position);
    }

    private void removeNotif() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Objects.requireNonNull(notificationManager).cancel(0);
    }

    private void ShowlanguageChooseOption() {

        new AlertDialog.Builder(IntroActivity.this, R.style.DialogStyle)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(getString(R.string.app_name))
                .setMessage(getString(R.string.select))
                .setPositiveButton(getString(R.string.English), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        setLanguageType("en");
                        new PrefsManager(getApplicationContext()).setLanguageValue("en");
                        Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton(getString(R.string.Nepali), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        setLanguageType("ne");
                        new PrefsManager(getApplicationContext()).setLanguageValue("ne");
                        Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                })
                .show();
    }

    public void setLanguageType(String type) {
        Log.d(type, type);
        languageManager.setLanguage(type);
        setlanguage();


    }

    public void setlanguage() {
        try {
            if (languageManager.getLanguage().equals("en")) {
                languageManager.setLanguage("en");
            } else {
                languageManager.setLanguage("ne");
            }
        } catch (Exception e) {
        }
    }

}
