package com.sjhello.chapter25;

public class RunThread {
    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        runThread.runBasic();
    }

    public void runBasic() {
        // Runnable 구현
        // Thread class가 다른 클래스를 상속할때는 Runnable interface 구현
        RunnableSample runnableSample = new RunnableSample();
        new Thread(runnableSample).start();

        // Thread 상속
        // Thread class가 다른 클래스를 상속받지 않을때는 Thread class 상속
        ThreadSample threadSample = new ThreadSample();
        threadSample.start();
        System.out.println("RunThread ended");
    }
}
