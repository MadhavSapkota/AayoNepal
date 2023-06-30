package com.ourdevelops.ourjek.base.payment

import android.app.Activity
import android.content.Context
import android.widget.Toast
import com.ourdevelops.ourjek.BuildConfig
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.json.PaymentMethodRequestJson
import com.ourdevelops.ourjek.json.ReferenceIdRequest
import com.ourdevelops.ourjek.json.ReferenceIdResponse
import com.ourdevelops.ourjek.models.IMEPayVariables
import com.ourdevelops.ourjek.models.PaymentMethods
import com.ourdevelops.ourjek.models.PesananMerchant
import com.ourdevelops.ourjek.models.PrabhuPayVariables
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import com.prabhutech.prabhupay_sdk.PrabhuSdk
import com.swifttechnology.imepaysdk.ENVIRONMENT
import com.swifttechnology.imepaysdk.IMEPayment
import com.swifttechnology.imepaysdk.IMEPaymentCallback
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.HashMap

class OnlinePaymentPresenter(val context: Context, val view: OnlinePaymentContractor.View, val activity: Activity) : OnlinePaymentContractor.Presenter {

    override fun getReferenceIdFromServer(name: String, amount: String?) {
        val param = ReferenceIdRequest()
        param.payment_amount = amount
        param.payment_method = name
        val userService = ServiceGenerator.createService(
            UserService::class.java, BaseApp.loginUser?.noTelepon, BaseApp.loginUser?.password,BaseApp.loginUser?.token
        )
        userService.getReferenceId(param).enqueue(object : Callback<ReferenceIdResponse> {
            override fun onResponse(
                call: Call<ReferenceIdResponse>,
                response: Response<ReferenceIdResponse>
            ) {
                if (response.body()?.code == "200") {
//                    view.onReferenceIdReceived()
                    when(name){
                        PaymentMethods.imePay.name -> {
                            makeImePayment(response.body()?.data?.reference_id, amount)
                        }

                        PaymentMethods.prabhuPay.name -> {
                            makePrabhuPayment(response.body()?.data?.reference_id, amount)
                        }
                    }
                } else {
                    Toast.makeText(context, "Server is not available", Toast.LENGTH_SHORT).show()
                    AppLogger.log("Server is not available!!")
                }
            }

            override fun onFailure(call: Call<ReferenceIdResponse>, t: Throwable) {
                view.onConfirmationFailure("There was some issue trying to process the order.. There was an issue trying to connect to the server..")
                Toast.makeText(context, "Server is not available", Toast.LENGTH_SHORT).show()
                AppLogger.log("Server is not available!!")
            }

        })
    }

    private fun makeImePayment(referenceId: String?, amount: String?) {
        val imePayment = if (BuildConfig.DEBUG) {
            IMEPayment(context, ENVIRONMENT.TEST)
        } else {
            IMEPayment(context, ENVIRONMENT.LIVE)
        }

        imePayment.performPaymentV1(
            IMEPayVariables.merchantCode, IMEPayVariables.merchantName, IMEPayVariables.merchantUrl, IMEPayVariables.merchantUrl, amount, referenceId, IMEPayVariables.module, IMEPayVariables.userName, IMEPayVariables.password, object :
                IMEPaymentCallback {
                override fun onSuccess(responseCode: Int, responseDescription: String?, transactionId: String?, msisdn: String?, amount: String?, refId: String?) {
                    AppLogger.log("response code == > $responseCode response description == > $responseDescription")
                    when (responseCode) {
                        100 -> {
                            clearCartDatabase()
                            view.confirmPayment(PaymentMethodRequestJson("1", transactionId, PaymentMethods.imePay.name, amount, referenceId))
                        }
                        else -> {
                            view.onThirdPartyPaymentFailure("Payment failure")
                        }
                    }

                }

                override fun onTransactionCancelled(refId: String?) {
                    view.onConfirmationFailure("You have canceled the transaction..")
                }
            }
        )

    }

    private fun makePrabhuPayment(referenceId: String?, amount: String?){

        PrabhuSdk(activity, PrabhuPayVariables.stage, PrabhuPayVariables.username, PrabhuPayVariables.password, referenceId, amount, "Wallet Top up",
            object : PrabhuSdk.PrabhuCallBack {
                override fun onSuccess(response: HashMap<String, String>?) {
                    AppLogger.log("$response")
                    clearCartDatabase()
                    view.confirmPayment(PaymentMethodRequestJson("1", response?.get("transactionId"), PaymentMethods.imePay.name, amount, referenceId))
                }

                override fun onError(error: HashMap<String, String>?) {
                    AppLogger.log("$error")
                    view.onThirdPartyPaymentFailure("Payment failure")
                }

            })
    }

    private fun clearCartDatabase() {
        Realm.getDefaultInstance().apply {
            executeTransactionAsync {
                val result = it.where(PesananMerchant::class.java).findAll()
                result.deleteAllFromRealm()
            }
        }
    }

}