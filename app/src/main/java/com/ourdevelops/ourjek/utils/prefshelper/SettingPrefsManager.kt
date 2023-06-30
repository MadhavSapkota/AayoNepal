package com.ourdevelops.ourjek.utils.prefshelper

import android.content.Context
import com.ourdevelops.ourjek.json.GetHomeResponseJson
import com.ourdevelops.ourjek.models.home.HomeResponse
import com.ourdevelops.ourjek.utils.SettingPreference

class SettingPrefsManager {
    private lateinit var sp : SettingPreference

    fun saveSettings(response : HomeResponse, context : Context) {
        sp = SettingPreference(context)
        val payu = response.payu[0]
        sp.updateCurrency(response.currency)
        sp.updateabout(response.aboutus)
        sp.updateemail(response.email)
        sp.updatephone(response.phone)
        sp.updateweb(response.website)
        sp.updatePaypal(response.paypalkey)
        sp.updatepaypalmode(response.paypalmode)
        sp.updatepaypalactive(response.paypalactive)
        sp.updatestripeactive(response.stripeactive)
        sp.updatecurrencytext(response.currency_text)
        sp.updatePayudebug(payu.payudebug)
        sp.updatePayumerchantid(payu.payuid)
        sp.updatePayusalt(payu.payusalt)
        sp.updatePayumerchantkey(payu.payukey)
        sp.updatePayuActive(payu.active)
    }

}