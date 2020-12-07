package com.sjhello.chapter22.linkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    class Node {
        private Node next;
        private int data;
        Node(int data) {
            this.data = data;
        }
    }

    void addFirst(int data) {
        Node node = new Node(data);

        if (size == 0) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    void addLast(int data) {
        Node node = new Node(data);

        if (size == 0) {
            addFirst(data);
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void middleAdd(int index, int data) {
        if (index == 0) {
            addFirst(data);
        } else {
            Node getNode = getNode(index - 1);
            Node nodeNext = getNode.next;
            Node node = new Node(data);

            getNode.next = node;
            node.next = nodeNext;

            size++;
        }
    }

    void removeFirst() {
        head = head.next;
        size--;
    }

    void removeLast() {
        Node node = head;
        Node temp = head.next;

        while (temp.next != null) {
            node = temp;
            temp = temp.next;
        }
        node.next = null;
    }

    void middleRemove(int index) {
        if (index == 0) {
            removeFirst();
        }

        Node getNode = getNode(index);
        Node temp = getNode.next;
        Node getNodePrev = getNode(index - 1);
        getNodePrev.next = temp;

        if (temp == null) {
            tail = getNodePrev;
        }
        size--;
    }

    Node getNode(int index) {
        Node node = head;

        if (index == 0) {
            return node;
        }

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    @Override
    public String toString() {
        if (size == 0) {
            return "empty";
        }

        Node node = head;

        String data = "";
//        for (int i = 0; i < size; i++) {
//            data += node.data + ",";
//            node = node.next;
//        }

        while (node.next != null) {
            data += node.data + ",";
            node = node.next;
        }

        data += node.data;
        return data;
    }
}
