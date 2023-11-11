package com.semin.basesinglemoduleexample.presentation.views.sub

import androidx.activity.viewModels
import com.semin.basesinglemoduleexample.R
import com.semin.basesinglemoduleexample.databinding.ActivitySubBinding
import com.semin.basesinglemoduleexample.presentation.base.activity.MVIActivity

class SubActivity : MVIActivity<ActivitySubBinding, SubEvent, SubState>(R.layout.activity_sub) {
    override val viewModel: SubViewModel by viewModels()

    override fun render(state: SubState) {
        TODO("Not yet implemented")
    }

    override fun initView() {
        TODO("Not yet implemented")
    }
}