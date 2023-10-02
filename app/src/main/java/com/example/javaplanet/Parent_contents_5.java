package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Parent_contents_5 extends AppCompatActivity {
    int i = 0;
    String text;
    //37~45
    String[] imgs = {"slide_parent__37_","slide_parent__38_","slide_parent__39_","slide_parent__40_",
            "slide_parent__41_","slide_parent__42_","slide_parent__43_","slide_parent__44_","slide_parent__45_"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_contents_5);

        final ImageView slide = (ImageView)findViewById(R.id.slide_5);
        Button before_btn = (Button)findViewById(R.id.before_btn_5);
        Button next_btn = (Button)findViewById(R.id.next_btn_5);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_p5_1);
        ImageButton link_btn2 = (ImageButton)findViewById(R.id.link_btn_p5_2);
        ImageButton link_btn3 = (ImageButton)findViewById(R.id.link_btn_p5_3);

        final TextView page_text = (TextView)findViewById(R.id.page_text_5);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<8) {
                    i++;
                    text = Integer.toString(i+1);
                    page_text.setText(text + "/9");
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
                    page_text.setText(text + "/9");
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

                intent.putExtra("link","https://cloudstudying.kr/lectures/383#tab");

                startActivity(intent);
            }
        });

        link_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://kwonsoonwoo.github.io/java/2019/04/18/%EC%B6%94%EC%83%81%ED%81%B4%EB%9E%98%EC%8A%A4.html");

                startActivity(intent);
            }
        });

        link_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","http://www.tcpschool.com/java/java_polymorphism_abstract");

                startActivity(intent);
            }
        });
    }
}