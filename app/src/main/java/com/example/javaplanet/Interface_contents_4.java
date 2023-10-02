package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Interface_contents_4 extends AppCompatActivity {
    int i = 0;
    String[] imgs = {"slide_interface__20_","slide_interface__21_","slide_interface__22_","slide_interface__21_","slide_interface__22_","slide_interface__23_","slide_interface__24_","slide_interface__25_"};
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_contents_4);

        final ImageView slide = (ImageView)findViewById(R.id.slide_4);
        Button before_btn = (Button)findViewById(R.id.before_btn_4);
        Button next_btn = (Button)findViewById(R.id.next_btn_4);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_i4_1);
        ImageButton link_btn2 = (ImageButton)findViewById(R.id.link_btn_i4_2);
        ImageButton link_btn3 = (ImageButton)findViewById(R.id.link_btn_i4_3);

        final TextView page_text = (TextView)findViewById(R.id.page_text_4);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<5) {
                    i++;
                    text = Integer.toString(i+1);
                    page_text.setText(text + "/6");
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
                    page_text.setText(text + "/6");
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

                intent.putExtra("link","https://programmers.co.kr/learn/courses/5/lessons/241");

                startActivity(intent);
            }
        });

        link_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://beomseok95.tistory.com/272");

                startActivity(intent);
            }
        });

        link_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://dahyeee.tistory.com/entry/JAVA-interface-default-static%EB%A9%94%EC%86%8C%EB%93%9C");

                startActivity(intent);
            }
        });
    }
}