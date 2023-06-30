package com.ourdevelops.ourjek.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.models.MessageModel;

import java.util.ArrayList;

public class MessageItemRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private ArrayList<MessageModel> modelList;

    private OnItemClickListener mItemClickListener;

    public MessageItemRecyclerAdapter(Context applicationContext, ArrayList<MessageModel> MessageModels) {
        this.mContext = applicationContext;
        this.modelList = MessageModels;
    }


    public void updateList(ArrayList<MessageModel> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_message, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        //Here you can fill your row view
        if (holder instanceof ViewHolder) {
            final MessageModel model = getItem(position);
            ViewHolder genericViewHolder = (ViewHolder) holder;
            if(model != null) {

                genericViewHolder.fullname.setText(model.getTitle());
                genericViewHolder.message.setText(model.getMessage());
                if (model.getType() != null) {
                    if (model.getType().matches("new")) {
                        genericViewHolder.datetxt.setText("");
                        genericViewHolder.datetxt.setBackground(mContext.getResources().getDrawable(R.drawable.btn_rect_red));
                    }
                }
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

    private MessageModel getItem(int position) {
        return modelList.get(position);
    }


    public interface OnItemClickListener {
        void onItemClick(View view, int position, MessageModel model);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView fullname, datetxt, message;


        public ViewHolder(final View itemView) {
            super(itemView);


            this.fullname = itemView.findViewById(R.id.fullname);
            this.datetxt = itemView.findViewById(R.id.datetxt);
            this.message = itemView.findViewById(R.id.message);



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