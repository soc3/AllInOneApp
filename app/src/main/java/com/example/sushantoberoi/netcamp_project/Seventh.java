package com.example.sushantoberoi.netcamp_project;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Seventh extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        b1=(Button)findViewById(R.id.enter);
        b2=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1="who is the odi captain of india?";
                String s2="Dhoni";
                String s3="Sachin";
                String s4="Virat";
                String s5="Zaheer";
                String s6="Dhoni";
                String s7="How many times india has won the cricket world cup?";
                String s8="1";
                String s9="2";
                String s10="3";
                String s11="4";
                String s12="4";
                String i1="1";
                String i2="2";
                String s13="who is the test captain of india?";
                String s14="Virat";
                String s15="Sachin";
                String s16="Dhoni";
                String s17="Zaheer";
                String s18="Virat";
                String s19="Which cricket team has never won a world cup";
                String s20="india";
                String s21="south africa";
                String s22="srilanka";
                String s23="australia";
                String s24="south africa";
                String i3="3";
                String i4="4";
                String s25="Which is the N0. one team in test?";
                String s26="India";
                String s27="Pakistan";
                String s28="England";
                String s29="Australia";
                String s30="India";
                String i5="5";
                String s31="Which year is considered as golden year for virat kohli";
                String s32="every year";
                String s33="2016";
                String s34="2015";
                String s35="2014";
                String s36="2016";
                String i6="6";
                String s37="Which team has never won a WC against india";
                String s38="India";
                String s39="Pakistan";
                String s40="England";
                String s41="Australia";
                String s42="Pakistan";
                String i7="7";
                String s43="Which team has won the cricket WC most no. of times";
                String s44="India";
                String s45="Pakistan";
                String s46="England";
                String s47="Australia";
                String s48="Australia";
                String i8="8";
                SQLiteDatabase data=openOrCreateDatabase("quizz",MODE_PRIVATE,null); //nobody other can access
                //it is stored in our phone only
                data.execSQL("create table if not exists it (id varchar,Question varchar, op1 varchar,op2 varchar,op3 varchar,op4 varchar,correct varchar);");
                data.execSQL("insert into it values ('" + i1 + "','" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "');");
                data.execSQL("insert into it values ('" + i2 + "','" + s7 + "','" + s8 + "','" + s9 + "','" + s10 + "','" + s11 + "','" + s12 + "');");
                data.execSQL("insert into it values ('" + i3 + "','" + s13 + "','" + s14 + "','" + s15 + "','" + s16 + "','" + s17 + "','" + s18 + "');");
                data.execSQL("insert into it values ('" + i4 + "','" + s19 + "','" + s20 + "','" + s21 + "','" + s22 + "','" + s23 + "','" + s24 + "');");
                data.execSQL("insert into it values ('" + i5 + "','" + s25 + "','" + s26 + "','" + s27 + "','" + s28 + "','" + s29 + "','" + s30 + "');");
                data.execSQL("insert into it values ('" + i6 + "','" + s31 + "','" + s32 + "','" + s33 + "','" + s34 + "','" + s35 + "','" + s36 + "');");
                data.execSQL("insert into it values ('" + i7 + "','" + s37 + "','" + s38 + "','" + s39 + "','" + s40 + "','" + s41 + "','" + s42 + "');");
                data.execSQL("insert into it values ('" + i8 + "','" + s43 + "','" + s44 + "','" + s45 + "','" + s46 + "','" + s47 + "','" + s48 + "');");
                Toast.makeText(getApplicationContext(), "Quiz starts now", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Seventh.this, Eight.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Seventh.this,Seventeen.class);
                startActivity(i);
            }
        });
    }
}
