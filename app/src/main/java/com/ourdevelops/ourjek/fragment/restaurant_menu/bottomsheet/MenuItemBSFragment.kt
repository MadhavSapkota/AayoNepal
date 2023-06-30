package com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.FragmentMenuItemBsBinding
import com.ourdevelops.ourjek.models.ItemModel
import com.ourdevelops.ourjek.utils.Utility

class MenuItemBSFragment : BottomSheetDialogFragment(), MenuItemContractor.View {
    private lateinit var presenter: MenuItemPresenter
    private lateinit var binding: FragmentMenuItemBsBinding
    private lateinit var obj: ItemModel
    private var restaurantId = "0"
    private var currentQuantity = 1
    private var fragment: Fragment? = null
    private var callBack: MenuFragCartIconCheck? = null
    private var itemPrice = "0"
    private var id_fitur: String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        setStyle(DialogFragment.STYLE_NORMAL, R.style.AppBottomSheetDialogTheme)
        binding = FragmentMenuItemBsBinding.inflate(inflater, container, false)
//        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle)
//        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        receivingBundles()
        presenter = MenuItemPresenter(requireContext(), this, callBack)
        return binding.root
    }

    fun setInterface(callback: MenuFragCartIconCheck?){
        this.callBack = callback
    }

    private fun receivingBundles() {
        obj = arguments?.getSerializable("obj") as ItemModel
        restaurantId = arguments?.getString("restaurantId")!!
        id_fitur = arguments?.getString("id_fitur")!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment = this
        loadDataToViews()
        quantityListener()
        buttonClicks()
    }

    private fun loadDataToViews() {
        binding.tvTitle.text = obj.nama_item
        if (obj.deskripsi_item.isNullOrEmpty()) {
            binding.tvDetails.visibility = View.GONE
        } else {
            binding.tvDetails.text = obj.deskripsi_item
        }

        itemPrice = if (obj.status_promo == "1") {
            obj.harga_promo
        }
        else {
            obj.harga_item
        }

        Utility.currencyTXT(binding.tvMainPrice, itemPrice, context)
        setPriceWithQuantity()
    }

    private fun quantityListener() {
        binding.quantityPicker.setOnValueChangeListener { view, oldValue, newValue ->
            currentQuantity = newValue
            setPriceWithQuantity()
        }
    }

    private fun setPriceWithQuantity() {
        val newPrice = itemPrice.toDouble() * currentQuantity
        Utility.currencyTXT(binding.tvPrice, newPrice.toString(), context)
    }

    private fun buttonClicks() {
        binding.btnAddToCart.setOnClickListener {
            presenter.addToCart(obj, restaurantId.toInt(), currentQuantity, binding.etNotes.text.toString(), id_fitur)
        }
    }

    override fun onAddedToCart() {
        dialog?.dismiss()
    }


}