package com.sjhello.chapter22.linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    private MyLinkedList myLinkedList;

    @BeforeEach
    void init() {
        myLinkedList = new MyLinkedList();
    }

    @Test
    void addFirst() {
        myLinkedList.addFirst(3);
        assertEquals("3", myLinkedList.toString());
    }

    @Test
    void addLast() {
        myLinkedList.addFirst(3);
        myLinkedList.addLast(6);
        assertEquals("4,3,6", myLinkedList.toString());
    }

    @Test
    void middleAdd() {
        System.out.println(myLinkedList);
    }

    @Test
    void removeFirst() {
    }

    @Test
    void removeLast() {
    }

    @Test
    void middleRemove() {
    }

    @Test
    void getNode() {
    }
}