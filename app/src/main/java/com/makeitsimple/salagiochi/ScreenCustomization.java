package com.makeitsimple.salagiochi;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenCustomization extends AppCompatActivity {

    public void setDecorView(View receivedDecorView){
        receivedDecorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_FULLSCREEN
                |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}
