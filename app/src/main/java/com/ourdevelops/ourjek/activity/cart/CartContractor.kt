package com.ourdevelops.ourjek.activity.cart

import com.ourdevelops.ourjek.json.cart.cartResponse.CartResponse
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum

interface CartContractor {

    interface View {
        fun onCartUpdated()
        fun onCartUpdatError(errorMessage: String)

        fun onCartItemDeleted()
        fun onCartItemDeleteError(errorMessage: String)

        fun onCartDetailsSuccess(response: CartResponse)
        fun onCartDetailError(errorMessage: String)

        fun onCartCleared()
        fun onCartClearError(errorMessage: String)
        fun onEmptyCart()
    }

    interface Presenter {
        fun updateCart(qty: String, datum: Datum)
        fun deleteCartItem(idItem: String)

        fun updateCart(datum: List<Datum>)

        fun getCartDetails()

        fun deleteAllCarts(cartResponse: CartResponse)
    }
}