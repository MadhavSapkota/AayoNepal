package com.ourdevelops.ourjek.activity.cart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ourdevelops.ourjek.databinding.ActivityCartBinding

class CartActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}