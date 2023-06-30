package com.ourdevelops.ourjek.item;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.constants.IntentKeys;
import com.ourdevelops.ourjek.json.cart.CustomerRequestParams;
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse;
import com.ourdevelops.ourjek.models.MerchantNearModel;
import com.ourdevelops.ourjek.models.User;
import com.ourdevelops.ourjek.utils.api.ServiceGenerator;
import com.ourdevelops.ourjek.utils.api.service.UserService;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.facebook.FacebookSdk.getApplicationContext;

/**
 * Created by otacodes on 3/24/2019.
 */

public class AllMerchantNearItem extends RecyclerView.Adapter<AllMerchantNearItem.ItemRowHolder> {

    private List<MerchantNearModel> dataList;
    private Context mContext;
    private int rowLayout;
    private String fiturkey;

    public  AllMerchantNearItem(Context context, List<MerchantNearModel> dataList, int rowLayout, String fiturkey) {
        this.dataList = dataList;
        this.mContext = context;
        this.rowLayout = rowLayout;
        this.fiturkey = fiturkey;
    }

    @NonNull
    @Override
    public ItemRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ItemRowHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final ItemRowHolder holder, final int position) {
        final MerchantNearModel singleItem = dataList.get(position);
        holder.name.setText(singleItem.getNama_merchant());
        if (!singleItem.getFoto_merchant().isEmpty()) {

            Glide.with(mContext)
                    .load(singleItem.getFoto_merchant())
                    .into(holder.images);
        }

        holder.kategori.setText(singleItem.getCategory_merchant());

        if (singleItem.getStatus_promo().equals("1")) {
            holder.promobadge.setVisibility(View.VISIBLE);
        } else {
            holder.promobadge.setVisibility(View.GONE);
        }

        String[] parsedJamBuka = singleItem.getJam_buka().split(":");
        String[] parsedJamTutup = singleItem.getJam_tutup().split(":");

        int jamBuka = Integer.parseInt(parsedJamBuka[0]), menitBuka = Integer.parseInt(parsedJamBuka[1]);
        int jamTutup = Integer.parseInt(parsedJamTutup[0]), menitTutup = Integer.parseInt(parsedJamTutup[1]);

        int totalMenitBuka = (jamBuka * 60) + menitBuka;
        int totalMenitTutup = (jamTutup * 60) + menitTutup;

        Calendar now = Calendar.getInstance();
        int totalMenitNow = (now.get(Calendar.HOUR_OF_DAY) * 60) + now.get(Calendar.MINUTE);
        holder.address.setText(singleItem.getAlamat_merchant());
        float km = Float.parseFloat(singleItem.getDistance());
        String format = String.format(Locale.US, "%.1f", km);

        if (totalMenitNow <= totalMenitTutup && totalMenitNow >= totalMenitBuka) {
            holder.distance.setText(format+"km"+" "+mContext.getString(R.string.text_with_bullet)+" "+"Open");
        } else {
            holder.distance.setText(format+"km"+" "+mContext.getString(R.string.text_with_bullet)+" "+"Closed");
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("asd", "onClick: asdasd");
                Intent i = new Intent(mContext, NewDetailMerchantActivity.class);
                i.putExtra(IntentKeys.merchantId, singleItem.getId_merchant());
                i.putExtra(IntentKeys.latitude, singleItem.getLatitude_merchant());
                i.putExtra(IntentKeys.longitude, singleItem.getLongitude_merchant());
                i.putExtra(IntentKeys.id,singleItem.getId_merchant());
                i.putExtra(IntentKeys.filter, fiturkey);
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    static class ItemRowHolder extends RecyclerView.ViewHolder {
        TextView name,address,distance,kategori;
        ImageView images;
        FrameLayout promobadge;

        ItemRowHolder(View itemView) {
            super(itemView);
            images = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.nama);
            kategori = itemView.findViewById(R.id.kategori);
            promobadge = itemView.findViewById(R.id.promobadge);
            address = itemView.findViewById(R.id.alamat);
            distance = itemView.findViewById(R.id.distance);
        }
    }

}
