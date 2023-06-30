package com.ourdevelops.ourjek.activity.riderequest.saved_address

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestContractor
import com.ourdevelops.ourjek.json.SavedAddressObj

class SavedAddressRideRequestAdapter(val view : SavedAddressRequestInterface, var mlist : ArrayList<SavedAddressObj>, var showAll : Boolean) : RecyclerView.Adapter<SavedAddressRideRequestItemView>(){

    fun toggleShowAll(toggle : Boolean) {
        this.showAll = toggle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedAddressRideRequestItemView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_saved_address_ride_request, parent, false)
        return SavedAddressRideRequestItemView(view)
    }

    override fun onBindViewHolder(holder: SavedAddressRideRequestItemView, position: Int) {
        holder.setupViews(mlist[position])
        holder.itemView.setOnClickListener {
            view.onSavedAddressTapped(mlist[position])
        }
    }

    override fun getItemCount(): Int {
        return if (showAll) {
            mlist.size
        } else {
            if (mlist.size > 0) {
                1
            } else {
                0
            }
        }

    }

}