package com.sjhello.chapter10.c.inheritance;

public class Animal {
    String name;
    String kind;
    int legCount;
    int iq;
    boolean hasWing;

    public void move() {
        System.out.println("움직인다");
    }

    public void eatFood() {
        System.out.println("음식 먹기");
    }
}
