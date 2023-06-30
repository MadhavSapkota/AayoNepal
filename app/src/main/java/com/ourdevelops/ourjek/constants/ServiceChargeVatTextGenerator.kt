package com.ourdevelops.ourjek.constants

object ServiceChargeVatTextGenerator {

    fun getServiceChargeVatText(vat: String?, serviceCharge: String?): String {
        return if (vat.isNullOrEmpty() && serviceCharge.isNullOrEmpty()) {
            "* All price are inclusive of Service Charge and VAT."
        } else if (vat == "0" && serviceCharge == "0") {
            "* All price are inclusive of Service Charge and VAT."

        } else if (vat != "0" && serviceCharge != "0") {
            "* $serviceCharge% Service Charge and $vat% VAT applicable."
        } else if (vat == "0" && serviceCharge != "0") {
            "* $serviceCharge% Service Charge applicable."
        } else if (vat != "0" && serviceCharge == "0") {
            "* $vat% VAT applicable."
        } else {
            ""
        }

    }

}