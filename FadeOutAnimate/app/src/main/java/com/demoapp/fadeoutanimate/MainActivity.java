package com.demoapp.fadeoutanimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    public void fadeIn(View view){
        imageview = findViewById(R.id.imageView);
        imageview.animate().scaleXBy(1f).scaleYBy(1f);
        //imageview.animate().alpha(0f).setDuration(2000);
       //imageview.animate().translationX(-1000f).setDuration(2000);
       //imageview.animate().rotation(1000f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
