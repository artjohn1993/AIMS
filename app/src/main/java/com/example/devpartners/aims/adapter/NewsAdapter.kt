package com.example.devpartners.aims.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.devpartners.aims.R

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val layout = inflater.inflate(R.layout.layout_news, parent, false)
        return NewsViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 12
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

    }

    class NewsViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    }
}