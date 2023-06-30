package com.ourdevelops.ourjek.item;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.allmerchant.AllMerchantActivity;
import com.ourdevelops.ourjek.activity.RentCarActivity;
import com.ourdevelops.ourjek.activity.RideCarActivity;
import com.ourdevelops.ourjek.activity.SendActivity;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.models.FiturDataModel;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by otacodes on 3/24/2019.
 */

public class FiturItem extends RecyclerView.Adapter<FiturItem.ItemRowHolder> {

    private List<FiturDataModel> dataList;
    private Context mContext;
    private int rowLayout;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(FiturDataModel item);
    }

    public FiturItem(Context context, List<FiturDataModel> dataList, int rowLayout, OnItemClickListener listener) {
        this.dataList = dataList;
        this.mContext = context;
        this.rowLayout = rowLayout;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ItemRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ItemRowHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemRowHolder holder, final int position) {
        final FiturDataModel singleItem = dataList.get(position);
        holder.text.setText(singleItem.getFitur());
            PicassoTrustAll.getInstance(mContext)
                    .load(Constants.IMAGESFITUR + singleItem.getIcon())
                    .resize(100, 100)
                    .into(holder.image);


        switch (singleItem.getHome()) {
            case "1":
                holder.background.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(mContext, RideCarActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("FiturKey", singleItem.getIdFitur());
                        i.putExtra("job", singleItem.getJob());
                        i.putExtra("icon", singleItem.getIcon());
                        mContext.startActivity(i);

                    }
                });
                break;
            case "2":
                holder.background.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(mContext, SendActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("FiturKey", singleItem.getIdFitur());
                        i.putExtra("job", singleItem.getJob());
                        i.putExtra("icon", singleItem.getIcon());
                        mContext.startActivity(i);

                    }
                });
                break;
            case "3":
                holder.background.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(mContext, RentCarActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("FiturKey", singleItem.getIdFitur());
                        i.putExtra("icon", singleItem.getIcon());
                        mContext.startActivity(i);

                    }
                });
                break;
            case "4":
                holder.background.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(mContext, AllMerchantActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("FiturKey", singleItem.getIdFitur());
                        i.putExtra("job", singleItem.getJob());
                        i.putExtra("icon", singleItem.getIcon());
                        mContext.startActivity(i);

                    }
                });

//                if(singleItem.getFitur().matches("Food")) {
//                holder.background.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent i = new Intent(mContext, AllMerchantActivity.class);
//                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        i.putExtra("FiturKey", singleItem.getIdFitur());
//                        i.putExtra("job", singleItem.getJob());
//                        i.putExtra("icon", singleItem.getIcon());
//                        mContext.startActivity(i);
//
//                    }
//                });
//                }else{
//                    holder.background.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            Intent i = new Intent(mContext, RideCarActivity.class);
//                            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                            i.putExtra("FiturKey", singleItem.getIdFitur());
//                            i.putExtra("job", singleItem.getJob());
//                            i.putExtra("icon", singleItem.getIcon());
//                            mContext.startActivity(i);
//
//                        }
//                    });
//            }
                break;
        }
        if (singleItem.getHome().equals("0") && singleItem.getIdFitur() == 100) {
            holder.bind(singleItem, listener);
        }
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    class ItemRowHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView background,image;

        ItemRowHolder(View itemView) {
            super(itemView);
            background = itemView.findViewById(R.id.background);
            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.text);
        }

        public void bind(final FiturDataModel item, final OnItemClickListener listener) {

            if (item.getHome().equals("0")) {
                background.setBackground(mContext.getResources().getDrawable(R.drawable.button_round_2));
                    PicassoTrustAll.getInstance(mContext)
                            .load(R.drawable.ic_more)
                            .resize(100, 100)
                            .into(image);

                    background.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            listener.onItemClick(item);
                        }
                    });
            }
        }
    }
}
