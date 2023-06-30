package com.ourdevelops.ourjek.activity.notification

import android.content.Context
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.BaseApp.loginUser
import com.ourdevelops.ourjek.json.NewNotificatoinJson
import com.ourdevelops.ourjek.models.NewNotificationModel
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewNotificationPresenter(
    val applicationContext: Context,
    val view: NewNotificationActivity
) : NewNotificationContractor.Presenter {

    private val loginuser = BaseApp.getInstance(applicationContext).loginUser

    override fun getNotificationData() {
        view.showProgress()
        val service = ServiceGenerator.createService(UserService::class.java, loginuser.noTelepon, loginuser.password,loginUser.token)

        service.notification.enqueue(object : Callback<NewNotificatoinJson> {
            override fun onResponse(
                call: Call<NewNotificatoinJson>,
                response: Response<NewNotificatoinJson>
            ) {
                if(response.body() != null){
                    view.hideProgress()
                    view.onNotificationResponseSuccess(response.body()!!.data as ArrayList<NewNotificationModel>)
                } else{
                    view.onNotificationResponseFailure()
                }
            }

            override fun onFailure(call: Call<NewNotificatoinJson>, t: Throwable) {
                view.onNotificationResponseFailure()
            }

        })
    }
}