package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Class_contents_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_contents_5);

        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_5_1);

        link_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://www.youtube.com/watch?v=U9F2rpLi3Qw");

                startActivity(intent);
            }
        });

        WebView webView = (WebView)findViewById(R.id.webview_class_5);
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