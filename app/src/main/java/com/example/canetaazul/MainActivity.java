package com.example.canetaazul;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNaoMeAma = findViewById(R.id.buttonNaoMeAma);
        Button buttonCaneta = findViewById(R.id.buttonCaneta);
        MediaPlayer somNaoMeAma = MediaPlayer.create(this, R.raw.naomeama);
        MediaPlayer somCaneta = MediaPlayer.create(this, R.raw.caneta);

        buttonNaoMeAma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                somNaoMeAma.start();
            }
        });
        buttonCaneta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                somCaneta.start();
            }
        });
    }
}