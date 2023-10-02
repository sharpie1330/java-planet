package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Interface_contents_3 extends AppCompatActivity {
    int i = 0;
    String[] imgs = {"slide_interface__13_","slide_interface__14_","slide_interface__15_","slide_interface__16_","slide_interface__17_","slide_interface__18_","slide_interface__19_"};
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_contents_3);

        final ImageView slide = (ImageView)findViewById(R.id.slide_3);
        Button before_btn = (Button)findViewById(R.id.before_btn_3);
        Button next_btn = (Button)findViewById(R.id.next_btn_3);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_i3_1);
        ImageButton link_btn2 = (ImageButton)findViewById(R.id.link_btn_i3_2);
        ImageButton link_btn3 = (ImageButton)findViewById(R.id.link_btn_i3_3);

        final TextView page_text = (TextView)findViewById(R.id.page_text_3);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<6) {
                    i++;
                    text = Integer.toString(i+1);
                    page_text.setText(text + "/7");
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
                    page_text.setText(text + "/7");
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

                intent.putExtra("link","https://codevang.tistory.com/100");

                startActivity(intent);
            }
        });

        link_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://ammff.tistory.com/21");

                startActivity(intent);
            }
        });

        link_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://velog.io/@foeverna/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%EB%A5%BC-%ED%99%9C%EC%9A%A9%ED%95%9C-%EB%8B%A4%ED%98%95%EC%84%B1-%EA%B5%AC%ED%98%84");

                startActivity(intent);
            }
        });
    }
}