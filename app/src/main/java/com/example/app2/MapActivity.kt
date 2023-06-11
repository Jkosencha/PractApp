package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class MapActivity : AppCompatActivity() {

    lateinit var map1:WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        map1=findViewById(R.id.map)

        map1.webViewClient= WebViewClient()
        map1.loadUrl("https://www.google.com/maps/place/Kipro+Center+Dental+Clinic/@-1.2646728,36.7977701,16.6z/data=!4m6!3m5!1s0x182f1791a3266197:0x1b878049a1937f81!8m2!3d-1.2648706!4d36.8005675!16s%2Fg%2F11lgsftx2b?entry=ttu")
        map1.settings.javaScriptEnabled=true
        map1.settings.setSupportZoom(true)

    }
}