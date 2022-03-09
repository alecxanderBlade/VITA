package com.example.vita;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeScreen extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        Button button = findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button2);

                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();


                TranslateAnimation animation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                animation.setDuration(0);
                animation.setRepeatCount(0);
                animation.setFillAfter(false);
                v.startAnimation(animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                        Intent i = new Intent(getApplicationContext(), SubjectSelection.class);
                        startActivity(i);

                    }

                });
            }
        });
    }
}
