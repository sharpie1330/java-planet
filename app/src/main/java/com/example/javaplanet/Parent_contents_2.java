package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Parent_contents_2 extends AppCompatActivity {

    int i = 0;
    String text;
    //9~16
    String[] imgs = {"slide_parent__9_","slide_parent__10_","slide_parent__11_","slide_parent__12_",
            "slide_parent__13_","slide_parent__14_","slide_parent__15_","slide_parent__16_"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_contents_2);

        final ImageView slide = (ImageView)findViewById(R.id.slide_2);
        Button before_btn = (Button)findViewById(R.id.before_btn_2);
        Button next_btn = (Button)findViewById(R.id.next_btn_2);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_p2_1);
        ImageButton link_btn2 = (ImageButton)findViewById(R.id.link_btn_p2_2);
        ImageButton link_btn3 = (ImageButton)findViewById(R.id.link_btn_p2_3);
        final TextView page_text = (TextView)findViewById(R.id.page_text_2);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<7) {
                    i++;
                    text = Integer.toString(i+1);
                    page_text.setText(text + "/8");
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
                    page_text.setText(text + "/8");
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

                intent.putExtra("link","http://www.tcpschool.com/java/java_inheritance_overriding");

                startActivity(intent);
            }
        });

        link_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://ko.wikipedia.org/wiki/%EB%A9%94%EC%86%8C%EB%93%9C_%EC%98%A4%EB%B2%84%EB%9D%BC%EC%9D%B4%EB%94%A9");

                startActivity(intent);
            }
        });

        link_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://programmers.co.kr/learn/courses/5/lessons/189");

                startActivity(intent);
            }
        });
    }
}