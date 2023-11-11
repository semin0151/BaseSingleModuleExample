package com.semin.basesinglemoduleexample.presentation.views.main

sealed class MainEvent {
    object None : MainEvent()
    object ButtonClick: MainEvent()
}