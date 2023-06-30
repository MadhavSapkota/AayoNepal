package com.ourdevelops.ourjek.item;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.ProgressActivity;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.models.AllTransaksiModel;
import com.ourdevelops.ourjek.utils.Log;
import com.ourdevelops.ourjek.utils.Utility;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/**
 * Created by otacodes on 3/24/2019.
 */

public class HistoryItem extends RecyclerView.Adapter<HistoryItem.ItemRowHolder> {

    private List<AllTransaksiModel> dataList;
    private Context mContext;
    private int rowLayout;


    public HistoryItem(Context context, List<AllTransaksiModel> dataList, int rowLayout) {
        this.dataList = dataList;
        this.mContext = context;
        this.rowLayout = rowLayout;

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
        final AllTransaksiModel singleItem = dataList.get(position);
        Glide.with(mContext).load(Constants.IMAGESFITUR + singleItem.getIcon()).into(holder.images);

        if (Objects.equals(singleItem.getFitur(), "Bike Ride")) {
            holder.rideType.setImageResource(R.drawable.motorbike);
        } else {
            holder.rideType.setImageResource(R.drawable.car);
        }
//        holder.text.setText(mContext.getResources().getString(R.string.text_order) + " " + singleItem.getFitur());
        if (singleItem.getAfter_discount() == null) {
            if (singleItem.getTotal_price() != null) {
                Utility.currencyTXT(holder.nominal, singleItem.getTotal_price(), mContext);
            } else {
                Utility.currencyTXT(holder.nominal, Objects.requireNonNull(singleItem.getBiayaakhir()), mContext);
            }
        } else {
            Utility.currencyTXT(holder.nominal, singleItem.getAfter_discount(), mContext);
        }
        holder.keterangan.setText(singleItem.getStatustransaksi().toUpperCase(Locale.ROOT));
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd MMM yyyy", Locale.US);
        String finalDate = timeFormat.format(Objects.requireNonNull(singleItem.getWaktuOrder()));
        holder.tanggal.setText(finalDate);
        holder.startAddress.setText(singleItem.getAlamatAsal());
        holder.destinationAddress.setText(singleItem.getAlamatTujuan());
//        holder.rating.setText(singleItem.getRate());
//        PicassoTrustAll.getInstance(mContext)
//                .load(Constants.IMAGESFITUR + singleItem.getIcon())
//                .into(holder.images);
        if (singleItem.status == 4 && Objects.requireNonNull(singleItem.getRate()).isEmpty()) {
            holder.keterangan.setTextColor(mContext.getResources().getColor(R.color.aayo_green));
            holder.keterangan.setBackgroundResource(R.drawable.rectangle_green_border_5dp);
            holder.nominal.setTextColor(mContext.getResources().getColor(R.color.colorgradient));
//            holder.background.setBackground(mContext.getResources().getDrawable(R.drawable.btn_rect));
            holder.itemlayout.setOnClickListener(v -> { //finish
                Log.d("value4", "4");
                Intent i = new Intent(mContext, ProgressActivity.class);
                i.putExtra("id_driver", singleItem.getIdDriver());
                i.putExtra("id_transaksi", singleItem.getIdTransaksi());
                i.putExtra("complete", "true");
                i.putExtra("response", String.valueOf(singleItem.status));
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                mContext.startActivity(i);
            });
        } else if (singleItem.status == 5 || singleItem.status == 0) {  //cancel //reject
            holder.keterangan.setTextColor(mContext.getResources().getColor(R.color.aayo_red));
            holder.keterangan.setBackgroundResource(R.drawable.rectangle_red_border_5dp);
            holder.nominal.setTextColor(mContext.getResources().getColor(R.color.red));
//            holder.background.setBackground(mContext.getResources().getDrawable(R.drawable.btn_rect_red));
            holder.itemlayout.setOnClickListener(v -> {
                Log.d("value", "5");
                Intent i = new Intent(mContext, ProgressActivity.class);
                i.putExtra("id_driver", singleItem.getIdDriver());
                i.putExtra("id_transaksi", singleItem.getIdTransaksi());
                i.putExtra("complete", "true");
                i.putExtra("response", String.valueOf(singleItem.status));
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                mContext.startActivity(i);
            });
        } else if (singleItem.status == 6 || singleItem.status == 7) {  //pending - Verified
            if (singleItem.status == 6) {
                holder.keterangan.setTextColor(mContext.getResources().getColor(R.color.yellow));
                holder.keterangan.setBackgroundResource(R.drawable.rectangle_yellow_border_5dp);
            } else {
                holder.keterangan.setTextColor(mContext.getResources().getColor(R.color.aayo_green));
                holder.keterangan.setBackgroundResource(R.drawable.rectangle_green_border_5dp);
            }
            holder.nominal.setTextColor(mContext.getResources().getColor(R.color.red));
//            holder.background.setBackground(mContext.getResources().getDrawable(R.drawable.btn_rect_red));
            holder.itemlayout.setOnClickListener(v -> {
                Log.d("value", "6-7");
                Intent i = new Intent(mContext, ProgressActivity.class);
                i.putExtra("id_driver", singleItem.getIdDriver());
                i.putExtra("id_transaksi", singleItem.getIdTransaksi());
                i.putExtra("response", String.valueOf(singleItem.status));
                i.putExtra("complete", "true");
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                mContext.startActivity(i);

            });
        } else if (singleItem.status == 3) {
            holder.keterangan.setTextColor(mContext.getResources().getColor(R.color.aayo_blue));
            holder.keterangan.setBackgroundResource(R.drawable.rectangle_blue_border_5dp);
            holder.nominal.setTextColor(mContext.getResources().getColor(R.color.colorgradient));
//            holder.background.setBackground(mContext.getResources().getDrawable(R.drawable.btn_rect));
            holder.itemlayout.setOnClickListener(v -> {
                Log.d("value", "other");
                Intent i = new Intent(mContext, ProgressActivity.class);
                i.putExtra("id_driver", singleItem.getIdDriver());
                i.putExtra("id_transaksi", singleItem.getIdTransaksi());
                i.putExtra("response", String.valueOf(singleItem.status));
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                mContext.startActivity(i);

            });
        } else {
            holder.keterangan.setTextColor(mContext.getResources().getColor(R.color.aayo_green));
            holder.keterangan.setBackgroundResource(R.drawable.rectangle_green_border_5dp);
            holder.nominal.setTextColor(mContext.getResources().getColor(R.color.colorgradient));
//            holder.background.setBackground(mContext.getResources().getDrawable(R.drawable.btn_rect));
            holder.itemlayout.setOnClickListener(v -> {
                Log.d("value", "other");
                Intent i = new Intent(mContext, ProgressActivity.class);
                i.putExtra("id_driver", singleItem.getIdDriver());
                i.putExtra("id_transaksi", singleItem.getIdTransaksi());
                i.putExtra("response", String.valueOf(singleItem.status));
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                mContext.startActivity(i);

            });
        }


    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    static class ItemRowHolder extends RecyclerView.ViewHolder {
        TextView tanggal, nominal, keterangan, rating, startAddress, destinationAddress;
        //        ImageView background, images;
        ImageView images, rideType;
        View itemlayout;

        ItemRowHolder(View itemView) {
            super(itemView);
//            background = itemView.findViewById(R.id.background);
            images = itemView.findViewById(R.id.image);
            rideType = itemView.findViewById(R.id.asd);
            tanggal = itemView.findViewById(R.id.texttanggal);
            nominal = itemView.findViewById(R.id.price);
            keterangan = itemView.findViewById(R.id.textket);
            itemlayout = itemView.findViewById(R.id.mainlayout);
            startAddress = itemView.findViewById(R.id.pickupAddress);
            destinationAddress = itemView.findViewById(R.id.destinationAddress);
        }
    }


}
