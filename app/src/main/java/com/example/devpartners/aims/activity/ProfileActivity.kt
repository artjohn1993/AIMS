package com.example.devpartners.aims.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import com.example.devpartners.aims.R
import com.example.devpartners.aims.adapter.ProfileAdapter
import com.example.devpartners.aims.adapter.TestAdapter
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        title = "Me"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        setAdapter()
        scrollTop()
    }

    private fun scrollTop() {
        profileScroll.smoothScrollTo(0,0)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            android.R.id.home -> {
                this.finish()
            }
        }
        return true
    }
    private fun setAdapter() {
        profileRecycler.layoutManager = LinearLayoutManager(this,
                LinearLayout.VERTICAL,
                false)
        profileRecycler.adapter = ProfileAdapter()
        profileRecycler.isFocusable = false
    }
}
