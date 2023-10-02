package com.example.javaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class Thread_contents_3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_contents_3);

        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_th_5);

        link_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://blog.naver.com/smhyun128/222123572449");

                startActivity(intent);
            }
        });

        WebView webView = (WebView) findViewById(R.id.webview_thread_3);
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
