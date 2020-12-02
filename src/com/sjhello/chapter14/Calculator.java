package com.sjhello.chapter14;

public class Calculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        try {
            cal.printDivide(1,2);
            cal.printDivide(1,0);
        } catch(MyException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public void printDivide(double d1, double d2) throws MyException{
        if (d2 == 0) {
            throw new MyException("Second Value cant be zero");
        }
        double result = d1/d2;
        System.out.println(result);
    }
}
