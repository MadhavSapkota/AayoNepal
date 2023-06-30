package com.ourdevelops.ourjek.fragment.new_dynamic_home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity
import com.ourdevelops.ourjek.activity.new_merchant.NewMerchantActivity
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_holders.*
import com.ourdevelops.ourjek.fragment.new_dynamic_home.item_models.*
import com.ourdevelops.ourjek.fragment.newhome.rvitems.CartAvailableItemView
import com.ourdevelops.ourjek.fragment.newhome.rvitems.RideSearchView
import com.ourdevelops.ourjek.fragment.newhome.rvitems.SpaceView
import com.ourdevelops.ourjek.models.MerchantNearModel
import com.ourdevelops.ourjek.models.NewDynamicHomeModel
import kotlin.collections.ArrayList

class NewDynamicHomeAdapter(
        private val newDynamicHomeData: ArrayList<NewDynamicHomeModel>?,
        private val context: Context?,
        private val view: NewDynamicHomeContractor.View,
        val presenter: NewDynamicHomePresenter
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val GREETINGS = 0
    private val SERVICES = 1
    private val SEARCH = 2
    private val BANNER_SINGLE = 3
    private val SLIDER = 4
    private val GRID_ITEM = 5
    private val HORIZONTAL_LIST = 6
    private val VERTICAL_LIST = 7
    private val RESTAURANT_LIST = 8
    private val CART = 9
    private val RIDE = 10
    private val TITLE_VIEW = 11
    private val SPACE = 12

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            GREETINGS -> GreetingView(inflater.inflate(R.layout.greeting_view, parent, false))

            SERVICES -> ServicesView(inflater.inflate(R.layout.services_view, parent, false))

            SEARCH -> SearchView(inflater.inflate(R.layout.search_view, parent, false))

            HORIZONTAL_LIST -> HorizontalView(
                inflater.inflate(
                    R.layout.horizontal_view,
                    parent,
                    false
                )
            )

            SLIDER -> SliderView(inflater.inflate(R.layout.slider_view, parent, false))

//            VERTICAL_LIST -> VerticalView(inflater.inflate(R.layout.vertical_view, parent, false))

            RESTAURANT_LIST -> RestaurantView(
                inflater.inflate(
                    R.layout.restaurant_view,
                    parent,
                    false
                )
            )

            BANNER_SINGLE -> BannerView(inflater.inflate(R.layout.banner_view, parent, false))

            GRID_ITEM -> GridView(inflater.inflate(R.layout.grid_view, parent, false))

            CART -> CartAvailableItemView(
                inflater.inflate(
                    R.layout.row_cart_available_home,
                    parent,
                    false
                )
            )

            RIDE -> RideSearchView(inflater.inflate(R.layout.row_searching_rider, parent, false))

            TITLE_VIEW -> TitleView(inflater.inflate(R.layout.title_view, parent, false))

            else -> SpaceView(inflater.inflate(R.layout.row_space, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val mainData = newDynamicHomeData?.get(position)
        when (holder) {
            is GreetingView -> {
                holder.setupViews(
                    GreetingModel().apply {
                        init(mainData)
                    })
            }

            is ServicesView -> {
                if (!mainData?.services.isNullOrEmpty()) {
                    holder.setUpView(mainData?.services as ArrayList<ServicesModel>, presenter)
                }
            }

            is SearchView -> {
                holder.apply {
                    setUpView(SearchModel().apply { init(mainData) })
                    itemView.setOnClickListener {
                        val i = Intent(itemView.context, NewMerchantActivity::class.java)
                        i.putExtra(IntentKeys.filter, 5)
                        i.putExtra("search", true)
                        itemView.context.startActivity(i)
                    }
                }
            }

            is CartAvailableItemView -> {
                holder.itemView.setOnClickListener {
                    val i = Intent(holder.itemView.context, NewDetailOrderActivity::class.java)
                    i.putExtra("lat", 0.0)
                    i.putExtra("lon", 0.0)
                    i.putExtra("name", "")
                    holder.itemView.context.startActivity(i)
                }
            }

            is RideSearchView -> {
                holder.setupViews(view, position)
            }

            is HorizontalView -> {
                if (!mainData?.horizontal.isNullOrEmpty()) {
                    holder.setUpView(
                        mainData?.horizontal as ArrayList<HorizontalModel>,
                        mainData.title,
                        mainData.caption
                    )
                }
            }

            is TitleView -> {
                holder.setUpView(mainData?.title, mainData?.caption)
            }

//            is VerticalView -> {
//                mainData?.vertical?.forEach { i ->
//                    holder.setUpView(i)
//                }
//            }

            is BannerView -> {
                if (!mainData?.banner.isNullOrEmpty()) {
                    holder.setUpView(mainData?.banner as ArrayList<BannerSingleModel>, context!!)
                }
            }

            is SliderView -> {
                if (!mainData?.slider.isNullOrEmpty()) {
                    holder.setupView(mainData?.slider as ArrayList<SliderModel>, mainData.title)
                }
            }

            is RestaurantView -> {
                holder.setUpView(mainData?.restaurantItems)
            }

            is GridView -> {
                if (!mainData?.grid.isNullOrEmpty()) {
                    holder.setUpView(mainData?.grid, mainData?.title, mainData?.caption)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return newDynamicHomeData!!.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (newDynamicHomeData!![position].type) {
            NewDynamicHomeViewTypes.GREETING -> GREETINGS
            NewDynamicHomeViewTypes.SERVICES -> checkIfItemExists(newDynamicHomeData[position].services?.count(), SERVICES)
            NewDynamicHomeViewTypes.SEARCH -> SEARCH
            NewDynamicHomeViewTypes.BANNER_SINGLE -> checkIfItemExists(newDynamicHomeData[position].banner?.count(), BANNER_SINGLE)
            NewDynamicHomeViewTypes.SLIDER -> checkIfItemExists(newDynamicHomeData[position].slider?.count(), SLIDER)
            NewDynamicHomeViewTypes.GRID_ITEM -> checkIfItemExists(newDynamicHomeData[position].grid?.count(), GRID_ITEM)
            NewDynamicHomeViewTypes.CART_VIEW -> CART
            NewDynamicHomeViewTypes.RIDE_SEARCH_VIEW -> RIDE
            NewDynamicHomeViewTypes.HORIZONTAL_LIST -> checkIfItemExists(newDynamicHomeData[position].horizontal?.count(), HORIZONTAL_LIST)
            NewDynamicHomeViewTypes.VERTICAL_LIST -> checkIfItemExists(newDynamicHomeData[position].vertical?.count(), VERTICAL_LIST)
            NewDynamicHomeViewTypes.RESTAURANT_LIST -> RESTAURANT_LIST
            NewDynamicHomeViewTypes.TITLE_VIEW -> TITLE_VIEW
            else -> SPACE
        }
    }

    private fun checkIfItemExists(count: Int?, requiredView: Int): Int{
        return if (count != null) {
            if(count>0){
                requiredView
            } else{
                SPACE
            }
        }else{
            SPACE
        }

    }
}