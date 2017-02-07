package com.example.sushantoberoi.netcamp_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Fifteen extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        wv=(WebView)findViewById(R.id.wv);
        wv.loadUrl(Fourteen.s1);
    }
}
