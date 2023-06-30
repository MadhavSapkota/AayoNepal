package com.ourdevelops.ourjek.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.databinding.NewItemTimetableBinding;
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum;
import com.ourdevelops.ourjek.models.Daymodel;

import java.util.ArrayList;
import java.util.List;

public class MercahntTimeTableAdapter extends RecyclerView.Adapter<MercahntTimeTableAdapter.ViewHolder> {
private  Context context;
    List<Datum> cartdata = new ArrayList<>();
    OnQunatityIncreasesClicked onQunatityIncreasesClicked;
    OnDeleteItem onDeleteItem;

    ArrayList<Daymodel> daysLists = new ArrayList<>();
    int itemcount;
    public MercahntTimeTableAdapter(Context applicationContext) {
        this.context = applicationContext;
    }

    @Override
    public MercahntTimeTableAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_item_timetable, parent, false);
        return new ViewHolder(rowItem);
    }

    @Override
    public void onBindViewHolder(MercahntTimeTableAdapter.ViewHolder holder, int position) {
        holder.binding.tvDays.setText(daysLists.get(position).getDay());
        holder.binding.tvTime.setText(daysLists.get(position).getTime());

    }

    private Integer getCount(int count) {
        itemcount = count + 1;
        return  itemcount;
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public void setCartData(List<Datum> data) {
        cartdata.clear();
        if (data!=null){
            cartdata.addAll(data);
        }
        notifyDataSetChanged();
    }

    public void setdata(ArrayList<Daymodel> daysList) {
        daysLists.clear();
        daysLists.addAll(daysList);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        NewItemTimetableBinding binding;

        public ViewHolder(View view) {
            super(view);
            binding = NewItemTimetableBinding.bind(view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }


    public  interface OnQunatityIncreasesClicked{
        void onAddClick(Datum datum, Integer count);

    }

    public void onQuantityIncreaseClickedListener(OnQunatityIncreasesClicked qunatityIncreasesClicked){
        this.onQunatityIncreasesClicked = qunatityIncreasesClicked;
    }

    public  interface  OnDeleteItem{
        void  onDeleteClick(String idItem);
    }

    public  void onItemDeleteClickListener( OnDeleteItem onDeleteItem ){
        this.onDeleteItem = onDeleteItem;
    }
}