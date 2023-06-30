package com.ourdevelops.ourjek.constants


object VibrationPatterns {

    fun getIncomingCallVibrationPattern(): ArrayList<Long> {
        val singleVibrate: Long = 1000
        val shortVibrate : Long = 200
        val mediumVibrate : Long = 500
        val leastVibrate : Long = 100
        val vibratePatterns = ArrayList<Long>()
        for (i in 0..120) {
            when {
                i % 4 == 0 -> {
                    vibratePatterns.add(leastVibrate)
                }
                i % 3 == 0 -> {
                    vibratePatterns.add(shortVibrate)
                }
                i % 2 == 0 -> {
                    vibratePatterns.add(mediumVibrate)
                }
                else -> {
                    vibratePatterns.add(singleVibrate)
                }
            }

        }
        return vibratePatterns
    }

}