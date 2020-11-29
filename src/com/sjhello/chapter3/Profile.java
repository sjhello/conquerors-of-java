package com.sjhello.chapter3;

public class Profile {
    String name;
    int age;

    public static void main(String[] args) {
        Profile profile = new Profile();

        profile.setName("Min");
        profile.setAge(20);
        profile.printName();
        profile.printAge();
    }

    public void setName(String str) {
        name = str;
    }

    public void setAge(int val) {
        age = val;
    }

    public void printName() {
        System.out.println("name = " + name);
    }

    public void printAge() {
        System.out.println("age = " + age);
    }
}
