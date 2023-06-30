package com.ourdevelops.ourjek.activity.my_address

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.databinding.MyAddressesRowItemBinding
import com.ourdevelops.ourjek.json.SavedAddressObj


class MyAddressesAdapter : ListAdapter<SavedAddressObj, MyAddressesAdapter.ViewHolder>(diffUtil) {

    private var onAddressClickListener: OnAddressClickListener? = null

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<SavedAddressObj>() {
            override fun areItemsTheSame(
                oldItem: SavedAddressObj,
                newItem: SavedAddressObj
            ): Boolean =
                oldItem.address_latitude == newItem.address_longitude
                        && oldItem.address_longitude == newItem.address_longitude

            override fun areContentsTheSame(
                oldItem: SavedAddressObj,
                newItem: SavedAddressObj
            ): Boolean = oldItem == newItem

        }
    }

    fun setOnAddressClickListener(onAddressClickListener: OnAddressClickListener) {
        this.onAddressClickListener = onAddressClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            MyAddressesRowItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.updateView(getItem(position))
    }

    inner class ViewHolder(private val view: MyAddressesRowItemBinding) :
        RecyclerView.ViewHolder(view.root) {
        fun updateView(savedAddressObj: SavedAddressObj) {
            view.apply {
                title.text = savedAddressObj.address_type_name.uppercase()
                subTitle.text = savedAddressObj.address_name
                edit.setOnClickListener {
                    onAddressClickListener?.onAddressClicked(
                        bindingAdapterPosition,
                        savedAddressObj
                    )
                }
            }
        }
    }

    interface OnAddressClickListener {
        fun onAddressClicked(position: Int, savedAddressObj: SavedAddressObj)
    }
}