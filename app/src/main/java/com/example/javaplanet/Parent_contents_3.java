package com.example.javaplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Parent_contents_3 extends AppCompatActivity {

    int i = 0;
    String text;
    //17~24
    String[] imgs = {"slide_parent__17_","slide_parent__18_","slide_parent__19_","slide_parent__20_",
            "slide_parent__21_","slide_parent__22_","slide_parent__23_","slide_parent__24_"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_contents_3);

        final ImageView slide = (ImageView)findViewById(R.id.slide_3);
        Button before_btn = (Button)findViewById(R.id.before_btn_3);
        Button next_btn = (Button)findViewById(R.id.next_btn_3);
        ImageButton link_btn1 = (ImageButton)findViewById(R.id.link_btn_p3_1);
        final TextView page_text = (TextView)findViewById(R.id.page_text_3);

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

                intent.putExtra("link","http://www.tcpschool.com/java/java_inheritance_super");

                startActivity(intent);
            }
        });
    }
}