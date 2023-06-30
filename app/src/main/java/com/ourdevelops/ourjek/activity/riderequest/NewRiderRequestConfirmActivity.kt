package com.ourdevelops.ourjek.activity.riderequest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ourdevelops.ourjek.databinding.ActivityNewRiderRequestBinding

class NewRiderRequestConfirmActivity : AppCompatActivity() {
    private lateinit var binding : ActivityNewRiderRequestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewRiderRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}