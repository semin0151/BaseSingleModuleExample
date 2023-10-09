package com.semin.basesinglemoduleexample

import android.app.Application

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}