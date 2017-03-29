package com.nehvin.s04e53sound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.chaiyachaiya);
    }

    public void playMedia (View view)
    {
        mediaPlayer.start();
    }

    public void pauseMedia (View view)
    {
        mediaPlayer.pause();
    }

    public void stopMedia (View view)
    {
        mediaPlayer.stop();
    }
}