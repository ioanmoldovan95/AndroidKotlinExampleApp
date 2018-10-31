package com.android.mvp.app.di.module

import com.android.mvp.app.api.ApiServiceInterface
import com.android.mvp.app.ui.about.AboutContract
import com.android.mvp.app.ui.about.AboutPresenter
import com.android.mvp.app.ui.list.ListContract
import com.android.mvp.app.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}