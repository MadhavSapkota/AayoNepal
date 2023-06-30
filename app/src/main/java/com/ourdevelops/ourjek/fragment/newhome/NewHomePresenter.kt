package com.ourdevelops.ourjek.fragment.newhome

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.google.android.libraries.places.api.Places
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.LoginActivity
import com.ourdevelops.ourjek.constants.AppRideStatus
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.RideStatus
import com.ourdevelops.ourjek.json.AllMerchantByNearResponseJson
import com.ourdevelops.ourjek.json.AllMerchantbyCatRequestJson
import com.ourdevelops.ourjek.json.GetHomeRequestJson
import com.ourdevelops.ourjek.json.ResponseJson
import com.ourdevelops.ourjek.json.ride_request.RideSyncBody
import com.ourdevelops.ourjek.json.ride_request.RideSyncResponse
import com.ourdevelops.ourjek.models.AllFiturModel
import com.ourdevelops.ourjek.models.FiturDataModel
import com.ourdevelops.ourjek.models.FiturModel
import com.ourdevelops.ourjek.models.PesananMerchant
import com.ourdevelops.ourjek.models.home.HomeGenericList
import com.ourdevelops.ourjek.models.home.HomeResponse
import com.ourdevelops.ourjek.models.home.HomeViewType
import com.ourdevelops.ourjek.models.home.NewHomeModel
import com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel
import com.ourdevelops.ourjek.models.ride_request.RideHomeModel
import com.ourdevelops.ourjek.utils.*
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import com.ourdevelops.ourjek.utils.internetconnectionchooser.InternetConnectionChooser
import com.ourdevelops.ourjek.utils.prefshelper.SettingPrefsManager
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList

class NewHomePresenter(
    val context: Context,
    val view: NewHomeContractor.View,
    val activity: Activity
) : NewHomeContractor.Presenter {
    private var mlist = ArrayList<NewHomeModel>()
    private var allfiturdata = ArrayList<AllFiturModel>()
    private val fiturlist: ArrayList<FiturDataModel> = ArrayList()
    private var fiturdata = ArrayList<FiturModel>()
    private var hasData = false
    val loginUser = BaseApp.getInstance(context).loginUser!!


    override fun initializeHome() {
        if (!Places.isInitialized()) {
            Places.initialize(context, context.getString(R.string.google_maps_key))
        }
        if (!NetworkManager.isConnectToInternet(context)) {
            val internetConnectionChooser = InternetConnectionChooser(activity)
            internetConnectionChooser.init()
        }
        gethome(Constants.LONGITUDE, Constants.LATITUDE)
    }

    private fun gethome(longitude: Double, latitude: Double) {
        if (hasData) {
            checkRideStatusAndCart()
        } else {
            mlist.clear()
//        mlist.add(NewHomeModel(HomeViewType.PICK_LOCATION))
            val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token
            )
            val param = GetHomeRequestJson()
            param.id = loginUser.id
            param.lat = latitude.toString()
            param.lon = longitude.toString()
            param.phone = loginUser.noTelepon
            param.language = PrefsManager(context).languageValue
            userService.getNewHome(param).enqueue(object : Callback<HomeResponse> {
                override fun onResponse(
                    call: Call<HomeResponse>,
                    response: Response<HomeResponse>
                ) {
                    if (response.isSuccessful) {
                        if (Objects.requireNonNull(response.body())!!.message.equals(
                                "success",
                                ignoreCase = true
                            )
                        ) {
                            try {
                                if (response.body()!!.data[0].token.isEmpty() || response.body()!!.data[0].token != (PrefsManager(
                                        context
                                    ).fcmtoken)
                                ) {
                                    ProjectUtils.showToast(
                                        context,
                                        "Your Session has been expired. Please Login Again!!"
                                    )
                                    BaseApp.getInstance(activity).loginUser = null
                                    activity.startActivity(
                                        Intent(activity, LoginActivity::class.java)
                                            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                                    )
                                    activity.finish()
                                }
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                            //saving settings preferences//
                            val settingsPrefsManager = SettingPrefsManager()
                            settingsPrefsManager.saveSettings(response.body()!!, context)


                            fiturdata = response.body()!!.fitur
                            allfiturdata = response.body()!!.allfitur
                            for (i in fiturdata.indices) {
                                val fiturmodel = FiturDataModel()
                                fiturmodel.idFitur = fiturdata[i].idFitur
                                fiturmodel.fitur = fiturdata[i].fitur
                                fiturmodel.icon = fiturdata[i].icon
                                fiturmodel.home = fiturdata[i].home
                                fiturlist.add(fiturmodel)
                            }

                            mlist.add(NewHomeModel(HomeViewType.HELLO_VIEW))
                            mlist.add(NewHomeModel(HomeViewType.SEARCH))
                            mlist.add(
                                NewHomeModel(
                                    HomeViewType.CATEGORY,
                                    HomeGenericList(response.body()?.vehicle_category)
                                )
                            )

                            if (AppRideStatus.currentStatus == RideStatus.searchingRider) {
                                mlist.add(NewHomeModel(HomeViewType.RIDE_SEARCH_VIEW))
                            }

                            if (checkCart()) {
                                mlist.add(NewHomeModel(HomeViewType.CART_VIEW))
                            }


                            if (response.body()!!.slider.isNotEmpty()) {
                                mlist.add(
                                    NewHomeModel(
                                        HomeViewType.FEATURED_RESTAURANTS,
                                        HomeGenericList(response.body()!!.slider)
                                    )
                                )
                            }



                            if (response.body()!!.berita.isNotEmpty()) {
                                mlist.add(
                                    NewHomeModel(
                                        HomeViewType.SPECIAL_OFFERS,
                                        HomeGenericList(response.body()?.berita)
                                    )
                                )
                            }

                            requestRestaurants()

                        }
                    }

                }

                override fun onFailure(call: Call<HomeResponse>, t: Throwable) {
                    AppLogger.log("this is error ${t.localizedMessage}")
                }
            })
        }
    }

    fun requestRestaurants() {
        val userService = ServiceGenerator.createService(
            UserService::class.java,
            loginUser.noTelepon,
            loginUser.password,
            loginUser.token
        )
        val param = AllMerchantbyCatRequestJson()
        param.id = loginUser.id
        param.lat = Constants.LATITUDE.toString()
        param.lon = Constants.LONGITUDE.toString()
        param.phone = loginUser.noTelepon
        param.fitur_id = "21"
        userService.allmerchant(param)
            .enqueue(object : Callback<AllMerchantByNearResponseJson> {
                override fun onResponse(
                    call: Call<AllMerchantByNearResponseJson>,
                    response: Response<AllMerchantByNearResponseJson>
                ) {
                    if (response.isSuccessful) {
                        if (Objects.requireNonNull(response.body())!!.message.equals(
                                "success",
                                ignoreCase = true
                            )
                        ) {
                            if (response.body()?.data.isNullOrEmpty()) {
                                view.onResponseSuccess(mlist, allfiturdata)
                            } else {
                                hasData = true
                                mlist.add(NewHomeModel(HomeViewType.ITEM_TITLE))
                                for (i in response.body()?.data!!) {
                                    mlist.add(
                                        NewHomeModel(
                                            HomeViewType.RESTAURANT_ITEM,
                                            HomeGenericList(i)
                                        )
                                    )
                                }
                                view.onResponseSuccess(mlist, allfiturdata)
                            }
                            checkRideStatusAndCart()
                        }
                    }
                }

                override fun onFailure(
                    call: Call<AllMerchantByNearResponseJson>,
                    t: Throwable
                ) {
                    view.onResponseSuccess(mlist, allfiturdata)
                }
            })
    }

    fun checkRideStatusAndCart() {
        if (AppRideStatus.currentStatus != RideStatus.idle) {
            view.onResponseCheckRide(
                NewHomeModel(
                    HomeViewType.RIDE_SEARCH_VIEW,
                    HomeGenericList(RideHomeModel(AppRideStatus.currentStatus))
                )
            )

        }
        else {
            checkRideStatusFromNetwork()
        }
        if (checkCart()) {
            view.onResponseCartAvailable(NewHomeModel(HomeViewType.CART_VIEW))
        } else {
            view.removeHomeItem(NewHomeModel(HomeViewType.CART_VIEW))
        }
    }

    private fun checkRideStatusFromNetwork() {
        val requestService = ServiceGenerator.createService(UserService::class.java, loginUser.email, loginUser.password,loginUser.token)
        requestService.activeRide.enqueue(object : Callback<RideSyncResponse> {
            override fun onResponse(call: Call<RideSyncResponse>, response: Response<RideSyncResponse>) {
                if (response.isSuccessful) {
                    if (response.body()?.data?.isNotEmpty() == true) {
                        val ongoingRide = response.body()?.data!![0]
                        val obj = EnglishDriverModel()
                        obj.initFromRideSync(ongoingRide)
                        AppRideStatus.availableRider = obj
                        AppRideStatus.currentStatus = RideStatus.rideFound
                        AppRideStatus.currentRideId = ongoingRide.id_transaksi
                        view.onResponseCheckRide(
                            NewHomeModel(
                                HomeViewType.RIDE_SEARCH_VIEW,
                                HomeGenericList(RideHomeModel(AppRideStatus.currentStatus))
                            )
                        )
                    }
                }
            }

            override fun onFailure(call: Call<RideSyncResponse>, t: Throwable) {

            }
        })
    }


    override fun requestData() {

    }

    fun checkCart(): Boolean {
        val realm = Realm.getDefaultInstance()
        val items = realm.copyFromRealm(realm.where(PesananMerchant::class.java).findAll())
        return items.size > 0
    }

}