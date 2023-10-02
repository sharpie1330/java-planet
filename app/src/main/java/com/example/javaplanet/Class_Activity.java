package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Class_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        ImageButton c_btn1 = (ImageButton)findViewById(R.id.c_btn1);
        ImageButton c_btn2 = (ImageButton)findViewById(R.id.c_btn2);
        ImageButton c_btn3 = (ImageButton)findViewById(R.id.c_btn3);
        ImageButton c_btn4 = (ImageButton)findViewById(R.id.c_btn4);
        ImageButton c_btn5 = (ImageButton)findViewById(R.id.c_btn5);
        ImageButton c_btn6 = (ImageButton)findViewById(R.id.c_btn6);
        ImageButton c_btn7 = (ImageButton)findViewById(R.id.c_btn7);

        c_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Class_contents_1.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/TgW5eYjh4Pw");
                startActivity(intent);
            }
        });

         c_btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(getApplicationContext(),Class_contents_2.class);
                 //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                 intent.putExtra("link","https://youtube.com/embed/UKDm0cgIHk8");
                 startActivity(intent);
            }
        });

        c_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Class_contents_3.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/9u_kQGTlcgY");
                startActivity(intent);
            }
        });

        c_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Class_contents_4.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/8V-jiBIouEg");
                startActivity(intent);
            }
        });

        c_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Class_contents_5.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/vrhIxBWSJ04");
                startActivity(intent);
            }
        });

        c_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Class_contents_6.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/ERiPImy48jw");
                startActivity(intent);
            }
        });

        c_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Class_contents_7.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/oipIG9jM-aM");
                startActivity(intent);
            }
        });
    }
}
