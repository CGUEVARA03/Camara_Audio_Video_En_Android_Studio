package com.example.audio_camara_video;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
            View.OnClickListener {

        Button iniciar, parar;
        MediaPlayer mediaPlayer;

        @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            iniciar = (Button)findViewById(R.id.btReproducir);
            parar   = (Button)findViewById(R.id.btPausar);
            mediaPlayer = MediaPlayer.create(this,R.raw.heart);

            iniciar.setOnClickListener(this);
            parar.setOnClickListener(this);
    }


    @Override
    public void onClick (View view) {
        switch (view.getId()){
            case R.id.btReproducir:
                play();
                break;
            case R.id.btPausar:
                stop();
                break;

        }
}

    private void play () {
        mediaPlayer.start();
    }

    private void stop () {
        mediaPlayer.stop();
    }


    }
