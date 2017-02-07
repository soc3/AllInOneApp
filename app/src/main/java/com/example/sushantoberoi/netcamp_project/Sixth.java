package com.example.sushantoberoi.netcamp_project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Sixth extends AppCompatActivity {
    ImageButton b1;
    ImageView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        b1=(ImageButton)findViewById(R.id.b1);
        w1=(ImageView)findViewById(R.id.w1);
        //image captured
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // access to camera
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE); // to call my camera
                startActivityForResult(i,0); // 0 -> if nothing is accessed it will show null
            }
        });

    }
    // store image
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // to diaplay image ; stores data in image format
        Bitmap b=(Bitmap)data.getExtras().get("data"); //data is a variable storing image then converted to bitmap to display image
        w1.setImageBitmap(b);
    }
}
