package com.ourdevelops.ourjek.activity.logistic

import android.location.Location
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface
import com.ourdevelops.ourjek.databinding.FragmentLogisticConfirmationBinding
import com.ourdevelops.ourjek.models.LocationWrapper
import com.ourdevelops.ourjek.utils.api.MapDirectionAPI

class LogisticConfirmationFragment(val callBack: RideRequestInterface) : Fragment() {

    private var distance = 0.0
    private lateinit var binding: FragmentLogisticConfirmationBinding
    private var pickLocationWrapper: LocationWrapper? = null
    private var dropLocationWrapper: LocationWrapper? = null
    private var routeJson: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLogisticConfirmationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
        buttonClicks()
    }

    private fun setUpView() {
        binding.tvPickupLocation.text = pickLocationWrapper?.locationName
        binding.tvDestinationLocation.text = dropLocationWrapper?.locationName
        val results = FloatArray(1)
        Location.distanceBetween(pickLocationWrapper?.latitude!!.toDouble(), pickLocationWrapper?.longitude!!.toDouble(), dropLocationWrapper?.latitude!!.toDouble(), dropLocationWrapper?.longitude!!.toDouble(), results)
        distance = String.format("%.3f", results[0]/1000).toDouble()
        binding.tvDistance.text = "${String.format("%.3f", distance)} km"
    }

    private fun buttonClicks() {
        binding.btnNext.setOnClickListener {
            val a = MapDirectionAPI.getTimeDistance(context, routeJson)
            callBack.onConfirmClick(distance, a)
        }
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
}