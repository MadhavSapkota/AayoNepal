package com.ourdevelops.ourjek.activity.cart.checkout

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.florent37.singledateandtimepicker.dialog.SingleDateAndTimePickerDialog
import com.google.android.gms.maps.model.LatLng
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.PicklocationActivity
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.base.payment.OnlinePaymentContractor
import com.ourdevelops.ourjek.base.payment.OnlinePaymentPresenter
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes
import com.ourdevelops.ourjek.customviews.dialogs.CustomProgressDialog
import com.ourdevelops.ourjek.databinding.ActivityCheckoutBinding
import com.ourdevelops.ourjek.fragment.promo.PromoCodeBSFragment
import com.ourdevelops.ourjek.fragment.promo.PromoCodeUseInretface
import com.ourdevelops.ourjek.json.PaymentMethodRequestJson
import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum
import com.ourdevelops.ourjek.models.CartPriceWrapper
import com.ourdevelops.ourjek.models.KodePromoModel
import com.ourdevelops.ourjek.models.PaymentMethodObject
import com.ourdevelops.ourjek.models.PaymentMethods
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.ProjectUtils
import com.ourdevelops.ourjek.utils.RestaurantTimeHandler
import com.ourdevelops.ourjek.utils.Utility
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class CheckoutActivity : AppCompatActivity(), CheckoutContractor.View, PromoCodeUseInretface,
    PaymentMethodContractor, OnlinePaymentContractor.View {
    private var deliveryCharge: Double = 0.0
    private var deliveryFree: Boolean = false
    private lateinit var binding: ActivityCheckoutBinding
    private var cartData: CartResponse? = null
    private var promoList = ArrayList<KodePromoModel>()
    var promoUsed: KodePromoModel? = null
    private lateinit var presenter: CheckoutPresenter
    private lateinit var paymentPresenter: OnlinePaymentPresenter
    private var destinationLatLang: LatLng? = null
    private lateinit var fragment: PromoCodeBSFragment
    var promoCode: KodePromoModel? = null
    var promoPosition: Int? = null
    var promoStatus: Boolean = false
    var discountTotal: String? = null
    var discount: Double? = null
    lateinit var openingTime: Date
    lateinit var closingTime: Date
    var checkDeliveryTime = RestaurantTimeHandler()
    lateinit var deliveryTime: String
    var checked: Boolean = false
    lateinit var fiturKey: String
    var grandTotal: Double = 0.0
    private lateinit var priceWrapper: CartPriceWrapper
    private var idRestaurant: String? = null

    //payment methods//
    var currentSelectedPaymentMethod = 0
    var paymentMethods = ArrayList<PaymentMethodObject>()
    private lateinit var paymentMethodsAdapter: PaymentMethodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = CheckoutPresenter(applicationContext, this)
        paymentPresenter = OnlinePaymentPresenter(applicationContext, this, this)
        receiveIntents()
        checkDeliveryTime.setOpeningHour(openingTime)
        checkDeliveryTime.setClosingHour(closingTime)
        presenter.requestPaymentMethods()
        presenter.requestPromoCodes(idRestaurant)
        buttonClicks()
        Utility.currencyTXT(binding.cost, cartData?.distance_price_range?.get(0)?.price, this)
        Utility.currencyTXT(
            binding.tvTotalPrice,
            calculateTotal(cartData?.distance_price_range?.get(0)?.price?.toDouble()),
            applicationContext
        )
    }

    override fun onPromoCodesResponse(promoCodes: ArrayList<KodePromoModel>) {
        promoList.clear()
        promoList.addAll(promoCodes)
        binding.btnApplyPromoCode.visibility = View.VISIBLE
    }

    override fun onPromoCodesError() {
        binding.btnApplyPromoCode.visibility = View.GONE
    }

    override fun onPaymentMethods(response: ArrayList<PaymentMethodObject>) {
        paymentMethods.clear()
        paymentMethods.addAll(response)
        binding.rvPaymentMethods.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        paymentMethodsAdapter = PaymentMethodAdapter(this, paymentMethods, this)
        binding.rvPaymentMethods.adapter = paymentMethodsAdapter
        paymentMethodsAdapter.notifyDataSetChanged()
    }

    override fun onPaymentMethodChanged(position: Int) {
        paymentMethods[currentSelectedPaymentMethod].isSelected = false
        paymentMethods[position].isSelected = true
        currentSelectedPaymentMethod = position
        paymentMethodsAdapter.notifyDataSetChanged()
        if (paymentMethods[currentSelectedPaymentMethod].paymentMethod == PaymentMethods.cashOnDelivery) {
            binding.btnPlaceOrder.text = "Confirm & place order"
        } else {
            binding.btnPlaceOrder.text = "Confirm & make payment"
        }
    }

    private fun buttonClicks() {
        binding.cardLocation.setOnClickListener {
            val intent = Intent(this, PicklocationActivity::class.java)
            intent.putExtra(PicklocationActivity.FORM_VIEW_INDICATOR, 1)
            startActivityForResult(intent, PicklocationActivity.LOCATION_PICKER_ID)
        }

        binding.btnPlaceOrder.setOnClickListener {
            placeOrder()
        }

        binding.imgBack.setOnClickListener {
            finish()
        }

        binding.btnApplyPromoCode.setOnClickListener {
            if (binding.tvAddress.text.toString() == "Select a delivery location." || binding.tvAddress.text.toString()
                    .isEmpty()
            ) {
                Toast.makeText(this, "Please select your delivery address", Toast.LENGTH_SHORT)
                    .show()
            } else {
                openPromoCodeFragment()
            }
        }

        binding.llPromo.setOnClickListener {
            if (binding.tvAddress.text.toString() == "Select a delivery location." || binding.tvAddress.text.toString()
                    .isEmpty()
            ) {
                Toast.makeText(this, "Please select your delivery address", Toast.LENGTH_SHORT)
                    .show()
            } else {
                openPromoCodeFragment()
            }
        }

        binding.asap.callOnClick()

        if (!checked) {
            binding.tvChooseTime.setOnClickListener {
                timePickerMethod()
            }
        }
    }

    private fun openPromoCodeFragment() {
        if (!binding.tvPromo.text.equals("No Promo Codes Available")) {
            val bundle = Bundle()
            bundle.putSerializable("promo", promoList)
            bundle.putDouble("price", grandTotal)
            fragment = PromoCodeBSFragment()
            fragment.setInterface(this)
            fragment.arguments = bundle
            fragment.show(supportFragmentManager, fragment.tag)
        }
    }

    private fun placeOrder() {
        AppLogger.log("${checkDeliveryTime.openTime} -> ${checkDeliveryTime.closeTime} -> ${Calendar.getInstance().time} -> ${checkDeliveryTime.checkSelectedDeliveryTime()}")
        if (binding.tvAddress.text.toString() == "Select a delivery location." || binding.tvAddress.text.toString()
                .isEmpty()
        ) {
            Toast.makeText(this, "Please select your delivery address", Toast.LENGTH_SHORT).show()
        } else if (checked && binding.tvChooseTime.text.toString() == "Choose a time") {
            Toast.makeText(this, "Please select your preferred delivery time", Toast.LENGTH_SHORT)
                .show()
        } else if(checkDeliveryTime.isRestaurantOpen(Calendar.getInstance().time)) {
            if (promoStatus) {
                promoUsed = promoList[promoPosition!!]
            }
            callPlaceOrderApi()
        } else{
            Toast.makeText(this, "You cannot place an order when the merchant is closed.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun callPlaceOrderApi() {
        CustomProgressDialog.showDialog("Checking out", "Please wait..", this)
        val isCashOnDelivery = paymentMethods[currentSelectedPaymentMethod].paymentMethod == PaymentMethods.cashOnDelivery
        presenter.sendOrder(
            destinationLatLang!!,
            cartData!!,
            intent.getSerializableExtra(IntentKeys.datam) as Datum,
            intent.getStringExtra(IntentKeys.alamatresto),
            intent.getStringExtra(IntentKeys.idresto)!!,
            intent.getDoubleExtra(IntentKeys.distance, 0.0),
            intent.getLongExtra(IntentKeys.promocode, 0),
            binding.tvAddress.text.toString(),
            deliveryTime,
            grandTotal.toString(),
            promoStatus,
            promoUsed,
            discount?.toString(),
            discountTotal,
            fiturKey,
            priceWrapper,
            deliveryFree,
            isCashOnDelivery,
            paymentMethods[currentSelectedPaymentMethod].paymentMethod.name
        )
    }

    private fun timePickerMethod() {
        val oneMinuteInMillis: Long = 60000 //millisecs
        val date = Calendar.getInstance()
        val t = date.timeInMillis
        val afterAddingFortyFiveMinutes = Date(t + 45 * oneMinuteInMillis)
        SingleDateAndTimePickerDialog.Builder(this)
            .curved()
            .customLocale(Locale.ENGLISH)
            .mainColor(resources.getColor(R.color.colorPrimary))
            .displayYears(false)
            .mustBeOnFuture()
            .defaultDate(afterAddingFortyFiveMinutes)
            .displayListener { }
            .title("Delivery Time")
            .listener {
                Log.d("date", date.toString())
                val calendar = Calendar.getInstance()
                calendar.add(Calendar.DAY_OF_YEAR, 1)
                val tomorrow = calendar.time
                if (date.before(Date(t + 44 * oneMinuteInMillis))) {
                    ProjectUtils.showToast(
                        applicationContext,
                        "Minimum delivery time is 45 minutes"
                    )
                } else if (date.after(tomorrow)) {
                    ProjectUtils.showToast(
                        applicationContext,
                        "We are processing for Future Delivery."
                    )
                } else {
                    val simpleDateFormat = SimpleDateFormat("hh:mm a")
                    val calDeliver = Calendar.getInstance(TimeZone.getTimeZone("NPT"))
                    val hour = it.hours
                    val minute = it.minutes
                    val deliveryTime = "$hour:$minute"
                    calDeliver.time = SimpleDateFormat("HH:mm").parse(deliveryTime)
                    checkDeliveryTime.setDelivertTime(calDeliver.time)
                    AppLogger.log("${calDeliver.time} -> ${checkDeliveryTime.openTime} -> ${checkDeliveryTime.closeTime} -> ${checkDeliveryTime.checkSelectedDeliveryTime()}")

                    if (checkDeliveryTime.checkSelectedDeliveryTime()) {
                        binding.tvChooseTime.text = (simpleDateFormat.format(calDeliver.time))
                        binding.scheduled.isChecked = true
                        this.checked = true
                        this.deliveryTime = binding.tvChooseTime.text.toString()
                    } else {
                        ProjectUtils.showToast(
                            applicationContext,
                            "Please choose delivery time within opening and closing hours."
                        )
                    }
                }
            }.display()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PicklocationActivity.LOCATION_PICKER_ID) {
            if (resultCode == RESULT_OK) {
                val addressset = data?.getStringExtra(PicklocationActivity.LOCATION_NAME)
                val latLng: LatLng =
                    data?.getParcelableExtra(PicklocationActivity.LOCATION_LATLNG)!!
                binding.tvAddress.text = addressset
                destinationLatLang =
                    LatLng(Objects.requireNonNull(latLng).latitude, latLng.longitude)
                calculateDeliveryCharge(destinationLatLang!!)
            }
        }
    }

    private fun calculateDeliveryCharge(latlng: LatLng) {
        deliveryCharge = 0.0
        val jarak = NewDetailOrderActivity.getKmFromLatLong(
            latlng.latitude,
            latlng.longitude,
            cartData!!.data?.get(0)?.latitudeMerchant?.toDouble(),
            cartData!!.data?.get(0)?.longitudeMerchant?.toDouble()
        )
        cartData?.distance_price_range?.forEach {
            AppLogger.log("check -> ${it.start_distance} <= $jarak <= ${it.end_distance} = ${it.price}")
            if (it.start_distance!! <= jarak && jarak < it.end_distance!!) {
                AppLogger.log("confirm -> ${it.start_distance} <= $jarak <= ${it.end_distance} = ${it.price}")
                deliveryCharge = it.price?.toDouble()!!
                Utility.currencyTXT(binding.cost, it.price, this)
                priceWrapper.deliveryCharge = deliveryCharge
            }
        }
        Utility.currencyTXT(
            binding.tvTotalPrice,
            calculateTotal(deliveryCharge),
            applicationContext
        )
    }

    private fun calculateTotal(deliveryCharge: Double?): String {
        val total = intent.getStringExtra(IntentKeys.price)!!.replace("Rs ", "").replace(",", "")
        Log.d("calculateTotal", "calculateTotal: $total")
        grandTotal = (total.toFloat() + deliveryCharge!! / 100)
        Log.d("grandTotal", "calculateTotal: $grandTotal")
        priceWrapper.totalPrice = grandTotal / 100
        Log.d("grandTotal", "calculateTotal: $grandTotal")
        return (grandTotal * 100).toString()
    }

    private fun receiveIntents() {
        val loginUser = BaseApp.getInstance(this).loginUser
        cartData = intent.getSerializableExtra(IntentKeys.Object) as CartResponse?
        priceWrapper = intent.getSerializableExtra(IntentKeys.PriceWrapper) as CartPriceWrapper
        binding.tvTotalPrice.text = intent.getStringExtra(IntentKeys.price)
        binding.tvContactNumber.text = loginUser.phone
        openingTime = SimpleDateFormat("HH:mm").parse(intent.getStringExtra("open"))
        closingTime = SimpleDateFormat("HH:mm").parse(intent.getStringExtra("close"))
        if (!intent.getStringExtra("fitur").equals(null)) {
            fiturKey = intent.getStringExtra("fitur").toString()
        }
        idRestaurant = intent.getStringExtra(IntentKeys.idresto).toString()
    }

    override fun onOrderSuccessful(message: String) {
        when (paymentMethods[currentSelectedPaymentMethod].paymentMethod) {
            PaymentMethods.cashOnDelivery -> {
                showOrderPlacedDialog(message)
            }
            else -> {
                val paymentAmount = if (discountTotal != null) {
                    discountTotal
                } else {
                    grandTotal
                }
                paymentPresenter.getReferenceIdFromServer(
                    paymentMethods[currentSelectedPaymentMethod].paymentMethod.name,
                    paymentAmount.toString()
                )
            }
        }
    }

    private fun showOrderPlacedDialog(message: String) {
        CustomProgressDialog.dismissDialog()
        CustomDialogYes.setMessage(message)
            .showYesDialog(this, object : CustomDialogYes.dialogOnClickListener {
                override fun onClick() {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    CustomProgressDialog.dismissDialog()
                    finishAffinity()
                }

                override fun onClose() {
                }
            })
    }

    override fun onOrderFailed(message: String) {
        CustomProgressDialog.showDialog("Checking out", "Please wait..", this)
    }

    override fun changeTotal(
        position: Int,
        discountTotal: Double,
        discount: Double,
        grandTotal: Double
    ) {
        priceWrapper.totalPrice = grandTotal
        priceWrapper.discountTotal = discountTotal
        fragment.dismiss()
        this.promoPosition = position
        this.promoStatus = true
        this.discountTotal = discountTotal.toString()
        this.discount = discount
        binding.llPromo.visibility = View.VISIBLE
        Utility.currencyTXT(binding.cost, deliveryCharge.toString(), applicationContext)

        changeText()

        promoCode = promoList[position]
        setPromoCodeView()
    }

    override fun onComplimentaryApplied(
        position: Int,
        discountTotal: Double,
        discount: Double,
        total: Double
    ) {
        fragment.dismiss()
        this.promoPosition = position
        this.promoStatus = true
        this.discount = discount
        this.discountTotal = discountTotal.toString()
        binding.llPromo.visibility = View.VISIBLE
        Utility.currencyTXT(
            binding.tvTotalPrice,
            calculateTotal(deliveryCharge),
            applicationContext
        )
        Utility.currencyTXT(binding.cost, deliveryCharge.toString(), applicationContext)
        promoCode = promoList[position]
        setPromoCodeView()
    }

    override fun onFreeDeliveryApplied(position: Int, total: Double) {
        fragment.dismiss()
        this.promoPosition = position
        this.deliveryFree = true
        this.promoStatus = true
        this.promoStatus = true
        this.discountTotal = (((grandTotal - (deliveryCharge / 100)) * 100).toString())
        this.discount = deliveryCharge
        binding.llPromo.visibility = View.VISIBLE

        changeText()

        val modifiedPriceString =
            "<strike> <small> <font color=\"gray\" >${deliveryCharge / 100}</font></small></strike>   <bold> FREE</bold>"

        binding.cost.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(modifiedPriceString, Html.FROM_HTML_MODE_COMPACT)
        } else {
            Html.fromHtml(modifiedPriceString)
        }
        promoCode = promoList[position]
        setPromoCodeView()
    }

    private fun changeText() {
        val modifiedPriceString =
            "Rs. ${formatDoubleDecimal(discountTotal!!.toDouble() / 100)}  <strike> <small> <font color=\"gray\" >${
                formatDoubleDecimal(grandTotal)
            }</font></small></strike> "
        binding.tvTotalPrice.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(modifiedPriceString, Html.FROM_HTML_MODE_COMPACT)
        } else {
            Html.fromHtml(modifiedPriceString)
        }
    }

    private fun formatDoubleDecimal(rawNumber: Double): String {
        return "%.2f".format(rawNumber)
    }

    private fun setPromoCodeView() {
        if (promoStatus) {
            binding.llPromo.setUpView(promoCode)
            binding.llPromo.visibility = View.VISIBLE
            binding.btnApplyPromoCode.visibility = View.GONE
        } else {
            binding.llPromo.visibility = View.GONE
            binding.btnApplyPromoCode.visibility = View.VISIBLE
        }
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked
            when (view.id) {
                R.id.asap ->
                    if (checked) {
                        this.checked = false
                        val _24HourTime = checkDeliveryTime.setAsapDeliveryTime()
                        val _24HourSDF = SimpleDateFormat("HH:mm")
                        val _12HourSDF = SimpleDateFormat("hh:mm a")
                        val _24HourDt = _24HourSDF.parse(_24HourTime)
                        deliveryTime = _12HourSDF.format(_24HourDt)
                        binding.tvChooseTime.text = "Choose a time"
                    }

                R.id.scheduled ->
                    if (checked) {
                        this.checked = true
                        timePickerMethod()
                    }
            }
        }

    }

    override fun onReferenceIdReceived() {
        CustomProgressDialog.showDialog("Confirming order", "Please wait..", this)
        CustomProgressDialog.dismissDialog()
    }

    override fun onConfirmationFailure(message: String) {
        CustomProgressDialog.dismissDialog()
        CustomDialogOkay.apply {
            setTitle("Error")
            setMessage(message)
            showOnlyDialog(this@CheckoutActivity, object : CustomDialogOkay.dialogOnClickListener {
                override fun onClick() {
                    dismiss()
                }

                override fun onClose() {
                    dismiss()
                }

            })
        }
    }

    override fun onThirdPartyPaymentFailure(errorMessage: String) {
        CustomProgressDialog.dismissDialog()
        CustomDialogOkay.setTitle(errorMessage)
            .showOnlyDialog(this, object : CustomDialogOkay.dialogOnClickListener {
                override fun onClick() {
                }

                override fun onClose() {
                }
            })
    }

    override fun confirmPayment(paymentMethodRequestJson: PaymentMethodRequestJson) {
        presenter.paymentMethodRequestJson = paymentMethodRequestJson
        presenter.updateTransactionPaymentStatus()
    }

    override fun onPaymentSyncedWithCheckout() {
        showOrderPlacedDialog("Order placed successfully")
    }

    override fun onPaymentSyncWithCheckoutFailure() {
        CustomProgressDialog.dismissDialog()
        CustomDialogOkay.setTitle("Could not place order.")
            .showOnlyDialog(this, object : CustomDialogOkay.dialogOnClickListener {
                override fun onClick() {
                }

                override fun onClose() {
                }
            })
    }

}