package com.sjhello.chapter25;

public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads runMultiThreads = new RunMultiThreads();
        runMultiThreads.runMultiThread();
    }

    public void runMultiThread() {
        RunnableSample [] runnableSample = new RunnableSample[5];
        ThreadSample [] threadSamples = new ThreadSample[5];

        for (int i = 0; i < 5; i++) {
            runnableSample[i] = new RunnableSample();
            threadSamples[i] = new ThreadSample();

            new Thread(runnableSample[i]).start();
            threadSamples[i].start();
        }

        System.out.println("runMultiThread ended");
    }
}
