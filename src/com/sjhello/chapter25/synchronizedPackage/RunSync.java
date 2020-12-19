package com.sjhello.chapter25.synchronizedPackage;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        runSync.runCommonCalculate();
    }

    public void runCommonCalculate() {
        CommonCalculate commonCalculate = new CommonCalculate();
        ModifyAmountThread modifyAmountThread1 = new ModifyAmountThread(commonCalculate, true);
        ModifyAmountThread modifyAmountThread2 = new ModifyAmountThread(commonCalculate, true);

        modifyAmountThread1.start();
        modifyAmountThread2.start();

        try {
            modifyAmountThread1.join();
            modifyAmountThread2.join();
            System.out.println(commonCalculate.getAmount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
