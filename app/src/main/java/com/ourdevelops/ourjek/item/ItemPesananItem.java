package com.ourdevelops.ourjek.item;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.models.ItemPesananModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by ourdevelops team on 3/24/2019.
 */

public class ItemPesananItem extends RecyclerView.Adapter<ItemPesananItem.ItemRowHolder> {

    private List<ItemPesananModel> dataList;
    private int rowLayout;

    public ItemPesananItem( List<ItemPesananModel> dataList, int rowLayout) {
        this.dataList = dataList;
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
        final ItemPesananModel singleItem = dataList.get(position);
        holder.name.setText(singleItem.getNama_item());
        holder.qty.setText("Qty- " + singleItem.getJumlah_item());
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    static class ItemRowHolder extends RecyclerView.ViewHolder {
        TextView name,qty;

        ItemRowHolder(View itemView) {
            super(itemView);
            qty = itemView.findViewById(R.id.qty);
            name = itemView.findViewById(R.id.namaitem);

        }
    }
}
