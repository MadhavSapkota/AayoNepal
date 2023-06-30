package com.ourdevelops.ourjek.activity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityBeritadetailBinding;
import com.ourdevelops.ourjek.json.BeritaDetailRequestJson;
import com.ourdevelops.ourjek.json.BeritaDetailResponseJson;
import com.ourdevelops.ourjek.models.BeritaModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.DatabaseHelper;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;
import com.ourdevelops.ourjek.utils.PrefsManager;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by otacodes on 3/26/2019.
 */

public class BeritaDetailActivity extends AppCompatActivity {
    private ActivityBeritadetailBinding binding;

    String Id;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityBeritadetailBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        Intent i = getIntent();
        Id = i.getStringExtra("id");

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        getData();

    }

    private void getData() {
        binding.rlprogress.setVisibility(View.VISIBLE);
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        UserService service = ServiceGenerator.createService(UserService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
        BeritaDetailRequestJson param = new BeritaDetailRequestJson();
        param.setId(Id);
        param.setLanguage(new PrefsManager(getApplicationContext()).getLanguageValue());

        service.beritadetail(param).enqueue(new Callback<BeritaDetailResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<BeritaDetailResponseJson> call, @NonNull Response<BeritaDetailResponseJson> response) {
                if (response.isSuccessful()) {
                    binding.rlprogress.setVisibility(View.GONE);
                    final BeritaModel berita = Objects.requireNonNull(response.body()).getData().get(0);
                    binding.title.setText(berita.getTitle());

                    if (!berita.getFotoberita().isEmpty()) {
                        PicassoTrustAll.getInstance(BeritaDetailActivity.this)
                                .load(berita.getFotoberita())
                                .into(binding.image);
                    }
                    Date myDate = null;
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.US);
                    try {
                        myDate = dateFormat.parse(berita.getCreatedberita());

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    SimpleDateFormat timeFormat = new SimpleDateFormat("dd MMM yyyy", Locale.US);
                    String finalDate = timeFormat.format(Objects.requireNonNull(myDate));
                    binding.tanggal.setText(finalDate);

                    String mimeType = "text/html";
                    String encoding = "utf-8";
                    String htmlText = berita.getContent();

                    String text = "<html dir=" + "><head>"
                            + "<style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/NeoSans_Pro_Regular.ttf\")}body{font-family: MyFont;color: #000000;text-align:justify;line-height:1.2}"
                            + "</style></head>"
                            + "<body>"
                            + htmlText
                            + "</body></html>";
                    binding.description.loadDataWithBaseURL(null, text, mimeType, encoding, null);
                    binding.kategori.setText(berita.getKategori());

                    final User loginUser = BaseApp.getInstance(BeritaDetailActivity.this).getLoginUser();
                    binding.favourite.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            ContentValues fav = new ContentValues();
                            if (databaseHelper.getFavouriteById(String.valueOf(berita.getIdberita()))) {
                                databaseHelper.removeFavouriteById(String.valueOf(berita.getIdberita()));
                                binding.favourite.setColorFilter(getResources().getColor(R.color.gray));
                                Toast.makeText(BeritaDetailActivity.this, "Remove To Favourite", Toast.LENGTH_SHORT).show();
                            } else {
                                fav.put(DatabaseHelper.KEY_ID, berita.getIdberita());
                                fav.put(DatabaseHelper.KEY_USERID, loginUser.getId());
                                fav.put(DatabaseHelper.KEY_TITLE, berita.getTitle());
                                fav.put(DatabaseHelper.KEY_CONTENT, berita.getContent());
                                fav.put(DatabaseHelper.KEY_KATEGORI, berita.getKategori());
                                fav.put(DatabaseHelper.KEY_IMAGE, berita.getFotoberita());
                                databaseHelper.addFavourite(DatabaseHelper.TABLE_FAVOURITE_NAME, fav, null);
                                binding.favourite.setColorFilter(getResources().getColor(R.color.red));
                                Toast.makeText(BeritaDetailActivity.this, "Add To Favourite", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

                    if (databaseHelper.getFavouriteById(String.valueOf(berita.getIdberita()))) {
                        binding.favourite.setColorFilter(getResources().getColor(R.color.red));
                    } else {
                        binding.favourite.setColorFilter(getResources().getColor(R.color.gray));
                    }
                }


            }

            @Override
            public void onFailure(@NonNull retrofit2.Call<BeritaDetailResponseJson> call, @NonNull Throwable t) {

            }
        });

    }

}
