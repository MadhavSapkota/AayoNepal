package com.ourdevelops.ourjek.fragment.new_dynamic_home

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.google.android.libraries.places.api.Places
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.constants.*
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.ServicesModel
import com.ourdevelops.ourjek.json.NewDynamicHomeJson
import com.ourdevelops.ourjek.json.ride_request.RideSyncResponse
import com.ourdevelops.ourjek.models.*
import com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.NetworkManager
import com.ourdevelops.ourjek.utils.PrefsManager
import com.ourdevelops.ourjek.utils.SettingPreference
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import com.ourdevelops.ourjek.utils.internetconnectionchooser.InternetConnectionChooser
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewDynamicHomePresenter(
        var context: Context?,
        var view: NewDynamicHomeContractor.View,
        var activity: FragmentActivity?
) : NewDynamicHomeContractor.Presenter {

    val loginUser: User = BaseApp.getInstance(context).loginUser
    var customerData: User? = null
    var newDynamicHomeData: ArrayList<NewDynamicHomeModel>? = null
    var allFiturData: ArrayList<NewAllFeatureModel>? = null
    private lateinit var sp : SettingPreference
    private var hasData = false

    override fun onVehicleCategorySelected(servicesModel: ServicesModel) {

        when (servicesModel.id) {
            ServiceID.BIKE_RIDE -> {
                if (PrefsManager(context).getplace().isEmpty() || PrefsManager(context).getplace2()
                                .isEmpty()
                ) {
                    openRiderRequestPage(allFiturData!![0])
                } else {
                    openRiderRequestPage(allFiturData!![0])
                }
            }

            ServiceID.FOOD -> {
                view.onMerchantSelected(servicesModel.id)
            }

            ServiceID.MART -> {
                view.onMerchantSelected(servicesModel.id)
            }

            else -> {
//                TODO car rider bottom sheet
                openBottomSheetFilter(servicesModel.id)
            }
        }
    }

    private fun openRiderRequestPage(id: NewAllFeatureModel) {
        if (AppRideStatus.currentStatus == RideStatus.searchingRider || AppRideStatus.currentStatus == RideStatus.rideFound) {
            showRideOnProgressDialog()
        } else {
            view.onOpenRideRequestPage(id)
        }
    }

    private fun openBottomSheetFilter(id: Int) {
        if (AppRideStatus.currentStatus == RideStatus.searchingRider || AppRideStatus.currentStatus == RideStatus.rideFound) {
            showRideOnProgressDialog()
        } else {
            view.onOpenBottomSheetFilter(id)
        }

    }

    private fun showRideOnProgressDialog() {
        CustomDialogOkay.setTitle("You have ride request on progress")
                .showOnlyDialog(activity!!, object : CustomDialogOkay.dialogOnClickListener {
                    override fun onClick() {
                    }

                    override fun onClose() {
                    }
                })
    }


    override fun initializeData() {
        if (!Places.isInitialized()) {
            Places.initialize(context!!, context!!.getString(R.string.google_maps_key))
        }
        if (!NetworkManager.isConnectToInternet(context)) {
            val internetConnectionChooser = InternetConnectionChooser(activity!!)
            internetConnectionChooser.init()
        }
        AppLogger.log("not null 0")
        getHomeData()
    }

    private fun getHomeData() {
        if (hasData) {
            checkRideStatusAndCart()
        } else {
            view.onShowProgress()
            val service = ServiceGenerator.createService(
                    UserService::class.java,
                    loginUser.noTelepon,
                    loginUser.password,
                    Constants.LATITUDE.toString(),
                    Constants.LONGITUDE.toString()
            )
            service.newHome.enqueue(object : Callback<NewDynamicHomeJson> {
                override fun onResponse(
                        call: Call<NewDynamicHomeJson>,
                        response: Response<NewDynamicHomeJson>
                ) {
                    AppLogger.log("not null 1")
                    if (response.body() != null) {
                        AppLogger.log("not null 2")
                        customerData = response.body()?.customerData
                        newDynamicHomeData = response.body()?.newDynamicHome
                        allFiturData = response.body()?.feature
                        saveAppSettings(response.body()?.settings)

                        val finalList = ArrayList<NewDynamicHomeModel>()
                        val firstRestaurantName = ""
                        var counter = 0

                        for (i in newDynamicHomeData!!) {
                            Log.d("vertical", "onResponse: ")

                            when (counter) {

                                3 -> {
                                    checkRideStatusFromNetwork()
                                    if (AppRideStatus.currentStatus == RideStatus.searchingRider) {
                                        finalList.add(NewDynamicHomeModel().apply {
                                            type = NewDynamicHomeViewTypes.RIDE_SEARCH_VIEW
                                            title = "Ride Search View"
                                        })
                                    }
                                }

                                4 -> {
                                    AppLogger.log("cart asdasd")
                                    if (checkCart()) {
                                        AppLogger.log("cart asdasdadasdadsad")
                                        finalList.add(NewDynamicHomeModel().apply {
                                            type = NewDynamicHomeViewTypes.CART_VIEW
                                            title = "Items in Cart"
                                        })
                                    }
                                }
                            }

                            if (i.type == NewDynamicHomeViewTypes.VERTICAL_LIST) {
                                if (!i.vertical.isNullOrEmpty()) {
                                    finalList.add(NewDynamicHomeModel().apply {
                                        type = NewDynamicHomeViewTypes.TITLE_VIEW
                                        title = i.title
                                        caption = i.caption
                                    })
                                    Log.d("vertical", "onResponse: ${i.title}")
                                    for (j in i.vertical!!) {
                                        counter++
                                        Log.d("vertical", "onResponse: ${j.nama_merchant}")
                                        finalList.add(NewDynamicHomeModel().apply {
                                            type = NewDynamicHomeViewTypes.RESTAURANT_LIST
                                            title = i.title
                                            restaurantItems = j
                                        })
                                    }
                                }
                            } else {
                                finalList.add(i)
                            }
                            counter++
                        }

                        view.onHideProgress()
                        when (!customerData?.token.equals(PrefsManager(context).fcmtoken) || customerData?.token.isNullOrEmpty()) {
                            true -> {
                                view.onSessionExpired()
                            }

                            false -> {
                                view.onSessionSuccessful(
                                        finalList,
                                        allFiturData,
                                        firstRestaurantName
                                )
                            }
                        }
                    } else {
                        AppLogger.log("not null 3")
                        Toast.makeText(
                                context,
                                "There was an issue with the server..",
                                Toast.LENGTH_LONG
                        ).show()
                    }
                }

                override fun onFailure(call: Call<NewDynamicHomeJson>, t: Throwable) {
                    AppLogger.log("not null 4 ${t.localizedMessage}")
                }

            })
        }
    }

    private fun saveAppSettings(settings: AppSettingsModel?) {
        sp = SettingPreference(context)
        val payu = settings?.payu
        sp.updateCurrency(settings?.currency)
        sp.updateabout(settings?.aboutus)
        sp.updateemail(settings?.email)
        sp.updatephone(settings?.phone)
        sp.updateweb(settings?.website)
        sp.updatePaypal(settings?.paypalkey)
        sp.updatepaypalmode(settings?.paypalmode)
        sp.updatepaypalactive(settings?.paypalactive)
        sp.updatestripeactive(settings?.stripeactive)
        sp.updatecurrencytext(settings?.currency_text)
        sp.updatePayudebug(payu?.payudebug)
        sp.updatePayumerchantid(payu?.payuid)
        sp.updatePayusalt(payu?.payusalt)
        sp.updatePayumerchantkey(payu?.payukey)
        sp.updatePayuActive(payu?.active)
    }

    fun checkRideStatusAndCart() {
        if (AppRideStatus.currentStatus != RideStatus.idle) {
            view.onResponseCheckRide(NewDynamicHomeModel().apply {
                type = NewDynamicHomeViewTypes.RIDE_SEARCH_VIEW
                rideStatus = AppRideStatus.currentStatus
            })
        } else {
            checkRideStatusFromNetwork()
        }
        if (checkCart()) {
            view.onResponseCartAvailable(NewDynamicHomeModel().apply {
                type = NewDynamicHomeViewTypes.CART_VIEW
            })
        } else {
            view.removeHomeItem(NewDynamicHomeModel().apply {
                type = NewDynamicHomeViewTypes.CART_VIEW
            })
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
                        view.onResponseCheckRide(NewDynamicHomeModel().apply {
                            type = NewDynamicHomeViewTypes.RIDE_SEARCH_VIEW
                            rideStatus = AppRideStatus.currentStatus
                        })
                    }
                }
            }

            override fun onFailure(call: Call<RideSyncResponse>, t: Throwable) {

            }
        })
    }

    fun checkCart(): Boolean {
        val realm = Realm.getDefaultInstance()
        val items = realm.copyFromRealm(realm.where(PesananMerchant::class.java).findAll())
        return items.size > 0
    }
}