package com.sjhello.chapter22.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(3);
        myLinkedList.addLast(5);
        myLinkedList.addLast(7);
        myLinkedList.addLast(9);
//        myLinkedList.addFirst(3);
//        myLinkedList.addFirst(5);
//        myLinkedList.addFirst(7);
//        myLinkedList.addFirst(9);

        //myLinkedList.middleAdd(3, 10);
        //myLinkedList.removeFirst();
        // myLinkedList.removeLast();
        myLinkedList.middleRemove(0);
        System.out.println(myLinkedList);
    }
}
