package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.os.CountDownTimer
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.ourdevelops.ourjek.databinding.SliderViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_adapters.SliderViewAdapter
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.SliderModel

class SliderView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var binding = SliderViewBinding.bind(itemView)
    private var mlist = ArrayList<SliderModel>()
    private lateinit var adapter: SliderViewAdapter
    private lateinit var countDowntimer: CountDownTimer
    private var currentPage = 0

    fun setupView(mlist: ArrayList<SliderModel>, title: String) {
        binding.sliderMainView.visibility = View.VISIBLE
        this.mlist = mlist
        adapter = SliderViewAdapter(itemView.context, mlist)
        binding.title.text = title
        binding.viewPager.adapter = adapter
        adapter.notifyDataSetChanged()
        binding.pageIndicator.setViewPager(binding.viewPager)
        initiateCountDownTimer()
        viewPagerListener()
    }

    fun initiateCountDownTimer() {
        currentPage = 0
        countDowntimer = object : CountDownTimer(5000, 2500) {
            override fun onFinish() {
                if (currentPage == mlist.size - 1) {
                    binding.viewPager.currentItem = 0
                } else {
                    binding.viewPager.setCurrentItem(currentPage + 1, true)
                }
            }

            override fun onTick(millisUntilFinished: Long) {

            }
        }
        countDowntimer.cancel()
        countDowntimer.start()
    }

    private fun viewPagerListener() {
        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                currentPage = position
                countDowntimer.cancel()
                countDowntimer.start()
            }
        })
    }


}