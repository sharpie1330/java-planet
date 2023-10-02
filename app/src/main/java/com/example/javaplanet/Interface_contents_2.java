package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Interface_contents_2 extends AppCompatActivity {
    int i = 0;
    String[] imgs = {"slide_interface__6_","slide_interface__7_","slide_interface__8_","slide_interface__9_","slide_interface__10_","slide_interface__11_","slide_interface__12_"};
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_contents_2);

        final ImageView slide = (ImageView)findViewById(R.id.slide_2);
        Button before_btn = (Button)findViewById(R.id.before_btn_2);
        Button next_btn = (Button)findViewById(R.id.next_btn_2);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_i2_1);
        ImageButton link_btn2 = (ImageButton)findViewById(R.id.link_btn_i2_2);

        final TextView page_text = (TextView)findViewById(R.id.page_text_2);

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

                intent.putExtra("link","https://wikidocs.net/217");

                startActivity(intent);
            }
        });

        link_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebLink.class);

                intent.putExtra("link","https://hyuntaekhong.github.io/blog/java-basic20/");

                startActivity(intent);
            }
        });
    }
}