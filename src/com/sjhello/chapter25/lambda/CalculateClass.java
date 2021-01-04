package com.sjhello.chapter25.lambda;

public class CalculateClass {

    public static void main(String[] args) {
        CalculateClass calculateClass = new CalculateClass();
        calculateClass.add();
        calculateClass.minus();
        calculateClass.multiply();
        calculateClass.divide();
    }

    private void add() {
        CalculateInterface calculateInterface = new CalculateInterface() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        int result = calculateInterface.operation(20, 20);
        System.out.println(result);
    }

    private void minus() {
        CalculateInterface calculateInterface = new CalculateInterface() {
            @Override
            public int operation(int a, int b) {
                return a - b;
            }
        };

        int result = calculateInterface.operation(20, 20);
        System.out.println(result);
    }

    private void multiply() {
        CalculateInterface calculateInterface = new CalculateInterface() {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        };

        int result = calculateInterface.operation(20, 20);
        System.out.println(result);
    }

    private void divide() {
        CalculateInterface calculateInterface = new CalculateInterface() {
            @Override
            public int operation(int a, int b) {
                return a / b;
            }
        };

        int result = calculateInterface.operation(20, 20);
        System.out.println(result);
    }
}
