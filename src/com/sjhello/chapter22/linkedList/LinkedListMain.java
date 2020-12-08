package com.sjhello.chapter22.linkedList;

public class LinkedListMain {

    public static void main(String[] args) {
        ListNode headNode = new ListNode(3);
        ListNode node1 = new ListNode(5);

        LinkedList linkedList = new LinkedListImpl();
        linkedList.add(headNode, node1, 2);
    }
}
