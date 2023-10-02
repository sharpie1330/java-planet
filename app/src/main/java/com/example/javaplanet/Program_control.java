package com.example.javaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Program_control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_control);

        ImageButton pr_btn1 = (ImageButton)findViewById(R.id.pr_btn1);
        ImageButton pr_btn2 = (ImageButton)findViewById(R.id.pr_btn2);
        ImageButton pr_btn3 = (ImageButton)findViewById(R.id.pr_btn3);
        ImageButton pr_btn4 = (ImageButton)findViewById(R.id.pr_btn4);
        ImageButton pr_btn5 = (ImageButton)findViewById(R.id.pr_btn5);
        ImageButton pr_btn6 = (ImageButton)findViewById(R.id.pr_btn6);

//변수
        pr_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Program_control_contents_1.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/IzYh7VneaeQ");
                startActivity(intent);
            }
        });
//메소드
        pr_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Program_control_contents_2.class);
                intent.putExtra("link","https://youtube.com/embed/CQQHCvqiZto");
                startActivity(intent);
            }
        });
//배열
        pr_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Program_control_contents_3.class);
                intent.putExtra("link", "https://youtube.com/embed/F9EUT49VXz0");
                startActivity(intent);
            }
        });
//연신지
        pr_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Program_control_contents_4.class);
                intent.putExtra("link","https://youtube.com/embed/FnSNdUz2-go");
                startActivity(intent);
            }
        });
//조건문
        pr_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Program_control_contents_5.class);
                intent.putExtra("link","https://youtube.com/embed/I9kjJVuDTDU");
                startActivity(intent);
            }
        });
//반복문
        pr_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Program_control_contents_6.class);
                intent.putExtra("link", "https://youtube.com/embed/TZqIAUVmzAY");
                startActivity(intent);
            }
        });

    }
}