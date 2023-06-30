package com.ourdevelops.ourjek.json

class SaveUserAddressBody {
    var id_customer: String? = ""
    var addressName: String? = ""
    var latitude: Double? = 0.0
    var longitude: Double? = 0.0
    var addressType: String? = "home / work/ campus / other"
    var addresstTypeName : String? = ""
}

enum class UserAddressType {
    home,
    work,
    campus,
    other
}