package com.ourdevelops.ourjek.activity.logistic.holders

import android.content.Context
import android.text.Editable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.LogisticUserDetailViewBinding

class UserDetailView : RelativeLayout {

    private lateinit var binding: LogisticUserDetailViewBinding

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    fun init(context: Context, attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.LogisticUserDetailView)
        binding = LogisticUserDetailViewBinding.inflate(LayoutInflater.from(context), this, true)

        binding.detailTitle.text = typedArray.getString(R.styleable.LogisticUserDetailView_detailTitle)
        binding.name.hint = typedArray.getString(R.styleable.LogisticUserDetailView_nameHint)
        binding.number.hint = typedArray.getString(R.styleable.LogisticUserDetailView_phoneHint)
    }

    fun getName(): String{
        return binding.name.text.toString()
    }

    fun setName(text: String){
        return binding.name.setText(text)
    }

    fun setNumber(text: String){
        return binding.number.setText(text)
    }

    fun getNumber(): String{
        return binding.number.text.toString()
    }

    fun nameValueEmpty(text: String){
        binding.nameIncorrect.text = text
        binding.nameIncorrect.visibility = VISIBLE
    }

    fun nameValueNotEmpty(){
        binding.nameIncorrect.visibility = INVISIBLE
    }

    fun numberIsCorrect(){
        binding.numberIncorrect.visibility = INVISIBLE
    }

    fun numberValueEmptyOrWrong(text: String){
        binding.numberIncorrect.text = text
        binding.numberIncorrect.visibility = VISIBLE
    }
}