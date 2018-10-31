package com.android.mvp.app.di.component

import com.android.mvp.app.di.module.ActivityModule
import com.android.mvp.app.ui.main.MainActivity
import dagger.Component

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}