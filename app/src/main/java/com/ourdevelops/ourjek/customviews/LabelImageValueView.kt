package com.ourdevelops.ourjek.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.LayoutLabelImageValueBinding

class LabelImageValueView : RelativeLayout {
    lateinit var binding: LayoutLabelImageValueBinding

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.LabelImageValueView)
        binding = LayoutLabelImageValueBinding.inflate(LayoutInflater.from(context), this, true)

        binding.tvLabel.text = typedArray.getString(R.styleable.LabelImageValueView_labelText)
        binding.tvValue.text = typedArray.getString(R.styleable.LabelImageValueView_valueHint)
        binding.icon.setImageResource(typedArray.getResourceId(R.styleable.LabelImageValueView_drawableImage, R.drawable.ic_bell))

        init(context)
        typedArray.recycle()
    }

    private fun init(context: Context) {

    }

    fun setupViews(value: String?) {
        if (!value.isNullOrBlank()) {
            binding.tvValue.text = value
        }

    }


}