package com.example.sachi4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_open_in_browser.*

class OpenInBrowser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_in_browser)


        btnhome.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://sites.google.com/view/sharifvro")
            startActivity(openURL)
        }

        btnphyapplications.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://sites.google.com/view/sharifvro/physical-applications")
            startActivity(openURL)
        }

        btnmobileapplications.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://sites.google.com/view/sharifvro/mobile-apps")
            startActivity(openURL)
        }
    }
}



