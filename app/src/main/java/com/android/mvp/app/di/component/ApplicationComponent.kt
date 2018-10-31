package com.android.mvp.app.di.component

import com.android.mvp.app.BaseApp
import com.android.mvp.app.di.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

}