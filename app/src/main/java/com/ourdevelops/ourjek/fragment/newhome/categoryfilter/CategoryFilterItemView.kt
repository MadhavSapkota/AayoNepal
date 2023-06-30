package com.ourdevelops.ourjek.fragment.newhome.categoryfilter

import android.content.Intent
import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.activity.logistic.LogisticActivity
import com.ourdevelops.ourjek.activity.logistic.data.LogisticDataModel
import com.ourdevelops.ourjek.activity.riderequest.NewRiderRequestActivity
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogOkay
import com.ourdevelops.ourjek.databinding.RowCategoryFilterItemviewBinding
import com.ourdevelops.ourjek.models.NewAllFeatureModel
import com.ourdevelops.ourjek.utils.PrefsManager

class CategoryFilterItemView(itemView: View, val activity: FragmentActivity?) : RecyclerView.ViewHolder(itemView) {
    val binding = RowCategoryFilterItemviewBinding.bind(itemView)
    private lateinit var obj: NewAllFeatureModel

    fun setupViews(obj: NewAllFeatureModel) {
        this.obj = obj
        binding.tvItem.text = obj.fitur

        val imageUrl = "${Constants.IMAGESFITUR}${obj.icon}"
        Glide.with(itemView.context)
                .load(imageUrl)
                .into(binding.image)

        clickHandler()
    }

    private fun clickHandler() {
        if (obj.home != "1") {
            if (obj.home == "2") {
                itemView.setOnClickListener {
                    val data = LogisticDataModel()
                    data.init(obj)
                    if(data.delivery_type.isNullOrEmpty()){
                        CustomDialogOkay.apply {
                            setTitle("Oh no!")
                            setMessage("It seems the service is not functional right now..")
                                    .showOnlyDialog(activity!!, object : CustomDialogOkay.dialogOnClickListener{
                                        override fun onClick() {
                                            dismiss()
                                        }

                                        override fun onClose() {
                                            dismiss()
                                        }
                                    })
                        }
                    }else{
                        itemView.context.startActivity(Intent(itemView.context, LogisticActivity::class.java).apply {
                            putExtra("allData", data)
                        })
                    }
                    // old logistic ->
//                    val i = Intent(itemView.context, SendActivity::class.java)
//                    i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
//                    i.putExtra("FiturKey", obj.idFitur)
//                    i.putExtra("job", obj.job)
//                    i.putExtra("icon", obj.icon)
//                    itemView.context.startActivity(i)
                }
            }
        } else {
            itemView.setOnClickListener {
                if (PrefsManager(itemView.context).getplace().isEmpty() || PrefsManager(itemView.context).getplace2().isEmpty()) {
                    openRiderRequestPage()
//                    val i = Intent(itemView.context, RideCarActivity::class.java)
//                    i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
//                    i.putExtra("FiturKey", obj.idFitur)
//                    i.putExtra("job", obj.job)
//                    i.putExtra("icon", obj.icon)
//                    itemView.context.startActivity(i)
                } else {
                    openRiderRequestPage()
//                    val i = Intent(itemView.context, NewRideCarActivity::class.java)
//                    i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
//                    i.putExtra("FiturKey", obj.idFitur)
//                    i.putExtra("job", obj.job)
//                    i.putExtra("icon", obj.icon)
//                    itemView.context.startActivity(i)
                }
            }
        }
    }

    fun openRiderRequestPage() {
        val intent = Intent(itemView.context, NewRiderRequestActivity::class.java)
        intent.putExtra("allData", obj)
        itemView.context.startActivity(intent)
    }
}