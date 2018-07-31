package com.example.devpartners.aims.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.devpartners.aims.R

class JobAdapter : RecyclerView.Adapter<JobAdapter.JobViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val layout = inflater.inflate(R.layout.layout_job_vacancy, parent, false)
        return JobViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 12
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {

    }

    class JobViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    }
}