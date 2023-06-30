package com.ourdevelops.ourjek.activity.cart.checkout

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.models.PaymentMethodObject
import java.util.*
import kotlin.collections.ArrayList

class PaymentMethodAdapter(val context : Context, var mlist : ArrayList<PaymentMethodObject>, val view : PaymentMethodContractor)  : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_payment_method, parent, false)
        return PaymentMethodItemView(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vh = holder as PaymentMethodItemView
        vh.setupViews(mlist[position])
        vh.itemView.setOnClickListener {
            view.onPaymentMethodChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return mlist.size
    }
}