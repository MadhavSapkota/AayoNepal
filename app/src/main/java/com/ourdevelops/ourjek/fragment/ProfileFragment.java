package com.ourdevelops.ourjek.fragment;


import android.Manifest;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AlertDialog;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.ourdevelops.ourjek.BuildConfig;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.ChangepassActivity;
import com.ourdevelops.ourjek.activity.EditProfileActivity;
import com.ourdevelops.ourjek.activity.IntroActivity;
import com.ourdevelops.ourjek.activity.PrivacyActivity;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo;
import com.ourdevelops.ourjek.databinding.FragmentProfileBinding;
import com.ourdevelops.ourjek.json.fcm.FCMRequestJson;
import com.ourdevelops.ourjek.json.fcm.FCMResponseJson;
import com.ourdevelops.ourjek.models.PesananMerchant;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.LanguageManager;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;
import com.ourdevelops.ourjek.utils.PrefsManager;
import com.ourdevelops.ourjek.utils.SettingPreference;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.Objects;

import androidx.fragment.app.Fragment;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.Context.NOTIFICATION_SERVICE;


public class ProfileFragment extends Fragment {
    private FragmentProfileBinding binding;
    private Context context;
    private SettingPreference sp;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        View getView = binding.getRoot();
        context = getContext();

        sp = new SettingPreference(context);

        binding.llprivacypolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, PrivacyActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);

            }
        });

        binding.llaboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutus();
            }
        });

        binding.llshareapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
                String shareMessage = "Let me recommend you this application";
                shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "choose one"));

            }
        });

        binding.llrateapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("market://details?id=" + Objects.requireNonNull(getActivity()).getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                }
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + getActivity().getPackageName())));
                }
            }
        });

        binding.lleditprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, EditProfileActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        binding.llpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ChangepassActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        binding.lllogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDone();
            }
        });

        binding.llLanguage.setOnClickListener(v -> ShowlanguageChooseOption());

        return getView;
    }

    private void clickDone() {
        new CustomDialogYesNo().setTitle("Log Out?").setBtnTextYes("Log Out").showYesNoDialog(getActivity(), new CustomDialogYesNo.dialogOnClickListener() {
            @Override
            public void onClick() {
                User user = BaseApp.getInstance(context).getLoginUser();
                UserService service = ServiceGenerator.createService(UserService.class, user.getEmail(), user.getPassword(),user.getToken());
                FCMRequestJson req = new FCMRequestJson();
                req.setCustomer_id(user.getId());
                service.destroyFCM(req).enqueue(new Callback<FCMResponseJson>() {
                    @Override
                    public void onResponse(Call<FCMResponseJson> call, Response<FCMResponseJson> response) {
                        logout();
                    }

                    @Override
                    public void onFailure(Call<FCMResponseJson> call, Throwable t) {

                    }
                });
            }

            @Override
            public void onClose() {

            }
        });
    }

    private void logout(){
        Realm realm = BaseApp.getInstance(context).getRealmInstance();
        realm.beginTransaction();
        realm.delete(User.class);
        realm.delete(PesananMerchant.class);
        realm.commitTransaction();
        removeNotif();
        LoginManager.getInstance().logOut();
        BaseApp.getInstance(context).setLoginUser(null);

        startActivity(new Intent(getContext(), IntroActivity.class)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
        requireActivity().finish();
    }

    private void aboutus() {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(R.layout.dialog_aboutus);
        dialog.setCancelable(true);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(Objects.requireNonNull(dialog.getWindow()).getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

        final ImageView close = dialog.findViewById(R.id.bt_close);
        final LinearLayout email = dialog.findViewById(R.id.email);
        final LinearLayout phone = dialog.findViewById(R.id.phone);
        final LinearLayout website = dialog.findViewById(R.id.website);
        final WebView about = dialog.findViewById(R.id.aboutus);

        String mimeType = "text/html";
        String encoding = "utf-8";
        String htmlText;
        htmlText = sp.getSetting()[1];
        String text = "<html dir=" + "><head>"
                + "<style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/NeoSans_Pro_Regular.ttf\")}body{font-family: MyFont;color: #000000;text-align:justify;line-height:1.2}"
                + "</style></head>"
                + "<body>"
                + htmlText
                + "</body></html>";

        about.loadDataWithBaseURL(null, text, mimeType, encoding, null);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + (sp.getSetting()[3])));
                if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(requireActivity(), new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    } else {
                        startActivity(callIntent);
                    }
                }
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                try {
//
//                } catch (android.content.ActivityNotFoundException e) {
//                    Toast.makeText(getActivity(), "There is no email client installed.", Toast.LENGTH_SHORT).show();
//                }

                try {
                    Intent testIntent = new Intent(Intent.ACTION_VIEW);
                    Uri data = Uri.parse("mailto:?subject=" + "" + "&body=" + "" + "&to=" +sp.getSetting()[2] );
                    testIntent.setData(data);
                    startActivity(testIntent);
                } catch (android.content.ActivityNotFoundException ex) {
                    String[] TO = {(sp.getSetting()[2])};
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.setType("text/plain");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "halo");
                    emailIntent.putExtra(Intent.EXTRA_TEXT, (sp.getSetting()[2]) + "\n");
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));

                    Toast.makeText(getActivity(),
                            "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = (sp.getSetting()[4]);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }

    @Override
    public void onResume() {
        super.onResume();
        User loginUser = BaseApp.getInstance(context).getLoginUser();
        binding.username.setText(loginUser.getFullnama());
        binding.useremail.setText(loginUser.getEmail());

        Log.d("profile", "onResume: "+ loginUser.getFotopelanggan());

        PicassoTrustAll.getInstance(context)
                .load(Constants.IMAGESUSER + loginUser.getFotopelanggan())
                .placeholder(R.drawable.image_placeholder)
                .resize(250, 250)
                .into(binding.userphoto);

    }

    private void removeNotif() {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
        Objects.requireNonNull(notificationManager).cancel(0);
    }


    private void ShowlanguageChooseOption() {

        new CustomDialogYesNo()
                .setTitle("Pick Me")
                .setMessage("Please Choose your suitable language")
                .setBtnTextYes("Nepali")
                .setBtnTextNo("English")
                .showYesNoDialog(getActivity(), new CustomDialogYesNo.dialogOnClickListener() {
            @Override
            public void onClick() {
                setLanguageType("ne");
                new PrefsManager(getActivity()).setLanguageValue("ne");
                getActivity().finish();
                startActivity(getActivity().getIntent());
            }

            @Override
            public void onClose() {
                setLanguageType("en");
                new PrefsManager(getActivity()).setLanguageValue("en");
                getActivity().finish();
                startActivity(getActivity().getIntent());
            }
        });
    }


    public void setLanguageType(String type) {
        Log.d(type, type);
        LanguageManager languageManager = new LanguageManager(getContext());
        languageManager.setLanguage(type);
        setlanguage();


    }

    public void setlanguage() {
        LanguageManager languageManager = new LanguageManager(getContext());
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
