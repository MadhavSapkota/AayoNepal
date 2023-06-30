package com.ourdevelops.ourjek.service.customer_status_service

import android.content.Context

class CustomerStatusServicePresenter(
    override var Handler: CustomerStatusNotificationHandler,
    var view: CustomerStatusServiceContractor.View,
    context: Context
) : CustomerStatusServiceContractor.Presenter {


}