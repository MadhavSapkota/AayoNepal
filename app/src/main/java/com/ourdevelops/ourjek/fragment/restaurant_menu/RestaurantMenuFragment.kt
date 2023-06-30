package com.ourdevelops.ourjek.fragment.restaurant_menu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mikepenz.fastadapter.adapters.FastItemAdapter
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogCart
import com.ourdevelops.ourjek.databinding.FragmentRestaurantMenuBinding
import com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuFragCartIconCheck
import com.ourdevelops.ourjek.fragment.restaurant_menu.bottomsheet.MenuItemBSFragment
import com.ourdevelops.ourjek.item.ItemItem
import com.ourdevelops.ourjek.models.ItemModel
import com.ourdevelops.ourjek.models.PesananMerchant
import com.ourdevelops.ourjek.utils.CartChecker
import io.realm.Realm
import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList

class RestaurantMenuFragment : Fragment(), ItemItem.OnCalculatePrice, RestaurantMenuContractor.View {
    private lateinit var presenter: RestaurantMenuPresenter
    private var binding: FragmentRestaurantMenuBinding? = null
    private var menuFragCartIconCheck: MenuFragCartIconCheck? = null
    private var realm: Realm? = null
    private var menuList = ArrayList<ItemModel>()
    private var quantity = 0
    private var cost: Long = 0
    var rid: String? = null
    var merchant_id: String? = null
    private var latitude: String? = null
    private var longitude: String? = null
    private var categoryId: String? = null
    private var itemId: String? = null
    private var id_fitur: String? = null
    private lateinit var adapter: RestaurantMenuAdapter


    fun setInterface(callback: MenuFragCartIconCheck?) {
        menuFragCartIconCheck = callback
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        realm = Realm.getDefaultInstance()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        presenter = RestaurantMenuPresenter(activity?.applicationContext!!, this)
        binding = FragmentRestaurantMenuBinding.inflate(inflater, container, false)
        val merchantItems = arguments
        rid = merchantItems!!.getString("res_id")
        categoryId = merchantItems.getString("cat_id")
        latitude = merchantItems.getString("lat")
        longitude = merchantItems.getString("lng")
        merchant_id = merchantItems.getString("merchant_id")
        itemId = merchantItems.getString("item_id")
        id_fitur = merchantItems.getString("id_fitur")

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        requestData()
    }

    private fun setupViews() {
        binding?.merchantnear?.layoutManager = LinearLayoutManager(activity?.applicationContext)
        adapter = RestaurantMenuAdapter(menuList, this, itemId)
        binding?.merchantnear?.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    private fun requestData() {
        progressshow()
        presenter.requestData(latitude, longitude, rid, categoryId)
    }

    private fun progressshow() {
        binding!!.merchantnear.visibility = View.GONE
        binding!!.rlprogress.visibility = View.VISIBLE
    }

    private fun progresshide() {
        binding!!.merchantnear.visibility = View.VISIBLE
        binding!!.rlprogress.visibility = View.GONE
    }

    @SuppressLint("SetTextI18n")
    override fun calculatePrice() {
        val existingFood: List<PesananMerchant> = realm!!.where(PesananMerchant::class.java).findAll()
        for (p in existingFood.indices) {
            quantity += Objects.requireNonNull(existingFood[p]).qty
            cost += Objects.requireNonNull(existingFood[p]).totalHarga
        }
    }

    private fun sheetlist(position: Int) {
        val bundle = Bundle()
        bundle.putSerializable("obj", menuList[position] as Serializable)
        bundle.putString("restaurantId", rid)
        bundle.putString("id_fitur", id_fitur)
        val fragment = MenuItemBSFragment()
        fragment.arguments = bundle
        fragment.setInterface(menuFragCartIconCheck)
        fragment.show(childFragmentManager, fragment.tag)
    }

    companion object {
        @JvmStatic
        fun newInstance(): RestaurantMenuFragment {
            val fragment = RestaurantMenuFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onResponseSuccess(response: ArrayList<ItemModel>) {
        progresshide()
        menuList.clear()
        menuList.addAll(response)
        adapter.notifyDataSetChanged()
    }

    override fun onResponseError(errorMessage: String) {
        progresshide()
    }

    override fun onItemClicked(position: Int) {
        if (!CartChecker().checkCart(rid!!.toInt())) {
            sheetlist(position)
        } else {
            CustomDialogCart()
                    .showYesDialog(activity!!, object : CustomDialogCart.dialogOnClickListener {
                        override fun onClose() {
                            progresshide()
                        }

                        override fun onClick() {
                            startActivity(Intent(context, NewDetailOrderActivity::class.java))
                        }
                    })
        }
    }

    override fun onItemFound(position: Int) {
        binding?.merchantnear?.smoothScrollToPosition(position)
        binding?.merchantnear?.nextFocusUpId = position
    }
}