package com.ourdevelops.ourjek.models.profile

class ProfileObject() {
    var viewType : ProfileViewType = ProfileViewType.head
    var title : String ?= null
    var image : Int ?= null
    var showArrowAtEnd: Boolean = false

    constructor(viewType : ProfileViewType) : this() {
        this.viewType = viewType
    }

    constructor(viewType : ProfileViewType, title : String, image : Int, showArrowAtEnd: Boolean = false) : this() {
        this.viewType = viewType
        this.title = title
        this.image = image
        this.showArrowAtEnd = showArrowAtEnd
    }
}

enum class ProfileViewType {
    head,
    item,
    logout
}