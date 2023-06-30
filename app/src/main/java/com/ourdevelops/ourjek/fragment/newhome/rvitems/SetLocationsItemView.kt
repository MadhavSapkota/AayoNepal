package com.ourdevelops.ourjek.fragment.newhome.rvitems

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.activity.BookRideAcivity
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.databinding.RowSetLocationBinding
import com.ourdevelops.ourjek.utils.PrefsManager

class SetLocationsItemView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowSetLocationBinding.bind(itemView)
    private lateinit var prefsManager: PrefsManager

    fun initViews() {
        prefsManager = PrefsManager(itemView.context)
        if (prefsManager.getplace().isNotEmpty()) {
            binding.tvFrom.text = prefsManager.getplace()
        }

        if (prefsManager.getplace2().isNotEmpty()) {
            binding.tvTo.text = prefsManager.getplace2()
        }

        buttonClicks()
    }

    private fun buttonClicks() {
        binding.llHome.setOnClickListener {
            val intent = Intent(itemView.context, BookRideAcivity::class.java)
            intent.putExtra("destination", prefsManager.getplace())
            intent.putExtra("value", "from")
            intent.putExtra("latitude", Constants.LATITUDE.toString())
            intent.putExtra("longitude", Constants.LONGITUDE.toString())
            itemView.context.startActivity(intent)
        }


        binding.llOffice.setOnClickListener {
            val intent = Intent(itemView.context, BookRideAcivity::class.java)
            intent.putExtra("destination", prefsManager.getplace2())
            intent.putExtra("value", "to")
            intent.putExtra("latitude", Constants.LATITUDE.toString())
            intent.putExtra("longitude", Constants.LONGITUDE.toString())
            itemView.context.startActivity(intent)
        }


        binding.layoutPickLocation.setOnClickListener {
            val intent = Intent(itemView.context, BookRideAcivity::class.java)
            intent.putExtra("destination", "")
            intent.putExtra("value", "")
            intent.putExtra("latitude", Constants.LATITUDE.toString())
            intent.putExtra("longitude", Constants.LONGITUDE.toString())
            itemView.context.startActivity(intent)
        }
    }
}