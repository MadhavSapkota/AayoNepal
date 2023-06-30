package com.ourdevelops.ourjek.customviews.dialogs

import android.app.Activity
import android.app.Dialog
import android.view.Window
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.ourdevelops.ourjek.R

class CustomDialogCart {
    private lateinit var dialog: Dialog

    private var title = ""
    private var message = ""
    private var btn_text = ""

    fun setTitle(title: String?): CustomDialogCart{
        if (title != null) {
            this.title = title
        }
        return this
    }

    fun setMessage(message: String?): CustomDialogCart{
        if (message != null){
            this.message = message
        }
        return this
    }

    fun setBtnText(text: String?): CustomDialogCart{
        if (text != null) {
            this.btn_text = text
        }
        return this
    }

    fun showYesDialog(activity: Activity, callBack : dialogOnClickListener){
        dialog = Dialog(activity, R.style.AppTheme_PopTheme)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.custom_dialogbox_cart)

        val tittle = dialog.findViewById(R.id.tv_dialog_title) as TextView
        if(this.title != ""){
            tittle.text = this.title
        }

        val message = dialog.findViewById(R.id.tv_dialog_message) as TextView
        if(this.message != ""){
            message.text = this.message
        }

        val btnMain = dialog.findViewById(R.id.btn_main) as TextView
        if(this.btn_text != ""){
            btnMain.text = this.btn_text
        }

        val dialogBtn_okay = dialog.findViewById(R.id.btn_view_cart) as LinearLayout
        dialogBtn_okay.setOnClickListener {
//            activity.startActivity(Intent(activity, NewDetailOrderActivity::class.java))
            callBack.onClick()
            dialog.cancel()
        }
//
        val dialogBtn_close = dialog.findViewById(R.id.cv_close) as RelativeLayout
        dialogBtn_close.setOnClickListener {
            callBack.onClose()
            dialog.cancel()
        }
        dialog.show()
    }

    interface dialogOnClickListener{
        fun onClick()
        fun onClose()
    }
}