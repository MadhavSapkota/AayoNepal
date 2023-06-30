package com.ourdevelops.ourjek.activity;


import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.databinding.ActivityEditprofileBinding;
import com.ourdevelops.ourjek.json.EditprofileRequestJson;
import com.ourdevelops.ourjek.json.RegisterResponseJson;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;
import com.squareup.picasso.Picasso;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.ybs.countrypicker.CountryPicker;
import com.ybs.countrypicker.CountryPickerListener;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import androidx.exifinterface.media.ExifInterface;

import net.alhazmy13.mediapicker.Image.ImagePicker;

import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EditProfileActivity extends AppCompatActivity {
    private ActivityEditprofileBinding binding;

    private SimpleDateFormat dateFormatter, dateFormatterview;
    byte[] imageByteArray;
    Bitmap decoded;
    String dateview, disableback, onsubmit;
    String country_iso_code = "en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityEditprofileBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        onsubmit = "true";

        User loginUser = BaseApp.getInstance(this).getLoginUser();
        PicassoTrustAll.getInstance(this)
                .load(Constants.IMAGESUSER + loginUser.getFotopelanggan())
                .placeholder(R.drawable.image_placeholder)
                .resize(250, 250)
                .into(binding.foto);

        binding.phonenumber.setText(loginUser.getPhone());
        binding.nama.setText(loginUser.getFullnama());
        binding.email.setText(loginUser.getEmail());

        binding.phonenumberTil.setPrefixText(loginUser.getCountrycode());
        dateview = loginUser.getTglLahir();
        binding.editfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });

//        countryCode.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("WrongConstant")
//            @Override
//            public void onClick(View v) {
//                final CountryPicker picker = CountryPicker.newInstance("Select Country");
//                picker.setListener(new CountryPickerListener() {
//                    @Override
//                    public void onSelectCountry(String name, String code, String dialCode, int flagDrawableResID) {
//                        countryCode.setText(dialCode);
//                        picker.dismiss();
//                        country_iso_code = code;
//                    }
//                });
//                picker.setStyle(R.style.countrypicker_style, R.style.countrypicker_style);
//                picker.show(getSupportFragmentManager(), "Select Country");
//            }
//        });


        Date myDate = null;
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        dateFormatterview = new SimpleDateFormat("dd MMM yyyy", Locale.US);
        try {
            myDate = dateFormatter.parse(loginUser.getTglLahir());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        String finalDate = dateFormatterview.format(Objects.requireNonNull(myDate));
        binding.tanggal.setText(finalDate);
        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                final String emailvalidate = binding.email.getText().toString();

                if (TextUtils.isEmpty(binding.phonenumber.getText().toString())) {

                    notif(getString(R.string.phoneempty));

                } else if (TextUtils.isEmpty(binding.nama.getText().toString())) {

                    notif("Name cant be empty");

                } else if (TextUtils.isEmpty(binding.email.getText().toString())) {

                    notif(getString(R.string.emailempty));

                } else if (TextUtils.isEmpty(binding.tanggal.getText().toString())) {

                    notif("birthday cant be empty!");

                } else if (!emailvalidate.matches(emailPattern)) {

                    notif("wrong email format!");

                } else {
                    if (onsubmit.equals("true")) {
                        binding.submit.setText(getString(R.string.waiting_pleaseWait));
                        binding.submit.setBackground(getResources().getDrawable(R.drawable.rounded_corners_button));
                        editprofile();
                    }
                }
            }
        });

        binding.tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTanggal();
            }
        });
        disableback = "false";

    }

    private void showTanggal() {

        DatePickerDialog datePicker = DatePickerDialog.newInstance(
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(Calendar.YEAR, year);
                        calendar.set(Calendar.MONTH, monthOfYear);
                        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                        long date_ship_millis = calendar.getTimeInMillis();
                        binding.tanggal.setText(dateFormatterview.format(date_ship_millis));
                        dateview = dateFormatter.format(date_ship_millis);
                    }
                }
        );
        datePicker.setThemeDark(false);
        datePicker.setAccentColor(getResources().getColor(R.color.colorgradient));
        datePicker.show(getFragmentManager(), "Datepickerdialog");
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


    /**
     * uploadfoto-------------start.
     */
    private boolean check_ReadStoragepermission() {
        if (ContextCompat.checkSelfPermission(this.getApplicationContext(),
                Manifest.permission.READ_EXTERNAL_STORAGE)
                == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            Constants.permission_Read_data);
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        }
        return false;
    }

    private void selectImage() {
//        if (check_ReadStoragepermission()) {
//            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//            startActivityForResult(intent, 2);

            new ImagePicker.Builder(EditProfileActivity.this)
                    .mode(ImagePicker.Mode.CAMERA_AND_GALLERY)
                    .compressLevel(ImagePicker.ComperesLevel.HARD)
                    .directory(ImagePicker.Directory.DEFAULT)
                    .extension(ImagePicker.Extension.PNG)
                    .scale(600, 600)
                    .allowMultipleImages(false)
                    .enableDebuggingMode(true)
                    .build();
//        }
    }

    public String getPath(Uri uri) {
        String result = null;
        String[] proj = {MediaStore.Images.Media.DATA};
        Cursor cursor = this.getContentResolver().query(uri, proj, null, null, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                int column_index = cursor.getColumnIndexOrThrow(proj[0]);
                result = cursor.getString(column_index);
            }
            cursor.close();
        }
        if (result == null) {
            result = "Not found";
        }
        return result;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ImagePicker.IMAGE_PICKER_REQUEST_CODE && resultCode == RESULT_OK) {
            List<String> mPaths = data.getStringArrayListExtra(ImagePicker.EXTRA_IMAGE_PATH);
            android.util.Log.d("size", String.valueOf(mPaths.size()));
            for (int i = 0; i < mPaths.size(); i++) {
                String path = "file://" + mPaths.get(i);
                Log.e("akajsbdasdsd",path);
                android.util.Log.d("ImagePath", path);
                Picasso.with(getApplicationContext()).load(new File(mPaths.get(i))).into(binding.foto);
                try {
                    decoded = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.parse(path));
                    Log.e("ascadsdasdasd",decoded.toString());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void editprofile() {
        onsubmit = "false";
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        EditprofileRequestJson request = new EditprofileRequestJson();
        request.setFullNama(binding.nama.getText().toString());
        request.setEmail(binding.email.getText().toString());
        request.setEmaillama(loginUser.getEmail());
        request.setId(loginUser.getId());
        request.setNoTelepon(binding.phonenumber.getText().toString());
        request.setPhone(binding.phonenumber.getText().toString());
        request.setPhonelama(loginUser.getNoTelepon());
        request.setCountrycode(binding.phonenumberTil.getPrefixText().toString());
        if (decoded != null) {
            request.setFotopelangganlama(loginUser.getFotopelanggan());
            request.setFotopelanggan(getStringImage(decoded));
        }
        request.setTglLahir(dateview);


        UserService service = ServiceGenerator.createService(UserService.class, loginUser.getEmail(), loginUser.getPassword(),loginUser.getToken());
        service.editProfile(request).enqueue(new Callback<RegisterResponseJson>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(@NonNull Call<RegisterResponseJson> call, @NonNull Response<RegisterResponseJson> response) {
                if (response.isSuccessful()) {
                    if (Objects.requireNonNull(response.body()).getMessage().equalsIgnoreCase("success")) {
                        User user = response.body().getData().get(0);
                        saveUser(user);
                        finish();
                        onsubmit = "true";

                    } else {
                        onsubmit = "true";
                        binding.submit.setText("Submit");
                        binding.submit.setBackground(getResources().getDrawable(R.drawable.button_round_1));
                        notif(response.body().getMessage());
                    }
                } else {
                    onsubmit = "true";
                    binding.submit.setText("Submit");
                    binding.submit.setBackground(getResources().getDrawable(R.drawable.button_round_1));
                    notif("error");
                }
            }

            @Override
            public void onFailure(@NonNull Call<RegisterResponseJson> call, @NonNull Throwable t) {
                t.printStackTrace();
                notif("error!");
            }
        });
    }

    public String getStringImage(Bitmap bmp) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG, 50, baos);
        imageByteArray = baos.toByteArray();
        return Base64.encodeToString(imageByteArray, Base64.DEFAULT);
    }

    private void saveUser(User user) {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.delete(User.class);
        realm.copyToRealm(user);
        realm.commitTransaction();
        BaseApp.getInstance(EditProfileActivity.this).setLoginUser(user);
    }
}
