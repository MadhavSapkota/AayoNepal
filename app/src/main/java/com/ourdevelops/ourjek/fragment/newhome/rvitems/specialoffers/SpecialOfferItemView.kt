package com.ourdevelops.ourjek.fragment.newhome.rvitems.specialoffers

import android.content.ContentValues
import android.content.Intent
import android.os.Build
import android.text.Html
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.databinding.RowSpecialOfferItemviewBinding
import com.ourdevelops.ourjek.models.BeritaModel
import com.ourdevelops.ourjek.utils.DatabaseHelper

class SpecialOfferItemView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowSpecialOfferItemviewBinding.bind(itemView)
    private lateinit var obj: BeritaModel
    private val databaseHelper = DatabaseHelper(itemView.context)

    fun setupViews(obj: BeritaModel) {
        this.obj = obj
        val imageUrl = "${Constants.IMAGESBERITA}${obj.fotoberita}"

        Glide.with(itemView.context)
                .load(obj.fotoberita)
                .into(binding.image)

        binding.tvContent.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(obj.content, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(obj.content)
        }

        binding.tvTitle.text = obj.title
        setFavouriteIcon()

        clickListeners()

    }

    private fun setFavouriteIcon() {
        if (databaseHelper.getFavouriteById(obj.idberita.toString())) {
            binding.favourite.setColorFilter(ContextCompat.getColor(itemView.context, R.color.red))
        } else {
            binding.favourite.setColorFilter(ContextCompat.getColor(itemView.context, R.color.gray))
        }
    }

    private fun clickListeners() {
        itemView.setOnClickListener {
            val i = Intent(itemView.context, NewDetailMerchantActivity::class.java)
            i.putExtra("id", obj.idMerchant)
            i.putExtra("id_merchant", obj.idMerchant)
            itemView.context.startActivity(i)
        }

        binding.favourite.setOnClickListener {
            val fav = ContentValues()
            val loginUser = BaseApp.getInstance(itemView.context).loginUser

            if (databaseHelper.getFavouriteById(obj.idberita.toString())) {
                databaseHelper.removeFavouriteById(obj.idberita.toString())
                Toast.makeText(itemView.context, "Removed from favourites", Toast.LENGTH_SHORT).show()
            } else {
                fav.put(DatabaseHelper.KEY_ID, obj.idberita)
                fav.put(DatabaseHelper.KEY_USERID, loginUser.id)
                fav.put(DatabaseHelper.KEY_TITLE, obj.title)
                fav.put(DatabaseHelper.KEY_CONTENT, obj.content)
                fav.put(DatabaseHelper.KEY_KATEGORI, obj.kategori)
                fav.put(DatabaseHelper.KEY_IMAGE, obj.fotoberita)
                databaseHelper.addFavourite(DatabaseHelper.TABLE_FAVOURITE_NAME, fav, null)
                Toast.makeText(itemView.context, "Added to favourites", Toast.LENGTH_SHORT).show()
            }
            setFavouriteIcon()
        }
    }

}