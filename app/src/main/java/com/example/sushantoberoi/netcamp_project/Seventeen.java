package com.example.sushantoberoi.netcamp_project;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Seventeen extends AppCompatActivity implements SensorEventListener{
    SensorManager sm;
    int g=0;
    Button b1;
    Sensor s;
    TextView t1;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeen);
        b1=(Button)findViewById(R.id.b1);
        mp= MediaPlayer.create(this,R.raw.a);
        t1=(TextView)findViewById(R.id.textView4);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(g==1)
                mp.pause();
                Intent i=new Intent(Seventeen.this,Sixteen.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.values[0]>3)
        {
            g=1;
            t1.setText("Light Intensity is: "+event.values[0]);
            mp.start();
        }
        else{
            t1.setText("Light Intensity is: "+event.values[0]);
            g=0;
            mp.pause();
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}