package com.fivesysdev.unit_test_exemple

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ResourseComparerTest{
    private lateinit var resourseComparer: ResourseComparer
    @Before
    fun setup(){
        resourseComparer = ResourseComparer()
    }
    @After
    fun teardown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourseComparer.isEqual(context, R.string.app_name, "Unit-test-exemple")
        assertTrue(result)
    }
    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourseComparer.isEqual(context, R.string.app_name, "Unit Test Exemple 2")
        assertFalse(result)
    }
}