package com.sjhello.chapter15.practice;

public class UserStringMethods {

    public static void main(String[] args) {
        String str = "The String class represents character strings.";

        UserStringMethods userStringMethods = new UserStringMethods();
        userStringMethods.printWords(str);
        userStringMethods.findString(str, "string");
        userStringMethods.findAnyCaseString(str, "string");
        userStringMethods.countChar(str, 's');
        System.out.println();
        userStringMethods.printContainWords(str, "ss");
    }

    public void printWords(String str) {
        String [] strings = str.split(" ");
        for (String val : strings) {
            System.out.println(val);
        }
    }

    public void findString(String str, String findStr) {
        System.out.println("string is appeard at " + str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr) {
        System.out.println("string is appeard at " + str.toLowerCase().indexOf(findStr));
    }

    public void countChar(String str, char c) {
        System.out.println("char " + "'" + c + "'" + " count is " + str.toCharArray().length);
    }

    public void printContainWords(String str, String findStr) {
        String [] strings = str.split(" ");

        for (String val : strings) {
            if (val.contains(findStr)) {
                System.out.println(val + " contains " + findStr);
            } else {
                System.out.println(val + " not contain " + findStr);
            }
        }
    }
}
