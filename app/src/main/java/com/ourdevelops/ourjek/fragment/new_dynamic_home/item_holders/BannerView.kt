package com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.DisplayMetrics
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.databinding.BannerViewBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.BannerSingleModel
import com.ourdevelops.ourjek.utils.AppLogger

class BannerView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = BannerViewBinding.bind(itemView)
    private var bannerData: BannerSingleModel? = null

    @SuppressLint("NewApi")
    fun setUpView(data: ArrayList<BannerSingleModel>, context: Context) {
        binding.bannerMainView.visibility = View.VISIBLE
        bannerData = data[0]
        val metrics = DisplayMetrics()
        context.display?.getMetrics(metrics)
        metrics.apply {
            AppLogger.log("screen -> $heightPixels x $widthPixels")
            AppLogger.log("screen -> ${calculateHeight(widthPixels)}")
            binding.imageSlider.layoutParams.height = calculateHeight(widthPixels)
            binding.imageSlider.layoutParams.width = widthPixels
        }
        Glide.with(context).load(bannerData?.foto).centerCrop().into(binding.imageSlider)
        onBannerClick()
    }

    private fun calculateHeight(width: Int): Int{
        return (width*9)/16
    }

    private fun onBannerClick() {
        binding.imageSlider.setOnClickListener {
            checkOnClickAction()
        }
    }

    private fun checkOnClickAction(){
        if (bannerData?.type_promosi == "link") {
            if (bannerData?.link_promosi?.startsWith("http") == true || bannerData?.link_promosi?.startsWith("https") == true) {
                itemView.context.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(bannerData?.link_promosi)
                    )
                )
            }
        }
        else {
            if (!bannerData?.id_merchant.isNullOrEmpty()) {
                val i = Intent(itemView.context, NewDetailMerchantActivity::class.java)
                i.putExtra("id", bannerData?.id_merchant)
                i.putExtra("id_merchant", bannerData?.id_merchant)
                i.putExtra("item_id", bannerData?.id_item)
                i.putExtra("category_id", bannerData?.category_id)
                i.putExtra(IntentKeys.filter, bannerData?.id_fitur)
                i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                itemView.context.startActivity(i)
            }
        }
    }
}