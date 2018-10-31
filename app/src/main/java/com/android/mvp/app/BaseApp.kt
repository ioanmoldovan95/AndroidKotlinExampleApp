package com.android.mvp.app

import android.app.Application
import com.android.mvp.app.di.component.ApplicationComponent
import com.android.mvp.app.di.component.DaggerApplicationComponent
import com.android.mvp.app.di.module.ApplicationModule


class BaseApp: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}