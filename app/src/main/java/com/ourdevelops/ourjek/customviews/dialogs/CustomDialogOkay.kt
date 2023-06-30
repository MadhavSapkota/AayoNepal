package com.ourdevelops.ourjek.customviews.dialogs

import android.app.Activity
import android.app.Dialog
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.ourdevelops.ourjek.R

object CustomDialogOkay {
    private lateinit var dialog: Dialog

    private var title = ""
    private var message = ""
    private var btn_text = ""

    @JvmStatic
    fun setTitle(title: String?): CustomDialogOkay{
        if (title != null) {
            this.title = title
        }
        return this
    }

    @JvmStatic
    fun setMessage(message: String?): CustomDialogOkay{
        if (message != null){
            this.message = message
        }
        return this
    }

    @JvmStatic
    fun setBtnText(text: String?): CustomDialogOkay{
        if (text != null) {
            this.btn_text = text
        }
        return this
    }

    @JvmStatic
    fun showOnlyDialog(activity: Activity, callBack: dialogOnClickListener){
        dialog = Dialog(activity, R.style.AppTheme_PopTheme)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.custom_dialogbox_okay)


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
            callBack.onClick()
            dialog.dismiss()
        }

        val imgClose = dialog.findViewById(R.id.imgClose) as ImageView
        imgClose.setOnClickListener {
            callBack.onClose()
            dialog.dismiss()
        }

        dialog.show()
    }

    fun dismiss(){
        dialog.dismiss()
    }

    interface dialogOnClickListener{
        fun onClick()
        fun onClose()
    }
}