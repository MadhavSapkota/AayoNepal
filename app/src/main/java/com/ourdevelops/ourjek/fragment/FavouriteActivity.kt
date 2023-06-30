package com.ourdevelops.ourjek.fragment

import com.ourdevelops.ourjek.models.FavouriteModel
import com.ourdevelops.ourjek.utils.DatabaseHelper
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ourdevelops.ourjek.R
import androidx.recyclerview.widget.GridLayoutManager
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.databinding.ActivityFavouritesBinding
import com.ourdevelops.ourjek.item.FavouriteItem
import java.util.ArrayList

class FavouriteActivity : AppCompatActivity() {
    private var listItem =  ArrayList<FavouriteModel>()
    private var databaseHelper: DatabaseHelper? = null
    private lateinit var binding : ActivityFavouritesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavouritesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.isNestedScrollingEnabled = false
        binding.recyclerView.layoutManager = GridLayoutManager(this, 1)
        databaseHelper = DatabaseHelper(this)
        binding.imgBack.setOnClickListener {
            finish()
        }
    }

    public override fun onResume() {
        super.onResume()
        //TODO here
        val loginUser = BaseApp.getInstance(this).loginUser
        if (databaseHelper!!.getFavouriteByMyid(loginUser.id)) {
            listItem = databaseHelper!!.favourite
        }
        displayData()
    }

    private fun displayData() {
        val adapter = FavouriteItem(this, listItem, R.layout.item_grid_full)
        binding.recyclerView.adapter = adapter
        if (adapter.itemCount == 0) {
            binding.rlnodata.visibility = View.VISIBLE
        } else {
            binding.rlnodata.visibility = View.GONE
        }
    }
}