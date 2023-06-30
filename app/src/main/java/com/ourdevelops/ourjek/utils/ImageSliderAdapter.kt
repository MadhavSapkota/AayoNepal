package com.ourdevelops.ourjek.utils

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.databinding.RowImageSliderBinding
import com.ourdevelops.ourjek.models.PromoModel

class ImageSliderAdapter(val context: Context, val mlist: ArrayList<PromoModel>) : PagerAdapter() {
    private lateinit var binding: RowImageSliderBinding

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as RelativeLayout
    }

    override fun getCount(): Int {
        return mlist.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        binding = RowImageSliderBinding.inflate(LayoutInflater.from(context), container, false)
        val imageUrl = "${Constants.IMAGESSLIDER}${mlist[position].foto}"
        Log.d("checker", "this is image url $imageUrl")
        Glide.with(context).load(mlist[position].foto).centerCrop().into(binding.imageSlider)
        clickHandler(mlist[position])
        container.addView(binding.root)
        return binding.root
    }

    private fun clickHandler(obj: PromoModel) {
        binding.imageSlider.setOnClickListener {
            if (obj.id_fitur != null) {
                val i = Intent(context, NewDetailMerchantActivity::class.java)
                i.putExtra("id", obj.id_merchant)
                i.putExtra("id_merchant", obj.id_merchant)
                context.startActivity(i)
            }
        }

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }
}