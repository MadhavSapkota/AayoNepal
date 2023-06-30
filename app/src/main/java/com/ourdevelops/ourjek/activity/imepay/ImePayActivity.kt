package com.ourdevelops.ourjek.activity.imepay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ourdevelops.ourjek.activity.forgot_password.ImePayPresenter
import com.ourdevelops.ourjek.databinding.ActivityImePayPickmeBinding
import com.ourdevelops.ourjek.utils.AppLogger
import com.swifttechnology.imepaysdk.ENVIRONMENT
import com.swifttechnology.imepaysdk.IMEPayment
import com.swifttechnology.imepaysdk.IMEPaymentCallback

class ImePayActivity : AppCompatActivity(), ImePayContractor.View {
    private lateinit var binding : ActivityImePayPickmeBinding
    private lateinit var presenter : ImePayPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImePayPickmeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = ImePayPresenter(this, this)
        buttonClicks()
    }

    private fun buttonClicks() {
        binding.imgBack.setOnClickListener {
            finish()
        }

        binding.btnMakePayment.setOnClickListener {
//            AppLogger.log("this is printing")
            makePayment()
        }

    }



    fun makePayment() {

    }
}