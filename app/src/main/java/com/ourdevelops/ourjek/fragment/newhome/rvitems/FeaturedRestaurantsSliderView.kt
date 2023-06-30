package com.ourdevelops.ourjek.fragment.newhome.rvitems

import android.os.CountDownTimer
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.ourdevelops.ourjek.databinding.RowFeaturedRestaurantsSliderBinding
import com.ourdevelops.ourjek.models.PromoModel
import com.ourdevelops.ourjek.utils.ImageSliderAdapter

class FeaturedRestaurantsSliderView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = RowFeaturedRestaurantsSliderBinding.bind(itemView)
    private lateinit var adapter: ImageSliderAdapter
    private lateinit var countDowntimer: CountDownTimer
    private var currentPage = 0
    private var mlist = ArrayList<PromoModel>()

    fun setupViews(mlist: ArrayList<PromoModel>) {
        this.mlist = mlist
        adapter = ImageSliderAdapter(itemView.context, mlist)
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

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                currentPage = position
                countDowntimer.cancel()
                countDowntimer.start()
            }
        })
    }


}