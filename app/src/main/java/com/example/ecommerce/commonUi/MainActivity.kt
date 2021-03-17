package com.example.ecommerce.commonUi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.ecommerce.R

import com.example.ecommerce.authUi.FragmentContainer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        spls_btn_GS.setOnClickListener {

            val intent = Intent(applicationContext, FragmentContainer::class.java)
            startActivity(intent)

        }
    }
}