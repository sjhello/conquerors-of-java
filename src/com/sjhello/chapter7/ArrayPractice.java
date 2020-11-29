package com.sjhello.chapter7;

public class ArrayPractice {
    public static void main(String[] args) {
        // 1차원 배열
        int [] number = {1,2,3};

        int [] number2 = new int[3];
        number2[0] = 1;
        number2[1] = 2;

        int [] number3 = new int[] {1,2,3};

        // 2차원 배열
        int [][] arr = {{1,2,3}, {34,5}, {55}};

        int [][] arr2 = new int[0][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;

        int [][] arr3 = new int[3][];
        arr3[0] = new int[4];
        arr3[1] = new int[2];
        arr3[2] = new int[6];

        System.out.println(arr3.length);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i].length);
        }
    }
}
