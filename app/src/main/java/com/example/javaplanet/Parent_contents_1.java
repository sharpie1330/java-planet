package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Parent_contents_1 extends AppCompatActivity {

    int i = 0;
    //1~8
    String[] imgs = {"slide_parent__1_","slide_parent__2_","slide_parent__3_","slide_parent__4_",
            "slide_parent__5_","slide_parent__6_","slide_parent__7_","slide_parent__8_"};
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_contents_1);

        final ImageView slide = (ImageView)findViewById(R.id.slide);
        Button before_btn = (Button)findViewById(R.id.before_btn);
        Button next_btn = (Button)findViewById(R.id.next_btn);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_p1_1);
        ImageButton link_btn2 = (ImageButton)findViewById(R.id.link_btn_p1_2);
        ImageButton link_btn3 = (ImageButton)findViewById(R.id.link_btn_p1_3);
        final TextView page_text = (TextView)findViewById(R.id.page_text);

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

                intent.putExtra("link","http://www.tcpschool.com/java/java_inheritance_concept");

                startActivity(intent);
            }
        });

        link_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://edu.goorm.io/learn/lecture/41/%EB%B0%94%EB%A1%9C%EC%8B%A4%EC%8A%B5-%EC%83%9D%ED%99%9C%EC%BD%94%EB%94%A9-%EC%9E%90%EB%B0%94-java/lesson/39403/%EC%83%81%EC%86%8D%EC%9D%98-%EA%B0%9C%EB%85%90");

                startActivity(intent);
            }
        });

        link_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://cloudstudying.kr/lectures/246");

                startActivity(intent);
            }
        });
    }
}