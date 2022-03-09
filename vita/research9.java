package com.example.vita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class research9 extends AppCompatActivity {

    public static final String EXTRA_CORRECT= "score";

    MediaPlayer player;

    Button correct, wrong1,wrong2,wrong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research9);


        Intent i = getIntent();
        int num = i.getIntExtra(research8.EXTRA_CORRECT, 0);
        TextView score = findViewById(R.id.scoreDisplay);
        score.setText(""+num);

        correct = findViewById(R.id.correct);
        wrong1 = findViewById(R.id.wrong1);
        wrong2 = findViewById(R.id.wrong2);
        wrong3 = findViewById(R.id.wrong3);


        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                player.start();

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                animation.setDuration(1000);
                BounceInterpolator interpolator = new BounceInterpolator(0.2, 20);
                animation.setInterpolator(interpolator);
                correct.startAnimation(animation);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        TextView text= findViewById(R.id.scoreDisplay);
                        int num = Integer.parseInt((String) text.getText());
                        num++;
                        Intent i = new Intent (getApplicationContext(), research10.class);
                        i.putExtra(EXTRA_CORRECT, num );
                        startActivity(i);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

            }
        });

        wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
                player.start();

                TranslateAnimation animation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
                animation.setDuration(50);
                animation.setRepeatCount(5);
                animation.setFillAfter(false);
                v.startAnimation(animation);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        TextView text= findViewById(R.id.scoreDisplay);
                        int num = Integer.parseInt((String) text.getText());
                        Intent i = new Intent (getApplicationContext(), research10.class);
                        i.putExtra(EXTRA_CORRECT, num );
                        startActivity(i);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });

        wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
                player.start();

                TranslateAnimation animation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
                animation.setDuration(50);
                animation.setRepeatCount(5);
                animation.setFillAfter(false);
                v.startAnimation(animation);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        TextView text= findViewById(R.id.scoreDisplay);
                        int num = Integer.parseInt((String) text.getText());
                        Intent i = new Intent (getApplicationContext(), research10.class);
                        i.putExtra(EXTRA_CORRECT, num );
                        startActivity(i);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

            }

        });

        wrong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
                player.start();

                TranslateAnimation animation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
                animation.setDuration(50);
                animation.setRepeatCount(5);
                animation.setFillAfter(false);
                v.startAnimation(animation);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        TextView text= findViewById(R.id.scoreDisplay);
                        int num = Integer.parseInt((String) text.getText());
                        Intent i = new Intent (getApplicationContext(), research10.class);
                        i.putExtra(EXTRA_CORRECT, num );
                        startActivity(i);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

            }

        });
    }
}
