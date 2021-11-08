package com.example.dice_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnGirar, btnDice1, btnDice2;
    private Dice dado1, dado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dado1 = new Dice();
        dado2 = new Dice();

        btnGirar = findViewById(R.id.btnGirar);
        btnDice1 = findViewById(R.id.dice_1);
        btnDice2 = findViewById(R.id.dice_2);


        btnGirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDice1.setText("" + dado1.girarDado());
                btnDice2.setText("" + dado2.girarDado());
            }
        });
    }
}