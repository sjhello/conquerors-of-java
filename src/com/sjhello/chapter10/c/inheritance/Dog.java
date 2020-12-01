package com.sjhello.chapter10.c.inheritance;

public class Dog extends Animal {
    String dogName;

    @Override
    public void move() {
        System.out.println("개가 움직인다");
    }

    @Override
    public void eatFood() {
        System.out.println("개가 밥을 먹는다");
    }
}
