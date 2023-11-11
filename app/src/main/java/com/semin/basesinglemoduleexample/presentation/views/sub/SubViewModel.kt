package com.semin.basesinglemoduleexample.presentation.views.sub

import com.semin.basesinglemoduleexample.presentation.base.viewmodel.BaseViewModel
import kotlinx.coroutines.flow.StateFlow

class SubViewModel: BaseViewModel<SubEvent, SubState>() {
    override var currentEvent: SubEvent
        get() = TODO("Not yet implemented")
        set(value) {}
    override val state: StateFlow<SubState>
        get() = TODO("Not yet implemented")

    override fun changeState(current: SubState, event: SubEvent): SubState {
        TODO("Not yet implemented")
    }

}