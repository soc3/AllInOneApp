package com.example.sushantoberoi.netcamp_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Third extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=(Button)findViewById(R.id.back2);
        b2=(Button)findViewById(R.id.btn1);
        b3=(Button)findViewById(R.id.btn2);
        b4=(Button)findViewById(R.id.btn3);
        b5=(Button)findViewById(R.id.btn4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = settings.edit();
                editor.remove("username");
                Intent i = new Intent(Third.this,MainActivity.class);
                startActivity(i);
                onBackPressed();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Third.this,Fourth.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Third.this,Fifth.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Third.this,Sixth.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Third.this,Seventh.class);
                startActivity(i);

            }
        });
    }
    public void onBackPressed() {
        //do nothing
        finish();
    }
}
