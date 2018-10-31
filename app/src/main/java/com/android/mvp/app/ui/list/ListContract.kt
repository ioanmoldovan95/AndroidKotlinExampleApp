package com.android.mvp.app.ui.list

import com.android.mvp.app.ui.base.BaseContract
import com.android.mvp.app.models.DetailsViewModel
import com.android.mvp.app.models.Post

class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}