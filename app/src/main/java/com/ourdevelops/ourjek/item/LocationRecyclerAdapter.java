package com.ourdevelops.ourjek.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.models.LocalLocationModel;

import java.util.ArrayList;

import io.realm.RealmResults;

public class LocationRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private RealmResults<LocalLocationModel> modelList;

    private OnItemClickListener mItemClickListener;

    public LocationRecyclerAdapter(Context applicationContext, RealmResults<LocalLocationModel> LocalLocationModels) {
        this.mContext = applicationContext;
        this.modelList = LocalLocationModels;
    }


    public void updateList(RealmResults<LocalLocationModel> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_location, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        //Here you can fill your row view
        if (holder instanceof ViewHolder) {
            final LocalLocationModel model = getItem(position);
            ViewHolder genericViewHolder = (ViewHolder) holder;
            if (model != null) {

                genericViewHolder.text.setText(model.getName());
            }


        }
    }


    @Override
    public int getItemCount() {

        return modelList.size();
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    private LocalLocationModel getItem(int position) {
        return modelList.get(position);
    }


    public interface OnItemClickListener {
        void onItemClick(View view, int position, LocalLocationModel model);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView text;


        public ViewHolder(final View itemView) {
            super(itemView);


            this.text = itemView.findViewById(R.id.text);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mItemClickListener.onItemClick(itemView, getAdapterPosition(), modelList.get(getAdapterPosition()));


                }
            });

        }
    }

    public void deleteItem(int position) {
        modelList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, modelList.size());
        notifyDataSetChanged();
    }

}