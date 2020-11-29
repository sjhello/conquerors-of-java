package com.sjhello.chapter4;

import com.sjhello.chapter3.Profile;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();
        
        profilePrint.setAge((byte)20);      // 형변환을 해주지 않으면 int 형의 20을 보내기 때문에 형변환 필수
        profilePrint.setName("Min");
        profilePrint.setMarried(false);
        System.out.println(profilePrint.getAge());
        System.out.println(profilePrint.getName());
        System.out.println(profilePrint.getMarried());
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public boolean getMarried() {
        return isMarried;
    }
}
