package com.ourdevelops.ourjek.activity.logistic.holders

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.*
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel
import com.ourdevelops.ourjek.databinding.LogisticDropDownDialogBinding

object LogisticDropDownDialog {
    private lateinit var dialog: Dialog
    private lateinit var binding: LogisticDropDownDialogBinding
    private var position = 0

    fun showDialog(context: Context, mList: ArrayList<LogisticWeightModel>, callback: DialogButtonClick){
        binding = LogisticDropDownDialogBinding.inflate(LayoutInflater.from(context))
        dialog = Dialog(context, R.style.AppTheme_PopTheme)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(binding.root)

        setUpSpinner(context, mList)

        binding.selectWeight.setOnClickListener{
            binding.weightSpinner.performClick()
        }

        binding.cvClose.setOnClickListener{
            dialog.dismiss()
        }

        binding.btnWeightConfirm.setOnClickListener {
            callback.onConfirm(position)
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun setUpSpinner(context: Context, mList: ArrayList<LogisticWeightModel>) {

        val adapter = WeightCustomAdapter(context, mList)
        binding.weightSpinner.adapter = adapter

        binding.weightSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, i: Int, p3: Long) {
                binding.weightText.text = "${mList[i].weight} - Extra Rs.${mList[i].price}"
                position = i
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    interface DialogButtonClick{
        fun onConfirm(position: Int)
    }
}