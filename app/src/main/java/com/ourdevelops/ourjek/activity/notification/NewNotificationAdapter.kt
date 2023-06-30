package com.ourdevelops.ourjek.activity.notification

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.models.NewNotificationModel

class NewNotificationAdapter(
    val applicationContext: Context,
    val presenter: NewNotificationPresenter,
    val mList: ArrayList<NewNotificationModel>
): RecyclerView.Adapter<NotificationView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationView {
        return NotificationView(
            LayoutInflater.from(parent.context).inflate(R.layout.notification_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NotificationView, position: Int) {
        holder.setUpView(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}
