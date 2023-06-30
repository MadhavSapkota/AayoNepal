package com.ourdevelops.ourjek.fragment.new_profile.rv_items

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.facebook.login.LoginManager
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.IntroActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo
import com.ourdevelops.ourjek.databinding.RowProfileItemBinding
import com.ourdevelops.ourjek.json.fcm.FCMRequestJson
import com.ourdevelops.ourjek.json.fcm.FCMResponseJson
import com.ourdevelops.ourjek.models.PesananMerchant
import com.ourdevelops.ourjek.models.User
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfileLogoutVIew(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowProfileItemBinding.bind(itemView)
    private var activity: Activity? = null

    fun setupViews(activity: Activity?) {
        this.activity = activity
        binding.imgItem.setImageResource(R.drawable.ic_sign_out_alt)
        binding.tVItem.text = "Log Out"
        binding.tVItem.setTextColor(ContextCompat.getColor(itemView.context, R.color.flamingo))

        itemView.setOnClickListener {
            showLogoutDialog()
        }
    }

    private fun showLogoutDialog() {
        CustomDialogYesNo().setTitle("Log Out?").setBtnTextYes("Log Out")
            .showYesNoDialog(activity!!, object : CustomDialogYesNo.dialogOnClickListener {
                override fun onClick() {
                    val user = BaseApp.getInstance(itemView.context).loginUser
                    val service = ServiceGenerator.createService(
                        UserService::class.java, user.email, user.password,user.token
                    )
                    val req = FCMRequestJson()
                    req.customer_id = user.id
                    service.destroyFCM(req).enqueue(object : Callback<FCMResponseJson?> {
                        override fun onResponse(call: Call<FCMResponseJson?>, response: Response<FCMResponseJson?>) {
                            logout()
                        }

                        override fun onFailure(call: Call<FCMResponseJson?>, t: Throwable) {}
                    })
                }

                override fun onClose() {}
            })
    }

    private fun logout() {
        val realm = BaseApp.getInstance(activity).realmInstance
        realm.beginTransaction()
        realm.delete(User::class.java)
        realm.delete(PesananMerchant::class.java)
        realm.commitTransaction()
        LoginManager.getInstance().logOut()
        BaseApp.getInstance(activity).loginUser = null
        activity?.startActivity(
            Intent(activity, IntroActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        )
        activity?.finish()
    }

}