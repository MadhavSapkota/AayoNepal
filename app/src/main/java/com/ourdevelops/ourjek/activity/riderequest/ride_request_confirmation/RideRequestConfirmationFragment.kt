package com.ourdevelops.ourjek.activity.riderequest.ride_request_confirmation

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.customviews.dialogs.CustomProgressDialog
import com.ourdevelops.ourjek.databinding.LayoutRideRequestConfirmationBinding
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.models.NewAllFeatureModel
import com.ourdevelops.ourjek.models.ride_request.RideConfirmationWrapper
import com.ourdevelops.ourjek.utils.Utility

class RideRequestConfirmationFragment(val callBack: RideRequestInterface) : Fragment(),
    RideRequestConfirmationContractor.View {

    private var binding: LayoutRideRequestConfirmationBinding? = null
    private var pickLocationWrapper: LocationWrapper? = null
    private var dropLocationWrapper: LocationWrapper? = null
    private var allFeatureData: NewAllFeatureModel? = null
    private var routeJson: String? = null
    private lateinit var presenter: RideRequestConfirmationPresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LayoutRideRequestConfirmationBinding.inflate(inflater, container, false)
        val bundle = this.arguments
        allFeatureData = bundle?.getSerializable("allData") as NewAllFeatureModel?
        presenter = RideRequestConfirmationPresenter(activity?.applicationContext!!, this, allFeatureData)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.requestRideData(routeJson)
        buttonClicks()
    }

    private fun buttonClicks() {
        binding?.btnSendRequest?.setOnClickListener {
            requestRides()
        }
    }

    private fun requestRides() {
        CustomProgressDialog.showDialog("Please wait", "Searching for riders", activity)
        presenter.confirmRideRequest(pickLocationWrapper!!, dropLocationWrapper!!)
    }

    fun setPickDropLocations(
        pickLocation: LocationWrapper?,
        dropLocation: LocationWrapper?,
        response: String?
    ) {
        this.routeJson = response
        this.pickLocationWrapper = pickLocation
        this.dropLocationWrapper = dropLocation
    }

    override fun onRideDdataResponse(response: RideConfirmationWrapper) {
        Utility.currencyTXT(binding?.tvCost, response.cost.toString(), requireContext())
        Utility.currencyTXT(binding?.tvTotalPrice,response.total.toString(), requireContext())
        binding?.tvDistance?.text = response.distance.toString()
        binding?.tvEstimateTime?.text = response.estimatedTime
        binding?.tvDiscount?.text = response.discount
    }

    override fun confirmRideRequestError(errorMessage: String) {
        CustomProgressDialog.dismissDialog()
        CustomDialogOkay.setBtnText("Okay").setTitle("No Riders Available!").setMessage(errorMessage).showOnlyDialog(requireActivity(), object : CustomDialogOkay.dialogOnClickListener{
            override fun onClick() {
                
            }

            override fun onClose() {

            }

        })
    }

    override fun onRiderSarching() {
        initiateTimerToDismiss()
        CustomProgressDialog.dismissDialog()
        CustomDialogOkay.setTitle("Searching for rider")
            .setMessage("We will notify when we find a rider for you")
            .showOnlyDialog(activity!!, object : CustomDialogOkay.dialogOnClickListener {
                override fun onClick() {
                    activity?.finish()
                }

                override fun onClose() {
                    activity?.finish()
                }

            })
    }

    private fun initiateTimerToDismiss() {
        val timer = object : CountDownTimer(2000, 1000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                activity?.finish()
            }

        }.start()
    }


}