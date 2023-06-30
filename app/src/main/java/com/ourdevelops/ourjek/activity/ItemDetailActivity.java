package com.ourdevelops.ourjek.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.databinding.ActivityItemdetailBinding;
import com.ourdevelops.ourjek.json.ResponseJson;
import com.ourdevelops.ourjek.json.cart.AddtoCartRequest;
import com.ourdevelops.ourjek.models.ItemModel;
import com.ourdevelops.ourjek.models.PesananMerchant;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.ProjectUtils;
import com.ourdevelops.ourjek.utils.Utility;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.Objects;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ItemDetailActivity extends AppCompatActivity {

    private ActivityItemdetailBinding binding;

    private Realm realm;
    private TextWatcher catatanUpdater;
    private int quantity = 1;
    private int id,restaurant_id;
    private ItemModel selectedItem;
    private String catatan;
    private long cost;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityItemdetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        realm = Realm.getDefaultInstance();
        catatanUpdater = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                catatan = s.toString();
                if (quantity > 0) UpdatePesanan(id, cost, quantity, catatan);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        if(getIntent().getExtras() != null) {
            selectedItem = realm.where(ItemModel.class).equalTo("id_item", Integer.valueOf(getIntent().getStringExtra("id_item"))).findFirst();
                this.restaurant_id = Integer.parseInt(getIntent().getStringExtra("restaurant_id"));
            if (selectedItem.getStatus_promo().equals("1")) {
                binding.hargapromo.setVisibility(View.VISIBLE);
                Utility.currencyTXT(binding.harga, selectedItem.getHarga_promo(), this);
                Utility.currencyTXT(binding.hargapromo, selectedItem.getHarga_item(), this);
                binding.hargapromo.setPaintFlags(binding.hargapromo.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            } else {
                binding.hargapromo.setVisibility(View.GONE);
                Utility.currencyTXT(binding.harga, selectedItem.getHarga_item(), this);
            }
            id = selectedItem.getId_item();
            String mimeType = "text/html";
            String encoding = "utf-8";
            String htmlText = selectedItem.getDeskripsi_item();
            String textcontent = "<html dir=" + "><head>"
                    + "<style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/OpenSans_Regular.ttf\")}body{font-family: MyFont;color: #AAAAAA;text-align:justify;line-height:1.2}"
                    + "</style></head>"
                    + "<body>"
                    + htmlText
                    + "</body></html>";
            binding.content.loadDataWithBaseURL(null, textcontent, mimeType, encoding, null);
            binding.title.setText(selectedItem.getNama_item());
            binding.catatan.addTextChangedListener(catatanUpdater);
        }

        binding.addQuantity.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    quantity++;
                    binding.quantityText.setText("" + quantity);
                    binding.catatan.setEnabled(true);
                }
            });




        binding.removeQuantity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (quantity - 1 >= 0) {
                        quantity--;
                        binding.quantityText.setText(String.valueOf(quantity));
//                    CalculateCost(Long.valueOf(selectedItem.getHarga_item()), selectedItem.getStatus_promo(), quantity, Long.valueOf(selectedItem.getHarga_item()));
//                    UpdatePesanan(id, cost, quantity, catatan);
//
//                    if (quantity == 0) {
//                        DeletePesanan(id);
//                        notesText.setText("");
//                        notesText.setEnabled(false);
//                    }
                    }

//                ((NewDetailMerchantActivity) Objects.requireNonNull(getActivity())).calculatePrice();
                }
            });

            binding.btnAddCart.setOnClickListener(v -> {
                if(quantity == 0){
                    ProjectUtils.showToast(getApplicationContext(),"Please Add Some Item.");
                }else {
                    addtocart(id,cost,quantity,catatan,restaurant_id);

                    CalculateCost(Long.valueOf(selectedItem.getHarga_promo()), selectedItem.getStatus_promo(), quantity, Long.valueOf(selectedItem.getHarga_item()));
                    realm.beginTransaction();
                    PesananMerchant updateFood = realm.where(PesananMerchant.class).equalTo("idItem", selectedItem.getId_item()).findFirst();
                    realm.commitTransaction();

                    if (updateFood != null) {
                        UpdatePesanan(id, cost, quantity, catatan);
                    } else {
                        AddPesanan(id, cost, quantity, catatan);
                    }
//                    ((NewDetailMerchantActivity) Objects.requireNonNull(getApplicationContext())).calculatePrice();
                    Intent intent=new Intent();
                    setResult(2,intent);
                    finish();
                }
            });

            binding.btnCancel.setOnClickListener(v -> {
                if (quantity == 0) {
                    DeletePesanan(id);
                    binding.catatan.setText("");
                    binding.catatan.setEnabled(false);
                }
                finish();
            });
        }

    private void addtocart(int id, long cost, int quantity, String catatan, int restaurant_id) {
        User loginUser = BaseApp.getInstance(this).getLoginUser();
        UserService userService = ServiceGenerator.createService(
                UserService.class, loginUser.getNoTelepon(), loginUser.getPassword(),loginUser.getToken());
        AddtoCartRequest param = new AddtoCartRequest();
        param.setCustomerId(String.valueOf(loginUser.getId()));
        param.setItemId(String.valueOf(id));
        param.setItemPrice(String.valueOf(selectedItem.getHarga_item()));
        param.setMerchantId(String.valueOf(restaurant_id));
        param.setQuantity(String.valueOf(quantity));
        try {

        param.setNotes(binding.catatan.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        userService.addtocart(param).enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(@NonNull Call<ResponseJson> call, @NonNull final Response<ResponseJson> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(ItemDetailActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseJson> call, @NonNull Throwable t) {
                Toast.makeText(ItemDetailActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CalculateCost(Long hargapromo, String status_promo, int quantity, Long harga_item) {
        if (status_promo.equals("1")) {
            cost = this.quantity * hargapromo;
        } else {
            cost = this.quantity * harga_item;
        }
    }

    private void AddPesanan(int idMakanan, long totalHarga, int qty, String notes) {
        try {
            PesananMerchant pesananfood = new PesananMerchant();
            pesananfood.setIdItem(idMakanan);
            pesananfood.setTotalHarga(totalHarga);
            pesananfood.setQty(qty);
            pesananfood.setCatatan(notes);
            pesananfood.setRestaurant_id(restaurant_id);
            realm.beginTransaction();
            realm.copyToRealm(pesananfood);
            realm.commitTransaction();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private void UpdatePesanan(int idMakanan, long totalHarga, int qty, String notes) {
//        realm.beginTransaction();
//        PesananMerchant updateFood = realm.where(PesananMerchant.class).equalTo("idItem", idMakanan).findFirst();
//        Objects.requireNonNull(updateFood).setTotalHarga(totalHarga);
//        updateFood.setQty(qty);
//        updateFood.setCatatan(notes);
//        realm.copyToRealm(updateFood);
//        realm.commitTransaction();

    }


    private void DeletePesanan(int idMakanan) {
        realm.beginTransaction();
        PesananMerchant deleteFood = realm.where(PesananMerchant.class).equalTo("idItem", idMakanan).findFirst();
        if(deleteFood != null) {
            Objects.requireNonNull(deleteFood).deleteFromRealm();
        }
        realm.commitTransaction();
    }


}
