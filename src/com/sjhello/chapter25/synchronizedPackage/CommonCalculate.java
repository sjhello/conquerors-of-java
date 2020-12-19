package com.sjhello.chapter25.synchronizedPackage;

public class CommonCalculate {
    private int amount;

    public CommonCalculate() {
        amount = 0;
    }

    public void plus(int value) {
//        synchronized (this) {
//            amount += value;
//        }
        amount += value;
    }

    public void minus(int value) {
        amount -= value;
    }

    public int getAmount() {
        return amount;
    }
}
