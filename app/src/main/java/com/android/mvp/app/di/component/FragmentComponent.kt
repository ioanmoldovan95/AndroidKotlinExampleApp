package com.android.mvp.app.di.component

import com.android.mvp.app.di.module.FragmentModule
import com.android.mvp.app.ui.about.AboutFragment
import com.android.mvp.app.ui.list.ListFragment
import dagger.Component

@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}