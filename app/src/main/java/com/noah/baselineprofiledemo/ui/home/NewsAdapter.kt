package com.noah.baselineprofiledemo.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.noah.baselineprofiledemo.R

class NewsAdapter(private val list: List<NewsItemData>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return 200
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.fill(position)
    }

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val titleTV: TextView = itemView.findViewById(R.id.title)

        private val positionTV: TextView = itemView.findViewById(R.id.position)

        private val imageView: ImageView = itemView.findViewById(R.id.iv)

        fun fill(position: Int) {
            titleTV.text = "123"
            positionTV.text = "position: $position"
            Glide.with(itemView)
                .load("https://img0.baidu.com/it/u=1604010673,2427861166&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=889")
                .into(imageView)
        }

    }
}