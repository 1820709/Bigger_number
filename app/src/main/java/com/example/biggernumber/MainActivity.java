package com.example.biggernumber;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int number1;
    private int number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generate(View view) {
        final Random rand = new Random();

        //TextView myText = findViewById(R.id.textView);
        String number1Str = String.valueOf(number1);
        String number2Str = String.valueOf(number2);
        //myText.setText(myString);
        //
        //p2_button.setText(number2Str);
        final Button p1_button = (Button) findViewById(R.id.button1);
        final Button p2_button = (Button) findViewById(R.id.button2);
        p1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int number1 = rand.nextInt(100)+1;
                int number2 = rand.nextInt(100)+1;
                p1_button.setText(String.valueOf(number1));
                p2_button.setText(String.valueOf(number2));
            }
        });

        p2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int number1 = rand.nextInt(100)+1;
                int number2 = rand.nextInt(100)+1;
                p1_button.setText(String.valueOf(number1));
                p2_button.setText(String.valueOf(number2));
            }
        });

    }
}
