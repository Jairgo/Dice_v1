package com.example.dice_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnGirar, btnDice1, btnDice2;
    Random rand;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGirar = findViewById(R.id.btnGirar);
        btnDice1 = findViewById(R.id.dice_1);
        btnDice2 = findViewById(R.id.dice_2);
        rand = new Random();

        btnGirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = rand.nextInt(6) + 1;
                b = rand.nextInt(6) + 1;

                btnDice1.setText("" + a);
                btnDice2.setText("" + b);
            }
        });
    }
}