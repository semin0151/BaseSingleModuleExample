package com.semin.basesinglemoduleexample.presentation.util

import android.util.Log

object Logs {
    const val TAG = "seminzzang"

    fun e(message: String) {
        Log.e(TAG, message)
    }
}