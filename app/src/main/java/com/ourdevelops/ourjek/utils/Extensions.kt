package com.ourdevelops.ourjek.utils

import android.content.Context
import android.graphics.Rect
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentActivity
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.ProgressDialogBinding

fun FragmentActivity.hideKeyboard() {
    val view: View? = currentFocus
    val imm = view?.let {
        view.clearFocus()
        getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    }
    imm?.hideSoftInputFromWindow(view.windowToken, 0)
}

private var progressDialog: AlertDialog? = null
@JvmOverloads
fun FragmentActivity.showProgressDialog(message: String? = null) {
    val view = ProgressDialogBinding.inflate(layoutInflater)
    if (message != null) view.message.text = message
    progressDialog = AlertDialog.Builder(this)
        .setView(view.root)
        .setCancelable(false)
        .create()
    progressDialog?.show()
    //Dialog window is set only after it is shown
    progressDialog?.window?.setLayout(
        (windowWidth() * 0.70).toInt(),
        LinearLayout.LayoutParams.WRAP_CONTENT
    )
}

fun hideProgressDialog() {
    progressDialog?.dismiss()
}

fun FragmentActivity.windowWidth(): Int {
    val displayRectangle = Rect()
    window.decorView.getWindowVisibleDisplayFrame(displayRectangle)
    return displayRectangle.width()
}

fun FragmentActivity.windowHeight(): Int {
    val displayRectangle = Rect()
    window.decorView.getWindowVisibleDisplayFrame(displayRectangle)
    return displayRectangle.height()
}

fun EditText.setErrorEnabledBackground(){
    setBackgroundResource(R.drawable.round_edittext_error_background);
}

fun EditText.clearErrorEnabledBackground(){
    setBackgroundResource(R.drawable.round_edittext_background);
}
