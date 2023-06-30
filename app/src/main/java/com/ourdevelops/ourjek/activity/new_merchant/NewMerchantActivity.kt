package com.ourdevelops.ourjek.activity.new_merchant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.ActivityNewMerchantBinding
import com.ourdevelops.ourjek.json.cart.LocationJson
import com.ourdevelops.ourjek.models.MerchantNearModel
import com.ourdevelops.ourjek.utils.AppLogger
import java.util.ArrayList

class NewMerchantActivity : AppCompatActivity(), NewMerchantContractor.View {

    private lateinit var merchantData: ArrayList<MerchantNearModel>
    private lateinit var binding: ActivityNewMerchantBinding
    private lateinit var presenter: NewMerchantPresenter
    private lateinit var adapter: NewMerchantAdapter
    var fiturId = 0
    private var isFromSearch = false
    var filterId = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNewMerchantBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getIntenData()
        presenter = NewMerchantPresenter(this, applicationContext, filterId)
        presenter.onRequestAddress()
        presenter.getAllMerchants(filterId)
        onButtonClicks()
    }

    private fun setUpViews() {
        if (isFromSearch) {
            binding.searchtext.requestFocus()
        }
        binding.address.isSelected = true
        binding.merchantnear.setHasFixedSize(true)
        binding.merchantnear.isNestedScrollingEnabled = false
        adapter = NewMerchantAdapter(merchantData, applicationContext, this)
        binding.merchantnear.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.merchantnear.adapter = adapter

    }

    private fun onButtonClicks() {
        binding.goBack.setOnClickListener { finish() }

        binding.searchtext.setOnEditorActionListener { _: TextView?, _: Int, _: KeyEvent? ->
            if (binding.searchtext.text.toString().isNotEmpty()) {
                AppLogger.log("search3 -> ${binding.searchtext.text}")
                presenter.searchMerchant(binding.searchtext.text.toString(), filterId)
            }
            false
        }

        binding.searchtext.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                if (p0.isNullOrEmpty()){
                    presenter.getAllMerchants(filterId)
                }
            }

        })

        binding.imgCart.setOnClickListener {
            val locationJson = LocationJson()
            locationJson.lat = Constants.LATITUDE
            locationJson.longitude = Constants.LONGITUDE
            locationJson.name = binding.address.text.toString()
            startActivity(Intent(this, NewDetailOrderActivity::class.java).putExtra(Constants.CURRENTLOACTION, locationJson).putExtra("fitur", filterId))
        }
    }

    override fun onResume() {
        super.onResume()
        binding.imgCart.checkCart()
    }

    private fun getIntenData() {
        fiturId = intent.getIntExtra(IntentKeys.filter, -1)

        filterId = if (fiturId == 5) {
            "21"
        } else {
            "33"
        }
        isFromSearch = intent.getBooleanExtra("search", false)
    }

    override fun onShowProgress() {
        binding.llmerchantnear.visibility = View.GONE
        binding.rlnodata.visibility = View.GONE
        binding.rlprogress.visibility = View.VISIBLE
    }

    override fun onHideProgress() {
        binding.rlprogress.visibility = View.GONE
        binding.llmerchantnear.visibility = View.VISIBLE
    }

    override fun onNoDataFound() {
        binding.merchantnear.visibility = View.GONE
        binding.rlnodata.visibility = View.VISIBLE
    }

    override fun setAddressData(address: String) {
        binding.address.text = address
    }

    override fun onSearchDataFound(data: MutableList<MerchantNearModel>) {
        binding.merchantnear.visibility = View.VISIBLE
        binding.rlnodata.visibility = View.GONE
        merchantData.clear()
        merchantData.addAll(data)
        adapter.notifyDataSetChanged()
    }

    override fun goToMerchantDetail(mainData: MerchantNearModel) {
        Intent(applicationContext, NewDetailMerchantActivity::class.java).apply {
            putExtra(IntentKeys.merchantId, mainData.id_merchant)
            putExtra(IntentKeys.latitude, mainData.latitude_merchant)
            putExtra(IntentKeys.longitude, mainData.longitude_merchant)
            putExtra(IntentKeys.id, mainData.id_merchant)
            putExtra(IntentKeys.filter, filterId)
        }.also { startActivity(it) }
    }

    override fun onResponseSuccess(data: ArrayList<MerchantNearModel>?) {
        if (data != null) {
            merchantData = data
            setUpViews()
        }else{
            merchantData = ArrayList<MerchantNearModel>()
            onNoDataFound()
        }
    }
}