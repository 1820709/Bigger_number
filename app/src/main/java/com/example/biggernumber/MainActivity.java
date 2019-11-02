package com.example.biggernumber;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextView txt1;
    private int scoreNumber = 0;
    private int noOfLives = 10;
    private TextView scoreTxt;
    private TextView livesTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTxt = (TextView) findViewById(R.id.score);
        scoreTxt.setText("0");
        livesTxt = (TextView) findViewById(R.id.lives);
        livesTxt.setText("10");
        txt1 = (TextView) findViewById(R.id.textView1);
        play();
    }

    private void play() {
        final Random rand = new Random();
        final Button p1_button = (Button) findViewById(R.id.button1);
        final Button p2_button = (Button) findViewById(R.id.button2);

        int scoreNumber = 0;

        p1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int number1 = rand.nextInt(100)+1;
                int number2 = rand.nextInt(100)+1;
                p1_button.setText(String.valueOf(number1));
                p2_button.setText(String.valueOf(number2));
                if (number1 > number2){
                    updateMessage("Congratulations!");
                    incrementScore();
                } else {
                    updateMessage("");
                    decreaseLives();
                }
            }
        });

        p2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int number1 = rand.nextInt(100)+1;
                int number2 = rand.nextInt(100)+1;
                p1_button.setText(String.valueOf(number1));
                p2_button.setText(String.valueOf(number2));
                if (number2 > number1){
                    updateMessage("Congratulations!");
                    incrementScore();
                } else {
                    updateMessage("");
                    decreaseLives();
                }
            }
        });
    }

    private void updateMessage(String msg){
        txt1.setText(msg);
    }

    private void incrementScore(){
        scoreNumber += 1;
        scoreTxt.setText(String.valueOf(scoreNumber));
    }

    private void decreaseLives(){
        noOfLives -= 1;
        livesTxt.setText(String.valueOf(noOfLives));
        if (noOfLives == 0){
            txt1.setText("Game Over!");
            scoreTxt.setText("0");
            scoreNumber = 0;
            noOfLives = 10;
            livesTxt.setText("10");
        }
    }
}
