package com.ourdevelops.ourjek.activity.logistic.loader_fragment

interface LogisticLoaderContractor {

    interface View{
        fun onLoaderNumberChanged(size: Int)

    }

    interface Presenter{
        fun onSizeChanged(size: Int)
    }
}