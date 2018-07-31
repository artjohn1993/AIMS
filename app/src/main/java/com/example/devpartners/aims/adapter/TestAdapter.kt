package com.example.devpartners.aims.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.devpartners.aims.R

class TestAdapter : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val layout = inflater.inflate(R.layout.layout_test, parent, false)
        return TestViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {

    }

    class TestViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    }
}