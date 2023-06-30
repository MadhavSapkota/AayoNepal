package com.ourdevelops.ourjek.service.customer_status_service.models

import android.content.Intent
import java.io.Serializable

class CustomerStatusServiceData : Serializable {
    var notificationTitle : String? = null
    var notificationBody : String? = null
    var notificationIcon : Int? = null
    var notificationBigTitle : String? = null
    var notificationBigBody : String? = null
    var notificationIntent : Intent? = null
    var notificationId: Int? = null
}