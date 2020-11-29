package com.sjhello.chapter6;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();

//        for (int i = 1; i <= 365; i++) {
//            System.out.println("예치금 + 이자율: " + interestManager.calculateAmount(i, 100_000_0));
//        }

        for (int i = 1; i <= 365; i+=10) {
            System.out.println("예치금 + 이자율: " + interestManager.calculateAmount(i, 100_000_0));
        }
    }

    double getInterestRate(int day) {
        double interestRate;

        if (day >= 1 && day <= 90) {
            interestRate = 0.5;
        } else if (day >= 91 && day <= 180) {
            interestRate = 1.0;
        } else if (day >= 181 && day <= 364) {
            interestRate = 2.0;
        } else {
            interestRate = 5.6;
        }

        return interestRate;
    }

    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);     // 이자율
        double calcAmount = amount + (amount * (interestRate / 100.0));       // 예치금과 이자율을 합산한 금액

        return calcAmount;
    }


}
