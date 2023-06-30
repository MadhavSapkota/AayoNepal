package com.ourdevelops.ourjek.activity.logistic.item_detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import com.ourdevelops.ourjek.databinding.ActivityLogisticItemDetailBinding
import com.ourdevelops.ourjek.activity.logistic.data.LogisticItemModel
import com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel
import com.ourdevelops.ourjek.activity.logistic.logistic_detail.LogisticDetailActivity

class LogisticItemDetailActivity : AppCompatActivity(), LogisticItemDetailContractor.View {

    private lateinit var binding: ActivityLogisticItemDetailBinding
    private lateinit var presenter: LogisticItemDetailPresenter
    private lateinit var adapter: LogisticItemDetailAdapter
    private var itemList = ArrayList<LogisticItemModel>()
    private lateinit var allData: LogisticDataModel
    private var weightList = ArrayList<LogisticWeightModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogisticItemDetailBinding.inflate(layoutInflater)
        presenter = LogisticItemDetailPresenter(this)

        setContentView(binding.root)

        getIntentData()
        setUpViews()
    }

    private fun getIntentData() {
        allData = intent.getSerializableExtra("allData") as LogisticDataModel
        setUpData()
    }

    private fun setUpData() {
        itemList.clear()
        weightList.clear()
        itemList = allData.delivery_type
        weightList = allData.estimated_weight
    }

    private fun setUpViews() {
        adapter = LogisticItemDetailAdapter(itemList, weightList, this)
        binding.itemRecyclerView.setHasFixedSize(true)
        binding.itemRecyclerView.isNestedScrollingEnabled = false
        binding.itemRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.itemRecyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    override fun onWeightSelected(position: Int, holderPosition: Int) {

        allData.apply {
            chosenEstimatedWeight = weightList[position].weight
            estimatedWeightPrice = weightList[position].price
            itemName = itemList[holderPosition].item_name
            deliveryId = itemList[holderPosition].id
        }

        startActivity(Intent(this, LogisticDetailActivity::class.java).apply {
            putExtra("allData", allData)
        })
    }
}