package com.ourdevelops.ourjek.activity.riderequest.managers

interface RideRequestInterface {

    fun inflateSetLocationFragment(state: RideFragmentState, type: String)

    fun inflateInitialFragment()

    fun showRideConfirmationPage()

    fun onCameraMove()

    fun onCameraIdle()

    fun onMapRouteResponse(success : Boolean, json : String?)

    fun checkPermission()
    fun onConfirmClick(distance: Double, timeDistance: String) {}

}