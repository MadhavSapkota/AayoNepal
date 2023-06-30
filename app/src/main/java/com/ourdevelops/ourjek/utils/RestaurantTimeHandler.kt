package com.ourdevelops.ourjek.utils

import java.sql.Timestamp
import java.util.*

class RestaurantTimeHandler {
    lateinit var deliveryTime: Date
    lateinit var restaurantTime: Date
    lateinit var openTime: Date
    lateinit var closeTime: Date

    fun showTime(){
        val cal = Calendar.getInstance(TimeZone.getTimeZone("NPT"))
        cal.set(Calendar.HOUR_OF_DAY, 0)
        cal.set(Calendar.MINUTE, 0)
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)
    }

    fun setAsapDeliveryTime(): String{
        val calDummy = Calendar.getInstance().time
        val cal = Calendar.getInstance()
        cal.set(Calendar.HOUR, calDummy.hours-11)
        cal.set(Calendar.MINUTE, calDummy.minutes) //60 -45 minss
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)
        AppLogger.log("asap : ${cal.time} -> $calDummy")
        setDelivertTime(cal.time)
        return cal.time.hours.toString() +":"+cal.time.minutes.toString()
    }

    fun setOpeningHour(open: Date){
        val calDummy = Calendar.getInstance()
        calDummy.time = open
        val calOpen = Calendar.getInstance()
        calOpen.set(Calendar.HOUR, calDummy.time.hours-12)
        calOpen.set(Calendar.MINUTE, calDummy.time.minutes)
        calOpen.set(Calendar.SECOND, calDummy.time.seconds)
        AppLogger.log("open : ${calDummy.time} -> ${calOpen.time}")
        openTime = calOpen.time
    }

    fun setClosingHour(close: Date){
        val calDummy = Calendar.getInstance()
        calDummy.time = close
        val calClose = Calendar.getInstance()
        calClose.set(Calendar.HOUR, calDummy.time.hours-12)
        calClose.set(Calendar.MINUTE, calDummy.time.minutes)
        calClose.set(Calendar.SECOND, calDummy.time.seconds)
        AppLogger.log("close : ${calDummy.time} -> ${calClose.time}")
        closeTime = calClose.time
    }

    fun setDelivertTime(delivery: Date){
        val calDummy = Calendar.getInstance()
        calDummy.time = delivery
        val calDeliver = Calendar.getInstance()
        calDeliver.set(Calendar.HOUR, calDummy.time.hours-12)
        calDeliver.set(Calendar.MINUTE, calDummy.time.minutes)
        calDeliver.set(Calendar.SECOND, calDummy.time.seconds)
        AppLogger.log("delivery : ${calDummy.time} -> ${calDeliver.time}")
        deliveryTime = calDeliver.time
    }

    fun checkSelectedDeliveryTime(): Boolean{
        return deliveryTime.after(openTime) && deliveryTime.before(closeTime)
    }

    fun isRestaurantOpen(date: Date) : Boolean{
        val calDummy = Calendar.getInstance()
        calDummy.time = date
        val calRestaurant = Calendar.getInstance()
        calRestaurant.set(Calendar.HOUR, calDummy.time.hours-12)
        calRestaurant.set(Calendar.MINUTE, calDummy.time.minutes)
        calRestaurant.set(Calendar.SECOND, calDummy.time.seconds)
        restaurantTime = calRestaurant.time
        AppLogger.log("restaurant : $openTime -> $closeTime -> $restaurantTime -> ${restaurantTime.after(openTime)} -> ${restaurantTime.before(closeTime)}")
        return restaurantTime.after(openTime) && restaurantTime.before(closeTime)
    }
}