package com.sjhello.chapter10.c.inheritance;

public class Cat extends Animal {
    String catName;

    @Override
    public void move() {
        System.out.println("고양이가 움직인다");
    }

    @Override
    public void eatFood() {
        System.out.println("고양이가 밥을 먹는다");
    }
}
