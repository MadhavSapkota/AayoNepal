package com.ourdevelops.ourjek.fragment.new_profile

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.fragment.new_profile.rv_items.ProfileHeadView
import com.ourdevelops.ourjek.fragment.new_profile.rv_items.ProfileItemView
import com.ourdevelops.ourjek.fragment.new_profile.rv_items.ProfileLogoutVIew
import com.ourdevelops.ourjek.models.profile.ProfileObject
import com.ourdevelops.ourjek.models.profile.ProfileViewType

class NewProfileAdapter(var mlist : ArrayList<ProfileObject>, val activity: Activity?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val viewTypeHead = 0
    private val viewTypeItem = 1
    private val viewTypeLogout = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            viewTypeHead -> ProfileHeadView(inflater.inflate(R.layout.row_profile_head, parent, false))
            viewTypeItem -> ProfileItemView(inflater.inflate(R.layout.row_profile_item, parent, false))
            else -> ProfileLogoutVIew(inflater.inflate(R.layout.row_profile_item, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ProfileHeadView -> holder.setupViews()
            is ProfileLogoutVIew -> holder.setupViews(activity)
            is ProfileItemView -> holder.setupViews(mlist[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (mlist[position].viewType) {
            ProfileViewType.item -> viewTypeItem
            ProfileViewType.logout -> viewTypeLogout
            else -> return viewTypeHead
        }
    }

    override fun getItemCount(): Int {
        return mlist.size
    }
}