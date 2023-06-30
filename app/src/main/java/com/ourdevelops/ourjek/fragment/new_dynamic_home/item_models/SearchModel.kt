package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models

import com.ourdevelops.ourjek.models.NewDynamicHomeModel

class SearchModel {
    var title: String? = null
    var type: String? = null
    var caption: String? = null

    fun init(mainData: NewDynamicHomeModel?) {
        title = mainData?.title
        caption = mainData?.caption
        type = mainData?.type
    }
}