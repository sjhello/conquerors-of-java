package com.sjhello.chapter5;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println(salaryManager.getMonthlySalary());

    }

    public double getMonthlySalary(int yearlySalary) {      // 세금 내기 전 월 급여
        double monthSalary;
        monthSalary = yearlySalary / 12.0;

        return monthSalary;
    }

    public double getMonthlySalary() {        // 세금 낸 후의 월 급여
        double tax, nationalPension, healthInsurance, result, taxHap;

        result = getMonthlySalary(28000000);
        tax = calculateTax(result);
        nationalPension = caculateNationalPension(result);
        healthInsurance = calculateHealthInsurance(result);

        taxHap = tax + nationalPension + healthInsurance;
        result -= taxHap;
        return result;
    }

    public double calculateTax(double monthSalary) {
        double tax = monthSalary * (12.5/100);        // 근로 소득세
        return tax;
    }

    public double caculateNationalPension(double monthSalary) {
        double result = monthSalary * (8.1 / 100);      // 국민 연금
        return result;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double result = monthSalary * (13.5/100);     // 건강 보험료
        return result;
    }

}
