package com.example.vita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class readingandwriting extends AppCompatActivity {

    public static final String EXTRA_CORRECT="CORRECT";
    public static final String EXTRA_WRONG="WRONG";

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readingandwriting);

        Button wrong = findViewById(R.id.wrong1);


        wrong.setOnClickListener(new View.OnClickListener() {
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
                    public void onAnimationRepeat(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                        TextView text = findViewById(R.id.textWrong);
                        int num = Integer.parseInt(text.getText().toString());
                        Intent i = new Intent (getApplicationContext(), readingandwriting2.class);
                        i.putExtra(EXTRA_WRONG, num);
                        startActivity(i);

                    }

                });
            }
        });


        Button wrong2 = findViewById(R.id.wrong2);
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
                    public void onAnimationRepeat(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        TextView text = findViewById(R.id.textWrong);
                        int num = Integer.parseInt(text.getText().toString());
                        Intent i = new Intent (getApplicationContext(), readingandwriting2.class);
                        i.putExtra(EXTRA_WRONG, num);
                        startActivity(i);
                    }

                });
            }
        });

        Button wrong3 = findViewById(R.id.wrong3);
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
                    public void onAnimationRepeat(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {


                        TextView text = findViewById(R.id.textWrong);
                        int num = Integer.parseInt(text.getText().toString());
                        Intent i = new Intent (getApplicationContext(), readingandwriting2.class);
                        i.putExtra(EXTRA_WRONG, num);
                        startActivity(i);

                    }

                });
            }
        });

        Button correct = findViewById(R.id.correct);


        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                player = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                player.start();



                Button correct = findViewById(R.id.correct);
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
                    public void onAnimationRepeat(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                        TextView text = findViewById(R.id.text);
                        int num = Integer.parseInt(text.getText().toString());
                        Intent i = new Intent (getApplicationContext(), readingandwriting2.class);
                        i.putExtra(EXTRA_CORRECT, num);
                        startActivity(i);
                    }
                });
            }
        });



    }


}
