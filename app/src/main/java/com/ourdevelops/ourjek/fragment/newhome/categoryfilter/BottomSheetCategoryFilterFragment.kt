package com.ourdevelops.ourjek.fragment.newhome.categoryfilter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ourdevelops.ourjek.constants.ServiceID
import com.ourdevelops.ourjek.databinding.FragmentBottomSheetCategoryFilterBinding
import com.ourdevelops.ourjek.models.NewAllFeatureModel

class BottomSheetCategoryFilterFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBottomSheetCategoryFilterBinding
    private var vehicleCategoryId = 0
    private var allfiturdata = ArrayList<NewAllFeatureModel>()
    private val vehicleascatfitur = ArrayList<NewAllFeatureModel>()
    private lateinit var adapter : CategoryFilterAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBottomSheetCategoryFilterBinding.inflate(inflater, container, false)
        receivingBundles()
        return binding.root
    }

    private fun receivingBundles() {
        val bundle = this.arguments
        vehicleCategoryId = bundle?.getInt("vid", 0)!!
        allfiturdata = bundle.getSerializable("list") as ArrayList<NewAllFeatureModel>
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        createData()
    }

    private fun setupViews() {
        adapter = CategoryFilterAdapter(vehicleascatfitur, activity)
        binding.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.adapter = adapter
    }

    private fun createData() {
        when (vehicleCategoryId) {
            ServiceID.BIKE_RIDE -> {
                for (i in allfiturdata.indices) {
                    if (allfiturdata[i].vehicle_category_id == ServiceID.BIKE_RIDE) {
                        vehicleascatfitur.add(allfiturdata[i])
                    }
                }
            }

            ServiceID.CAR_RIDE -> {
                for (i in allfiturdata.indices) {
                    if (allfiturdata[i].vehicle_category_id == ServiceID.CAR_RIDE) {
                        vehicleascatfitur.add(allfiturdata[i])
                    }
                }
            }

            ServiceID.LOGISTIC -> {
                for (i in allfiturdata.indices) {
                    if (allfiturdata[i].vehicle_category_id == ServiceID.LOGISTIC) {
                        vehicleascatfitur.add(allfiturdata[i])
                    }
                }
            }
        }
        adapter.notifyDataSetChanged()
    }
}