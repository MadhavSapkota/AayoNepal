package com.ourdevelops.ourjek.fragment.ride_request

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface
import com.ourdevelops.ourjek.activity.save_address.SaveUserAddressActivity
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.LayoutSetOnMapBinding
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.utils.AppLogger

class RideReqeustSearchDestinationFragment(val callBack: RideRequestInterface) : Fragment() {
    var binding: LayoutSetOnMapBinding? = null
    private var locationWrapper: LocationWrapper? = null
    private var type = "destination"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutSetOnMapBinding.inflate(inflater, container, false)
        return binding?.root!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonClicks()
    }

    override fun onResume() {
        super.onResume()
        setButtonTexts()
    }

    private fun buttonClicks() {
        binding?.btnConfirmDestination?.setOnClickListener {
            callBack.showRideConfirmationPage()
        }

        binding?.addImage?.setOnClickListener {
            val intent = Intent(activity, SaveUserAddressActivity::class.java)
            intent.putExtra(IntentKeys.locationWrapper, locationWrapper)
            activity?.startActivity(intent)
        }
    }

    fun setDestination(locationName: LocationWrapper?) {
        locationWrapper = locationName
        binding?.tvSearchDestination?.text = locationWrapper?.locationName
    }

    fun setSearchingText(locationName: String) {
        binding?.tvSearchDestination?.text = locationName
    }

    fun setType(type: String){
        this.type = type
        AppLogger.log(type)
        setButtonTexts()
    }

    private fun setButtonTexts() {
        if(type == "pickup"){
            binding?.tvSearchDestination?.hint = "Search Pickup"
            binding?.btnConfirmDestination?.text = "Confirm PickUp"
        }else if(type == "destination"){
            binding?.tvSearchDestination?.hint = "Search Destination"
            binding?.btnConfirmDestination?.text = "Confirm Destination"
        }
    }

}