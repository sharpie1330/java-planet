package com.example.javaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Class_contents_1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_contents_1);

        WebView webView = (WebView)findViewById(R.id.webview_class_1);
        WebSettings webSettings;

        webView.setWebViewClient(new WebViewClient());
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //intent로 전달받은 링크를 로드url 하기
        Intent intent = getIntent();

        String link_name = intent.getExtras().getString("link");
        webView.loadUrl(link_name);
    }
}