package com.ourdevelops.ourjek.item;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.models.FiturModel;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;

import java.util.List;


public class AllBookItem extends RecyclerView.Adapter<AllBookItem.ItemRowHolder> {

    private  int row_index = -1;
    private List<FiturModel> dataList;
    private Context mContext;
    private int rowLayout;
    private OnItemClickListener mItemClickListener;


    public AllBookItem(Context context, List<FiturModel> dataList, int rowLayout) {
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
        final FiturModel singleItem = dataList.get(position);

            holder.text.setText(singleItem.getFitur());
            PicassoTrustAll.getInstance(mContext)
                    .load(Constants.IMAGESFITUR + singleItem.getIcon())
                    .resize(100, 100)
                    .into(holder.image);

            holder.itemView.setOnClickListener(v -> {
                mItemClickListener.onItemClick(holder.itemView, holder.getAdapterPosition(), dataList.get(holder.getAdapterPosition()));
                row_index = position;
                notifyDataSetChanged();
            });

            if (row_index == position) {
                holder.itemView.setBackground(mContext.getResources().getDrawable(R.drawable.bg_rounded_light_grey));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    holder.itemView.setElevation(1);
                }

            } else {
                holder.itemView.setElevation(0);
                holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
            }
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    public class ItemRowHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView background, image;

        ItemRowHolder(View itemView) {
            super(itemView);
            background = itemView.findViewById(R.id.background);
            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.text);

        }
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position, FiturModel model);
    }
}