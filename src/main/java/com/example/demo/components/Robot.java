package com.example.demo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {

    private final Hands hands;
    private final Head head;
    private final Legs legs;

    @Autowired
    public Robot(Hands hands, Head head, Legs legs) {
        this.hands = hands;
        this.head = head;
        this.legs = legs;
        roboticPush();
        roboticMove();
        roboticThink();
    }

    public void roboticPush() {
        hands.push();
    }

    public void roboticMove() {
        legs.move();
    }

    public void roboticThink() {
        head.think();
    }
}
