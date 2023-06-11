package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class WebViewActivity : AppCompatActivity() {

    lateinit var webpage: WebView
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webpage = findViewById(R.id.web)
        btn=findViewById(R.id.btnlctn)


        webpage.webViewClient= WebViewClient()
        webpage.loadUrl("https://www.bonfireadventures.com/packages")
        webpage.settings.javaScriptEnabled=true
        webpage.settings.setSupportZoom(true)

        btn.setOnClickListener {
            val intent= Intent(this,MapActivity::class.java)
            startActivity(intent)
        }

    }
}