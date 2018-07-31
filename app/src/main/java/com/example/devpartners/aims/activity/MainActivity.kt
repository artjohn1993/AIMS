package com.example.devpartners.aims.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.devpartners.aims.R
import com.example.devpartners.aims.enum.MainFragment
import com.example.devpartners.aims.event.ChangeFragment
import com.example.devpartners.aims.fragment.ForgetPassFragment
import com.example.devpartners.aims.fragment.LoginFragment
import com.example.devpartners.aims.fragment.RegisterFragment
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        changeFragment(LoginFragment(this))
    }

    public override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    public override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    private fun changeFragment(data : android.support.v4.app.Fragment) {
        var fragment = supportFragmentManager.beginTransaction()
        fragment.setCustomAnimations(R.anim.abc_slide_in_bottom, android.R.animator.fade_out)
        fragment.replace(R.id.mainFrame, data).commit()
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onChangeFragment(event : ChangeFragment) {
        when(event.fragment) {
            MainFragment.LOGIN -> {
                changeFragment(LoginFragment(this))
            }
            MainFragment.REGISTER -> {
                changeFragment(RegisterFragment())
            }
            MainFragment.FORGET_PASSWORD -> {
                changeFragment(ForgetPassFragment())
            }
        }

    }
}
