package com.example.sushantoberoi.netcamp_project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Second extends AppCompatActivity {
    Button b1,b2,b3;
    EditText e1,e2,e3,e4,e5,e6,e7;
    int id;
    String arr[]={"66164","12694","54242","31561","16151"};
    //String s1="",s2="",s3="",s4="",s5="",s6="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=(Button)findViewById(R.id.back);
        b2=(Button)findViewById(R.id.signup2);
        e1=(EditText)findViewById(R.id.txt1);
        e2=(EditText)findViewById(R.id.txt2);
        e3=(EditText)findViewById(R.id.txt3);
        e4=(EditText)findViewById(R.id.txt4);
        e5=(EditText)findViewById(R.id.txt5);
        e6=(EditText)findViewById(R.id.txt6);
        e7=(EditText)findViewById(R.id.txt7);
        b3=(Button)findViewById(R.id.otp);
        Random rand=new Random();
        id=rand.nextInt(5);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e6.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please fill phone no. first",Toast.LENGTH_LONG).show();
                }
                else
                {
                    String s=e6.getText().toString();
                    SmsManager s2=SmsManager.getDefault();
                    s2.sendTextMessage(s,null,"Your otp is: "+arr[id],null,null);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Second.this,MainActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                String s6 = e6.getText().toString();
                int n=s4.length(),f=0;
                for(int i=0;i<n;i++)
                {
                    if(s4.charAt(i)=='@')
                    {
                        f=1;
                        break;
                    }
                }
                if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals("") || s6.equals("")) {
                    Toast.makeText(Second.this, "Please fill all entries", Toast.LENGTH_LONG).show();
                }
                else if(f==0)
                {
                    Toast.makeText(Second.this, "Invalid Email Address", Toast.LENGTH_LONG).show();
                }
                else if (!s2.equals(s3)) {
                    Toast.makeText(Second.this, "Password Doesnt match, kindly confirm password", Toast.LENGTH_LONG).show();
                }
                else if(!e7.getText().toString().equals(arr[id])) {
                    Toast.makeText(getApplicationContext(), "Otp doesnt match!!", Toast.LENGTH_LONG).show();
                }else {
                    SQLiteDatabase data = openOrCreateDatabase("netcamp", MODE_PRIVATE, null); //nobody other can access
                    //it is stored in our phone only
                    data.execSQL("create table if not exists nita (name varchar, password varchar,confirm_password varchar,email varchar,city varchar,phone varchar);");
                    //data.execSQL("create table if not exists nita (name varchar, password varchar);");
                    String s = "select * from nita where name='" + s1 + "' and password='" + s2 + "'";
                    Cursor cursor = data.rawQuery(s, null); // whatever query i run i can store something in cursor it is a class
                    if (cursor.getCount() > 0) {
                        Toast.makeText(Second.this, "User Already Exist", Toast.LENGTH_LONG).show();
                    } else {
                        data.execSQL("insert into nita values ('" + s1 + "','" + s2 + "','\" + s3 + \"','\" + s4 + \"','\" + s5 + \"','\" + s6 + \"');");
                        Toast.makeText(Second.this, "Siqnup Successful", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Second.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }
            }
        });
    }
}
