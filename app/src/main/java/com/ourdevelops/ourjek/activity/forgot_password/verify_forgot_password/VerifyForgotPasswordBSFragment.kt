package com.ourdevelops.ourjek.activity.forgot_password.verify_forgot_password

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.ChangepassActivity
import com.ourdevelops.ourjek.databinding.FragmentVerifyForgotPasswordBSBinding

class VerifyForgotPasswordBSFragment : BottomSheetDialogFragment() {
    lateinit var binding: FragmentVerifyForgotPasswordBSBinding
    private var fragment: Fragment? = null
    private lateinit var callBack: VerifyForgotPasswordInterface
    private lateinit var otpText: String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentVerifyForgotPasswordBSBinding.inflate(inflater, container, false)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle)
        buttonClicks()
        return binding.root
    }

    private fun buttonClicks() {
        binding.buttonconfirm.setOnClickListener { verifyCode() }
    }

    private fun verifyCode() {
        if(binding.pinviewOtp.text!!.equals("")){
            if(!binding.buttonconfirm.equals("")){
                callBack.onStartProgress()
                if(otpText.equals(binding.pinviewOtp.text)){
                    callBack.onStopProgress()
                }
            } else {
                binding.sendtotxt.text = "verification code cant be empty!"
            }
        } else {
            binding.sendtotxt.text = "verification code cant be empty!"
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment = this
        getBundles()
    }

    private fun getBundles() {
        val bundle = this.arguments
        otpText = bundle?.getString("otp").toString()
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
    }

    fun setInterface(callback : VerifyForgotPasswordInterface){
        this.callBack = callback
    }

}