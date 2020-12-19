package com.sjhello.chapter25;

public class RunnableImplements extends ExtendsClass implements Runnable {

    @Override
    public void run() {
        System.out.println("this is RunnableImplements");
    }

    public static void main(String[] args) {
        RunnableImplements runnableImplements = new RunnableImplements();
        runnableImplements.basicRun();
    }

    public void basicRun() {
        RunnableImplements runnableImplements = new RunnableImplements();
        new Thread(runnableImplements).start();
    }
}
