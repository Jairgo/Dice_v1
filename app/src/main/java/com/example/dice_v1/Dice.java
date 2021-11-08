package com.example.dice_v1;

import java.util.Random;

public class Dice {
    private final int max = 6;
    private int val;
    private Random rand = new Random();

    public Dice(){ this.val = 1; }

    public int girarDado(){
        this.val = rand.nextInt(max) + 1;
        return this.val;
    }
}
