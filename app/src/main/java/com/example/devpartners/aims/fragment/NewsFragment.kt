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
import com.example.devpartners.aims.adapter.NewsAdapter


class NewsFragment : Fragment() {
    var newsRecycler : android.support.v7.widget.RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_news, container, false)
        setAdapter(view)
        return view
    }
    private fun setAdapter(view: View) {
        newsRecycler = view.findViewById(R.id.newsRecycler)
        newsRecycler?.layoutManager = LinearLayoutManager(context,
                LinearLayout.VERTICAL,
                false)
        newsRecycler?.adapter = NewsAdapter()
    }
}
