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
import com.example.devpartners.aims.adapter.ApplicantAdapter
import com.example.devpartners.aims.adapter.NewsAdapter


class ApplicantFragment : Fragment() {
    var applicantRecycler : android.support.v7.widget.RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view  = inflater.inflate(R.layout.fragment_applicant, container, false)
        setAdapter(view)
        return view
    }
    private fun setAdapter(view: View) {
        applicantRecycler = view.findViewById(R.id.applicantRecycler)
        applicantRecycler?.layoutManager = LinearLayoutManager(context,
                LinearLayout.VERTICAL,
                false)
        applicantRecycler?.adapter = ApplicantAdapter()
    }
}
