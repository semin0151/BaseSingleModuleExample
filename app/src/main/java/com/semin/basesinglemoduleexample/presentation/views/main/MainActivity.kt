package com.semin.basesinglemoduleexample.presentation.views.main

import androidx.activity.viewModels
import com.semin.basesinglemoduleexample.R
import com.semin.basesinglemoduleexample.databinding.ActivityMainBinding
import com.semin.basesinglemoduleexample.presentation.base.activity.MVIActivity
import com.semin.basesinglemoduleexample.presentation.views.sub.SubActivity

class MainActivity :
    MVIActivity<ActivityMainBinding, MainEvent, MainState>(R.layout.activity_main) {
    override val viewModel: MainViewModel by viewModels()

    override fun render(state: MainState) {
        when {
            state.isBtnClicked -> {
                startActivity(SubActivity::class.java, null)
            }
            else -> {

            }
        }
    }

    override fun initView() {
        bind {
            viewModel = this@MainActivity.viewModel
        }
    }
}