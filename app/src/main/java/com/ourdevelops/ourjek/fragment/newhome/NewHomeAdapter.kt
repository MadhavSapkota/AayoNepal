package com.ourdevelops.ourjek.fragment.newhome

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.allmerchant.AllMerchantActivity
import com.ourdevelops.ourjek.activity.cart.NewDetailOrderActivity
import com.ourdevelops.ourjek.constants.IntentKeys
import com.ourdevelops.ourjek.fragment.newhome.rvitems.*
import com.ourdevelops.ourjek.fragment.newhome.rvitems.homecategory.HomeCategoriesView
import com.ourdevelops.ourjek.fragment.newhome.rvitems.specialoffers.SpecialOffersView
import com.ourdevelops.ourjek.models.BeritaModel
import com.ourdevelops.ourjek.models.MerchantNearModel
import com.ourdevelops.ourjek.models.PromoModel
import com.ourdevelops.ourjek.models.VehicleModel
import com.ourdevelops.ourjek.models.home.HomeViewType
import com.ourdevelops.ourjek.models.home.NewHomeModel

class NewHomeAdapter(val mlist: ArrayList<NewHomeModel>, var callBack: NewHomeContractor.View) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val pickLocationView = 0
    private val categoryView = 1
    private val featuredRestaurantsView = 2
    private val specialOffersView = 3
    private val spaceView = 4
    private val cartView = 5
    private val helloView = 6
    private val restaurantItem = 7
    private val itemTitle = 8
    private val searchView = 9
    private val rideSearchView = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            pickLocationView -> SetLocationsItemView(inflater.inflate(R.layout.row_set_location, parent, false))

            helloView -> HelloUserView(inflater.inflate(R.layout.row_hello_user, parent, false))

            categoryView -> HomeCategoriesView(inflater.inflate(R.layout.row_home_categories, parent, false))

            featuredRestaurantsView -> FeaturedRestaurantsSliderView(inflater.inflate(R.layout.row_featured_restaurants_slider, parent, false))

            specialOffersView -> SpecialOffersView(inflater.inflate(R.layout.row_special_offers, parent, false))

            cartView -> CartAvailableItemView(inflater.inflate(R.layout.row_cart_available_home, parent, false))

            restaurantItem -> RestaurantItemView(inflater.inflate(R.layout.row_home_restaurant_item, parent, false))

            itemTitle -> HomeTitleView(inflater.inflate(R.layout.row_home_title_view, parent, false))

            searchView -> HomeSearchView(inflater.inflate(R.layout.row_home_search, parent, false))

            rideSearchView -> RideSearchView(inflater.inflate(R.layout.row_searching_rider, parent, false))

            else -> SpaceView(inflater.inflate(R.layout.row_space, parent, false))
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HelloUserView -> holder.setupViews()

            is SetLocationsItemView -> holder.initViews()

            is HomeCategoriesView -> holder.setupViews(mlist[position].data?.data as ArrayList<VehicleModel>, callBack)

            is FeaturedRestaurantsSliderView -> holder.setupViews(mlist[position].data?.data as ArrayList<PromoModel>)

            is SpecialOffersView -> {
                holder.setupViews(mlist[position].data?.data as ArrayList<BeritaModel>)
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

            is RestaurantItemView -> holder.setupViews(mlist[position].data?.data as MerchantNearModel)

            is HomeSearchView -> {
                holder.itemView.setOnClickListener {
                    val intent = Intent(holder.itemView.context, AllMerchantActivity::class.java)
                    intent.putExtra(IntentKeys.filter, 5)
                    holder.itemView.context.startActivity(intent)
                }
            }

            is RideSearchView -> {
//                holder.setupViews(callBack, position)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (mlist[position].viewType) {
            HomeViewType.PICK_LOCATION -> pickLocationView
            HomeViewType.CATEGORY -> categoryView
            HomeViewType.FEATURED_RESTAURANTS -> featuredRestaurantsView
            HomeViewType.SPECIAL_OFFERS -> specialOffersView
            HomeViewType.SPACE -> spaceView
            HomeViewType.CART_VIEW -> cartView
            HomeViewType.HELLO_VIEW -> helloView
            HomeViewType.RESTAURANT_ITEM -> restaurantItem
            HomeViewType.ITEM_TITLE -> itemTitle
            HomeViewType.SEARCH -> searchView
            HomeViewType.RIDE_SEARCH_VIEW -> rideSearchView
            else -> pickLocationView
        }
    }



    override fun getItemCount(): Int {
        return mlist.size
    }
}