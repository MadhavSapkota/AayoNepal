package com.ourdevelops.ourjek.activity.logistic.loader_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import com.ourdevelops.ourjek.activity.logistic.logistic_detail.LogisticDetailContractor
import com.ourdevelops.ourjek.databinding.FragmentLogisticLoaderBinding

class LogisticLoaderFragment : BottomSheetDialogFragment(), LogisticLoaderContractor.View {

    private lateinit var binding: FragmentLogisticLoaderBinding
    private lateinit var callBack: LogisticDetailContractor.View
    private lateinit var adapter: LogisticLoaderAdapter
    private lateinit var presenter: LogisticLoaderPresenter
    private var size = 0
    private lateinit var allData: LogisticDataModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setStyle(DialogFragment.STYLE_NORMAL, R.style.AppBottomSheetDialogTheme)
        binding = FragmentLogisticLoaderBinding.inflate(inflater, container, false)
        receiveBundleData()
        presenter = LogisticLoaderPresenter(activity, this, context, allData.loader_data?.max_loader_number?.toInt())
        adapter = LogisticLoaderAdapter()
        adapter.setLoaderSize(size)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpData()
        onButtonClicks()
    }

    private fun setUpData() {
        binding.loaderRecyclerView.layoutManager = GridLayoutManager(context, 8, GridLayoutManager.VERTICAL, false)
        binding.loaderRecyclerView.canScrollHorizontally(0)
        binding.loaderRecyclerView.adapter = adapter
    }

    private fun onButtonClicks() {
        binding.addLoader.setOnClickListener{
            size++
            presenter.onSizeChanged(size)
        }

        binding.reduceLoader.setOnClickListener{
            size--
            presenter.onSizeChanged(size)
        }

        binding.confirm.setOnClickListener{
            allData.selectedNumberOfLoaders = size
            dismiss()
            callBack.onLoaderNumberSelected(allData)
        }
    }

    fun setInterface(callBack: LogisticDetailContractor.View){
        this.callBack = callBack
    }

    private fun receiveBundleData() {
        allData = arguments?.getSerializable("allData") as LogisticDataModel
    }

    override fun onLoaderNumberChanged(size: Int) {
        this.size = size
        binding.loaderNumber.text = size.toString()
        adapter.setLoaderSize(size)
        adapter.notifyDataSetChanged()
    }
}