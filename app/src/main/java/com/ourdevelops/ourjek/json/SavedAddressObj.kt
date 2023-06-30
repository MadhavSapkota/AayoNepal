package com.ourdevelops.ourjek.json

import java.io.Serializable

data class SavedAddressObj(
    var id_customer_address: String,
    var id_customer: String,
    var address_name: String,
    var address_title: String,
    var address_latitude: String,
    var address_longitude: String,
    var additional_info: String,
    var id_address_type: String,
    var address_type_name: String
): Serializable