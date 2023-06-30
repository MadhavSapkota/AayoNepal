package com.ourdevelops.ourjek.utils.appmapping

import kotlin.math.E

object AppMapping {
    val mapping = HashMap<String, String>()

    fun createMapping() {

        //User -->
        mapping[EnglishMapStrings.customer_photo] = "fotopelanggan"
        mapping[EnglishMapStrings.full_name] = "fullnama"
        mapping[EnglishMapStrings.birth_date] = "tgl_lahir"
        mapping[EnglishMapStrings.full_phonenumber] = "no_telepon"
        // <--

        //Order -->
        mapping[EnglishMapStrings.total_price] = "total_harga"
        mapping[EnglishMapStrings.distance] = "jarak"
        mapping[EnglishMapStrings.note] = "catatan"
        mapping[EnglishMapStrings.estimate_time] = "estimasi"
        mapping[EnglishMapStrings.pickup_address] = "alamat_asal"
        mapping[EnglishMapStrings.dropoff_address] = "alamat_tujuan"
        mapping[EnglishMapStrings.promo_credit] = "kredit_promo"
        // <--

        //Driver -->
        mapping[EnglishMapStrings.driver_name] = "nama_driver"
        mapping[EnglishMapStrings.driver_photo] = "foto"
        mapping[EnglishMapStrings.driver_type] = "tipe"
        mapping[EnglishMapStrings.vehicle_number] = "nomor_kendaraan"
        mapping[EnglishMapStrings.vehicle_color] = "warna"
        mapping[EnglishMapStrings.vehicle_brand] = "merek"
        // <--

        //Wallet -->
        mapping[EnglishMapStrings.time] = "waktu"
        mapping[EnglishMapStrings.ammount] = "jumlah"
        mapping[EnglishMapStrings.owner_name] = "nama_pemilik"
        // <--

        //Bank -->
        mapping[EnglishMapStrings.bank_name] = "nama_bank"
        mapping[EnglishMapStrings.bank_account] = "rekening_bank"
        // <--

        //Berita (News) -->
        mapping[EnglishMapStrings.news_photo] = "foto_berita"
        mapping[EnglishMapStrings.created_news] = "created_berita"
        mapping[EnglishMapStrings.news_id] = "id_berita"
        mapping[EnglishMapStrings.category] = "kategori"
        // <--

        //Cart Item -->
        mapping[EnglishMapStrings.item_category_id] = "id_kategori_item"
        mapping[EnglishMapStrings.item_category_name] = "nama_kategori_item"
        //

        //Category Merchant -->
        mapping[EnglishMapStrings.mercant_category_id] = "id_kategori_merchant"
        mapping[EnglishMapStrings.category_name] = "nama_kategori"
        mapping[EnglishMapStrings.category_photo] = "foto_kategori"
        // <--

        //Item -->
        mapping[EnglishMapStrings.item_name] = "nama_item"
        mapping[EnglishMapStrings.item_price] = "harga_item"
        mapping[EnglishMapStrings.item_photo] = "foto_item"
        mapping[EnglishMapStrings.item_description] = "deskripsi_item"
        mapping[EnglishMapStrings.promo_price] = "harga_promo"
        // <--

        //Item Order -->
        mapping[EnglishMapStrings.item_cost] = "jumlah_item"
        // <--

        //Home -->
        mapping[EnglishMapStrings.news_home] = "beritahome"
        mapping[EnglishMapStrings.all_feature] = "allfitur"
        mapping[EnglishMapStrings.category_merchant_home] = "kategorymerchanthome"
        mapping[EnglishMapStrings.balance] = "saldo"
        // <--

        // All Feature (AllFitur)-->
        mapping[EnglishMapStrings.feature] = "fitur"
        mapping[EnglishMapStrings.cost] = "biaya"
        mapping[EnglishMapStrings.minimum_cost] = "biaya_minimum"
        mapping[EnglishMapStrings.cost_description] = "keterangan_biaya"
        mapping[EnglishMapStrings.description] = "keterangan"
        mapping[EnglishMapStrings.discount] = "diskon"
        mapping[EnglishMapStrings.final_cost] = "biaya_akhir"
        mapping[EnglishMapStrings.max_distance] = "maks_distance"
        // <--

        // All Transaction (AllTransaksi)-->
        mapping[EnglishMapStrings.order_feature] = "order_fitur"
        mapping[EnglishMapStrings.total_cost] = "total_biaya"
        mapping[EnglishMapStrings.price] = "harga" //delivery charge for food
        mapping[EnglishMapStrings.order_start_time] = "waktu_order"
        mapping[EnglishMapStrings.order_end_time] = "waktu_selesai"
        mapping[EnglishMapStrings.use_wallet] = "pakai_wallet"
        mapping[EnglishMapStrings.total_cost] = "biaya_akhir"
        mapping[EnglishMapStrings.transaction_status] = "status_transaksi"
        // <--

        // Promo-->
        mapping[EnglishMapStrings.promo_name] = "nama_promo"
        mapping[EnglishMapStrings.promo_code] = "kode_promo"
        mapping[EnglishMapStrings.promotion_feature] = "fitur_promosi"
        mapping[EnglishMapStrings.promotion_link] = "link_promosi"
        mapping[EnglishMapStrings.promotion_type] = "type_promosi"
        // <--

        // Merchant-->
        mapping[EnglishMapStrings.merchantName] = "nama_merchant"
        mapping[EnglishMapStrings.merchant_address] = "alamat_merchant"
        mapping[EnglishMapStrings.opening_hours] = "jam_buka"
        mapping[EnglishMapStrings.closing_hours] = "jam_tutup"
        mapping[EnglishMapStrings.merchant_description] = "deskripsi_merchant"
        mapping[EnglishMapStrings.merchant_photo] = "foto_merchant"
        mapping[EnglishMapStrings.telephone_merchant] = "telepon_merchant"
        // <--

        // Transaction-->
        mapping[EnglishMapStrings.sender_name] = "nama_pengirim"
        mapping[EnglishMapStrings.sender_phone] = "telepon_pengirim"
        mapping[EnglishMapStrings.recipent_name] = "nama_penerima"
        mapping[EnglishMapStrings.recipent_phone] = "telepon_penerima"
        mapping[EnglishMapStrings.item_name_trans] = "nama_barang"
        // <--

        // -->
        mapping[EnglishMapStrings.customer_id] = "id_pelanggan"
        mapping[EnglishMapStrings.transaction_id] = "id_transaksi"
        mapping[EnglishMapStrings.get_driver_location_post] = "liat_lokasi_driver_post"
        mapping[EnglishMapStrings.feature_id] = "id_fitur"
        // <--
    }

    fun getMap() {

    }
}