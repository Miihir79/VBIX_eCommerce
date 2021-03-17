package com.example.ecommerce.authUi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ecommerce.R


class FragmentContainer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_container)
        supportActionBar?.hide()

        supportFragmentManager.beginTransaction()
            .add(R.id.container, PhoneVerify()).commit()

    }
}