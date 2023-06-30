package com.ourdevelops.ourjek.fragment.ride_request.initial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ourdevelops.ourjek.activity.riderequest.managers.RideFragmentState
import com.ourdevelops.ourjek.activity.riderequest.managers.RideRequestInterface
import com.ourdevelops.ourjek.databinding.LayoutPickLocationBottomSheetBinding

class RideRequestInitialFragment(val callBack: RideRequestInterface) : Fragment() {
    lateinit var binding: LayoutPickLocationBottomSheetBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutPickLocationBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonClicks()
    }

    private fun buttonClicks() {
        binding.layoutSetOnMap.setOnClickListener {
            callBack.inflateSetLocationFragment(RideFragmentState.setOnMapState, "destination")
        }
    }

}
