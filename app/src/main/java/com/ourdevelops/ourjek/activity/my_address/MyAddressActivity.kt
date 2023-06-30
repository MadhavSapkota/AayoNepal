package com.ourdevelops.ourjek.activity.my_address

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourjek.activity.edit_address.EditAddressActivity
import com.ourdevelops.ourjek.databinding.ActivityMyAddressBinding
import com.ourdevelops.ourjek.json.SavedAddressObj


class MyAddressActivity : AppCompatActivity(), MyAddressesAdapter.OnAddressClickListener {

    private lateinit var binding: ActivityMyAddressBinding
    private lateinit var viewModel: MyAddressViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyAddressBinding.inflate(layoutInflater)
        viewModel = MyAddressViewModel()
        setContentView(binding.root)
        initializeView()
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.myAddresses.observe(this) {
            (binding.myAddressesRv.adapter as MyAddressesAdapter).submitList(it)
        }
    }

    private fun initializeView() {
        binding.apply {
            backBtnVerify.setOnClickListener { onBackPressed() }
            myAddressesRv.apply {
                layoutManager = LinearLayoutManager(this@MyAddressActivity)
                adapter =
                    MyAddressesAdapter().apply { setOnAddressClickListener(this@MyAddressActivity) }
                addItemDecoration(
                    DividerItemDecoration(
                        context,
                        DividerItemDecoration.VERTICAL
                    )
                )
            }
        }
    }

    override fun onAddressClicked(position: Int, savedAddressObj: SavedAddressObj) {
        startActivity(Intent(this, EditAddressActivity::class.java).apply {
            putExtras(
                EditAddressActivity.getBundle(savedAddressObj)
            )
        })
    }
}