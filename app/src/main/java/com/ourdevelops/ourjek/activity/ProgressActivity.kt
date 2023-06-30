package com.ourdevelops.ourjek.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.*
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.activity.riderequest.map_handler.RideRequestMapHandler
import com.ourdevelops.ourjek.constants.*
import com.ourdevelops.ourjek.databinding.ActivityRideBinding
import com.ourdevelops.ourjek.item.ItemPesananItem
import com.ourdevelops.ourjek.json.DetailRequestJson
import com.ourdevelops.ourjek.json.DetailTransResponseJson
import com.ourdevelops.ourjek.json.fcm.*
import com.ourdevelops.ourjek.models.*
import com.ourdevelops.ourjek.service.DriverLocationBroadcast
import com.ourdevelops.ourjek.utils.*
import com.ourdevelops.ourjek.utils.LoginConstants.loginToken
import com.ourdevelops.ourjek.utils.api.FCMHelper
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.BookService
import io.realm.Realm
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException
import java.util.*

class ProgressActivity : AppCompatActivity(), OnMapReadyCallback{

    private var currentLatLng: LatLng? = null
    private var binding: ActivityRideBinding? = null
    private var mapHandler: RideRequestMapHandler? = null
    private var isCancelable = true
    var idtrans: String? = null
    var iddriver: String? = null
    var response: String? = null
    var regdriver: String? = null
    var fitur: String? = null
    var imagedriver: String? = null
    var tokenmerchant: String? = null
    var londriver = ""
    var complete: String? = null
    var icondriver: String? = null
    var gethome: String? = null
    private var handler: Handler? = null
    var lout_service_comission: LinearLayout? = null
    var timer = Timer()
    var itemPesananItem: ItemPesananItem? = null
    var realm: Realm? = null

    override fun onBackPressed() {
        super.onBackPressed()
        timer.cancel()
        super.onBackPressed()
        if (complete == "1") {
            val intent = Intent(this@ProgressActivity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        } else {
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRideBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        realm = Realm.getDefaultInstance()
        handler = Handler()
        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapView) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
        icondriver = "0"
        gethome = "0"
        val intent = intent
        iddriver = intent.getStringExtra("id_driver")
        idtrans = intent.getStringExtra("id_transaksi")
        response = intent.getStringExtra("response")
        Log.d("intentvalue = ", iddriver + idtrans + response)
        complete = if (intent.getStringExtra("complete") == null) {
            "false"
        } else {
            intent.getStringExtra("complete")
        }
        binding!!.status.visibility = View.VISIBLE
        binding!!.image.visibility = View.GONE
        lout_service_comission = findViewById(R.id.lout_service_comission)
        val behavior: BottomSheetBehavior<*> = BottomSheetBehavior.from(binding!!.bottomSheet)
        behavior.state = BottomSheetBehavior.STATE_EXPANDED
        binding!!.pickUpContainer.visibility = View.GONE
        binding!!.destinationContainer.visibility = View.GONE
        binding!!.llpayment.visibility = View.GONE
        binding!!.backBtn.setOnClickListener { finish() }
        binding!!.merchantnear.setHasFixedSize(true)
        binding!!.merchantnear.isNestedScrollingEnabled = false
        binding!!.merchantnear.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding!!.order.text = getString(R.string.text_cancel)
        binding!!.order.background = resources.getDrawable(R.drawable.rounded_corners_button_red)
        binding!!.order.setOnClickListener { view ->
            if (isCancelable) {
                val alertDialogBuilder = AlertDialog.Builder(this@ProgressActivity, R.style.DialogStyle)
                alertDialogBuilder.setTitle("Cancel order")
                alertDialogBuilder.setMessage("Do you want to cancel this order?")
                alertDialogBuilder.setPositiveButton("yes"
                ) { arg0, arg1 ->
                    onButtonShowPopupWindowClick(view)
                    //                                    cancelOrder();
                }
                alertDialogBuilder.setNegativeButton("No") { dialog, which -> dialog.dismiss() }
                val alertDialog = alertDialogBuilder.create()
                alertDialog.show()
            } else {
                notif("You cannot cancel the order, the trip has already begun!")
            }
        }
        binding!!.rlprogress.visibility = View.VISIBLE
        binding!!.textprogress.text = getString(R.string.waiting_pleaseWait)
    }

    private fun getData(idtrans: String?, iddriver: String?) {
        val loginUser = BaseApp.getInstance(this).loginUser
        val service = ServiceGenerator.createService(BookService::class.java, loginUser.email, loginUser.password,loginUser.token)
        val param = DetailRequestJson()
        param.id = idtrans
        param.idDriver = iddriver
        param.language = "en"
        service.detailtrans(param).enqueue(object : Callback<DetailTransResponseJson> {
            @SuppressLint("SetTextI18n")
            override fun onResponse(call: Call<DetailTransResponseJson>, responsedata: Response<DetailTransResponseJson>) {
                if (responsedata.isSuccessful) {
                    if(responsedata.body() != null && !responsedata.body()?.data.isNullOrEmpty() && !responsedata.body()?.driver.isNullOrEmpty()) {
                        if (responsedata.body()?.promo != null) {
                            binding!!.llPromoUse.apply {
                                setUpView(responsedata.body()?.promo)
                                visibility = View.VISIBLE
                            }
                        }

                        val transaksi = responsedata.body()?.data?.get(0)!!
                        val designedFitur = realm!!.where(FiturModel::class.java).equalTo("idFitur", Integer.valueOf(transaksi.orderFitur)).findFirst()
                        icondriver = Objects.requireNonNull(designedFitur)?.icon_driver
                        gethome = designedFitur!!.home
                        val driver = responsedata.body()!!.driver[0]
                        fitur = transaksi.orderFitur
                        parsedata(transaksi, driver, designedFitur)
                        regdriver = driver.regId
                        tokenmerchant = transaksi.token_merchant
                        imagedriver = Constants.IMAGESDRIVER + driver.foto
                        if (transaksi.isPakaiWallet) {
                            binding!!.totaltext.text = "Total (Wallet)"
                        } else {
                            binding!!.totaltext.text = "Total (Cash)"
                        }
                        if (transaksi.status.equals(TransactionStatus.finish) || transaksi.status.equals(TransactionStatus.cancel)) {
                            binding!!.order.visibility = View.GONE
                            binding!!.phonenumber.setOnClickListener {
                                Toast.makeText(this@ProgressActivity, "Order already finished", Toast.LENGTH_SHORT).show()
                            }
                        }
                        if (designedFitur.home != "3") {
                            when (designedFitur.home) {
                                "4" -> {
                                    binding!!.loutServiceComission.visibility = View.VISIBLE
                                    binding!!.merchantdetail.visibility = View.VISIBLE
                                    if (transaksi.harga.toString() == "0") {
                                        binding!!.tvDeliveryFee.text = "Free"
                                    } else {
                                        Utility.currencyTXT(binding!!.tvDeliveryFee, transaksi.harga.toString(), this@ProgressActivity)
                                    }
                                    binding!!.lldistance.visibility = View.GONE
                                    binding!!.llestimated.visibility = View.GONE
                                    binding!!.llVat.visibility = View.VISIBLE
                                    //                            time.setText("Delivery Fee");
                                    binding!!.costText.text = "Order Cost"
                                    Utility.currencyTXT(binding!!.tvComission, transaksi.vat.toString(), this@ProgressActivity)
                                    Utility.currencyTXT(binding!!.tvServicecharge, transaksi.service_charge.toString(), this@ProgressActivity)
                                    itemPesananItem = ItemPesananItem(responsedata.body()!!.item, R.layout.item_pesanan)
                                    binding!!.merchantnear.adapter = itemPesananItem
                                }
                                "2" -> {
                                    binding!!.senddetail.visibility = View.VISIBLE
                                    binding!!.produk.text = transaksi.delivery_type
                                    binding!!.sendername.text = "Sender Name: ${transaksi.sender_name}"
                                    binding!!.receivername.text = "Receiver Name: ${transaksi.receiver_name}"
                                    Utility.currencyTXT(binding!!.cost, transaksi.total_price.toString(), this@ProgressActivity)
                                    if(transaksi.promo_code.isNullOrEmpty()){
                                        Utility.currencyTXT(binding!!.price, transaksi.grand_total, applicationContext)
                                    }else{
                                        Utility.currencyTXT(binding!!.price, transaksi.discount, applicationContext)
                                        Utility.currencyTXT(binding!!.price, transaksi.discount_total, applicationContext)
                                    }
                                    binding!!.senderphone.setOnClickListener(View.OnClickListener {
                                        val alertDialogBuilder = AlertDialog.Builder(this@ProgressActivity, R.style.DialogStyle)
                                        alertDialogBuilder.setTitle("Call Driver")
                                        alertDialogBuilder.setMessage("You want to call " + transaksi.sender_name + "(" + transaksi.sender_number + ")?")
                                        alertDialogBuilder.setPositiveButton("yes",
                                            DialogInterface.OnClickListener { arg0, arg1 ->
                                                if (ActivityCompat.checkSelfPermission(this@ProgressActivity, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                    ActivityCompat.requestPermissions(this@ProgressActivity, arrayOf(Manifest.permission.CALL_PHONE), REQUEST_PERMISSION_CALL)
                                                    return@OnClickListener
                                                }
                                                val callIntent = Intent(Intent.ACTION_CALL)
                                                callIntent.data = Uri.parse("tel:" + transaksi.sender_number)
                                                startActivity(callIntent)
                                            })
                                        alertDialogBuilder.setNegativeButton("No") { dialog, _ -> dialog.dismiss() }
                                        val alertDialog = alertDialogBuilder.create()
                                        alertDialog.show()
                                    })
                                    binding!!.receiverphone.setOnClickListener(View.OnClickListener {
                                        val alertDialogBuilder = AlertDialog.Builder(this@ProgressActivity, R.style.DialogStyle)
                                        alertDialogBuilder.setTitle("Call Driver")
                                        alertDialogBuilder.setMessage("You want to call " + transaksi.receiver_name + "(" + transaksi.receiver_number + ")?")
                                        alertDialogBuilder.setPositiveButton("yes",
                                            DialogInterface.OnClickListener { arg0, arg1 ->
                                                if (ActivityCompat.checkSelfPermission(this@ProgressActivity, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                    ActivityCompat.requestPermissions(this@ProgressActivity, arrayOf(Manifest.permission.CALL_PHONE), REQUEST_PERMISSION_CALL)
                                                    return@OnClickListener
                                                }
                                                val callIntent = Intent(Intent.ACTION_CALL)
                                                callIntent.data = Uri.parse("tel:" + transaksi.receiver_number)
                                                startActivity(callIntent)
                                            })
                                        alertDialogBuilder.setNegativeButton("No") { dialog, which -> dialog.dismiss() }
                                        val alertDialog = alertDialogBuilder.create()
                                        alertDialog.show()
                                    })
                                }
                            }
                        } else {
                            binding!!.lldestination.visibility = View.GONE
                            binding!!.lldistance.visibility = View.GONE
                            binding!!.fitur.text = transaksi.estimasi
                        }
                        if (transaksi.status.equals(TransactionStatus.finish) && transaksi.rate.isNullOrEmpty()) {
                            val intent = Intent(this@ProgressActivity, RateActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                            intent.putExtra("id_driver", iddriver)
                            intent.putExtra("id_transaksi", idtrans)
                            intent.putExtra("response", response)
                            startActivity(intent)
                            finish()
                        }
                    }else{
                        Toast.makeText(applicationContext, "The detail is unavailable", Toast.LENGTH_SHORT).show()
                        onBackPressed()
                    }
                }
            }

            override fun onFailure(call: Call<DetailTransResponseJson>, t: Throwable) {}
        })
    }

    @SuppressLint("SetTextI18n")
    private fun parsedata(request: TransaksiModel, driver: DriverModel, fiturmodel: FiturModel?) {
        binding!!.rlprogress.visibility = View.GONE
        PicassoTrustAll.getInstance(this)
                .load(Constants.IMAGESDRIVER + driver.foto)
                .placeholder(R.drawable.image_placeholder)
                .into(binding!!.background)
        binding!!.layanandes.text = driver.nomor_kendaraan + " " + getString(R.string.text_with_bullet) + " " + driver.tipe
        Log.d("response", response!!)
        if (response == "5") {
            isCancelable = false
            binding!!.llchat.visibility = View.GONE
            binding!!.order.visibility = View.GONE
            binding!!.status.text = getString(R.string.notification_cancel)
        }
        if (response == "6") {
            isCancelable = false
            binding!!.llchat.visibility = View.GONE
            binding!!.order.visibility = View.GONE
            binding!!.status.text = "Order is pending." //Food
            binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
            binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
            binding!!.lllayananall.visibility = View.GONE
        }
        if (response == "7") {
            isCancelable = false
            binding!!.llchat.visibility = View.GONE
            binding!!.order.visibility = View.GONE
            binding!!.status.text = "Order has been Accepted." //Food
            binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
            binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
            binding!!.orderStepper.circleTwo.setBackgroundResource(R.drawable.check_circle)
            binding!!.lllayananall.visibility = View.GONE
        }
        val pickUpWrapper = LocationWrapper(
            request.startLongitude,
            request.startLatitude,
            request.alamatAsal
        )
        val destinationWrapper = LocationWrapper(
            request.endLongitude,
            request.endLatitude,
            request.alamatTujuan
        )
        mapHandler?.requestRouteWithPickUpMarker(pickUpWrapper, destinationWrapper)
        if(request.status != "4" && request.status != "5"){
            AppLogger.log("fitur -> $fitur")
            when(fitur){
                "16" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.car_rider)
                }

                "21" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.food_delivery)
                }

                "33" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.food_delivery)
                }

                "15" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.bike_rider)
                }

                "26" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.taxi_rider)
                }

                "35" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.food_delivery)
                }

                "30" -> {
                    mapHandler?.addDriverMarker(currentLatLng, "Driver", R.drawable.delivery_van)
                }
            }
        }else{
            mapHandler?.removeDriverMarker()
        }
        if (response != "2") {
            if (response != "3") {
                if (response == "4") {
                    //finish
                    isCancelable = false
                    binding!!.llchat.visibility = View.GONE
                    binding!!.order.visibility = View.GONE
                    if (fiturmodel!!.home == "4") {
                        binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
                        binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
                        binding!!.orderStepper.circleTwo.setBackgroundResource(R.drawable.check_circle)
                        binding!!.orderStepper.circleThree.setBackgroundResource(R.drawable.check_circle)
                        binding!!.orderStepper.circleFour.setBackgroundResource(R.drawable.check_circle)
                    }
                    binding!!.status.text = getString(R.string.notification_finish)
                }
                if (response == "5") {
                    isCancelable = false
                    binding!!.llchat.visibility = View.GONE
                    binding!!.order.visibility = View.GONE
                    if (fiturmodel!!.home == "4") {
                        binding!!.status.text = "Order has been canceled." //Food
                    } else {
                        binding!!.status.text = getString(R.string.notification_cancel)
                    }
                }
            } else {
                binding!!.llchat.visibility = View.VISIBLE
                isCancelable = false
                binding!!.order.visibility = View.GONE
                if (fiturmodel!!.home == "4") {
                    binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
                    binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleTwo.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleThree.setBackgroundResource(R.drawable.check_circle)
                    binding!!.status.text = "driver is on the way." //1948  //Food
                } else {
                    binding!!.status.text = getString(R.string.notification_start)
                }
            }
        } else {
            binding!!.llchat.visibility = View.VISIBLE
            if (fiturmodel!!.home == "4") {
                binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
                binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
                binding!!.orderStepper.circleTwo.setBackgroundResource(R.drawable.check_circle)
                //                circleThree.setBackgroundResource(R.drawable.check_circle);
                binding!!.status.text = "the driver is buying an order." //Food
            } else {
//                llchat.setVisibility(View.VISIBLE);
                binding!!.status.text = getString(R.string.notification_accept)
            }
        }
        binding!!.layanan.text = driver.namaDriver
        if(driver.id == "D0"){
            binding?.apply {
                vehicleNumber.text = "N/A"
                vehicleModel.text = "N/A"
                vehicleColor.text = "N/A"
            }
        }else{
            binding?.apply {
                vehicleNumber.text = driver.nomor_kendaraan
                vehicleModel.text = driver.merek
                vehicleColor.text = driver.warna
            }
        }
        if (fiturmodel!!.home == "4") {
            binding!!.pickUpText.text = request.nama_merchant
            Log.d("promo", "parsedata: " + request.discount + "---" + request.discount_total)
            binding!!.llVat.visibility = View.VISIBLE
            Utility.currencyTXT(binding!!.tvComission, java.lang.Long.valueOf(request.harga).toString(), this)
            Utility.currencyTXT(binding!!.cost, request.biaya_akhir, this)
            if (request.discount != null && request.discount != "") {
//                binding.diskon.setText(request.getDiscount());
                Utility.currencyTXT(binding!!.diskon, request.discount, this)
            } else {
                Utility.currencyTXT(binding!!.diskon, request.kreditPromo, this)
            }
            if (request.discount_total.isNullOrEmpty()) {
                Utility.currencyTXT(binding!!.price, request.grand_total, this)
            } else {
                Utility.currencyTXT(binding!!.price, request.discount_total, this)
                //                binding.cost.setText(request.getDiscount_total());
            }
            if(request.promo_code.isNullOrEmpty()){
                Utility.currencyTXT(binding!!.price, request.grand_total, this)
            }else{
                Utility.currencyTXT(binding!!.price, request.discount, this)
                Utility.currencyTXT(binding!!.price, request.discount_total, this)
            }
        } else {
            binding!!.pickUpText.text = request.alamatAsal
            Utility.currencyTXT(binding!!.cost, request.harga.toString(), this)
            Utility.currencyTXT(binding!!.price, request.biaya_akhir.toString(), this)
        }
        binding!!.destinationText.text = request.alamatTujuan
        try {

//            Utility.currencyTXT(binding.diskon, request.getKreditPromo(), this);
//            Utility.currencyTXT(priceText, String.valueOf(request.getGrand_total()), this);
        } catch (e: Exception) {
            e.printStackTrace()
        }
        binding!!.phonenumber.setOnClickListener(View.OnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this@ProgressActivity, R.style.DialogStyle)
            alertDialogBuilder.setTitle("Call Driver")
            alertDialogBuilder.setMessage("You want to call driver (" + driver.noTelepon + ")?")
            alertDialogBuilder.setPositiveButton("yes",
                    DialogInterface.OnClickListener { arg0, arg1 ->
                        if (ActivityCompat.checkSelfPermission(this@ProgressActivity, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(this@ProgressActivity, arrayOf(Manifest.permission.CALL_PHONE), REQUEST_PERMISSION_CALL)
                            return@OnClickListener
                        }
                        val callIntent = Intent(Intent.ACTION_CALL)
                        callIntent.data = Uri.parse("tel:" + driver.noTelepon.replace("977", ""))
                        startActivity(callIntent)
                    })
            alertDialogBuilder.setNegativeButton("No") { dialog, which -> dialog.dismiss() }
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        })
        binding!!.info.setOnClickListener { v: View? ->
            val intent = Intent(applicationContext, DriverDetailActivity::class.java)
            intent.putExtra("name", driver.namaDriver)
            intent.putExtra("image", driver.foto)
            intent.putExtra("mobile", driver.noTelepon)
            intent.putExtra("rating", driver.rating)
            intent.putExtra("tipe", driver.tipe)
            intent.putExtra("driverjob", driver.driverJob)
            intent.putExtra("merek", driver.merek)
            intent.putExtra("kendaraan", driver.nomor_kendaraan)
            intent.putExtra("warna", driver.warna)
            startActivity(intent)
        }
    }

    private fun cancelOrder(cancel_reason: String) {
        binding!!.rlprogress.visibility = View.VISIBLE
        val loginUser = BaseApp.getInstance(this@ProgressActivity).loginUser
        val requestcancel = CancelBookRequestJson()
        requestcancel.id = loginUser.id
        requestcancel.id_transaksi = idtrans
        requestcancel.id_driver = loginUser.id
        requestcancel.reason = cancel_reason
        val service = ServiceGenerator.createService(BookService::class.java, loginUser.email, loginUser.password,loginUser.token)
        service.cancelOrder(requestcancel).enqueue(object : Callback<CancelBookResponseJson> {
            override fun onResponse(call: Call<CancelBookResponseJson>, response: Response<CancelBookResponseJson>) {
                if (response.isSuccessful) {
                    if (Objects.requireNonNull(response.body())?.mesage == "canceled") {
                        mapHandler?.removeDriverMarker()
                        AppRideStatus.currentStatus = RideStatus.idle
                        binding!!.rlprogress.visibility = View.GONE
                        fcmcancel()
                        fcmcancelmerchant()
                        notif("Order Canceled!")
                        finish()
                    } else {
                        binding!!.rlprogress.visibility = View.GONE
                        notif(response.body()!!.mesage)
                    }
                }
            }

            override fun onFailure(call: Call<CancelBookResponseJson>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

    private fun fcmcancel() {
        val response = DriverResponse()
        response.type = FCMType.ORDER
        response.idTransaksi = idtrans
        response.response = DriverResponse.REJECT
        val reg_id = ArrayList<String?>()
        reg_id.add(regdriver)
        val message = FCMMessage()
        message.to = reg_id
        message.data = response
        FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(object : okhttp3.Callback {
            override fun onResponse(call: okhttp3.Call, response: okhttp3.Response) {}
            override fun onFailure(call: okhttp3.Call, e: IOException) {
                e.printStackTrace()
            }
        })
    }

    private fun fcmcancelmerchant() {
        val response = DriverResponse()
        response.type = FCMType.ORDER
        response.idTransaksi = idtrans
        response.response = Constants.CANCEL.toString()
        val reg_id = ArrayList<String?>()
        reg_id.add(tokenmerchant)
        val message = FCMMessage()
        message.to = reg_id
        message.data = response
        FCMHelper.sendMessage(Constants.FCM_KEY, message).enqueue(object : okhttp3.Callback {
            override fun onResponse(call: okhttp3.Call, response: okhttp3.Response) {}
            override fun onFailure(call: okhttp3.Call, e: IOException) {
                e.printStackTrace()
            }
        })
    }

    fun notif(text: String?) {
        binding!!.rlnotif.visibility = View.VISIBLE
        binding!!.textnotif.text = text
        Handler().postDelayed({ binding!!.rlnotif.visibility = View.GONE }, 3000)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mapHandler = RideRequestMapHandler(googleMap, null, applicationContext, this)
        mapHandler?.initMap()
        getData(idtrans, iddriver)
    }

    fun onFabClicked(view: View?) {
        val REQUEST_PHONE_CALL = 1
        val callIntent = Intent(Intent.ACTION_CALL)
        callIntent.data = Uri.parse("tel:" + SettingPreference(applicationContext).setting[3])
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), REQUEST_PHONE_CALL)
            } else {
                startActivity(callIntent)
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun orderHandler(code: Int) {
        when (code) {

            Constants.REJECT -> {
                isCancelable = false
                binding!!.order.visibility = View.GONE
            }
            
            Constants.CANCEL -> {
                mapHandler?.removeDriverMarker()
                isCancelable = false
                binding!!.order.visibility = View.GONE
                binding!!.llchat.visibility = View.GONE
                binding!!.status.text = getString(R.string.notification_cancel)
            }

            Constants.PENDING -> {
                isCancelable = false
                binding!!.order.visibility = View.GONE
                binding!!.llchat.visibility = View.GONE
                binding!!.status.text = "Order is in pending."
            }

            Constants.VERIFIED -> {
                isCancelable = false
                binding!!.order.visibility = View.GONE
                binding!!.llchat.visibility = View.GONE
                binding!!.status.text = "Order is Verified."
            }

            Constants.ACCEPT -> {
                binding!!.llchat.visibility = View.VISIBLE
                if (gethome == "4") {
                    binding!!.status.text = "the driver is buying an order" //food
                    //                    status.setText("the driver is buying an order");
                    binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
                    binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleTwo.setBackgroundResource(R.drawable.check_circle)
                    //                    circleThree.setBackgroundResource(R.drawable.check_circle);
                } else {
                    binding!!.status.text = getString(R.string.notification_accept)
                }
            }

            Constants.START -> {
                binding!!.llchat.visibility = View.VISIBLE
                isCancelable = false
                binding!!.order.visibility = View.GONE
                if (gethome == "4") {
                    binding!!.status.text = "driver delivers the order"
                    binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
                    binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleTwo.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleThree.setBackgroundResource(R.drawable.check_circle)
                } else {
                    binding!!.status.text = getString(R.string.notification_start)
                }
                isCancelable = false
                binding!!.llchat.visibility = View.GONE
                binding!!.order.visibility = View.GONE
                if (gethome == "4") {
                    binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
                    binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleTwo.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleThree.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleFour.setBackgroundResource(R.drawable.check_circle)
                }
                binding!!.status.text = getString(R.string.notification_finish)
                getData(idtrans, iddriver)
            }

            Constants.FINISH -> {
                mapHandler?.removeDriverMarker()
                isCancelable = false
                binding!!.llchat.visibility = View.GONE
                binding!!.order.visibility = View.GONE
                if (gethome == "4") {
                    binding!!.orderStepper.orderStepper.visibility = View.VISIBLE
                    binding!!.orderStepper.circleOne.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleTwo.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleThree.setBackgroundResource(R.drawable.check_circle)
                    binding!!.orderStepper.circleFour.setBackgroundResource(R.drawable.check_circle)
                }
                binding!!.status.text = getString(R.string.notification_finish)
                getData(idtrans, iddriver)
            }
        }
    }

    fun onButtonShowPopupWindowClick(view: View?) {

        // inflate the layout of the popup window
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.popup_window, null)
        val cancel_reason = popupView.findViewById<TextView>(R.id.cancel_reason)
        val cancel_reason2 = popupView.findViewById<TextView>(R.id.cancel_reason2)
        val cancel_reason3 = popupView.findViewById<TextView>(R.id.cancel_reason3)

        // create the popup window
        val width = LinearLayout.LayoutParams.MATCH_PARENT
        val height = LinearLayout.LayoutParams.MATCH_PARENT
        val focusable = true // lets taps outside the popup also dismiss it
        val popupWindow = PopupWindow(popupView, width, height, focusable)

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(view, Gravity.BOTTOM, 0, 0)

        cancel_reason.setOnClickListener {
            popupWindow.dismiss()
            cancelOrder(cancel_reason.text.toString())
        }
        cancel_reason2.setOnClickListener {
            popupWindow.dismiss()
            cancelOrder(cancel_reason2.text.toString())
        }
        cancel_reason3.setOnClickListener {
            popupWindow.dismiss()
            cancelOrder(cancel_reason3.text.toString())
        }
        popupView.findViewById<View>(R.id.btn_cancel).setOnClickListener { v: View? -> popupWindow.dismiss() }
    }

    private val driverLocationReceiver = object : DriverLocationBroadcast() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            super.onReceive(p0, p1)
            val locationData = p1?.getSerializableExtra("driver_location") as DriverLocationData?
            AppLogger.log("Broadcast : Latitude from service -> ${locationData?.latitude} || Longitude from service -> ${locationData?.longitude}")
            if (!iddriver.isNullOrEmpty()) {
                if (locationData?.driverId == iddriver) {
                    if (locationData != null) {
                        currentLatLng = LatLng(locationData.latitude!!, locationData.longitude!!)
                        mapHandler?.updateDriverMarker(currentLatLng, locationData.bearing)
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        LocalBroadcastManager.getInstance(this).registerReceiver(
            driverLocationReceiver,
            IntentFilter(BroadCastIntents.driverLocationReceiver)
        )
    }

    override fun onPause() {
        super.onPause()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(driverLocationReceiver)
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    fun onMessageEvent(response: DriverResponse) {
        Log.e("IN PROGRESS", response.response + " " + response.id + " " + response.idTransaksi)
        if (complete != "true") {
            orderHandler(response.response.toInt())
            val responses = DriverResponse()
            responses.id = ""
            responses.idTransaksi = ""
            responses.response = ""
            EventBus.getDefault().postSticky(responses)
        }
    }

    companion object {
        private const val REQUEST_PERMISSION_CALL = 992
    }
}