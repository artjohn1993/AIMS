package com.example.devpartners.aims.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.devpartners.aims.R

class InterviewAdapter : RecyclerView.Adapter<InterviewAdapter.InterviewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InterviewViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val layout = inflater.inflate(R.layout.layout_interview, parent, false)
        return InterviewViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: InterviewViewHolder, position: Int) {

    }

    class InterviewViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    }
}