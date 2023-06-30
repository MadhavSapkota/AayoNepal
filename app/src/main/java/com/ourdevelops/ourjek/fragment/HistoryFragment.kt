package com.ourdevelops.ourjek.fragment

import android.content.Intent
import com.ourdevelops.ourjek.item.HistoryItem
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.utils.api.service.UserService
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.json.DetailRequestJson
import com.ourdevelops.ourjek.utils.PrefsManager
import com.ourdevelops.ourjek.json.AllTransResponseJson
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.chat.ChatActivity
import com.ourdevelops.ourjek.activity.chat.MessageActivity
import com.ourdevelops.ourjek.databinding.FragmentRecycleBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentRecycleBinding
    private var historyItem: HistoryItem? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentRecycleBinding.inflate(inflater, container, false)
        val getView: View = binding.root
        binding.filter.setOnClickListener { HistoryFilterBottomSheet().showNow(childFragmentManager, HistoryFilterBottomSheet::class.java.simpleName) }
        binding.inboxlist.setHasFixedSize(true)
        binding.inboxlist.layoutManager = GridLayoutManager(context, 1)
        return getView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun onProgressShow() {
        binding.inboxlist.visibility = View.GONE
        binding.rlprogress.visibility = View.VISIBLE
    }

    private fun onProgressHide() {
        binding.inboxlist.visibility = View.VISIBLE
        binding.rlprogress.visibility = View.GONE
    }

    private fun getTransactionData() {
        onProgressShow()
        val loginUser = BaseApp.getInstance(context).loginUser
        val userService = ServiceGenerator.createService(
                UserService::class.java, loginUser.noTelepon, loginUser.password,loginUser.token)
        val param = DetailRequestJson()
        param.id = loginUser.id
        param.language = PrefsManager(context).languageValue
        userService.history(param).enqueue(object : Callback<AllTransResponseJson> {
            override fun onResponse(call: Call<AllTransResponseJson>, response: Response<AllTransResponseJson>) {
                if (response.isSuccessful) {
                    onProgressHide()
                    historyItem = HistoryItem(context, Objects.requireNonNull(response.body())?.data, R.layout.item_order_new)
                    binding.inboxlist.adapter = historyItem
                    if (response.body()?.data.isNullOrEmpty()) {
                        binding.inboxlist.visibility = View.GONE
                        binding.rlnodata.visibility = View.VISIBLE
                    } else {
                        binding.inboxlist.visibility = View.VISIBLE
                        binding.rlnodata.visibility = View.GONE
                    }
                }
            }

            override fun onFailure(call: Call<AllTransResponseJson>, t: Throwable) {}
        })
    }

    override fun onResume() {
        super.onResume()
        getTransactionData()
    }
}