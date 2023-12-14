package com.fivesysdev.unit_test_exemple

import com.fivesysdev.unit_test_exemple.Retrofit.RetrofitClient
import junit.framework.TestCase.assertNull
import kotlinx.coroutines.runBlocking
import org.junit.Test
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ScheduleTest{
    @Test
    fun `current date should return null when schedule is empty`(){
        val schedule = Schedule(emptyList())
        assertNull(schedule.currentDay)
    }
    @Test
    fun `should return correct current day`() = runBlocking {
        val days = RetrofitClient.apiService.getSchedule()
        val schedule = Schedule(days)
        val currentday = schedule.currentDay

        assert(days.find{it.date == currentDay()} == currentday)
    }
    @Test
    fun `should return null when current day is not found`() = runBlocking {
        val schedule = Schedule(emptyList())
        val currentday = schedule.currentDay

        assertNull(currentday)
    }
    private fun currentDay(): String {
        val sdf = SimpleDateFormat("dd.MM", Locale.getDefault())
        return sdf.format(Date())
    }
}