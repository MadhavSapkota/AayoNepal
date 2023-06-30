package com.ourdevelops.ourjek.activity.riderequest.ride_progress

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ourdevelops.ourjek.databinding.ActivityNewRideProgressBinding

class NewRideProgressActivity : AppCompatActivity() {
    private lateinit var binding : ActivityNewRideProgressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewRideProgressBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}