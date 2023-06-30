package com.ourdevelops.ourjek.utils

import com.ourdevelops.ourjek.models.PesananMerchant
import io.realm.Realm
import io.realm.RealmResults

class CartChecker {

    fun checkCart(restaurantId: Int?): Boolean {
        var result = false
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction { realm ->
            val realmResult: RealmResults<PesananMerchant> = realm.where(PesananMerchant::class.java).findAll()
            if (realmResult.size > 0) {
                result = realmResult[0]?.restaurant_id != restaurantId
            } else {
                result = false
            }
        }
        return result
    }
}