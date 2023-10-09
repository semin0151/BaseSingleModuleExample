package com.semin.basesinglemoduleexample.presentation.base.activity

interface Splash {
    fun initSplash(nextProcess: (() -> Unit)?)
    fun startSplashScreen()
    fun setOnSplashScreen(nextProcess: (() -> Unit)?)
}