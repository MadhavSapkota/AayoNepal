package com.ourdevelops.ourjek.activity.logistic.logistic_detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import com.github.florent37.singledateandtimepicker.dialog.SingleDateAndTimePickerDialog
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import com.ourdevelops.ourjek.activity.logistic.loader_fragment.LogisticLoaderFragment
import com.ourdevelops.ourjek.activity.logistic.payment.LogisticPaymentActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.logDebug
import com.ourdevelops.ourjek.constants.showShortToast
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo
import com.ourdevelops.ourjek.databinding.ActivityLogisticDetailBinding
import com.ourdevelops.ourjek.utils.AppLogger
import java.text.SimpleDateFormat
import java.util.*

class LogisticDetailActivity : AppCompatActivity(), LogisticDetailContractor.View {

    private lateinit var binding: ActivityLogisticDetailBinding
    private lateinit var presenter: LogisticDetailPresenter
    private lateinit var allData: LogisticDataModel
    private var checked = false
    private var deliveryDateTime: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLogisticDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter = LogisticDetailPresenter(applicationContext, this)
        getIntentData()
        setUpViews()
        onButtonClick()
    }

    private fun setUpViews() {
        binding.apply {
            senderDetail.apply {
                setName(BaseApp.getInstance(applicationContext).loginUser.fullnama)
                setNumber(BaseApp.getInstance(applicationContext).loginUser.phone)
            }
        }
    }

    private fun getIntentData() {
        allData = intent.getSerializableExtra("allData") as LogisticDataModel

        logDebug("wt = ${allData.chosenEstimatedWeight} -- price = ${allData.estimatedWeightPrice} -- item = ${allData.itemName} -- pickup = ${allData.pickUpLocation} -- delivery = ${allData.destinationLocation}")
    }

    private fun onButtonClick() {
        binding.next.setOnClickListener {
            allData.apply {
                senderName = binding.senderDetail.getName()
                senderNumber = binding.senderDetail.getNumber()
                receiverName = binding.receiverDetail.getName()
                receiverNumber = binding.receiverDetail.getNumber()
                remarks = binding.logisticsRemarks.text.toString()
            }
            presenter.checkValues(allData)
        }

        binding.asap.callOnClick()

        binding.tvChooseTime.setOnClickListener {
            timePickerMethod()
        }
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
                    val cal = Calendar.getInstance(TimeZone.getTimeZone("NPT"))
                    cal.time = it
                    AppLogger.log("${cal.time} asdasd")
                    val deliveryDate = "${cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault())} ${cal.get(Calendar.DATE)}-${cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault())}, ${cal.get(Calendar.HOUR_OF_DAY) + 6}:${cal.get(Calendar.MINUTE) - 15}"
                    binding.tvChooseTime.text = deliveryDate
                    binding.scheduled.isChecked = true
                    this.checked = true
                    deliveryDateTime = cal.time.toString()
                    AppLogger.log(deliveryDateTime)
                    allData.deliveryDateTime = deliveryDateTime
                }.display()
    }

    override fun valueIsEmpty(field: String) {
        when (field) {

            "senderName" -> {
                binding.senderDetail.nameValueEmpty("Name cannot be empty..")
            }

            "senderNumber" -> {
                binding.senderDetail.numberValueEmptyOrWrong("Number cannot be empty..")
            }

            "receiverName" -> {
                binding.receiverDetail.nameValueEmpty("Name cannot be empty..")
            }

            "receiverNumber" -> {
                binding.receiverDetail.numberValueEmptyOrWrong("Number cannot be empty..")
            }

            "date" -> {
                showShortToast("You need to set delivery time before moving on..")
            }

            "remarks" -> {
                binding.remarksIncorrect.visibility = View.VISIBLE
                binding.remarksIncorrect.text = "Remarks cannot be empty.."
            }
        }
    }

    override fun numberIsIncorrect(field: String) {
        when (field) {

            "senderNumber" -> {
                binding.senderDetail.numberValueEmptyOrWrong("Number is invalid..")
            }

            "receiverNumber" -> {
                binding.receiverDetail.numberValueEmptyOrWrong("Number is invalid..")
            }
        }
    }

    override fun valueIsNotEmpty(field: String) {
        when (field) {

            "senderName" -> {
                binding.senderDetail.nameValueNotEmpty()
            }

            "senderNumber" -> {
                binding.senderDetail.numberIsCorrect()
            }

            "receiverName" -> {
                binding.receiverDetail.nameValueNotEmpty()
            }

            "receiverNumber" -> {
                binding.receiverDetail.numberIsCorrect()
            }

            "remarks" -> {
                binding.remarksIncorrect.visibility = View.INVISIBLE
            }
        }
    }

    override fun askForLoaders() {
        CustomDialogYesNo().apply {
            setTitle("One More Thing")
            setMessage("Do you need any extra loaders to help you with your stuff?")
            showYesNoDialog(this@LogisticDetailActivity, object : CustomDialogYesNo.dialogOnClickListener {
                override fun onClick() {
                    LogisticLoaderFragment().apply {
                        arguments = Bundle().apply {
                            putSerializable("allData", allData)
                        }
                        setInterface(this@LogisticDetailActivity)
                        show(supportFragmentManager, this.tag)
                    }
                }

                override fun onClose() {
                    allData.selectedNumberOfLoaders = 0
                    sendDataForPayment(allData)
                }
            })
        }
    }

    override fun onLoaderNumberSelected(allData: LogisticDataModel) {
        sendDataForPayment(allData)
    }

    override fun sendDataForPayment(allData: LogisticDataModel) {
        startActivity(Intent(this, LogisticPaymentActivity::class.java).putExtra("allData", allData))
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.id) {
                R.id.asap ->
                    if (checked) {
                        this.checked = false
                        val _24HourTime = presenter.setAsapDeliveryTime()
                        val _24HourSDF = SimpleDateFormat("HH:mm")
                        val _12HourSDF = SimpleDateFormat("hh:mm a")
                        val _24HourDt = _24HourSDF.parse(_24HourTime)
                        deliveryDateTime = _12HourSDF.format(_24HourDt)
                        AppLogger.log(deliveryDateTime)
                        allData.deliveryDateTime = deliveryDateTime
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
}