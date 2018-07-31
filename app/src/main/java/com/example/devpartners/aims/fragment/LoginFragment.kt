package com.example.devpartners.aims.fragment

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import com.example.devpartners.aims.R
import com.example.devpartners.aims.activity.Dashboard1Activity
import com.example.devpartners.aims.enum.MainFragment
import com.example.devpartners.aims.event.ChangeFragment
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.startActivity


@SuppressLint("ValidFragment")
class LoginFragment(val activity: Activity) : Fragment() {
    var register : TextView? = null
    var forgetPass : TextView? = null
    var login : Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        setVariable(view)

        register?.setOnClickListener {
            EventBus.getDefault().post(ChangeFragment(MainFragment.REGISTER))
        }
        forgetPass?.setOnClickListener {
            EventBus.getDefault().post(ChangeFragment(MainFragment.FORGET_PASSWORD))
        }
        login?.setOnClickListener {
            activity.startActivity<Dashboard1Activity>()
            activity.finish()
        }
        return view
    }

    private fun setVariable(view: View) {
        register = view.findViewById(R.id.registerText)
        forgetPass = view.findViewById(R.id.forgetPassText)
        login = view.findViewById(R.id.signinButton)
    }
}

