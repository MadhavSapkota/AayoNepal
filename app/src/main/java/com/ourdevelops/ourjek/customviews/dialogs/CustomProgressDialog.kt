package com.ourdevelops.ourjek.customviews.dialogs

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.widget.TextView
import com.ourdevelops.ourjek.R

object CustomProgressDialog {

    private var dialog: Dialog ?= null

    @JvmStatic
    fun showDialog(message: String?, title: String?, context: Context?) {
        dialog = context?.let { Dialog(it, R.style.AppTheme_PopTheme) }
        dialog?.setContentView(R.layout.dialog_loading)
        dialog?.setCancelable(false)
        val tvMsg = dialog?.findViewById(R.id.tvMsg) as TextView
        val tvTitle = dialog?.findViewById(R.id.tvTitle) as TextView
        tvMsg.text = message
        tvTitle.text = title
        dialog?.show()
    }


    @JvmStatic
    fun showDialog(message: String?, title: String?, context: Activity?) {
        dialog = context?.let { Dialog(it, R.style.AppTheme_PopTheme) }
        dialog?.setContentView(R.layout.dialog_loading)
        dialog?.setCancelable(false)
        val tvMsg = dialog?.findViewById(R.id.tvMsg) as TextView
        val tvTitle = dialog?.findViewById(R.id.tvTitle) as TextView
        tvMsg.text = message
        tvTitle.text = title
        dialog?.show()
    }

    @JvmStatic
    fun dismissDialog() {
        dialog?.dismiss()
    }

}