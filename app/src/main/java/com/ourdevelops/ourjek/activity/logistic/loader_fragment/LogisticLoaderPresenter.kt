package com.ourdevelops.ourjek.activity.logistic.loader_fragment

import android.content.Context
import androidx.fragment.app.FragmentActivity
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay

class LogisticLoaderPresenter(val activity: FragmentActivity?, val view: LogisticLoaderContractor.View, val context: Context?, private val maxLoaderNumber: Int?): LogisticLoaderContractor.Presenter {

    override fun onSizeChanged(size: Int) {
        when {

            maxLoaderNumber == null -> {
                CustomDialogOkay.apply {
                    setTitle("Oops!")
                    setMessage("There are no loaders available for this service currently.")
                    showOnlyDialog(activity!!, object : CustomDialogOkay.dialogOnClickListener{
                        override fun onClick() {
                            dismiss()
                        }

                        override fun onClose() {
                            dismiss()
                        }
                    })
                }
                view.onLoaderNumberChanged(0)
            }

            size >= maxLoaderNumber -> {
                view.onLoaderNumberChanged(maxLoaderNumber)
            }

            size <= 0 -> {
                view.onLoaderNumberChanged(0)
            }

            else -> {
                view.onLoaderNumberChanged(size)
            }
        }
    }
}