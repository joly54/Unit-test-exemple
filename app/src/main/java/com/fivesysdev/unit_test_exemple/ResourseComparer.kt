package com.fivesysdev.unit_test_exemple

import android.content.Context

class ResourseComparer {
    fun isEqual(context: Context, resId: Int, string: String): Boolean =
        context.getString(resId) == string
}