package com.example.sachi4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

class News : AppCompatActivity() {
    private lateinit var webView: WebView
    private var doubleBackToExitPressedOnce : Boolean = false
    private val URL = "https://sites.google.com/view/sharifvro/news"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        webView = findViewById(R.id.wv_news)

        webView.apply {
            loadUrl(URL)
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }
    }
    override fun onBackPressed() {
        doubleBackToExit()
    }

    fun doubleBackToExit(){

        if (doubleBackToExitPressedOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true

        Toast.makeText(this, getString(R.string.please_press_back_again_to_exit), Toast.LENGTH_SHORT).show()

        Handler(Looper.myLooper()!!).postDelayed({
            doubleBackToExitPressedOnce = false
        },2000)

    }

}