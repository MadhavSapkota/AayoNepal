package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.RowImageSliderBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.SliderModel
import com.ourdevelops.ourjek.utils.AppLogger
import com.ourdevelops.ourjek.utils.Log
import java.util.*

class SliderViewAdapter(val context: Context, val mList: ArrayList<SliderModel>) : PagerAdapter() {
    private lateinit var binding: RowImageSliderBinding

    override fun getCount(): Int {
        return mList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as RelativeLayout
    }

    @SuppressLint("NewApi")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        binding = RowImageSliderBinding.inflate(LayoutInflater.from(context), container, false)
        val imageUrl = "${Constants.IMAGESSLIDER}${mList[position].foto}"
        Log.d("checker", "this is image url $imageUrl")
        val metrics = DisplayMetrics()
        context.display?.getMetrics(metrics)
        metrics.apply {
            AppLogger.log("screen -> $heightPixels x $widthPixels")
            AppLogger.log("screen -> ${calculateHeight(widthPixels)}")
            binding.imageSlider.layoutParams.height = calculateHeight(widthPixels)
            binding.imageSlider.layoutParams.width = widthPixels
        }
        Glide.with(context).load(mList[position].foto).centerCrop().into(binding.imageSlider)
        clickHandler(mList[position])
        container.addView(binding.root)
        return binding.root
    }

    private fun calculateHeight(width: Int): Int{
        return (width*9)/16
    }

    private fun clickHandler(obj: SliderModel) {
        binding.imageSlider.setOnClickListener {
            if (obj.type_promosi == "link") {
                if (obj.link_promosi?.startsWith("http") == true || obj.link_promosi?.startsWith("https") == true) {
                    context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(obj.link_promosi)))
                }
            }
            else {
                if (obj.id_fitur != null) {
                    val i = Intent(context, NewDetailMerchantActivity::class.java)
                    i.putExtra("id", obj.id_merchant)
                    i.putExtra("id_merchant", obj.id_merchant)
                    i.putExtra("item_id", obj.id_item)
                    i.putExtra("category_id", obj.category_id)
                    i.putExtra(IntentKeys.filter, obj.id_fitur)
                    context.startActivity(i)
                }
            }
        }
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }
}