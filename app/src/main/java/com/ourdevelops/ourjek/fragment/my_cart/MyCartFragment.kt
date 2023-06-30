package com.ourdevelops.ourjek.fragment.my_cart
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.location.Location
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.github.florent37.singledateandtimepicker.dialog.SingleDateAndTimePickerDialog
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.tasks.OnSuccessListener
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.FastItemAdapter
import com.mikepenz.fastadapter.listeners.ClickEventHook
import com.ourdevelops.ourjek.BuildConfig
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.IncreaseDecreaseDilaogeFragment
import com.ourdevelops.ourjek.activity.PicklocationActivity
import com.ourdevelops.ourjek.activity.TopupSaldoActivity
import com.ourdevelops.ourjek.activity.cart.CartContractor
import com.ourdevelops.ourjek.activity.cart.CartPresenter
import com.ourdevelops.ourjek.activity.cart.checkout.CheckoutActivity
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.FragmentMyCartBinding
import com.ourdevelops.ourjek.item.CartRecyclerViewAdapter
import com.ourdevelops.ourjek.item.CartRecyclerViewAdapter.onQuantityChanged
import com.ourdevelops.ourjek.item.ItemItem
import com.ourdevelops.ourjek.item.NewItemItem
import com.ourdevelops.ourjek.json.PromoRequestJson
import com.ourdevelops.ourjek.json.PromoResponseJson
import com.ourdevelops.ourjek.json.cart.LocationJson
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum
import com.ourdevelops.ourjek.models.CartPriceWrapper
import com.ourdevelops.ourjek.models.DriverModel
import com.ourdevelops.ourjek.utils.ProjectUtils
import com.ourdevelops.ourjek.utils.SettingPreference
import com.ourdevelops.ourjek.utils.Utility
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MyCartFragment : Fragment(), CartContractor.View, onQuantityChanged {
    private lateinit var binding: FragmentMyCartBinding
    private var presenter: CartPresenter? = null
    private var jarak = 0.0
    private val harga: Long = 0
    private var promocode: Long = 0
    val FITUR_KEY = "FiturKey"
    var alamat: String? = null
    var fiturKey: String ?= null
    var lat = 0.0
    var lon = 0.0
    var merlat = 0.0
    var merlon = 0.0
    var distance  = 0.0
    private val DESTINATION_ID = 1
    private var deliveryCharge = 0
    private var pickUpLatLang: LatLng? = null
    private var destinationLatLang: LatLng? = null
    private lateinit var itemAdapter: FastItemAdapter<NewItemItem>
    private lateinit var cartRecyclerViewAdapter: CartRecyclerViewAdapter
    private var driverAvailable: List<DriverModel>? = null
    private val foodCostLong: Long = 0
    private val deliveryCostLong: Long = 0
    private var saldoWallet: String? = null
    private  var checkedpaycash:kotlin.String? = "0"
    private  var idresto:kotlin.String? = null
    private  var alamatresto:kotlin.String? = null
    private  var namamerchant:kotlin.String? = null
    private  var back:kotlin.String? = null
    private  var hour:kotlin.String? = null
    private  var category:kotlin.String? = null
    var fitur = 0
    var sp: SettingPreference? = null
    var currentLocation: LocationJson? = null
    var datum: Datum? = null
    var cartResponse: CartResponse? = null
    var cartItemsList: ArrayList<Datum>? = null
    private var openingHour: String? = null
    private var closingHour: String? = null
    private val priceWrapper = CartPriceWrapper()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyCartBinding.inflate(layoutInflater, container, false)
        presenter = CartPresenter(activity?.applicationContext!!, this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        promocode = 0
        back = "0"
        cartRecyclerViewAdapter = CartRecyclerViewAdapter(activity?.applicationContext)
        cartRecyclerViewAdapter.onQuantityChangeListener(this)
        deliveryCharge = 5000
        getcartDetails()
        driverAvailable = ArrayList()
        fitur = 0
        setCashChecked()
        sp = SettingPreference(activity?.applicationContext)
        receivingIntents()

        val userLogin = BaseApp.getInstance(activity?.applicationContext).loginUser
        saldoWallet = userLogin.saldo.toString()
        binding.nama.text = namamerchant
        binding.hours.text = hour
        pickUpLatLang = LatLng(merlat, merlon)
        destinationLatLang = LatLng(lat, lon)


        itemAdapter = FastItemAdapter()
        itemAdapter.notifyDataSetChanged()
        itemAdapter.withSelectable(true)
        itemAdapter.withItemEvent(object : ClickEventHook<ItemItem?>() {
            override fun onBind(viewHolder: RecyclerView.ViewHolder): View? {
                return if (viewHolder is ItemItem.ViewHolder) {
                    viewHolder.itemView
                } else null
            }

            override fun onClick(
                v: View,
                position: Int,
                fastAdapter: FastAdapter<ItemItem?>,
                item: ItemItem?
            ) {
                //sheetlist(position);
            }
        })
        binding.merchantnear.layoutManager = LinearLayoutManager(activity?.applicationContext)
        binding.merchantnear.adapter = cartRecyclerViewAdapter

        recyclerViewClicks()
        buttonClicks()
    }

    private fun receivingIntents() {
//        currentLocation = Constants.LOCATION

//        val intent: Intent = getIntent()
//        if (intent != null) {
//            if (intent.hasExtra(Constants.CURRENTLOACTION) == true) {
//                fiturKey = intent.getStringExtra("fitur")
//                currentLocation = getIntent().getSerializableExtra(Constants.CURRENTLOACTION)
//                if (currentLocation != null) {
//                    if (!currentLocation!!.name.isEmpty()) {
//                        binding.deliveryLocationView.setupViews(currentLocation!!.name)
//                    }
//                }
//                alamatresto = currentLocation!!.name
//            } else {
//                lat = intent.getDoubleExtra("lat", 0.0)
//                lon = intent.getDoubleExtra("lon", 0.0)
//                merlat = intent.getDoubleExtra("merlat", 0.0)
//                merlon = intent.getDoubleExtra("merlon", 0.0)
//                distance = intent.getDoubleExtra("distance", 0.0)
//                alamatresto = intent.getStringExtra("alamatresto")
//                alamat = intent.getStringExtra("alamat")
//                namamerchant = intent.getStringExtra("namamerchant")
//                fiturKey = intent.getStringExtra("FiturKey")
//                hour = intent.getStringExtra("hour")
//                category = intent.getStringExtra("category")
//                binding.deliveryLocationView.setupViews(alamat)
//            }
//        }
    }

    private fun recyclerViewClicks() {
        cartRecyclerViewAdapter.onQuantityIncreaseClickedListener { datum: Datum, count: Int? ->
            val dilaogeFragment =
                IncreaseDecreaseDilaogeFragment.newInstance(datum, count)
            dilaogeFragment.onOkayClickedListener { qty: String ->
                updateCart(qty, datum)
                dilaogeFragment.dismiss()
            }
            dilaogeFragment.show(childFragmentManager, "show")
        }
        cartRecyclerViewAdapter.onItemDeleteClickListener { idItem: String ->
            deleteCartItem(idItem)
        }
    }

    override fun onResume() {
        super.onResume()
        getcartDetails()
    }

    private fun buttonClicks() {
        binding.tvClearCart.setOnClickListener { presenter!!.deleteAllCarts(cartResponse!!) }
//        findViewById<View>(R.id.ll_add_more).setOnClickListener(View.OnClickListener { v: View? ->
//            val i = Intent(
//                this@NewDetailOrderActivity,
//                NewDetailMerchantActivity::class.java
//            )
//            i.putExtra("lat", datum!!.latitudeMerchant)
//            i.putExtra("lon", datum!!.longitudeMerchant)
//            i.putExtra("id", datum!!.idMerchant)
//            i.putExtra("fitur", fiturKey)
//            i.putExtra("merchant_id", datum!!.idMerchant)
//            this.startActivity(i)
//        })
        binding.btnpromo.setOnClickListener { v ->
            try {
                val imm =
                    activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                Objects.requireNonNull(imm).hideSoftInputFromWindow(
                    Objects.requireNonNull(activity?.currentFocus)?.windowToken, 0
                )
            } catch (ignored: Exception) {
            }
            if (binding.promocode.text.toString().isEmpty()) {
                notif("Promo code cant be empty!")
            } else {
                promokodedata()
            }
        }
        binding.hours.setOnClickListener { view -> }
        binding.topUp.setOnClickListener { v ->
            startActivity(
                Intent(
                    activity?.applicationContext,
                    TopupSaldoActivity::class.java
                )
            )
        }
        binding.deliveryLocationView.setOnClickListener { v ->
            val intent =
                Intent(activity, PicklocationActivity::class.java)
            intent.putExtra(PicklocationActivity.FORM_VIEW_INDICATOR, DESTINATION_ID)
            intent.putExtra("fitur", fiturKey)
            startActivityForResult(intent, PicklocationActivity.LOCATION_PICKER_ID)
        }
        binding.order.setOnClickListener { v ->
            if (readyToOrder()) {
//                sendOrder();
                proceedToCheckout()
            }
        }
        binding.deliveryTimeView.setOnClickListener { v -> timepickmethod() }
    }

    private fun getcartDetails() {
        binding.layoutContent.visibility = View.GONE
        binding.tvClearCart.visibility = View.GONE
        binding.loader.visibility = View.VISIBLE
        presenter!!.getCartDetails()
    }

    override fun onCartDetailsSuccess(response: CartResponse) {
        binding.tvClearCart.visibility = View.VISIBLE
        binding.loader.visibility = View.GONE
        binding.tvEmptycart.visibility = View.GONE
        binding.layoutContent.visibility = View.VISIBLE
        try {
            cartResponse = response
            loadcartItems(response.data)
            cartItemsList = response.data as ArrayList<Datum>?
            updateJarak(response.data?.get(0)?.latitudeMerchant, response.data?.get(0)?.longitudeMerchant)
            setCartPrices()
            alamatresto = response.data?.get(0)?.alamatMerchant

//            Utility.currencyTXT(binding.tvVat, String.valueOf(response.getVat()), getApplicationContext());
//            Utility.currencyTXT(binding.orderprice, String.valueOf(response.getSub_total()), getApplicationContext());
//            Utility.currencyTXT(binding.price, String.valueOf(getTotalTotal(response)), getApplicationContext());
//            Utility.currencyTXT(binding.tvServicecharge, String.valueOf(response.getServiceCharge()), getApplicationContext());
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onCartDetailError(errorMessage: String) {
        binding.tvClearCart.visibility = View.GONE
        binding.loader.visibility = View.GONE
        binding.tvEmptycart.visibility = View.VISIBLE
        binding.layoutContent.visibility = View.GONE
    }

    @SuppressLint("MissingPermission")
    private fun updateJarak(latitudeMerchant: String?, longitudeMerchant: String?) {
        val mFusedLocation = LocationServices.getFusedLocationProviderClient(activity)
        mFusedLocation.lastLocation.addOnSuccessListener(
            requireActivity(),
            OnSuccessListener<Location?> { location ->
                if (location != null) {
                    destinationLatLang = LatLng(location.latitude, location.longitude)
                    jarak = getKmFromLatLong(
                        destinationLatLang!!.latitude,
                        destinationLatLang!!.longitude,
                        latitudeMerchant?.toDouble(),
                        longitudeMerchant?.toDouble()
                    )
                    deliveryCharge = if (jarak <= 1) {
                        //                        binding.cost.setText("Rs 50");
                        5000
                    } else if (jarak > 1 && jarak <= 5) {
                        //                        binding.cost.setText("Rs 100");
                        10000
                    } else {
                        //                        binding.cost.setText("Rs 120");
                        15000
                    }
                    Utility.currencyTXT(
                        binding.price,
                        getTotalTotal(cartResponse!!), activity?.applicationContext!!
                    )
                }
            })
    }

    private fun getTotalTotal(cartdata: CartResponse): String {
        var totalamount = "0"
        totalamount = (cartdata.sub_total!! + cartdata.serviceCharge!! + cartdata.vat!!).toString()
        return totalamount
    }

    private fun loadcartItems(data: List<Datum>?) {
        try {
            datum = data?.get(0)
            Glide.with(this)
                .load(data?.get(0)?.fotoMerchant)
                .apply(RequestOptions.placeholderOf(R.drawable.image_placeholder))
                .into(binding.imgMerchant)
            binding.nama.text = data?.get(0)?.namaMerchant
            binding.tvMerchantAddress.text = data?.get(0)?.alamatMerchant
            idresto = data?.get(0)?.merchantId
            binding.hours.text = "Open Hours: " + Objects.requireNonNull(data?.get(0))?.jamBuka + "-" + data?.get(0)?.jamTutup
            openingHour = data?.get(0)?.jamBuka
            closingHour = data?.get(0)?.jamTutup
            Log.d("time", "loadcartItems: $openingHour---$closingHour")
            fiturKey = data?.get(0)?.idFitur
            cartRecyclerViewAdapter.setCartData(data)
            cartRecyclerViewAdapter.notifyDataSetChanged()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    private fun setCashChecked() {
        binding.checkedcash.isSelected = true
        binding.checkedwallet.isSelected = false
        binding.cashPayment.setTextColor(resources.getColor(R.color.colorgradient))
        binding.walletpayment.setTextColor(resources.getColor(R.color.gray))
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            binding.checkedcash.backgroundTintList = resources.getColorStateList(R.color.colorgradient)
            binding.checkedwallet.backgroundTintList = resources.getColorStateList(R.color.gray)
        }
    }

    private fun timepickmethod() {
        val ONE_MINUTE_IN_MILLIS: Long = 60000 //millisecs
        val date = Calendar.getInstance()
        val t = date.timeInMillis
        val afterAddingfortyfiveMins = Date(t + 45 * ONE_MINUTE_IN_MILLIS)
        Log.e("lkjjkjhasdoi", Calendar.getInstance().time.toString())
        SingleDateAndTimePickerDialog.Builder(activity) //                .bottomSheet()
            .curved()
            .customLocale(Locale.ENGLISH)
            .mainColor(resources.getColor(R.color.colorPrimary)) //                .minutesStep(5)
            //.displayHours(false)
            //.displayMinutes(false)
            //.todayText("aujourd'hui")
            .displayYears(false)
            .mustBeOnFuture()
            .defaultDate(afterAddingfortyfiveMins)
            .displayListener { }
            .title("Delivery Time")
            .listener { date ->
                Log.d("date", date.toString())
                val calendar = Calendar.getInstance()
                //                        Date today = calendar.getTime();
                calendar.add(Calendar.DAY_OF_YEAR, 1)
                val tomorrow = calendar.time
                if (date.before(Date(t + 44 * ONE_MINUTE_IN_MILLIS))) {
                    ProjectUtils.showToast(
                        activity?.applicationContext!!,
                        "Minimum delivery time is 45 minutes"
                    )
                } else if (date.after(tomorrow)) {
                    ProjectUtils.showToast(
                        activity?.applicationContext!!,
                        "We are processing for Future Delivery."
                    )
                } else {
                    val simpleDateFormat: SimpleDateFormat
                    simpleDateFormat = SimpleDateFormat("hh:mm a")
                    binding.deliveryTimeView.setupViews(simpleDateFormat.format(date))
                }
            }.display()
    }

    fun notif(text: String?) {
        binding.rlnotif.visibility = View.VISIBLE
        binding.textnotif.text = text
        Handler().postDelayed({ binding.rlnotif.visibility = View.GONE }, 3000)
    }

    private fun readyToOrder(): Boolean {
        if (destinationLatLang == null) {
            ProjectUtils.showToast(activity?.applicationContext, "Please select your location.")
            return false
        }
        if (binding.price.text.toString().isEmpty() || binding.price.text.toString()
                .equals("wait")
        ) {
            ProjectUtils.showToast(activity?.applicationContext, "Please wait...")
            return false
        }
        if (jarak == -99.0) {
            ProjectUtils.showToast(activity?.applicationContext, "Please wait a moment...")
        }
        if (binding.deliveryTimeView.binding.tvValue.text.toString().isEmpty()) {
            ProjectUtils.showToast(activity?.applicationContext, "Please set delivery time")
            return false
        }
        if (!BuildConfig.DEBUG) {
            if (java.lang.Double.valueOf(
                    binding.price.text.toString().replace("Rs ", "").replace(",", "")
                ) < 500
            ) {
                ProjectUtils.showToast(
                    activity?.applicationContext,
                    "Minimum order Should be greater than 500"
                )
                return false
            }
        }

        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
         if (requestCode == PicklocationActivity.LOCATION_PICKER_ID) {
             if (resultCode == Activity.RESULT_OK) {
                 val addressset = data?.getStringExtra(PicklocationActivity.LOCATION_NAME)
                 val latLng: LatLng = data?.getParcelableExtra(PicklocationActivity.LOCATION_LATLNG)!!
                 binding.deliveryLocationView.setupViews(addressset)
                 destinationLatLang =
                     LatLng(Objects.requireNonNull(latLng)!!.latitude, latLng.longitude)
                 jarak = getKmFromLatLong(
                     destinationLatLang!!.latitude,
                     destinationLatLang!!.longitude,
                     datum!!.latitudeMerchant.toDouble(),
                     datum!!.longitudeMerchant.toDouble()
                 )
                 if (jarak < 2) {
//                    binding.cost.setText("Rs 50");
                 } else if (jarak > 2 && jarak < 6) {
//                    binding.cost.setText("Rs 100");
                 } else {
//                    binding.cost.setText("Rs 120");
                 }
                 Utility.currencyTXT(
                     binding.price,
                     getTotalTotal(cartResponse!!), activity?.applicationContext!!
                 )
             }
         }
    }


    @SuppressLint("SetTextI18n")
    private fun promokodedata() {
        binding.btnpromo.isEnabled = false
        binding.btnpromo.text = "Wait..."
        val user = BaseApp.getInstance(activity?.applicationContext).loginUser
        val request = PromoRequestJson()
        request.fitur = fitur.toString()
        request.code = binding.promocode.text.toString()
        val service =
            ServiceGenerator.createService(UserService::class.java, user.noTelepon, user.password,user.token)
        service.promocode(request).enqueue(object : Callback<PromoResponseJson> {
            override fun onResponse(
                call: Call<PromoResponseJson>,
                response: Response<PromoResponseJson>
            ) {
                if (response.isSuccessful) {
                    if (Objects.requireNonNull(response.body())!!
                            .message.equals("success", ignoreCase = true)
                    ) {
                        val finalBiayaTotalpay = foodCostLong + harga
                        binding.btnpromo.isEnabled = true
                        binding.btnpromo.text = "Use"
                        if (response.body()!!.type == "persen") {
                            promocode =
                                response.body()!!.nominal.toLong() * finalBiayaTotalpay / 100
                        } else {
                            promocode = response.body()!!.nominal.toLong()
                        }
                    } else {
                        notif("promo code not available!")
                        binding.btnpromo.isEnabled = true
                        binding.btnpromo.text = "Use"
                        promocode = 0
                    }
                } else {
                    notif("error!")
                }
            }

            override fun onFailure(call: Call<PromoResponseJson>, t: Throwable) {
                t.printStackTrace()
                notif("error")
            }
        })
    }

    var km = 0.0

    fun getKmFromLatLong(lat1: Double?, lng1: Double?, lat2: Double?, lng2: Double?): Double {
        val loc1 = Location("")
        loc1.latitude = lat1!!
        loc1.longitude = lng1!!
        val loc2 = Location("")
        loc2.latitude = lat2!!
        loc2.longitude = lng2!!
        val distanceInMeters = loc1.distanceTo(loc2)
        return java.lang.Double.valueOf((distanceInMeters / 1000).toDouble())
    }

    private fun updateCart(qty: String, datum: Datum) {
        presenter!!.updateCart(qty, datum)
    }

    override fun onCartUpdated() {
        try {
            getcartDetails()
            cartRecyclerViewAdapter.notifyDataSetChanged()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun updateCart(datum: List<Datum>) {
        presenter!!.updateCart(datum)
    }

    override fun onCartUpdatError(errorMessage: String) {
        Toast.makeText(activity?.applicationContext, errorMessage, Toast.LENGTH_SHORT).show()
    }

    private fun proceedToCheckout() {
        Log.d("checker", "proceedToCheckout: $alamatresto")
        updateCart(cartItemsList!!)
        val intent = Intent(activity?.applicationContext, CheckoutActivity::class.java)
        intent.putExtra(IntentKeys.PriceWrapper, priceWrapper)
        intent.putExtra(IntentKeys.Object, cartResponse)
        intent.putExtra(IntentKeys.datam, datum)
        intent.putExtra(IntentKeys.alamatresto, alamatresto)
        intent.putExtra(IntentKeys.idresto, idresto)
        intent.putExtra(IntentKeys.promocode, promocode)
        intent.putExtra(IntentKeys.distance, distance)
        intent.putExtra(IntentKeys.price, binding.price.text.toString())
        intent.putExtra("open", openingHour)
        intent.putExtra("close", closingHour)
        intent.putExtra("fitur", fiturKey)
        startActivity(intent)
    }

    private fun deleteCartItem(idItem: String) {
        presenter!!.deleteCartItem(idItem)
    }

    override fun onCartItemDeleted() {
        getcartDetails()
        cartRecyclerViewAdapter.notifyDataSetChanged()
    }

    override fun onCartItemDeleteError(errorMessage: String) {
        Toast.makeText(activity?.applicationContext, errorMessage, Toast.LENGTH_SHORT).show()
    }

    override fun onCartCleared() {
        (activity as MainActivity).removeCartIndicator()
        binding.tvClearCart.visibility = View.GONE
        binding.loader.visibility = View.GONE
        binding.tvEmptycart.visibility = View.VISIBLE
        binding.layoutContent.visibility = View.GONE
    }

    override fun onCartClearError(errorMessage: String) {}

    override fun onEmptyCart() {
        (activity as MainActivity).removeCartIndicator()
    }

    fun onPointerCaptureChanged(hasCapture: Boolean) {}

    override fun onAddClick(qty: String?, position: Int) {
        cartItemsList!![position].quantity = qty
        setCartPrices()
    }

    override fun onMinusClick(qty: String?, position: Int) {
        cartItemsList!![position].quantity = qty
        setCartPrices()
    }


    private fun setCartPrices() {
        cartItemsList?.let { priceWrapper.setCartValues(it) }
        Utility.currencyTXT(
            binding.tvVat,
            priceWrapper.totalVat.toString(),
            activity?.applicationContext
        )
        Utility.currencyTXT(
            binding.orderprice,
            priceWrapper.orderPrice.toString(),
            activity?.applicationContext
        )
        Utility.currencyTXT(
            binding.tvServicecharge,
            priceWrapper.totalServiceCharge.toString(),
            activity?.applicationContext
        )
        Utility.currencyTXT(
            binding.price,
            priceWrapper.totalPrice.toString(),
            activity?.applicationContext
        )
    }
}