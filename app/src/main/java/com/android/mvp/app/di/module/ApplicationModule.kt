package com.android.mvp.app.di.module

import android.app.Application
import com.android.mvp.app.BaseApp
import com.android.mvp.app.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}