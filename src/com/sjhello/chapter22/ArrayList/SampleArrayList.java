package com.sjhello.chapter22.ArrayList;

import java.util.ArrayList;

public class SampleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2 = list;
        list2.add("B");

        for (String value : list) {
            System.out.println(value);
        }
    }
}
