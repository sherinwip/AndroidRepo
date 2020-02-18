package com.android.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Play(View view){
    int id = view.getId();
    String myID = view.getResources().getResourceEntryName(id);
        Log.i("Tapped Button ",myID);
        int filename = getResources().getIdentifier(myID,"raw","com.android.gridlayout");
        MediaPlayer mplayer = MediaPlayer.create(this,filename);
        mplayer.start();

    }
}
