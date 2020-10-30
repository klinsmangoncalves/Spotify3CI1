package com.kmg.spotfy3ai2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {


    ImageView coverImage;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coverImage = findViewById(R.id.ivCover);
        Glide.with(this).load("https://img.youtube.com/vi/CIFrr1dqj5M/0.jpg").into(coverImage);

        player = MediaPlayer.create(getApplicationContext(), R.raw.ponto_exclamacao);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void play(View view) {
        player.start();
    }
}
