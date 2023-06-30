package com.ourdevelops.ourjek.activity.logistic.logistic_detail

import android.content.Context
import android.util.Log
import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import java.sql.Timestamp
import java.util.*

class LogisticDetailPresenter(val context: Context, val view: LogisticDetailContractor.View) : LogisticDetailContractor.Presenter {

    override fun checkValues(allData: LogisticDataModel) {
        allData.apply {
            if (senderName.isNullOrEmpty()) {
                view.valueIsEmpty("senderName")
                return
            } else {
                view.valueIsNotEmpty("senderName")
            }

            when {
                senderNumber.isNullOrEmpty() -> {
                    view.valueIsEmpty("senderNumber")
                    return
                }
                senderNumber!!.length < 10 -> {
                    view.numberIsIncorrect("senderNumber")
                    return
                }
                else -> {
                    view.valueIsNotEmpty("senderNumber")
                }
            }

            if (receiverName.isNullOrEmpty()) {
                view.valueIsEmpty("receiverName")
                return
            } else {
                view.valueIsNotEmpty("receiverName")
            }

            when {
                receiverNumber.isNullOrEmpty() -> {
                    view.valueIsEmpty("receiverNumber")
                    return
                }
                receiverNumber!!.length < 10 -> {
                    view.numberIsIncorrect("receiverNumber")
                    return
                }
                else -> {
                    view.valueIsNotEmpty("receiverNumber")
                }
            }

            if (deliveryDateTime.isNullOrEmpty()){
                view.valueIsEmpty("date")
            }

            if (remarks.isNullOrEmpty()) {
                view.valueIsEmpty("remarks")
                return
            } else {
                view.valueIsNotEmpty("remarks")
                checkForLoader(allData)
            }
        }
    }

    override fun setAsapDeliveryTime(): String {
        val cal = Calendar.getInstance(TimeZone.getTimeZone("NPT"))
        Log.d("time", "showTime: current time = " + cal.time)
        cal.set(Calendar.HOUR, cal.time.hours - 5)
        cal.set(Calendar.MINUTE, cal.time.minutes + 25) //60 -45 minss
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)
        Log.d("time", "showTime: 0000 = " + cal.time)
        return "${cal.time.hours}:${cal.time.minutes}"
    }

    private fun checkForLoader(allData: LogisticDataModel) {
        if (!allData.loader_data?.max_loader_number.equals("0")) {
            view.askForLoaders()
        } else {
            view.sendDataForPayment(allData)
        }
    }
}