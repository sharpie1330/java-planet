package com.example.javaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Thread extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);

        ImageButton t_btn1 = (ImageButton)findViewById(R.id.t_btn1);
        ImageButton t_btn2 = (ImageButton)findViewById(R.id.t_btn2);
        ImageButton t_btn3 = (ImageButton)findViewById(R.id.t_btn3);
        ImageButton t_btn4 = (ImageButton)findViewById(R.id.t_btn4);
        ImageButton t_btn5 = (ImageButton)findViewById(R.id.t_btn5);

  /*      c_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Class_contents_1.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/TgW5eYjh4Pw");
                startActivity(intent);
            }
        });
*/
       //액티비티 추가 후 주석 삭제
        t_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Thread_contents_1.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://youtube.com/embed/epPJDPe2OCU");
                startActivity(intent);
            }
        });

        t_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Thread_contents_2.class);
                intent.putExtra("link","https://youtube.com/embed/54RgJ999Szw");
                startActivity(intent);
            }
        });

        t_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Thread_contents_3.class);
                intent.putExtra("link","https://youtube.com/embed/6j0TGHvBVbc");
                startActivity(intent);
            }
        });

        t_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Thread_contents_4.class);
                intent.putExtra("link","https://youtube.com/embed/pVeKjai8G6g");
                startActivity(intent);
            }
        });

        t_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Thread_contents_5.class);
                intent.putExtra("link","https://youtube.com/embed/mUuwKsiTTC8");
                startActivity(intent);
            }
        });
    }
}