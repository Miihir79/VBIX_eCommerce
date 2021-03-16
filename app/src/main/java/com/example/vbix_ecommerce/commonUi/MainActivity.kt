package com.example.vbix_ecommerce.commonUi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vbix_ecommerce.R
import com.example.vbix_ecommerce.authUi.FragmentContainer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        button.setOnClickListener {

            val intent = Intent(applicationContext, FragmentContainer::class.java)
            startActivity(intent)

        }

    }
}