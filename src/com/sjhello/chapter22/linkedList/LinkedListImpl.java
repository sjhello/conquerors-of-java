package com.sjhello.chapter22.linkedList;

public class LinkedListImpl implements LinkedList {
    @Override
    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (head == null) {
            return nodeToAdd;
        }

        if (position == 0) {
            nodeToAdd.next = head;
            return nodeToAdd;
        }
        return null;
    }

    @Override
    public ListNode remove(ListNode head, int positionToRemove) {
        return null;
    }

    @Override
    public boolean contains(ListNode head, ListNode nodeTocheck) {
        return false;
    }
}
