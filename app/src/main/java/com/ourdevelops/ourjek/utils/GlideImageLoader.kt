package com.ourdevelops.ourjek.utils

import android.content.Context
import android.graphics.drawable.Drawable

import android.graphics.Bitmap
import android.net.Uri

import androidx.annotation.Nullable

import com.bumptech.glide.request.target.CustomTarget

import com.bumptech.glide.Glide
import com.bumptech.glide.request.transition.Transition

interface GlideImageCallBack {
    fun onImageReady(bmp : Bitmap?)
}

class GlideImageLoader {

    fun getBitmapAsyncAndDoWork(imageUrl: String?, context : Context, callBack : GlideImageCallBack)  {
        val bitmap = arrayOf<Bitmap?>(null)
        Glide.with(context)
            .asBitmap()
            .load(imageUrl)
            .into(object : CustomTarget<Bitmap?>() {
                override fun onResourceReady(
                    resource: Bitmap,
                    @Nullable transition: Transition<in Bitmap?>?
                ) {
                    bitmap[0] = resource
                    callBack.onImageReady(bitmap[0])

                }

                override fun onLoadCleared(@Nullable placeholder: Drawable?) {

                }
            })
    }
}