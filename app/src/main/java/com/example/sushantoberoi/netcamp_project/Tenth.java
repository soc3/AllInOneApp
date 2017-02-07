package com.example.sushantoberoi.netcamp_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tenth extends AppCompatActivity {
    TextView txt1;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        txt1=(TextView)findViewById(R.id.txt1);
        b1=(Button)findViewById(R.id.restart);
        b2=(Button)findViewById(R.id.share);
        txt1.setText("Your Score is : "+ Eight.score);
        if(Eight.score==5)
        {
            Toast.makeText(getApplicationContext(),"Great Work all Correct!!",Toast.LENGTH_LONG).show();
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Eight.score=0;
                Intent i = new Intent(Tenth.this,Seventh.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tenth.this,Fourteen.class);
                startActivity(i);
            }
        });
    }
}
