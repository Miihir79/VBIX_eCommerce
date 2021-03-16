package com.example.vbix_ecommerce.authUi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.vbix_ecommerce.R


class Otp : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_otp, container, false)
        val btn = v.findViewById<View>(R.id.verify_otp) as Button
        btn.setOnClickListener {
            fragmentManager?.beginTransaction()?.detach(Otp())
            fragmentManager?.beginTransaction()?.replace(R.id.container, SignUp())?.addToBackStack(null)
                ?.commit()
        }
        // Inflate the layout for this fragment
        return v
    }


}