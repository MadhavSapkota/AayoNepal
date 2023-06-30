package com.ourdevelops.ourjek.activity.save_address

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.save_address.address_types.AddressTypeCallBack
import com.ourdevelops.ourjek.activity.save_address.address_types.AddressTypesAdapter
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes
import com.ourdevelops.ourjek.customviews.dialogs.CustomProgressDialog
import com.ourdevelops.ourjek.databinding.ActivitySaveUserAddressBinding
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.models.save_address.AddressTypeModel

class SaveUserAddressActivity : AppCompatActivity(), AddressTypeCallBack,
    SaveUserAddressContractor.View {
    private lateinit var presenter: SaveUserAddressPresenter
    private lateinit var binding: ActivitySaveUserAddressBinding
    private lateinit var adapter: AddressTypesAdapter
    private var locationWrapper: LocationWrapper? = null
    private var mlist = ArrayList<AddressTypeModel>()
    private var currentAddressType = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = SaveUserAddressPresenter(this.applicationContext, this)
        binding = ActivitySaveUserAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)
        receivingIntents()
        setupViews()
        buttonClicks()
    }

    private fun receivingIntents() {
        locationWrapper =
            intent.getSerializableExtra(IntentKeys.locationWrapper) as LocationWrapper?
    }

    private fun setupViews() {
        binding.tvAddressName.text = locationWrapper?.locationName
        mlist.clear()
        mlist.add(AddressTypeModel(R.drawable.ic_home, "Home", true, false, 1))
        mlist.add(AddressTypeModel(R.drawable.ic_work, "Work", false, false, 2))
        mlist.add(AddressTypeModel(R.drawable.ic_university, "College", false, false, 3))
        mlist.add(AddressTypeModel(R.drawable.ic_star, "Other", false, true, 4))
        binding.recyclerViewAddressTypes.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        adapter = AddressTypesAdapter(mlist, this)
        binding.recyclerViewAddressTypes.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    private fun buttonClicks() {
        binding.imgBack.setOnClickListener {
            finish()
        }

        binding.btnSave.setOnClickListener {
            CustomProgressDialog.showDialog("Saving Address", "Please wait..", this)
            presenter.saveAddress(
                locationWrapper,
                mlist[currentAddressType],
                binding.etAddressTitle.text.toString(),
                binding.etAdditionalInfo.text.toString()
            )
        }
    }

    override fun selectedItem(position: Int) {
        mlist[currentAddressType].isSelected = false
        mlist[position].isSelected = true
        currentAddressType = position
        adapter.notifyDataSetChanged()
        checkShowTitleCondition()
    }

    private fun checkShowTitleCondition() {
        if (mlist[currentAddressType].enableUserToAddName) {
            binding.layoutAddressName.visibility = View.VISIBLE
        } else {
            binding.layoutAddressName.visibility = View.GONE
        }
    }

    override fun onSaveSuccess() {
        CustomProgressDialog.dismissDialog()
        CustomDialogOkay.setTitle("Save successful").setMessage("Your address has been saved.")
            .showOnlyDialog(this, object : CustomDialogOkay.dialogOnClickListener {
                override fun onClick() {
                    finish()
                }

                override fun onClose() {
                    finish()
                }

            })
    }

    override fun onSaveFailure(errorMessage: String) {
        CustomProgressDialog.dismissDialog()
        CustomDialogOkay.setTitle("Error").setMessage(errorMessage)
            .showOnlyDialog(this, object : CustomDialogOkay.dialogOnClickListener {
                override fun onClick() {

                }

                override fun onClose() {

                }

            })
    }


}