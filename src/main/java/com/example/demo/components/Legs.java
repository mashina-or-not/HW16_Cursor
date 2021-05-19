package com.example.demo.components;

import org.springframework.stereotype.Component;

@Component
public class Legs {

    @RandomInt
    private int length;

    public Legs() {
        System.out.println("Legs created");
    }

    public void move() {
        System.out.println("Legs are moving on " + length);
    }
}
