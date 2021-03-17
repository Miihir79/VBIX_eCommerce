package com.example.ecommerce.authUi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.ecommerce.R



class PhoneVerify : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_phone_verify, container, false)
        val btn = v.findViewById<View>(R.id.Vrfy_btn_getOtp) as Button

        btn.setOnClickListener {
            fragmentManager?.beginTransaction()?.detach(PhoneVerify())
            fragmentManager?.beginTransaction()?.replace(R.id.container, Otp())?.addToBackStack(null)
                ?.commit()
        }
        // Inflate the layout for this fragment
        return v
    }
}