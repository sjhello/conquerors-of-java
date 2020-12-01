package com.sjhello.chapter13.impl.enumPackage;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0),
    LEVEL_TWO(2000,2.0),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000,4.5),
    LEVEL_FIVE(5000,5.6),
    LEVEL_SIX(6000,7.1);

    int maxSalary;
    double ratio;

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio() {
        return this.ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary) {
//        switch (salary) {
//            case 1000:
//                return LEVEL_ONE;
//            case 2000:
//                return LEVEL_TWO;
//            case 3000:
//                return LEVEL_THREE;
//            case 4000:
//                return LEVEL_FOUR;
//            case 5000:
//                return LEVEL_FIVE;
//            default:
//                return LEVEL_SIX;
//        }

        if (salary < 1001) {
            return LEVEL_ONE;
        } else if (salary < 2001) {
            return LEVEL_TWO;
        } else if (salary < 3001) {
            return LEVEL_THREE;
        } else if (salary < 4001) {
            return LEVEL_FOUR;
        } else if (salary < 5001) {
            return LEVEL_FIVE;
        } else {
            return LEVEL_SIX;
        }
    }

    public static void main(String[] args) {
        int [] salaryArray = {1500, 5500, 8000};
        HealthInsurance [] healthInsurances = new HealthInsurance[3];

        for (int i = 0; i < salaryArray.length; i++) {
            healthInsurances[i] = HealthInsurance.getHealthInsurance(salaryArray[i]);
        }

        for (int i = 0; i < salaryArray.length; i++) {
            System.out.println("salaryArray=" + salaryArray[i] + ", " + healthInsurances[i] + ", " + healthInsurances[i].getRatio());
        }
    }


}
