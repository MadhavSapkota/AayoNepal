package com.ourdevelops.ourjek.json.ride_request

import java.io.Serializable

class NewRideCarRequestJson : Serializable {
    var id_pelanggan : String ?= null
    var order_fitur : String ?= null
    var start_latitude : Double ?= null
    var start_longitude : Double ?= null
    var end_latitude : Double ?= null
    var end_longitude : Double ?= null
    var jarak : Double ?= null
    var harga : Double ?= null
    var alamat_asal : String ?= null
    var alamat_tujuan : String ?= null
    var pakai_wallet : Int ?= null
    var kredit_promo : String ?= null
    var estimasi : String ?= null
    var max_distance : Double ?= null
    var id_transaski : String ?= null

}