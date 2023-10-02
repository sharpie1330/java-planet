package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Parent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        ImageButton p_btn1 = (ImageButton)findViewById(R.id.p_btn1);
        ImageButton p_btn2 = (ImageButton)findViewById(R.id.p_btn2);
        ImageButton p_btn3 = (ImageButton)findViewById(R.id.p_btn3);
        ImageButton p_btn4 = (ImageButton)findViewById(R.id.p_btn4);
        ImageButton p_btn5 = (ImageButton)findViewById(R.id.p_btn5);

        p_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Parent_contents_1.class);
                startActivity(intent);
            }
        });

        p_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Parent_contents_2.class);
                startActivity(intent);
            }
        });

        p_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Parent_contents_3.class);
                startActivity(intent);
            }
        });

        p_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Parent_contents_4.class);
                startActivity(intent);
            }
        });

        p_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Parent_contents_5.class);
                startActivity(intent);
            }
        });
    }
}