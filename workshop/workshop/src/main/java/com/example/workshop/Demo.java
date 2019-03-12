package com.example.workshop;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class Demo {

    @Autowired
    MyRandom random;

    private int randomNumber() {
//        Random random = new Random();
        return random.nextInt(10);
    }

}
