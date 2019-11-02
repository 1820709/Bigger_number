package com.example.biggernumber;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int scoreNumber = 0;
    private TextView scoreTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTxt = (TextView) findViewById(R.id.score);
        scoreTxt.setText("0");
        play();
    }

    private void play() {
        final Random rand = new Random();
        final Button p1_button = (Button) findViewById(R.id.button1);
        final Button p2_button = (Button) findViewById(R.id.button2);
        final TextView txt1 = (TextView) findViewById(R.id.textView1);
        int scoreNumber;
        scoreNumber = 0;

        p1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int number1 = rand.nextInt(100)+1;
                int number2 = rand.nextInt(100)+1;
                p1_button.setText(String.valueOf(number1));
                p2_button.setText(String.valueOf(number2));
                if (number1 > number2){
                    txt1.setText("Congratulations!");
                    incrementScore();
                } else {
                    txt1.setText("");
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
                    txt1.setText("Congratulations!");
                } else {
                    txt1.setText("");
                }
            }
        });
    }

    private void incrementScore(){
        scoreNumber += 1;
        scoreTxt.setText(String.valueOf(scoreNumber));
    }
}
