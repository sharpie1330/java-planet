package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
        ImageButton i_btn1 = (ImageButton)findViewById(R.id.i_btn1);
        ImageButton i_btn2 = (ImageButton)findViewById(R.id.i_btn2);
        ImageButton i_btn3 = (ImageButton)findViewById(R.id.i_btn3);
        ImageButton i_btn4 = (ImageButton)findViewById(R.id.i_btn4);


        i_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Interface_contents_1.class);
                startActivity(intent);
            }
        });

        i_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Interface_contents_2.class);
                startActivity(intent);
            }
        });

        i_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Interface_contents_3.class);
                startActivity(intent);
            }
        });

        i_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Interface_contents_4.class);
                startActivity(intent);
            }
        });

    }
}
