package com.example.devpartners.aims.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.devpartners.aims.R
import com.example.devpartners.aims.enum.MainFragment
import com.example.devpartners.aims.event.ChangeFragment
import org.greenrobot.eventbus.EventBus


class RegisterFragment : Fragment() {

    var back : TextView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        setVariable(view)
        back?.setOnClickListener {
            EventBus.getDefault().post(ChangeFragment(MainFragment.LOGIN))
        }

        return view
    }
    private fun setVariable(view: View) {
        back = view.findViewById(R.id.backText)
    }
}
