package com.example.devpartners.aims.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.devpartners.aims.R
import com.example.devpartners.aims.adapter.JobAdapter


class JobVacancyFragment : Fragment() {
    var jobRecycler : android.support.v7.widget.RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_job_vacancy, container, false)
        setAdapter(view)
        return view
    }

    private fun setAdapter(view: View) {
        jobRecycler = view.findViewById(R.id.jobRecycler)
        jobRecycler?.layoutManager = LinearLayoutManager(context,
                LinearLayout.VERTICAL,
                false)
        jobRecycler?.adapter = JobAdapter()
    }

}
