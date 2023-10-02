package com.example.javaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //유튜브 테스트용  -->
      //  Button test_btn = (Button)findViewById(R.id.test_btn);

      /*  test_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Test_Youtube.class);
                //intent로 링크 전달할 때 youtube.com/embed/영상 아이디 -> embed 사용하면 전체화면으로 출력됨!
                intent.putExtra("link","https://www.youtube.com/embed/sHPDDKQujdw");
                startActivity(intent);
            }
        });*/
        // <-- 테스트용

        ImageButton control_btn = (ImageButton)findViewById(R.id.control_btn);
        ImageButton class_btn = (ImageButton)findViewById(R.id.class_btn);
        ImageButton parent_btn = (ImageButton)findViewById(R.id.parent_btn);
        ImageButton interface_btn = (ImageButton)findViewById(R.id.interface_btn);
        ImageButton thread_btn = (ImageButton)findViewById(R.id.thread_btn);

        control_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Program_control.class);
                startActivity(intent);
            }
        });

        class_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Class_Activity.class);
                startActivity(intent);
            }
        });

        parent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Parent.class);
                startActivity(intent);
            }
        });

        interface_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Interface.class);
                startActivity(intent);
            }
        });

        thread_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Thread.class);
                startActivity(intent);
            }
        });
    }
}