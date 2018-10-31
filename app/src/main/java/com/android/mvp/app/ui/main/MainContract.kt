package com.android.mvp.app.ui.main

import com.android.mvp.app.ui.base.BaseContract

class MainContract {

    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick(isAboutFragmentSelected: Boolean)
    }
}