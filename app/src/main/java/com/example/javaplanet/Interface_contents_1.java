package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Interface_contents_1 extends AppCompatActivity {
    int i = 0;
    String[] imgs = {"slide_interface__1_","slide_interface__2_","slide_interface__3_","slide_interface__4_","slide_interface__5_"};
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_contents_1);

        final ImageView slide = (ImageView)findViewById(R.id.slide);
        Button before_btn = (Button)findViewById(R.id.before_btn);
        Button next_btn = (Button)findViewById(R.id.next_btn);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_i1_1);
        ImageButton link_btn2 = (ImageButton)findViewById(R.id.link_btn_i1_2);
        ImageButton link_btn3 = (ImageButton)findViewById(R.id.link_btn_i1_3);

        final TextView page_text = (TextView)findViewById(R.id.page_text);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<4) {
                    i++;
                    text = Integer.toString(i+1);
                    page_text.setText(text + "/5");
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
                    page_text.setText(text + "/5");
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

                intent.putExtra("link","https://cloudstudying.kr/lectures/267");

                startActivity(intent);
            }
        });

        link_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","http://www.tcpschool.com/java/java_polymorphism_interface");

                startActivity(intent);
            }
        });

        link_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://babcider.tistory.com/65");

                startActivity(intent);
            }
        });

    }
}