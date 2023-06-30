package com.ourdevelops.ourjek.activity.cart.checkout

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.RowPaymentMethodBinding
import com.ourdevelops.ourjek.models.PaymentMethodObject
import com.ourdevelops.ourjek.models.PaymentMethods

class PaymentMethodItemView(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowPaymentMethodBinding.bind(itemView)

    fun setupViews(obj : PaymentMethodObject) {
        when(obj.paymentMethod) {
            PaymentMethods.imePay -> {
                binding.imgWalletPaymentMethod.visibility = View.VISIBLE
                binding.imgPaymentMethod.visibility = View.GONE
                setTitleImage("IME Pay", "Pay using IME Pay", R.drawable.ic_imepaylogo, PaymentMethods.imePay.name)
            }
            PaymentMethods.prabhuPay -> {
                binding.imgWalletPaymentMethod.visibility = View.VISIBLE
                binding.imgPaymentMethod.visibility = View.GONE
                setTitleImage("Prabhu Pay", "Pay using Prabhu Pay", R.drawable.prabhupaylogo, PaymentMethods.prabhuPay.name)
            }
            PaymentMethods.cashOnDelivery -> {
                binding.imgWalletPaymentMethod.visibility = View.GONE
                binding.imgPaymentMethod.visibility = View.VISIBLE
                setTitleImage(
                    "Cash on delivery",
                    "Pay after service.",
                    R.drawable.ic_wallet_new,
                PaymentMethods.cashOnDelivery.name)
            }
        }
        if (obj.isSelected) {
            setSelected()
        }
        else {
            setUnSelected()
        }
    }

    private fun setSelected() {
        binding.imgSelected.visibility = View.VISIBLE
        binding.bgLayout.background = ContextCompat.getDrawable(itemView.context, R.drawable.row_rounded_outlined_bg)
    }

    private fun setUnSelected() {
        binding.imgSelected.visibility = View.GONE
        binding.bgLayout.background = ContextCompat.getDrawable(itemView.context, R.drawable.row_rounded_unselected_bg)
    }

    private fun setTitleImage(title: String, caption: String, image: Int, name: String) {
        binding.tvPaymentTitle.text = title
        binding.tvPaymentCaption.text = caption
        when(name){
            PaymentMethods.imePay.name -> {
                binding.imgWalletPaymentMethod.setImageResource(image)
            }
            PaymentMethods.prabhuPay.name -> {
                binding.imgWalletPaymentMethod.setImageResource(image)
            }
            PaymentMethods.cashOnDelivery.name -> {
                binding.imgPaymentMethod.setImageResource(image)
            }
        }
    }
}