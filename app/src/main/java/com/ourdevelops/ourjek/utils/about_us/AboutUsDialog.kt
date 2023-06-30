package com.ourdevelops.ourjek.utils.about_us

import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.Window
import android.view.WindowManager
import android.webkit.WebView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.utils.SettingPreference
import java.util.*

class AboutUsDialog(val context : Context) {

    fun showAboutUs() {
        val sp = SettingPreference(context)

        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE) // before
        dialog.setContentView(R.layout.dialog_aboutus)
        dialog.setCancelable(true)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(Objects.requireNonNull(dialog.window)?.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT
        val close = dialog.findViewById<ImageView>(R.id.bt_close)
        val email = dialog.findViewById<LinearLayout>(R.id.email)
        val phone = dialog.findViewById<LinearLayout>(R.id.phone)
        val website = dialog.findViewById<LinearLayout>(R.id.website)
        val about = dialog.findViewById<WebView>(R.id.aboutus)
        val mimeType = "text/html"
        val encoding = "utf-8"
        val htmlText: String = sp.setting[1]
        val text = ("<html dir=" + "><head>"
                + "<style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/NeoSans_Pro_Regular.ttf\")}body{font-family: MyFont;color: #000000;text-align:justify;line-height:1.2}"
                + "</style></head>"
                + "<body>"
                + htmlText
                + "</body></html>")
        about.loadDataWithBaseURL(null, text, mimeType, encoding, null)
        phone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:${sp.setting[3]}")
            context.startActivity(intent)
        }
        email.setOnClickListener {
            try {
                val testIntent = Intent(Intent.ACTION_VIEW)
                val data =
                    Uri.parse("mailto:?subject=" + "" + "&body=" + "" + "&to=" + sp.setting.get(2))
                testIntent.data = data
                context.startActivity(testIntent)
            } catch (ex: ActivityNotFoundException) {
                val TO = arrayOf<String>(sp.setting[2])
                val emailIntent = Intent(Intent.ACTION_SEND)
                emailIntent.type = "text/plain"
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO)
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "halo")
                emailIntent.putExtra(Intent.EXTRA_TEXT, sp.setting.get(2).toString() + "\n")
                context.startActivity(Intent.createChooser(emailIntent, "Send mail..."))
                Toast.makeText(
                    context,
                    "There is no email client installed.", Toast.LENGTH_SHORT
                ).show()
            }
        }
        website.setOnClickListener {
            context.startActivity(
                    Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(sp.setting[4])
                    )
            )
        }
        close.setOnClickListener { dialog.dismiss() }
        dialog.show()
        dialog.window!!.attributes = lp
    }
}