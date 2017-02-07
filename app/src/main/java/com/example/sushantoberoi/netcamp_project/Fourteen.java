package com.example.sushantoberoi.netcamp_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Fourteen extends AppCompatActivity {
    static String s1="";
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);
        b1=(Button)findViewById(R.id.fb);
        b2=(Button)findViewById(R.id.twitter);
        b3=(Button)findViewById(R.id.net);
        b4=(Button)findViewById(R.id.home);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1="http://www.facebook.com";
                Intent i=new Intent(Fourteen.this,Fifteen.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1="http://www.twitter.com";
                Intent i=new Intent(Fourteen.this,Fifteen.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1="http://www.netcamp.in";
                Intent i=new Intent(Fourteen.this,Fifteen.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fourteen.this,Third.class);
                startActivity(i);
                finish();
            }
        });
    }
}
