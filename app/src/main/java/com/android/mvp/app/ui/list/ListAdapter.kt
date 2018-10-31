package com.android.mvp.app.ui.list

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.android.mvp.app.R
import com.android.mvp.app.databinding.ItemLayoutBinding
import com.android.mvp.app.models.Post

class ListAdapter(private val context: Context, private val list: MutableList<Post>,
                  fragment: Fragment): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private val listener: ListAdapter.OnItemClickListener

    init {
        this.listener = fragment as ListAdapter.OnItemClickListener
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder?, position: Int) {
        var post = list[position]

        holder!!.title.text = post.title
        holder.body.text = post.body

        holder.layout.setOnClickListener {
            listener.itemDetail(post.id.toString())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListViewHolder {
        val binding = DataBindingUtil.inflate<ItemLayoutBinding>(LayoutInflater.from(context), R.layout.item_layout, parent, false)
        return ListAdapter.ListViewHolder(binding)
    }

    fun removeAt(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }

    class ListViewHolder(binding : ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        var layout = binding.itemLayout
        val title = binding.itemTitle
        val body = binding.itemBody
    }

    interface OnItemClickListener {
        fun itemRemoveClick(post: Post)
        fun itemDetail(postId : String)
    }
}