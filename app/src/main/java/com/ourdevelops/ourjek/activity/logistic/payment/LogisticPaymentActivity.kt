package com.ourdevelops.ourjek.activity.logistic.payment

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourjek.activity.cart.checkout.PaymentMethodAdapter
import com.ourdevelops.ourjek.activity.cart.checkout.PaymentMethodContractor
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import com.ourdevelops.ourjek.base.payment.OnlinePaymentContractor
import com.ourdevelops.ourjek.base.payment.OnlinePaymentPresenter
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes
import com.ourdevelops.ourjek.customviews.dialogs.CustomProgressDialog
import com.ourdevelops.ourjek.databinding.ActivityLogisticPaymentBinding
import com.ourdevelops.ourjek.fragment.promo.PromoCodeBSFragment
import com.ourdevelops.ourjek.fragment.promo.PromoCodeUseInretface
import com.ourdevelops.ourjek.json.PaymentMethodRequestJson
import com.ourdevelops.ourjek.models.KodePromoModel
import com.ourdevelops.ourjek.models.PaymentMethodObject
import com.ourdevelops.ourjek.models.PaymentMethods
import com.ourdevelops.ourjek.utils.Utility

class LogisticPaymentActivity : AppCompatActivity(), LogisticPaymentContractor.View, PaymentMethodContractor, OnlinePaymentContractor.View,
    PromoCodeUseInretface {

    private var currentSelectedPaymentMethod: Int = 0
    private lateinit var paymentMethodsAdapter: PaymentMethodAdapter
    private lateinit var binding: ActivityLogisticPaymentBinding
    private lateinit var presenter: LogisticPaymentPresenter
    private lateinit var paymentPresenter: OnlinePaymentPresenter
    private lateinit var allData: LogisticDataModel
    private val progressDialog = CustomProgressDialog
    var paymentMethods = ArrayList<PaymentMethodObject>()
    private val promoList = ArrayList<KodePromoModel>()
    private lateinit var fragment: PromoCodeBSFragment
    var promoCode: KodePromoModel? = null
    var promoStatus: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLogisticPaymentBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        paymentPresenter = OnlinePaymentPresenter(applicationContext, this, this)
        setContentView(binding.root)
        getIntentData()
        presenter = LogisticPaymentPresenter(applicationContext, this, allData)
        presenter.requestPromoCodes()
        presenter.calculateAllFee()
        onButtonClicks()
    }

    override fun setUpViews(allData: LogisticDataModel) {
        this.allData = allData
        //payment methods
        paymentMethods.add(PaymentMethodObject(PaymentMethods.cashOnDelivery, true))
        paymentMethods.add(PaymentMethodObject(PaymentMethods.imePay, false))
        paymentMethods.add(PaymentMethodObject(PaymentMethods.prabhuPay, false))
        binding.rvPaymentMethods.layoutManager =  LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        paymentMethodsAdapter = PaymentMethodAdapter(this, paymentMethods, this)
        binding.rvPaymentMethods.adapter = paymentMethodsAdapter
        paymentMethodsAdapter.notifyDataSetChanged()

        //sender
        binding.senderName.text = allData.senderName
        binding.senderAddress.text = allData.pickUpLocation
        binding.senderNumber.text = allData.senderNumber

        //receiver
        binding.receiverName.text = allData.receiverName
        binding.receiverNumber.text = allData.receiverNumber
        binding.receiverAddress.text = allData.destinationLocation

        //bill
        binding.billToName.text = allData.senderName

        //delivery
        binding.estimatedDistance.text = "Delivery fee (${(allData.distance)} kms) :"
        binding.deliveryFee.text = "Rs. ${allData.deliveryFee}"

        //weight
        binding.estimatedWeight.text = "Weight fee (${allData.chosenEstimatedWeight}) :"
        binding.weightFee.text = "Rs. ${allData.weightFee}"

        //loader
        if(allData.selectedNumberOfLoaders != null && allData.selectedNumberOfLoaders != 0){
            binding.estimatedLoader.text = "Loader fee (${allData.selectedNumberOfLoaders} loaders) :"
            binding.loaderFee.text = "Rs. ${allData.loaderFee}"
        }

        if(!allData.remarks.isNullOrEmpty()){
            binding.remarksLayout.visibility = View.VISIBLE
            binding.remarks.text = allData.remarks
        }

        //total
        binding.total.text = "Rs. ${allData.total}"
    }

    override fun onConfirmationSuccess(message: String) {
        CustomDialogYes.setMessage(message).showYesDialog(this, object : CustomDialogYes.dialogOnClickListener {
            override fun onClick() {
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finishAffinity()
            }

            override fun onClose() {

            }
        })
        progressDialog.dismissDialog()
    }

    override fun onConfirmationFailure(s: String) {
        progressDialog.dismissDialog()
        CustomDialogOkay.apply {
            setTitle("Error")
            setMessage(s)
            showOnlyDialog(this@LogisticPaymentActivity, object : CustomDialogOkay.dialogOnClickListener{
                override fun onClick() {
                    dismiss()
                }

                override fun onClose() {
                    dismiss()
                }

            })
        }
    }

    override fun onThirdPartyPaymentFailure(s: String) {
        CustomDialogOkay.setTitle(s).showOnlyDialog(this, object : CustomDialogOkay.dialogOnClickListener {
            override fun onClick() {

            }

            override fun onClose() {

            }

        })
    }

    override fun confirmPayment(paymentMethodRequestJson: PaymentMethodRequestJson) {
        presenter.updateTransactionPaymentStatus(paymentMethodRequestJson)
    }

    override fun onReferenceIdReceived() {
        progressDialog.dismissDialog()
    }

    override fun onPaymentSyncedWithCheckout() {
        onConfirmationSuccess("Payment was successful for your delivery order..")
    }

    override fun onPaymentSyncWithCheckoutFailure() {
        onConfirmationFailure("The order was paid but there was some issue trying to update the order. Contact an admin for help..")
    }

    override fun onPromoCodesError() {
        binding.btnApplyPromoCode.visibility = View.GONE
    }

    override fun onPromoCodesResponse(promoCodes: ArrayList<KodePromoModel>) {
        promoList.clear()
        promoList.addAll(promoCodes)
        binding.btnApplyPromoCode.visibility = View.VISIBLE
    }

    private fun getIntentData() {
        allData = intent.getSerializableExtra("allData") as LogisticDataModel
    }

    private fun onButtonClicks() {
        binding.confirm.setOnClickListener{
            when(paymentMethods[currentSelectedPaymentMethod].paymentMethod){
                PaymentMethods.cashOnDelivery -> {
                    presenter.confirmPayment(allData, PaymentMethodRequestJson(true))
                }

                else -> {
                    progressDialog.dismissDialog()
                    presenter.confirmPayment(allData, PaymentMethodRequestJson(false))
                    paymentPresenter.getReferenceIdFromServer(paymentMethods[currentSelectedPaymentMethod].paymentMethod.name, allData.total)
                }
            }
        }

        binding.btnApplyPromoCode.setOnClickListener {
            openPromoCodeFragment()
        }

        binding.llPromo.setOnClickListener {
            openPromoCodeFragment()
        }
    }

    private fun openPromoCodeFragment() {
        val bundle = Bundle()
        bundle.putSerializable("promo", promoList)
        bundle.putDouble("price", allData.total.toString().toDouble())
        fragment = PromoCodeBSFragment()
        fragment.setInterface(this)
        fragment.arguments = bundle
        fragment.show(supportFragmentManager, fragment.tag)
    }

    override fun onPaymentMethodChanged(position: Int) {
        paymentMethods[currentSelectedPaymentMethod].isSelected = false
        paymentMethods[position].isSelected = true
        currentSelectedPaymentMethod = position
        paymentMethodsAdapter.notifyDataSetChanged()
        if (paymentMethods[currentSelectedPaymentMethod].paymentMethod == PaymentMethods.imePay || paymentMethods[currentSelectedPaymentMethod].paymentMethod == PaymentMethods.prabhuPay) {
            binding.confirmText.text = "Confirm & make payment"
        }
        else {
            binding.confirmText.text = "Confirm & place order"
        }

    }

    override fun changeTotal(
        position: Int,
        discountTotal: Double,
        discount: Double,
        grandTotal: Double,
    ) {
        promoCode = promoList[position]
        allData.discountTotal = discountTotal.toString()
        allData.discount = discount.toString()
        allData.promoStatus = true
        allData.isComplimentary = false
        allData.isDeliveryFree = false
        allData.promo = promoCode
        fragment.dismiss()
        promoStatus = true
        binding.llPromo.visibility = View.VISIBLE
        changeText()
        binding.deliveryFee.text = "Rs. ${allData.deliveryFee}"

        setPromoCodeView()
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

    override fun onComplimentaryApplied(
        position: Int,
        discountTotal: Double,
        discount: Double,
        total: Double,
    ) {
        promoCode = promoList[position]
        fragment.dismiss()
        promoStatus = true
        allData.isComplimentary = true
        allData.promoStatus = true
        allData.isDeliveryFree = false
        allData.discount = discount.toString()
        allData.discountTotal = discountTotal.toString()
        allData.promo = promoCode
        binding.llPromo.visibility = View.VISIBLE
        binding.total.text = "Rs. ${allData.total}"
        binding.deliveryFee.text = "Rs. ${allData.deliveryFee}"
        setPromoCodeView()
    }

    override fun onFreeDeliveryApplied(position: Int, total: Double) {
        promoCode = promoList[position]
        allData.discountTotal = "${allData.total!!.toDouble() - allData.deliveryFee!!.toDouble()}"
        allData.discount = allData.deliveryFee
        allData.isDeliveryFree = true
        allData.isComplimentary = false
        allData.promoStatus = true
        allData.promo = promoCode
        promoStatus = true
        fragment.dismiss()
        binding.llPromo.visibility = View.VISIBLE

        changeText()

        val modifiedPriceString =
            "<strike> <small> <font color=\"gray\" >Rs. ${allData.deliveryFee}</font></small></strike>   <bold> FREE</bold>"

        binding.deliveryFee.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(modifiedPriceString, Html.FROM_HTML_MODE_COMPACT)
        } else {
            Html.fromHtml(modifiedPriceString)
        }

        setPromoCodeView()
    }

    private fun formatDoubleDecimal(rawNumber: Double): String {
        return "%.2f".format(rawNumber)
    }

    private fun changeText() {
        val modifiedPriceString =
            "Rs. ${formatDoubleDecimal(allData.discountTotal!!.toDouble() / 100)}  <strike> <small> <font color=\"gray\" >Rs. ${
                formatDoubleDecimal(allData.total.toString().toDouble())
            }</font></small></strike> "
        binding.total.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(modifiedPriceString, Html.FROM_HTML_MODE_COMPACT)
        } else {
            Html.fromHtml(modifiedPriceString)
        }
    }
}