package com.ourdevelops.ourjek.customviews.dialogs

import android.app.Activity
import android.app.Dialog
import android.widget.TextView
import com.ourdevelops.ourjek.R

class DownloadingDialog(val context : Activity) {
    private lateinit var dialog: Dialog
    private lateinit var tvMsg: TextView
    private lateinit var tvTitle: TextView


    fun showDialog(message: String?, title: String?) {
        dialog = Dialog(context, R.style.AppTheme_PopTheme)
        dialog.setContentView(R.layout.dialog_loading)
        dialog.setCancelable(false)
        tvMsg = dialog.findViewById(R.id.tvMsg) as TextView
        tvTitle = dialog.findViewById(R.id.tvTitle) as TextView
        tvMsg.text = message
        tvTitle.text = title
        dialog.show()
    }

    fun updateDialog(newValue : String){
        tvMsg.text = newValue
    }

    fun closeDialog(){
        dialog.dismiss()
    }
}