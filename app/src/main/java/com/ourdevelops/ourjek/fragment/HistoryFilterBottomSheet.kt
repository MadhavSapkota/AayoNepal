package com.ourdevelops.ourjek.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ourdevelops.ourjek.databinding.FragmentHistoryFilterBottomSheetBinding
import com.ourdevelops.ourjek.utils.windowHeight
import com.ourdevelops.ourjek.utils.windowWidth
import kotlinx.android.synthetic.main.fragment_playaudio.*

class HistoryFilterBottomSheet : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentHistoryFilterBottomSheetBinding
    private var mBottomSheet: BottomSheetDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHistoryFilterBottomSheetBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        customizeDialog()
        initializeViews()
    }

    private fun initializeViews() {
        binding.apply {
            close.setOnClickListener { dismiss() }
        }
    }

    private fun customizeDialog() {
        val windowHeight = requireActivity().windowHeight()
        val windowWidth = (requireActivity().windowWidth() * 0.96).toInt()
        mBottomSheet = dialog as? BottomSheetDialog
        mBottomSheet?.setCancelable(false)
        mBottomSheet?.apply {
            behavior.peekHeight = windowHeight
            behavior.maxWidth = windowWidth
            binding.root.layoutParams.width = windowWidth
        }
    }
}