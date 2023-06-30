package com.ourdevelops.ourjek.fragment.new_dynamic_home

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.BuildConfig
import com.ourdevelops.ourjek.activity.LoginActivity
import com.ourdevelops.ourjek.activity.new_merchant.NewMerchantActivity
import com.ourdevelops.ourjek.activity.notification.NewNotificationActivity
import com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestActivity
import com.ourdevelops.ourjek.constants.AppRideStatus
import com.ourdevelops.ourjek.constants.BroadCastIntents
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.constants.RideStatus
import com.ourdevelops.ourjek.databinding.FragmentNewDynamicHomeBinding
import com.ourdevelops.ourjek.fragment.newhome.categoryfilter.BottomSheetCategoryFilterFragment
import com.ourdevelops.ourjek.models.MerchantNearModel
import com.ourdevelops.ourjek.models.NewAllFeatureModel
import com.ourdevelops.ourjek.models.NewDynamicHomeModel
import com.ourdevelops.ourjek.service.RideRequestBroadCastReceiver
import com.ourdevelops.ourjek.utils.AppLogger


class NewDynamicHomeFragment : Fragment(), NewDynamicHomeContractor.View {

    private lateinit var binding: FragmentNewDynamicHomeBinding
    private lateinit var presenter: NewDynamicHomePresenter
    private lateinit var adapter: NewDynamicHomeAdapter
    private val mList = ArrayList<NewDynamicHomeModel>()
    private var firstName: String = ""
    var allFeatureData = ArrayList<NewAllFeatureModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = NewDynamicHomePresenter(context, this, activity)
        adapter = NewDynamicHomeAdapter(mList, context, this, presenter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewDynamicHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startHome()
        setupView()
        onButtonClicks()
    }

    override fun onSessionExpired() {
        binding.swipeRefresh.isRefreshing = false
        Toast.makeText(context, "Your session has expired! Please login again..", Toast.LENGTH_LONG)
            .show()
        startActivity(
            Intent(activity, LoginActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        )
        activity?.finish()
    }


    override fun onSessionSuccessful(newDynamicHomeData: ArrayList<NewDynamicHomeModel>?, allFiturData: ArrayList<NewAllFeatureModel>?, firstRestaurantName: String?) {
        binding.swipeRefresh.isRefreshing = false
        if (newDynamicHomeData != null && allFiturData != null) {
            allFeatureData = allFiturData
            mList.clear()
            mList.addAll(newDynamicHomeData)
            firstName = firstRestaurantName!!
            adapter.notifyDataSetChanged()
        } else {
            Toast.makeText(context, "There was an issue with the server..", Toast.LENGTH_LONG)
                .show()
            startActivity(
                Intent(activity, LoginActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            )
            activity?.finish()
        }
    }

    private fun setupView() {
        if (BuildConfig.DEBUG) {
            binding.tvDevelopers.visibility = View.VISIBLE
        }

        binding.dynamicView.layoutManager = LinearLayoutManager(context)
        binding.dynamicView.adapter = adapter
    }

    private fun onButtonClicks() {
        binding.swipeRefresh.setOnRefreshListener {
            startHome()
        }

        binding.btnNotificaion.setOnClickListener {
            startActivity(Intent(activity, NewNotificationActivity::class.java))
//            startActivity(Intent(activity, ImePayActivity::class.java))
        }
    }

    private fun startHome() {
        presenter.initializeData()
    }

    override fun onShowProgress() {
        binding.progress.visibility = View.VISIBLE
        binding.dynamicView.visibility = View.GONE
    }

    override fun onHideProgress() {
        binding.progress.visibility = View.GONE
        binding.dynamicView.visibility = View.VISIBLE
    }

    override fun onOpenRideRequestPage(allFeatureModel: NewAllFeatureModel) {
//       TODO bike rider selected
        val intent = Intent(activity, NewRiderRequestActivity::class.java)
        intent.putExtra("allData", allFeatureModel)
        startActivity(intent)
    }

    override fun onOpenBottomSheetFilter(id: Int) {
        val bundle = Bundle()
        bundle.putInt("vid", id)
        bundle.putSerializable("list", allFeatureData)
        val fragment = BottomSheetCategoryFilterFragment()
        fragment.arguments = bundle
        fragment.show(fragmentManager!!, fragment.tag)
    }

    override fun onMerchantSelected(id: Int) {
//        TODO food  and mart selected
        val i = Intent(context, NewMerchantActivity::class.java)
        i.putExtra(IntentKeys.filter, id)
        startActivity(i)
    }

    override fun removeListItem(position: Int) {
        activity?.runOnUiThread {
            mList.removeAt(position)
            adapter.notifyItemRemoved(position)
        }
    }

    override fun onResponseCheckRide(newHomeModel: NewDynamicHomeModel) {
        binding.swipeRefresh.isRefreshing = false
        binding.progress.visibility = View.GONE
        val contains = mList.any { it.type == newHomeModel.type }
        if (contains) {
            val currentCheckRidePosition = mList.indexOfFirst { it.type == newHomeModel.type }
            mList[currentCheckRidePosition].rideStatus = newHomeModel.rideStatus
            adapter.notifyItemChanged(currentCheckRidePosition)
        } else {
            mList.add(3, newHomeModel)
            adapter.notifyItemInserted(3)
        }
    }

    override fun onResponseCartAvailable(newHomeModel: NewDynamicHomeModel) {
        binding.swipeRefresh.isRefreshing = false
        binding.progress.visibility = View.GONE
        val contains = mList.any { it.type == newHomeModel.type }
        if (contains) {
            val currentCartPosition = mList.indexOfFirst { it.type == newHomeModel.type }
            adapter.notifyItemChanged(currentCartPosition)
        } else {
            mList.add(4, newHomeModel)
            adapter.notifyItemInserted(4)
        }
    }

    override fun removeHomeItem(newHomeModel: NewDynamicHomeModel) {
        binding.swipeRefresh.isRefreshing = false
        binding.progress.visibility = View.GONE
        val contains = mList.any { it.type == newHomeModel.type }
        if (contains) {
            val currentPosition = mList.indexOfFirst { it.type == newHomeModel.type }
            mList.removeAt(currentPosition)
            adapter.notifyItemRemoved(currentPosition)
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

    private fun statusCheck() {
        startHome()
    }

    private fun updateRideSearchView(status: RideStatus) {
        AppLogger.log("in update view from broad cast not found home frag")
        val contains = mList.any { it.type == NewDynamicHomeViewTypes.RIDE_SEARCH_VIEW }
        if (contains) {
            AppLogger.log("in contains of update view from broad cast not found home frag")
            val currentPosition = mList.indexOfFirst { it.type == NewDynamicHomeViewTypes.RIDE_SEARCH_VIEW }
            mList[currentPosition].rideStatus = status
            adapter.notifyItemChanged(currentPosition)
        }
    }

    private val rideBroadCastReceiver = object : RideRequestBroadCastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val rideResponseType = intent?.getStringExtra(IntentKeys.riderResponseType)
            AppLogger.log("ride response type ==> $rideResponseType")
            when (rideResponseType) {
                RideResponseType.notFound.name -> {
                    AppLogger.log("in broad cast not found home frag")
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

                RideResponseType.onCustomerRideCanceled.name -> {
                    AppRideStatus.currentStatus = RideStatus.cancelRide
                    updateRideSearchView(RideStatus.cancelRide)
                }

            }
        }
    }
}