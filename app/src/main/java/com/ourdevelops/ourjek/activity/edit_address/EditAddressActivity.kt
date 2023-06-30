package com.ourdevelops.ourjek.activity.edit_address

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ourdevelops.ourjek.databinding.ActivityEditAddressBinding
import com.ourdevelops.ourjek.json.SavedAddressObj
import java.security.InvalidParameterException

class EditAddressActivity : AppCompatActivity() {

    companion object {
        private const val KEY_SAVED_ADDRESS = "savedAddress"

        fun getBundle(savedAddressObj: SavedAddressObj): Bundle =
            Bundle().apply {
                putSerializable(KEY_SAVED_ADDRESS, savedAddressObj)
            }
    }

    private lateinit var savedAddressObj: SavedAddressObj
    private lateinit var binding: ActivityEditAddressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        savedAddressObj = intent.extras?.get(KEY_SAVED_ADDRESS) as? SavedAddressObj
            ?: throw InvalidParameterException("No SavedAddressObj class object provided as serializable extra")

        binding = ActivityEditAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeView()
    }

    private fun initializeView() {
        binding.apply {
            backBtnVerify.setOnClickListener { onBackPressed() }
            title.setText(savedAddressObj.address_type_name)
            address.setText(savedAddressObj.address_name)
        }
    }
}