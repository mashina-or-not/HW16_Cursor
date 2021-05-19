package com.example.demo.components;

import org.springframework.stereotype.Component;

@Component
public class Hands {

    @RandomInt
    private int length;

    public Hands() {
        System.out.println("Hands create");
    }

    public void push() {
        System.out.println("Hands are pushing on " + length);
    }
}
