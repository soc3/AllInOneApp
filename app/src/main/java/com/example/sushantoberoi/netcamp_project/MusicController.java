package com.example.sushantoberoi.netcamp_project;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.MediaController;

/**
 * Created by sushant oberoi on 12-12-2016.
 */
public class MusicController extends MediaController {
    Context c;
    public MusicController(Context c){
        super(c);
        this.c = c;
    }


    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        if(keyCode == KeyEvent.KEYCODE_BACK){
            super.hide();
            ((MainActivity)c).onBackPressed();
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

}