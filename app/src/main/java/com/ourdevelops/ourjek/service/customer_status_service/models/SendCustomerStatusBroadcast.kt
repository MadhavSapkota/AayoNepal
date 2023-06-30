package com.ourdevelops.ourjek.service.customer_status_service.models

import android.content.Context
import android.content.Intent
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.json.ride_request.DriverRequestBody

class SendCustomerStatusBroadcast(
    var context: Context,
    var mainData: CustomerStatusServiceData,
    var requestBody: DriverRequestBody,
    var status: String
) {

    init {
        LocalBroadcastManager.getInstance(context).sendBroadcast(
            Intent(BroadCastIntents.customerStatusReceiver).apply {
                putExtra("status", status)
                putExtra("data", mainData)
                putExtra("request_data", requestBody)
            })
    }
}