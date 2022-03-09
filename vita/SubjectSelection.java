package com.example.vita;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

public class SubjectSelection extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_selection);

        final ImageButton litIcon = findViewById(R.id.litIcon);
        final ImageButton scienceIcon = findViewById(R.id.scienceIcon);
        final ImageButton peIcon = findViewById(R.id.peIcon);
        final ImageButton researchIcon = findViewById(R.id.researchIcon);
        final ImageButton readingandwritingIcon = findViewById(R.id.readingandwritingIcon);
        final ImageButton personaldevelopmentIcon = findViewById(R.id.personaldevelopmentIocn);

        Button centurylit = findViewById(R.id.centurylit);
        Button science = findViewById(R.id.science);
        Button pe = findViewById(R.id.pe);
        Button research = findViewById(R.id.research);
        Button readandwrite = findViewById(R.id.readandwrite);
        Button perdev = findViewById(R.id.perdev);

        litIcon.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent i = new Intent(getApplicationContext(), literature1.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SubjectSelection.this, litIcon, ViewCompat.getTransitionName(litIcon));
                startActivity(i, options.toBundle());
            }
        });

            scienceIcon.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                    player.start();
                    Intent i = new Intent(getApplicationContext(), Science.class);
                    ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SubjectSelection.this, scienceIcon, ViewCompat.getTransitionName(scienceIcon));
                    startActivity(i, options.toBundle());
                }
            });

        peIcon.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent i = new Intent(getApplicationContext(), pe.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SubjectSelection.this, peIcon, ViewCompat.getTransitionName(peIcon));
                startActivity(i, options.toBundle());
            }
        });
        researchIcon.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent i = new Intent(getApplicationContext(), research.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SubjectSelection.this, researchIcon, ViewCompat.getTransitionName(researchIcon));
                startActivity(i, options.toBundle());
            }
        });
        readingandwritingIcon.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent i = new Intent(getApplicationContext(), readingandwriting.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SubjectSelection.this, readingandwritingIcon, ViewCompat.getTransitionName(readingandwritingIcon));
                startActivity(i, options.toBundle());
            }
        });
        personaldevelopmentIcon.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent i = new Intent(getApplicationContext(), personaldev.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SubjectSelection.this, personaldevelopmentIcon, ViewCompat.getTransitionName(personaldevelopmentIcon));
                startActivity(i, options.toBundle());
            }
        });

        centurylit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent intent1 = new Intent(SubjectSelection.this, literature1.class);
                startActivity(intent1);
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent intent2 = new Intent(SubjectSelection.this, Science.class);
                startActivity(intent2);
            }
        });
        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent intent3 = new Intent(SubjectSelection.this, pe.class);
                startActivity(intent3);
            }
        });
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent intent4 = new Intent(SubjectSelection.this, research.class);
                startActivity(intent4);
            }
        });
        readandwrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();
                Intent intent5 = new Intent(SubjectSelection.this, readingandwriting.class);
                startActivity(intent5);
            }
        });
        perdev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(getApplicationContext(), R.raw.buttonclicksound);
                player.start();

                Intent intent6 = new Intent(SubjectSelection.this, personaldev.class);
                startActivity(intent6);
            }
        });
    }

    @Override
    public void onBackPressed() {
        return;

    }
}
