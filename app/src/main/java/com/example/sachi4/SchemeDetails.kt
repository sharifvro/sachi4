package com.example.sachi4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_open_in_browser.*
import kotlinx.android.synthetic.main.activity_scheme_details.*

class SchemeDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scheme_details)

        btnwelfareschemes.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://sachiwelfare.blogspot.com/")
            startActivity(openURL)
        }
    }
}