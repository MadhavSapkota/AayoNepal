package com.ourdevelops.ourjek.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.models.VehicleModel;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;

import java.util.List;

public class VechicleItem extends RecyclerView.Adapter<VechicleItem.ItemRowHolder> {

    private List<VehicleModel> dataList;
    private Context mContext;
    private int rowLayout;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(VehicleModel item);
    }

    public VechicleItem(Context context, List<VehicleModel> dataList, int rowLayout, OnItemClickListener listener) {
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
        final VehicleModel singleItem = dataList.get(position);
        if (singleItem.getActive() == 1) {
            holder.text.setText(singleItem.getVehicle_category_name());
            PicassoTrustAll.getInstance(mContext)
                    .load(Constants.IMAGESVEHCILECAT + singleItem.getIcon())
                    .resize(100, 100)
                    .into(holder.image);
//            if (position == 0) {
//                PicassoTrustAll.getInstance(mContext)
//                        .load(R.drawable.ic_two_wheeler)
//                        .resize(100, 100)
//                        .into(holder.image);
//            }
//            if (position == 1) {
//                PicassoTrustAll.getInstance(mContext)
//                        .load(R.drawable.ic_logistic)
//                        .resize(100, 100)
//                        .into(holder.image);
//            }
//            if (position == 2) {
//                PicassoTrustAll.getInstance(mContext)
//                        .load(R.drawable.ic_four_wheeler)
//                        .resize(100, 100)
//                        .into(holder.image);
//            }
//            if (position == 3) {
//                PicassoTrustAll.getInstance(mContext)
//                        .load(R.drawable.ic_food)
//                        .resize(100, 100)
//                        .into(holder.image);
//            }
//            if (position == 4) {
//                PicassoTrustAll.getInstance(mContext)
//                        .load(R.drawable.ic_mart)
//                        .resize(100, 100)
//                        .into(holder.image);
//            }


            holder.bind(singleItem, listener);
        }
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    class ItemRowHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView background, image;

        ItemRowHolder(View itemView) {
            super(itemView);
            background = itemView.findViewById(R.id.background);
            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.text);
        }

        public void bind(final VehicleModel item, final OnItemClickListener listener) {


            background.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
