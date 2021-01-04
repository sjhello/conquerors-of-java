package com.sjhello.chapter25.lambda;

public class CalculateLambda {

    public static void main(String[] args) {
        CalculateLambda calculateLambda = new CalculateLambda();
        calculateLambda.add();
        calculateLambda.minus();
        calculateLambda.multiply();
        calculateLambda.divide();
    }

    private void add() {
        CalculateInterface calculateInterface = (a, b) -> a + b;
        int result = calculateInterface.operation(10, 20);
        System.out.println(result);
    }

    private void minus() {
        CalculateInterface calculateInterface = (a, b) -> a - b;
        int result = calculateInterface.operation(10, 20);
        System.out.println(result);
    }

    private void multiply() {
        CalculateInterface calculateInterface = (a, b) -> a * b;
        int result = calculateInterface.operation(10, 20);
        System.out.println(result);
    }

    private void divide() {
        CalculateInterface calculateInterface = (a, b) -> a / b;
        int result = calculateInterface.operation(20, 20);
        System.out.println(result);
    }

}


