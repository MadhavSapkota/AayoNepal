package com.ourdevelops.ourjek.customviews.dialogs

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.view.Window
import android.widget.LinearLayout
import android.widget.TextView
import com.ourdevelops.ourjek.R

class CustomDialogYesNo {
    private lateinit var dialog: Dialog

    private var title = ""
    private var message = ""
    private var btn_text_yes = ""
    private var btn_text_no = ""

    fun setTitle(title: String?): CustomDialogYesNo{
        if (title != null) {
            this.title = title
        }
        return this
    }

    fun setMessage(message: String?): CustomDialogYesNo{
        if (message != null){
            this.message = message
        }
        return this
    }

    fun setBtnTextYes(text: String?): CustomDialogYesNo{
        if (text != null) {
            this.btn_text_yes = text
        }
        return this
    }

    fun setBtnTextNo(text: String?): CustomDialogYesNo{
        if (text != null) {
            this.btn_text_no = text
        }
        return this
    }

    fun showYesNoDialog(activity: Activity, callBack : dialogOnClickListener){
        dialog = Dialog(activity, R.style.AppTheme_PopTheme)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.custom_dialogbox_yesno)

        val tittle = dialog.findViewById(R.id.tv_dialog_title) as TextView
        if(this.title != ""){
            tittle.text = this.title
        }

        val message = dialog.findViewById(R.id.tv_dialog_message) as TextView
        if(this.message != ""){
            message.text = this.message
        }

        val btn_positive = dialog.findViewById(R.id.btn_positive) as TextView
        if(this.btn_text_yes != ""){
            btn_positive.text = this.btn_text_yes
        }

        val btn_negative = dialog.findViewById(R.id.btn_negative) as TextView
        if(this.btn_text_no != ""){
            btn_negative.text = this.btn_text_no
        }

        val dialogBtn_okay = dialog.findViewById(R.id.btn_yes) as LinearLayout
        dialogBtn_okay.setOnClickListener {
            dialog.dismiss()
            callBack.onClick()
        }

        val dialogBtn_close = dialog.findViewById(R.id.btn_no) as LinearLayout
        dialogBtn_close.setOnClickListener {
            callBack.onClose()
            dialog.dismiss()
        }

        dialog.show()
    }

    interface dialogOnClickListener{
        fun onClick()
        fun onClose()
    }

    fun dismiss(){
        dialog.dismiss()
    }
}