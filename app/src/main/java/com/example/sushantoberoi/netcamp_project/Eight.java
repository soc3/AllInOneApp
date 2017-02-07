package com.example.sushantoberoi.netcamp_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class Eight extends AppCompatActivity {
    Button b1;
    static Random rand = new Random();
    static boolean fn=false;
    static Integer score=0;
    RadioButton r1,r2,r3,r4;
    Integer i1;
    TextView txt1;
    String id;
    TextToSpeech t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        b1=(Button)findViewById(R.id.submit2);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
        r3=(RadioButton)findViewById(R.id.r3);
        r4=(RadioButton)findViewById(R.id.r4);
        t1=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setSpeechRate(0.8f); //frequency
            }
        });
        txt1=(TextView)findViewById(R.id.txt1);
        i1= rand.nextInt(8);
        i1++;
        id=Integer.toString(i1);
       // Toast.makeText(getApplicationContext(),""+id, Toast.LENGTH_LONG).show();
                SQLiteDatabase data = openOrCreateDatabase("quizz", MODE_PRIVATE, null); //nobody other can access
                //it is stored in our phone only
                data.execSQL("create table if not exists it (id varchar,Question varchar, op1 varchar,op2 varchar,op3 varchar,op4 varchar,correct varchar);");
                String q1 = "select * from it where id='" + id + "'";
                //Toast.makeText(getApplicationContext(), "" + id, Toast.LENGTH_LONG).show();
                Cursor c=data.rawQuery(q1,null);
                c.moveToFirst();
                txt1.setText(c.getString(c.getColumnIndex("Question")));
                r1.setText(c.getString(c.getColumnIndex("op1")));
                r2.setText(c.getString(c.getColumnIndex("op2")));
                r3.setText(c.getString(c.getColumnIndex("op3")));
                r4.setText(c.getString(c.getColumnIndex("op4")));
                b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.equals("1")) {
                    if (r1.isChecked()) {
                        score++;
                        r1.setBackgroundColor(Color.GREEN);
                        t1.speak(r1.getText().toString() + "is correct", TextToSpeech.QUEUE_FLUSH, null);
                    } else {
                        score--;
                        if(r2.isChecked())
                        r2.setBackgroundColor(Color.RED);
                        else if(r3.isChecked())
                            r3.setBackgroundColor(Color.RED);
                        else if(r4.isChecked())
                            r4.setBackgroundColor(Color.RED);
                        t1.speak("Sorry" + r1.getText().toString() + "is the correct answer", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                else if(id.equals("2")) {
                    if (r2.isChecked()) {
                        score++;
                        r2.setBackgroundColor(Color.GREEN);
                        t1.speak(r2.getText().toString() + "is correct", TextToSpeech.QUEUE_FLUSH, null);
                    } else {
                        score--;
                        if(r1.isChecked())
                            r1.setBackgroundColor(Color.RED);
                        else if(r3.isChecked())
                            r3.setBackgroundColor(Color.RED);
                        else if(r4.isChecked())
                            r4.setBackgroundColor(Color.RED);
                        t1.speak("Sorry" + r2.getText().toString() + "is the correct answer", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                else if(id.equals("4")) {
                    if (r2.isChecked()) {
                        score++;
                        r2.setBackgroundColor(Color.GREEN);
                        t1.speak(r2.getText().toString() + "is correct", TextToSpeech.QUEUE_FLUSH, null);
                    } else {
                        score--;
                        if(r1.isChecked())
                            r1.setBackgroundColor(Color.RED);
                        else if(r3.isChecked())
                            r3.setBackgroundColor(Color.RED);
                        else if(r4.isChecked())
                            r4.setBackgroundColor(Color.RED);
                        t1.speak("Sorry" + r2.getText().toString() + "is the correct answer", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                else if(id.equals("5")) {
                    if (r1.isChecked()) {
                        score++;
                        r1.setBackgroundColor(Color.GREEN);
                        t1.speak(r1.getText().toString() + "is correct", TextToSpeech.QUEUE_FLUSH, null);
                    } else {
                        score--;
                        if(r2.isChecked())
                            r2.setBackgroundColor(Color.RED);
                        else if(r3.isChecked())
                            r3.setBackgroundColor(Color.RED);
                        else if(r4.isChecked())
                            r4.setBackgroundColor(Color.RED);
                        t1.speak("Sorry" + r1.getText().toString() + "is the correct answer", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                else if(id.equals("3")) {
                    if (r1.isChecked()) {
                        score++;
                        r1.setBackgroundColor(Color.GREEN);
                        t1.speak(r1.getText().toString() + "is correct", TextToSpeech.QUEUE_FLUSH, null);
                    } else {
                        score--;
                        if(r2.isChecked())
                            r2.setBackgroundColor(Color.RED);
                        else if(r3.isChecked())
                            r3.setBackgroundColor(Color.RED);
                        else if(r4.isChecked())
                            r4.setBackgroundColor(Color.RED);
                        t1.speak("Sorry" + r1.getText().toString() + "is the correct answer", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                else if(id.equals("6")) {
                    if (r2.isChecked()) {
                        score++;
                        r2.setBackgroundColor(Color.GREEN);
                        t1.speak(r2.getText().toString() + "is correct", TextToSpeech.QUEUE_FLUSH, null);
                    } else {
                        score--;
                        if(r1.isChecked())
                            r1.setBackgroundColor(Color.RED);
                        else if(r3.isChecked())
                            r3.setBackgroundColor(Color.RED);
                        else if(r4.isChecked())
                            r4.setBackgroundColor(Color.RED);
                        t1.speak("Sorry" + r2.getText().toString() + "is the correct answer", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                else if(id.equals("7")) {
                    if (r2.isChecked()) {
                        score++;
                        r2.setBackgroundColor(Color.GREEN);
                        t1.speak(r2.getText().toString() + "is correct", TextToSpeech.QUEUE_FLUSH, null);
                    } else {
                        score--;
                        if(r1.isChecked())
                            r1.setBackgroundColor(Color.RED);
                        else if(r3.isChecked())
                            r3.setBackgroundColor(Color.RED);
                        else if(r4.isChecked())
                            r4.setBackgroundColor(Color.RED);
                        t1.speak("Sorry" + r2.getText().toString() + "is the correct answer", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                else if(id.equals("8")) {
                    if (r4.isChecked()) {
                        score++;
                        r4.setBackgroundColor(Color.GREEN);
                        t1.speak(r4.getText().toString() + "is correct", TextToSpeech.QUEUE_FLUSH, null);
                    } else {
                        score--;
                        if(r1.isChecked())
                            r1.setBackgroundColor(Color.RED);
                        else if(r2.isChecked())
                            r2.setBackgroundColor(Color.RED);
                        else if(r3.isChecked())
                            r3.setBackgroundColor(Color.RED);
                        t1.speak("Sorry" + r4.getText().toString() + "is the correct answer", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                Toast.makeText(getApplicationContext(),"Your Score is "+score,Toast.LENGTH_LONG).show();
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                //Yes button clicked
                                Intent i= new Intent(Eight.this,Ninth.class);
                                startActivity(i);
                                finish();
                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                //No button clicked
                                score=0;
                                Intent j= new Intent(Eight.this,Tenth.class);
                                startActivity(j);
                                finish();
                                break;
                        }
                    }
                };
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setMessage("Do you want to proceed?").setPositiveButton("Yes", dialogClickListener)
                        .setNegativeButton("No", dialogClickListener).show();
            }
        });
    }
}
