package com.ourdevelops.ourjek.activity.allmerchant

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.KeyEvent
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.ActivityAllMerchantBinding
import com.ourdevelops.ourjek.item.AllMerchantNearItem
import com.ourdevelops.ourjek.item.CatMerchantNearItem
import com.ourdevelops.ourjek.json.AllMerchantByNearResponseJson
import com.ourdevelops.ourjek.json.AllMerchantbyCatRequestJson
import com.ourdevelops.ourjek.json.GetAllMerchantbyCatRequestJson
import com.ourdevelops.ourjek.json.SearchMerchantbyCatRequestJson
import com.ourdevelops.ourjek.json.cart.LocationJson
import com.ourdevelops.ourjek.models.MerchantNearModel
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.util.*
import kotlin.collections.ArrayList

class AllMerchantActivity : AppCompatActivity() {
    private var binding: ActivityAllMerchantBinding? = null
    var merchantNearItem: AllMerchantNearItem? = null
    var catMerchantNearItem: CatMerchantNearItem? = null
    var clicknear: MutableList<MerchantNearModel>? = null
    var fiturId = 0
    var filterId = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAllMerchantBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
        val intent = intent
        fiturId = intent.getIntExtra(IntentKeys.filter, -1)

        filterId = if (fiturId == 5) {
            "21"
        } else {
            "33"
        }

        binding!!.address.isSelected = true
        binding!!.merchantnear.setHasFixedSize(true)
        binding!!.merchantnear.isNestedScrollingEnabled = false
        binding!!.merchantnear.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding!!.goBack.setOnClickListener { view: View? -> finish() }
        requestCondition()
        progressshow()
    }

    private fun requestCondition() {
        requestAddress(binding!!.address)
        getdata()
        binding!!.searchtext.setOnEditorActionListener { v: TextView?, actionId: Int, event: KeyEvent? ->
            if (clicknear != null) {
                clicknear!!.clear()
            }
            binding!!.merchantnear.visibility = View.GONE
            binding!!.rlnodata.visibility = View.GONE
            val sSearch = binding!!.searchtext.text.toString().trim { it <= ' ' }
            if (TextUtils.isEmpty(sSearch)) {
                getmerchntbycatnear("1")
            } else {
                searchmerchant(binding!!.searchtext.text.toString())
            }
            false
        }
    }

    private fun progressshow() {
        binding!!.llmerchantnear.visibility = View.GONE
        binding!!.rlprogress.visibility = View.VISIBLE
    }

    private fun progresshide() {
        binding!!.rlprogress.visibility = View.GONE
        binding!!.llmerchantnear.visibility = View.VISIBLE
    }

    override fun onResume() {
        super.onResume()
        binding!!.imgCart.checkCart()
    }

    private fun requestAddress(textView: TextView) {
        val latlang = LatLng(Constants.LATITUDE, Constants.LONGITUDE)
        if (latlang != null) {
            MapDirectionAPI.getAddress(latlang).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {}
                @Throws(IOException::class)
                override fun onResponse(call: Call, response: Response) {
                    if (response.isSuccessful) {
                        val json = Objects.requireNonNull(response.body())!!.string()
                        runOnUiThread {
                            try {
                                val Jobject = JSONObject(json)
                                val Jarray = Jobject.getJSONArray("results")
                                val userdata = Jarray.getJSONObject(0)
                                val address = userdata.getString("formatted_address")
                                textView.text = address
                            } catch (e: JSONException) {
                                e.printStackTrace()
                            }
                        }
                    }
                }
            })
        }
    }


    private fun getdata() {
        val loginUser = BaseApp.getInstance(this).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = AllMerchantbyCatRequestJson()
        param.id = loginUser.id
        param.lat = Constants.LATITUDE.toString()
        param.lon = Constants.LONGITUDE.toString()
        param.phone = loginUser.noTelepon
        param.fitur_id = filterId
        userService.allmerchant(param).enqueue(object : retrofit2.Callback<AllMerchantByNearResponseJson> {
            override fun onResponse(call: retrofit2.Call<AllMerchantByNearResponseJson>, response: retrofit2.Response<AllMerchantByNearResponseJson>) {
                if (response.isSuccessful) {
                    if (Objects.requireNonNull(response.body())!!.message.equals("success", ignoreCase = true)) {
                        progresshide()
                        if (response.body()?.data.isNullOrEmpty()) {
                            binding!!.merchantnear.visibility = View.GONE
                            binding!!.rlnodata.visibility = View.VISIBLE
                        } else {
                            clicknear = response.body()!!.data
                            merchantNearItem = AllMerchantNearItem(this@AllMerchantActivity, clicknear, R.layout.item_merchant_list, filterId)
                            binding!!.merchantnear.adapter = merchantNearItem
                            catMerchantNearItem = CatMerchantNearItem(this@AllMerchantActivity, response.body()!!.kategori, R.layout.item_cat_merchant) { item ->
                                clicknear?.clear()
                                progressshow()
                                binding!!.rlnodata.visibility = View.GONE
                                getmerchntbycatnear(item.id_kategori_merchant)
                            }
                            //                            rvcatmerchantnear.setAdapter(catMerchantNearItem);
                        }
                    }
                }
            }

            override fun onFailure(call: retrofit2.Call<AllMerchantByNearResponseJson>, t: Throwable) {
                binding!!.merchantnear.visibility = View.GONE
                binding!!.rlnodata.visibility = View.VISIBLE
            }
        })
    }

    private fun getmerchntbycatnear(cat: String) {
        val loginUser = BaseApp.getInstance(this).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = GetAllMerchantbyCatRequestJson()
        param.id = loginUser.id
        param.lat = Constants.LATITUDE.toString()
        param.lon = Constants.LONGITUDE.toString()
        param.phone = loginUser.noTelepon
        param.kategori = cat
        param.fitur = filterId
        userService.getallmerchanbynear(param).enqueue(object : retrofit2.Callback<AllMerchantByNearResponseJson> {
            override fun onResponse(call: retrofit2.Call<AllMerchantByNearResponseJson>, response: retrofit2.Response<AllMerchantByNearResponseJson>) {
                if (response.isSuccessful) {
                    if (Objects.requireNonNull(response.body())!!.message.equals("success", ignoreCase = true)) {
                        clicknear = response.body()!!.data
                        progresshide()
                        if (response.body()?.data.isNullOrEmpty()) {
                            binding!!.rlnodata.visibility = View.VISIBLE
                        } else {
                            binding!!.rlnodata.visibility = View.GONE
                            merchantNearItem = AllMerchantNearItem(this@AllMerchantActivity, clicknear, R.layout.item_merchant_list, filterId)
                            binding!!.merchantnear.adapter = merchantNearItem
                        }
                    }
                }
            }

            override fun onFailure(call: retrofit2.Call<AllMerchantByNearResponseJson>, t: Throwable) {}
        })
    }

    private fun searchmerchant(like: String) {
        binding!!.merchantnear.visibility = View.GONE
        binding!!.rlnodata.visibility = View.GONE
        binding!!.rlprogress.visibility = View.VISIBLE
        val loginUser = BaseApp.getInstance(this).loginUser
        val userService = ServiceGenerator.createService(UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = SearchMerchantbyCatRequestJson()
        param.id = loginUser.id
        param.lat = Constants.LATITUDE.toString()
        param.lon = Constants.LONGITUDE.toString()
        param.phone = loginUser.noTelepon
        param.fitur = "21"
        param.like = like
        userService.searchmerchant(param).enqueue(object : retrofit2.Callback<AllMerchantByNearResponseJson> {
            override fun onResponse(call: retrofit2.Call<AllMerchantByNearResponseJson>, response: retrofit2.Response<AllMerchantByNearResponseJson>) {
                if (response.isSuccessful) {
                    if (Objects.requireNonNull(response.body())!!.message.equals("success", ignoreCase = true)) {
                        clicknear = response.body()!!.data
                        progresshide()
                        if (response.body()?.data.isNullOrEmpty()) {
                            binding!!.rlnodata.visibility = View.VISIBLE
                        } else {
                            binding!!.merchantnear.visibility = View.VISIBLE
                            binding!!.rlnodata.visibility = View.GONE
                            merchantNearItem = AllMerchantNearItem(this@AllMerchantActivity, clicknear, R.layout.item_merchant_list, filterId)
                            binding!!.merchantnear.adapter = merchantNearItem
                        }
                    }
                }
            }

            override fun onFailure(call: retrofit2.Call<AllMerchantByNearResponseJson>, t: Throwable) {}
        })
    }

    fun onCartClicked(view: View?) {
        val locationJson = LocationJson()
        locationJson.lat = Constants.LATITUDE
        locationJson.longitude = Constants.LONGITUDE
        locationJson.name = binding!!.address.text.toString()
        startActivity(Intent(this, NewDetailOrderActivity::class.java).putExtra(Constants.CURRENTLOACTION, locationJson).putExtra("fitur", filterId))
    }
}