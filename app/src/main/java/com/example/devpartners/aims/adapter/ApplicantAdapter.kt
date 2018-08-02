package com.example.devpartners.aims.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.devpartners.aims.R

class ApplicantAdapter : RecyclerView.Adapter<ApplicantAdapter.ApplicantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApplicantViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val layout = inflater.inflate(R.layout.layout_applicant, parent, false)
        return ApplicantViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: ApplicantViewHolder, position: Int) {

    }

    class ApplicantViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    }
}