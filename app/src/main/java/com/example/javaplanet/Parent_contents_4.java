package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Parent_contents_4 extends AppCompatActivity {

    int i = 0;
    String text;
    //25~36
    String[] imgs = {"slide_parent__25_","slide_parent__26_","slide_parent__27_","slide_parent__28_",
            "slide_parent__29_","slide_parent__30_","slide_parent__31_","slide_parent__32_","slide_parent__33_",
            "slide_parent__34_","slide_parent__35_","slide_parent__36_"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_contents_4);

        final ImageView slide = (ImageView)findViewById(R.id.slide_4);
        Button before_btn = (Button)findViewById(R.id.before_btn_4);
        Button next_btn = (Button)findViewById(R.id.next_btn_4);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_p4_1);
        ImageButton link_btn2 = (ImageButton)findViewById(R.id.link_btn_p4_2);
        final TextView page_text = (TextView)findViewById(R.id.page_text_4);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<11) {
                    i++;
                    text = Integer.toString(i+1);
                    page_text.setText(text + "/12");
                    int resId = getResources().getIdentifier(imgs[i], "drawable",
                            getPackageName());
                    slide.setImageResource(resId);
                }
            }
        });

        before_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i>0) {
                    i--;
                    text = Integer.toString(i+1);
                    page_text.setText(text + "/12");
                    int resId = getResources().getIdentifier(imgs[i], "drawable",
                            getPackageName());
                    slide.setImageResource(resId);
                }
            }
        });

        link_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://gbs1995.tistory.com/14");

                startActivity(intent);
            }
        });

        link_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://luvyoon.tistory.com/entry/JAVA-1-%EC%83%81%EC%86%8D%EC%97%90%EC%84%9C%EC%9D%98-%ED%83%80%EC%9E%85%EB%B3%80%ED%99%98%EA%B3%BC-%EB%8B%A4%ED%98%95%EC%84%B1");

                startActivity(intent);
            }
        });
    }
}