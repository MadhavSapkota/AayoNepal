package com.ourdevelops.ourjek.fragment.promo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.FragmentPromoCodeBSBinding
import com.ourdevelops.ourjek.models.KodePromoModel


class PromoCodeBSFragment : BottomSheetDialogFragment() {
    private lateinit var obj: ArrayList<KodePromoModel>
    lateinit var binding: FragmentPromoCodeBSBinding
    lateinit var pAdapter: PromoCodeAdapter
    private var fragment: Fragment? = null
    private lateinit var price: String
    private lateinit var callBack: PromoCodeUseInretface

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPromoCodeBSBinding.inflate(inflater, container, false)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment = this
        getBundles()
        loadDataToViews()
    }

    fun setInterface(callback : PromoCodeUseInretface){
        this.callBack = callback
    }

    private fun getBundles() {
        val bundle = this.arguments
        obj = bundle?.getSerializable("promo") as ArrayList<KodePromoModel>
        price = bundle.getDouble("price").toString()
    }

    private fun loadDataToViews() {
        binding.rvPromocodes.setHasFixedSize(true)
        binding.rvPromocodes.isNestedScrollingEnabled = true
        binding.rvPromocodes.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL ,false)
        pAdapter = PromoCodeAdapter(
            obj.toList(),
            context,
            R.layout.item_promo,
            price,
            callBack
        )
        binding.rvPromocodes.adapter = pAdapter
    }
}