package com.sjhello.chapter25;

public class ThreadExtends extends Thread {
    @Override
    public void run() {
        System.out.println("this is ThreadExtends");
    }

    public static void main(String[] args) {
        ThreadExtends threadExtends = new ThreadExtends();
        threadExtends.basicRun();
    }

    public void basicRun() {
        ThreadExtends threadExtends = new ThreadExtends();
        threadExtends.start();
    }
}
