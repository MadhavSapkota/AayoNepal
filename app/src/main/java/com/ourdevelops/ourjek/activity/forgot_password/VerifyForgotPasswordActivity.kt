package com.ourdevelops.ourjek.activity.forgot_password

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ourdevelops.ourjek.activity.ChangepassActivity
import com.ourdevelops.ourjek.databinding.ActivityVerifyForgotPasswordBinding
import com.ourdevelops.ourjek.json.LoginRequestJson
import com.ourdevelops.ourjek.json.LoginResponseJson
import com.ourdevelops.ourjek.models.User
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class VerifyForgotPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerifyForgotPasswordBinding
    private var otpText: String? = null
    private  var phnumber: String? = null
    private var old_pass: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerifyForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvResendCode.isEnabled = false
        startTimer()
        buttonClicks()
        getIntentData()
    }

    private fun getIntentData() {
        if(!intent.equals(null)){
            Log.d("otp", "getIntentData: "+intent.getIntExtra("otp", 0))
            otpText = intent.getIntExtra("otp", 0).toString()
            phnumber = intent.getStringExtra("number")
            old_pass = intent.getStringExtra("old-pass")
        }
    }

    private fun buttonClicks() {
        binding.tvResendCode.setOnClickListener {
            get()
            binding.tvResendCode.isEnabled = false
        }

        binding.buttonconfirm.setOnClickListener { verifyCode() }
    }

    private fun verifyCode() {
        if(!binding.pinviewOtp.text!!.equals("")){
            if(!binding.buttonconfirm.equals("")){
                Log.d("otp", "verifyCode: "+otpText+"---"+binding.pinviewOtp.text)
                progressshow()
                if(binding.pinviewOtp.text.toString().equals(otpText)){
                    Log.d("otp", "verifyCode: "+otpText+"---"+binding.pinviewOtp.text)
                    progresshide()
                    finish()
                    startActivity(Intent(this, ChangepassActivity::class.java).putExtra("number", phnumber).putExtra("oldpass", old_pass).putExtra("otp", otpText))
                }else{
                    progresshide()
                    Log.d("otp", "verifyCode: "+otpText+"---"+binding.pinviewOtp.text)
                    binding.sendtotxt.text = "Verification code is wrong. Try Again!"
                }
            } else {
                binding.sendtotxt.text = "verification code cant be empty!"
            }
        } else {
            binding.sendtotxt.text = "verification code cant be empty!"
        }
    }

    private fun startTimer() {
        binding.llTimer.visibility = View.VISIBLE
        object : CountDownTimer(120000, 1000) {
            //Set Timer for 5 seconds
            override fun onTick(millisUntilFinished: Long) {
                binding.otpTimer.text = (millisUntilFinished / 1000).toString() + "s"
            }

            override fun onFinish() {
                binding.tvResendCode.isEnabled = true
                binding.llTimer.visibility = View.GONE
            }
        }.start()
    }


    fun progressshow() {
        binding.rlprogress.setVisibility(View.VISIBLE)
    }

    fun progresshide() {
        binding.rlprogress.setVisibility(View.GONE)
    }

    fun notif(text: String?) {
        binding.rlnotif2.visibility = View.VISIBLE
        binding.textnotif2.text = text
        Handler().postDelayed({ binding.rlnotif2.visibility = View.GONE }, 3000)
    }

    private fun get() {
        progressshow()
        val request = LoginRequestJson()
        request.noTelepon = phnumber

        val service = ServiceGenerator.createService(UserService::class.java, request.noTelepon, "12345",request.token)
        service.forgot(request).enqueue(object : Callback<LoginResponseJson?> {
            override fun onResponse(call: Call<LoginResponseJson?>,response: Response<LoginResponseJson?>) {
                progresshide()
                if (response.isSuccessful) {
                    if (Objects.requireNonNull(response.body())!!.message.equals("found", ignoreCase = true)) {
                        phnumber = response.body()!!.data?.get(0)?.phone
                        notif("Verification code sent!")
                        startTimer()
                    } else {
                        notif("Number Not Registered")
                        binding.buttonconfirm.isEnabled = true
                    }
                }
            }

            override fun onFailure(call: Call<LoginResponseJson?>, t: Throwable) {
                progresshide()
                t.printStackTrace()
                notif("error")
            }
        })
    }


}