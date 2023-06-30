package com.ourdevelops.ourjek.activity.landing

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.net.wifi.WifiManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.google.android.gms.location.LocationServices
import com.google.android.material.tabs.TabLayout
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.ktx.Firebase
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.DiscountType
import com.ourdevelops.ourjek.constants.logDebug
import com.ourdevelops.ourjek.databinding.ActivityMainBinding
import com.ourdevelops.ourjek.fragment.*
import com.ourdevelops.ourjek.fragment.my_cart.MyCartFragment
import com.ourdevelops.ourjek.fragment.new_dynamic_home.NewDynamicHomeFragment
import com.ourdevelops.ourjek.fragment.new_profile.NewProfileFragment
import com.ourdevelops.ourjek.json.BeritaDetailRequestJson
import com.ourdevelops.ourjek.json.GetFiturResponseJson
import com.ourdevelops.ourjek.json.cart.CustomerRequestParams
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.models.FiturModel
import com.ourdevelops.ourjek.models.PesananMerchant
import com.ourdevelops.ourjek.utils.*
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList
import com.google.firebase.iid.InstanceIdResult
import java.util.concurrent.TimeUnit


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity(), MainContractor.View {
    private lateinit var adapter: SectionsPagerAdapter
    private var tabLandingObjects = ArrayList<TabLandingObject>()
    private lateinit var binding: ActivityMainBinding
    var languageManager: LanguageManager? = null
    private var currentPosition = 0
    private lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter = MainPresenter(applicationContext, this)
        languageManager = LanguageManager(this@MainActivity)
        languageManager!!.language = PrefsManager(applicationContext).languageValue
        val loginUser = BaseApp.getInstance(this).loginUser
        Constants.TOKEN = loginUser.token
        Constants.USERID = loginUser.id
        apikey = getString(R.string.google_maps_key)
        var packageInfo: PackageInfo? = null
        try {
            packageInfo = packageManager.getPackageInfo(packageName, 0)
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        Constants.versionname = Objects.requireNonNull(packageInfo)?.versionName
        update()
        presenter.getCartDetails()
        startLocationService()
        setupViews()
        checkCartItem()

        FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener(this
        ) { instanceIdResult: InstanceIdResult ->
            val newToken = instanceIdResult.token
            Log.e("newToken", newToken)
        }

        val dateTime  = Date().time
        Log.d("datetime", dateTime.toString())
    }

    private fun setupViews() {
        tabLandingObjects.clear()
        tabLandingObjects.add(TabLandingObject(NewDynamicHomeFragment(), "Home", R.drawable.ic_new_home_image))
        tabLandingObjects.add(TabLandingObject(HistoryFragment(), "My Orders", R.drawable.ic_shopping_bag))
        tabLandingObjects.add(TabLandingObject(MyCartFragment(), "My Cart", R.drawable.ic_shopping_cart))
//        tabLandingObjects.add(TabLandingObject(MessageFragment(), "Chat", R.drawable.ic_new_chat_image))
        tabLandingObjects.add(TabLandingObject(NewProfileFragment(), "Account", R.drawable.ic_new_user))
        adapter = SectionsPagerAdapter(supportFragmentManager)
        for (i in tabLandingObjects) {
            adapter.addFragment(i.fragment, i.title)
        }

        binding.viewPager.adapter = adapter
        binding.viewPager.offscreenPageLimit = 3
        binding.tabs.setupWithViewPager(binding.viewPager)
        adapter.notifyDataSetChanged()
        createTabs()
    }

    private fun createTabs() {
        for ((i, obj) in tabLandingObjects.withIndex()) {
            val view = LayoutInflater.from(applicationContext).inflate(R.layout.custom_tab, null)
            binding?.tabs?.getTabAt(i)?.customView = view
            val image = binding?.tabs?.getTabAt(i)?.customView?.findViewById(R.id.imgTab) as ImageView
            image.setImageResource(obj.icon)
            image.setColorFilter(ContextCompat.getColor(this, R.color.darker_gray))
            val text = binding?.tabs?.getTabAt(i)?.customView?.findViewById(R.id.textTab) as TextView
            text.text = obj.title
            text.setTextColor(ContextCompat.getColor(applicationContext, R.color.darker_gray))
        }
        val image = binding?.tabs?.getTabAt(0)!!.customView!!.findViewById<View>(R.id.imgTab) as ImageView
        image.setColorFilter(ContextCompat.getColor(this, R.color.flamingo))
        val text =
                binding?.tabs?.getTabAt(0)!!.customView!!.findViewById<View>(R.id.textTab) as TextView
        text.setTextColor(ContextCompat.getColor(applicationContext, R.color.flamingo))
        tabListener()
        viewPagerListener()
    }

    private fun viewPagerListener() {
        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                currentPosition = position
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })
    }

    private fun tabListener() {
        binding.tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val image =
                        tab?.customView?.findViewById(R.id.imgTab) as ImageView
                image.setColorFilter(ContextCompat.getColor(applicationContext, R.color.flamingo))
                val text =
                        tab?.customView?.findViewById(R.id.textTab) as TextView
                text.setTextColor(ContextCompat.getColor(applicationContext, R.color.flamingo))

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                val image =
                        tab?.customView?.findViewById(R.id.imgTab) as ImageView
                image.setColorFilter(ContextCompat.getColor(applicationContext, R.color.darker_gray))
                val text =
                        tab?.customView?.findViewById(R.id.textTab) as TextView
                text.setTextColor(ContextCompat.getColor(applicationContext, R.color.darker_gray))
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }

    @SuppressLint("MissingPermission")
    private fun startLocationService() {
        val mFusedLocation = LocationServices.getFusedLocationProviderClient(this@MainActivity)
        mFusedLocation.lastLocation.addOnSuccessListener(this@MainActivity) { location ->
            if (location != null) {
                Constants.LATITUDE = location.latitude
                Constants.LONGITUDE = location.longitude
                Log.e("BEARING:", location.bearing.toString())
            }
        }
        mFusedLocation.lastLocation.addOnFailureListener(this@MainActivity) { }
    }

    @SuppressLint("MissingPermission")
    override fun onResume() {
        super.onResume()
        if (!NetworkManager.isConnectToInternet(this)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                val panelIntent = Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY)
                startActivityForResult(panelIntent, 0)
            } else {
                // for previous android version
                val wifiManager = (this.applicationContext.getSystemService(WIFI_SERVICE) as WifiManager)
                wifiManager.isWifiEnabled = true
            }
        } else {
            startLocationService()
            checkCartItem()
            update()
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (currentPosition == 0) {
                moveTaskToBack(true)
            } else {
                binding.viewPager.setCurrentItem(0, true)
            }
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    private fun update() {
        val loginUser = BaseApp.getInstance(this).loginUser
        val userService = ServiceGenerator.createService(UserService::class.java,
                loginUser.email, loginUser.password,loginUser.token)
        val beritaDetailRequestJson = BeritaDetailRequestJson()
        beritaDetailRequestJson.language = PrefsManager(applicationContext).languageValue
        userService.getFitur(beritaDetailRequestJson).enqueue(object : Callback<GetFiturResponseJson> {
            override fun onResponse(call: Call<GetFiturResponseJson>, response: Response<GetFiturResponseJson>) {
                if (response.isSuccessful) {
                    val realm = BaseApp.getInstance(this@MainActivity).realmInstance
                    realm.beginTransaction()
                    realm.delete(FiturModel::class.java)
                    realm.copyToRealm(Objects.requireNonNull(response.body())!!.data)
                    realm.commitTransaction()
                    Constants.CURRENCY = response.body()!!.currencyModel
                }
            }

            override fun onFailure(call: Call<GetFiturResponseJson>, t: Throwable) {}
        })
    }

    companion object {
        @JvmField
        var apikey: String? = null

        @SuppressLint("StaticFieldLeak")
        var instance: MainActivity? = null
    }

    private fun checkCartItem(){
        logDebug("cart items -> ${calculateItemsInDb()}")
        if (calculateItemsInDb()) {
            logDebug("cart items -> if")
            (binding.tabs.getTabAt(2)?.customView?.findViewById(R.id.indicator) as CardView).also { it.visibility = View.VISIBLE }
        } else {
            logDebug("cart items -> else")
         removeCartIndicator()
        }
    }

    fun removeCartIndicator(){
        (binding.tabs.getTabAt(2)?.customView?.findViewById(R.id.indicator) as CardView).also { it.visibility = View.GONE }
    }

    private fun calculateItemsInDb(): Boolean {
        val realm = Realm.getDefaultInstance()
        val items = realm.copyFromRealm(realm.where(PesananMerchant::class.java).findAll())
        logDebug("cart items -> ${items.size}")
        return items.size > 0
    }


}