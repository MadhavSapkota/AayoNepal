package com.ourdevelops.ourjek.activity.save_address.address_types

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.models.save_address.AddressTypeModel

class AddressTypesAdapter(val mlist: ArrayList<AddressTypeModel>, val callBack : AddressTypeCallBack) :
    RecyclerView.Adapter<AddressTypeItemVIew>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddressTypeItemVIew {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_address_type, parent, false)
        return AddressTypeItemVIew(view)
    }

    override fun onBindViewHolder(holder: AddressTypeItemVIew, position: Int) {
        holder.setupViews(mlist[position])
        holder.itemView.setOnClickListener {
            if (!mlist[position].isSelected) {
                callBack.selectedItem(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return mlist.size
    }
}