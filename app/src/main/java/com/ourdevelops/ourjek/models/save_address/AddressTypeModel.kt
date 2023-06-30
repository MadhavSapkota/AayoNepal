package com.ourdevelops.ourjek.models.save_address

class AddressTypeModel() {
    var image: Int? = 0
    var title: String? = ""
    var isSelected = false
    var enableUserToAddName = false
    var id: Int = 0
    var alternateName = ""
    var additionalInfo = ""

    constructor(
        image: Int,
        title: String,
        isSelected: Boolean,
        enableUserToAddName: Boolean,
        id: Int
    ) : this() {
        this.image = image
        this.title = title
        this.isSelected = isSelected
        this.enableUserToAddName = enableUserToAddName
        this.id = id
    }
}