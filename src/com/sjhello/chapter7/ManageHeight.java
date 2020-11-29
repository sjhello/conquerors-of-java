package com.sjhello.chapter7;

public class ManageHeight {
    int [][] gradeHeights;

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setDate();
        //manageHeight.printHeight(3);
        //manageHeight.printAverage();
        manageHeight.printAverage(3);
        manageHeight.printAverage();
    }

    public void setDate() {
        // {{170, 180, 173, 175, 177}, {160,165,167,186}, {158,177,187,176}, {173,182,181}, {170,180,165,177,172}};
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeights[1] = new int[] {160,165,167,186};
        gradeHeights[2] = new int[] {158,177,187,176};
        gradeHeights[3] = new int[] {173,182,181};
        gradeHeights[4] = new int[] {170,180,165,177,172};
    }

    public void printHeight() {
        for (int i = 0; i < gradeHeights.length; i++) {
            System.out.println("ClassNo: " + (i+1));

            for (int j = 0; j < gradeHeights[i].length; j++){
                System.out.println(gradeHeights[i][j]);
            }
        }
    }

    public void printHeight(int classNo) {
        int realClassNo = classNo - 1;

        System.out.println("ClassNo: + " + classNo);
        for (int i = 0; i < gradeHeights[realClassNo].length; i++) {
            System.out.println(gradeHeights[realClassNo][i]);
        }
    }

    public void printAverage() {
        for (int i = 0; i < gradeHeights.length; i++) {
            System.out.println("ClassNo: " + (i+1));

            double result = 0.0;
            double average = 0.0;

            for (int j = 0; j < gradeHeights[i].length; j++){
                result += gradeHeights[i][j];
            }
            System.out.println("average = " + result / gradeHeights[i].length);
        }
    }

    public void printAverage(int classNo) {
        int realClassNo = classNo - 1;
        double result = 0.0;

        System.out.println("ClassNo: " + classNo);
        for(int i = 0; i < gradeHeights[realClassNo].length; i++) {
            result += gradeHeights[realClassNo][i];
        }
        System.out.println("average: " + result / gradeHeights[realClassNo].length);
    }

}
