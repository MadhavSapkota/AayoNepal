package com.ourdevelops.ourjek.item;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.databinding.NewItemTransaksiBinding;
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum;
import com.ourdevelops.ourjek.utils.AppLogger;
import com.ourdevelops.ourjek.utils.Utility;

import java.util.ArrayList;
import java.util.List;

public class CartRecyclerViewAdapter extends RecyclerView.Adapter<CartRecyclerViewAdapter.ViewHolder> {
    private Context context;
    List<Datum> cartdata = new ArrayList<>();
    OnQunatityIncreasesClicked onQunatityIncreasesClicked;
    OnDeleteItem onDeleteItem;
    int itemcount;
    private onQuantityChanged onQuantityChange;

    public CartRecyclerViewAdapter(Context applicationContext) {
        this.context = applicationContext;
    }

    @Override
    public CartRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_item_transaksi, parent, false);
        return new ViewHolder(rowItem);
    }

    @Override
    public void onBindViewHolder(CartRecyclerViewAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.binding.namalayanan.setText(cartdata.get(position).getNamaItem());
        holder.binding.deskripsi.setText(cartdata.get(position).getDeskripsiItem());

        holder.binding.quantityText.setText(String.valueOf(cartdata.get(position).getQuantity()));
//        holder.notesText.setEnabled(quantity > 0);
//        holder.notesText.setText(catatan);

//        holder.notesText.addTextChangedListener(catatanUpdater);
        try {
            if (cartdata.get(position).getStatusPromo().equals("1")) {
                holder.binding.promobadge.setVisibility(View.VISIBLE);
                holder.binding.shimreview.setVisibility(View.VISIBLE);
                holder.binding.shimreview.startShimmerAnimation();
                holder.binding.hargapromo.setVisibility(View.VISIBLE);
                Utility.currencyTXT(holder.binding.hargapromo, String.valueOf(cartdata.get(position).getItemPrice()), context);
                Utility.currencyTXT(holder.binding.harga, String.valueOf(cartdata.get(position).getHargaPromo()), context);

                holder.binding.hargapromo.setPaintFlags(holder.binding.hargapromo.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                holder.binding.deskripsi.setMinLines(2);
            } else {
                holder.binding.promobadge.setVisibility(View.GONE);
                holder.binding.shimreview.setVisibility(View.GONE);
                holder.binding.shimreview.stopShimmerAnimation();
                holder.binding.hargapromo.setVisibility(View.GONE);
                Utility.currencyTXT(holder.binding.harga, String.valueOf(cartdata.get(position).getItemPrice()), context);
            }

            itemcount = Integer.parseInt(cartdata.get(position).getQuantity());


        } catch (Exception e) {
            e.printStackTrace();
        }

//        holder.binding.lladdrcostemove.setOnClickListener(view -> {
//            onQunatityIncreasesClicked.onAddClick(cartdata.get(position), getCount(itemcount));
//        });

        holder.binding.addQuantity.setOnClickListener(view -> {
            int num = Integer.parseInt(holder.binding.quantityText.getText().toString())+1;
            Log.d("quantity", "onBindViewHolder: "+num);
            holder.binding.quantityText.setText(String.valueOf(num));
            onQuantityChange.onAddClick(String.valueOf(num), position);
        });

        holder.binding.removeQuantity.setOnClickListener(view -> {
            int num = Integer.parseInt(holder.binding.quantityText.getText().toString());
            if(num!=1 ){
                num -= 1;
                Log.d("quantity", "onBindViewHolder: "+num);
                holder.binding.quantityText.setText(String.valueOf(num));
                onQuantityChange.onMinusClick(String.valueOf(num), position);
            }
        });

        holder.binding.btnDelete.setOnClickListener(view -> {
            onDeleteItem.onDeleteClick(cartdata.get(position).getIdItem());
        });

        holder.binding.etNotes.setText(cartdata.get(position).getNotes());

        Log.d("onCart", "onBindViewHolder: "+position);
        Log.d("onCart", "onBindViewHolder: "+ cartdata.get(position).getDeskripsiItem());
//        holder.binding.etNotes.setText(position);

        holder.binding.etNotes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if ((cartdata.size() - 1) >= position) {
                    cartdata.get(position).setNotes(String.valueOf(s));
                }
            }
        });

        if (position == cartdata.size() - 1) {
            holder.binding.margin.setVisibility(View.GONE);
        }
    }

    private Integer getCount(int count) {
        itemcount = count + 1;
        return itemcount;
    }

    @Override
    public int getItemCount() {
        return this.cartdata.size();
    }

    public void setCartData(List<Datum> data) {
        cartdata.clear();
        if (data != null) {
            cartdata.addAll(data);
        }
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        NewItemTransaksiBinding binding;


        public ViewHolder(View view) {
            super(view);
            binding = NewItemTransaksiBinding.bind(view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }

    public interface OnQunatityIncreasesClicked {
        void onAddClick(Datum datum, Integer count);
    }

    public interface onQuantityChanged{
        void onAddClick(String quantity, int position);
        void onMinusClick(String quantity, int position);
    }

    public void onQuantityChangeListener(onQuantityChanged onQuantityChanged){
        this.onQuantityChange = onQuantityChanged;
    }

    public void onQuantityIncreaseClickedListener(OnQunatityIncreasesClicked qunatityIncreasesClicked) {
        this.onQunatityIncreasesClicked = qunatityIncreasesClicked;
    }

    public interface OnDeleteItem {
        void onDeleteClick(String idItem);
    }

    public void onItemDeleteClickListener(OnDeleteItem onDeleteItem) {
        this.onDeleteItem = onDeleteItem;
    }
}