package com.ourdevelops.ourjek.activity.notification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.constants.logDebug
import com.ourdevelops.ourjek.constants.showLongToast
import com.ourdevelops.ourjek.databinding.ActivityNewNotificationBinding
import com.ourdevelops.ourjek.models.NewNotificationModel

class NewNotificationActivity : AppCompatActivity(), NewNotificationContractor.View {

    private lateinit var binding: ActivityNewNotificationBinding
    private lateinit var presenter: NewNotificationPresenter
    private lateinit var adapter: NewNotificationAdapter
    private var mList = ArrayList<NewNotificationModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = NewNotificationPresenter(applicationContext, this)
        adapter = NewNotificationAdapter(applicationContext, presenter, mList)
        setUpViews()
        onButtonClicks()
        presenter.getNotificationData()
    }

    private fun onButtonClicks() {
        binding.backBtn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun setUpViews(){
        binding.rvNotification.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvNotification.adapter = adapter
    }

    override fun showProgress() {
        binding.rvNotification.visibility = View.GONE
        binding.progress.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        binding.rvNotification.visibility = View.VISIBLE
        binding.progress.visibility = View.GONE
    }

    override fun onNotificationResponseSuccess(response: ArrayList<NewNotificationModel>) {
        mList.clear()
        mList.addAll(response)
        adapter.notifyDataSetChanged()
    }

    override fun onNotificationResponseFailure() {
        binding.rlnodata.visibility = View.VISIBLE
        binding.rvNotification.visibility = View.GONE

    }
}