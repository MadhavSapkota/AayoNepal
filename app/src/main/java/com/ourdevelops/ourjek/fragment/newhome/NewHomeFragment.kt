package com.ourdevelops.ourjek.fragment.newhome

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.BuildConfig
import com.ourdevelops.ourjek.activity.NotificationActivity
import com.ourdevelops.ourjek.activity.allmerchant.AllMerchantActivity
import com.ourdevelops.ourjek.activity.notification.NewNotificationActivity
import com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestActivity
import com.ourdevelops.ourjek.constants.AppRideStatus
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.constants.RideStatus
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes
import com.ourdevelops.ourjek.databinding.FragmentNewHomeBinding
import com.ourdevelops.ourjek.fragment.newhome.categoryfilter.BottomSheetCategoryFilterFragment
import com.ourdevelops.ourjek.models.AllFiturModel
import com.ourdevelops.ourjek.models.VehicleModel
import com.ourdevelops.ourjek.models.home.HomeGenericList
import com.ourdevelops.ourjek.models.home.HomeViewType
import com.ourdevelops.ourjek.models.home.NewHomeModel
import com.ourdevelops.ourjek.models.ride_request.RideHomeModel
import com.ourdevelops.ourjek.service.RideRequestBroadCastReceiver
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.PrefsManager

class NewHomeFragment : Fragment(), NewHomeContractor.View {
    private lateinit var presenter: NewHomePresenter
    private lateinit var binding: FragmentNewHomeBinding
    private lateinit var adapter: NewHomeAdapter
    private val mlist = ArrayList<NewHomeModel>()
    private val allFiturData = ArrayList<AllFiturModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = NewHomePresenter(context!!, this, activity!!)
        setupViews()
        buttonClicks()
    }

    private fun buttonClicks() {
        binding.swipeRefresh.setOnRefreshListener {
            initHome()
        }

        binding.btnNotificaion.setOnClickListener {
            startActivity(Intent(activity, NewNotificationActivity::class.java))
        }
    }

    private fun setupViews() {

        if (BuildConfig.DEBUG) {
            binding.tvDevelopers.visibility = View.VISIBLE
        }

        adapter = NewHomeAdapter(mlist, this)
        binding.recyclerView.layoutManager = LinearLayoutManager(activity?.applicationContext)
        binding.recyclerView.adapter = adapter
    }

    private fun initHome() {
        presenter.initializeHome()
    }

    override fun onResponseSuccess(
        response: ArrayList<NewHomeModel>,
        allFiturData: ArrayList<AllFiturModel>
    ) {
        binding.swipeRefresh.isRefreshing = false
        binding.progress.visibility = View.GONE
        this.allFiturData.clear()
        this.allFiturData.addAll(allFiturData)
        mlist.clear()
        mlist.addAll(response)
        adapter.notifyDataSetChanged()
    }

    override fun onResponseError(errorMessage: String, image: Int) {
        binding.swipeRefresh.isRefreshing = false
        binding.progress.visibility = View.GONE
    }

    override fun onVehicleCategorySelected(item: VehicleModel) {
        when (item.id) {
            1 -> {
                if (PrefsManager(context).getplace().isEmpty() || PrefsManager(context).getplace2()
                        .isEmpty()
                ) {
                    openRiderRequestPage(allFiturData[0].idFitur)
                } else {
                    openRiderRequestPage(allFiturData[0].idFitur)
                }
            }
            5 -> {
                openMerchantListPage(item.id)
            }
            6 -> {
                openMerchantListPage(item.id)
            }
            else -> {
                openBottomSheetFilter(item.id)
            }
        }

    }

    private fun openMerchantListPage(itemId : Int?) {
        val i = Intent(context, AllMerchantActivity::class.java)
        i.putExtra(IntentKeys.filter, itemId)
        startActivity(i)
    }

    override fun onResponseCheckRide(obj: NewHomeModel) {
        binding.swipeRefresh.isRefreshing = false
        binding.progress.visibility = View.GONE
        val contains = mlist.any { it.viewType == obj.viewType }
        if (contains) {
            val currentCheckRidePosition = mlist.indexOfFirst { it.viewType == obj.viewType }
            mlist[currentCheckRidePosition].data = obj.data
            adapter.notifyItemChanged(currentCheckRidePosition)
        } else {
            mlist.add(3, obj)
            adapter.notifyItemInserted(3)
        }
    }

    override fun onResponseCartAvailable(obj: NewHomeModel) {
        binding.swipeRefresh.isRefreshing = false
        binding.progress.visibility = View.GONE
        val contains = mlist.any { it.viewType == obj.viewType }
        if (contains) {
            val currentCartPosition = mlist.indexOfFirst { it.viewType == obj.viewType }
            mlist[currentCartPosition].data = obj.data
            adapter.notifyItemChanged(currentCartPosition)
        } else {
            mlist.add(4, obj)
            adapter.notifyItemInserted(4)
        }
    }

    override fun removeHomeItem(obj: NewHomeModel) {
        binding.swipeRefresh.isRefreshing = false
        binding.progress.visibility = View.GONE
        val contains = mlist.any { it.viewType == obj.viewType }
        if (contains) {
            val currentPosition = mlist.indexOfFirst { it.viewType == obj.viewType }
            mlist.removeAt(currentPosition)
            adapter.notifyItemRemoved(currentPosition)
        }
    }

    override fun removeListItem(position: Int) {
        activity?.runOnUiThread {
            mlist.removeAt(position)
            adapter.notifyItemRemoved(position)
        }
    }

    private fun openRiderRequestPage(id: Int) {
        if (AppRideStatus.currentStatus == RideStatus.searchingRider || AppRideStatus.currentStatus == RideStatus.rideFound) {
            showRideOnProgressDialog()
        } else {
            val intent = Intent(activity, NewRiderRequestActivity::class.java)
            intent.putExtra(IntentKeys.filter, id)
            startActivity(intent)
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


    private fun openBottomSheetFilter(id: Int) {
        if (AppRideStatus.currentStatus == RideStatus.searchingRider || AppRideStatus.currentStatus == RideStatus.rideFound) {
            showRideOnProgressDialog()
        } else {
            val bundle = Bundle()
            bundle.putInt("vid", id)
            bundle.putSerializable("list", allFiturData)
            val fragment = BottomSheetCategoryFilterFragment()
            fragment.arguments = bundle
            fragment.show(fragmentManager!!, fragment.tag)

        }

    }

    override fun onResume() {
        val broadcastManager = LocalBroadcastManager.getInstance(requireContext())
        broadcastManager.registerReceiver(
            rideBroadCastReceiver,
            IntentFilter(BroadCastIntents.ActionReceiverRideUpdates)
        )
        super.onResume()
        statusCheck()
    }

    override fun onPause() {
        val broadcastManager = LocalBroadcastManager.getInstance(requireContext())
        broadcastManager.unregisterReceiver(rideBroadCastReceiver)
        super.onPause()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == 555) {
                presenter.initializeHome()
            } else {
                statusCheck()
            }
        } else {
            statusCheck()
        }
    }

    private fun statusCheck() {
        initHome()
    }

    private fun updateRideSearchView(status: RideStatus) {
        val contains = mlist.any { it.viewType == HomeViewType.RIDE_SEARCH_VIEW }
        if (contains) {
            val currentPosition =
                mlist.indexOfFirst { it.viewType == HomeViewType.RIDE_SEARCH_VIEW }
            mlist[currentPosition].data = HomeGenericList(RideHomeModel(status))
            adapter.notifyItemChanged(currentPosition)
        }
    }

    private val rideBroadCastReceiver = object : RideRequestBroadCastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val rideResponseType = intent?.getStringExtra(IntentKeys.riderResponseType)
            AppLogger.log("ride response type ==> $rideResponseType")
            when (rideResponseType) {
                RideResponseType.notFound.name -> {
                    AppRideStatus.currentStatus = RideStatus.rideNotFound
                    updateRideSearchView(RideStatus.rideNotFound)
                }

                RideResponseType.rideFoundView.name -> {
                    updateRideSearchView(RideStatus.rideFound)
                }

                RideResponseType.searchAgain.name -> {
                    AppRideStatus.currentStatus = RideStatus.searchingRider
                    updateRideSearchView(RideStatus.searchingRider)
                }

                RideResponseType.finish.name -> {
                    AppRideStatus.currentStatus = RideStatus.finish
                    updateRideSearchView(RideStatus.finish)
                }

                RideResponseType.start.name -> {
                    AppRideStatus.currentStatus = RideStatus.start
                    updateRideSearchView(RideStatus.start)
                }

                RideResponseType.cancelRide.name -> {
                    AppRideStatus.currentStatus = RideStatus.cancelRide
                    updateRideSearchView(RideStatus.cancelRide)
                }

            }
        }
    }
}