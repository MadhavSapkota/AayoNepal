package com.ourdevelops.ourjek.fragment.newhome.rvitems

import android.content.Intent
import android.net.Uri
import android.os.Handler
import android.view.View
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ourdevelops.ourdriver.constants.RideResponseType
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.ride_progress.NewRideProgressActivity
import com.ourdevelops.ourjek.constants.*
import com.ourdevelops.ourjek.databinding.RowSearchingRiderBinding
import com.ourdevelops.ourjek.fragment.new_dynamic_home.NewDynamicHomeContractor
import com.ourdevelops.ourjek.fragment.newhome.NewHomeContractor
import com.ourdevelops.ourjek.service.ride_request.RideRequestDetails
import com.ourdevelops.ourjek.service.ride_request.RideRequestService

class RideSearchView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = RowSearchingRiderBinding.bind(itemView)
    private var myPosition = 0
    private var callBack: NewDynamicHomeContractor.View? = null

    fun setupViews(callBack: NewDynamicHomeContractor.View, position: Int) {
        this.callBack = callBack
        myPosition = position
        buttonClicks()
        when (AppRideStatus.currentStatus) {
            RideStatus.idle -> {
               removeRideAfterHandler()
            }
            RideStatus.searchingRider -> {
                showSearchingRider()
            }
            RideStatus.rideNotFound -> {
                showRideNotFound()
            }
            RideStatus.rideFound -> {
                showRideFound()
            }
            RideStatus.searchCancelled -> {
                showRideSearchCancelled()
            }
            RideStatus.rideCancelledByUser -> {
                removeRideAfterHandler()
            }
            RideStatus.cancelRide -> {
                removeRideAfterHandler()
            }
            RideStatus.start -> {
                showRideFound()
            }
            RideStatus.finish -> {
                removeRideAfterHandler()
            }
        }
    }

    private fun removeRideAfterHandler() {
        val handler = Handler()
        val runnable = Runnable {
            AppRideStatus.setRideIdle()
            callBack?.removeListItem(position)
        }
        handler.postDelayed(runnable, 1000)
    }

    private fun showRideSearchCancelled() {
        binding.tvSecondaryButton.visibility = View.GONE
        binding.imgClose.visibility = View.VISIBLE
        binding.image.setImageResource(AppRideStatus.placeHolder)
        setCardTextColor(R.color.white, R.color.flamingo)
        binding.progress.visibility = View.GONE
        binding.tvTitle.text = "Search Cancelled"
        binding.tvMessage.text = "Do you want to search again?"
        setButtonTextAndColors(
            R.drawable.rounded_button_gray,
            R.color.black,
            "Search Again"
        )
    }

    private fun showSearchingRider() {
        binding.imgClose.visibility = View.GONE
        binding.tvSecondaryButton.visibility = View.GONE
        binding.image.setImageResource(AppRideStatus.placeHolder)
        setCardTextColor(R.color.black, R.color.athensGray)
        binding.tvTitle.text = "Searching for a ride"
        binding.tvMessage.text = "Please wait while we find you a ride"
        binding.progress.visibility = View.VISIBLE
        setButtonTextAndColors(
            R.drawable.rounded_button_flamingo,
            R.color.white,
            "Cancel Search"
        )
    }

    private fun showRideNotFound() {
        binding.tvSecondaryButton.visibility = View.GONE
        binding.imgClose.visibility = View.VISIBLE
        binding.image.setImageResource(AppRideStatus.placeHolder)
        setCardTextColor(R.color.white, R.color.flamingo)
        binding.progress.visibility = View.GONE
        binding.tvTitle.text = "Rider not found"
        binding.tvMessage.text = "We could not find you a rider, you can try again."
        setButtonTextAndColors(
            R.drawable.rounded_button_gray,
            R.color.black,
            "Search Again"
        )
    }

    private fun showRideFound() {
        binding.imgClose.visibility = View.GONE
        binding.tvSecondaryButton.visibility = View.VISIBLE
        val riderPhoto = "${Constants.IMAGESDRIVER}${AppRideStatus.availableRider?.photo}"

        Glide.with(itemView.context)
            .load(riderPhoto)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_new_user))
            .into(binding.image)

        setCardTextColor(R.color.black, R.color.athensGray)
        val title =
            "Ongoing ride \n${AppRideStatus.availableRider?.driver_name} (${AppRideStatus.availableRider?.rating}/5)"
        val body =
            "${AppRideStatus.availableRider?.vehicle_brand} - ${AppRideStatus.availableRider?.vehicle_color} - (${AppRideStatus.availableRider?.vehicle_number})"
        binding.tvTitle.text = title
        binding.tvMessage.text = body
        binding.progress.visibility = View.GONE
        setButtonTextAndColors(R.drawable.rounded_button_blue, R.color.white, "View Detail")
    }

    private fun setButtonTextAndColors(
        backgroundDrawable: Int,
        textColor: Int,
        textString: String
    ) {
        binding.tvActionButton.setBackgroundResource(backgroundDrawable)
        binding.tvActionButton.setTextColor(ContextCompat.getColor(itemView.context, textColor))
        binding.tvActionButton.text = textString
    }

    private fun setCardTextColor(color: Int, cardColor: Int) {
        binding.tvTitle.setTextColor(ContextCompat.getColor(itemView.context, color))
        binding.tvMessage.setTextColor(ContextCompat.getColor(itemView.context, color))
        binding.cardBackground.setCardBackgroundColor(
            ContextCompat.getColor(
                itemView.context,
                cardColor
            )
        )
    }

    private fun buttonClicks() {
        binding.imgClose.setOnClickListener {
            AppRideStatus.currentStatus = RideStatus.idle
            AppRideStatus.availableRider = null
            callBack?.removeListItem(position = myPosition)
        }

        binding.tvSecondaryButton.setOnClickListener {
            if (!AppRideStatus.availableRider?.phone.isNullOrEmpty()) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:${AppRideStatus.availableRider?.phone}")
                itemView.context.startActivity(intent)
            }
        }

        binding.tvActionButton.setOnClickListener {
            when (AppRideStatus.currentStatus.name) {
                //try again//
                RideStatus.rideNotFound.name -> {
                    ContextCompat.startForegroundService(itemView.context, Intent(itemView.context, RideRequestService::class.java).apply {
                        putExtra(IntentKeys.rideDetails, RideRequestDetails.riderDetails)
                        putExtra(IntentKeys.riderList, RideRequestDetails.ridersList)
                        putExtra("isSearchingAgain", "true")
                    })
                    sendBroadCast(RideResponseType.searchAgain.name)
                }

                //view ride detail//
                RideStatus.rideFound.name -> {
                    val intent = Intent(itemView.context, NewRideProgressActivity::class.java)
                    intent.putExtra("id_driver", AppRideStatus.availableRider?.id)
                    intent.putExtra("id_transaksi", AppRideStatus.currentRideId)
                    intent.putExtra("response", "2")
                    itemView.context.startActivity(intent)
                }

                //cancel ride search//
                RideStatus.searchingRider.name -> {
                    showRideSearchCancelled()
                    sendBroadCast(RideResponseType.cancelSearch.name)
                }

                RideStatus.searchCancelled.name -> {
                    ContextCompat.startForegroundService(itemView.context, Intent(itemView.context, RideRequestService::class.java).apply {
                        putExtra(IntentKeys.rideDetails, RideRequestDetails.riderDetails)
                        putExtra(IntentKeys.riderList, RideRequestDetails.ridersList)
                        putExtra("isSearchingAgain", "true")
                    })
                    sendBroadCast(RideResponseType.searchAgain.name)
                }

            }
        }
    }

    private fun sendBroadCast(responseType : String) {
        val intent = Intent(BroadCastIntents.ActionReceiverRideUpdates)
        intent.putExtra(IntentKeys.riderResponseType, responseType)
        LocalBroadcastManager.getInstance(itemView.context).sendBroadcast(intent)
    }

}