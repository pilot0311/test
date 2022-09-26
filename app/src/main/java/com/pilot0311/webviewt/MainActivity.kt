package com.pilot0311.webviewt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView:WebView=findViewById(R.id.webView)
            myWebView.loadUrl("https://www.google.com")
        myWebView.settings.javaScriptEnabled = true //자바 스크립트 허용
        /* 웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 */
        myWebView.webViewClient = WebViewClient()
        myWebView.webChromeClient = WebChromeClient()

    }

    override fun onBackPressed() {
        val myWebView:WebView=findViewById(R.id.webView)

        if(myWebView.canGoBack())
        {
            myWebView.goBack()
        }
        else
        {
            super.onBackPressed()
        }
    }
}