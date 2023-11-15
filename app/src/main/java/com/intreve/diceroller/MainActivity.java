package com.intreve.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnRoll;
    TextView tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRoll=findViewById(R.id.btnRoll);
        tvNumber=findViewById(R.id.tvNumber);


        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Generate a random number between 1 and 6
                int randomNumber = getRandomNumber(1, 6);

                // Display the random number as a toast message
                tvNumber.setText(Integer.toString(randomNumber));
            }
        });
    }

    // Helper method to generate a random number within a given range
    private int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}