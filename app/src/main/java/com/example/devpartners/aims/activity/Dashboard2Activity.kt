package com.example.devpartners.aims.activity

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import com.example.devpartners.aims.R
import com.example.devpartners.aims.fragment.*
import kotlinx.android.synthetic.main.activity_dashboard1.*
import kotlinx.android.synthetic.main.activity_dashboard2.*
import kotlinx.android.synthetic.main.layout_toolbar1.*
import org.jetbrains.anko.startActivity

class Dashboard2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard2)
        supportActionBar?.title = ""
        changeFragment(ApplicantFragment())
        search.setImageResource(R.drawable.ic_call)
        navigationBar2.disableShiftMode()
        navigationBar2.setOnNavigationItemSelectedListener(
                BottomNavigationView.OnNavigationItemSelectedListener { item ->
                    when (item.itemId) {
                        R.id.applicant -> {
                            changeFragment(ApplicantFragment())

                        }
                        R.id.interview -> {
                            changeFragment(InterviewFragment())
                        }
                        R.id.post -> {


                        }
                        R.id.news -> {
                            changeFragment(NewsFragment())

                        }
                        R.id.services -> {

                        }

                    }
                    true
                })
        profileIcon.setOnClickListener {
            startActivity<ProfileActivity>()
        }
    }
    private fun changeFragment(data : android.support.v4.app.Fragment) {
        var fragment = supportFragmentManager.beginTransaction()
        fragment.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out)
        fragment.replace(R.id.dash2FrameLayout, data).commit()
    }
    @SuppressLint("RestrictedApi")
    fun BottomNavigationView.disableShiftMode() {
        val menuView = getChildAt(0) as BottomNavigationMenuView
        try {
            val shiftingMode = menuView::class.java.getDeclaredField("mShiftingMode")
            shiftingMode.isAccessible = true
            shiftingMode.setBoolean(menuView, false)
            shiftingMode.isAccessible = false
            for (i in 0 until menuView.childCount) {
                val item = menuView.getChildAt(i) as BottomNavigationItemView
                item.setShiftingMode(false)
                // set once again checked value, so view will be updated
                item.setChecked(item.itemData.isChecked)
            }
        } catch (e: NoSuchFieldException) {

        } catch (e: IllegalStateException) {

        }
    }
}
