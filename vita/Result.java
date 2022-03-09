
package com.example.vita;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView  score, score2, score3, score4, score5, score6, resultMessage, textScore;
    Button back;

    @SuppressLint({"SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent i = getIntent();
        int num = i.getIntExtra(literature10.EXTRA_CORRECT, 0);
        score = findViewById(R.id.scoreDisplay);
        score.setText("" + num);

        Intent i2 = getIntent();
        int num2 = i2.getIntExtra(pe10.EXTRA_CORRECT, 0);
        score2 = findViewById(R.id.scoreDisplay);
        score2.setText(""+num2);

        Intent i3 = getIntent();
        int num3 = i3.getIntExtra(readingandwriting10.EXTRA_CORRECT, 0);
        score3 = findViewById(R.id.scoreDisplay);
        score3.setText(""+num3);

        Intent i4 = getIntent();
        int num4 = i4.getIntExtra(readingandwriting10.EXTRA_CORRECT, 0);
        score4 = findViewById(R.id.scoreDisplay);
        score4.setText(""+num4);

        Intent i5 = getIntent();
        int num5 = i5.getIntExtra(personaldev10.EXTRA_CORRECT, 0);
        score5 = findViewById(R.id.scoreDisplay);
        score5.setText(""+num5);

        Intent i6 = getIntent();
        int num6 = i6.getIntExtra(science10.EXTRA_CORRECT, 0);
        score6 = findViewById(R.id.scoreDisplay);
        score6.setText(""+num6);

        resultMessage = findViewById(R.id.resultMessage);

        if (num == 10){
            resultMessage.setText("Wow! You got a perfect score! Well done.");
        }
        else if (num == 9 || num == 8 || num == 7 ){
            resultMessage.setText("Congrats, you achieved a high score!");
        }
        else if (num == 6 ){
            resultMessage.setText("Study a little bit more and you'll score higher next time");
        }
        else if (num == 5){
            resultMessage.setText("I know you could do better than that");
        }
        else if(num == 4 || num == 3){
            resultMessage.setText("Study mote bro");
        }
        else if (num == 2|| num== 1){
            resultMessage.setText("Step your game up\n ¯\\_(ツ)_/¯");
        }else{
            resultMessage.setText("ಠ_ಠ");
        }




        if (num2== 10){
            resultMessage.setText("Wow! You got a perfect score! Well done.");
        }
        else if (num2 == 9 || num2 == 8 || num2 == 7 ){
            resultMessage.setText("Congrats, you achieved a high score!");
        }
        else if (num2 == 6 ){
            resultMessage.setText("Study a little bit more and you'll score higher next time");
        }
        else if (num2 == 5){
            resultMessage.setText("I know you could do better than that");
        }
        else if(num2 == 4 || num2 == 3){
            resultMessage.setText("Study mote bro");
        }
        else if (num2 == 2|| num2 == 1){
            resultMessage.setText("Step your game up\n ¯\\_(ツ)_/¯");
        }else{
            resultMessage.setText("ಠ_ಠ");
        }



        if (num3 == 10){
            resultMessage.setText("Wow! You got a perfect score! Well done.");
        }
        else if (num3 == 9 || num3 == 8 || num3 == 7 ){
            resultMessage.setText("Congrats, you achieved a high score!");
        }
        else if (num3 == 6 ){
            resultMessage.setText("Study a little bit more and you'll score higher next time");
        }
        else if (num3 == 5){
            resultMessage.setText("I know you could do better than that");
        }
        else if(num3 == 4 || num3 == 3){
            resultMessage.setText("Study mote bro");
        }
        else if (num3 == 2|| num3 == 1){
            resultMessage.setText("Step your game up\n ¯\\_(ツ)_/¯");
        }else{
            resultMessage.setText("ಠ_ಠ");
        }

        if (num4 == 10){
            resultMessage.setText("Wow! You got a perfect score! Well done.");
        }
        else if (num4 == 9 || num4 == 8 || num4 == 7 ){
            resultMessage.setText("Congrats, you achieved a high score!");
        }
        else if (num4 == 6 ){
            resultMessage.setText("Study a little bit more and you'll score higher next time");
        }
        else if (num4 == 5){
            resultMessage.setText("I know you could do better than that");
        }
        else if(num4 == 4 || num4 == 3){
            resultMessage.setText("Study mote bro");
        }
        else if (num4 == 2|| num4 == 1){
            resultMessage.setText("Step your game up\n ¯\\_(ツ)_/¯");
        }else{
            resultMessage.setText("ಠ_ಠ");
        }


        if (num5 == 10){
            resultMessage.setText("Wow! You got a perfect score! Well done.");
        }
        else if (num5 == 9 || num5 == 8 || num5 == 7 ){
            resultMessage.setText("Congrats, you achieved a high score!");
        }
        else if (num5 == 6 ){
            resultMessage.setText("Study a little bit more and you'll score higher next time");
        }
        else if (num5 == 5){
            resultMessage.setText("I know you could do better than that");
        }
        else if(num5 == 4 || num5 == 3){
            resultMessage.setText("Study mote bro");
        }
        else if (num5 == 2|| num5 == 1){
            resultMessage.setText("Step your game up\n ¯\\_(ツ)_/¯");
        }else{
            resultMessage.setText("ಠ_ಠ");
        }

        if (num6 == 10){
            resultMessage.setText("Wow! You got a perfect score! Well done.");
        }
        else if (num6 == 9 || num6 == 8 || num6 == 7 ){
            resultMessage.setText("Congrats, you achieved a high score!");
        }
        else if (num6 == 6 ){
            resultMessage.setText("Study a little bit more and you'll score higher next time");
        }
        else if (num6 == 5){
            resultMessage.setText("I know you could do better than that");
        }
        else if(num6 == 4 || num6 == 3){
            resultMessage.setText("Study more bro");
        }
        else if (num6 == 2|| num6 == 1){
            resultMessage.setText("Step your game up\n ¯\\_(ツ)_/¯");
        }else{
            resultMessage.setText("ಠ_ಠ");
        }

        back = findViewById(R.id.backToSubjectSelection);
        back.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SubjectSelection.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Result.this, back, ViewCompat.getTransitionName(back));
                startActivity(i, options.toBundle());
            }
        });

    }
   }
