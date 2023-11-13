package com.deshAndDez.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.deshAndDez.R
import com.deshAndDez.base.adapters.CustomBaseAdapter
import com.deshAndDez.databinding.RecyclerItemLayoutUsersBinding

class UsersAdapter(private val onItemClicked: (User) -> Unit) :
    CustomBaseAdapter<User, UsersAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item_layout_users, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = RecyclerItemLayoutUsersBinding.bind(itemView)
        fun bind(item: User) {
            itemView.setOnClickListener {
                onItemClicked(item)
            }
            binding.followButton.setOnClickListener {
                removeItem(position)
            }
        }
    }
}