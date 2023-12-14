package com.fivesysdev.unit_test_exemple

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class Schedule(
    val days: List<Day>
) {
    private fun getCurrentDate(): String {
        val sdf = SimpleDateFormat("dd.MM", Locale.getDefault())
        return sdf.format(Date())
    }

    val currentDay: Day?
        get() {
            return days.find { it.date == getCurrentDate() }
        }
}
