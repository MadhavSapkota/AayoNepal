package com.ourdevelops.ourjek.item;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.models.KodePromoModel;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static android.content.Context.CLIPBOARD_SERVICE;

/**
 * Created by otacodes on 3/24/2019.
 */

public class PromoItem extends RecyclerView.Adapter<PromoItem.ItemRowHolder> {

    private List<KodePromoModel> dataList;
    private Context mContext;
    private int rowLayout;

    public PromoItem(Context context, List<KodePromoModel> dataList, int rowLayout) {
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

    @Override
    public void onBindViewHolder(@NonNull final ItemRowHolder holder, final int position) {
        final KodePromoModel singleItem = dataList.get(position);
        holder.name.setText(singleItem.getNamapromo());
        holder.kodepromo.setText(singleItem.getKodepromo());
        if (!singleItem.getImagepromo().isEmpty()) {
            PicassoTrustAll.getInstance(mContext)
                    .load(singleItem.getImagepromo())
                    .resize(250, 250)
                    .into(holder.images);
        }

        SimpleDateFormat timeFormat = new SimpleDateFormat("dd MMM yyyy", Locale.US);
        String finalDate = timeFormat.format(singleItem.getExpired());
        holder.expired.setText(finalDate);

        holder.salin.setOnClickListener(v -> {
            Toast.makeText(mContext, "Copied!", Toast.LENGTH_SHORT).show();
            android.content.ClipboardManager clipboard = (android.content.ClipboardManager) mContext.getSystemService(CLIPBOARD_SERVICE);
            android.content.ClipData clip = android.content.ClipData.newPlainText("Copied!", singleItem.getKodepromo());
            Objects.requireNonNull(clipboard).setPrimaryClip(clip);
        });


    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    static class ItemRowHolder extends RecyclerView.ViewHolder {
        TextView name, expired, kodepromo;
        ImageView images;
        Button salin;

        ItemRowHolder(View itemView) {
            super(itemView);
            images = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.nama);
            expired = itemView.findViewById(R.id.expired);
            kodepromo = itemView.findViewById(R.id.kodepromo);
            salin = itemView.findViewById(R.id.iv_appyCode);
        }
    }
}
